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
            int j = array.length;

            for (int i = 0; i < array.length / 2; i++) {
                if (array[i] != array[j - 1]) {
                    isPal = false;
                    break;
                }
                j = j - 1;
            }
        }

        return isPal;
    }
}
