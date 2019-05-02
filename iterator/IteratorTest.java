/**
 * IteratorTest
 */
public class IteratorTest {

    public static void main(String[] args) {

        MyList myList = new ConcreteMyList();
        myList.add("a");
        myList.add("b");
        myList.add("c");
        Iterator itor = myList.iterator();
        while (itor.hasNext()) {
            System.out.println(itor.next());
        }
    }
}