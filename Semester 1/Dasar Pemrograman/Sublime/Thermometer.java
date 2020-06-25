
import java.util.Scanner;

public class Thermometer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float suhu, celcius, reaumur, fahrenheit, kelvin;

        System.out.print("Enter the temperature: ");
        suhu = sc.nextFloat();

        celcius = suhu;
        reaumur = (4f / 5f) * celcius;
        fahrenheit = (9f / 5f) * celcius + 32f;
        kelvin = celcius + 273f;

        System.out.println("  Temperature in celcius = " + celcius);
        System.out.println("  Temperature in reaumur = " + reaumur);
        System.out.println("  Temperature in fahrenheit = " + fahrenheit);
        System.out.println("  Temperature in kelvin = " + kelvin);
    }
}
