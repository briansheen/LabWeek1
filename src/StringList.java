/**
 * Created by bsheen on 3/31/17.
 */
public interface StringList {
    void add(String value);
    int size();
    String get(int index);
    void remove(int index);
    void replace(int index, String value);
    void collapse();

}
