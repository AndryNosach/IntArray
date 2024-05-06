
public class Main {
    public static void main(String[] args) {
        IntArray array = new IntArray(new int[]{23, 223, 10, -50, 125, 222, 50, 34, 1, -56, -100, -33, 1024, 11, 10, 88, 19, 454, 10});

        for (int i =0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
    }
}