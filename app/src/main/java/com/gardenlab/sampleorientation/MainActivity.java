package com.gardenlab.sampleorientation;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private String name;
    private EditText editText;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showToast("onCreate() called");

        editText = findViewById(R.id.editText);
        editText.setPadding(20,0,0,0);
        Button btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = editText.getText().toString();
                showToast("Saved in Variable");
            }
        });

        if(savedInstanceState!=null) {
            name = savedInstanceState.getString("name");
            showToast("Recover value : " + name);
        }

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

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("name", name); // name변수의 값 저장
    }

    public void showToast(String data) {
        Toast.makeText(this, data, Toast.LENGTH_SHORT).show();
    }
}
