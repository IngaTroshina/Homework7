public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        System.out.println("Задача 1");
        int deposit = 15_000;
        int total = 0;
        int month = 0;
        while (total <= 2_459_000) {
            total = total + deposit;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int number = 1;
        while (number < 11) {
            System.out.print(number + " ");
            number++;
        }
        System.out.println();
        for (int newNumber = 10; newNumber > 0; newNumber--) {
            System.out.print(newNumber + " ");
        }
        System.out.println();
    }
    public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int fertility = 17;
        int mortality = 8;
        int year = 0;
        while (year < 10) {
            population = population + population / 1000 * (fertility - mortality);
            year++;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        int deposit = 15000;
        for (int month = 1; deposit <= 12_000_000; month++) {
            deposit = deposit + deposit * 7 / 100;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + deposit + " рублей");
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        int deposit = 15000;
        for (int month = 1; deposit <= 12_000_000; month++) {
            deposit = deposit + deposit * 7 / 100;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + deposit + " рублей");
            }
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        int deposit = 15000;
        int timeYears = 9;
        for (int month = 1; month <= 12 * timeYears; month++) {
            deposit = deposit + deposit * 7 / 100;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + deposit + " рублей");
            }
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        for (int friday = 4; friday <= 31; friday+=7) {
            System.out.println("Сегодня пятница, " + friday + " -е число. Необходимо подготовить отчет");
        }
    }
    public static void task8() {
        System.out.println("Задача 8");
        int thisYear = 2023;
        int year200YearsAgo = thisYear - 200;
        int year100YearsAfter = thisYear + 100;
        for (; year200YearsAgo < year100YearsAfter; year200YearsAgo++) {
            if (year200YearsAgo % 79 == 0) {
                System.out.println(year200YearsAgo);
            }
        }
    }
}