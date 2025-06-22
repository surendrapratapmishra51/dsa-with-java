package OOPs;

class Account{
    // data security
    private double balance;


    //method::public
    public double getBalance(double balance){
        // withdrawing the money
        boolean result = validate("surendra","mishra123");
         if(result == true){
             this.balance = this.balance -balance;
           //  System.out.println("Withdrawing the balance "+balance+" from account "+this.balance);
             return balance;
         }
         else{
             System.out.println("Invalid userName/password try again......");
             return 0.0f;
         }

    }

    //methode public
    public void setBalance(double balance){
        // authentication first
        boolean result = validate("surendra","mishra123");

        if(result == true){
            // deposit the money
            this.balance = this.balance +balance;
            System.out.println("Credited to the account");
        }
       else{
           // throw a message
            System.out.println("Invalid userName/password try again...");
        }
    }

    // method private
    private  boolean validate(String userName, String password){
        // logic for authentication
        return userName.equalsIgnoreCase("surendra") && password.equals("mishra123");

    }
}

public class TestApp {
    public static void main(String[] args) {
        Account acc = new Account();
       // System.out.println(acc.balance);
        acc.setBalance(1000.00);
        double balance = acc.getBalance(100.00);
        System.out.println("Withdrawing the balance "+balance+" from account ");

    }
}
