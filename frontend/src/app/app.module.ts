import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { NewuserComponent } from './newuser/newuser.component';
import { AddteacherComponent } from './addteacher/addteacher.component';
import { ShowteacherComponent } from './showteacher/showteacher.component';
import { AddstudentComponent } from './addstudent/addstudent.component';
import { ShowstudentComponent } from './showstudent/showstudent.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { TeacherComponent } from './teacher/teacher.component';
import { StudentComponent } from './student/student.component';
import { CourseComponent } from './course/course.component';
import { ContactusComponent } from './contactus/contactus.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    NewuserComponent,
    AddteacherComponent,
    ShowteacherComponent,
    AddstudentComponent,
    ShowstudentComponent,
    DashboardComponent,
    TeacherComponent,
    StudentComponent,
    CourseComponent,
    ContactusComponent
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    CommonModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
