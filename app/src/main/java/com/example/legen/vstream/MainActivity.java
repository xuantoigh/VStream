package com.example.legen.vstream;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    private VideoView mVideoView1;
    private WebView  mWebView2, mWebView3, mWebView4;
    private Button mButton1, mButton2, mButton3, mButton4;

    final private String ip1 = "";
    final private String ip2 = "http://169.254.201.103:9000/?action=stream";
    final private String ip3 = "";
    final private String ip4 = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        showFull();
    }

    private void init(){
        mVideoView1 = findViewById(R.id.videoView1);
        mWebView2 = findViewById(R.id.webView2);
        mWebView3 = findViewById(R.id.webView3);
        mWebView4 = findViewById(R.id.webView4);

        mButton1 = findViewById(R.id.button1);
        mButton2 = findViewById(R.id.button2);
        mButton3 = findViewById(R.id.button3);
        mButton4 = findViewById(R.id.button4);
    }

    private void showFull(){
        Uri video = Uri.parse(ip1);
        //mVideoView1.setVideoURI(video);
        //mVideoView1.setVideoPath(ip1);
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
