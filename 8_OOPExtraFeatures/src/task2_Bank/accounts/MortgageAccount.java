package task2_Bank.accounts;

/**
 * Created by ASUS on 11.11.2016 г..
 */
public class MortgageAccount  {
    private String accountIBAN;
    private String owner;
    private double balance;
    private double monthlyInterestRate;
    private double interestRateCost;


    private int months ;
    public MortgageAccount(String accountIBAN, String owner, double balance, double monthlyInterestRate) {
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

    public String getOwner(String name) {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
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

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public double getInterestRateCost() {
        return interestRateCost;
    }



    private void info(double interestRateCost) {
        if  (months >= 6) {
            this.interestRateCost = this.balance * this.monthlyInterestRate * (this.months - 6);
        } else {
            this.interestRateCost = this.balance * this.monthlyInterestRate * this.months;
        }
        if ( months <= 12) {
            this.interestRateCost = (this.balance * this.monthlyInterestRate * this.months - 6) * 0.5;
        } else {
            this.interestRateCost = this.balance * this.monthlyInterestRate * this.months;
        }
    }
    public void put(double cash){
        this.balance += cash;
    }
}

