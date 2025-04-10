import java.util.Scanner;

public class Mini_Project1 {

    public static void main(String[] args){
        //MINI PROJECT
        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        int userNumber = 0;
        do{
            System.out.print("Guess my number (1 - 100): ");
            userNumber = sc.nextInt();
            if(userNumber == myNumber){
                System.out.println("WOOHOO .. CORRECT NUMBER!!!");
                break;
            }
            else if (userNumber > myNumber){
                System.out.println("Your number is large!");
            }
            else{
                System.out.println("Your number is small!");
            }
        }while (userNumber >= 0);

        System.out.print("My number was:");
        System.out.println(myNumber);
        sc.close();
    }
}
