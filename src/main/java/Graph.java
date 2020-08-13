import java.util.Iterator;
import java.util.LinkedList;

public class Graph {
    //https://www.geeksforgeeks.org/depth-first-search-or-dfs-for-a-graph/
    private int V; //umber of vertices

    //array of lists for adjacency list representation
    private LinkedList<Integer> adj[];

    //Constructor
    Graph (int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++)
        {
            adj[i] = new LinkedList<Integer>();
        }

    }

    void addEdge(int v, int w)
    {
        adj[v].add(w);
    }

    //a function used by DFS
    void DFSUtil(int v, boolean visited[])
    {
        //mark current node as visited and print it
        visited[v] = true;
        System.out.println(v + " ");
        // Recur for all the vertices adjacent to this vertex
        Iterator<Integer> it = adj[v].listIterator();
        while (it.hasNext())
        {
            int n = it.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }

    }

    //the function to do DFS traversal
    void DFS(int v)
    {
        //set all the visited nodes as false (default in Java)
        boolean[] visited = new boolean[V];
        DFSUtil(v, visited);
    }

    public static void main(String args[])
    {
        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Depth First Traversal "+
                "(starting from vertex 2)");

        g.DFS(2);
    }
}
