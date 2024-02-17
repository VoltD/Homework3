public class Main {
    public static void main(String[] args) {
        // Задача 1
        byte a1 = 1;
        short b1 = 1;
        int c1 = 1;
        long d1 = 1L;
        float e1 = 1.0f;
        double f1 = 1.0;
        System.out.println("Значение переменной " + "a1" + " с типом " + "byte" + " равно " + a1);
        System.out.println("Значение переменной " + "b1" + " с типом " + "short" + " равно " + b1);
        System.out.println("Значение переменной " + "c1" + " с типом " + "int" + " равно " + c1);
        System.out.println("Значение переменной " + "d1" + " с типом " + "long" + " равно " + d1);
        System.out.println("Значение переменной " + "e1" + " с типом " + "float" + " равно " + e1);
        System.out.println("Значение переменной " + "f1" + " с типом " + "double" + " равно " + f1);

        // Задача 2
        float a2 = 27.12f;
        long b2 = 987678965549L;
        float c2 = 2.786f;
        short d2 = 569;
        short e2 = -159;
        short f2 = 27897;

        // Задача 3
        int countOfStudentsLP = 23;
        int countOfStudentsAS = 27;
        int countOfStudentsEA = 30;
        int paper = 480;
        int x3 = paper / (countOfStudentsLP + countOfStudentsAS + countOfStudentsEA);
        System.out.println("На каждого ученика рассчитано " + x3 + " листов бумаги");

        // Задача 4
        int bottles = 16;
        // за 20 минут
        int a4 = bottles * 10;
        System.out.println("За за 20 минут машина произвела " + a4 + " штук бутылок");
        // в сутки
        int b4 = bottles * 30 * 24;
        System.out.println("В сутки машина произвела " + b4 + " штук бутылок");
        // за 3 дня (суток)
        int c4 = bottles * 30 * 24 * 3;
        System.out.println("За 3 дня машина произвела " + c4 + " штук бутылок");
        // за 1 месяц, если в месяце 30 суток
        int d4 = bottles * 30 * 24 * 30;
        System.out.println("За 1 месяц машина произвела " + d4 + " штук бутылок");

        // Задача 5
        int totalCanOfPaint = 120;
        int whitePerClass = 2;
        int brownPerClass = 4;
        int x5 = totalCanOfPaint / (whitePerClass + brownPerClass);
        int y5 = whitePerClass * x5;
        int z5 = brownPerClass * x5;
        System.out.println("В школе, где " + x5 + " классов, нужно " + y5 + " банок белой краски и " + z5 + " банок коричневой краски");

        // Задача 6
        int oneBananaWeight = 80;
        int aHundredMilk = 105;
        int aBriketPlombir = 100;
        int anEgg = 70;
        int breakfastWeight = 5 * oneBananaWeight + 2 * aHundredMilk + 2 * aBriketPlombir + 4 * anEgg;
        float breakfastWeightKilos = (float) breakfastWeight / 1000;
        System.out.println("Вес завтрака в граммах: " + breakfastWeight);
        System.out.println("Вес завтрака в килограммах: " + breakfastWeightKilos);

        // Задача 7
        int weight = 7;
        int loseMin = 250;
        int loseMax = 500;
        int minDays = weight * 1000 / loseMax;
        int maxDays = weight * 1000 / loseMin;
        int averageDays = (minDays + maxDays) / 2;
        System.out.println("Минимальное количество дней потери веса: " + minDays);
        System.out.println("Максимальное количество дней потери веса: " + maxDays);
        System.out.println("Среднее количество дней потери веса: " + averageDays);

        // Задача 8
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKrist = 76230;
        int newSalaryMasha = salaryMasha + (int)(salaryMasha * 0.1);
        int newSalaryDenis = salaryDenis + (int)(salaryDenis * 0.1);
        int newSalaryKrist = salaryKrist + (int)(salaryKrist * 0.1);
        int diffMasha = newSalaryMasha - salaryMasha;
        int diffDenis = newSalaryDenis - salaryDenis;
        int diffKrist = newSalaryKrist - salaryKrist;
        System.out.println("Маша теперь получает " + newSalaryMasha +
                " рублей. Годовой доход вырос на " + diffMasha + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDenis +
                " рублей. Годовой доход вырос на " + diffDenis + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryKrist +
                " рублей. Годовой доход вырос на " + diffKrist + " рублей");
    }
}