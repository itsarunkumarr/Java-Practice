package practice;

import java.util.Locale;

public class StringProperties {

    public static void main (String[] args){

        String s1 = new String ("Java");

        String s2 = new String("");

        String s3 = new String("Java");

        String s4 = new String("JAVA");

        String s5 = new String("abc");
        String s6 = new String("abd");
//
//        System.out.println(s1.length());
//        System.out.println(s2.length());
//
//        System.out.println(s1.isEmpty());
//        System.out.println(s2.isEmpty());
//
//        System.out.println(s1.isBlank());
//        System.out.println(s2.isBlank());
//
//        System.out.println(s1.charAt(2));

//        char[] arr = s1.toCharArray();
//
//        System.out.println(s1.equals(s3));

//        System.out.println(s1.equals(s4));
//        System.out.println(s1.equalsIgnoreCase(s4));

          // Lexicographical comparison --> Dictionary
//        System.out.println(s5.compareTo(s6));
          // equals() --> == --> compare References
          // compareTo() --> -ve, 0, +ve --> ASCII value of s5 - ASCII value of s6

        // Searching
//        System.out.println(s1.contains("v"));
//        System.out.println(s1.indexOf('v'));
//        System.out.println(s1.lastIndexOf("a"));

        // Extraction / Transformation
//        System.out.println(s1.substring(1,3));
//        System.out.println(s1.substring(1));
//
//        System.out.println(s1.toUpperCase());
//        System.out.println(s1.toLowerCase());
//
//        System.out.println(s1.trim());
//        System.out.println(s1.strip()); // UNICODE friendly
//
//        System.out.println(s1.repeat(3));
//
//        System.out.println(s1.replace('a', 'z'));
//        System.out.println(s1.replace("Ja", "Zi"));
//        System.out.println(s1.replaceAll("a", "k"));

        // SPLIT and JOIN
//        String s7 = "a-b-c-d-e";
//        String[] arr2 = s7.split("-");
//
//        for(String s : arr2){
//            System.out.println(s);
//        }
//
//        System.out.println(String.join("-", "a", "b", "c", "d"));

        // CONVERSION
        String s8 = new String(String.valueOf(10));
        System.out.println(s8);

        byte[] arr3 = s1.getBytes(); // find bytes
        for(byte b : arr3){
            System.out.print(b + " , ");
        }

    }
}
