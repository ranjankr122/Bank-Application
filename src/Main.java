import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter 1 for creating Account in SBI and 2 for In HDFC");
      //  int choiceOfBank =sc.nextInt();

      //  switch (choiceOfBank) {
         //   case 1 -> {
                System.out.println(" welcome to the SBI");
                System.out.println("Enter the name and initial balance and password ");
                String name = sc.nextLine();
                int balance = sc.nextInt();
                String password = sc.next();

                // creating an Account in SBI
                SBIUser acc1 = new SBIUser(name, balance, password);
                System.out.println(" The Account number of new SBI account:" + acc1.getAccountNo());

                // add Money in account
                System.out.println(" Enter the money that you want to add");
                int money = sc.nextInt();
                acc1.addMoney(money);
                // Check Balances

                int newBalance = acc1.getBalance();
                System.out.println("Yhe new balance is:" + newBalance);


                // withdraw money

                System.out.println("Withdraw Money");
                int amount = sc.nextInt();
                System.out.println("Enter Password");
                String enteredPassword = sc.next();
                String result = acc1.WithdrawMoney(amount, enteredPassword);
                System.out.println(result);

                // Interest count
                System.out.println(" The interest for 10 years on " + acc1.getBalance() + " Rs will be " + acc1.calculateInterest(10));
           // }
           // case 2 -> {
                System.out.println("Welcome to the HDFC bank");
                System.out.println("Enter the name and initial balance and password");
                String name1 = sc.nextLine();
                int balance1 = sc.nextInt();
                String password1 = sc.next();

                // creating an Account in SBI
                HDFCUser acc2 = new HDFCUser(name1, balance1, password1);
                System.out.println(" The Account number of new HDFC account:" + acc2.getAccountNo());

                // add Money in account
                System.out.println(" Enter the money that you want to add");
                int money1 = sc.nextInt();
                acc2.addMoney(money1);
                // Check Balances

                int newBalance1 = acc2.getBalance();
                System.out.println("Yhe new balance is:" + newBalance1);


                // withdraw money

                System.out.println("Withdraw Money");
                int amount1 = sc.nextInt();
                System.out.println("Enter Password");
                String enteredPassword1 = sc.next();
                String result1 = acc2.WithdrawMoney(amount1, enteredPassword1);
                System.out.println(result1);

                // Interest count
                System.out.println(" The interest for 10 years on " + acc2.getBalance() + " Rs will be " + acc2.calculateInterest(10));
           // }
           // default -> System.out.println(" Not a Valid choice");
       // }
    }
}
