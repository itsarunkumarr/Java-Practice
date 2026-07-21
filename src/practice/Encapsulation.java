package practice;

public class Encapsulation {

    public static void main(String[] args) {

        BankAccount ba = new BankAccount();
        ba.deposite(500);
        ba.withdraw(300);

        System.out.println(ba.getBalance());


        Teacher t1 = new Teacher();

        t1.setName("Arun kumar");
        System.out.println(t1.getName());

        t1.setSubject("Maths");
        System.out.println(t1.getSubject());

        t1.setSalary(50000);
        System.out.println(t1.getSalary());
    }
}

class BankAccount {
    private double balance;

    public void deposite(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

}

class Teacher{
    private String name;
    private String subject;
    private int salary;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSubject(){
        return subject;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

}