public class Fraction {
//    numerator
    int numerator;
//    denominator
    int denominator;
//    constructor for fraction:
    public Fraction(int numerator,int denominator){
        if (denominator == 0) {
            denominator=1;
//            throw error.
            return;
        }
        this.numerator=numerator;
        this.denominator=denominator;
        simplify();


    }

    //    getter&settter for Fraction:
    public int getNumerator() {
    return this.numerator;
    }
    public int getDenominator(){
        return this.denominator;

    }
    public void setNumerator(int numerator){
        this.numerator=  numerator;
        simplify();
    }
    public void setDenominator(int denominator){
        if (denominator==0){
//            throw exception:
            return;
        }
        this.denominator=denominator;
        simplify();
    }
//    printFraction;
    public void printFraction(){
        simplify();

        System.out.println(numerator+"/"+denominator);


    }
    public void simplify(){
        int gcd=1;
        int smallerNumber=Math.min(numerator,denominator);
        for (int i = 2; i <= smallerNumber; i++) {
            if (numerator%i==0&&denominator%i==0){
                gcd=i;

            }



        }
        numerator=numerator/gcd;
        denominator=denominator/gcd;


    }
    public void  increament(){
        numerator=denominator*1+numerator;
        simplify();

    }
    public void add(Fraction f2){
        int lcm=lcm(this.denominator,f2.denominator);
        numerator=((lcm/this.denominator)*this.numerator)+((lcm/f2.denominator)*f2.numerator);
        denominator=lcm;



    }

    public int gcd(int denominator1, int denominator2){
        int gcd=1;
        int smallerNumber=Math.min(denominator1,denominator2);
        for (int i = 2; i <=smallerNumber ; i++) {
            if (denominator1%i==0&&denominator2%i==0){
                gcd=i;



            }


        }
        return gcd;
    }
    public int lcm(int denominator1,int denominator2){
        int gcd=gcd(denominator1,denominator2);
        int lcm=(denominator1*denominator2)/gcd;
        return lcm;
    }
     public static Fraction add(Fraction f1, Fraction f2){
        Fraction f3 = new Fraction();
        int lcm = lscm(f1.denominator,f2.denominator);
         f3.numerator=((lcm/f1.denominator)*f1.numerator)+((lcm/f2.denominator)*f2.numerator);
        f3.denominator=lcm;

        return  f3;
     }
     private Fraction(){

     }
    public static int lscm(int denominator1,int denominator2){
        int gcd=gscd(denominator1,denominator2);
        int lcm=(denominator1*denominator2)/gcd;
        return lcm;
    }
    public static int gscd(int denominator1, int denominator2){
        int gcd=1;
        int smallerNumber=Math.min(denominator1,denominator2);
        for (int i = 2; i <=smallerNumber ; i++) {
            if (denominator1%i==0&&denominator2%i==0){
                gcd=i;



            }


        }
        return gcd;
    }
    public void multiply(Fraction f2){
        numerator=this.numerator*f2.numerator;
        denominator=this.denominator*f2.denominator;
        simplify();
    }




}