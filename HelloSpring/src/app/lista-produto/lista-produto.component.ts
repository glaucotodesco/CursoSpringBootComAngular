import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-lista-produto',
  templateUrl: './lista-produto.component.html',
  styleUrls: ['./lista-produto.component.css']
})
export class ListaProdutoComponent implements OnInit {

  produtos: string[];

  constructor() { }

  ngOnInit() {
  }

  getProdutos(){
    this.produtos = ['Produto 1', 'Produto 2', 'Produto 3'];
  }
}
