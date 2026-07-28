package practice;

public class Enum {
    public static void main(String[] args) {

//        PaymentStatus status1 = PaymentStatus.PENDING;
//        PaymentStatus status2 = PaymentStatus.FAILED;
//        PaymentStatus status3 = PaymentStatus.SUCCESS;
//
//        System.out.println(status1.name());
//        System.out.println(status2.name());
//        System.out.println(status3.name());

//        Direction d = Direction.EAST;
//        System.out.println(d.getDegrees());
//
//        Direction d2 = Direction.SOUTH;
//        System.out.println(d2.getDegrees());

        MoveDirection direction1 = MoveDirection.EAST;

        direction1.move();
    }
}

enum PaymentStatus{
    SUCCESS,
    PENDING,
    FAILED;
}
enum Direction{
    NORTH(0),
    SOUTH(180),
    EAST(90),
    WEST(270);

    private int degrees;

    Direction(int degrees){
        this.degrees = degrees;
    }
    public int getDegrees(){
        return degrees;
    }
}

enum MoveDirection{
    NORTH{
        @Override
        public void move(){
            System.out.println("Moving UP");
        }
    },
    SOUTH{
        @Override
        public void move(){
            System.out.println("Moving DOWN");
        }
    },
    EAST{
        @Override
        public void move(){
            System.out.println("Moving RIGHT");
        }
    },
    WEST{
        @Override
        public void move(){
            System.out.println("Moving LEFT");
        }
    };

    public abstract void move();
}