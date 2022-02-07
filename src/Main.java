public class Main {
    public static void main(String[] args) {
        int wallet = 100;            // Текущий баланс кошелька
        int refill = 1100;           // Сумма пополнения
        int bonus = refill / 100;    // Бонус за пополнение

        int walletSumm = refill > 1000 ? wallet + refill + bonus : wallet + refill;
        System.out.println("Итоговый счет = " + walletSumm);
        if (refill > 1000) {
            System.out.println("Количество бонусных рублей = " + bonus);
        } else {
        }

    }
}
