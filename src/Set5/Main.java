package Set5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(intArr()) + "\nArray length: " + intArr().length);
        System.out.println(intList() + "\nArrayList length: " + intList().size());

        System.out.println(deck() + "\nDeck size: " + deck().size());

        System.out.println(Arrays.toString(nameGenerator()));

        int[] nums = {40, 32, 18, 5};
        System.out.println("no 2 or 5 (array):\t" + doesntContain2or5(nums));

        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(16, 5, 9, 0, 11));
        System.out.println("no 2 or 5 (ArrayList):\t" + doesntContain2or5(nums2));

        String[] a = {"hi", "hello", "something"};
        String[] b = {"hi", "hello", "something"};

        System.out.println("Strings equal:\t" + areEqual(a, b));
        b[0] = "aaaa";
        System.out.println("Strings equal (after change):\t" + areEqual(a, b));

        ArrayList<String> a2 = new ArrayList<>(Arrays.asList("hi", "hello", "something"));
        ArrayList<String> b2 = new ArrayList<>(Arrays.asList("hi", "hello", "something"));

        System.out.println("Strings equal (ArrayList):\t" + areEqual(a2, b2));
        b2.add("thing");
        System.out.println("Strings equal (ArrayList) (after change):\t" + areEqual(a2, b2));

        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7};
        System.out.println("Shuffled array:\t" + Arrays.toString(shuffle(arr)));
    }

    // 0.

    static int[] intArr() {
        // a.

        int[] intArr = new int[1000];

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = (int)(Math.random()*10)+1;
            // System.out.println(intArr[i]);
        }

        return intArr;

    }

    static ArrayList<Integer> intList() {
        // b.

        ArrayList<Integer> intList = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            intList.add((int)(Math.random()*10)+1);
        }

        return intList;
    }

    static ArrayList<Integer> deck() {
        // 1.

        ArrayList<Integer> deck = new ArrayList<>();

        for (int i = 2; i <= 14; i++) {
            for (int j = 0; j < 4; j++) {
                deck.add(i);
            }
        }

        Collections.shuffle(deck);

        return deck;
    }

    static String[] nameGenerator() {
        // 2.

        String[] phrases = new String[100];
        String[] names = {"Behemoth", "Gobo", "Aerith", "Howardo", "Homer", "Capybara"};
        String[] adjs = {"industrious", "turtle-like", "round", "silent", "delicate", "nervous", "funky"};

        for (int i = 0; i < phrases.length; i++) {
            Random random = new Random();

            int rndName = random.nextInt(names.length);
            int rndAdj = random.nextInt(adjs.length);

            phrases[i] = names[rndName] + " the " + adjs[rndAdj];

        }

        return phrases;
    }

    // 4.

    static boolean doesntContain2or5(int[] nums) {
        // a.

        for (int num : nums) {
            if (num == 2 || num == 5) {
                return false;
            }
        }

        return true;
    }

    static boolean doesntContain2or5(ArrayList<Integer> nums) {
        // b.

        for (Integer num : nums) {
            if (num == 2 || num == 5) {
                return false;
            }
        }

        return true;
    }

    // 5.

    static boolean areEqual (String[] a, String[] b) {
        // a.

        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i]))
                return false;
        }

        return true;
    }

    static boolean areEqual (ArrayList<String> a, ArrayList<String> b) {
        // b.

        if (a.size() != b.size())
            return false;

        for (int i = 0; i < a.size(); i++) {
            if (!a.get(i).equals(b.get(i)))
                return false;
        }

        return true;
    }

    static int[] shuffle(int[] arr) {
        // bonus.

        int e = arr.length;
        int temp;
        int r;

        r = (int)(Math.random() * e--);

        temp = arr[e];
        arr[e] = arr[r];
        arr[r] = temp;

        return arr;
    }

}


