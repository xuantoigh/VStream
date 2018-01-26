package com.example.legen.vstream;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

@SuppressLint("SetJavaScriptEnabled")
public class MainActivity extends AppCompatActivity {

    private WebView mWebView1, mWebView2, mWebView3, mWebView4;
    private Button mButton1, mButton2, mButton3, mButton4;

    private static final String ip1 = "http://169.254.201.103:9000/javascript_simple.html";
    private static final String ip2 = "http://169.254.201.103:9000/javascript_simple.html";
    private static final String ip3 = "http://169.254.201.103:9000/javascript_simple.html";
    private static final String ip4 = "http://169.254.201.103:9000/javascript_simple.html";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        showFull();
        run();
    }

    private void init(){
        mWebView1 = findViewById(R.id.webView1);
        mWebView2 = findViewById(R.id.webView2);
        mWebView3 = findViewById(R.id.webView3);
        mWebView4 = findViewById(R.id.webView4);

        mButton1 = findViewById(R.id.button1);
        mButton2 = findViewById(R.id.button2);
        mButton3 = findViewById(R.id.button3);
        mButton4 = findViewById(R.id.button4);
    }

    private void run(){
        //cam 1
        mWebView1.setWebViewClient(new MyWebViewClient(ip1));
        mWebView1.getSettings().setLoadsImagesAutomatically(true);
        mWebView1.getSettings().setJavaScriptEnabled(true);
        mWebView1.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        mWebView1.loadUrl(ip1);
        //cam 2
        mWebView2.setWebViewClient(new MyWebViewClient(ip2));
        mWebView2.getSettings().setLoadsImagesAutomatically(true);
        mWebView2.getSettings().setJavaScriptEnabled(true);
        mWebView2.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        mWebView2.loadUrl(ip2);
        //cam 3
        mWebView3.setWebViewClient(new MyWebViewClient(ip3));
        mWebView3.getSettings().setLoadsImagesAutomatically(true);
        mWebView3.getSettings().setJavaScriptEnabled(true);
        mWebView3.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        mWebView3.loadUrl(ip3);
        //cam 4
        mWebView4.setWebViewClient(new MyWebViewClient(ip4));
        mWebView4.getSettings().setLoadsImagesAutomatically(true);
        mWebView4.getSettings().setJavaScriptEnabled(true);
        mWebView4.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        mWebView4.loadUrl(ip4);
    }
    private void showFull(){
        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FullscreenActivity.class);
                intent.putExtra("ip",ip1);
                startActivity(intent);
            }
        });
        mWebView2.loadUrl(ip2);
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FullscreenActivity.class);
                intent.putExtra("ip",ip2);
                startActivity(intent);
            }
        });
        mWebView3.loadUrl(ip3);
        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FullscreenActivity.class);
                intent.putExtra("ip",ip3);
                startActivity(intent);
            }
        });
        mWebView4.loadUrl(ip4);
        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FullscreenActivity.class);
                intent.putExtra("ip",ip4);
                startActivity(intent);
            }
        });

    }
}