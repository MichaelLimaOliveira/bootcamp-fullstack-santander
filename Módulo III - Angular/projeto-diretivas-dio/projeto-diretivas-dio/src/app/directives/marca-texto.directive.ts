import { Directive, ElementRef, Input, OnInit } from '@angular/core';

@Directive({
  selector: '[appMarcaTexto]',
})
export class MarcaTextoDirective implements OnInit {
  @Input() backgroundColor: string = 'yellow';
  @Input() textColor: string = 'white';

  constructor(private _element: ElementRef) {}

  ngOnInit(): void {
    this.changeBackground();
  }

  private changeBackground(cor: string = 'yellow') {
    this._element.nativeElement.style.backgroundColor = this.backgroundColor || cor;
    this._element.nativeElement.style.color = this.textColor;
    this._element.nativeElement.style.fontWeight = 'bold';
  }
}
