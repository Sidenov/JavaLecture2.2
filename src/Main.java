public class Main {
    public static void main(String[] args) {
        int wallet = 100;            // Текущий баланс кошелька
        int refill = 1200;           // Сумма пополнения
        int bonus = refill / 100;    // Бонус за пополнение
        // int walletsumm;           // Баланс кошелька после пополнения
        // if (refill > 1000) {
        //    walletsumm = wallet + refill + bonus;
        // } else {
        //   walletsumm = wallet + refill;
        //   }
        int walletsumm = refill > 1000 ? wallet + refill + bonus : wallet + refill;
        System.out.println("Баланс кошелька = " + walletsumm);
    }
}
