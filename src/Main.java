public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        int[] arr = generateRandomArray();

        //Задача 1
        System.out.println("Задача 1:\n");
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + total + " рублей");
    }
    public static void task2() {
        int[] arr = generateRandomArray();

        //Задача 2
        System.out.println("\nЗадача 2:\n");
        int minCost = arr[arr.length - 1];
        int maxCost = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (minCost > arr[i]) {
                minCost = arr[i];
            }else if (maxCost < arr[i]) {
                maxCost = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minCost + " рублей. " +
                "Максимальная сумма трат за день составила " + maxCost + " рублей");
    }
    public static void task3() {
        int[] arr = generateRandomArray();

        //Задача 3
        System.out.println("\nЗадача 3:\n");
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        int averageCost = total / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageCost + " рублей");
    }
    public static void task4() {

        //Задача 4
        System.out.println("\nЗадача 4:\n");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}