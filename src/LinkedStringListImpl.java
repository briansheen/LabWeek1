/**
 * Created by bsheen on 3/31/17.
 */
public class LinkedStringListImpl implements StringList {

    private Node head;

    @Override
    public void add(String value) {
        if (head == null) {
            head = new Node(value);
        } else {
            Node temp = head;
            while (temp.getNextPointer() != null) {
                temp = temp.getNextPointer();
            }
            // temp now points to last node
            Node newNode = new Node(value);
            temp.setNextPointer(newNode);
        }
    }

    @Override
    public int size() {
        if (head == null) {
            return 0;
        } else {
            Node temp = head;
            int count = 1;
            while (temp.getNextPointer() != null) {
                temp = temp.getNextPointer();
                ++count;
            }
            return count;
        }
    }

    @Override
    public String get(int index) {
        if (head == null) {
            return null;
        } else {
            Node temp = head;
            if (index == 0) {
                return temp.getValue();
            }
            int count = 0;
            while (temp.getNextPointer() != null) {
                temp = temp.getNextPointer();
                ++count;
                if (count == index) {
                    return temp.getValue();
                }
            }
            return null;
        }
    }

    @Override
    public void remove(int index) {
        int num = 0;
        if (head == null) {
            num = 0;
        } else {
            Node next = head;
            int count = 0;
            while (next.getNextPointer() != null) {
                next = next.getNextPointer();
                ++count;
            }
            num = count;
        }
        if (index == 0) {
            Node next = head;
            int count = 0;
            while (next != null) {
                next = next.getNextPointer();
                ++count;
                if (count == 1) {
                    head = next;
                }
            }
        }
        if (index == num) {
            Node next = head;
            int count = 0;
            while (next != null) {
                if (index == count + 1) {
                    next.setNextPointer(null);
                    break;
                } else {
                    next = next.getNextPointer();
                    ++count;
                }
            }
        }
        if (index > 0 && index < num) {
            Node next = head;
            Node behind = next;
            int count = 0;
            while (next != null) {
                if (count == index) {
                    behind.setNextPointer(next.getNextPointer());
                    next.setNextPointer(null);
                    break;
                } else {
                    behind = next;
                    next = next.getNextPointer();
                    ++count;
                }
            }
        }
    }

    @Override
    public void replace(int index, String value) {
        Node next = head;
        int count = 0;
        while (next != null) {
            if (count == index) {
                next.setValue(value);
                break;
            }
            count++;
            next = next.getNextPointer();
        }
    }

    @Override
    public void collapse() {
        Node next = head;
        Node behind = next;
        boolean isFirst = true;
        while (next != null) {
            if (next.getValue() != null) {
                behind = next;
                next = next.getNextPointer();
                isFirst = false;
            } else if (isFirst == true) {
                if (next.getValue() == null) {
                    head = next.getNextPointer();
                    next = head;
                    behind = next;
                } else {
                    isFirst = false;
                }
            } else {
                behind.setNextPointer(next.getNextPointer());
                next = behind.getNextPointer();
            }
        }
    }

    @Override
    public String toString() {
        return "LinkedStringListImpl{" +
                "head=" + head +
                '}';
    }
}
