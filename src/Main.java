//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int ticketPrice = 13676; // стоимость билета
        int rublesPerMile = 20;  // количество рублей для одной бонусной мили

        int bonusMiles = ticketPrice / rublesPerMile;

        System.out.println("Начислено бонусных миль: " + bonusMiles);
    }
}