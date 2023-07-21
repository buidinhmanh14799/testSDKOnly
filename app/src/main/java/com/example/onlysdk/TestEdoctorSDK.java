package com.example.onlysdk;

import android.content.Context;
import android.content.Intent;

import com.example.onlysdk.Utils.Option;

public class TestEdoctorSDK {
    public static void openWebView(Context context, Option option) {
        Intent intent = new Intent(context, WebViewActivity.class);
        intent.putExtra("option", option);
        context.startActivity(intent);
    }
}
