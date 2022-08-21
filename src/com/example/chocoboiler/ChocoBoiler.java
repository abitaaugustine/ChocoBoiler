package com.example.chocoboiler;

public class ChocoBoiler {
    private boolean boiled;
    private boolean empty;
    private static ChocoBoiler instance = new ChocoBoiler();

    private ChocoBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocoBoiler getInstance() {
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

