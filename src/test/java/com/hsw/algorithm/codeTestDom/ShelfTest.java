package com.hsw.algorithm.codeTestDom;

/**
 *  A test method for the basic case, shelfCanAcceptAndReturnItem, has already been created. Each of the test case methods
 *  should be in the ShelfTester class and have Test attributes.
 */

// import org.junit.Assert;
// import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShelfTest {

    @Test
    public void shelfCanAcceptAdnReturnItem() {
        Shelf shelf = new Shelf();
        shelf.put("Orange");
//        Assert.assetTrue(shelf.take("Orange"));





        Assertions.assertTrue(shelf.take("Orange"));

    }


    @Test
    public void shelfCanNotAcceptNullAndNullString() {
        Shelf shelf = new Shelf();

        shelf.put(null);
        Assertions.assertTrue(!shelf.take(null));
        shelf.put("");
        Assertions.assertTrue(!shelf.take(""));
    }

    @Test
    public void shelfCanAcceptTakeOnce() {
        Shelf shelf = new Shelf();

        shelf.put("Apple");
        Assertions.assertTrue(shelf.take("Apple"));
        Assertions.assertTrue(!shelf.take("Apple"));
    }

    @Test
    public void shelfCanAcceptDuplicateItem() {
        Shelf shelf = new Shelf();

        shelf.put("Apple");
        shelf.put("Apple");
        Assertions.assertTrue(shelf.take("Apple"));
        Assertions.assertTrue(shelf.take("Apple"));
    }
}
