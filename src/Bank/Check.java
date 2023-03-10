package Bank;

public class Check {
    int number;
    String name;
    int balance;

    Check(int number, String name, int balance){
        this.balance = balance;
        this.name = name;
        this.number = number;
    }

    public int getNumber(){
        return number;
    }

    public int getBalance(){
        return balance;
    }

    public String getName(){
        return name;
    }

    public int moneyInput(int money){
        balance += money;
        return balance;
    }

    public int moneyOutput(int money){
        balance -= money;
        return balance;
    }
}
