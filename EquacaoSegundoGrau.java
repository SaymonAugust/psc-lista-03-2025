import java.util.Scanner;

public class EquacaoSegundoGrau {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Entrada dos coeficientes
        System.out.print("Digite o valor de a: ");
        double a = input.nextDouble();

        System.out.print("Digite o valor de b: ");
        double b = input.nextDouble();

        System.out.print("Digite o valor de c: ");
        double c = input.nextDouble();

        // Caso especial (a = 0 e b = 0 e c diferente de 0)
        if (a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente.");
        }
        // Caso equação de 1º grau (a = 0 e b ≠ 0)
        else if (a == 0 && b != 0) {
            double raiz = -c / b;
            System.out.println("Essa é uma equação de primeiro grau.");
            System.out.println("Raiz real: " + raiz);
        }
        // Caso equação de 2º grau (a ≠ 0)
        else {
            double delta = (b * b) - (4 * a * c);

            // delta < 0 → sem raízes reais
            if (delta < 0) {
                System.out.println("Esta equação não possui raízes reais.");
            }
            // delta = 0 → duas raízes iguais
            else if (delta == 0) {
                double raiz = -b / (2 * a);
                System.out.println("Esta equação possui duas raízes reais iguais.");
                System.out.println("Raiz: " + raiz);
            }
            // delta > 0 → duas raízes diferentes
            else {
                double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
                double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);

                System.out.println("Esta equação possui duas raízes reais diferentes.");
                System.out.println("Raiz 1: " + raiz1);
                System.out.println("Raiz 2: " + raiz2);
            }
        }

        input.close();
    }
}
