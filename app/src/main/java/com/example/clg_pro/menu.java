package com.example.clg_pro;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.view.View;




public class menu extends Activity {
    ImageButton btn1;
    ImageButton btn2;
    ImageButton btn3;
    ImageButton btn4;
    ImageButton btn5;
    ImageButton btn6;
    ImageButton btn7;
    ImageButton btn8;
    ImageButton btn10;
    ImageButton btn11;
    ImageButton btn12;
    ImageButton btn13;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        btn1=(ImageButton)findViewById(R.id.i1);
        btn2=(ImageButton)findViewById(R.id.i2);
        btn3=(ImageButton)findViewById(R.id.i3);
        btn4=(ImageButton)findViewById(R.id.i4);
        btn5=(ImageButton)findViewById(R.id.i5);
        //btn6.findViewById(R.id.i6);
        btn7=(ImageButton)findViewById(R.id.i7);
        btn8=(ImageButton)findViewById(R.id.i8);
        btn10=(ImageButton)findViewById(R.id.i10);
        btn11=(ImageButton)findViewById(R.id.i11);
        btn12=(ImageButton)findViewById(R.id.i12);
        btn13=(ImageButton)findViewById(R.id.i13);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(menu.this , books.class);
                startActivity(mainIntent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(menu.this , grading.class);
                startActivity(mainIntent);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(menu.this , Canteens.class);
                startActivity(mainIntent);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(menu.this , clubs.class);
                startActivity(mainIntent);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(menu.this , routes.class);
                startActivity(mainIntent);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Indian+Institute+of+Engineering+Science+And+Technology,+Shibpur,+P.O.+-+Botanic+Garden,+Howrah,+West+Bengal+711103/@22.5551808,88.3071379,17z/data=!4m2!3m1!1s0x3a0279c91a8d2d49:0xc6ee508c74cf031d"));
                startActivity(browserIntent1);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(menu.this , tourist.class);
                startActivity(mainIntent);
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://yournewabode.blogspot.com/"));
                startActivity(intent);
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(menu.this , fee.class);
                startActivity(mainIntent);
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(menu.this , recruiting.class);
                startActivity(mainIntent);
            }
        });
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(menu.this , about_us.class);
                startActivity(mainIntent);
            }
        });

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
                intent=new Intent(menu.this,menu.class);
                startActivity(intent);
                return true;
            case R.id.item2:
                intent=new Intent(menu.this,books.class);
                startActivity(intent);
                return true;
            case R.id.item3:
                intent=new Intent(menu.this,routes.class);
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
                Intent mainIntent = new Intent(menu.this , recruiting.class);
                startActivity(mainIntent);
                return true;
            case R.id.item7:
                intent=new Intent(menu.this,about_us.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
