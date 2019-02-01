import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { NgxSoapModule } from 'ngx-soap';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { GrdFilterPipe } from './grd-filter.pipe';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';
import { HomeComponent } from './home/home.component';
import { ForgotPasswordComponent } from './forgot-password/forgot-password.component';
import { StorageServiceModule } from 'ngx-webstorage-service';
import { NgxPaginationModule } from 'ngx-pagination';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {
  MatButtonModule, MatCheckboxModule, MatFormFieldModule,
  MatInputModule, MatRippleModule,
  MatCardModule, MatProgressSpinnerModule,
  MatMenuModule, MatIconModule, MatToolbarModule,
  MatSelectModule, MatSortModule, MatTableModule, MatPaginatorModule
} from '@angular/material';
import { PortfolioComponent } from './portfolio/portfolio.component';
import { ToastrModule } from 'ngx-toastr';
@NgModule({
  declarations: [
    AppComponent,
    GrdFilterPipe,
    LoginComponent,
    SignupComponent,
    HomeComponent,
    ForgotPasswordComponent,
    PortfolioComponent,
  ],
  imports: [
    StorageServiceModule,
    NgxPaginationModule,
    BrowserAnimationsModule,
    BrowserModule,
    AppRoutingModule,
    NgxSoapModule,
    FormsModule,
    ReactiveFormsModule,
    ToastrModule.forRoot(),
    MatButtonModule,
    MatFormFieldModule,
    MatRippleModule,
    MatCardModule,
    MatProgressSpinnerModule,
    MatMenuModule,
    MatIconModule,
    MatToolbarModule,
    MatInputModule,
    MatSelectModule,
    MatSortModule,
    MatTableModule,
    MatPaginatorModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
