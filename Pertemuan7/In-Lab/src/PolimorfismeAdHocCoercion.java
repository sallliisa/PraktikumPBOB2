public class PolimorfismeAdHocCoercion {
    public static void main(String[] args) throws Exception {
        // Kamus
        int valueA, valueB, valueCastback;
        double valueRealB;
        String X, Y, S, P, Q, R, T;
        Integer Z, A;
        Double D;

        // Algoritma
        valueA = 65;

        System.out.println("a) 65 sebagai int, char, & double melalui casting");
        System.out.println("Sebagai int: " + valueA);
        System.out.println("Sebagai char: " + (char) valueA);
        System.out.println("Sebagai double: " + (double) valueA);
        System.out.println();

        valueB = 120;
        valueRealB = valueB;
        valueCastback = (int) valueRealB;

        System.out.println("b) Cast int -> double -> int:");
        System.out.println("valueB: " + valueB);
        System.out.println("valueB as double: " + valueRealB);
        System.out.println("(int) valueRealB: " + valueCastback);
        System.out.println();

        X = "1234";
        Y = "5678";
        S = X + Y;
        Z = Integer.parseInt(X) + Integer.parseInt(Y);

        System.out.println("c) Penjumlahan string & integer");
        System.out.println("S: " + S);
        System.out.println("Z: " + Z);
        System.out.println();

        P = "12.34";
        Q = "56.78";
        R = P + Q;
        D = Double.parseDouble(P) + Double.parseDouble(Q);

        System.out.println("d) Penjumlahan string & double");
        System.out.println("R: " + R);
        System.out.println("D: " + D);
        System.out.println();

        A = Integer.parseInt(S);
        System.out.println("e) A: " + A);
        System.out.println();

        T = Integer.toString(A);
        System.out.println("f) T: " + T);
    }
}
