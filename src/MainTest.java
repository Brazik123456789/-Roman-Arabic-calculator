import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(Parameterized.class)
class CalcTest {
    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {"785", "943 - 158"},
                {"1085", "500 + 585"},
                {"1003", "5015 / 5"},
                {"6480", "648 * 10"},
                {"XXX", "L - XX"},
                {"XC", "XV + L"},
                {"V", "M / CC"},
                {"D", "V * C"}
        });
    }

    private String output, input;

    public CalcTest(String a, String b){
        this.input = b;
        this.output = a;
    }

    private Calc calc;

    @Before
    void startTet(){
        calc = new Calc();
    }

    @Test
    void test() {
        try {
            assertEquals(output, calc.calc(input));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}