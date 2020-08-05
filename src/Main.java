import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = "";
        System.out.println("Введите выражение:");
        str = sc.nextLine();
        try {
            System.out.println("Ответ: " + Calc.calc(str));
        } catch (Exception e) {
            e.printStackTrace();
        }
        sc.close();
    }

}
