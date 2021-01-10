package com.example.im_yubi.tfeducation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CoverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cover);
    }

    public void vClick(View view) {
        Intent intent = new Intent(this, FormActivity.class);
        startActivity(intent);
        finish();
    }
}
