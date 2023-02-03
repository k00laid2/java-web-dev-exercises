package org.launchcode.java.studios.studios.countingcharacters;

import org.launchcode.java.studios.studios.areaofcircle.Circle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {

    public static <string> void main(String[] args) {

//        String phrase = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        HashMap<String, Integer> foundCharacters = new HashMap<String, Integer>();

        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Enter your own string here: ");
        String userString = input.nextLine();
        char[] splitUserString = userString.toCharArray();
        input.close();

        for (char c : splitUserString) {
            if (foundCharacters.containsKey(Character.toString(c))) {
                // if the hashmap contains 'A' then i just increase the value of the
                // <a, #>. key-value pair, by 1. updating the key-value pair
                // to <a, #>
                foundCharacters.put(Character.toString(c), foundCharacters.get(Character.toString(c)) + 1);
//                map.put("count", map.get("count") + 1);
            } else {
                // if the hashmap does not contain key value pair with the key: "A" then
                // add one key-value pair into the hashmap with the key "A"
                // and set the value of that key, to 1
                foundCharacters.put(Character.toString(c), 1);
            }
        }
        System.out.println(foundCharacters);
    }
}

