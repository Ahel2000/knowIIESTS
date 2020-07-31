package com.example.clg_pro;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import java.util.ArrayList;
import android.widget.TextView;
public class Canteens extends Activity {
    ListView lvCanteens;
    ArrayList<OurCanteen> list;
    TextView tvCanteen, tvCHead, tvList, tvRev, tvCanteen2, tvCanteen3, tvCanteen4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canteens);
        lvCanteens = (ListView) findViewById(R.id.lvCanteens);
        list = new ArrayList<OurCanteen>();
        tvCanteen = (TextView) findViewById(R.id.tvCanteen);
        tvCHead = (TextView) findViewById(R.id.tvCHead);
        tvList = (TextView) findViewById(R.id.tvList);
        OurCanteen c1 = new OurCanteen("Institute Canteen",
                "In the middle of IHall and S&T",
                "Meals",
                "Serves tasty rice meals and daily specials like Biriyani, Fried Rice,etc." +
                        "Bread, tea, maggi, etc are available in the morning. Clean area with hygienic kitchen.",
                "--",
                "Sounak",
                (float)4.3,
                "images1");
        list.add(c1);
        OurCanteen c2 = new OurCanteen("Ladies Canteen",
                "Beside Netaji Bhavan (Straight from Gate 1 and then left)",
                "Meals",
                "Cooking, servivg, cleaning all done by women. Serves rice meals, Rotis and snacks.",
                "--",
                "Sounak",
                (float)4.2,
                "images1");
        list.add(c2);
        OurCanteen c3 = new OurCanteen("Cafe inn",
                "Beside Netaji Bhavan (Straight from Gate 1 and then left)",
                "Meals",
                "Cooking, servivg, cleaning all done by women. Serves rice meals, Rotis and snacks.",
                "--",
                "Sounak",
                (float)4.4,
                "images1");
        list.add(c3);
        OurCanteen c4 = new OurCanteen("Mio amore",
                "Just opposite to the first gate",
                "Cakes,pastries and sandwiches",
                "Various types of tasty cakes,pastries,burgers,patties and sandwiches are served",
                "--",
                "Sounak",
                (float)4.6,
                "images1");
        OurCanteen c5 = new OurCanteen("Cafe Coffee Day",
                "Beside Netaji Bhavan (Straight from Gate 1 and then left)",
                "Permium Coffee",
                "Permium Coffee brand of India and subsidiary of Coffee Day Enterprises"+
                        "Limited. Since it is for the students the pricing is less.",
                "--",
                "Sounak",
                (float)4.2,
                "images1");
        OurCanteen c6 = new OurCanteen("NesCafe",
                "Just behind Cafe Coffe Day",
                "Multinational food and drinks",
                "Serves burgers, coffee and other soft drinks at reasonable prices",
                "--",
                "Sounak",
                (float)4.2,
                "images1");
        OurCanteen c7 = new OurCanteen("Metro Diary",
                "Just beside Cafe Coffe Day",
                "Ice-cream parlour",
                "Serves ice-cream,chips,milk products and other edible products",
                "--",
                "Sounak",
                (float)4.3,
                "images1");
        OurCanteen c8 = new OurCanteen("Student Canteen",
                "Straight from First Gate",
                "Snacks",
                "Serves patties,toffes,soft drinks, cake, chips and other necessary items.",
                "--",
                "Sounak",
                (float)3.8,
                "images1");
        OurCanteen c9 = new OurCanteen("Amul Store",
                "In the middle of IHall and S&T",
                "Snacks",
                "Serves ice-cream,sandwiches ,lassi ,other cold drinks etc ",
                "--",
                "Sounak",
                (float)4,
                "images1");
        OurCanteen c10 = new OurCanteen("Montu da's canteen",
                "Located in the basement of S&T building(straight from 2nd gate then left)",
                "Snacks",
                "Serves tea,bread,boiled eggs,Ghugnis etc.",
                "--",
                "Sounak",
                (float)4,
                "images1");
        OurCanteen c11 = new OurCanteen("Guest House Canteen",
                "ground floor of the Guest House(straight from First Gate)",
                "Meals",
                "All types of food like Breakfast, Lunch, Dinner etc are surved here. " +
                        "Both Veg and Non-Veg food is served here",
                "--",
                "Sounak",
                (float)4.1,
                "images1");
        OurCanteen c12 = new OurCanteen("Jyatamosai",
                "In the front of 2nd gate",
                "Sweets",
                "Sells sweets and evening snacks like singaras and kachuris. rves tasty rice meals and daily specials like Biriyani, Fried Rice,etc." +
                        "Also sells curd ,dhoklas etc",
                "--",
                "Sounak",
                (float)3.9,
                "images1");
        list.add(c5);
        list.add(c4);
        list.add(c6);
        list.add(c7);
        list.add(c12);
        list.add(c11);
        list.add(c10);
        list.add(c9);
        list.add(c8);
        CanteenAdapter adapter = new CanteenAdapter(this, list);
        lvCanteens.setAdapter(adapter);
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
                intent=new Intent(Canteens.this,menu.class);
                startActivity(intent);
                return true;
            case R.id.item2:
                intent=new Intent(Canteens.this,books.class);
                startActivity(intent);
                return true;
            case R.id.item3:
                intent=new Intent(Canteens.this,routes.class);
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
                Intent mainIntent = new Intent(Canteens.this , recruiting.class);
                startActivity(mainIntent);
                return true;
            case R.id.item7:
                intent=new Intent(Canteens.this,about_us.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}