package Queue_5.Review5;

import java.util.List;

public class MyHashMap {

    public List<Bucket> hashMap;
    public int modNumber;

    public MyHashMap() {
        this.modNumber = 2341;
        for (int i = 0; i < 2341; i++) {
            this.hashMap.add(new Bucket());
        }
    }

    public void put(int key, int value) {
        //calculate index address with modules
        int hashCode = key%modNumber; // I have an index
        this.hashMap.get(hashCode).update(key, value);
    }

    int get(int key) {
        return 0;
    }

    void remove(int key) {

    }

}
