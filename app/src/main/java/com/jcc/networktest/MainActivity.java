package com.jcc.networktest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webView = (WebView)findViewById(R.id.web_view);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
        webView.loadUrl("http://www.baidu.com");
    }

    public void buttonGoHttpClick(View view) {
        startActivity(new Intent(this, HttpTest.class));
    }

    public void buttonGoLocationClick(View view) {
        startActivity(new Intent(this, LocationTest.class));
    }

    public void buttonBaiduMapClick(View view) {
        startActivity(new Intent(this, BaiduMapTest.class));
    }
}
