package kauedb.reflection;

import org.testng.annotations.Test;

import java.lang.reflect.Field;

/**
 * User: kauedb
 * Date: 4/26/14
 * Time: 10:07 AM
 */
public class ReflectionTest {


    @Test
    public void readFields() throws InterruptedException {
        MegaZordPattern megaZordPattern = new MegaZordPattern();

        final Class<? extends MegaZordPattern> aClass = megaZordPattern.getClass();

        final Field[] declaredFields = aClass.getDeclaredFields();

        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }

        System.out.println("###################################################################################################");

        final Field[] fields = aClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        System.out.println("###################################################################################################");

        final Class<?>[] declaredClasses = aClass.getDeclaredClasses();
        for (Class<?> declaredClass : declaredClasses) {
            System.out.println(declaredClass);
        }


        Thread.sleep(1000L);

    }




}
