package SegundoBI.listas.lista1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Atv 01
        List<String> alunos = new ArrayList<>();

        alunos.add("Gonçalves");
        alunos.add("Luiz");
        alunos.add("Gabriel Paludo");
        alunos.add("Evandro");
        alunos.add("Artur Lion");

        alunos.forEach(item -> System.out.println(item.charAt(0) + " - " + item));

        // Atv 02
        HashSet<Integer> numerosInteiros = new HashSet<>();
        Integer numeroEscolhido;
        numeroEscolhido = 2;

        numerosInteiros.add(1);
        numerosInteiros.add(2);
        numerosInteiros.add(2);
        numerosInteiros.add(7);
        numerosInteiros.add(89);
        numerosInteiros.add(35);
        numerosInteiros.add(2);

        numerosInteiros.forEach(item -> System.out.println(item.equals(numeroEscolhido)));

        // Atv 03

        // Atv 04
        atv04();

        // Atv 05

    }

    public static void atv04() {
        Queue<String> seriesAssistidas = new PriorityQueue<>();

        seriesAssistidas.add("Evangellion");
        seriesAssistidas.add("Show de Truman");
        seriesAssistidas.add("Castelo Animado");
        seriesAssistidas.add("Entergalactic");
        seriesAssistidas.add("The Boondocks");

        seriesAssistidas.forEach(item -> System.out.println(item));
    }

    public static void atv05(Scanner operationOptionScan, int operationOption, Scanner subOperationOptionScan, int subOperationOption) {
        Map<String, String> pecasComputador = new HashMap<>();
        Scanner pecaAdicionadaScan = new Scanner(System.in);
        String pecaAdicionada;
        /*
         * pecasComputador.put("Processador","Intel Core i5-12600K");
         * pecasComputador.put("Placa de Vídeo","AMD Radeon RX 6800 XT");
         * pecasComputador.put("Placa Mãe","Gigabyte Aorus X570 Pro WiFi");
         * pecasComputador.put("Memória RAM","Corsair Vengeance LPX 16GB DDR5-5200 CL40");
         * pecasComputador.put("Fonte","Corsair 800W");
         */

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*  do {
            System.out.print("Voce deseja:\n   [1] - Adicionar Peças\n   [2] - Visualizar Peças\nResposta:");
            operationOption = operationOptionScan.nextInt();
            switch (operationOption) {
                case 1:
                    System.out.print(
                            "Qual peça deseja adicionar?\n   [1] - Processador\n   [2] - Placa de Vídeo\n   [3] - Placa Mãe\n   [4] - Memória RAM\n   [5] - Fonte\nResposta: ");
                    switch (subOperationOption) {
                        case 1:
                            System.out.print("Nome da peça: ");
                            pecaAdicionada = pecaAdicionadaScan.next();
                            pecasComputador.put("Processador", pecaAdicionada);
                            break;
                        case 2:
                            System.out.print("Nome da peça: ");
                            pecaAdicionada = pecaAdicionadaScan.next();
                            pecasComputador.put("Placa de Vídeo", pecaAdicionada);
                            break;

                        case 3:
                            System.out.print("Nome da peça: ");
                            pecaAdicionada = pecaAdicionadaScan.next();
                            pecasComputador.put("Placa Mãe", pecaAdicionada);
                            break;

                        case 4:
                            System.out.print("Nome da peça: ");
                            pecaAdicionada = pecaAdicionadaScan.next();
                            pecasComputador.put("Memória RAM", pecaAdicionada);
                            break;

                        case 5:
                            System.out.print("Nome da peça: ");
                            pecaAdicionada = pecaAdicionadaScan.next();
                            pecasComputador.put("Fonte", pecaAdicionada);
                            break;

                        default:
                            System.out.println("RESPOSTA ERRADA, digite novamente!!!!!!!");
                            break;
                    }
                    break;

                case 2:
                    System.out.print(
                            "Qual peça deseja visuailzar?\n   [1] - Processador\n   [2] - Placa de Vídeo\n   [3] - Placa Mãe\n   [4] - Memória RAM\n   [5] - Fonte\nResposta: ");
                        switch (subOperationOption) {
                            case 1:
                                try{
                                    System.out.println(pecasComputador.get("Processador"));
                                } catch (Exception e) {
                                    System.out.println("Não foram salvas configurações para esta peça.")
                                }
                                
                                break;
                            case 2:
                                System.out.println(pecasComputador.get("Placa de Vídeo"));
                                break;

                            case 3:
                                System.out.println(pecasComputador.get("Placa Mãe"));
                                break;

                            case 4:
                                System.out.println(pecasComputador.get("Memória RAM"));
                                break;

                            case 5:
                                System.out.println(pecasComputador.get("Fonte"));
                                break;

                         default:
                                System.out.println("RESPOSTA ERRADA, digite novamente!!!!!!!");
                                break;

                        }
                            
                    break;

                default:
                    break;
            }

        } while (operationOption != 6); */
    }
}