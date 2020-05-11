package Bhavya.company;

public class Main {

    public static void main(String[] args) {
        int myValue = 1000000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value: " + myMinIntValue);
        System.out.println("Integer Maximum Value: " + myMaxIntValue);
        System.out.println("Integer Maximum value busted: " + (myMaxIntValue +1 ));
        System.out.println("Integer Minimum value busted: " + (myMinIntValue -1 ));

        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value: " + myMinByteValue);
        System.out.println("Byte Maximum Value: " + myMaxByteValue);

        short myMaxShortValue = Short.MAX_VALUE;
        short myMinShortValue = Short.MIN_VALUE;
        System.out.println("Short Minimum Value: " + myMinShortValue);
        System.out.println("Short Maximum Value: " + myMaxShortValue);

        long myLongValue = 100;
        long myMaxLongValue = Long.MAX_VALUE;
        long myMinLongValue = Long.MIN_VALUE;
        System.out.println("Long Minimum Value: " + myMinLongValue);
        System.out.println("Long Maximum Value: " + myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_647_578L;
        System.out.println("Big Long Literal Value: "+bigLongLiteralValue);

        short bigShortLiteralValue =32767;

        int myTotal = (myMinIntValue/2);

        byte myNewByteValue = (byte)(myMinByteValue*2);//stackoverflow
        System.out.println(myNewByteValue);

        byte myNewByteValue2 = (byte)(myMinByteValue/2);
        short myNewShortValue = (short) (myMinShortValue/2);
        System.out.println(myNewByteValue);


        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long longVlaue = 50000L + 1000L * (byteValue + shortValue + intValue);
        System.out.println(longVlaue);


        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

        System.out.println("Float Minimum Value: " + myMinFloatValue);
        System.out.println("Float Maximum Value: " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.println("Double Minimum Value: " + myMinDoubleValue);
        System.out.println("Double Maximum Value: " + myMaxDoubleValue);

        
    }
}
