public class BankAccountTest {

    public static void main(String[] args) {

        BankAccount numOne = new BankAccount(50.50, 100.00);
        BankAccount numTwo = new BankAccount(70.50, 100.00);

        numOne.withdrawMoney(200.00);
        numOne.displayBalance();

        numTwo.depositMoney(50.00, "checkings");
        numTwo.depositMoney(50.00, "savings");
        numTwo.displayBalance();


        // numOne.totalBalance();


    }
    
    


}
