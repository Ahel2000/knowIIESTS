package com.example.clg_pro;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class clubs extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clubs);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.popup_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void lesthespians(View view){
        Intent intent=new Intent(clubs.this,Lesthespians.class);
        startActivity(intent);
    }
    public void scage(View view){
        Intent intent=new Intent(clubs.this,Scage.class);
        startActivity(intent);
    }
    public void quizomaniac(View view){
        Intent intent=new Intent(clubs.this,Quizomaniac.class);
        startActivity(intent);
    }
    public void catharsis(View view){
        Intent intent=new Intent(clubs.this,Catharsis.class);
        startActivity(intent);
    }
    public void litsoc(View view){
        Intent intent=new Intent(clubs.this,Litsoc.class);
        startActivity(intent);
    }
    public void reflexobeta(View view){
        Intent intent=new Intent(clubs.this,Reflexobeta.class);
        startActivity(intent);
    }
    public void codeiiest(View view){
        Intent intent=new Intent(clubs.this,Codeiiest.class);
        startActivity(intent);
    }
    public void debsoc(View view){
        Intent intent=new Intent(clubs.this,Debsoc.class);
        startActivity(intent);
    }
    public void robodarshan(View view){
        Intent intent=new Intent(clubs.this,Robodarshan.class);
        startActivity(intent);
    }
    public void ichche(View view){
        Intent intent=new Intent(clubs.this,Ichche.class);
        startActivity(intent);
    }
    public void euphony(View view){
        Intent intent=new Intent(clubs.this,Euphony.class);
        startActivity(intent);
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent;
        switch (item.getItemId()) {

            case R.id.item1:
                intent=new Intent(clubs.this,menu.class);
                startActivity(intent);
                return true;
            case R.id.item2:
                intent=new Intent(clubs.this,books.class);
                startActivity(intent);
                return true;
            case R.id.item3:
                intent=new Intent(clubs.this,routes.class);
                startActivity(intent);
                return true;
            case R.id.item4:
                Intent browserIntent1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Indian+Institute+of+Engineering+Science+And+Technology,+Shibpur,+P.O.+-+Botanic+Garden,+Howrah,+West+Bengal+711103/@22.5551808,88.3071379,17z/data=!4m2!3m1!1s0x3a0279c91a8d2d49:0xc6ee508c74cf031d"));
                startActivity(browserIntent1);
                return true;
            case R.id.item5:
                Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://yournewabode.blogspot.com/"));
                startActivity(browserIntent);
                return true;
            case R.id.item6:
                Intent mainIntent = new Intent(clubs.this , recruiting.class);
                startActivity(mainIntent);
                return true;
            case R.id.item7:
                intent=new Intent(clubs.this,about_us.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}