package com.company;

import org.junit.jupiter.api.DynamicTest;

import java.util.Date;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        System.out.println("test");
        Pattern pattern = new Pattern("^[A-Za-z0-9]{4,40}$");
        Date date = new Date(1234);
        if (date == null) {

        }
    }

    /**
     *
     */
    @DynamicTest
    public void Test() {

    }



}
