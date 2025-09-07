import java.util.*;

public class Arrays{

    public static void update(int numbers[], int nonChangable){
        for(int i=0; i<numbers.length; i++){
            numbers[i] = numbers[i] + 1;
        }

        nonChangable = nonChangable + 5;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String fruits[] = {"apple", "mango", "orange"};
        
        int numbers[] = {1, 2, 3};
        int nonChangable = 5;
        //print the updated array values
        update(numbers, nonChangable);
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i] + ", ");
        }
        System.out.println();
        System.out.println(nonChangable);


        int num[] = new int[20];
        System.out.print("Enter a no: ");
        num[0] = sc.nextInt();
        System.out.print("Enter a no: ");
        num[1] = sc.nextInt();
        System.out.print("Enter a no: ");
        num[2] = sc.nextInt();

        System.out.println("The no.s you entered are : " + num[0] + " ," + num[1] + " ," + num[2]);
        System.out.println(num.length);
    }
}