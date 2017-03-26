package com.oneapplab.a31html;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView browser;
        browser = (WebView) findViewById(R.id.webview);
        //Enable Javascript
        browser.getSettings().setJavaScriptEnabled(true);
        //Inject WebAppInterface methods into Web page by having Interface name 'Android'
        browser.addJavascriptInterface(new WebAppInterface(this), "Android");
        //Load URL inside WebView
        browser.loadUrl("http://cdn.wallpapersafari.com/16/44/nIdSWO.jpg");
        browser.setWebViewClient(new WebViewClient());


    }

    public class WebAppInterface {
        Context context;

        WebAppInterface(Context context) {
            this.context = context;
        }

        @JavascriptInterface

        public void showToast(String toast) {
            Toast.makeText(context, "", Toast.LENGTH_SHORT).show();
        }

        @JavascriptInterface

        public void moveToNextScreen() {


            Intent chnIntent = new Intent(MainActivity.this, ChennaiIntent.class);
            startActivity(chnIntent);


        }
    }
}
