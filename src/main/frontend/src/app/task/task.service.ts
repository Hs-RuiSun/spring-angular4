import {Injectable, OnInit} from "@angular/core";
import {HttpClient} from "@angular/common/http";

@Injectable()
export class TaskService implements  OnInit{
    constructor(private http: HttpClient){

    }
    ngOnInit(): void {
    }

    getTasks(){
        return this.http.get("/api/tasks");
    }

}
