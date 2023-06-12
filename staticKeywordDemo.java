public class staticKeywordDemo { 
     int rollno;  
     String name;  
     static String college = "vnr";  
     //static method to change the value of static variable  
     static void change(){  
     college = "griet";  
     }  
      
     staticKeywordDemo(int r, String n){  
     rollno = r;  
     name = n;  
     }  
      
     void display(){System.out.println(rollno+" "+name+" "+college);}  
 
  
    public static void main(String args[]){  
    staticKeywordDemo.change();
    //creating objects  
    staticKeywordDemo s1 = new staticKeywordDemo(11,"pavan");  
   staticKeywordDemo s2 = new staticKeywordDemo(22,"raju");  
    staticKeywordDemo s3 = new staticKeywordDemo(33,"ml");  
    //calling display method  
    s1.display();  
    s2.display();  
    s3.display();  
    }  
    
}
