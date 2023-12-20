package Java;
interface Grafo{
  int edgeWeight(int a, int b);
  int shortestPath(int a, int b);
  void addEdge(int a, int b, int w);
  void addNode(int a);
}
