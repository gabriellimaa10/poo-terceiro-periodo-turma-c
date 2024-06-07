import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu Console:");
            System.out.println("[1] - Calcular Preço Total");
            System.out.println("[2] - Calcular Troco");
            System.out.println("[3] - Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.print("Digite a quantidade da planta vendida: ");
                double quantidade = scanner.nextDouble();
                System.out.print("Digite o preço unitário da planta: ");
                double precoUnitario = scanner.nextDouble();
                double precoTotal = quantidade * precoUnitario;
                System.out.println("O preço total da venda é: " + precoTotal);

            } else if (opcao == 2) {
                System.out.print("Digite o valor recebido pelo cliente: ");
                double valorRecebido = scanner.nextDouble();
                System.out.print("Digite o valor total da compra: ");
                double valorTotalCompra = scanner.nextDouble();
                double troco = valorRecebido - valorTotalCompra;

                if (troco < 0) {
                    System.out.println("Erro: O valor recebido é insuficiente.");
                } else {
                    System.out.println("O troco a ser dado ao cliente é: " + troco);
                }

            } 
            else if (opcao == 3) {
                System.out.println("Saindo...");
                break;
            } 
            else {
                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }

        scanner.close();
    }
}