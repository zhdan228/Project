package Bank;

public class Main {
    public static void main(String[] args) {
        int money = 20000;
        int money2 = 30000;
        Check schet = new Check(10, "Бен", 40000);

        System.out.println("Номер счета: " + schet.getNumber() + "\nИмя: " + schet.getName() + "\nБаланс на счету: " + schet.getBalance());

        System.out.println("\nВы положили на счет " + money + " тг.\nВаш баланс: " + schet.moneyInput(money));
        System.out.println("\nВы сняли со счета " + money2 + " тг.\nВаш баланс: " + schet.moneyOutput(money2));
    }
}
