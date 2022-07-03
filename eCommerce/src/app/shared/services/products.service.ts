import { Injectable } from '@angular/core';
import {Product} from "../interfaces/product";
import {Observable, of} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class ProductsService {

  constructor() {

  }
  list():Observable<Product[]> {
    return of(PRODUCTS);
  }
}
var PRODUCTS:Product[] = [
  {
    id:1,
    description:"" ,
    category:"",
    price:"" ,
    price_fake:"",
    detail:"",
    photo:""
  }
];
