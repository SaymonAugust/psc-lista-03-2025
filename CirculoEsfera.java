import java.util.Scanner;

public class CirculoEsfera {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o código da operação (1-Perímetro, 2-Área, 3-Volume): ");
        int operacao = input.nextInt();

        System.out.print("Digite o raio: ");
        double raio = input.nextDouble();

        // Constante π
        final double PI = 3.141592;

        // Estrutura condicional
        if (operacao == 1) {
            double perimetro = 2 * PI * raio;
            System.out.println("Perímetro do círculo: " + perimetro);
        } 
        else if (operacao == 2) {
            double area = PI * Math.pow(raio, 2);
            System.out.println("Área do círculo: " + area);
        } 
        else if (operacao == 3) {
            double volume = (4.0 / 3.0) * PI * Math.pow(raio, 3);
            System.out.println("Volume da esfera: " + volume);
        } 
        else {
            System.out.println("Código da operação inválido!");
        }

        input.close();
    }
}
