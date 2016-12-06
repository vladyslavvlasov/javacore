package com.vladyslavvlasov.app.homework.lesson19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Murcielago on 05.12.2016.
 */
public class NameCatalogue {

    public static Map catalogue = new HashMap();

    public static Map fillMap(String key, ArrayList<String> values) {
        catalogue.put(key, values);
        return catalogue;
    }

    public static Map createNewCat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your catalogue doesn't have this category. Please create a new one. Please type in a name for category");
        String catNew = scanner.nextLine();
        ArrayList<String> values = new ArrayList<>();
        System.out.println("Please go on entering values for this category. Type in \"ready\" when you are ready");
        do {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("ready")) {
                NameCatalogue.fillMap(catNew, values);
                break;
            }
            values.add(input);
        }
        while (true);
        System.out.println("These are your values for key " + catNew + ": " + NameCatalogue.catalogue.get(catNew));
        return catalogue;
    }

    public static Map updateCat(String key) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> values = new ArrayList<String>();
        System.out.println("Please go on entering values for this category. Type in \"ready\" when you are ready");
        do {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("ready")) {
                NameCatalogue.fillMap(key, values);
                break;
            }
            values.add(input);
        }
        while (true);
        System.out.println("These are your values for key " + key + ": " + NameCatalogue.catalogue.get(key));
        return catalogue;
    }

    public static Map changeKey(String oldKeyName) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a new name for your key:");
        String newKeyName = scanner.nextLine();
        catalogue.put(newKeyName, catalogue.get(oldKeyName));
        catalogue.remove(oldKeyName);
        System.out.println("Your changed key-values pair is " + catalogue.toString());
        return catalogue;
    }
}

