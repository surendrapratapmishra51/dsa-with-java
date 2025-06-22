package OOPs;
class LoanApp{
    static float rateOfIntrest = 9.5f;
}

public class TestLoanApp {
    public static void main(String[] args) {
        // accessing by reference variable
        System.out.println(LoanApp.rateOfIntrest);
        // accessing through object
        System.out.println(new LoanApp().rateOfIntrest);
    }
}
