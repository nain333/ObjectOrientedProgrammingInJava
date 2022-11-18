public class DynamicArray {

    private int [] data ;
    private int nextElementIndex;
    public DynamicArray(){
        data = new int[5];
        nextElementIndex=0;
    }
    public int size(){
        return nextElementIndex;
    }
    public boolean isEmpty(){
        return nextElementIndex==0;
    }
    public int get(int i){
        if (i>=nextElementIndex){
            return -1;
        }
        return data[i];
    }
    public void set(int index, int value){
        if (index>=nextElementIndex){
            return;
        }
        data[index]=value;
    }
    public void add(int value){
        if (nextElementIndex==data.length){
            doubleCapacity();

        }
        data[nextElementIndex]= value;
        nextElementIndex++;
    }
    public int removeLast(){
        if (nextElementIndex==0){
            return -1;
        }
        int temp= data[nextElementIndex];
//        data[nextElementIndex-1]=0;
        nextElementIndex--;
        return temp;

    }
    private void  doubleCapacity(){
        int temp[]  =data;
         data=new int[2*temp.length];
        for (int i = 0; i < temp.length; i++) {
            data[i]=temp[i];

        }
    }
    public void add(int index, int element){
        if (nextElementIndex==data.length){
            doubleCapacity();
//            nextElementIndex++;
        }
        int [] temp = new int[nextElementIndex];
        for (int i = 0; i < temp.length; i++) {
            temp[i]=data[i];

        }
        for (int i = index; i <nextElementIndex ; i++) {
            data[i]=temp[i];

        }
        data[index]=element;
        for (int i = index+1; i <nextElementIndex+1 ; i++) {
            data[i]=temp[i-1];


        }
        nextElementIndex++;
    }



}
