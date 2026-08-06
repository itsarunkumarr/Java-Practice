package practice;

public class GenericClass {

    public static void main(String[] args) {

        Box2<Integer> b1 = new Box2<>(10);
        Box2<String> b2 = new Box2<>("Hello");
        Box2<Boolean> b3 = new Box2<>(true);

//        System.out.println(b1.getValue() + 5);
//        System.out.println(b2.getValue() + 5);
//        System.out.println(b3.getValue());

        Pair<Integer, String> p1 = new Pair<>(5, "Hello");
//        System.out.println(p1.first);
//        System.out.println(p1.second);
        System.out.println(p1.first + ", " + p1.second);

    }
}

    // Generics
class Box2<T>{

    private T value;

    Box2(T value){
        this.value = value;
    }

    public T getValue(){
        return this.value;
    }

    public void setValue(T value){
        this.value = value;
    }
}

class Pair<T, U>{
    T first;
    U second;

    Pair(T first, U second){
        this.first = first;
        this.second = second;
    }
}
