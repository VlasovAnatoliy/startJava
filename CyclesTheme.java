public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");
        int sumEvenNum = 0;
        int sumOddNum = 0;
        int counter = -10;
        do {
            if (counter % 2 == 0) {
                sumEvenNum += counter;
            } else {
                sumOddNum += counter;
            }
            counter++;
        } while (counter <= 21);
        System.out.println("в промежутке [-10, 21] сумма четных чисел = " +
                sumEvenNum + ", а нечетных = " + sumOddNum);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = num1;
        int min = num1;
        if (num2 > max) {
            max = num2;
        } else if (num2 < min) {
            min = num2;
        }
        if (num3 > max) {
            max = num3;
        } else if (num3 < min) {
            min = num3;
        }
        for (int i = max - 1; i > min; i--) {
            System.out.print(" " + i);
        }

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");
        int num = 1234;
        int sum = 0;
        while(num > 0) {
            int digit = num % 10;
            num /= 10;
            sum += digit;
            System.out.println(digit);
        }
        System.out.println("Сумма цифр: " + sum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int endRange = 24;
        int expectedNumInLine = 5;
        int actualNumInLine = 0;
        for (int i = 1; i < endRange; i += 2) {
            System.out.printf("%3d", i);
            actualNumInLine++;
            if (actualNumInLine % expectedNumInLine == 0) {
                System.out.println();
                actualNumInLine = 0;
            }
        }
        if (actualNumInLine > 0) {
            int remainingZeros = expectedNumInLine - actualNumInLine;
            for (int i = 0; i < remainingZeros; i++) {
                System.out.printf("%3d", 0);
            }
        }

        System.out.println("\n5. Проверка количества двоек на четность/нечетность");
        int number = 3242592;
        int countTwos = 0;
        int copyNumber = number;
        while (copyNumber > 0) {
            int digit = copyNumber % 10;
            if (digit == 2) {
                countTwos++;
            }
            copyNumber /= 10;
        }
        if (countTwos % 2 == 0) {
            System.out.println("Число " + number + " содержит " + countTwos +
                " (четное) количество двоек");
        } else {
            System.out.println("Число " + number + " содержит " + countTwos +
                " (нечетное) количество двоек");
        }

        System.out.println("\n6. Отображение фигур в консоли");
        for (int count1 = 5; count1 < 10; count1++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print('*');
            }
            System.out.println("");
        }
        int row1 = 5;
        int count2 = row1;
        while (count2 >= 1) {
            int j = 1;
            while (j <= count2) {
                System.out.print('#');
                j++;
            }
            System.out.println("");
            count2--;
        }
        int row2 = 3;
        int count3 = 1;
        int digit = 1;
        do {
            int j = 1;
            do {
                System.out.print("$");
                j++;
            } while (j <= count3);
            System.out.println();
            if (count3 == row2) {
                digit = -1;
            }
            count3 += digit;
        } while (count3 >= 1);

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
        int num4 = 1234321;
        int reversedNum = 0;
        int temp1 = num4;
        while (temp1 != 0) {
            int remainder = temp1 % 10;
            reversedNum = reversedNum * 10 + remainder;
            temp1 /= 10;
        }
        if (num4 == reversedNum) {
            System.out.println("Число " + num4 + " является палиндромом");
        } else {
            System.out.println("Число " + num4 + " не является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        int num5 = 123456;
        int firstHalf = num5 / 1000;
        int secondHalf = num5 % 1000;
        int sum1 = 0;
        while (firstHalf != 0) {
            int digit1 = firstHalf % 10;
            sum1 += digit1;
            firstHalf /= 10;
        }
        int sum2 = 0;
        while (secondHalf != 0) {
            int digit1 = secondHalf % 10;
            sum2 += digit1;
            secondHalf /= 10;
        }
        System.out.printf("Сумма цифр %03d = %d\n", num5 / 1000, sum1);
        System.out.printf("Сумма цифр %03d = %d\n", num5 % 1000, sum2);
        boolean isHappy = sum1 == sum2;
        if (isHappy) {
            System.out.println("Число является счастливым!");
        } else {
            System.out.println("Число не является счастливым.");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        int tableSize = 9;
        System.out.print("  |");
        for (int i = 2; i <= tableSize; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println("\n" + "_".repeat(tableSize * 4));
        for (int i = 2; i <= tableSize; i++) {
            System.out.printf("%2d|", i);
            for (int j = 2; j <= tableSize; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println("\n");
        }
    }
}