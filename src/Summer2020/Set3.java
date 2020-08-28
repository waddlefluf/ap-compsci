package Summer2020;

public class Set3 {
    public static void main(String[] args) {
        System.out.println(max(4, 16, 128));
        System.out.println(average(4, 3, 2, 8));
        displayNTimes("hello", 3);
        System.out.println(getRepeatedMsg("test", 4));
        System.out.println(max(0, 204, 32, 17));
        System.out.println(countFactors(18));
        System.out.println(isPrime(67));
        System.out.println(findPrimeLargerThan(9999));
        System.out.println(weaveStrings("A", "b"));
        System.out.println(sameLastLetter("fun", "bean"));
        System.out.println(doubleDisplay("hello"));
        System.out.println(insert("hi hello", "."));
        System.out.println(countLetter('s', "mississippi"));
        System.out.println(weave2("....", "''''"));

        /*
        for (int n = 0; n < 10000; n++) {
            if (isPrime(n)) {
                System.out.println(n + " is prime");
            }
        }
        */ // loop tester for isPrime
    }

    // 1.
    static int max(int num1, int num2, int num3) {
        return Math.max(num1, (Math.max(num2, num3)));
    }

    static double average(int num1, int num2, int num3, int num4) {
        return (num1 + num2 + num3 + num4) / 4.0;
    }

    static void displayNTimes(String word, int count) {
        String str = "";
        for (int i = 0; i < count; i++) {
            str += word;
        }

        System.out.println(str);
    }

    static String getRepeatedMsg(String word, int count) {
        String msg = "";

        for (int i = 0; i < count; i++) {
            msg += word;
        }

        return msg;
    }

    // 2.
    static int max(int num1, int num2, int num3, int num4) {
        return Math.max(max(num1, num2, num3), num4);
    }

    static int countFactors(int num) {
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        return count;
    }

    static boolean isPrime(int num) {
        return countFactors(num) == 2;
    }

    static int findPrimeLargerThan(int num) {
        do {
            num++;
        } while (countFactors(num) != 2);

        return num;
    }

    // 3. - Strings

    static String weaveStrings(String str1, String str2) {
        String str = "";
        for (int i = 0; i < 2; i++) {
            str += str2;
            str += str1;
        }
        // return str2 + str1 + str2 + str1; /*
        //                                    this is shorter and also works,
        //                                    but i think the other method is
        //                                    better for easily changing the method
        //                                   */

        return str;
    }

    static boolean sameLastLetter(String str1, String str2) {
        if (str1.length() > 0 && str2.length() > 0)
            return (str1.substring(str1.length() - 1).equalsIgnoreCase(str2.substring(str2.length() - 1)));
        else
            return false;
    }

    static String doubleDisplay(String str) {
        String strDouble = "";

        for (int i = 0; i < str.length(); i++) {
            strDouble += str.substring(i, i + 1) + str.substring(i, i + 1);
        }

        return strDouble;
    }

    static String insert(String str, String btwn) {
        String strInsert = "";

        for (int i = 0; i < str.length(); i++) {
            strInsert += str.substring(i, i + 1);
            if (i < str.length()-1) {
                strInsert += btwn;
            }
        }

        return strInsert;
    }

    static int countLetter(char character, String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == character) {
                count++;
            }
        }

        return count;
    }

    static String weave2(String str1, String str2) {
        String combinedStr = "";
        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                combinedStr += str1.substring(i, i+1) + str2.substring(i, i+1);
            }
        }
        return combinedStr;
    }

}
