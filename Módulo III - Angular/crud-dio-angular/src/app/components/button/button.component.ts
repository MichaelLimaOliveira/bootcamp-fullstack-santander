import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-button',
  templateUrl: './button.component.html',
  styleUrls: ['./button.component.css']
})
export class ButtonComponent implements OnInit {
 @Input() buttonText: string = 'Clique';
 @Input() buttonType: string = '';
 @Output() clickOutput = new EventEmitter;
 textFilho = 'clicou no filho'
  constructor() { }

  ngOnInit(): void {
  }

  clickButton() {
    this.clickOutput.emit(this.textFilho)
  }

}
