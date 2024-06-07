package atividade_2;

import javax.swing.JOptionPane;

public class Main {
    // ATV1
    public static void exibirMensagemSimples() {
        JOptionPane.showMessageDialog(null, "Olá, Mundo!");
    }

    // ATV2
    public static void solicitarNome() {
        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        JOptionPane.showMessageDialog(null, "Bem-vindo, " + nome + "!");
    }

    // ATV3
    public static void perguntarContinuar() {
        int resposta = JOptionPane.showConfirmDialog(null, "Você deseja continuar?", "Pergunta", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Você escolheu continuar.");
        } else {
            JOptionPane.showMessageDialog(null, "Você escolheu não continuar.");
        }
    }

    // ATV4
    public static void apresentarOpcoes() {
        String[] opcoes = {"Opção 1", "Opção 2", "Opção 3"};
        int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Escolha", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
        if (escolha == 0) {
            JOptionPane.showMessageDialog(null, "Você escolheu a Opção 1.");
        } else if (escolha == 1) {
            JOptionPane.showMessageDialog(null, "Você escolheu a Opção 2.");
        } else if (escolha == 2) {
            JOptionPane.showMessageDialog(null, "Você escolheu a Opção 3.");
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma opção escolhida.");
        }
    }

    // ATV5
    public static class CustomException extends Exception {
        public CustomException(String message) {
            super(message);
            JOptionPane.showMessageDialog(null, message, "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    // ATV6
    public static void calculadora() {
        String[] operacoes = {"Adição", "Subtração", "Multiplicação", "Divisão"};
        int escolha = JOptionPane.showOptionDialog(null, "Escolha uma operação:", "Calculadora", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, operacoes, operacoes[0]);

        if (escolha == -1) {
            return; // Usuário cancelou a operação
        }

        try {
            String num1Str = JOptionPane.showInputDialog("Digite o primeiro número:");
            String num2Str = JOptionPane.showInputDialog("Digite o segundo número:");

            double num1 = Double.parseDouble(num1Str);
            double num2 = Double.parseDouble(num2Str);
            double resultado = 0;

            switch (escolha) {
                case 0: // Adição
                    resultado = num1 + num2;
                    break;
                case 1: // Subtração
                    resultado = num1 - num2;
                    break;
                case 2: // Multiplicação
                    resultado = num1 * num2;
                    break;
                case 3: // Divisão
                    if (num2 == 0) {
                        throw new CustomException("Erro: Divisão por zero não é permitida.");
                    }
                    resultado = num1 / num2;
                    break;
            }

            JOptionPane.showMessageDialog(null, "O resultado é: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            try {
                throw new CustomException("Erro: Entrada inválida. Por favor, insira números válidos.");
            } catch (CustomException customException) {
                // Já lidado no construtor da exceção personalizada
            }
        } catch (CustomException e) {
            // Já lidado no construtor da exceção personalizada
        }
    }

    public static void main(String[] args) {
        // Chame aqui as atividades para testá-las
        exibirMensagemSimples(); // ATV1
        solicitarNome(); // ATV2
        perguntarContinuar(); // ATV3
        apresentarOpcoes(); // ATV4
        calculadora(); // ATV6
    }
}
