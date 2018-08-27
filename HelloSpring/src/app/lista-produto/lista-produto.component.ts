import { Component, OnInit, Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Produto } from './produto.model';

@Component({
  selector: 'app-lista-produto',
  templateUrl: './lista-produto.component.html',
  styleUrls: ['./lista-produto.component.css']
})


export class ListaProdutoComponent implements OnInit {
  produtos: Produto[];

  constructor(private http: HttpClient) { }

  ngOnInit() {
  }

  getProdutos() {
    this.http.get<Produto[]>('http://localhost:8080/').
    subscribe(produtos => this.produtos = produtos);
  }

}
