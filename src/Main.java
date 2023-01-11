import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double credit = 1_000_000; // сумма кредита
        int old = 36; // срок кредите в месяцах
        double payment = service.calculate(credit, old);
        System.out.println("Ваш ежемесячный платеж: " + payment);




    }
}
