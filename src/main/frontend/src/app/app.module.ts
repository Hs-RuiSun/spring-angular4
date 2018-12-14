import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TaskComponent } from './task/task.component';
import { TaskAddComponent } from './task/task-add/task-add.component';
import { TaskListComponent } from './task/task-list/task-list.component';
import {TaskService} from "./task/task.service";
import {HttpClientModule} from "@angular/common/http";
import {FormsModule} from "@angular/forms";
@NgModule({
  declarations: [
    AppComponent,
    TaskComponent,
    TaskAddComponent,
    TaskListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
  ],
  providers: [TaskService],
  bootstrap: [AppComponent]
})
export class AppModule { }
