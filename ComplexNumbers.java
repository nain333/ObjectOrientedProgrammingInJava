public class ComplexNumbers {
    int real, imaginary;
    public ComplexNumbers(int real, int imaginary){
        this.imaginary=imaginary;
        this.real=real;

    }
    public void printComplex(){
        System.out.println(this.real+"+"+this.imaginary+"i");

    }
//    getters and seters for Complex Numbers.


    public int getReal() {
        return this.real;
    }
    public int getImaginary(){
        return this.imaginary;
    }
    public void setReal(int real){
        this.real=real;


    }
    public void setImaginary(int imaginary){
        this.imaginary=imaginary;

    }
    public void add(ComplexNumbers c2){
        real = this.real +c2.real;
        imaginary=this.imaginary+c2.imaginary;

    }
    public static ComplexNumbers add(ComplexNumbers c1, ComplexNumbers c2){
        int real = c1.real+c2.real;
        int imaginary= c1.imaginary+c2.imaginary;
        ComplexNumbers c3 = new ComplexNumbers(real,imaginary);
        return c3;
    }

}
