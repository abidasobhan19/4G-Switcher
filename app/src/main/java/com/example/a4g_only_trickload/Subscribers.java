package com.example.a4g_only_trickload;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Subscribers extends AppCompatActivity {
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subscribers);

        webView= findViewById(R.id.web_view);
        webView.loadUrl ("http://www.youtube.com/channel/UCF-y0FnegLf3y8zPm0lX9Ng?sub_confirmation=1");

        WebSettings webSettings = webView.getSettings ( );
        webView.getSettings ().setJavaScriptEnabled (true);
        webView.getSettings ().setAppCacheEnabled (true);
        webView.getSettings ().setDatabaseEnabled (true);
        webView.getSettings ().setDomStorageEnabled (true);
        webView.getSettings ().setJavaScriptCanOpenWindowsAutomatically (true);
//        webView.getSettings ().setBuiltInZoomControls (true);

        webView.getSettings ().setGeolocationEnabled (true);
        webView.setWebViewClient (new WebViewClient());

//            webView.getSettings ().getAllowFileAccess ();
//            webView.getSettings ().setAllowContentAccess (true);
        webSettings.setJavaScriptEnabled (true);

    }
}
