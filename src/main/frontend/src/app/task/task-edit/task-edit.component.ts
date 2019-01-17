import { Component, OnInit } from '@angular/core';
import {TaskService} from "../task.service";
import {Task} from '../task.model';
import {ActivatedRoute, ParamMap, Router} from "@angular/router";
import {switchMap} from "rxjs/operators";
import {Observable} from "rxjs";

@Component({
  selector: 'app-task-edit',
  templateUrl: './task-edit.component.html',
  styleUrls: ['./task-edit.component.css']
})
export class TaskEditComponent implements OnInit {
    public task: Observable<any>;
    constructor(private route: ActivatedRoute,private taskService: TaskService) { }
    ngOnInit() {
      this.task = this.route.paramMap.pipe(
          switchMap((params: ParamMap) =>
              this.taskService.getTask(params.get('id')))
      );
  }
}
