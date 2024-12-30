import java.util.Scanner;

public class MultiTaskProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Завдання 1: Квадрат числа
        System.out.print("Введіть ціле число: ");
        int number = scanner.nextInt();
        printSquare(number);

        // Завдання 2: Об'єм циліндра
        System.out.print("\nВведіть радіус: ");
        double radius = scanner.nextDouble();
        System.out.print("Введіть висоту: ");
        double height = scanner.nextDouble();
        double cylinderVolume = calculateCylinderVolume(radius, height);
        System.out.printf("Об'єм циліндра з радіусом %.2f і висотою %.2f дорівнює %.12f\n", radius, height, cylinderVolume);

        // Завдання 3: Сума елементів масиву
        int[] array = {10, 20, 30, 40, 50};
        System.out.println("\nМасив чисел: [10, 20, 30, 40, 50]");
        int arraySum = calculateArraySum(array);
        System.out.println("Сума всіх елементів масиву дорівнює " + arraySum);

        // Завдання 4: Рядок у зворотньому порядку
        scanner.nextLine(); // Очищення буфера
        System.out.print("\nВведіть рядок: ");
        String inputString = scanner.nextLine();
        String reversedString = reverseString(inputString);
        System.out.println("Рядок в зворотньому порядку: " + reversedString);

        // Завдання 5: Піднесення до степеня
        System.out.print("\nВведіть a: ");
        int base = scanner.nextInt();
        System.out.print("Введіть b: ");
        int exponent = scanner.nextInt();
        int powerResult = calculatePower(base, exponent);
        System.out.println("Результат " + base + "^" + exponent + " дорівнює " + powerResult);

        // Завдання 6: Повторення тексту
        System.out.print("\nВведіть ціле число n: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Очищення буфера
        System.out.print("Введіть текстовий рядок: ");
        String text = scanner.nextLine();
        repeatText(n, text);
    }

    // Метод для виведення квадрата числа
    public static void printSquare(int number) {
        System.out.println("Квадрат числа " + number + " дорівнює " + (number * number) + ".");
    }

    // Метод для обчислення об'єму циліндра
    public static double calculateCylinderVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    // Метод для обчислення суми елементів масиву
    public static int calculateArraySum(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    // Метод для обертання рядка
    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }

    // Метод для піднесення до степеня
    public static int calculatePower(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    // Метод для повторення тексту
    public static void repeatText(int n, String text) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }
}
