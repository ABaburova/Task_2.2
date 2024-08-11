public class Main {
    public static void main(String[] args) {
        int current = 100; // баланс на счете клиента до пополнения
        int addend = 1600; // сумма пополнения
        int bonus = 0; // кол-во бонусов
        if (addend > 1000) {
            bonus = addend / 100;
        }
        int result = current + addend + bonus; // баланс на счете клиента после пополнения

        System.out.println("Итоговый счёт: " + result);
        System.out.println("Бонус: " + bonus);
    }
}
