import { Component, OnInit } from '@angular/core';
import {SharedService} from '../shared.service';
import {FormBuilder} from "@angular/forms";

@Component({
  selector: 'app-project',
  templateUrl: './project.component.html',
  styleUrls: ['./project.component.css']
})
export class ProjectComponent implements OnInit {

  constructor(private service:SharedService, private fb: FormBuilder) {
    this.fb = fb;
  }

  ProjectList:any = [];

  ngOnInit(): void {
    this.refreshDepList();
    console.log(this.refreshDepList());
    this.ProjectList =this.fb.group({
      projectControl: ['Projects']
    });
    console.log(this.refreshDepList());
  }
  refreshDepList(){
    this.service.getDeptList().subscribe(data=>{
      this.ProjectList=data;
    })
  }

}
