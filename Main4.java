import java.util.Scanner;
public class Main4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int[][] data = new int[a][b];
        int count = 1;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                data[i][j] = count;
                count++;
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }
    }
}