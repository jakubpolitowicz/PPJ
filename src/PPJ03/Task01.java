package PPJ03;

public class Task01 {

    public static void main(String[] args) {
        // boolean
        boolean najmniejszyBoolean = false;
        boolean najwiekszyBoolean = true;

        // byte
        byte najmniejszyByte = -128;
        byte najwiekszyByte = 127;

        byte najmniejszyByteBinarnie = (byte) 0b10000000;
        byte najwiekszyByteBinarnie = (byte) 0b01111111;

        byte najmniejszyByteSzesnastkowo = (byte) 0x80;
        byte najwiekszyByteSzesnastkowo = (byte) 0x7F;

        byte najmniejszyByteOsemkowo = (byte) 0200;
        byte najwiekszyByteOsemkowo = (byte) 0177;

        // short
        short najmniejszyShort = -32768;
        short najwiekszyShort = 32767;

        short najmniejszyShortBinarnie = (short) 0b1000000000000000;
        short najwiekszyShortBinarnie = (short) 0b0111111111111111;

        short najmniejszyShortSzesnastkowo = (short) 0x8000;
        short najwiekszyShortSzesnastkowo = (short) 0x7FFF;

        short najmniejszyShortOsemkowo = (short) 0100000;
        short najwiekszyShortOsemkowo = (short) 077777;

        // int
        int najmniejszyInt = -2147483648;
        int najwiekszyInt = 2147483647;

        int najmniejszyIntBinarnie = 0b10000000000000000000000000000000;
        int najwiekszyIntBinarnie = 0b01111111111111111111111111111111;

        int najmniejszyIntSzesnastkowo = 0x80000000;
        int najwiekszyIntSzesnastkowo = 0x7FFFFFFF;

        int najmniejszyIntOsemkowo = 020000000000;
        int najwiekszyIntOsemkowo = 017777777777;

        // long
        long najmniejszyLong = -9223372036854775808L;
        long najwiekszyLong = 9223372036854775807L;

        long najmniejszyLongBinarnie = 0b1000000000000000000000000000000000000000000000000000000000000000L;
        long najwiekszyLongBinarnie = 0b0111111111111111111111111111111111111111111111111111111111111111L;

        long najmniejszyLongSzesnastkowo = 0x8000000000000000L;
        long najwiekszyLongSzesnastkowo = 0x7FFFFFFFFFFFFFFFL;

        long najmniejszyLongOsemkowo = 01000000000000000000000L;
        long najwiekszyLongOsemkowo = 0777777777777777777777L;

        // float
        float najmniejszyFloat = -3.4028235e38f;
        float najwiekszyFloat = 3.4028235e38f;

        // double
        double najmniejszyDouble = -1.7976931348623157e308;
        double najwiekszyDouble = 1.7976931348623157e308;

        // char
        char najmniejszyChar = '\u0000';
        char najwiekszyChar = '\uffff';
    }
}
