package com.example.hp.sociohub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class InstagramHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insta_home_layout);


        WebView facebook_web = findViewById(R.id.instagram_web);

        facebook_web.loadUrl("http://www.instagram.com/");

        facebook_web.getSettings().setJavaScriptEnabled(true);
        facebook_web.setWebViewClient(new WebViewClient());

        facebook_web.setWebChromeClient(new WebChromeClient());

    }


    public void finish(View view) {

        finish();
    }
}
