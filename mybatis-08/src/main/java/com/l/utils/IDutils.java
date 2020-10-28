package com.l.utils;

import java.util.UUID;

@SuppressWarnings("all")
public class IDutils {
    public static String getId(){
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    public static void main(String[] args) {
        System.out.println(getId());
        System.out.println(getId());
        System.out.println(getId());
    }
}
