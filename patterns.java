public class patterns{

    public static void hollow_rectangle(int totRows, int totCols) {
        // outer loop - rows
        for(int i = 1; i <= totRows; i++){
            // inner loop - individual columns of the current row
            for(int j = 1; j <= totCols; j++){
                // cell - (i,j)
                if(i ==  1 || i == totRows || j == 1 || j == totCols){ // Boundary cells 
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void inverted_rotated_half_pyramid(int totRows){
        // rows
        for(int i = 1; i <= totRows; i++){
            // spaces
            for(int j = 1; j <= totRows-i; j++){
                System.out.print(" ");
            }
            // stars
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void inverted_half_pyramid_with_numbers(int totRows){
        for(int i = totRows; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void floyds_triangle(int totRows){
        int counter = 1;
        // outer loop - rows
        for(int i = 1; i <= totRows; i++ ){
            // inner loop - how many times will counter be printed
            for(int j = 1; j <= i; j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void zero_one_triangle(int totRows){
        for(int i = 1; i <= totRows; i++){
            for(int j = 1; j <= i; j++ ){
                if((i + j) % 2 == 0){ // even
                    System.out.print("1");
                } else{
                    System.out.print("0"); // odd
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n){
        // 1st half
        for(int i = 1; i <= n; i++){
            // stars - i
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }

            // spaces - 2*(n-i)
            for(int j = 1; j <= (2*(n-i)); j++){
                System.out.print(" ");
            }

            // stars - i
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd half
        for(int i = n; i >= 1; i--){
            // stars - i
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }

            // spaces - 2*(n-i)
            for(int j = 1; j <= (2*(n-i)); j++){
                System.out.print(" ");
            }

            // stars - i
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }  
    }

    public static void solid_rhombus(int n){
        for(int i=1; i<=n; i++){
            // spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            // stars 
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollow_rhombus(int n){
        for(int i=1; i<=n; i++){
            // spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            // hollow rectangle - stars
            for(int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void diamond(int n){
        // 1st Half
        for(int i=1; i<=n; i++){
            // spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            // stars
            for(int j=1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd Half
        for(int i=n; i>=1; i--){
            // spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            // stars
            for(int j=1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        // Star pattern
        for(int line = 1; line <= 4; line++){
            for(int star = 1; star <= line; star++){
                System.out.print("*");
            }
            System.out.println();
        } 
        System.out.println("------------");

        // inverted star pattern
        for(int i = 4; i >= 1; i--){
            for(int j = i; j >= 1; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("------------");

        // Half pyramid pattern
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        } 
        System.out.println("------------");

        // Character pattern
        int n = 4;
        char ch = 'A';

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        System.out.println("------------");

        // Hollow Rectangle
        hollow_rectangle(4, 5);
        System.out.println("------------");

        // inverted_rotated_half_pyramid
        inverted_rotated_half_pyramid(4);
        System.out.println("------------");

        // inverted_half_pyramid_with_numbers
        inverted_half_pyramid_with_numbers(5);
        System.out.println("------------");

        // Floyd's Triangle
        floyds_triangle(5);
        System.out.println("------------");

        // 0-1 Triangle
        zero_one_triangle(5);
        System.out.println("------------");

        // Butterfly Pattern
        butterfly(4);
        System.out.println("------------");

        // Solid Rhombus
        solid_rhombus(5);
        System.out.println("------------");

        // Hollow Rhombus
        hollow_rhombus(5);
        System.out.println("------------");

        // Diamond Pattern
        diamond(4);
        System.out.println("------------");
    
    }
}