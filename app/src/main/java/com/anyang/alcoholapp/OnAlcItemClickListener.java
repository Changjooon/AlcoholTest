package com.anyang.alcoholapp;

import android.view.View;

public interface OnAlcItemClickListener {
    void onItemClick(AlcAdapter.ViewHolder holder, View view, int position);
}
