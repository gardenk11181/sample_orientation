package com.gardenlab.sampleorientation;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showToast("onCreate() called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        showToast("onStart() called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        showToast("onStop() called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        showToast("onDestroy() called");
    }

    public void showToast(String data) {
        Toast.makeText(this, data, Toast.LENGTH_LONG).show();
    }
}
