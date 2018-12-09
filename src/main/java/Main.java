import validators.PLidValidator;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        PLidValidator pliDvalidator =new PLidValidator();
        System.out.println("Please type in your ID number: ");
        String idNumberToCheck="";

        Scanner scanner = new Scanner(System.in);

        while (idNumberToCheck.length()<9 || idNumberToCheck.length()>9)
            try {
                idNumberToCheck = scanner.next();
                if (idNumberToCheck.length() == 9) {
                    boolean isValid = pliDvalidator.validate(idNumberToCheck);
                }else{
                System.out.println("Incorrect ID number. " +
                        "ID has to contain 3 letters followed by 6 numbers. Please enter again:");}

            }catch (IllegalArgumentException ex) {
            }

        }
    }
