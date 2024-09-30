public class HM2_1 {
    public static double add(double a, double b) {
        return a + b;
    }

    // Метод вычитания
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Метод умножения
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Метод деления
    public static double divide(double a, double b) {
        // Проверка на деление на ноль
        if (b == 0) {
            throw new IllegalArgumentException("Деление на ноль невозможно.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        double num1 = 10;
        double num2 = 5;

        // Вызов методов и вывод результатов
        System.out.println("Сложение: " + add(num1, num2));
        System.out.println("Вычитание: " + subtract(num1, num2));
        System.out.println("Умножение: " + multiply(num1, num2));
        System.out.println("Деление: " + divide(num1, num2));
    }
}
