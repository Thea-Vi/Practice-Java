public class BankAccount {

    // member variables
    private double checkingBalance;
    private double savingsBalance;


    // CONSTRUCTOR
    public BankAccount (double checkingBalance, double savingsBalance){
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        // this.totalBalance = totalBalance;
    }
    
    public void displayBalance(){
        String balance = String.format("Balance: \n Checkings: %s \n Savings: %s", this.checkingBalance, this.savingsBalance);
        System.out.println(balance);
    }

    public Double getCheckingBalance(){
        return checkingBalance;
    }

    public void setCheckingbalance(double checkingBalance){
        this.checkingBalance = checkingBalance;
    }

    public Double getSavingsBalance(){
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance){
        this.savingsBalance = savingsBalance;
    }
     // use static for general queries


    // public Double getTotalBalance(double totalBalance){
    //     return totalBalance;
    // }

    // public void setTotalBalance(double totalBalance){
    //     this.totalBalance = totalBalance;
    // }



    // WITHDRAW 

    public void withdrawMoney(double amountWithdraw){
        // if they have enough money to withdraw, substract money from total amount,=
        // if not enough money, flash message

        if (this.checkingBalance < amountWithdraw ){
            System.out.println("You dont have enough money.");
        } else{
            this.checkingBalance -= amountWithdraw;
        }
    }

        // DEPOSIT

    public void depositMoney(double AmountDeposit, String accountType){

        if (accountType == "checkings"){
            this.checkingBalance += AmountDeposit;

        }else if(accountType == "savings"){
            this.savingsBalance += AmountDeposit;
        }else{
            System.out.println("You have more money now lol");
        }
            
     }

    //  TOTAL BALANCE
    
    // public Double totalBalance(){
    //     return checkingBalance + savingsBalance;
    // }




}
