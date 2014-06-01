package kauedb.io;

import org.testng.annotations.Test;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import static org.testng.Assert.assertEquals;

/**
 * User: kauedb
 * Date: 1/2/12
 * Time: 12:38 PM
 */
public class BufferedInputStreamTest {

    @Test
    public void FASTER_UTF_8_READING() {
        final String hello = "hello1ç";
        assertEquals(hello.length(), 7);
        BufferedInputStream bufferedInputStream = null;
        final int[] bytes = new int[hello.length() + 2];
        try {
            final String charsetName = "UTF-8";
            bufferedInputStream = new BufferedInputStream(new ByteArrayInputStream(hello.getBytes(charsetName)));
            int pos = 0;
            while ((bytes[pos++] = bufferedInputStream.read()) != -1) {
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedInputStream != null) {
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        assertEquals(bytes, new int[]{104, 101, 108, 108, 111, 49, 195, 167, -1});

        assertEquals(bytes[0], 104);
        assertEquals(bytes[1], 101);
        assertEquals(bytes[2], 108);
        assertEquals(bytes[3], 108);
        assertEquals(bytes[4], 111);
        assertEquals(bytes[5], 49);
        assertEquals(bytes[6], 195);
        assertEquals(bytes[7], 167);
        assertEquals(bytes[8], -1);

    }

    @Test
    public void m(){

    }

}
