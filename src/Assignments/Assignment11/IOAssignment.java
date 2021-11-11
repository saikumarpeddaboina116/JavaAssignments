package Assignments.Assignment11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IOAssignment {

    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(new File("/home/saikup/JavaAssignments/src/Assignments/Assignment11/inputfile.txt"));
            HashMap<Character, Integer> hm = new HashMap<>();
            while (scan.hasNext()) {
                String input = scan.nextLine();

                for (int i = 0; i < input.length(); i++) {
                    char c = input.charAt(i);
                    hm.put(c, (hm.getOrDefault(c, 0) + 1));

                }

              //  System.out.println(hm.toString());
            }
            scan.close();
            PrintWriter pw=new PrintWriter("outputfile.txt");
           for(Map.Entry<Character,Integer> iter:hm.entrySet())
           {
               String output=iter.getKey()+" : "+iter.getValue();
               pw.println(output);
           }
           pw.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
