public class IfElseStatementTheme {
    
    public static void main(String[] args) {
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
        char capitalLetter = "Maksim".charAt(0);
        if (capitalLetter == 'M') {
            System.out.println("Твое имя начинается на букву " + capitalLetter);
        } else if (capitalLetter == 'I') {
            System.out.println("твое имя начинается на букву " + capitalLetter);
        } else {
            System.out.println("На какую букву начинается твое имя? ");
        }

        System.out.println("\n2.Поиск max и min числа");
        int num1 = 110;
        int num2 = 20;
        if (num1 > num2) {
            System.out.println("Min = " + num2 + " Max = " + num1);
        } else if (num2 > num1) {
            System.out.println("Max = " + num2 + " Min = " + num1);
        } else if (num1 == num2) {
            System.out.println("Число 1 = " + num1 + " Число 2 = " + num2 + " Числа равны");
        }

        System.out.println("\n3. Проверка числа");
        int num = 0;
        System.out.println("Исходное число : " + num);
        if (num == 0) {
            System.out.println("Число " + num + " нулевое");
        } else {
            if (num % 2 != 0) {
                System.out.println("Оно нечетное");
            } else {
                System.out.println("Оно четное");
        }
            if (num > 0) {
                System.out.println("И положительное");
            } else {
                System.out.println("И отрицательное");
            }
        }

        System.out.println("\n4.Поиск одинаковых цифр в числах");
        int nums1 = 123;
        int nums2 = 124;
        int onesNum1 = nums1 % 10;
        int tensNum1 = (nums1 / 10) % 10;
        int hundredsNum1 = nums1 / 100;
        int onesNum2 = nums2 % 10;
        int tensNum2 = (nums2 / 10) % 10;
        int hundredsNum2 = nums2 / 100;
        System.out.println("Исходные числа " + nums1 + "," + nums2);
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
        if ((onesNum1 != onesNum2) && (tensNum1 != tensNum2)
                && (hundredsNum1 != hundredsNum2)) {
            System.out.println("Равных цифр нет");
        }

        System.out.println("\n5.Определение символа по его коду");
        char symbol = '\u0057';
        boolean lowerCase = (symbol >= 'a' && symbol <= 'z');
        boolean upperCase = (symbol >= 'A' && symbol <= 'Z');
        boolean numericChar = (symbol >= '0' && symbol <= '9');
        if (lowerCase) {
            System.out.println(symbol + " - маленькая буква");
        } else if (upperCase) {
            System.out.println(symbol + " - большая буква");
        } else if (numericChar) {
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
        System.out.println(((procentHistory + procentProgramming) / 2)
                + " - средний % по предметам");

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
        int banknote100 = 10;
        int banknote10 = 5;
        int banknote1 = 50;
        int totalSum100 = 0;
        int totalSum10 = 0;
        int totalSum1 = 0;
        int totalSum = 0;
        if (amountRequired >= 100) {
            totalSum100 = amountRequired / 100;
            if (totalSum100 > banknote100) {
                totalSum100 = banknote100;
            }
            amountRequired = amountRequired - totalSum100 * 100;
        }
        if (amountRequired >= 10) {
            totalSum10 = amountRequired / 10;
            if (totalSum10 > banknote10) {
                totalSum10 = banknote10;
            }
            amountRequired = amountRequired - totalSum10 * 10;
        }
        if (amountRequired >= 1) {
            totalSum1 = amountRequired;
            if (totalSum1 > banknote1) {
                totalSum1 = banknote1;
            }
            amountRequired = amountRequired - totalSum1;
        }
        totalSum = totalSum100 * 100 + totalSum10 * 10 + totalSum1;
        if (amountRequired > 0) {
            System.out.println("Недостаточно банкнот для выдачи требуемой суммы");
        } else {
            System.out.println("Номиналы банкнот:\n" + "100 USD в количестве - " + banknote100
                    + ", 10 USD в количестве - " + banknote10
                    + ", 1 USD в количестве - " + banknote1);
            System.out.println("Требуемое их количество: " + (totalSum100 + totalSum10
                    + totalSum1));
            System.out.println("Выдаваемая сумма: " + totalSum);
        }

    }
}