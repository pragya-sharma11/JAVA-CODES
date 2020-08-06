/*
 * Created by intellij IDEA
 *Author :Pragya Sharma
 * Date :25-July-2020
 * File Name: Formatting.java */

// tell about size ,bytes, range of all datatypes.....
public class Formatting {
    public static void main(String[] args) {
        System.out.printf("%-15s %-15s %-15s %-15s\n", "Datatype", "Size in Bits"  , "Size in Bytes"  , "Range of Datatype");
        System.out.printf("%-15s %-15d %-15d %-15s\n", "byte"    ,  Byte.SIZE      , Byte.BYTES       , "from " + Byte.MIN_VALUE      + " to " + Byte.MAX_VALUE);
        System.out.printf("%-15s %-15d %-15d %-15s\n", "char"    ,  Character.SIZE , Character.BYTES  , "from " + Character.MIN_VALUE + " to " + Character.MAX_VALUE);
        System.out.printf("%-15s %-15d %-15d %-15s\n", "short"   ,  Short.SIZE     , Short.BYTES      , "from " + Short.MIN_VALUE     + " to " + Short.MAX_VALUE);
        System.out.printf("%-15s %-15d %-15d %-15s\n", "int"     ,  Integer.SIZE   , Integer.BYTES    , "from " + Integer.MIN_VALUE   + " to " + Integer.MAX_VALUE);
        System.out.printf("%-15s %-15d %-15d %-15s\n", "long"    ,  Long.SIZE      , Long.BYTES       , "from " + Long.MIN_VALUE      + " to " + Long.MAX_VALUE);
        System.out.printf("%-15s %-15d %-15d %-15s\n", "float"   ,  Float.SIZE     , Float.BYTES      , "from " + Float.MIN_VALUE     + " to " + Float.MAX_VALUE);
        System.out.printf("%-15s %-15d %-15d %-15s\n", "double"  ,  Double.SIZE    , Double.BYTES     , "from " + Double.MIN_VALUE    + " to " + Double.MAX_VALUE);
        System.out.printf("%-15s %-15s %-15s %-15s\n", "boolean" ,  "undefined"    , "undefined"      , "no range,only two values true and false");
    }
}
