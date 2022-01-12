package adapter.enumeration;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * New Iterator has default implmentation for remove which throw Unsupported Exception
 */
public class EnumerationIterator<T> implements Iterator<T> {
    Enumeration<T> enume;

    public EnumerationIterator(Enumeration<T> enume){
        this.enume = enume;
    }

    @Override
    public boolean hasNext() {
        return this.enume.hasMoreElements();
    }

    @Override
    public T next() {
        return this.enume.nextElement();
    }
}
