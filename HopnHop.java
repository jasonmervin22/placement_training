import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        
        int dx = x1 - 3;
        int dy = y1 - 4;
        
        double dist = Math.sqrt(dx * dx + dy * dy);
        int hops = (int) Math.floor(dist);
        System.out.print(hops);
        
    }
}
