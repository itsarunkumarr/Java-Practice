package practice;

public class AutoBoxing {

    public static void main(String[] args) {

//       Integer a = 5;
//       int b = a.intValue(); //manual
//
//        int b = a; // automatic
//        System.out.println(b);



        int a =10;

        Integer b = Integer.valueOf(a);

        System.out.println(b);

        System.out.println(b.floatValue());


    }
}
