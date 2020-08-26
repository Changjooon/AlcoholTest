package com.anyang.alcoholapp;

import java.util.ArrayList;

public interface OnDatabaseCallback {
    void insert(String date, String soju, String beer, String symptom);
    ArrayList<AlcInfo> selectAll();
}
