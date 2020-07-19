import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TodoComponent } from './todo/todo.component';
import {ReactiveFormsModule} from "@angular/forms";
import { RegisterFinalComponent } from './register-final/register-final.component';
import { LoginComponent } from './login/login.component';
import { TimeOfLifeComponent } from './time-of-life/time-of-life.component';

@NgModule({
  declarations: [
    AppComponent,
    TodoComponent,
    RegisterFinalComponent,
    LoginComponent,
    TimeOfLifeComponent
  ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        ReactiveFormsModule
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
