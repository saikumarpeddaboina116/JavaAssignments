package Assignments.Assignment3;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;

public class JavaAssignment3 {
    private static long addressReachable(String address, int port, int timeout) throws IOException {
        Socket socket = new Socket();
        long start=0, end=0, totalTime=0;
        try {
            start = System.currentTimeMillis();
            socket.connect(new InetSocketAddress(address, port), timeout);


            end = System.currentTimeMillis();
            System.out.println("Connection Successfull");
        } catch (IOException exception) {
           // exception.printStackTrace();

            end = System.currentTimeMillis();
            System.out.println("Connection Unsuccessfull");

        } finally {
            socket.close();
            totalTime = end - start;
            return totalTime;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the host address : ");
        String host = scan.nextLine();
        int port = 443;

        long[] resArray = new long[10];
        try {
            for (int i = 0; i < 10; i++) {
                resArray[i] = addressReachable(host, port, 100);
            }
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
        Arrays.sort(resArray);
       for(long res:resArray)
        {
            System.out.println(res);
        }
       System.out.println("Median time for "+host +" is : "+(int)(resArray[resArray.length/2]));
    }
}
