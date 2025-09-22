import java.util.Scanner;

public class MaiorMenorMedia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Entrada dos números
        System.out.print("Digite o primeiro número: ");
        int n1 = input.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = input.nextInt();

        System.out.print("Digite o terceiro número: ");
        int n3 = input.nextInt();

        // ---- a) Descobrir o maior número ----
        int maior = n1; // começamos assumindo que n1 é o maior
        if (n2 > maior) {
            maior = n2;
        }
        if (n3 > maior) {
            maior = n3;
        }

        // ---- b) Descobrir o menor número ----
        int menor = n1; // começamos assumindo que n1 é o menor
        if (n2 < menor) {
            menor = n2;
        }
        if (n3 < menor) {
            menor = n3;
        }

        // ---- c) Calcular a média aritmética ----
        double media = (n1 + n2 + n3) / 3.0; 
        // usamos 3.0 para garantir divisão com casas decimais

        // Saída dos resultados
        System.out.println("\nResultados:");
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.println("Média aritmética: " + media);

        input.close();
    }
}
