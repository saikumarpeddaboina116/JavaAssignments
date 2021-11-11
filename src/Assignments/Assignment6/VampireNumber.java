package Assignments.Assignment6;
import java.util.*;
public class VampireNumber {



      public  static boolean checkVampireNumber(int num){

            int vlen = String.valueOf(num).length();
            if(vlen%2!=0 || num<10) return false;
            int flen = vlen/2;


            for(int i = (int) Math.pow(10, flen-1); i<Math.pow(10, flen); i++){
                if(num%i != 0) continue;

                int num1 = i;
                int num2 = num/i;

                if(num1%10 == 0 && num2%10 == 0) continue;

                String snum1 = String.valueOf(num1);
                String snum2 = String.valueOf(num2);

                if((snum1+snum2).length() == vlen){

                    char[] numCharArray = (snum1+snum2).toCharArray();
                    char[] vampCharArray = String.valueOf(num).toCharArray();

                    Arrays.sort(numCharArray);
                    Arrays.sort(vampCharArray);

                    if(Arrays.equals(numCharArray, vampCharArray)) return true;

                }

            }

            return false;
        }


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("enter num1 and num2");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            List<Integer> vampireNumbers = new ArrayList<>();

            for(int i=num1; i<=num2; i++){
                if(checkVampireNumber(i)){
                    vampireNumbers.add(i);
                }
            }

            for(int i : vampireNumbers){
                System.out.println(i);
            }

        }
    }


