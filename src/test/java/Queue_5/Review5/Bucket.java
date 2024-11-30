package Queue_5.Review5;

import java.util.LinkedList;

public class Bucket {

    LinkedList<KeyValue<Integer, Integer>> bucket;

    public Bucket() {
        this.bucket = new LinkedList<KeyValue<Integer,Integer>>();
    }

    public void update(int key, int value) {
        //if key exists then update value part
        //else add key and value as a new pair
    }
}
