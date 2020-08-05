public class Calc {
    protected static String calc(String input) throws Exception {

        int count = 0;     //  счетчик символов без пробела и арифметического знака для проверки на посторонние символы
        for (char c : input.toCharArray()) {
            if (c >= '1' & c <= '9' || c == 'I' || c == 'V' || c == 'X' || c == 'L' || c == 'C' || c == 'D' || c == 'M')
                count++;
        }
        if (count != input.length() - 3)       //  вычитаем два порбела и арифметический знак
            throw new Exception("Вы ввели некорректную запись выражения");      //  проверка на наличие посторонних символов


        int i = 0;

        if (input.indexOf("+") != -1) {
            i = input.indexOf("+");
        } else if (input.indexOf("-") != -1) {
            i = input.indexOf("-");
        } else if (input.indexOf("/") != -1) {
            i = input.indexOf("/");
        } else if (input.indexOf("*") != -1) {
            i = input.indexOf("*");
        }

        if (input.contains("I") || input.contains("V") || input.contains("X") || input.contains("M") || input.contains("L") || input.contains("C") || input.contains("D")) {
            int a = Roman.romanToArabic(input.substring(0, i -1));
            int b = Roman.romanToArabic(input.substring(i +2));
            return Roman.arabicToRoman(Arabic.Calc(a, b, input.charAt(i)));
        } else {
            return Arabic.Calc(Integer.parseInt(input.substring(0, i - 1)), Integer.parseInt(input.substring(i + 2)), input.charAt(i)).toString();
        }

    }

}