package com.hsw.algorithm.codeTestDom;

import com.oracle.tools.packager.IOUtils;

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
        throw new UnsupportedOperationException("Waiting to be implemented.");





        /*
        // inputStream to byte Array
         final byte[] bytes;
         try (inputStream) {
             bytes = inputStream.readAllBytes();
         }
         */

//        stream.writ
//
//        byte[] bytes = ByteStreams.toByteArray(inputStream);


        /*
        String a[] = str.split(" ");

        // search for pattern in a
        int count = 0;
        for (int i = 0; i < a.length; i++)
        {
            // if match found increase count
            if (word.equals(a[i]))
                count++;
        }

        return count;
        */
    }

    public static void main(String[] args) throws Exception {
        String msg = "Hey! How are you?\nI am good, how about you?\nI am good too.";

        try (InputStream stream = new ByteArrayInputStream(msg.getBytes())) {
            System.out.println(StringOccurrence.getOccurrenceCount("good", stream));
        }
    }
}
