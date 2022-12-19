public class Polynomial {
    private DynamicArray d1 = new DynamicArray();
    private int cofficient,digree;
    public Polynomial(int digree, int cofficient){
        this.cofficient=cofficient;
        this.digree= digree;

        d1.add(digree, cofficient);

    }
     void printPolynomial(){
        for (int i = 0; i < d1.size(); i++) {
            if (d1.get(i)!=0){
                System.out.print(d1.get(i)+"x"+i+" ");
            }

        }

    }

}
