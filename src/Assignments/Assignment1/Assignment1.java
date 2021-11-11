//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Assignments.Assignment1;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Pattern;

class JavaAssignment {
    JavaAssignment() {
    }

    public static void findFile(String pattern, File file) {
        File[] list = file.listFiles();
        String[] flist = file.list();
        if (list != null) {
            File[] var4 = list;
            int var5 = list.length;

            for(int var6 = 0; var6 < var5; ++var6) {
                File fil = var4[var6];
                if (fil.isDirectory()) {
                    findFile(pattern, fil);
                } else if (fil.isFile() & Pattern.matches(pattern, fil.getName())) {
                    String[] var8 = flist;
                    int var9 = flist.length;

                    for(int var10 = 0; var10 < var9; ++var10) {
                        String str = var8[var10];
                        System.out.println(str);
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String currentDirectory = System.getProperty("user.dir");
        File directory = new File("/home/saikup/JavaAssignments");
        System.out.println("The current working directory is " + directory.getName());

        while(true) {
            System.out.println("enter the pattern to exit enter quit : ");
            String pattern = scan.nextLine();
            if (pattern.equals("quit")) {
                return;
            }

            findFile(pattern, directory);
        }
    }
}
