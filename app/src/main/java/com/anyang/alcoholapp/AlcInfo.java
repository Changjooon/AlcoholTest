package com.anyang.alcoholapp;

public class AlcInfo {

    String date;
    String soju;
    String beer;
    String symptom;

    public AlcInfo(String date, String soju, String beer, String symptom) {
        this.date = date;
        this.soju = soju;
        this.beer = beer;
        this.symptom = symptom;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSoju() {
        return soju;
    }

    public void setSoju(String soju) {
        this.soju = soju;
    }

    public String getBeer() {
        return beer;
    }

    public void setBeer(String beer) {
        this.beer = beer;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    @Override
    public String toString() {
        return "AlcInfo{" +
                "date='" + date + '\'' +
                ", soju='" + soju + '\'' +
                ", beer='" + beer + '\'' +
                ", symptom='" + symptom + '\'' +
                '}';
    }

}
