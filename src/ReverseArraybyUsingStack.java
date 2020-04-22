public class ReverseArraybyUsingStack {
    public static void main(String[] args) {
        Stack list = new Stack(5);
        int[] reverseList = new int[5];
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        list.show();
        for (int x : reverseList) {x = list.pop();
            System.out.println(x);}
        list.show();
    }
}
