public class Student {
    String name ,gender ;
    int rollNo;

    Student (String name , String gender ,int rollNo){
        this.name = name;
        this.gender = gender;
        this.rollNo = rollNo;
    }
    void display(){System.out.println(rollNo + " " + name + " " + gender);}
}
