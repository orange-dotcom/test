package com.example.test;

import android.content.Context;
import android.widget.Toast;

public class ToastUtils {

    private static Toast toast;

    public static void showToast(Context context) {
        if (toast == null) {
            toast = Toast.makeText(context, "hello wx", Toast.LENGTH_LONG);
        }
        toast.show();
    }
}
