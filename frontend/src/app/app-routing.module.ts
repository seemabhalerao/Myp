import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddstudentComponent } from './addstudent/addstudent.component';
import { AddteacherComponent } from './addteacher/addteacher.component';
import { ContactusComponent } from './contactus/contactus.component';
import { CourseComponent } from './course/course.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { LoginComponent } from './login/login.component';
import { NewuserComponent } from './newuser/newuser.component';
import { ShowstudentComponent } from './showstudent/showstudent.component';
import { ShowteacherComponent } from './showteacher/showteacher.component';
import { StudentComponent } from './student/student.component';
import { TeacherComponent } from './teacher/teacher.component';

const routes: Routes = [
  // {path:"",component:LoginComponent},
  // {path:"Login",component:LoginComponent},
   {path:'teacher',component:TeacherComponent,
children:[{path:'addteacher',component:AddteacherComponent},
{path:'showteacher',component:ShowteacherComponent}]},
{path:'student',component:StudentComponent,
children:[{path:'showstudent',component:ShowstudentComponent},
{path:'addstudent',component:AddstudentComponent}]},
{path:'course',component:CourseComponent},
{path:'contact',component:ContactusComponent},
{path:'dashboard',component:DashboardComponent},
{path:'newuser',component:NewuserComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
