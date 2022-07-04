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
    description:"Camiseta Death note" ,
    category:"",
    price:49.50 ,
    price_fake:"",
    detail:"",
    photo:"/assets/images/products/p1.png"
  },
  {
    id:2,
    description:"Camiseta Escanor" ,
    category:"",
    price:40.99 ,
    price_fake:"",
    detail:"",
    photo:"/assets/images/products/p2.png"
  },
  {
    id:3,
    description:"Camiseta Death note #1" ,
    category:"",
    price:49.99 ,
    price_fake:"",
    detail:"",
    photo:"/assets/images/products/p3.png"
  },
  {
    id:4,
    description:"Camiseta porco com espadas" ,
    category:"",
    price:49.99 ,
    price_fake:"",
    detail:"",
    photo:"/assets/images/products/p4.png"
  },
  {
    id:5,
    description:"Camiseta fullmetal alchimist" ,
    category:"",
    price:25.99 ,
    price_fake:"",
    detail:"",
    photo:"/assets/images/products/p5.png"
  },
  {
    id:6,
    description:"Camiseta my hero academy" ,
    category:"",
    price:50 ,
    price_fake:"",
    detail:"",
    photo:"/assets/images/products/p6.png"
  },
  {
    id:7,
    description:"Camiseta jutsu kaisen" ,
    category:"",
    price:45.99 ,
    price_fake:"",
    detail:"",
    photo:"/assets/images/products/p7.png"
  },
  {
    id:8,
    description:"Camiseta attack on titan" ,
    category:"",
    price:45.99 ,
    price_fake:"",
    detail:"",
    photo:"/assets/images/products/p8.png"
  },
  {
    id:9,
    description:"Camiseta jutsu kaisen #1" ,
    category:"",
    price:100 ,
    price_fake:"",
    detail:"",
    photo:"/assets/images/products/p9.png"
  }
];
