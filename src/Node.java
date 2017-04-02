/**
 * Created by bsheen on 3/31/17.
 */
public class Node {
    private String value;
    private Node nextPointer;

    public Node(String string) {
        this.value = string;
        this.nextPointer = null;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String string) {
        this.value = string;
    }

    public Node getNextPointer() {
        return nextPointer;
    }

    public void setNextPointer(Node nextPointer) {
        this.nextPointer = nextPointer;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value='" + value + '\'' +
                ", nextPointer=" + nextPointer +
                '}';
    }
}
