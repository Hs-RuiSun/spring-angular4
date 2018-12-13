import {Injectable, OnInit} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {Task} from "./task.model";

@Injectable()
export class TaskService implements  OnInit{
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
}
