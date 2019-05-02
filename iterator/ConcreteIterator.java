/**
 * ConcreteIterator
 */
public class ConcreteIterator implements Iterator {

    private MyList myList = null;
    private int index;

    public ConcreteIterator(MyList myList) {
        super();
        this.myList = myList;
    }

    @Override
    public boolean hasNext() {
        if (index >= myList.getSize())
            return false;
        else
            return true;
    }

    @Override
    public Object next() {
        Object object = myList.get(index);
        index++;
        return object;
    }
}