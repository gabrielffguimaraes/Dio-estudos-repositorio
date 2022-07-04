import { Component, OnInit } from '@angular/core';
import {ProductsService} from "../../shared/services/products.service";
import {Product} from "../../shared/interfaces/product";
import {Observable} from "rxjs";

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {

  products!:Observable<Product[]>;
  constructor(private productsService:ProductsService) {
    this.products = productsService.list();
  }

  ngOnInit(): void {

  }

}
