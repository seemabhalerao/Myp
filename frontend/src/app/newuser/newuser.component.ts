import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-newuser',
  templateUrl: './newuser.component.html',
  styleUrls: ['./newuser.component.css']
})
export class NewuserComponent {
  adminArray!:any[];
  admin_id!:number;
  admin_name!:string;
  admin_address!:string;
  admin_phone!:string;
  admin_email!:string;
  admin_pass!:string;
  username!:string;
  constructor(private http:HttpClient){
    
    }
  save(){
    let body={
  
      "admin_name":this.admin_name,
      "admin_email":this.admin_email,
      "admin_phone":this.admin_phone,
      "admin_pass":this.admin_pass,
      "admin_address":this.admin_address,
      "username":this.username
    };
  
    this.http.post("http://localhost:8085/saveadmin",body,{responseType:'text'}).subscribe((result:any)=>{
      console.log(result)
    alert("save data")
  
  this.admin_name='';
  this.admin_address='';
  this.admin_email='';
  this.admin_phone='';
  this.admin_pass='';
  this.username='';
  
  
    })
  }
  }


