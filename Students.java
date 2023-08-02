public class Students {
int rollno;//instance variable  
   String name;  
   static String college ="ITS";//static variable  
   //constructor  
   Students(int r, String n){  
   rollno = r;  
   name = n;  
   }  
   //method to display the values  
   void display (){System.out.println(rollno+" "+name+" "+college);}  
}  