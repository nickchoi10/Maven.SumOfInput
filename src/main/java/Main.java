import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt(); //getting the number from the user and storing it in value

        int sum =0;
        int x = 0;
        while (x <= value){
            sum = sum + x;
            x= x + 1;
        }

        System.out.println(sum);

    //    for (x =1, x <= value, x++){
    //        sum += x;
    //        x++;
    //    }














    }
}
