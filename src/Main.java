import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Celsius to be converted to Fahrenheit:");
        double userCelsius = input.nextDouble();

        System.out.println("Enter Fahrenheit to be converted to Celsius:");
        double userFahrenheit = input.nextDouble();

        double conToFahrenheit = (userCelsius * 9 / 5) + 32;
        double conToCelsius = (userFahrenheit - 32) * 5 / 9;

        input.close();

        System.out.println(String.format("%.1f", userCelsius) + "° Celsius is " +
                String.format("%.1f", conToFahrenheit) + "° Fahrenheit");

        System.out.println(String.format("%.1f", userFahrenheit) + "° Fahrenheit is " +
                String.format("%.1f", conToCelsius) + "° Celsius");
    }
}