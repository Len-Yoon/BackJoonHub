import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] color = {"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
        long[] val = {0,1,2,3,4,5,6,7,8,9};
        long[] mul = {1,10,100,1000,10000,100000,1000000,10000000,100000000,1000000000};

        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String b = scanner.nextLine();
        String c = scanner.nextLine();

        long aa = 0;
        long bb = 0;
        long cc = 0;

        for(int i = 0; i < 10; i++) {
            if(color[i].equals(a)) {
                aa = val[i];
            }

            if(color[i].equals(b)) {
                bb = val[i];
            }

            if(color[i].equals(c)) {
                cc = mul[i];
            }
        }

        if(aa != 0) {
            System.out.println(((aa*10)+bb)*cc);
        } else {
            System.out.println(bb*cc);
        }

    }
}