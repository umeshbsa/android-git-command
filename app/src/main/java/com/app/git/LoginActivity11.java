package com.app.git;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

public class LoginActivity11 extends AppCompatActivity {

    public void launchActivity(Class<?> c) {
        Intent intent = new Intent(this, c);
        startActivity(intent);
    }
}
