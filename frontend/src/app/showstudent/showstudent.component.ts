import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-showstudent',
  templateUrl: './showstudent.component.html',
  styleUrls: ['./showstudent.component.css']
})
export class ShowstudentComponent {
  Array!:any[];
  student_id!:number;
  student_name!:string;
  student_address!:string;
  student_phone_no!:string;
  student_batch!:string;
  student_course!:string;
  
  constructor(private http:HttpClient){
  this.get();
  }
  get(){
    this.http.get("http://localhost:8085/showstudent").subscribe((result:any)=>{
      console.log(result);
      this.Array=result;
  
    })
  }

  update(arr:any){
  this.student_id=arr.student_id,
  this.student_name=arr.student_name,
  this.student_phone_no=arr.student_phone_no,
  this.student_address=arr.student_address,
  this.student_batch=arr.student_batch,
  this.student_course=arr.student_course
  }

  put(s_id:number){
    let body={
    'student_id':this.student_id,
    'student_name':this.student_name,
    'student_address':this.student_address,
    'student_phone_no':this.student_phone_no,
    'student_batch':this.student_batch,
    'student_course':this.student_course
    }
    this.http.put("http://localhost:8085/updatestudent"+"/"+s_id,body).subscribe((result)=>{
      console.log(result);
      alert("update data");
      this.get();
    })
  }
  deletestudent(id:number){
    this.http.delete("http://localhost:8085/deletestudent"+"/"+id).subscribe((result)=>{
      console.log(result);
      alert("Delete");
      this.get();
    })
    
  }
}
