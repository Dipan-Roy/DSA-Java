import java.util.*;

public class PracticeQues1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        float bill = pencil + pen + eraser;

        System.out.println("Your Bill is: " + bill);

        float gstBill = (0.18f * bill) + bill;
        System.out.println("Your Bill with GST is: " + gstBill);
    }
}