public class Main {
    public static void main(String[] args) {
        //Сумма пополнения
        double amount = 1500;
        double bonus;
        if (amount > 1000) {
            //Итоговый бонус пополнении > 1000
            bonus = (int)amount/100;
        } else {
            //Итоговый бонус при пополнении < 1000
            bonus = 0;
        }
        //Остаток на счету на момент пополнения
        double balance = 100.00;
        //Итоговый баланс после пополнения
        double totalBalance = balance + amount + bonus;
        System.out.println(totalBalance);
    }
}
