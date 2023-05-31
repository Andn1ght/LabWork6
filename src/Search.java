/**
 * Represents a search algorithm interface.
 *
 * @param <V> the type of data associated with the vertices
 */
public interface Search<V> {
    /**
     * Performs a search starting from the given vertex.
     *
     * @param start the start vertex
     */
    void search(Vertex<V> start);
}
