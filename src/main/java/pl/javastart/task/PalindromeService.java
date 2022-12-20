package pl.javastart.task;

public class PalindromeService {

    // nie zmieniaj sygnatury tej metody. Jest ona testowana w PalindromeServiceTest
    public boolean isPalindrome(int[] array) {

        boolean isPal = true;

        if (array == null) {
            isPal = false;
        } else if (array.length == 0) {
            isPal = false;
        } else {
            int[] revArray = new int[array.length];
            int j = array.length;

            for (int k : array) {
                revArray[j - 1] = k;
                j = j - 1;
            }

            for (int i = 0; i < array.length; i++) {
                if (array[i] != revArray[i]) {
                    isPal = false;
                    break;
                }
            }
        }

        return isPal;
    }
}
