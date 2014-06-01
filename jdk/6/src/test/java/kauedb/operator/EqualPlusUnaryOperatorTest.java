package kauedb.operator;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * User: kauedb
 * Date: 4/10/14
 * Time: 8:37 AM
 */
public class EqualPlusUnaryOperatorTest {


    @Test
    public void ASSIGN_PLUS(){

        int i = 11;
        int n =+ i %5;

        assertEquals(n, 1);
    }

    @Test
    public void PLUS_ASSIGN_ON_METHOD_PARAMETER(){
        int i = 0;
        assertEquals(getMethodParameterValue(i += 1), 1);
    }

    @Test
    public void ASSIGN_PLUS_ON_METHOD_PARAMETER(){
        int i = 0;
        assertEquals(getMethodParameterValue(i =+ 1), 1);
    }

    private int getMethodParameterValue(int i){
        return i;
    }

}
