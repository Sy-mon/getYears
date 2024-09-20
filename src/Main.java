import java.time.LocalDate;
import java.time.Period;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(1990,11,24);

        int years = Period.between(birthDate, today).getYears();

        System.out.println("Your are years " + years + " old");
    }
}