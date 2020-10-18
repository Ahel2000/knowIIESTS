package com.example.clg_pro;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class about_us extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        ImageButton m1=(ImageButton)findViewById(R.id.mail1);
        ImageButton m2=(ImageButton)findViewById(R.id.mail2);
        ImageButton m3=(ImageButton)findViewById(R.id.mail3);
        ImageButton m4=(ImageButton)findViewById(R.id.mail4);
        ImageButton m5=(ImageButton)findViewById(R.id.mail5);
        ImageButton m6=(ImageButton)findViewById(R.id.mail6);
        ImageButton l1=(ImageButton)findViewById(R.id.linkedin1);
        ImageButton l2=(ImageButton)findViewById(R.id.linkedin2);
        ImageButton l3=(ImageButton)findViewById(R.id.linkedin3);
        ImageButton l4=(ImageButton)findViewById(R.id.linkedin4);
        ImageButton l5=(ImageButton)findViewById(R.id.linkedin5);
        ImageButton l6=(ImageButton)findViewById(R.id.linkedin6);

        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_EMAIL,new String[]{"sounakmajumder472@gmail.com"});

                if ((intent.resolveActivity(getPackageManager())!=null)){
                    startActivity(intent);
                }
            }
        });

        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_EMAIL,new String[]{"anishde85@gmail.com"});

                if ((intent.resolveActivity(getPackageManager())!=null)){
                    startActivity(intent);
                }
            }
        });

        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_EMAIL,new String[]{"aheldc4@gmail.com"});

                if ((intent.resolveActivity(getPackageManager())!=null)){
                    startActivity(intent);
                }
            }
        });

        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_EMAIL,new String[]{"devtanumisra@gmail.com"});

                if ((intent.resolveActivity(getPackageManager())!=null)){
                    startActivity(intent);
                }
            }
        });

        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_EMAIL,new String[]{"dsnehasish74@gmail.com"});

                if ((intent.resolveActivity(getPackageManager())!=null)){
                    startActivity(intent);
                }
            }
        });

        m6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_EMAIL,new String[]{"malaygain10@gmail.com"});

                if ((intent.resolveActivity(getPackageManager())!=null)){
                    startActivity(intent);
                }
            }
        });

        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/sounak-majumder-45b183197/"));
                startActivity(browserIntent);
            }
        });

        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/anish-de-1b090a193/"));
                startActivity(browserIntent);
            }
        });

        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/ahel-das-chatterjee-5145131a0/"));
                startActivity(browserIntent);
            }
        });

        l4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/devtanu-misra-1829441a0/"));
                startActivity(browserIntent);
            }
        });

        l5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/snehasish-dhar-b657721a0/"));
                startActivity(browserIntent);
            }
        });

        l6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/malay-gain-43466419a/"));
                startActivity(browserIntent);
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
                intent=new Intent(about_us.this,menu.class);
                startActivity(intent);
                return true;
            case R.id.item2:
                intent=new Intent(about_us.this,books.class);
                startActivity(intent);
                return true;
            case R.id.item3:
                intent=new Intent(about_us.this,routes.class);
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
                Intent mainIntent = new Intent(about_us.this , recruiting.class);
                startActivity(mainIntent);
                return true;
            case R.id.item7:
                intent=new Intent(about_us.this,about_us.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
