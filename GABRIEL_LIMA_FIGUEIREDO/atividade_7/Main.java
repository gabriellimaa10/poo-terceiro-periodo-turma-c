package atividade_7;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Ativade 1 da lista7
        System.out.println("------ATV1------");
        ArrayList<String> colleagues = new ArrayList<>();
        colleagues.add("Gabriel");
        colleagues.add("Sandro");
        colleagues.add("Evandro");
        colleagues.add("Paulinho");
        colleagues.add("Nanda");
        
        String myName = "você se chama";
        for (String colleague : colleagues) {
            System.out.println(myName + " - " + colleague);
        }

        // Atividade 2 da lista7
        System.out.println(" ");
        System.out.println("--------ATV2-------");
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2); 
        numbers.add(4);
        numbers.add(5);

        int specificNumber = 2;
        boolean containsNumber = numbers.contains(specificNumber);
        System.out.println("O conjunto contém o número " + specificNumber + ": " + containsNumber);

        // Atividade 3 da lista7
        System.out.println(" ");
        System.out.println("------ATV3------");
        ArrayList<String> games = new ArrayList<>(Arrays.asList("Game1", "Game2", "Game3", "Game1", "Game4", "Game2"));
        HashSet<String> uniqueGames = new HashSet<>(games);
        List<String> uniqueGamesList = new ArrayList<>(uniqueGames);
        System.out.println("Lista de jogos sem duplicatas: " + uniqueGamesList);

        // Atividade 4 da lista7
        System.out.println(" ");
        System.out.println("------ATV4------");
        PriorityQueue<String> animes = new PriorityQueue<>();
        animes.add("Naruto");
        animes.add("One Piece");
        animes.add("Attack on Titan");
        animes.add("My Hero Academia");
        animes.add("Demon Slayer");

        List<String> sortedAnimes = new ArrayList<>();
        while (!animes.isEmpty()) {
            sortedAnimes.add(animes.poll());
        }
        System.out.println("Animes em ordem alfabética: " + sortedAnimes);

        // Atividade 5 da lista7
        System.out.println(" ");
        System.out.println("-------ATV5------");
        HashMap<String, String> hardwareSpecs = new HashMap<>();
        hardwareSpecs.put("Processador", "i5 7500U");
        hardwareSpecs.put("Memória RAM", "16GB DDR4");
        hardwareSpecs.put("Placa de Vídeo", "NVIDIA GTX 1050 Ti");
        hardwareSpecs.put("Armazenamento", "512GB SSD");
        hardwareSpecs.put("Placa Mãe", "ASUS H110M");

        for (Map.Entry<String, String> entry : hardwareSpecs.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

