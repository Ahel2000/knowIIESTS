package com.example.clg_pro;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;

public class grading extends Activity {
    Button but;
    Button but1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grading);
        //pdf=findViewById(R.id.pdf1);
        but=findViewById(R.id.but);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1aUMX_tp-x8-v5gGjXZFfL71JyExWMS0A/view?usp=sharing"));
                startActivity(intent);
            }
        });
        but1=findViewById(R.id.but1);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1EMN4_8yFqKAiYrJJSfJr3s9MSYucoF2G/view?usp=sharing"));
                startActivity(intent);
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
                intent=new Intent(grading.this,menu.class);
                startActivity(intent);
                return true;
            case R.id.item2:
                intent=new Intent(grading.this,books.class);
                startActivity(intent);
                return true;
            case R.id.item3:
                intent=new Intent(grading.this,routes.class);
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
                Intent mainIntent = new Intent(grading.this , recruiting.class);
                startActivity(mainIntent);
                return true;
            case R.id.item7:
                intent=new Intent(grading.this,about_us.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}