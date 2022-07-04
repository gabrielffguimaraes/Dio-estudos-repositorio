import {LOCALE_ID, NgModule} from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FooterComponent } from './shared/components/footer/footer.component';
import {CoreModule} from "./core/core.module";
import {registerLocaleData} from "@angular/common";

import localePt from '@angular/common/locales/pt';

registerLocaleData(localePt , 'pt-BR');

@NgModule({
  declarations: [
    AppComponent,
    FooterComponent
  ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        CoreModule
    ],
  providers: [{provide:LOCALE_ID , useValue:'pt-BR'}],
  bootstrap: [AppComponent]
})
export class AppModule { }
