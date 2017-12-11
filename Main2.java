import java.util.Scanner;
public class Main2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int data[] = new int[n];
        for(int i = 0 ;i<n ;i++){
            data[i]=scn.nextInt();
        }
        for(int i = 0 ; i<n ; i++){
            for(int y= i+1 ; y<n ; y++) {
                if (data[y] < data[i]) {
                    int val = data[i];
                    data[i] = data[y];
                    data[y] = val;
                }
            } System.out.print(data[i]+"\t");}
    }
    }