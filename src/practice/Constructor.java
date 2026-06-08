package practice;

public class Constructor {

    public static void main(String[] args){

        Student s1 = new Student();
        Student s2 = new Student("Arun");
        Student s3 = new Student("Raushan", 24);
        Student s4 = new Student("Rajeev",24, "Galgotias University" );
    }
}

class Student{
    String name;
    int age;
    String college;

    Student(){}

    Student(String name){
        this.name = name;
    }

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    Student(String name, int age, String college){
        this.name = name;
        this.age = age;
        this.college = college;
    }
}

/* Q. Can we call Constructor Manually?
   Ans - No, it will not call manually.
         It will call automatically when we create object and using "this" keyword.
 */
