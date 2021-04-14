package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Sorter2<T extends Comparable> {

    private List<T> list2;

    List<T> sort(List<T> list2) {
        this.list2 = new ArrayList<>(list2);
        Collections.sort(this.list2);
        return this.list2;
    }
}
