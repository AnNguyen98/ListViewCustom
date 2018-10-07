package com.theannguyen.listviewcustom;

public class Contact {
    private String numberPhone;
    private int imgImage;

    public Contact(String numberPhone, int imgImage) {
        this.numberPhone = numberPhone;
        this.imgImage = imgImage;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public int getImgImage() {
        return imgImage;
    }
}
