import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int counter = 0;

        for(int i = 0; i < 8; i++) {
            String line = br.readLine();

            for(int j = 0; j < 8; j++) {
                if(i%2 == 0) {
                    if(j%2 == 0) {
                        if(line.charAt(j) == 'F') {
                            counter++;
                        }
                    }
                } else {
                    if(j%2 != 0) {
                        if(line.charAt(j) == 'F') {
                            counter++;
                        }
                    }
                }
            }
        }

        System.out.println(counter);
    }
}