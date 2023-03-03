public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();


    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 50;
        if (age >= 18) {
            System.out.println("Ты совершеннолетний");
        } else {
            System.out.println("Возраст совершеннолетия еще не наступил и нужно немного подождать");
        }

    }

    public static void task2() {
        System.out.println("Задача 2");
        int temperature = 4;
        if (temperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }


    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 70;
        if (speed < 60) {
            System.out.println("Если скорость " + speed + " то можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + speed + " то придется заплатить штраф");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 4;
        if (age >= 2 && age < 6) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в детский сад");
        }
        if (age >= 7 && age < 18) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в школу");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в университет");
        }
        if (age > 24) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить на работу");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int age = 16;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + " то ему нельзя кататься на аттракционе");
        }
        if (age > 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + " можно кататься на аттракционе в сопровождении");
        }
        if (age > 14) {
            System.out.println("Если возраст ребенка равен " + age + " то можно кататься без сопровождения взрослого");
        }

    }

    public static void task6() {
        System.out.println("Задача 6");
        int people = 103;
        if (people < 60) {
            System.out.println("Если людей " + people + " то можно ехать сидя");
        }
        if (people > 61 && people <= 102) {
            System.out.println("Если людей " + people + " то можно ехать стоя");
        } else {
            System.out.println("Мест нет");
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 8;
        int two = 24;
        int three = 56;
        if (one > two) {
            if (one > three) {
                System.out.println(one);
            } else if (three > one) {
                System.out.println(three);
            } else {
                System.out.println("Числа " + one + "и" + three + " равны");
            }
        }
        if (two > one) {
            if (two > three) {
                System.out.println(two);
            } else if (three > two) {
                System.out.println(three);
            } else {
                System.out.println("Числа " + two + "и" + three + " равны");
            }
        }
    }
}
