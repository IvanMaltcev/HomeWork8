import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Задача 1

        int[] wholeNumbers = new int[3];
        for (int i = 0; i < wholeNumbers.length; i++) {
            wholeNumbers[i] = i + 1;
        }

        double[] fractionalNumbers = {1.57, 7.654, 9.986};

        String[] numbersInWords = {"one", "two", "three", "four", "five"};

        // Задача 2

        for (int i = 0; i < wholeNumbers.length; i++) {
            if (i != wholeNumbers.length - 1) {
                System.out.print(wholeNumbers[i] + ", ");
            }
        }
        System.out.print(wholeNumbers[wholeNumbers.length - 1]);
        System.out.println();

        for (int i = 0; i < fractionalNumbers.length; i++) {
            if (i != fractionalNumbers.length - 1) {
                System.out.print(fractionalNumbers[i] + ", ");
            }
        }
        System.out.print(fractionalNumbers[fractionalNumbers.length - 1]);
        System.out.println();

        for (int i = 0; i < numbersInWords.length; i++) {
            if (i != numbersInWords.length - 1) {
                System.out.print(numbersInWords[i] + ", ");
            }
        }
        System.out.print(numbersInWords[numbersInWords.length - 1]);
        System.out.println();

        // Задача 3

        for (int i = wholeNumbers.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(wholeNumbers[i] + ", ");
            }
        }
        System.out.print(wholeNumbers[0]);
        System.out.println();

        for (int i = fractionalNumbers.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(fractionalNumbers[i] + ", ");
            }
        }
        System.out.print(fractionalNumbers[0]);
        System.out.println();

        for (int i = numbersInWords.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(numbersInWords[i] + ", ");
            }
        }
        System.out.print(numbersInWords[0]);
        System.out.println();

        // Задача 4

        for (int i = 0; i < wholeNumbers.length; i++) {
            if (wholeNumbers[i] % 2 != 0) {
                wholeNumbers[i] += 1;
            }
        }
        System.out.println(Arrays.toString(wholeNumbers));
    }
}

