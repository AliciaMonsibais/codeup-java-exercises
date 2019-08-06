import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

import jdk.swing.interop.SwingInterOpUtils;
import util.Input;
import java.util.HashMap;
import java.util.Map;

public class GroceryList {
    private ArrayList<String> itemName;
    private ArrayList<Integer> itemQuantity;
    private ArrayList<String> category;

    public void newGroceryList(String itemName, String itemQuantity){
        this.itemQuantity = new ArrayList<>();
        this.itemName = new ArrayList<>();
        this.category = new ArrayList<>();
    }

    public void getQuantity(){
    }

    public static String[] categories = {"Meat", "Dairy", "Produce"};

    public void addCategory(String cat) {
        this.category.add(cat);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Input input = new Input();
        boolean keepAdding = true;

        System.out.println("Would you like to create a new grocery list?");
        String createList = input.getString();
        System.out.println("Pick a category: \n");
        System.out.println(categories);



    }
}
