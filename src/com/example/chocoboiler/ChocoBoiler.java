package com.example.chocoboiler;

public class ChocoBoiler {
    private boolean boiled;
    private boolean empty;
    private volatile static ChocoBoiler instance;

    private ChocoBoiler() {
        empty = true;
        boiled = false;
    }

    public synchronized static ChocoBoiler getInstance() {
        if (instance == null) {
            synchronized (ChocoBoiler.class) {
                if (instance == null) {
                    instance = new ChocoBoiler();
                }
            }
        }
        return instance;
    }


    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
            boiled = false;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            empty = false;
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}

