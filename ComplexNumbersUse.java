public class ComplexNumbersUse {
    public static void main(String[] args) {
        ComplexNumbers c1 = new ComplexNumbers(3,5);
        c1.printComplex();
        c1.setImaginary(6);
        c1.setReal(5);
        c1.printComplex();
        ComplexNumbers c2 = new ComplexNumbers(5,2);
        c2.printComplex();
        c1.add(c2);
        c1.printComplex();
        ComplexNumbers c3=ComplexNumbers.add(c1,c2);
        c3.printComplex();
        int img=c3.getImaginary();
        int real=c3.getReal();
        System.out.println(img+" "+real);

    }
}
