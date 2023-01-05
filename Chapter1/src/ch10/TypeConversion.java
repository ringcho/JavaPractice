package ch10;

public class TypeConversion {
    public static void main(String[] args) {
        double dNum = 1.2;
        float fNum = 0.9f;

        byte bNum = 125;
        int iNum = bNum;
        int iNum1 = (int)dNum;

        int iNum2 = (int)dNum + (int)fNum;
        int iNum3 = (int)(dNum + fNum);

        System.out.println(iNum);
        System.out.println(iNum1);
        System.out.println(bNum);
        System.out.println(iNum2);
        System.out.println(iNum3);
    }
}
