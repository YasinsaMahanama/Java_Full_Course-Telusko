public class Main {
    public static void main(String[] args) {
        byte b = 127;
        int a = b;

        System.out.println(a);

        a = 257;
        b = (byte)a;

        System.out.println(b);

        int c = 12;
        byte k = (byte)c;

        System.out.println(k);

        float f = 5.6f;
        int x = (int)f;

        System.out.println(x);

        byte m = 10;
        byte n = 30;

        int result = m * n;

        System.out.println(result);
    }
}
