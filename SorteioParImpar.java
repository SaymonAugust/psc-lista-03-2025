import java.util.Scanner;
import java.util.Random;

public class SorteioParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // 1. Entrada dos dois números
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        // 2. Descobrir o menor e o maior
        int menor = Math.min(num1, num2);
        int maior = Math.max(num1, num2);

        // 3. Sorteio dentro do intervalo [menor, maior]
        int sorteado = random.nextInt(maior - menor + 1) + menor;

        // 4. Verificação par ou ímpar
        if (sorteado % 2 == 0) {
            System.out.println("Número sorteado: " + sorteado + " (par)");
        } else {
            System.out.println("Número sorteado: " + sorteado + " (ímpar)");
        }

        scanner.close();
    }
}
