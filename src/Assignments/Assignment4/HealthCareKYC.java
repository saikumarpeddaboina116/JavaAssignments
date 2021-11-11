package Assignments.Assignment4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class HealthCareKYC {
    public static void validate(Date signDate, Date currDate) {
        System.out.println();
        Calendar signCal=Calendar.getInstance();
        signCal.setTime(signDate);
        Calendar currCal=Calendar.getInstance();
        currCal.setTime(currDate);
        Calendar tempCal=Calendar.getInstance();
        tempCal.setTime(signDate);
        if(signCal.after(currDate))
        {
            System.out.println(" No Range ");
        }
        else
        {
            SimpleDateFormat smpldt=new SimpleDateFormat("dd-MM-yyyy");
            tempCal.add(Calendar.YEAR,(currCal.get(Calendar.YEAR)-signCal.get(Calendar.YEAR)));
            tempCal.add(Calendar.DAY_OF_MONTH,-30);
           System.out.print(smpldt.format(tempCal.getTime())+" ");
         //   System.out.println(tempCal.get(Calendar.YEAR));

          tempCal.add(Calendar.DAY_OF_MONTH,60);
       //     System.out.println(tempCal.getTime());
            if( currCal.after(tempCal))
            {
                System.out.print(smpldt.format(currCal.getTime()));
            }
            else
            {

                    System.out.print(smpldt.format(tempCal.getTime()));
            }


        }

    }

    public static void main(String[] args) {
        System.out.println("Enter the number of dates : ");

        Scanner scan = new Scanner(System.in);
        int noOfDates = scan.nextInt();
        while (noOfDates >= 0) {
            String signUpDate = scan.next();
            String currentDate = scan.next();

           // System.out.println(noOfDates);
            noOfDates--;
            try {
                Date signDate = new SimpleDateFormat("dd-MM-yyyy").parse(signUpDate);
                Date currDate = new SimpleDateFormat("dd-MM-yyyy").parse(currentDate);
                validate(signDate, currDate);
            } catch(Exception e) {
                System.out.println("Error");
            }
        }
    }
}