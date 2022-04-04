package HW4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> hm = new HashMap<>();
        String[] words = {"Dog", "Cat", "Dog", "Bird", "Dog", "Dog", "Bird", "Mouse"};

        for (int i = 0; i < words.length; i++) {
            if (hm.containsKey(words[i]))
                hm.put(words[i], hm.get(words[i]) + 1);
            else
                hm.put(words[i], 1);
        }
        System.out.println(hm);
    }


}
