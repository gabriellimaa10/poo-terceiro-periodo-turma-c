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
        Queue<String> seriesAssistidas = new PriorityQueue<>();
        
        seriesAssistidas.add("Evangellion");
        seriesAssistidas.add("Show de Truman");
        seriesAssistidas.add("Castelo Animado");
        seriesAssistidas.add("Entergalactic");
        seriesAssistidas.add("The Boondocks");

        seriesAssistidas.forEach(item -> System.out.println(item));

        // Atv 05
        Map<Integer, String> pecasComputador = new HashMap<>();

        pecasComputador.put()
    }
}