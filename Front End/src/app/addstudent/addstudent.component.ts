import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-addstudent',
  templateUrl: './addstudent.component.html',
  styleUrls: ['./addstudent.component.css']
})
export class AddstudentComponent {

  studentArray!:any[];
  student_id!:number;
  student_name!:string;
  student_address!:string;
  student_phone_no!:string;
  student_batch!:string;
  student_course!:string;
  constructor(private http:HttpClient){
    
    }
  savestud(){
    let body={
  
      "student_name":this.student_name,
      "student_address":this.student_address,
      "student_phone_no":this.student_phone_no,
      "student_batch":this.student_batch,
      "student_course":this.student_course
    };
  
    this.http.post("http://localhost:8085/savestudent",body,{responseType:'text'}).subscribe((result:any)=>{
      console.log(result)
    alert("save data")
  
  this.student_name='';
  this.student_address='';
  this.student_phone_no='';
  this.student_batch='';
  this.student_course='';
  
  
    })
  }
  }


