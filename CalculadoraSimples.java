import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Entrada dos números
        System.out.print("Digite o primeiro número: ");
        double num1 = input.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = input.nextDouble();

        // Entrada do operador
        System.out.print("Digite a operação (+, -, *, /, ^): ");
        String operador = input.next(); // lê como texto

        double resultado;

        // Estrutura condicional para as operações
        if (operador.equals("+")) {
            resultado = num1 + num2;
            System.out.println("Resultado: " + resultado);
        }
        else if (operador.equals("-")) {
            resultado = num1 - num2;
            System.out.println("Resultado: " + resultado);
        }
        else if (operador.equals("*")) {
            resultado = num1 * num2;
            System.out.println("Resultado: " + resultado);
        }
        else if (operador.equals("/")) {
            if (num2 == 0) {
                System.out.println("Erro: divisão por zero não é permitida.");
            } else {
                resultado = num1 / num2;
                System.out.println("Resultado: " + resultado);
            }
        }
        else if (operador.equals("^")) {
            resultado = Math.pow(num1, num2); // num1 elevado a num2
            System.out.println("Resultado: " + resultado);
        }
        else {
            System.out.println("Erro: símbolo da operação inválido!");
        }

        input.close();
    }
}
