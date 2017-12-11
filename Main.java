import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int sum = 0;
        int a = scn.nextInt();
        int[] data = new int[a];
        for (int i = 0; i < a; i++) {
            data[i] = scn.nextInt();
            sum = sum + data[i];
        }
        System.out.println(sum);
        System.out.println(sum / a);
        for (int i = 0; i < a; i++) {
            if (data[i] < sum/a){
                System.out.println(data[i]);
            }
        }
    }
}
