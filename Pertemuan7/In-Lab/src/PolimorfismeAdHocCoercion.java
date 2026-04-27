public class PolimorfismeAdHocCoercion {
    public static void main(String[] args) throws Exception {
        int valueA = 65;

        System.out.println("a) 65 sebagai int, char, & double melalui casting");
        System.out.println("Sebagai int: " + valueA);
        System.out.println("Sebagai char: " + (char) valueA);
        System.out.println("Sebagai double: " + (double) valueA);
        System.out.println();

        int valueB = 120;
        double valueRealB = valueB;
        int valueCastback = (int) valueRealB;

        System.out.println("b) Cast int -> double -> int:");
        System.out.println("valueB: " + valueB);
        System.out.println("valueB as double: " + valueRealB);
        System.out.println("(int) valueRealB: " + valueCastback);
        System.out.println();

        String X = "1234";
        String Y = "5678";
        String S = X + Y;
        Integer Z = Integer.parseInt(X) + Integer.parseInt(Y);

        System.out.println("c) Penjumlahan string & integer");
        System.out.println("S: " + S);
        System.out.println("Z: " + Z);
        System.out.println();

        String P = "12.34";
        String Q = "56.78";
        String R = P + Q;
        Double D = Double.parseDouble(P) + Double.parseDouble(Q);

        System.out.println("d) Penjumlahan string & double");
        System.out.println("R: " + R);
        System.out.println("D: " + D);
        System.out.println();

        Integer A = Integer.parseInt(S);
        System.out.println("e) A: " + A);
        System.out.println();

        String T = Integer.toString(A);
        System.out.println("f) T: " + T);
    }
}
