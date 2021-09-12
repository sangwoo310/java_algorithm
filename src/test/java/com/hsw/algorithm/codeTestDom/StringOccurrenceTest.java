package com.hsw.algorithm.codeTestDom;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class StringOccurrenceTest {
    @Test
    public void streamTest() throws Exception {
        String msg = "\n";

        InputStream stream = new ByteArrayInputStream(msg.getBytes());
        System.out.println(stream.read());
        System.out.println(stream.toString());

    }
}
