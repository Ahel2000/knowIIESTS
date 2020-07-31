package com.example.clg_pro;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Reflexobeta extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reflexobeta);
    }

    public void site(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCjf6ktb7nJrmzcuHMb4x9qQ?fbclid=IwAR2_TBFfaOBFq1kl32m1cSsVspKARNcRZ_AvDux0CqRoB4ccH8HiEvxAhNU"));
        startActivity(browserIntent);
    }

    public void fb(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/reflexobeta/"));
        startActivity(browserIntent);
    }
}