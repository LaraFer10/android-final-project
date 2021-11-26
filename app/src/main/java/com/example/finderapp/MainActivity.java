package com.example.finderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;

import com.example.finderapp.services.OrderServices;

public class MainActivity extends AppCompatActivity {

    private OrderServices orderServices;
    protected View decorView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.orderServices = new OrderServices();
        setTheme(R.style.Theme_FinderApp);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        decorView = getWindow().getDecorView();
        decorView.setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() {
            @Override
            public void onSystemUiVisibilityChange(int visibility) {
                if (visibility == 0) {
                    decorView.setSystemUiVisibility(hideSystemBars());
                }
            }
        });
        Handler handle = new Handler();
        handle.postDelayed(new Runnable() {
            @Override public void run() {
                GetLoginActivity();
            }
        }, 2000);
    }

    private void GetLoginActivity() {
        Intent intent = new Intent(this, FindOrderActivity.class);
        startActivity(intent);
        finish();
    }

    // Método onWindowFocusChanged

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            decorView.setSystemUiVisibility(hideSystemBars());
        }
    }

    // Método hideSystemBars

    protected int hideSystemBars() {
        return View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION;
    }
}