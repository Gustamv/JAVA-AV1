import java.util.Scanner;

public class EX01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double SALARIOMINIMO = 937;
        System.out.println("Digite o seu salário: ");
        double salario = sc.nextDouble();
        System.out.println("A diferença entre o salário mínimo é de " + (salario - SALARIOMINIMO) + " reais");

        sc.close(); // Lembre-se de fechar o Scanner quando não for mais necessário.
    }
}
