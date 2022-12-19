import java.util.ArrayList;

public class PolynomialUse {
    public static void main(String[] args) {
        Polynomial p1 = new Polynomial(3,4);
        p1.printPolynomial();
        ArrayList<Integer> test= new ArrayList<>();
        test.add(3,2);
        System.out.println(test.get(3));
    }
}
