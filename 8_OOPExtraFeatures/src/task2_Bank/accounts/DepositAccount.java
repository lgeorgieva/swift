package task2_Bank.accounts;

/**
 * Created by ASUS on 11.11.2016 г..
 */
public class DepositAccount  {
    private String accountIBAN;
    private String owner;
    private double balance;
    private double monthlyInterestRate;
    private double interestRateCost;


    private int months ;
    public DepositAccount(String accountIBAN, String owner, double balance, double monthlyInterestRate) {
        this.accountIBAN = accountIBAN;

        this.owner = owner;
        this.balance = balance;
        this.monthlyInterestRate = monthlyInterestRate;
        this.interestRateCost =0.0;
        this.months =0;

    }




    public String getAccountIBAN() {
        return accountIBAN;
    }

    public void setAccountIBAN(String accountIBAN) {
        this.accountIBAN = accountIBAN;
    }

    public String getOwner( ) {

        return owner;
    }


    public double getBalance() {
        return balance;
    }



    public double getMonthlyInterestRate() {
        return monthlyInterestRate;
    }

    public void setMonthlyInterestRate(double monthlyInterestRate) {
        this.monthlyInterestRate = monthlyInterestRate;
    }

    public double getInterestRateCost() {
        return interestRateCost;
    }



    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public void info(double interestRateCost) {
            this.interestRateCost = this.balance * this.monthlyInterestRate * this.months;
        }
        public void put(double cash){
            this.balance += cash;
        }
    public void get(double cash){
        this.balance -= cash;
    }



}
