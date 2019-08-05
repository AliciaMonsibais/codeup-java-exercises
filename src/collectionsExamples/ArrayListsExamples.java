package collectionsExamples;
import java.util.ArrayList;

public class ArrayListsExamples {
    public static void main(String[] args) {
//        String[] names;
//        names[1];
        ArrayList<String> names = new ArrayList<>();
        //you will instead add new array methods
        names.add("Voldemort");
        names.add("Snape");
        names.add("Dumbledore");
        names.add("Harry");

        System.out.println("names.get(names.indexOf(\"Anthony\")) = " + names.get(names.indexOf("Dumbledore")));
        
        //you do not need to add the number of items in the array. Beautiful!
        System.out.println("names = " + names);
        
//        for(int i = 0; i < names.size(); i++) {
//        }
        
        //for loops evolved in foreach.
        for (String name: names) {
            System.out.println("name.toUpperCase() = " + name.toUpperCase());
        }
        System.out.println("names.size() = " + names.size());

        //"Alicias" will return false since there isn't an Alicias in the list. If it's just "Alicia", it would return true.
        System.out.println("names.contains(\"Alicias\") = " + names.contains("Alicias"));

        //checking .isEmpty() method. First should return false. after using the method of .remove/.removeAll, it should return true. You could use an exclamation point(!) for "not", but it's not recommended. You already have an operator which does that for you.
        System.out.println("names.isEmpty() = " + names.isEmpty());
        System.out.println("!names.isEmpty() = " + !names.isEmpty());
//        names.removeAll(names);
        //you can remove by object or index, but you need to know which one specifically. You don't want to rely on indexes to identify an object.
        names.remove("Harry");
        names.remove(names.indexOf("Dumbledore"));
        System.out.println("names.isEmpty() = " + names.isEmpty());
        System.out.println("names = " + names);
        
    }
}
