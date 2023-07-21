package com.example.onlysdk;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.onlysdk.Constants.Constants;
import com.example.onlysdk.Utils.Option;
import com.example.testedoctorsdk.R;

public class WebViewActivity extends AppCompatActivity {

    private WebView webView;
    private Button btn_Back;
    private TextView txt_Title;

    private RelativeLayout titleView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        String url = Constants.url;
        Option option = (Option) getIntent().getSerializableExtra("option");

        webView = findViewById(R.id.webview);
        btn_Back = findViewById(R.id.btn_back);
        txt_Title = findViewById(R.id.text_Title);
        titleView = findViewById(R.id.title_bar);


        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);


        btn_Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        if (option.getShowTitle() == false) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.MATCH_PARENT,
                    0
            );
            titleView.setLayoutParams(layoutParams);
        }

        txt_Title.setText(option.getTitle());
        Drawable imageBtnBack = getResources().getDrawable(option.getBackIcon());
        btn_Back.setBackground(imageBtnBack);
        if (url != null) {
            webView.loadUrl(url);
        }
    }
}
