import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { TaskAddComponent } from './task/task-add/task-add.component';
import { TaskListComponent } from './task/task-list/task-list.component';
import {HttpClientModule} from "@angular/common/http";
import {FormsModule} from "@angular/forms";
import { TaskEditComponent } from './task/task-edit/task-edit.component';
import {RouterModule, Routes} from "@angular/router";
import {ObservableComponent} from "./fundamental/observable.component";

const routes: Routes = [
    { path:"edit/:id", component: TaskEditComponent },
    { path: 'tasks', component: TaskListComponent },
    { path: '', redirectTo: '/tasks', pathMatch: 'full' }
];

@NgModule({
  declarations: [
    AppComponent,
    TaskAddComponent,
    TaskListComponent,
    TaskEditComponent,
      ObservableComponent
  ],
  imports: [
      BrowserModule,
      RouterModule.forRoot(routes),
    HttpClientModule,
    FormsModule
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
