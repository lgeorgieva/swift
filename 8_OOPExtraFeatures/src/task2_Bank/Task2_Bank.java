package task2_Bank;

import task2_Bank.accounts.DepositAccount;
import task2_Bank.accounts.LoanAccount;
import task2_Bank.accounts.MortgageAccount;
import task2_Bank.customers.IndividualCustomer;

import java.util.Scanner;

/**
 * Created by ASUS on 11.11.2016 г..
 */
public class Task2_Bank {



    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();


        while (true) {
            String[] command = input.trim().split("\\s+");
            if (command[0].equals("END")) {
                break;
            }
            switch (command[0]) {
                case "OPEN":
                    String name = command[1];
                    String owner = (command[2]);


                    double balance = Double.parseDouble(command[3]);

                    double monthlyInterestRate = Double.parseDouble(command[4]);

                    DepositAccount depositAccount = new DepositAccount(name, owner, balance, monthlyInterestRate);


                    System.out.println(depositAccount.getAccountIBAN());

                    balance = Double.parseDouble(command[3]);
                    monthlyInterestRate = Double.parseDouble(command[4]);
                    LoanAccount loanAccount = new LoanAccount(name, owner, balance, monthlyInterestRate);


                    System.out.println(loanAccount.getAccountIBAN());
                    balance = Double.parseDouble(command[3]);
                    monthlyInterestRate = Double.parseDouble(command[4]);

                    MortgageAccount mortgageAccount = new MortgageAccount(name, owner, balance, monthlyInterestRate);

                    System.out.println(mortgageAccount.getAccountIBAN());


                    break;

                case "PUT":


                   String accountIBAN = command[1];

                    double cash = Double.parseDouble(command[2]);

                    depositAccount.put(cash);
                    System.out.println(depositAccount.getBalance());


                    loanAccount.put(cash);
                    System.out.println(loanAccount.getBalance());


                    mortgageAccount.put(cash);
                    System.out.println(mortgageAccount.getBalance());

                    break;
                case "GET":
                    name = command[1];
                    accountIBAN = command[1];

                    cash = Double.parseDouble(command[1]);
                    depositAccount.put(cash);
                    System.out.println(depositAccount.getBalance());
                    break;
                case "INFO":
                    name = command[1];
                    accountIBAN = command[1];


                    System.out.println(depositAccount.getInterestRateCost());

            }

                        System.out.println(depositAccount.getInterestRateCost());
                    }


                        System.out.println(depositAccount.getInterestRateCost());
                    }









    public static int getCompanyCustomer() {
        return companyCustomer;
    }

    public static void setCompanyCustomer(int companyCustomer) {
        Task2_Bank.companyCustomer = companyCustomer;
    }

    public static int getIndividualCustomer() {
        return individualCustomer;
    }

    public static void setIndividualCustomer(int individualCustomer) {
        Task2_Bank.individualCustomer = individualCustomer;
    }

    public static DepositAccount getDepositAccount() {
        return depositAccount;
    }

    public static void setDepositAccount(DepositAccount depositAccount) {
        Task2_Bank.depositAccount = depositAccount;
    }

    public static LoanAccount getLoanAccount() {
        return loanAccount;
    }

    public static void setLoanAccount(LoanAccount loanAccount) {
        Task2_Bank.loanAccount = loanAccount;
    }

    public static MortgageAccount getMortgageAccount() {
        return mortgageAccount;
    }

    public static void setMortgageAccount(MortgageAccount mortgageAccount) {
        Task2_Bank.mortgageAccount = mortgageAccount;
    }
}
