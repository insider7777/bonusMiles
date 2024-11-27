public class Main {
    public static void main(String[] args) {
        // Стоимость билета
        int ticketPrice = 13676;

        // Количество рублей для одной бонусной мили
        int rublesPerMile = 20;

        // Расчет количества бонусных миль
        int bonusMiles = ticketPrice / rublesPerMile;

        // Вывод результата
        System.out.println("Количество начисленных бонусных миль: " + bonusMiles);
    }
}
