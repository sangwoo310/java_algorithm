package com.hsw.algorithm.codeTestDom;

/**
* Snapshot
*
* Modify the implementation of the Snapshot class so that an ArrayList stored in the snapshot is not affected by modifications to either the original or restored ArrayList
* */

import java.util.ArrayList;

public class Snapshot {
    private ArrayList<Integer> data;

    public Snapshot(ArrayList<Integer> data) {
//        this.data = data;


        this.data = (ArrayList<Integer>)data.clone();
    }

    public ArrayList<Integer> restore() {
//        return this.data;



        return (ArrayList<Integer>)this.data.clone();
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        Snapshot snap = new Snapshot(list);
        list.set(0, 3);
        list = snap.restore();
        System.out.println(list);   // It should log "[1,2]"
        list.add(4);
        list = snap.restore();
        System.out.println(list);   // It should log "[1,2]"
    }
}
