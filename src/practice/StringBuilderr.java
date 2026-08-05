package practice;

public class StringBuilderr {
    public static void main (String[] args){

        StringBuilder sb = new StringBuilder();

        sb.append("Java");
        sb.append(" Program");

        System.out.println(sb);

        // Insert
//        sb.insert(0, 'J');
//        System.out.println(sb);

        // Delete
//        sb.delete(0,1);
//        System.out.println(sb);
//
//        sb.deleteCharAt(2);
//        System.out.println(sb);

        // Replace
//        sb.replace(6, 9, "abc");
//        System.out.println(sb);

        // Reverse
//        sb.reverse();
//        System.out.println(sb);

//        System.out.println(sb.charAt(6));
//
//        sb.setCharAt(6, 'x');
//        System.out.println(sb);

        // Size
//        System.out.println(sb.length());
//        System.out.println(sb.capacity());

        // Capacity
        sb.ensureCapacity(50);
        System.out.println(sb.capacity());

        sb.trimToSize();
        System.out.println(sb.capacity());

    }
}
