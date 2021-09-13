package com.hsw.algorithm.codeTestDom;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/**
 * Implement the function getOccurrenceCount, which returns the number of lines from the InputStream that contain text matching the provided String.
 *
 * For example, when the String toSearch is "good" and the InputStream stream contains:
 *  - Hey! How are you?
 *  - I am good, how about you?
 *  - I am good too.
 *
 *  The getOccurrenceCount method should return 2 as there are 2 lines that contain "good".
 */

public class StringOccurrence {
    public static int getOccurrenceCount(String toSearch, InputStream stream) throws Exception {

//        throw new UnsupportedOperationException("Waiting to be implemented.");




        final byte[] bytes;
        bytes = stream.readAllBytes();
        String data = new String(bytes);

        String[] splitStr = data.split("\n");

        int count = 0;
        for (String s : splitStr) {
            if (s.contains(toSearch)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) throws Exception {
        String msg = "Hey! How are you?\nI am good, how about you?\nI am good too.";

        try (InputStream stream = new ByteArrayInputStream(msg.getBytes())) {
            System.out.println(StringOccurrence.getOccurrenceCount("good", stream));
        }
    }
}
