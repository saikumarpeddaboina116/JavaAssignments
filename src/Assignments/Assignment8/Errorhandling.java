package Assignments.Assignment8;

import java.util.Scanner;

public class Errorhandling {
   public static void validateString(String input) throws LessLengthException,MoreLengthException,OutOfBoundsException
    {
        try {
            if (input.length() > 5 && input.length() < 8)
                throw new MoreLengthException("your input length is longer , enter shorter length input");
            else if (input.length() > 8)
                throw new OutOfBoundsException("your input length is out of bounds , enter shorter length input");
            else if (input.length() < 5)
                throw new LessLengthException("your input length is shorter , enter longer length input");
            else {
                System.out.println("Perfect Length");
            }
        }
            catch(MoreLengthException | OutOfBoundsException | LessLengthException e)
            {
                System.out.println(e.getMessage());
            }
        catch (NullPointerException ex)
        {
            System.out.println(ex.getMessage());
        }

    }
    public static void main(String[] args) throws MoreLengthException, OutOfBoundsException, LessLengthException {
        Scanner scan = new Scanner(System.in);
        String input=scan.nextLine();
        validateString(input);
    }
}
