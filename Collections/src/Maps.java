import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Maps {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "a compiled, high level, object-oriented, platform independant langauge");
        languages.put("Python", "an interpreted object oriented, high level programming language");
        languages.put("Algol", "an algorithmic language");
        languages.put("BASIC", "Beginners all purpose symbolic instruction code");
        languages.put("Lisp", "Therein lies madness");
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a key: ");
        String key = s.nextLine();
        System.out.println("Please enter a value: ");
        String value = s.nextLine();

        if(languages.containsKey(key)) {
            System.out.println(key + " is already in the languages map!");
        }
        else {
            System.out.println(key + " added to languages map.");
            languages.put(key, value);
            System.out.println(languages.get(key));
        }

        for(String keys: languages.keySet()) {
            System.out.println(keys + " : " + languages.get(keys));
        }

        if(languages.remove("Algol", "an algorithmic language")) {
            System.out.println("Algol removed");
        }
        else {
            System.out.println("No Algol match");
        }

        if(languages.replace("Lisp", "Therein lies madness", "A functional programming language")) {
            System.out.println("Lisp replaced");
        }
        else {
            System.out.println("Lisp not replaced");
        }
        System.out.println("======================================");
        for(String keys: languages.keySet()) {
            System.out.println(keys + " : " + languages.get(keys) );
        }
    }
}
