package com.example.utilitylibrary

import android.content.Context
import android.widget.Toast

class ToastUtil {
    companion object {
        fun showLongToast(context: Context, msg: String) {
            Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
        }

        fun showShortToast(context: Context, msg: String) {
            Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
        }
    }
}