// Qs => Given a route conatining 4 directions(N, S, E, W), find the shortest path to reach destination. Starting from the origin(0,0) 

public class ShortestPath{

    public static float getShortestPath(String str){
        int x = 0, y = 0;
        for(int i=0; i<str.length(); i++){
            char dir = str.charAt(i);
            // North
            if(dir == 'N'){
                y++;
            }
            // South
            if(dir == 'S'){
                y--;
            }
            // East
            if(dir == 'E'){
                x++;
            }
            // West 
            if(dir == 'W'){
                x--;
            }
        }

        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2 + y2);

        // Time complexity: O(n)
    }

    public static void main(String args[]){
        String path = "WNEENESENNN"; 
        System.out.println(getShortestPath(path));
    }
}