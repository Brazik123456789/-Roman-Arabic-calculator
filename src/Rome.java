import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Rome {

    protected static HashMap<Character, Integer> Roman_numbers = new HashMap<>();

    static {
        Roman_numbers.put('I', 1);
        Roman_numbers.put('V', 5);
        Roman_numbers.put('X', 10);
        Roman_numbers.put('L', 50);
        Roman_numbers.put('C', 100);
        Roman_numbers.put('D', 500);
        Roman_numbers.put('M', 1000);
    }

    protected static Long[] toArabic(String input, int i) throws Exception {
        for (char c: input.toCharArray()) {
            if (c >= '1' & c <= '9')
                throw new Exception("Вы ввели некорректную запись выражения");
        }

        Long a = 0L;
        Long b = 0L;
        for (int j = 0; j < i-1; j++) {
            a += Roman_numbers.get(input.charAt(j));
        }
        for (int j = i + 2; j < input.length(); j++) {
            b += Roman_numbers.get(input.charAt(j));
        }

        Long[] result = {a, b};
        return result;
    }


    protected static String toRoma (Long res) throws Exception {
        if ((res <= 0) || (res > 4000)) {
            throw new Exception(res + " не входит в диапазон от 0 до 4000");
        }

        Set<Map.Entry<Character, Integer>> entrySet = Roman_numbers.entrySet();

        int i = 0;
        StringBuilder sb = new StringBuilder();

        while ((res > 0) && (i < entrySet.size())) {
            for (Map.Entry c: entrySet) {
                if ((Long) c.getValue() <= res){
                    sb.append(c.getKey());
                    res -= (Long) c.getValue();
                }else {
                    i++;
                }
            }

        }

        return sb.toString();
    }
}