package com.example.hp.sociohub;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;



public class FacebookHome extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook_home);


        WebView facebook_web = findViewById(R.id.facebook_web);

        facebook_web.loadUrl("http://www.facebook.com/");

        facebook_web.getSettings().setJavaScriptEnabled(true);
        facebook_web.setWebViewClient(new WebViewClient());

        facebook_web.setWebChromeClient(new WebChromeClient());

    }


    public void calll(View view) {
        finish();
    }
}
