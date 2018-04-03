package com.ifox.controller;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldControllerTest {
    @Test
    public void testSayHello(){
        assertEquals("Hello,World!",new HelloWorldController().sayHello());
    }
}
