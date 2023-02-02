import java.lang.CharSequence;

public class Ascii {

    public static void main(String[] args) {
        AsciiCharSequence seq = new AsciiCharSequence(new byte[] {1,2,3,4,5,6,7});
        System.out.println(seq.length());
    }

}

class AsciiCharSequence implements java.lang.CharSequence {
    //обявим массив байт
    byte[] bytes;

    @Override
    public int length() {
        int i = 0;
        for (byte b: bytes) {
            i++;
        }
        return i;
    }

    @Override
    public char charAt(int index) {
        return 0;
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }

    @Override
    public String toString() {

        return null;
    }

    //конструктор принимает массив байт
    AsciiCharSequence(byte[] bytes) {
        this.bytes = bytes;
    }

}
