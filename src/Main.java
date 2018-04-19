public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList();
        for (int i = 0 ; i < 10 ;i++){
            arr.addLast(i);
        }
        System.out.print(arr);
        arr.add(3,50);
        System.out.print(arr);
        arr.addFirst(-90);
        System.out.print(arr);
        arr.addLast(100);
        System.out.print(arr);
        arr.remove(4);
        arr.removeFirst();
        System.out.print(arr);
        arr.removeLast();
        arr.removeLast();
        System.out.print(arr);
    }
}
