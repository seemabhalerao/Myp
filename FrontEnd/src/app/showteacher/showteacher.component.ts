import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-showteacher',
  templateUrl: './showteacher.component.html',
  styleUrls: ['./showteacher.component.css']
})
export class ShowteacherComponent {
  Array!:any[];
  teacher_id!:number;
  teacher_name!:string;
  teacher_qualification!:string;
  teacher_phone_no!:string;
  teacher_batch!:string;
  teacher_course!:string;
  
  constructor(private http:HttpClient){
  this.get();
  }
  get(){
    this.http.get("http://localhost:8085/showTeacher").subscribe((result:any)=>{
      console.log(result);
      this.Array=result;
  
    })
  }

  update(arr:any){
    this.teacher_id=arr.teacher_id
    this.teacher_name=arr.teacher_name
    this.teacher_phone_no=arr.teacher_phone_no
    this.teacher_qualification=arr.teacher_qualification
    this.teacher_batch=arr.teacher_batch
    this.teacher_course=arr.teacher_course
  }

  put(t_id:number){
    let body={
    'teacher_id':this.teacher_id,
    'teacher_name':this.teacher_name,
    'teacher_qualification':this.teacher_qualification,
    'teacher_phone_no':this.teacher_phone_no,
    'teacher_batch':this.teacher_batch,
    'teacher_course':this.teacher_course
    }
    this.http.put("http://localhost:8085/updateteacher"+"/"+t_id,body).subscribe((result)=>{
      console.log(result);
      alert("update data");
      this.get();
    })
  }
  deletetecher(id:number){
    this.http.delete("http://localhost:8085/deleteteacher"+"/"+id).subscribe((result)=>{
      console.log(result);
      alert("Delete");
      this.get();
    })
    
  }
}

