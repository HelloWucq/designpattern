/**
 * ConcreteMyList
 */
public class ConcreteMyList implements MyList {

    private Object[] mylist;
    private int size = 0;
    private int index = 0;

    public ConcreteMyList() {
        index = 0;
        size = 0;
        mylist = new Object[100];
    }

    @Override
    public void add(Object object) {
        mylist[index++] = object;
        size++;
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this);
    }

    @Override
    public Object get(int index) {
        return mylist[index];
    }

    @Override
    public int getSize() {
        return size;
    }
}