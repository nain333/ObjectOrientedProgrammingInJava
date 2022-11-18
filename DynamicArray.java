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
    public void removeLast(){

    }
    private void  doubleCapacity(){
        int temp[]  =data;
         data=new int[2*temp.length];
        for (int i = 0; i < temp.length; i++) {
            data[i]=temp[i];

        }
    }



}
