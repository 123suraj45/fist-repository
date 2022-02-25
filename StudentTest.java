
class Student {
private String name;
private int roll_no;
private float marks;
private int attendance;

public Student (String myname,int myroll,float mymarks,int myattendance){
    this.name=myname;
    this.roll_no=myroll;
    this.attendance=myattendance;
    if(mymarks>=0)
      this.marks=mymarks;
    else 
      this.marks=0.0f;
    if(attendance>75)
     marks=(1.1f)*marks;
    if(marks>100)
      marks=100.0f;
}
public void setname(String s){this.name=s;}
public void setroll(int r){this.roll_no=r;}
public void setmarks(int m){this.marks=m;}
public void setattendance(int a){this.attendance=a;}
public String getname(){return name;}
public int getroll(){return roll_no;}
public float getmarks(){return marks;}
public int getattendance(){return attendance;}
public void viewdetail(){
  System.out.format("Name=%s  Rollno.=%d  Marks=%f  Attendance=%d\n",name,roll_no,marks,attendance);
}
}
public class StudentTest {
public static void main(String[] args) {
  Student a =new Student("Suraj", 10072, 89f, 77);
  Student b=new Student("Sehgal", 10073, 75f, 70); 
  a.viewdetail();
  b.viewdetail();
}    
}
