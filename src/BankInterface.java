public interface BankInterface {
    int checkBalance();
     String addMoney(int money);

     String WithdrawMoney(int money, String password);

     float calculateInterest(int years);

}
