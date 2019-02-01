import { Component, OnInit, Inject } from '@angular/core';
import { Router } from '@angular/router';
import { StorageService, LOCAL_STORAGE } from 'ngx-webstorage-service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit {
  constructor( @Inject(LOCAL_STORAGE) private localStorage: StorageService,
    private router: Router) { }
  ngOnInit() {
    const loggedInUser = this.localStorage.get('loggedInUser');
    if (loggedInUser && loggedInUser.username) {
      this.router.navigate(['/home']);
    } else {
      this.router.navigate(['/login']);
    }
  }
}
