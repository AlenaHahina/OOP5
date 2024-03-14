package SeminarOOP5.view;



import java.util.ArrayList;

import SeminarOOP5.Data.Student;



public class StudentView{
   public void show(ArrayList<Student> students, int id) {
      for (Student student: students) {
         if(student.getId()== id){
            System.out.println(student);
         }
      }
   }
}

