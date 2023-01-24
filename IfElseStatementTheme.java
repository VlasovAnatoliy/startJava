public class IfElseStatementTheme {
    
    public static void main(String[] args ){
        System.out.println("1. Перевод псевдокода на язык Java\n");
        int age = 20;
        char gender = 11;
        float height = 1.75F;
        if (age > 20) {
            System.out.println("Тебе больше 20 лет");
        } else {
            System.out.println("Тебе меньше 20 лет");
        }
        if (gender == 11) {
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
        int one = 10;
        int two = 20;
        if (one < two) {
            System.out.println("Min = " + one);
        } 
        if (two > one) {
            System.out.println("Max = " + two);
        }
        if (one == two) {
            System.out.println("Числа равны");
        } else {
            System.out.println("Числа не равны");
        }

        System.out.println("\n3. Проверка числа");
        int num = 14;
        if (num == 0) {
            System.out.println("Число " + num + " нулевое");
        } else if (num % 2 !=0) {
            System.out.println("Число " + num + " нечетное");
        } else if (num % 2 ==0)
            System.out.println("Число " + num + " четное");
        if (num > 0) {
            System.out.println("Число " + num + " положительное");
        } if (num <0) {
            System.out.println("Число " + num + " отрицательное");
        }

        System.out.println("\n4.Поиск одинаковых цифр в числах");
        int num1 = 123;
        int num2 = 321;
        int oneNum1 = num1 % 10;
        int tensNum1 = (num1 /10) % 10;
        int hundredNum1 = num1 / 100;
        int oneNum2 = num2 % 10;
        int tensNum2 = (num2 /10) % 10;
        int hundredNum2 = num2 / 100;
        System.out.println("Исходные числа " + num1 + "," + num2);
        if (oneNum1 == oneNum2) {
            System.out.println("Одинаковые цифры: " + oneNum1 + "," + oneNum2);
            System.out.println("Разряд единиц" );
        } if (tensNum1 == tensNum2) {
            System.out.println("Одинаковые цифры: " + tensNum1 + "," + tensNum2);
            System.out.println("Разряд десяток ");
        } if (hundredNum1 == hundredNum2) {
            System.out.println("Одинаковые цифры: " + hundredNum1 + "," + hundredNum2);
            System.out.println("Разряд сотен");
        } else if ((oneNum1 != oneNum2) && (tensNum1 != tensNum2) && (hundredNum1 != hundredNum2)) {
            System.out.println("Равных цифр нет");
        }

        System.out.println("\n5.Определение символа по его коду");
        char symbol = '\u0057';
        boolean symbol1 = (symbol >= 'a' && symbol <= 'z');
        boolean symbol2 = (symbol >= 'A' && symbol <= 'Z');
        boolean symbol3 = (symbol >= '\u0030' && symbol <= '\u0039');
        if (symbol1) {
            System.out.println(symbol + " - маленькая буква");
        } else if (symbol2) {
            System.out.println(symbol + " - большая буква");
        } else if (symbol3) {
            System.out.println(symbol + " - число");
        } else {
            System.out.println("не буква и не число");
        }

        System.out.println("\n6.Подсчет суммы вклада и начисленных банком %");
        int depositAmount = 300000;
        int interestRate = 5;
        int accruedInterest = (depositAmount / 100) * interestRate;
        System.out.println("Сумма вклада - " + depositAmount);
        if (depositAmount < 100000) {
            System.out.println("Начисленный процент : " + accruedInterest);
            System.out.println("Итоговая сумму с % : " + (depositAmount + accruedInterest));
        } else if (depositAmount >= 100000 && depositAmount <= 300000) {
            System.out.println("Начисленный процент : " + ((depositAmount / 100) * 7));
            System.out.println("Итоговая сумму с % : " + (depositAmount + ((depositAmount / 100) *
             7)));
        } else if (depositAmount > 300000) {
            System.out.println("Начисленный процент : " + ((depositAmount / 100) * 10));
            System.out.println("Итоговая сумму с % : " + (depositAmount + ((depositAmount / 100) *
             10)));
        }

        System.out.println("\n7.Определение оценки по предметам");
        int procHistory = 59;
        int procProgramming = 91;
        int ocenkaHistory = 0;
        int ocenkaProgramming = 0;
        if (procHistory <= 60) {
            ocenkaHistory = 2;
        } else if (procHistory > 60 && procHistory < 73) {
            ocenkaHistory = 3;
        } else if (procHistory > 73 && procHistory < 91) {
            ocenkaHistory = 4;
        } else if (procHistory >= 91) {
            ocenkaHistory = 5;
        }
        if (procProgramming <= 60) {
            ocenkaProgramming = 2;
        } else if (procProgramming > 60 && procProgramming <= 72) {
            ocenkaProgramming = 3;
        } else if (procProgramming > 73 && procProgramming <= 90) {
            ocenkaProgramming = 4;
        } else if (procProgramming >= 91) {
            ocenkaProgramming = 5;
        }
        System.out.println(ocenkaHistory + " - история");
        System.out.println(ocenkaProgramming + " - программирование");
        System.out.println(((ocenkaHistory + ocenkaProgramming) / 2) + 
            " - средний балл оценок по предметам");
        System.out.println(((procHistory + procProgramming) / 2) + " - средний % по предметам");

        System.out.println("\n8.Расчет прибыли за год");
        int roomRental = 5000;
        int averageSales = 13000;
        int costPrice = 9000;
        int annualProfit = averageSales - (roomRental + costPrice);
        if (annualProfit >0) {
            System.out.println("прибыль за год: +" + annualProfit);
        } else if (annualProfit <0) {
            System.out.println("прибыль за год: " + annualProfit);
        }

        System.out.println("\n9.Подсчет количества банкнот");
        int amountRequired = 567;
        int totalSum100 = amountRequired;
        int totalSum10 = amountRequired;
        int totalSum1 = amountRequired;
        int banknote100 = 10, banknote10 = 5, banknote1 = 50;
        int hundreds = (amountRequired / 100);
        if (hundreds >= banknote100) {
            totalSum100 = amountRequired - 100 * banknote100;
            System.out.println("Сотен - " + banknote100);
            System.out.println("Не хватило сотен - " + (hundreds - banknote100));
        } else {
            totalSum100 = amountRequired - 100 * hundreds;
            System.out.println("Сотен - " + hundreds);
        } 
        int tens = totalSum100 / 10;
         if (tens >= banknote10) {
            totalSum10 = totalSum100 - 10 * banknote10;
            System.out.println("Десяток - " + banknote10);
            System.out.println("Не хватило десяток - " + (tens - banknote10));
        } else {
            totalSum10 = totalSum100 - 10 * tens;
            System.out.println("Десяток - " + tens);
        } 
        int ones = totalSum10;
        if (ones >= banknote1) {
            totalSum1 = totalSum10 - banknote1;
            System.out.println("Единиц - " + banknote1);
            System.out.println("Не хватило единиц - " + (ones - banknote1));
        } else {
            totalSum1 = totalSum10 - ones;
            System.out.println("Единиц - " + ones);
        }

    }
}