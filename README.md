# LabWork6 🚀
### Laboratory work for assignment 6 in AITU. This program implements a `weighted graph` data structure in Java. It provides functionalities to `add vertices`, `add edges` between vertices with weights, perform `breadth-first search (BFS)`, and `Dijkstra's algorithm` for finding the shortest paths in the graph.🎯:
## Features 📜
* **[Vertex Class](https://github.com/Andn1ght/LabWork6/blob/master/src/Vertex.java):** *Represents a vertex in the graph with associated data and a map of adjacent vertices and their weights. It provides methods to add adjacent vertices and retrieve the vertex data.*
* **[WeightedGraph Class](https://github.com/Andn1ght/LabWork6/blob/master/src/WeightedGraph.java):** *Implements the weighted graph data structure with methods to add vertices, add edges, remove edges, check for edge existence, retrieve adjacent vertices, perform `BFS`, and `Dijkstra's algorithm`. It uses a `HashMap` to store the adjacency list representation of the graph.*
* **[Search Interface](https://github.com/Andn1ght/LabWork6/blob/master/src/Search.java):** *Defines the search algorithm interface with a single method for performing the search.*
* **[BreadthFirstSearch Class](https://github.com/Andn1ght/LabWork6/blob/master/src/BreadthFirstSearch.java):** *Implements the `BFS` algorithm by utilizing the `WeightedGraph` class. It performs a `breadth-first` traversal of the graph starting from a given vertex and prints the visited vertices.*
* **[DijkstraSearch Class](https://github.com/Andn1ght/LabWork6/blob/master/src/DijkstraSearch.java):** *Implements `Dijkstra's algorithm` by utilizing the `WeightedGraph` class. It calculates the shortest distances from a given start vertex to all other vertices in the graph using a priority queue and a map to track the distances.*
## Usage 📈
**To use this program, you can follow these steps:**
1. Create an instance of the **`WeightedGraph`** class.
2. Create **`Vertex`** instances for each vertex in the graph.
3. Add vertices to the graph using the **`addVertex`** method.
4. Add edges between vertices using the **`addEdge`** method, specifying the source vertex, destination vertex, and weight of the edge.
5. Perform BFS or Dijkstra's algorithm using the provided search classes (**`BreadthFirstSearch`** or **`DijkstraSearch`**) and passing the graph and a start vertex.
6. Retrieve the results or perform other operations as needed.

**Here's an example usage:**
```java
public class Main {
    public static void main(String[] args) {
        WeightedGraph<Integer> graph = new WeightedGraph<>();
        Vertex<Integer> vertex1 = new Vertex<>(1);
        Vertex<Integer> vertex2 = new Vertex<>(2);
        Vertex<Integer> vertex3 = new Vertex<>(3);
        Vertex<Integer> vertex4 = new Vertex<>(4);

        graph.addVertex(vertex1);
        graph.addVertex(vertex2);
        graph.addVertex(vertex3);
        graph.addVertex(vertex4);

        graph.addEdge(vertex1, vertex2, 1.0);
        graph.addEdge(vertex1, vertex3, 2.0);
        graph.addEdge(vertex2, vertex4, 3.0);
        graph.addEdge(vertex3, vertex4, 4.0);

        graph.printGraph();

        Search<Integer> bfs = new BreadthFirstSearch<>(graph);
        bfs.search(vertex1);

        Search<Integer> dijkstra = new DijkstraSearch<>(graph);
        dijkstra.search(vertex1);
    }
}
```





