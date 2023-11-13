import java.util.Scanner;
public class SUHU {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Konversi SuhuCelcius ");
        double celc, fahr, ream;

        System.out.print("Input Suhu Celsius: ");
        celc = input.nextDouble();

        fahr = (9.0 / 5.0 * celc) + 32;
        ream = celc * (4.0 / 5.0);

        System.out.println(celc + " Celcius = " + fahr + " Fahrenheit");
        System.out.println(celc + " Celcius = " + ream + " Reamur");
    }
}