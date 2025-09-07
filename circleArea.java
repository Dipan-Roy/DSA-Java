import java.util.*;

public class circleArea{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        float area = 3.14f * r * r;  // 3.14f => will be considered as a "float" value; 3.14 will be considered as a "double" value
        System.out.println(area);                                  
    }
}