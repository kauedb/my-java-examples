package kauedb.operator;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import static org.testng.Assert.assertEquals;

/**
 * User: kauedb
 * Date: 4/10/14
 * Time: 5:22 AM
 */
public class PlusPlusUnaryOperatorTest {

    @Test
    public void POSTFIX_OPERATOR(){

        int i = 10;
        int n = i++%5;

        assertEquals(i, 11);
        assertEquals(n, 1);
    }

    @Test
    public void PREFIX_OPERATOR(){

        int i = 10;
        int n = ++i%5;

        assertEquals(i, 11);
        assertEquals(n, 1);
    }

    @Test
    public void POSTFIX_OPERATOR_IN_METHOD_PARAMETER_LINE(){
        int i = 0;
        assertEquals(getParameterValueAndReturn(i++), 0);
    }

    @Test
    public void PREFIX_OPERATOR_IN_METHOD_PARAMETER_LINE(){
        int i = 0;
        assertEquals(getParameterValueAndReturn(++i), 1);
    }

    private int getParameterValueAndReturn(int i){
        return i;
    }


}
