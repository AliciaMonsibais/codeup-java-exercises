package collectionsExamples;

import java.util.HashMap;

public class HashMapExamples {
    public static void main(String[] args) {
        //ssn, person
        HashMap<Integer, String> people = new HashMap<>();
        people.put(12345, "Fer");
        people.put(54321, "Alicia");
        people.put(97865, "Anthony");

        System.out.println("people.get(97865) = " + people.get(97865));
        System.out.println("people.getOrDefault(123,\"No person was found\") = " + people.getOrDefault(123,"No person was found"));

        System.out.println("people.containsKey(11111) = " + people.containsKey(11111));
        System.out.println("people.containsValue(\"Alicia\") = " + people.containsValue("Alicia"));

//        people.put(12345, "Nicole");
        people.putIfAbsent(12345, "Nicole");

        System.out.println("people.get(12345) = " + people.get(12345));

        System.out.println("people.containsValue(\"Fer\") = " + people.containsValue("Fer"));

        System.out.println(people);

    }
}
