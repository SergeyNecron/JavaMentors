package Collections;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMetods {
    public static void main(String[] args) {
        Collection<?> collection = new AbstractCollection<Object>() {

            @Override
            public Iterator<Object> iterator() {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }
        };
        Object object = new Object();
        collection.remove(object);
        collection.toArray();
        collection.clear();
        collection.size();
        collection.iterator();
        collection.contains(object);
        //collection.add(object);
    }

}
