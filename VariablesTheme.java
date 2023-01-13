public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1. Вывод значений переменных на консоль.\n");
        byte numCore= 4;
        short bitOs = 64;
        int numRam = 2400;
        long modelGpu = 1050;
        float rateCore = 3.7F;
        double memoryRam = 4.00;
        boolean numPc = true;
        char sym = 'R';
        System.out.println(sym);
        System.out.println(numCore + "- Количество ядер процессора");
        System.out.println(rateCore + "- Частота процессора");
        System.out.println(bitOs + "- Тип системы");
        System.out.println(numRam + "- Частота Ram");
        System.out.println(memoryRam + "- Память Ram");
        System.out.println(modelGpu + "- Модель видео карты");
        System.out.println(numPc + "- Пк рабочий");

    System.out.println("\n2. Расчет стоимости товара со скидкой.");
        int pen = 100;
        int book = 200;
        int penBook = (pen + book) / 100 *11;
        int sumDiscount = (pen + book) - penBook;
        System.out.println(penBook + "- сумма скидки");
        System.out.println(sumDiscount + "- общая стоимость товаров со скидкой");

    System.out.println("\n3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a\n");

    System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte maxByte = 127;
        short maxShort = 32767;
        int maxInt = 2147483647;
        long maxLong = 9223372036854775807L;
        System.out.println("Первоначальное значение byte = " + maxByte);
        System.out.println("Значение после инкремента byte = " + (++maxByte));
        System.out.println("Значение после декремента byte = " + (--maxByte));
        System.out.println("Первоначальное значение short = " + maxShort);
        System.out.println("Значение после инкремента short = " + (++maxShort));
        System.out.println("Значение после декремента short = " + (--maxShort));
        System.out.println("Первоначальное значение int = " + maxInt);
        System.out.println("Значение после инкремента int = " + (++maxInt));
        System.out.println("Значение после декремента int = " + (--maxInt));
        System.out.println("Первоначальное значение long = " + maxLong);
        System.out.println("Значение после инкремента long = " + (++maxLong));
        System.out.println("Значение после декремента long = " + (--maxLong));

    System.out.println("\n5. Перестановка значений переменных.");
        int num1 = 2;
        int num2 = 5;
        System.out.println("Исходные значения переменных num1 = " + num1 + ", а num2 = " + num2);
        int tmp = num2;
        num2 = num1;
        num1 = tmp;
        System.out.println("С помощью третьей переменной:");
        System.out.println("Новые значения переменных num1 = " + num1 + ", а num2 = " + num2);
        System.out.println("С помощью арифметических операций:");
        num2 = num1 + num2 - (num2 = num1);
        System.out.println("Новые значения переменных num1 = " + num1 + ", а num2 = " + num2);
        System.out.println("С помощью побитовой операции ^:");
        num1 ^= num2;
        num2 ^= num1;
        num2 ^= num1;
        num1 ^= num2;
        System.out.println("Новые значения переменных num1 = " + num1 + ", а num2 = " + num2);

    System.out.println("\n6. Вывод символов и их кодов.");
        char hash = '#';
        int hashInt = hash;
        char ampersand = '&';
        int ampersandInt = ampersand;
        char at = '@';
        int atInt = at;
        char caret = '^';
        int caretInt = caret;
        char underscore = '_';
        int underscoreInt = underscore;
        System.out.println("Код символа:\t" + " Символ: ");
        System.out.println("\t" + hashInt + "\t\t" + hash);
        System.out.println("\t" + ampersandInt + "\t\t" + ampersand);
        System.out.println("\t" + atInt + "\t\t" + at);
        System.out.println("\t" + caretInt + "\t\t" + caret);
        System.out.println("\t" + underscoreInt + "\t\t" + underscore);

    System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char solidus = '/';
        char backslash = '\\';
        char underscore1 = '_';
        char open = '(';
        char close = ')';
        System.out.println("     "+solidus + backslash + "");
        System.out.println("    "+solidus + "  " + backslash + "");
        System.out.println("   " +solidus + underscore1 + open + " " + close + backslash + "");
        System.out.println("  "+solidus + "      " + backslash);
        System.out.println(" "+solidus + underscore1 + underscore1 + underscore1 + underscore1 
                + solidus + backslash + underscore1 + underscore1 + backslash);

    System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");
        int sum = 123;
        int hundreds = (sum / 100) % 10;
        int tens = (sum / 10) % 10;
        int one = (sum / 1) % 10;
        System.out.println("Число " + sum + " содержит:");
        System.out.println("\t" + hundreds + " сотен");
        System.out.println("\t" + tens + " десятков");
        System.out.println("\t" + one + " едениц");
        System.out.println("Сумма его цифр = " + (hundreds + tens + one));
        System.out.println("Произведение = " + (hundreds * tens * one) + "\n");

    System.out.println("9. Вывод времени\n");
    int time = 86399;
    int hour = time / 100 % 24;
    int minutes = time / 60 % 60;
    int seconds = time / 60 % 60;
    System.out.println(hour + ":" + minutes + ":" + seconds);
    }
}