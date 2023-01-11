public class CreditPaymentService {
    public int calculate(double credit, int old) {
        double percent = 9.99;
        double percentMonth = percent / 12 / 100;
        double payment = credit * ( percentMonth + ( percentMonth / ( Math.pow( ( 1 + percentMonth ) , old) - 1 )));



        return (int) payment;
    }
}
