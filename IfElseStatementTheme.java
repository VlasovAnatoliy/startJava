public class IfElseStatementTheme {
    
    public static void main(String[] args ){
        System.out.println("1. Перевод псевдокода на язык Java\n");
        int age = 20;
        char gender = 'M';
        float height = 1.75F;
        if (age > 20) {
            System.out.println("Тебе больше 20 лет");
        } else {
            System.out.println("Тебе меньше 20 лет");
        }
        if (gender == 'M') {
            System.out.println("Мужчина"); 
        } else {
            System.out.println("Женщина");
        }
        if (height < 1.80) {
            System.out.println("Ты среднего роста");
        } else {
            System.out.println("Ты высокого роста");
        }
        char letterName = "Maksim".charAt(0);
        if (letterName == 'M') {
            System.out.println("Твое имя начинается на букву " + letterName);
        } else if (letterName == 'I') {
            System.out.println("твое имя начинается на букву " + letterName);
        } else {
            System.out.println("На какую букву начинается твое имя? ");
        }

        System.out.println("\n2.Поиск max и min числа");
        int num1 = 110;
        int num2 = 20;
        if (num1 > num2) {
            System.out.println("Min = " + num2);
            System.out.println("Max = " + num1);
        } else if (num2 > num1) {
            System.out.println("Max = " + num2);
            System.out.println("Min = " + num1);
        } else if (num1 == num2) {
            System.out.println("Число 1 = " + num1 );
            System.out.println("Число 2 = " + num2 );
            System.out.println("Числа равны");
        }

        System.out.println("\n3. Проверка числа");
        int num = 14;
        System.out.println("Исходное число : " + num);
        if (num == 0) {
            System.out.println("Число " + num + " нулевое");
        } else if (num % 2 != 0) {
            System.out.println("Оно нечетное");
        } else if (num % 2 == 0)
            System.out.println("Оно четное");
        if (num > 0) {
            System.out.println("И положительное");
        } if (num < 0) {
            System.out.println("И отрицательное");
        }

        System.out.println("\n4.Поиск одинаковых цифр в числах");
        int nums1 = 123;
        int nums2 = 321;
        int onesNum1 = nums1 % 10;
        int tensNum1 = (nums1 / 10) % 10;
        int hundredsNum1 = nums1 / 100;
        int onesNum2 = nums2 % 10;
        int tensNum2 = (nums2 / 10) % 10;
        int hundredsNum2 = nums2 / 100;
        System.out.println("Исходные числа " + nums1 + "," + nums2);
        if ((onesNum1 != onesNum2) && (tensNum1 != tensNum2) 
                && (hundredsNum1 != hundredsNum2)) {
            System.out.println("Равных цифр нет");
        }
        if (onesNum1 == onesNum2) {
            System.out.println("\tРазряд единиц" );
            System.out.println("Одинаковые цифры: " + onesNum1);
        }
        if (tensNum1 == tensNum2) {
            System.out.println("\tРазряд десяток ");
            System.out.println("Одинаковые цифры: " + tensNum1);
        }
        if (hundredsNum1 == hundredsNum2) {
            System.out.println("\tРазряд сотен");
            System.out.println("Одинаковые цифры: " + hundredsNum1);
        }

        System.out.println("\n5.Определение символа по его коду");
        char symbol = '\u0057';
        boolean smallSymbol = (symbol >= 'a' && symbol <= 'z');
<<<<<<< HEAD
        boolean bigSymbol = (symbol >= 'A' && symbol <= 'Z');
        boolean numericCharacter = (symbol >= '0' && symbol <= '9');
        if (smallSymbol) {
            System.out.println(symbol + " - маленькая буква");
        } else if (bigSymbol) {
=======
        boolean bigBymbol = (symbol >= 'A' && symbol <= 'Z');
        boolean numericCharacter = (symbol >= '0' && symbol <= '9');
        if (smallSymbol) {
            System.out.println(symbol + " - маленькая буква");
        } else if (bigBymbol) {
>>>>>>> 12e05366fd86840ab35dc7285388c1ad90181e0f
            System.out.println(symbol + " - большая буква");
        } else if (numericCharacter) {
            System.out.println(symbol + " - число");
        } else {
            System.out.println("не буква и не число");
        }

        System.out.println("\n6.Подсчет суммы вклада и начисленных банком %");
        int depositAmount = 300000;
        int interestRate = 10;
        if (depositAmount < 100000) {
            interestRate = 5;
        } else if (depositAmount > 100000 && depositAmount < 300000) {
            interestRate = 7;
        }
        int accruedInterest = (depositAmount / 100) * interestRate;
        int finalSum = depositAmount + accruedInterest;
        System.out.println("Сумма вклада : " + depositAmount);
        System.out.println("Начисленный процент : " + accruedInterest);
        System.out.println("Итоговая сумма с % : " + finalSum);

        System.out.println("\n7.Определение оценки по предметам");
        int procentHistory = 59;
        int procentProgramming = 91;
        int gradeHistory = 2;
        int gradeProgramming = 2;
        if (procentHistory > 60 && procentHistory < 73) {
            gradeHistory = 3;
        } else if (procentHistory > 73 && procentHistory < 91) {
            gradeHistory = 4;
        } else if (procentHistory >= 91) {
            gradeHistory = 5;
        }
        if (procentProgramming > 60 && procentProgramming <= 72) {
            gradeProgramming = 3;
        } else if (procentProgramming > 73 && procentProgramming <= 90) {
            gradeProgramming = 4;
        } else if (procentProgramming >= 91) {
            gradeProgramming = 5;
        }
        System.out.println(gradeHistory + " - история");
        System.out.println(gradeProgramming + " - программирование");
        System.out.println(((gradeHistory + gradeProgramming) / 2) + 
                " - средний балл оценок по предметам");
        System.out.println(((procentHistory + procentProgramming) / 2) + " - средний % по предметам");

        System.out.println("\n8.Расчет прибыли за год");
        int roomRental = 5000;
        int averageSales = 13000;
        int costPrice = 9000;
        int annualProfit = (averageSales - (roomRental + costPrice)) * 12;
        if (annualProfit > 0) {
            System.out.println("прибыль за год: +" + annualProfit);
        } else {
            System.out.println("прибыль за год: " + annualProfit);
        }

        System.out.println("\n9.Подсчет количества банкнот");
        int amountRequired = 567;
        int totalSum100 = amountRequired;
        int totalSum10 = amountRequired;
        int totalSum1 = amountRequired;
        int banknote100 = 10, banknote10 = 5, banknote1 = 50;
        int hundreds = amountRequired / 100;
        System.out.println("Номиналы банкнот :\n" + "100 USD в количестве - " + banknote100 +
                ", 10 USD в количестве - " + banknote10 + ", 1 USD в количестве - " + banknote1);
        if (hundreds >= banknote100) {
            totalSum100 = amountRequired - 100 * banknote100;
            System.out.println("Требуется 100 - " + banknote100);
        } else {
            totalSum100 = amountRequired - 100 * hundreds;
            System.out.println("Требуется 100 - " + hundreds);
        } 
        int tens = totalSum100 / 10;
         if (tens >= banknote10) {
            totalSum10 = totalSum100 - 10 * banknote10;
            System.out.println("Требуется 10 - " + banknote10);
        } else {
            totalSum10 = totalSum100 - 10 * tens;
            System.out.println("Требуется 10 - " + tens);
        } 
        int ones = totalSum10;
        if (ones >= banknote1) {
            totalSum1 = totalSum10 - banknote1;
            System.out.println("Требуется 1 - " + banknote1);
            System.out.println("Не хватило 1 - " + (ones - banknote1));
        } else {
            totalSum1 = totalSum10 - ones;
            System.out.println("Требуется 1 - " + ones);
        } System.out.println("Выдаваемая сумма - " + amountRequired);

    }
}