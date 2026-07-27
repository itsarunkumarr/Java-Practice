package practice;

public class Enum {
    public static void main(String[] args) {

        PaymentStatus status1 = PaymentStatus.PENDING;
        PaymentStatus status2 = PaymentStatus.FAILED;
        PaymentStatus status3 = PaymentStatus.SUCCESS;

        System.out.println(status1.name());
        System.out.println(status2.name());
        System.out.println(status3.name());
    }
}

enum PaymentStatus{
    SUCCESS,
    PENDING,
    FAILED;
}
