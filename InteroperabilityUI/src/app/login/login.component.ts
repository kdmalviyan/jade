import { Component, OnInit, Inject } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { NgxSoapService, Client, ISoapMethodResponse } from 'ngx-soap';
import { Router } from '@angular/router';
import { LOCAL_STORAGE, StorageService } from 'ngx-webstorage-service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {
  loginFormGroup: FormGroup;
  errorMessage;
  constructor( @Inject(LOCAL_STORAGE) private localStorage: StorageService,
    private fb: FormBuilder,
    private soap: NgxSoapService,
    private router: Router) {
    this.loginFormGroup = this.fb.group({
      username: ['', [Validators.required, Validators.min(4)]],
      password: ['', [Validators.required, Validators.min(6)]],
    });
  }

  ngOnInit() {
    console.log('Welcome to login');
  }

  onSubmit() {
    this.soap.createClient('assets/UserManagementServiceService.wsdl')
      .then(client => {
        client.call('login', this.loginFormGroup.value).subscribe(res => {
          const errorMessage = res.result.return.errorMessage;
          if (errorMessage) {
            this.errorMessage = errorMessage;
          } else {
            this.localStorage.set('loggedInUser', res.result.return);
            this.router.navigate(['/home']);
          }
        });
      });
  }

  clearError() {
    this.errorMessage = '';
  }
}
