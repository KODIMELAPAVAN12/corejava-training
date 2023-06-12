public class thisKeywordDemo {
 
int rollno;  
String name;  
float fee;  
thisKeywordDemo(int rollno,String name,float fee){  
this.rollno=rollno;  
this.name=name;  
this.fee=fee;  
}  
void display(){System.out.println(rollno+" "+name+" "+fee);}  
}  
  
class TestThis2{  
public static void main(String args[]){  
thisKeywordDemo s1=new thisKeywordDemo(11,"pavan",500f);  
thisKeywordDemo s2=new thisKeywordDemo(12,"pavani",600f);  
s1.display();  
s2.display();  
}}  

    

