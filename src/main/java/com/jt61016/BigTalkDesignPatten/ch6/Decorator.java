package com.jt61016.BigTalkDesignPatten.ch6;

public class Decorator implements ShowFinery {
    private ShowFinery component;

    public Decorator(ShowFinery component) {
        this.component = component;
    }

    /*public void decorator(ShowFinery component) {
        this.component = component;
    }*/

    @Override
    public void show() {
        if (null != component) {
            component.show();
        }
    }
}
