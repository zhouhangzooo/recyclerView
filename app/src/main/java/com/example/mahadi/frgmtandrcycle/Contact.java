package com.example.mahadi.frgmtandrcycle;

/**
 * Created by Mahadi on 3/11/2018.
 */

public class Contact {

    private String name;
    private String payment;
    private String phn;
    private int photo;

    public Contact() {

    }

    public Contact(String name, String phn, int photo, String payment) {
        this.name = name;
        this.phn = phn;
        this.photo = photo;
        this.payment = payment;
    }

    public String getName() {
        return name;
    }

    public String getPayment() {
        return payment;
    }

    public String getPhn() {
        return phn;
    }

    public int getPhoto() {
        return photo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhn(String phn) {
        this.phn = phn;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }
}
