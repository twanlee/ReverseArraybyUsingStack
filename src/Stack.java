public class Stack {
    private int size;
    private int index=0;
    private int [] arr;
    public Stack(){};
    public Stack(int size){
        this.size = size;
        arr = new int[size];
    }
    public Boolean isFull(){
        if(index == size) return true;
        else return false;
    }
    public Boolean isEmpty(){
        if (index==0) return true;
        else return false;
    }
    public void push(int data){
        if (isFull()) throw new StackOverflowError("Array is full!");
        else {
            arr[index] = data;
            index ++;
        }
    }
    public int pop(){
        if (isEmpty()) throw new StackOverflowError("Nothing here!");
        else {
            return arr[--index];
        }
    }
    public void show(){
        for (int x: arr) System.out.println(x);
    }
}
