import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeworkComponent } from './homework/homework.component';
import { SwitchComponent } from './switch/switch.component';
import { ParentComponent } from './parent/parent.component';
import { Child1Component } from './child1/child1.component';
import { Parent1Component } from './parent1/parent1.component';
import { Child2Component } from './child2/child2.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeworkComponent,
    SwitchComponent,
    ParentComponent,
    Child1Component,
    Parent1Component,
    Child2Component
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
