import java.util.*;

public class BFS {
    public static void main(String[] args) {
        //given Adjacency List
        int n =6; //total nodes
        ArrayList<Integer>[] adjList= new ArrayList[n+1];
        for(int i =0; i<=n;i++)
        {
            adjList[i] = new ArrayList<>();
        }
        Collections.addAll(adjList[1], 2,4);
        Collections.addAll(adjList[2], 1, 3,4);
        Collections.addAll(adjList[3], 2, 5);
        Collections.addAll(adjList[4], 1,2,5);
        Collections.addAll(adjList[5], 3, 4,6);
        Collections.addAll(adjList[6], 5);
        for(int  i =0; i<=n;i++)
        {
            System.out.println(adjList[i]);
        }
        boolean[] vis = new boolean[n+1];  //0 node not counted index== node
        int dest = 6;
        for(int i =1; i<=n; i++)
        {
            if(!vis[i])
            {
                bfsTraversal(adjList, 1,vis);
            }
        }
        System.out.println(vis[dest]);


    }
    public  static void bfsTraversal(ArrayList<Integer>[] graph, int source, boolean[] vis )
    {
        //visited node set true

        vis[source] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        while(!q.isEmpty()){
            int remo = q.remove();
//            System.out.print(remo+" ");
            for(Integer nbr : graph[remo])
            {
                if(!vis[nbr])
                {
                    vis[nbr] = true;
                    q.add(nbr);
                }
            }

        }



    }
}
