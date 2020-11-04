import { Component, OnInit } from '@angular/core';
import {taskService} from "../taskService";
import {TaskReports} from "../../TaskReports";
import {MatTableDataSource} from "@angular/material/table";

@Component({
  selector: 'app-task',
  templateUrl: './task.component.html',
  styleUrls: ['./task.component.css']
})
export class TaskComponent implements OnInit {
  ELEMENT_DATA: TaskReports[];
  displayedColumns: string[] =['name', 'id', 'status'];
  dataSource = new MatTableDataSource<TaskReports>(this.ELEMENT_DATA);

  constructor(private service: taskService) { }

  ngOnInit(): void {
    this.getAllReports();
  }
  public getAllReports(){
    let resp = this.service.getTask();
    resp.subscribe(report =>this.dataSource.data = report as TaskReports[]);
  }

}
