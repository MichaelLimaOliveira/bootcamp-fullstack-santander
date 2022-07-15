import { UpperCasePipe } from '@angular/common';
import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-pipes-example',
  templateUrl: './pipes-example.component.html',
  styleUrls: ['./pipes-example.component.css']
})
export class PipesExampleComponent implements OnInit {
  number = 0;
  text = 'hello World';
  date = new Date;
  pessoa = {
    name: 'Michael',
    age: '28',
    ocupation: 'Developer'
  };
  nomes = ['Michael'];
  constructor(private upperCasePipe: UpperCasePipe) { }

  ngOnInit(): void {
    this.text = this.upperCasePipe.transform(this.text);
  }

  mudarValor() {
    this.text = 'novo texto';
  }

  add(text: string) {
    this.nomes.push(text)
  }
}
