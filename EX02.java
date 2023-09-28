import java.util.Scanner;

public class EX02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura em celsius: ");
        double c = sc.nextDouble();
        double f = (c * 9 / 5) + 32;
        System.out.println("A temperatura " + c + "°C convertendo para fahrenheit vira " + f + "°F");


        sc.close();
    }
}
