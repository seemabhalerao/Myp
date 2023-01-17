import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-addteacher',
  templateUrl: './addteacher.component.html',
  styleUrls: ['./addteacher.component.css']
})
export class AddteacherComponent {
  teacherArray!:any[];
  teacher_id!:number;
  teacher_name!:string;
  teacher_qualification!:string;
  teacher_phone_no!:string;
  teacher_batch!:string;
  teacher_course!:string;
  constructor(private http:HttpClient){
    
    }
  save(){
    let body={
  
      "teacher_name":this.teacher_name,
      "teacher_qualification":this.teacher_qualification,
      "teacher_phone_no":this.teacher_phone_no,
      "teacher_batch":this.teacher_batch,
      "teacher_course":this.teacher_course
    };
  
    this.http.post("http://localhost:8085/saveteacher",body,{responseType:'text'}).subscribe((result:any)=>{
      console.log(result)
    alert("save data")
  
  this.teacher_name='';
  this.teacher_qualification='';
  this.teacher_phone_no='';
  this.teacher_batch='';
  this.teacher_course='';
  
  
    })
  }
  }
