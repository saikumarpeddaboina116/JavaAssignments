package Assignments;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Pattern;


class JavaAssignment {

    public static void findFile(String pattern, File file) {
        File[] list = file.listFiles();

        String[] flist = file.list();

       if (list != null)
            for (File fil : list) {

                if (fil.isDirectory())
                {

                    findFile(pattern, fil);
                }
                else if (fil.isFile() & Pattern.matches(pattern,fil.getName())) {
                    for(String str:flist)
                    {
                        System.out.println(str);
                    }

                }
            }

    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String currentDirectory = System.getProperty("user.dir");
        File directory = new File("/home/saikup/JavaAssignments");
        System.out.println("The current working directory is " + directory.getName());

        String pattern;
       while (true) {

            System.out.println("enter the pattern to exit enter quit : ");
            pattern = scan.nextLine();

            if (pattern.equals("quit")) {
                break;
            }
            else
                findFile(pattern,directory);
        }
    }
}