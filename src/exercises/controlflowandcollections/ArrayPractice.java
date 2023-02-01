package exercises.controlflowandcollections;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 5, 8};
//        int arraySize = array.length;
        for (int i = 0; i < array.length; i++) {
            if (array[i] %2 != 0)
            System.out.println(array[i]);
        }

        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = phrase.split("\\.");
        System.out.println(Arrays.toString(words));

        // the next one is the same one as the first one, skippin it

        // lol these exercises are all the same.. lets see how the hashmap one is




    }
}


