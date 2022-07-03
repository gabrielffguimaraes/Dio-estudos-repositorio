import {
  AfterViewInit,
  Component, DoCheck, ElementRef,
  EventEmitter, Input,
  OnChanges,
  OnDestroy,
  OnInit,
  Output,
  SimpleChanges
} from '@angular/core';
import {delay, map, tap} from "rxjs/operators";
import {of} from "rxjs";

@Component({
  selector: 'spa-sidebar',
  templateUrl: './sidebar.component.html',
  styleUrls: ['./sidebar.component.css']
})
export class SidebarComponent implements OnInit,DoCheck {
  @Output() send = new EventEmitter();

  constructor(private elementRef:ElementRef) { }

  ngOnInit(): void {

  }

  ngDoCheck(): void {
    let isHidden:boolean = this.elementRef.nativeElement.hasAttribute("hidden") as boolean;
    if(isHidden) {
      of(true).pipe(delay(0)).subscribe(() => {
        this.send.emit("Sidebar was destroyed")
      });
      return
    }
    of(true).pipe(delay(0)).subscribe(() => {
      this.send.emit("")
    });
  }

}
