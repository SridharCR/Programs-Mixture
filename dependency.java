//Sum of dependencies in a graph
import java.util.*;
class node
{
     int vertex,weight;
     public node(int v,int w)
     {
          vertex = v;
          weight = w;
     }
}
public class dependency
{
     int V;
     LinkedList<Integer> adj[];
     public dependency(int v)
     {
          V = v;
          adj = new LinkedList<Integer>[v];
          for (int i=0;i < v ;i++ ) {
               adj[i] = new LinkedList<node>();
          }
     }
     void addEdge(int v,node l)
     {
          adj[v].add(l);
     }
     void BFS(int s)
     {
          boolean visited[] = new boolean[V];
          LinkedList<Integer> queue = new LinkedList<Integer>();
          visited[s] = true;
          queue.add(s);
          while(queue.size() != 0)
          {
               s = queue.poll();
               System.out.println(s+" ");

               Iterator<Integer> i = adj[s].listIterator();
               while(i.hasNext())
               {
                    int n = i.next();
                    if(!visited[n])
                    {
                         visited[n] = true;
                         queue.add(n);
                    }
               }
          }
     }
     void sum()
     {

     }
     public static void main(String[] args) {
          graph g = new graph(4);
          node a = new node(1,10);
          node b = new node(2,20);
          node c = new node(2,30);
          node d = new node(0,20);
          node e = new node(3,30);
          node f = new node(3,20);
          g.addEdge(0, a);
          g.addEdge(0, b);
          g.addEdge(1, c);
          g.addEdge(2, d);
          g.addEdge(2, e);
          g.addEdge(3, f);

        System.out.println("Following is Breadth First Traversal "+
                           "(starting from vertex 2)");

        g.BFS(2);
     }
}
