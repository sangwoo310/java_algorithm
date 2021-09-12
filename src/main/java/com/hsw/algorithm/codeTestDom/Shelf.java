package com.hsw.algorithm.codeTestDom;

/**
 * Shelf Test
 *
 * Using JUnit 4`s Assert class, write tests for the Shelf class covering the following cases:
 *  - The put method will do nothing when passed null, It should also do nothing when passed an empty string.
 *  - Each individual item can only be taken from the shelf once.
 *  - Duplicate items can exist on the shelf at the same time
 */

import java.util.ArrayList;
import java.util.List;

public class Shelf {
    private List<String> items = new ArrayList<>();

    public void put(String item) {
        if(item != null && !item.isEmpty()) {
            this.items.add(item);
        }
    }

    public boolean take(String item) {
        if(items.contains(item)) {
            items.remove(item);
            return true;
        }

        return false;
    }
}

