public class TıpDonusumleri {

    public static void main(String[] args) {

        double doubleVeri = 12723.12;

        float doubleToFloat = (float) doubleVeri;
        System.out.println("double veri türünden float Veri Türüne Casting :"+doubleToFloat);

        long longVeri = 32654;
        int longToInt = (int) longVeri;
        System.out.println("long veri türünden int Veri Türüne Casting :"+longToInt);

        int intVeri = 4587;
        short intToShort = (short) intVeri;
        System.out.println("int veri türünden short Veri Türüne Casting :"+intToShort);

        short shortVeri = 127;
        byte shortToByte = (byte) shortVeri;
        System.out.println("short veri türünden byte Veri Türüne Casting :"+shortToByte);
    }
}
