package ru.sberbank.lesson2.task.simple;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class BrowserActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser);

        WebView uriWebView = findViewById(R.id.uriWebView);
        uriWebView.getSettings().setJavaScriptEnabled(true);
        uriWebView.setWebViewClient(new WebViewClient());
        Uri uri = getIntent().getData();
        if (uri != null) {
            uriWebView.loadUrl(uri.toString());
        }
    }
}
