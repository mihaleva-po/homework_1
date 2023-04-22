public class Main {
    public static void main(String[] args) {

        String name = "Petr"; // - имя клиента,
        int start_money = 20000; // - размер первоначального взноса клиента в рублях,
        int years = 4;  // длительность накопительного периода в годах,
        double rate = 5.6; //- размер ставки накопительного счета в процентах,
        double finish_money; //- итоговый баланс клиента в рублях.

        finish_money = start_money + (start_money * rate/100 * years);

        System.out.format("Hello, %s. Your final balance: %s rubles.", name, finish_money);
    }
}