import { AfterContentChecked, AfterContentInit, AfterViewChecked, AfterViewInit, Component, DoCheck, Input, OnChanges, OnDestroy, OnInit, SimpleChanges } from '@angular/core';

@Component({
  selector: 'app-life-cycle',
  templateUrl: './life-cycle.component.html',
  styleUrls: ['./life-cycle.component.css']
})
export class LifeCycleComponent implements OnInit, OnChanges, DoCheck, AfterContentInit, AfterContentChecked, AfterViewInit, AfterViewChecked, OnDestroy {

  @Input() number: number = 10;
  
  constructor() {
    console.log('Chamou o constructor');
   }

   ngOnChanges(): void {
     console.log('Chamou o on changes');
   }

  ngOnInit(): void {
    console.log('Chamou o on init');
  }

  ngDoCheck(): void {
    console.log('Chamou o do check');
  }

  ngAfterContentInit(): void {
    console.log('Chamou o after content init');
  }

  ngAfterContentChecked(): void {
    console.log('Chamou o after content checked');
  }

  ngAfterViewInit(): void {
    console.log('Chamou o after view init');
  }

  ngAfterViewChecked(): void {
    console.log('Chamou o after view checked');
  }

  ngOnDestroy(): void {
    console.log('Chamou o on destroy');
  }
}
