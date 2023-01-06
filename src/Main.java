import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Which year do you want to check whether if it is leap year or not?");
        Scanner scanner=new Scanner(System.in);
        int year=scanner.nextInt();
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.printf(year+" is a leap year");
                } else {
                    System.out.printf(year+" is NOT a leap year");
                }
            } else {
                System.out.printf(year+" is a leap year");
            }
        } else {
            System.out.printf(year+" is NOT a leap year");
        }
    }
    }
