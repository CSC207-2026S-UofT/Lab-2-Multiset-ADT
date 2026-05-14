/**
 * Abstract class representing a MultiSet ADT.
 * A MultiSet is a collection that allows duplicate elements.
 */
public abstract class MultiSet {

    /**
     * Add the given item to this multiset.
     *
     * @param item the item to add
     */
    abstract void add(Integer item);

    /**
     * Remove one occurrence of the given item from this multiset.
     * Does nothing if the item is not present.
     *
     * @param item the item to remove
     */
    abstract void remove(Integer item);

    /**
     * Return whether this multiset contains the given item.
     *
     * @param item the item to check
     * @return true if the item is in this multiset, false otherwise
     */
    abstract boolean contains(Integer item);

    /**
     * Return whether this multiset is empty.
     *
     * @return true if this multiset has no elements, false otherwise
     */
    abstract boolean isEmpty();

    /**
     * Return the number of occurrences of the given item in this multiset.
     *
     * @param item the item to count
     * @return the number of times item appears in this multiset
     */
    abstract int count(Integer item);

    /**
     * Return the total number of elements in this multiset.
     *
     * @return the size of this multiset
     */
    abstract int size();
}
