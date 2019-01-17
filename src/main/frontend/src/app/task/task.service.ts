import {EventEmitter, Injectable, OnInit} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {Task} from './task.model';

@Injectable()
export class TaskService implements  OnInit{
    onTaskAdded = new EventEmitter<Task>();
    constructor(private http: HttpClient){

    }
    ngOnInit(): void {
    }

    getTasks(){
        return this.http.get("/api/tasks/list");
    }

    save(task: Task){
        return this.http.post("/api/tasks/save", task);
    }

    getTask(taskId){
        return this.http.get("/api/task/" + taskId);
    }
}
