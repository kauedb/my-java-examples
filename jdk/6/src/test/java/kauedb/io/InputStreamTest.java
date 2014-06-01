package kauedb.io;

import org.testng.annotations.Test;

import java.io.*;

import static org.testng.Assert.assertEquals;

/**
 * User: kauedb
 * Date: 1/2/12
 * Time: 11:28 AM
 */
public class InputStreamTest {


    @Test
    public void writeHello1Bytes() {
        final String hello = "hello1ç";

        final InputStream inputStream = new ByteArrayInputStream(hello.getBytes());

        final int[] readByte = new int[hello.length() + 2];
        int pos = 0;
        try {
            while ((readByte[pos++] = inputStream.read()) != -1) {
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        assertEquals(readByte[0], 104);
        assertEquals(readByte[1], 101);
        assertEquals(readByte[2], 108);
        assertEquals(readByte[3], 108);
        assertEquals(readByte[4], 111);
        assertEquals(readByte[5], 49);
        assertEquals(readByte[6], 195);
        assertEquals(readByte[7], 167);
        assertEquals(readByte[8], -1);
    }

    @Test
    public void writeHello1Characters_UTF_8() {
        final String hello = "hello1ç";

        InputStreamReader inputStream = null;
        try {
            inputStream = new InputStreamReader(new ByteArrayInputStream(hello.getBytes()), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        final int[] readByte = new int[hello.length() + 2];
        int pos = 0;
        try {
            while ((readByte[pos++] = inputStream.read()) != -1) {
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        assertEquals(readByte[0], 104);  // h
        assertEquals(readByte[1], 101);  // e
        assertEquals(readByte[2], 108);  // l
        assertEquals(readByte[3], 108);  // l
        assertEquals(readByte[4], 111);  // o
        assertEquals(readByte[5], 49);   // 1
        assertEquals(readByte[6], 231);  // ç
        assertEquals(readByte[7], -1);
    }

    @Test
    public void writeHello1Characters_ISO_8859_1() {
        final String hello = "hello1ç";

        InputStreamReader inputStream = null;
        try {
            inputStream = new InputStreamReader(new ByteArrayInputStream(hello.getBytes()), "ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        final int[] readByte = new int[hello.length() + 2];
        int pos = 0;
        try {
            while ((readByte[pos++] = inputStream.read()) != -1) {
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        assertEquals(readByte[0], 104); // h
        assertEquals(readByte[1], 101); // e
        assertEquals(readByte[2], 108); // l
        assertEquals(readByte[3], 108); // l
        assertEquals(readByte[4], 111); // o
        assertEquals(readByte[5], 49);  // 1
        assertEquals(readByte[6], 195); // ç
        assertEquals(readByte[7], 167);
        assertEquals(readByte[8], -1);
    }

    @Test
    public void write1to10Bytes() {

        final byte[] oneToTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        final InputStream inputStream = new ByteArrayInputStream(oneToTen);

        final int[] readByte = new int[oneToTen.length + 1];
        int pos = 0;
        try {
            while ((readByte[pos++] = inputStream.read()) != -1) {
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        assertEquals(readByte[0], 1);
        assertEquals(readByte[1], 2);
        assertEquals(readByte[2], 3);
        assertEquals(readByte[3], 4);
        assertEquals(readByte[4], 5);
        assertEquals(readByte[5], 6);
        assertEquals(readByte[6], 7);
        assertEquals(readByte[7], 8);
        assertEquals(readByte[8], 9);
        assertEquals(readByte[9], 10);
        assertEquals(readByte[10], -1);
    }

    @Test
    public void write1to10Characters_UTF_8() {

        final byte[] oneToTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        InputStreamReader inputStream = null;
        try {
            inputStream = new InputStreamReader(new ByteArrayInputStream(oneToTen), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        final int[] readByte = new int[oneToTen.length + 1];
        int pos = 0;
        try {
            while ((readByte[pos++] = inputStream.read()) != -1) {
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        assertEquals(readByte[0], 1);
        assertEquals(readByte[1], 2);
        assertEquals(readByte[2], 3);
        assertEquals(readByte[3], 4);
        assertEquals(readByte[4], 5);
        assertEquals(readByte[5], 6);
        assertEquals(readByte[6], 7);
        assertEquals(readByte[7], 8);
        assertEquals(readByte[8], 9);
        assertEquals(readByte[9], 10);
        assertEquals(readByte[10], -1);
    }

    @Test
    public void write1to10Characters_ISO_8859_1() {

        final byte[] oneToTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        InputStreamReader inputStream = null;
        try {
            inputStream = new InputStreamReader(new ByteArrayInputStream(oneToTen), "ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        final int[] readByte = new int[oneToTen.length + 1];
        int pos = 0;
        try {
            while ((readByte[pos++] = inputStream.read()) != -1) {
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        assertEquals(readByte[0], 1);
        assertEquals(readByte[1], 2);
        assertEquals(readByte[2], 3);
        assertEquals(readByte[3], 4);
        assertEquals(readByte[4], 5);
        assertEquals(readByte[5], 6);
        assertEquals(readByte[6], 7);
        assertEquals(readByte[7], 8);
        assertEquals(readByte[8], 9);
        assertEquals(readByte[9], 10);
        assertEquals(readByte[10], -1);
    }

}
