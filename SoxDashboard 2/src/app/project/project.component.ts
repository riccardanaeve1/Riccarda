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
    this.ProjectList =this.fb.group({
      projectControl: ['Projects']
    });
  }
  refreshDepList(){
    this.service.getDeptList();
  }

}
