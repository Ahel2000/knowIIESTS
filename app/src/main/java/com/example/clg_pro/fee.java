package com.example.clg_pro;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;



public class fee extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fee);

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.popup_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent;
        switch (item.getItemId()) {

            case R.id.item1:
                intent=new Intent(fee.this,menu.class);
                startActivity(intent);
                return true;
            case R.id.item2:
                intent=new Intent(fee.this,books.class);
                startActivity(intent);
                return true;
            case R.id.item3:
                intent=new Intent(fee.this,routes.class);
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
                Intent mainIntent = new Intent(fee.this , recruiting.class);
                startActivity(mainIntent);
                return true;
            case R.id.item7:
                intent=new Intent(fee.this,about_us.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}