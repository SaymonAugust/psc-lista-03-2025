import java.util.Scanner;

public class RileyEmocoes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int alegria = 0;
        int tristeza = 0;

        // -------------------------------
        // 1. Novas amizades
        System.out.print("Quantas novas amizades Riley fez na cidade? ");
        int amizades = entrada.nextInt();

        if (amizades > 0) {
            alegria += amizades * 10; // 10 pontos por amizade
        } else {
            tristeza += 30; // caso não tenha feito nenhuma amizade
        }

        // -------------------------------
        // 2. Notas das provas
        System.out.print("Digite a nota da prova A1 (0 a 10): ");
        double a1 = entrada.nextDouble();

        System.out.print("Digite a nota da prova A2 (0 a 10): ");
        double a2 = entrada.nextDouble();

        System.out.print("Digite a nota da prova A3 (0 a 10): ");
        double a3 = entrada.nextDouble();

        double media = (a1 + a2 + a3) / 3;

        if (media >= 7) {
            alegria += 50;
        } else {
            tristeza += 50;
        }

        // -------------------------------
        // 3. Algoritmos resolvidos
        System.out.print("Quantos dos 10 algoritmos Riley conseguiu resolver? ");
        int feitos = entrada.nextInt();

        int naoFeitos = 10 - feitos;

        alegria += feitos * 10;
        tristeza += naoFeitos * 10;

        // -------------------------------
        // Comparando emoções
        System.out.println("\n--- Resultado Final ---");
        System.out.println("Alegria: " + alegria + " pontos");
        System.out.println("Tristeza: " + tristeza + " pontos");

        if (alegria > tristeza) {
            System.out.println("A mudança para a nova cidade foi uma experiência incrível para a Riley.");
        } else if (tristeza > alegria) {
            System.out.println("A mudança para a nova cidade foi uma experiência desagradável para a Riley.");
        } else {
            System.out.println("A mudança trouxe sentimentos equilibrados para a Riley.");
        }

        entrada.close();
    }
}
