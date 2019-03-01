package com.example.nb201803m079.test


import android.support.v7.widget.GridLayoutManager

class Custom_Spansize(private val spanCnt1: Int, private val spanCnt2: Int, private val spanCnt3: Int) :
    GridLayoutManager.SpanSizeLookup() {

    override fun getSpanSize(position: Int): Int {
        val result: Int
        if (position >= 0 && position <= 3) {
            result = spanCnt1
        } else if (position >= 4 && position <= 7) {
            result = spanCnt2
        } else {
            result = spanCnt3
        }
        return result
    }
}