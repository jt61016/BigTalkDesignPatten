package com.jt61016.BigTalkDesignPatten.prototype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prototype implements Cloneable {
    private ArrayList<String> list = new ArrayList<>(Arrays.asList("AAA","BBB"));

    public Prototype clone() {
        Prototype prototype = null;
        try {
            prototype = (Prototype) super.clone();
            prototype.list = this.list;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototype;
    }

    public void showInfo() {
        System.out.println(this.hashCode());
        for (String s : list)
            System.out.println(s);
    }
}
