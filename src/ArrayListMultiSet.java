import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMultiSet extends MultiSet {

    private ArrayList<Integer> list;  // like self._list = [] in Python

    public ArrayListMultiSet() {      // constructor = __init__
        this.list = new ArrayList<>();
    }

    @Override
    void add(Integer item) {
        list.add(item);               // like self._list.append(item)
    }

    @Override
    void remove(Integer item) {
        list.remove(item);            // like self._list.remove(item)
    }

    @Override
    boolean contains(Integer item) {
        return list.contains(item);   // like item in self._list
    }

    @Override
    boolean isEmpty() {
        return list.isEmpty();        // like len(self._list) == 0
    }

    @Override
    int count(Integer item) {
        return Collections.frequency(list, item); // like self._list.count(item)
    }

    @Override
    int size() {
        return list.size();           // like len(self._list)
    }
}
