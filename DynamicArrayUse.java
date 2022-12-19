public class DynamicArrayUse {
    public static void main(String[] args) {
        DynamicArray d1 = new DynamicArray();
        for (int i = 1; i < 100; i++) {
            d1.add(i);
//            at every add operation im calling the size function and printing it just to check my size function.
            System.out.println(d1.size());
        }
//        to check if my get function is completely operational.
        System.out.println(d1.get(10));
//        testing get and set functions for the dynamic array d1.
        d1.set(0,8);
        System.out.println(d1.get(0));
//      the index does not exist hence printing out the -1.
        System.out.println(d1.get(99));
//      testing the removeLast().
        while(!d1.isEmpty()){

            System.out.println(d1.removeLast());
            System.out.println("size - "+ d1.size());
        }
//        testing insert function of this dynamic array
       DynamicArray d2= new DynamicArray();
        for (int i = 1; i < 100; i++) {
            d2.add(i);

        }
        System.out.println(d2.size());
        d2.add(0,999);
        System.out.println(d2.get(0));
        System.out.println(d2.size());


    }
}
class Dyn{
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        for (int i = 0; i < 6; i++) {
            da.add(i+1);


        }
        for (int i = 0; i < da.size(); i++) {
            System.out.println(da.get(i));
        }
        da.add(9,90);
        for (int i = 0; i < da.size(); i++) {
            System.out.print(da.get(i)+" ");

        }
    }

}

