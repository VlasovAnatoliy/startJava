public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");
        int evenNum = 0;
        int oddNum = 0;
        int count = -10;
        do {
            if (count % 2 == 0) {
                evenNum += count;
            } else {
                oddNum += count;
            }
        count++;
        } while (count <= 21);
        System.out.println("в промежутке [-10, 21] сумма четных чисел = "
                    + evenNum + ", а нечетных = " + oddNum);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int numMax = 10;
        int numMed = 5;
        int numMin = -1;
        for (int i = numMax - 1; i > numMin; i--) {
            if (numMax > numMed && numMax > numMin) {
                System.out.print(" ");
                System.out.print(i);
            }
        }

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");
        int num = 1234;
        int reverseNumber = 0;
        int sum = 0;
        while(num != 0) {
            int onesNum = num % 10;
            reverseNumber = reverseNumber * 10 + onesNum;
            num /= 10;
            sum = sum + onesNum;
        }
        System.out.println("Исходное число в обратном порядке: " + reverseNumber
                + "\n сумма цифр: " + sum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int maxNumber = 24;
        int numbersPerLine = 5;
        int zeroPadding = 0;
        for (int i = 1; i < maxNumber; i += 2) {
            System.out.printf("%2d", i);
            zeroPadding++;
            if (zeroPadding % numbersPerLine == 0) {
                System.out.println();
                zeroPadding = 0;
            } else {
                System.out.print(" ");
            }
        }
        if (zeroPadding != 0) {
            int remainingZeros = numbersPerLine - zeroPadding;
            for (int i = 0; i < remainingZeros; i++) {
                System.out.printf("%2d", 0);
                if (i != remainingZeros - 1) {
                    System.out.print(" ");
                }
            }
        }

        System.out.println("\n5. Проверка количества двоек на четность/нечетность");
        int number = 3242592;
        int counter = 0;
        int temp = number;
        while (temp > 0) {
            int lastDigit = temp % 10;
            if (lastDigit == 2) {
                counter++;
            }
            temp = temp / 10;
        }
        System.out.println("Число " + number + " содержит " + counter + " количество двоек");

        System.out.println("\n6. Отображение фигур в консоли");
        char star = '*';
        char hash= '#';
        char dollarSign = '$';
        for (int string = 5; string < 10; string++) {
            for (int counters = 1; counters <= 10; counters++) {
                System.out.print(star);
            }
            System.out.println("\n");
        }

        int heightTriangle = 5;
        int string = heightTriangle;
        while (string >= 1) {
            int column = 1;
            while (column <= string) {
                System.out.print(hash);
                column++;
            }
            System.out.println("\n");
            string--;
        }

        int height = 5;
        int line = 1;
        int column2 = 1;
        do {
            do {
                if (column2 == 1 || column2 == line || line == height) {
                    System.out.print("$");
                } else {
                    System.out.print("");
                }
                column2++;
            } while (column2 <= height);
            System.out.println("\n");
            column2 = 1;
            line++;
        } while (line <= height);

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.printf("%8s%8s%n", "Dec", "Char");
        for (int i = 33; i < 48; i++) {
            if (i % 2 != 0) {
                System.out.printf("%8d%8c%n", i, (char) i);
            }
        }
        for (int i = 98; i <= 122; i += 2) {
            System.out.printf("%8d%8c%n", i, (char) i);
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        int originalNumber = 1234321;
        int reversedNumber = 0;
        int temp1 = originalNumber;
        while (temp1 != 0) {
            int remainder = temp1 % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            temp1 /= 10;
        }
        if (originalNumber == reversedNumber) {
            System.out.println("Число " + originalNumber + " является палиндромом");
        } else {
            System.out.println("Число " + originalNumber + " не является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        int initialNumber = 123456;
        int firstHalf = initialNumber / 1000;
        int secondHalf = initialNumber % 1000;
        int sum1 = 0;
        while (firstHalf != 0) {
            int digit = firstHalf % 10;
            sum1 += digit;
            firstHalf /= 10;
        }
        int sum2 = 0;
        while (secondHalf != 0) {
            int digit = secondHalf % 10;
            sum2 += digit;
            secondHalf /= 10;
        }
        System.out.printf("Сумма цифр %03d = %d\n", initialNumber / 1000, sum1);
        System.out.printf("Сумма цифр %03d = %d\n", initialNumber % 1000, sum2);
        boolean isHappy = sum1 == sum2;
        if (isHappy) {
            System.out.println("Число является счастливым!");
        } else {
            System.out.println("Число не является счастливым.");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        int tableSize = 9;
        
        // Верхняя горизонтальная линия
        System.out.print("  |");
        for (int i = 2; i <= tableSize; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println("\n" + "_".repeat(tableSize * 4));
        
        // Таблица умножения
        for (int i = 2; i <= tableSize; i++) {
            System.out.printf("%2d|", i);
            for (int j = 2; j <= tableSize; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println("\n");
        }

    }
}