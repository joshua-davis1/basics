package com.ss.fs.basics.four;

public class Singleton {
    volatile public static Singleton instance = null;
    private String someText = null;

    private Singleton() {
        this.someText = "Only one instance of this class can be created!";
    }

    public static Singleton getInstance() {
        if(instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public String getSomeText() {
        return this.someText;
    }

    public void setSomeText(String text) {
        this.someText = text;
    }
}
