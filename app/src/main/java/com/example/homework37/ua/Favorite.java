package com.example.homework37.ua;

public class Favorite {
    private int oval;
    private String text;
    private int photo;

    public Favorite(int oval, String text, int photo) {
        this.oval = oval;
        this.text = text;
        this.photo = photo;
    }

    public int getOval() {
        return oval;
    }

    public void setOval(int oval) {
        this.oval = oval;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
