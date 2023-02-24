import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PoundsToUsd {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        // Reading pounds to be converted to USD.
        int pounds = Integer.parseInt(reader.readLine());
        double courseChange = 1.36;

        System.out.printf("%.3f", pounds * courseChange);
    }
}
