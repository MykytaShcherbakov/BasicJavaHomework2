public class HM2 {
    public static void main(String[] args) {
        String str = new String("I study Basic Java!");

        char penultimateChar = str.charAt(str.length() - 2);
        System.out.println("Пред-последний символ: " + penultimateChar);

        boolean containsJava = str.contains("Java");
        System.out.println("Содержит 'Java': " + containsJava);

        String javaSubstring = str.substring(str.indexOf("Java"));
        System.out.println("Вырезанная подстрока: " + javaSubstring);

        String replacedString = str.replace('а', 'о');
        System.out.println("Строка после замены 'а' на 'о': " + replacedString);

        String upperCaseString = str.toUpperCase();
        System.out.println("Строка в верхнем регистре: " + upperCaseString);

        String lowerCaseString = str.toLowerCase();
        System.out.println("Строка в нижнем регистре: " + lowerCaseString);
    }
}
