import javax.xml.parsers.SAXParser;

public class Main {
    public static void main(String[] args) {
        System.out.println("задача1");
        ///Задача 1
        int accumulation = 15000;
        int total = 0;
        while (total < 2_459_000) {
            total = total + total / 100;
            total = total + accumulation;
            System.out.println("Месяц !" + total + "сумма накоплений равна" + accumulation + "рублей");
        }
        System.out.println("задача2 ");
        ///задача 2
        int start = 10;
        while (start > 0) {
            System.out.print(start + " ");
            start = start - 1;
        }
        System.out.println();
        for (int y = 1; y < 11; y++) {
            System.out.print(y + " ");
        }
        System.out.println();


        System.out.println("задача3");
        //задача 3
        int year = 12_000_000;
        int fertility = 17;
        int mortality = 8;
        for (int i = 1; i <= 10; i++) {
            year = year + year * 17 / 1000 - mortality * 8 / 1000;
            System.out.println("год" + i + "численность населения составляет " + year);

        }
        System.out.println("задача4");
        int sum = 15_000;
        int many = 0;
        int i = 0;
        for (i = 1; i < 12_000_000; i++) {
            sum = sum + sum * 7 / 100;
            sum = many + i / 1050;


            System.out.println("месяцы " + sum + " сумма " + i);

        }
        System.out.println(sum);
        System.out.println(i);


        System.out.println("задача 5");
        int income = 15_000;
        int month = 0;
        int y = 0;
        for (; income < 12_000_000; y++) {
            income = income + income / 100;
            income = income + month;
            if (y % 6 == 0) {
                System.out.println("месяцы " + y + " сумма " + income);
            }

        }
        System.out.println(y);
        System.out.println(income);


        System.out.println("задача6");
        int s = 15000;
        float m = 1.07f;
        int n = 0;
        while (n <= 108) {
            n++;
            s = (int) (s * m);
            if (n % 6 == 0) {
                System.out.println("месяц " + n + " на вашем счету " + s + " рублей");
            }
        }


        System.out.println("задача 7");
        int firstFriday = 5;
        for (
                int dayNumber = 5;
                dayNumber <= 31; ) {
            System.out.println("сегодня пятница " + firstFriday + " число. Необходимо подготовить отчет");
            firstFriday += 5;
            dayNumber += 5;
        }

        System.out.println("задача8");
        int presentYear = 2023;
        int pastYear = presentYear - 200;
        int futureYear = presentYear + 100;
        for (year=0 +; year <= futureYear; year += 79) {
            if (year > pastYear) {
                System.out.println(year);
            }
        }
    }
}

















































































































