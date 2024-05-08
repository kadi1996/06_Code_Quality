package ch.zhaw.iwi.devops.demo;

public class RomanNumerals {
    public static String convert(int number) {
        String[] romanLiterals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder roman = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                roman.append(romanLiterals[i]);
                number -= values[i];
            }
        }
        return roman.toString();
    }
}

// Bewusst einen Fehler einbauen, damit dieses beim Code Coverage angezeigt wird 
/*public class RomanNumerals {
    public static String convert(int number) {
        String[] romanLiterals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder roman = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                roman.append(romanLiterals[i]);
                // Logikfehler: Inkorrekte Subtraktion um den doppelten Wert
                number -= 2 * values[i];  
            }
        }
        return roman.toString();
    }
}*/

