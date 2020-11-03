import { Component, Inject, OnInit } from '@angular/core';
import { MAT_DIALOG_DATA, MatDialogRef } from "@angular/material/dialog";


@Component({
  selector: 'app-dialog',
  templateUrl: './dialog.component.html',
  styleUrls: ['./dialog.component.css']
})
export class DialogComponent implements OnInit {

  name:string;
  status:string;
  priority:string;
  last_m:string;
  finished:string;
  deadline:string;
  overdue:string;
  priority_class:string;
  

  constructor(public dialogRef: MatDialogRef<DialogComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any) { this.name = data.name; this.status = data.status; this.priority = data.priority;
      this.last_m = data.last_m; this.finished = data.finished; this.deadline = data.deadline; this.overdue = data.overdue;
      if (this.priority == "high") {this.priority_class = "priority-high"}
      if (this.priority == "medium") {this.priority_class = "priority-medium"}
      if (this.overdue != "") {this.overdue = this.overdue + " overdue"}
      if (this.finished == "") {this.finished = "open"}
     }

  
  close() {
    this.dialogRef.close();
  }

  ngOnInit(): void { console.log (this.data)
  }

}
