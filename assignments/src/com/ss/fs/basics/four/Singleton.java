package com.ss.fs.basics.four;

public class Singleton {
    volatile public static Singleton instance = null;
    private final StringBuffer someText = new StringBuffer("");

    private Singleton() {
        setSomeText("Singleton initiated!");
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

    public StringBuffer getSomeText() {
        return this.someText;
    }

    public void setSomeText(String text) {
        if(this.someText.length() > 1) {
            this.someText.delete(0, this.someText.length());
        }
        this.someText.append(text);
    }
}
