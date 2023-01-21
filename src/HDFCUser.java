import java.util.Objects;
import java.util.UUID;

public class HDFCUser implements BankInterface{
    private String AccountNo;
    private String name;
    private int balance;
    private String password;
    private float rateOfInterest;

    public String getAccountNo() {
        return AccountNo;
    }

    public void setAccountNo(String accountNo) {
        AccountNo = accountNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public float getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(float rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    public HDFCUser(String name, int balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;
        this.AccountNo =String.valueOf(UUID.randomUUID());
        this.rateOfInterest =7.2f;
    }

    @Override
    public int checkBalance() {
        return balance;
    }

    @Override
    public String addMoney(int money) {
        balance =balance+money;
        return "Your money has added successfully"+ money+ " and your new balance is"+ balance;
    }

    @Override
    public String WithdrawMoney(int money, String enteredPassword) {
        if (Objects.equals(password, enteredPassword)){
            if (balance<money){
                return  " You can not withdraw money due to low balance";
            }
            else{

                this.balance -=money;
                return "Your have withdrawn money successfully "+money+ " updated balance is"+balance;
            }
        }
        return " wrong password";
    }

    @Override
    public float calculateInterest(int years) {
        float rate= balance *rateOfInterest*years/100;
        return rate;
    }
}
