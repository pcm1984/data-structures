import com.pankaj.ds.MyLinkedList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyLinkedListTest {

    @Test
    void testAddFirst() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.addFirst(3);
        assertEquals(1, list.getSize());
    }

    @Test
    void testAddLast() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(5);
        list.add(7);
        assertEquals(2, list.getSize());
    }

    @Test
    void testRemove() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.addFirst(2);
        list.add(4);
        list.add(6);

        list.remove(4);
        assertEquals(2, list.getSize());

        list.remove(2);
        assertEquals(1, list.getSize());
    }
}
