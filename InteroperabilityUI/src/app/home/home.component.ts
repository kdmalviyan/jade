import { Component, OnInit, Inject, ViewChild } from '@angular/core';
import { NgxSoapService, Client, ISoapMethodResponse } from 'ngx-soap';
import { StorageService, LOCAL_STORAGE } from 'ngx-webstorage-service';
import { Router } from '@angular/router';
declare var $: any;
import { ToastrService } from 'ngx-toastr';
import { MatTableDataSource, MatPaginator } from '@angular/material';

export interface StockElement {
  id: number;
  symbol: string;
  security: string;
  previousClosePrice: number;
  openPrice: number;
  highPrice: number;
  closePrice: number;
  netTradeVaule: number;
  netTradeQuantity: number;
  high52Week: number;
  low52Week: number;
}

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {
  @ViewChild(MatPaginator) paginator: MatPaginator;
  displayedColumns: string[] = ['id', 'symbol', 'security', 'previousClosePrice',
    'openPrice', 'highPrice', 'closePrice', 'netTradeVaule', 'netTradeQuantity',
    'high52Week', 'low52Week'];
  dataSource: MatTableDataSource<StockElement>;
  client: Client;
  stocks: [any];
  p = 1;
  pageSize = 50;

  searchText;
  constructor(private soap: NgxSoapService,
    @Inject(LOCAL_STORAGE) private localStorage: StorageService,
    private router: Router,
    private toastr: ToastrService) {
    this.soap.createClient('assets/StockManagementService.wsdl')
      .then(client => {
        this.client = client;
        this.client.call('findAllStocks', {}).subscribe(res => {
          this.stocks = res.result.return;
          this.dataSource = new MatTableDataSource(this.stocks as StockElement[]);
          this.dataSource.paginator = this.paginator;
        });
      });
  }

  ngOnInit() {
  }

  applyFilter(filterValue: string) {
    this.dataSource.filter = filterValue.trim().toLowerCase();
  }

  logout() {
    this.localStorage.remove('loggedInUser');
    this.router.navigate(['/login']);
  }

  addToPortfolio(stockData) {
    const user = this.localStorage.get('loggedInUser');
    if (user) {
      this.soap.createClient('assets/UserManagementServiceService.wsdl')
        .then(client => {
          client.call('addStock', {
            stock: stockData,
            username: user.username
          }).subscribe(res => {
            const errorMessage = res.result.return.errorMessage;
            if (res.result.return === true) {
              this.toastr.success('Stock added to your protfolio successfully.');
            } else {
              this.toastr.success('Some error occured, try again after some time.');
            }
            console.log('Response -> ' + res.result.return);
          });
        });
    } else {
      this.router.navigate(['/login']);
    }
  }
}
