import {Component, Inject, OnInit} from '@angular/core';
import {MatDialog, MatDialogConfig} from "@angular/material/dialog";
import { DialogComponent } from './dialog/dialog.component';
import {HttpClient} from "@angular/common/http";


var sort_order = "<";
var sort_arrow = "";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'SoxDashboard';

  //Dialog
  constructor(private matDialog: MatDialog, private http: HttpClient) {}

  openDialog(row: any[]) {
    const dialogConfig = new MatDialogConfig();
    dialogConfig.autoFocus = true;
    dialogConfig.hasBackdrop = true;
    dialogConfig.data = { name: row["Name"], status: row["Status"], priority: row["Priority"], last_m: row["Last modified"],
                          finished: row["Finished"], deadline: row["Deadline"], overdue: row["Overdue"] };
    this.matDialog.open(DialogComponent, dialogConfig);

  }

  ngOnInit() {
   this.loadData();

  }
  loadData(){
    return this.http.get('http://localhost:8080/api/v1/project').subscribe(data =>{
     console.log(data);
    })
  }

  //Chart

  view_bar: any[] = [300, 300];
  view_advpie: any[] = [500, 300];
  view_pie: any[] = [500, 300];
  view_horbar: any[] = [400, 150];

  // options for the chart
  showXAxis = true;
  showYAxis = true;
  gradient = false;
  showLegend = false;
  showXAxisLabel = false;
  xAxisLabel = 'Tasks by Proirity';
  showYAxisLabel = false;
  yAxisLabel = 'Number';
  timeline = true;

  colorScheme = {
    domain: ['#9370DB', '#87CEFA', '#FA8072', '#FF7F50', '#90EE90', '#068FD8', '#00D6A4']
  };

  //pie
  showLabels = true;

  // data goes here
public single = [
  {
    "name": "Low",
    "value": 13
  },
  {
    "name": "Medium",
    "value": 5
  },
  {
    "name": "High",
    "value": 8
  }
];

public multi = [
  {
    "name": "China",
    "series": [
      {
        "name": "2018",
        "value": 2243772
      },
      {
        "name": "2017",
        "value": 1227770
      }
    ]
  },

  {
    "name": "USA",
    "series": [
      {
        "name": "2018",
        "value": 1126000
      },
      {
        "name": "2017",
        "value": 764666
      }
    ]
  },

  {
    "name": "Norway",
    "series": [
      {
        "name": "2018",
        "value": 296215
      },
      {
        "name": "2017",
        "value": 209122
      }
    ]
  },

  {
    "name": "Japan",
    "series": [
      {
        "name": "2018",
        "value": 257363
      },
      {
        "name": "2017",
        "value": 205350
      }
    ]
  },

  {
    "name": "Germany",
    "series": [
      {
        "name": "2018",
        "value": 196750
      },
      {
        "name": "2017",
        "value": 129246
      }
    ]
  },

  {
    "name": "France",
    "series": [
      {
        "name": "2018",
        "value": 204617
      },
      {
        "name": "2017",
        "value": 149797
      }
    ]
  }
];

public advpie = [
  {
    "name": "Active",
    "value": 25,
    "extra": {
      "code": "Act"
    }
  },
  {
    "name": "Proposed",
    "value": 3,
    "extra": {
      "code": "Pro"
    }
  },
  {
    "name": "Reviewing",
    "value": 5,
    "extra": {
      "code": "Rev"
    }
  },
  {
    "name": "Rejected",
    "value": 3,
    "extra": {
      "code": "Rej"
    }
  },
  {
    "name": "Inactive",
    "value": 1,
    "extra": {
      "code": "InAc"
    }
  },
  {
    "name": "Finished",
    "value": 1,
    "extra": {
      "code": "Fin"
    }
  }
]

pie = [
  {
    "name": "ASIL A",
    "value": 5
  },
  {
    "name": "QM",
    "value": 2
  },
  {
    "name": "ASIL B",
    "value": 1
  }
];

horbar = [
  {
    "name": "REQ linked TC",
    "value": 8
  },
  {
    "name": "Passed",
    "value": 5
  },
  {
    "name": "Failed",
    "value": 2
  },
  {
    "name": "Blocked",
    "value": 1
  }
];

  //Tables



  //Task Table

  task_tbl_headers = ["Name", "Status", "Priority", "Last modified", "Finished","Deadline", "Overdue"];


  task_tbl_rows = [{
    "Name": "Messure tension",
    "Status": "active",
    "Priority": "medium",
    "Last modified": "28/05/2020",
    "Finished": "",
    "Deadline": "27/05/2020",
    "Overdue": "true"
  },
    {"Name": "Provide training",
    "Status": "inactive",
    "Priority": "low",
    "Last modified": "02/04/2020",
    "Finished": "",
    "Deadline": "27/05/2020",
    "Overdue": "true"},

    {"Name": "Adjust quality constraints with customers",
    "Status": "inactive",
    "Priority": "medium",
    "Last modified": "20/05/2020",
    "Finished": "20/05/2020",
    "Deadline": "07/07/2020",
    "Overdue": ""},

    {"Name": "Design packaging concept",
    "Status": "active",
    "Priority": "medium",
    "Last modified": "28/05/2020",
    "Finished": "",
    "Deadline": "14/07/2020",
    "Overdue": ""},

    {"Name": "High frequency diagnosis",
    "Status": "inactive",
    "Priority": "high",
    "Last modified": "20/05/2020",
    "Finished": "",
    "Deadline": "01/08/2020",
    "Overdue": ""},

    {"Name": "Start beta testing",
    "Status": "inactive",
    "Priority": "low",
    "Last modified": "02/04/2020",
    "Finished": "27/05/2020",
    "Deadline": "27/05/2020",
    "Overdue": ""},

    {"Name": "Test Task 01",
    "Status": "inactive",
    "Priority": "low",
    "Last modified": "02/04/2020",
    "Finished": "",
    "Deadline": "27/05/2020",
    "Overdue": ""},

    {"Name": "Test Task 02",
    "Status": "inactive",
    "Priority": "low",
    "Last modified": "02/04/2020",
    "Finished": "",
    "Deadline": "27/05/2020",
    "Overdue": ""},

    {"Name": "Test Task 03",
    "Status": "inactive",
    "Priority": "low",
    "Last modified": "02/04/2020",
    "Finished": "",
    "Deadline": "27/05/2020",
    "Overdue": ""},

    {"Name": "Test Task 04",
    "Status": "inactive",
    "Priority": "low",
    "Last modified": "02/04/2020",
    "Finished": "",
    "Deadline": "27/05/2020",
    "Overdue": ""},

    {"Name": "Test Task 05",
    "Status": "inactive",
    "Priority": "low",
    "Last modified": "02/04/2020",
    "Finished": "",
    "Deadline": "27/05/2020",
    "Overdue": ""},

    {"Name": "Test Task 06",
    "Status": "inactive",
    "Priority": "low",
    "Last modified": "02/04/2020",
    "Finished": "",
    "Deadline": "27/05/2020",
    "Overdue": ""},

    {"Name": "Test Task 07",
    "Status": "inactive",
    "Priority": "low",
    "Last modified": "02/04/2020",
    "Finished": "",
    "Deadline": "27/05/2020",
    "Overdue": ""},

    {"Name": "Test Task 08",
    "Status": "inactive",
    "Priority": "low",
    "Last modified": "02/04/2020",
    "Finished": "",
    "Deadline": "27/05/2020",
    "Overdue": ""}
  ];

  //Replace overdue flags
  task_tbl_rows_res = this.task_tbl_rows.map((obj) => {
    if (obj.Overdue == "true") {obj.Overdue = "&#9888;";} else {}
    // or via brackets
    // obj['total'] = 2;
    return obj;
  });

  //Sort Table

  sortBy(column: string, sort_change: string) {
    if (sort_change == "changesort") {if(sort_order == ">"){sort_order = "<"; sort_arrow = "&darr;";} else {sort_order = ">"; sort_arrow = "&uarr;";}}
    this.task_tbl_rows_res.sort((a, b) => eval("a[column]" + sort_order + "b[column] ? 1 : a[column] === b[column] ? 0 : -1"));
    return this.task_tbl_headers;
  }

  onClickTableHeader(column: string, sort_change: string) {
    this.sortBy(column, sort_change);
  }






}
