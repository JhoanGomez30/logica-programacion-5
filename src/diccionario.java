import java.util.*;

public class diccionario {
    public static void main(String[] args) {
        diccionario dc = new diccionario();
        dc.randomWords();
    }

    public void randomWords(){
        Scanner sc = new Scanner(System.in);

        Map<String, String> dictionary = new HashMap<>();

        dictionary.put("casa", "house");
        dictionary.put("gato", "cat");
        dictionary.put("perro", "dog");
        dictionary.put("libro", "book");
        dictionary.put("manzana", "apple");
        dictionary.put("sol", "sun");
        dictionary.put("luna", "moon");
        dictionary.put("estrella", "star");
        dictionary.put("agua", "water");
        dictionary.put("fuego", "fire");
        dictionary.put("tierra", "earth");
        dictionary.put("viento", "wind");
        dictionary.put("cielo", "sky");
        dictionary.put("árbol", "tree");
        dictionary.put("flor", "flower");
        dictionary.put("niño", "child");
        dictionary.put("amigo", "friend");
        dictionary.put("escuela", "school");
        dictionary.put("trabajo", "work");
        dictionary.put("familia", "family");

        Random random = new Random();
        ArrayList<String> words = new ArrayList<>(dictionary.keySet());
        ArrayList<String> wordsSpanish = new ArrayList<>();
        Map<String, String> correctWords = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            wordsSpanish.add(words.get(random.nextInt(words.size())));
        }

        for (String w : wordsSpanish){
            System.out.println("Escriba en ingles "+w+": ");
            String wordEnglish = sc.nextLine();

            if (dictionary.containsValue(wordEnglish.toLowerCase())){
                correctWords.put(w, dictionary.get(w));
            }
        }

        System.out.println("Tus respuestas correctas fueron");
        correctWords.forEach((e, v)-> System.out.println(e +" : "+ v));
    }
}
