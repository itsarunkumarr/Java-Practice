package practice;

class Student{
    String name;
    int age;
    int rollNumber;
    String college;

    void markAttendance(){
        System.out.println("Attendance marked by" + " " + name);
    }

    void details(){
        System.out.println(name + "," + age + "," + rollNumber + "," + college);
    }
}

public class Oops {

    public static void main(String[] args){

        Student s1 = new Student();
        Student s2 = new Student();


        s1.name = "Harry";
        s1.age = 24;
        s1.rollNumber = 21;
        s1.college = "Harvard";

        s2.name = "John";
        s2.age = 22;
        s2.rollNumber = 15;
        s2.college = "Harvard";

        s1.markAttendance();
        s2.markAttendance();

        s1.details();
        s2.details();

    }

}

