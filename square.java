/*
Given four different points in space. Find these points can form a square or not.

Input:

The first line of input contains an integer T denoting the number of test cases.
The first line of each test case contains x1, y1, x2, y2, x3, y3, x4, y4 (four points coordinates).

Output:

Print "Yes" (without quotes) if it is square else "No".

Constraints:

1 ≤ T ≤ 30
1 ≤ x1, x2, x3, x4, y1, y2, y3, y4 ≤ 100

Example:

Input
1
20 10 10 20 20 20 10 10

Output
Yes
*/
import java.util.Scanner;
class Point {
     int x,y;
     public Point(int a,int b) {
          x = a;
          y = b;
     }
     public static int findDistance(Point a,Point b) {
          return (a.x - b.x)*(a.x - b.x) + (a.y - b.y)*(a.y - b.y);
     }
}
public class square {
     static int findSquare(Point p1,Point p2,Point p3,Point p4) {
          int d1 = Point.findDistance(p1,p2);
          int d2 = Point.findDistance(p1,p3);
          int d3 = Point.findDistance(p1,p4);
          if(d1 == d2 && 2*d1 == d3)
               return 1;
          if(d1 == d3 && 2*d1 == d2)
               return 1;
          if(d2 == d3 && 2*d2 == d1)
               return 1;
          return 0;
     }
     public static void main(String[] args) {
          Point p1 = new Point(20,10);
          Point p2 = new Point(10,20);
          Point p3 = new Point(20,20);
          Point p4 = new Point(10,10);
          System.out.println(findSquare(p1,p2,p3,p4));
     }
}
