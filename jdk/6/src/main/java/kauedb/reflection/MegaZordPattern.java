package kauedb.reflection;

/**
 * User: kauedb
 * Date: 4/23/14
 * Time: 8:37 AM
 */
public class MegaZordPattern {

    private char privateCharField;
    private byte privateByteField;
    private short privateShortField;
    private int privateIntField;
    private long privateLongField;
    private float privateFloatField;
    private double privateDoubleField;
    private String privateStringField;

    private static char privateStaticCharField;
    private static byte privateStaticByteField;
    private static short privateStaticShortField;
    private static int privateStaticIntField;
    private static long privateStaticLongField;
    private static float privateStaticFloatField;
    private static double privateStaticDoubleField;
    private static String privateStaticStringField;


    private void privateVoidMethod(){}
    private static void privateStaticVoidMethod(){}
    private final void privateFinalVoidMethod(){}
    private static final void privateStaticFinalVoidMethod(){}

    private Object privateMethod(){return null;}
    private static Object privateStaticMethod(){return null;}
    private final Object privateFinalMethod(){return null;}
    private static final Object privateStaticFinalMethod(){return null;}

    private class PrivateClass{

    }

    private static class PrivateStaticClass{

    }

    public char publicCharField;
    public byte publicByteField;
    public short publicShortField;
    public int publicIntField;
    public long publicLongField;
    public float publicFloatField;
    public double publicDoubleField;
    public String publicStringField;

    public static char publicStaticCharField;
    public static byte publicStaticByteField;
    public static short publicStaticShortField;
    public static int publicStaticIntField;
    public static long publicStaticLongField;
    public static float publicStaticFloatField;
    public static double publicStaticDoubleField;
    public static String publicStaticStringField;


    public void publicVoidMethod(){}
    public static void publicStaticVoidMethod(){}
    public final void publicFinalVoidMethod(){}
    public static final void publicStaticFinalVoidMethod(){}

    public Object publicMethod(){return null;}
    public static Object publicStaticMethod(){return null;}
    public static final Object publicStaticFinalMethod(){return null;}

    public class PublicClass{

    }

    public static class PublicStaticClass{

    }

    protected char protectedCharField;
    protected byte protectedByteField;
    protected short protectedShortField;
    protected int protectedIntField;
    protected long protectedLongField;
    protected float protectedFloatField;
    protected double protectedDoubleField;
    protected String protectedStringField;

    protected static char protectedStaticCharField;
    protected static byte protectedStaticByteField;
    protected static short protectedStaticShortField;
    protected static int protectedStaticIntField;
    protected static long protectedStaticLongField;
    protected static float protectedStaticFloatField;
    protected static double protectedStaticDoubleField;
    protected static String protectedStaticStringField;


    protected void protectedVoidMethod(){}
    protected static void protectedStaticVoidMethod(){}
    protected final void protectedFinalVoidMethod(){}
    protected static final void protectedStaticFinalVoidMethod(){}

    protected Object protectedMethod(){return null;}
    protected static Object protectedStaticMethod(){return null;}
    protected final Object protectedFinalMethod(){return null;}
    protected static final Object protectedStaticFinalMethod(){return null;}


    protected class ProtectedClass{

    }

    protected static class ProtectedStaticClass{

    }


}
