import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HeaderComponent } from './components/header/header.component';
import { Error404Component } from './components/error404/error404.component';
import { NavComponent } from './components/nav/nav.component';
import {RouterModule} from "@angular/router";



@NgModule({
  declarations: [
    HeaderComponent,
    Error404Component,
    NavComponent
  ],
  exports: [
    NavComponent,
    HeaderComponent
  ],
  imports: [
    CommonModule,
    RouterModule.forChild([
      {path:'**',component:Error404Component}
    ])
  ]
})
export class CoreModule { }
