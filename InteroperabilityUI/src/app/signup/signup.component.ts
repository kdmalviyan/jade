import { Component, OnInit, Inject } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { NgxSoapService, Client, ISoapMethodResponse } from 'ngx-soap';
import { StorageService, LOCAL_STORAGE } from 'ngx-webstorage-service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.scss']
})
export class SignupComponent implements OnInit {

  signupFormGroup: FormGroup;
  constructor( @Inject(LOCAL_STORAGE) private localStorage: StorageService,
    private fb: FormBuilder,
    private soap: NgxSoapService,
    private router: Router) {
    this.signupFormGroup = this.fb.group({
      username: ['', [Validators.required, Validators.min(4)]],
      password: ['', [Validators.required, Validators.min(6)]],
    });
  }

  ngOnInit() {
  }
  onSubmit() {
    this.soap.createClient('assets/UserManagementServiceService.wsdl')
      .then(client => {
        client.call('register', this.signupFormGroup.value).subscribe(res => {
          this.router.navigate(['/login']);
        });
      });
  }
}
