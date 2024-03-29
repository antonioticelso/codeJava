import { Component, OnInit } from '@angular/core';
import {ProductService} from "../product.service";
import {Router} from '@angular/router';
import {Product} from "../product.model";

@Component({
  selector: 'app-product-create',
  templateUrl: './product-create.component.html',
  styleUrls: ['./product-create.component.css']
})
export class ProductCreateComponent implements OnInit {

  product: Product = {
    name: '',
    price: null
  }

  constructor(private productService: ProductService, private router: Router) { }

  ngOnInit(): void {
  }

  createProduct(): void {
    this.productService.create(this.product).subscribe(() => {
      this.productService.showMessage('Operaçao executada com sucesso!')
      this.router.navigate(['products'])
    });
  }

  cancelProduct(): void {
    this.productService.showMessage('Operaçao cancelada!')
    this.router.navigate(['products'])

  }

  // fazerAlgo(): void {
  //   console.log('fazendo alguma coisa!')
  // }

}


