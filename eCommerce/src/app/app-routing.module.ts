import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from "./app.component";

const routes: Routes = [
  {path:'' , redirectTo:'products' , pathMatch:'full'},
  {path:'products' , loadChildren:()=> import('./client/products/products.module').then(p => p.ProductsModule)},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
