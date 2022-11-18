public class DynamicArrayUse {
    public static void main(String[] args) {
        DynamicArray D1 = new DynamicArray();
        D1.add(4);
        D1.add(3);
        D1.add(4);
        int ele=D1.get(1);
        System.out.println(ele);
        System.out.println(D1.get(4 ));

    }
}
