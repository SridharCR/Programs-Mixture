public class prims
{
     private static final int V = 5;
     
     public static void main(String[] args) {
        prims t = new prims();
        int graph[][] = new int[][] {{0, 2, 0, 6, 0},
                                    {2, 0, 3, 8, 5},
                                    {0, 3, 0, 0, 7},
                                    {6, 8, 0, 0, 9},
                                    {0, 5, 7, 9, 0},
                               };

        // Print the solution
        t.MST(graph);
     }
}
