package com.example.clg_pro;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Codeiiest extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_codeiiest);
    }

    public void site(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://codeiiest.github.io/"));
        startActivity(browserIntent);
    }

    public void fb(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/CodeIIEST/"));
        startActivity(browserIntent);
    }
}