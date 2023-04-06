import java.util.Scanner;

public class NumeroInformado {
    public static void main(String[] args) {
        // Criação de um objeto Scanner para leitura de entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira um número
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt(); // Lê um número inteiro digitado pelo usuário

        // Exibir a mensagem com o número informado
        System.out.println("O número informado foi: " + numero);

        // Fechar o objeto Scanner
        scanner.close();
    }
}




