public class Arabic {
    protected static Long Calc (int a, int b, char i){
        Long result = 0L;

        switch (i) {
            case '+':
                result = Long.valueOf(a + b);
                break;
            case '-':
                result = Long.valueOf(a - b);
                break;
            case '/':
                result = Long.valueOf(a / b);
                break;
            case '*':
                result = Long.valueOf(a * b);
        }

        return result;
    }
}
