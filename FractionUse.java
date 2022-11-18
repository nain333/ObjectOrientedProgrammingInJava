public class FractionUse {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(2,30);

        f1.printFraction();
        Fraction f2 =new Fraction( 5,36 );
        f2.printFraction();
        f1.add(f2);
        f1.printFraction();
        Fraction f3= Fraction.add(f1,f2);
        f3.printFraction();
        f1.printFraction();
        f2.printFraction();
        f1.multiply(f2);
        f1.printFraction();





    }
}
