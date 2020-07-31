package com.example.clg_pro;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView.OnItemSelectedListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.net.Uri;

import com.example.clg_pro.R;

import java.util.ArrayList;
import java.util.List;

public class books extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);
        final Spinner spinner = findViewById(R.id.spinner1);
        final List<String> list = new ArrayList<String>();
        list.add("BASIC ELECTRICAL ENGINEERING");
        list.add("CKC ENGINEERING BOOK");
        list.add("ELECTRIC CURRENTS BY CHESTER L DAWES");

        ArrayAdapter<String> adp1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, list);
        adp1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adp1);
        spinner.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = parent.getItemAtPosition(position).toString();
                if (selectedItem.equals("CKC ENGINEERING BOOK")) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://firebasestorage.googleapis.com/v0/b/unique-grid-263916.appspot.com/o/dlscrib.com_basic-electrical-engineering-by-chakrabartipdf.pdf?alt=media&token=71f41f81-2842-4b9c-95c4-fce3fc765bbd"));
                    startActivity(intent);
                    spinner.setSelection(0);
                } else if (selectedItem.equals("ELECTRIC CURRENTS BY CHESTER L DAWES")) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://drive.google.com/file/d/1NZfIAv6HXeunPbmuhJDndVTstcUAQDlr/view?usp=sharing"));
                    startActivity(intent);
                    spinner.setSelection(0);
                }
                selectedItem = "BASIC ELECTRICAL ENGINEERING";

            } // to close the onItemSelected

            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        final Spinner spinner2 = findViewById(R.id.spinner2);
        final List<String> list2 = new ArrayList<String>();
        list2.add("MATHS");
        list2.add("BSG");
        list2.add("diff calculus bc das bn Mukherjee ");
        list2.add("integral and differential calculus");

        ArrayAdapter<String> adp2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, list2);
        adp2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adp2);
        spinner2.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = parent.getItemAtPosition(position).toString();
                if (selectedItem.equals("BSG")) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://drive.google.com/file/d/1SCOmFGDqBL3jvVcx3dEebe0bHlwmZkBJ/view?usp=sharing"));
                    startActivity(intent);
                    spinner2.setSelection(0);
                } else if (selectedItem.equals("diff calculus bc das bn Mukherjee ")) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://firebasestorage.googleapis.com/v0/b/unique-grid-263916.appspot.com/o/diff%20calculus%20bc%20das%20bn%20Mukherjee%20.pdf?alt=media&token=cbc0c1e4-92b8-4319-925f-3af03fe9a6bb"));
                    startActivity(intent);
                    spinner2.setSelection(0);
                } else if (selectedItem.equals("integral and differential calculus")) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://firebasestorage.googleapis.com/v0/b/unique-grid-263916.appspot.com/o/integral%20and%20differential%20calculus.pdf?alt=media&token=cc3610c8-e646-452c-a3a2-ae31105437ba"));
                    startActivity(intent);
                    spinner2.setSelection(0);
                }

            } // to close the onItemSelected

            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        final Spinner spinner3 = findViewById(R.id.spinner3);
        final List<String> list3 = new ArrayList<String>();
        list3.add("COMPUTER");
        list3.add("LET US C");
        ArrayAdapter<String> adp3 = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, list3);
        adp3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adp3);
        spinner3.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = parent.getItemAtPosition(position).toString();
                if (selectedItem.equals("LET US C")) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://firebasestorage.googleapis.com/v0/b/unique-grid-263916.appspot.com/o/c%20book.pdf?alt=media&token=05dd7aba-825e-4f1e-be5a-b9a49260a973"));
                    startActivity(intent);
                    spinner3.setSelection(0);
                }

            } // to close the onItemSelected

            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        final Spinner spinner4 = findViewById(R.id.spinner4);
        final List<String> list4 = new ArrayList<String>();
        list4.add("PHYSICS");
        list4.add("BK GUHA (SPECIFIC PARTS FOR 1ST YEAR)");
        list4.add("VECTOR ANALYSIS BY SPIGEL");
        list4.add("CONCEPT OF MODERN PHYSICS BY BEISER");
        list4.add("PERSPECTIVE OF MODERN PHYSICS");
        list4.add("INTRODUCTION TO SPECIAL RELATIVITY ");
        ArrayAdapter<String> adp4 = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, list4);
        adp4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4.setAdapter(adp4);
        spinner4.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = parent.getItemAtPosition(position).toString();
                if (selectedItem.equals("VECTOR ANALYSIS BY SPIGEL")) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://firebasestorage.googleapis.com/v0/b/unique-grid-263916.appspot.com/o/arquivo19_1.pdf?alt=media&token=7ad4d510-2498-4044-8716-99bc4b297fda"));
                    startActivity(intent);
                    spinner4.setSelection(0);
                } else if (selectedItem.equals("INTRODUCTION TO SPECIAL RELATIVITY ")) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://drive.google.com/file/d/1Hg1CfBmR5qE5_HEDZ4vkyNNkzE3LNX13/view?usp=sharing"));
                    startActivity(intent);
                    spinner4.setSelection(0);
                } else if (selectedItem.equals("PERSPECTIVE OF MODERN PHYSICS")) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://firebasestorage.googleapis.com/v0/b/unique-grid-263916.appspot.com/o/Perspective%20of%20Modern%20Physics_compressed.pdf?alt=media&token=7760ed52-0ee9-422b-a8b2-e264b1423953"));
                    startActivity(intent);
                    spinner4.setSelection(0);
                } else if (selectedItem.equals("CONCEPT OF MODERN PHYSICS BY BEISER")) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://firebasestorage.googleapis.com/v0/b/unique-grid-263916.appspot.com/o/Concepts_of_Modern_Physics_by_Beiser-min.pdf?alt=media&token=1bab4c02-8bf3-4423-b41f-03d65aa592ef"));
                    startActivity(intent);
                    spinner4.setSelection(0);
                } else if (selectedItem.equals("BK GUHA (SPECIFIC PARTS FOR 1ST YEAR)")) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://firebasestorage.googleapis.com/v0/b/unique-grid-263916.appspot.com/o/bk%20guha_compressed.pdf?alt=media&token=74efb35b-6805-4fc6-9fb6-ea5004e90302"));
                    startActivity(intent);
                    spinner4.setSelection(0);
                }

            } // to close the onItemSelected

            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        final Spinner spinner5 = findViewById(R.id.spinner5);
        final List<String> list5 = new ArrayList<String>();
        list5.add("ENGINEERING DRAWING");
        list5.add("ENGINNERING DRAWING BY N.D. BHATT");
        ArrayAdapter<String> adp5 = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, list5);
        adp5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner5.setAdapter(adp5);
        spinner5.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = parent.getItemAtPosition(position).toString();
                if (selectedItem.equals("ENGINNERING DRAWING BY N.D. BHATT")) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://drive.google.com/file/d/1DaJFuHUWD3G109CiP3n88YEwPlSj2-D9/view?usp=sharing"));
                    startActivity(intent);
                    spinner5.setSelection(0);
                }

            } // to close the onItemSelected

            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        final Spinner spinner6 = findViewById(R.id.spinner6);
        final List<String> list6 = new ArrayList<String>();
        list6.add("ENVIRONMENT");
        list6.add("ENVIRONMENTAL ENGINNERING BY PEAVY ROWE");
        ArrayAdapter<String> adp6 = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, list6);
        adp6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner6.setAdapter(adp6);
        spinner6.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = parent.getItemAtPosition(position).toString();
                if (selectedItem.equals("ENVIRONMENTAL ENGINNERING BY PEAVY ROWE")) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://drive.google.com/file/d/11vqauC-gdWYwmbyPsualuQ3Z8svXQPjZ/view?usp=sharing"));
                    startActivity(intent);
                    spinner6.setSelection(0);
                }

            } // to close the onItemSelected

            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        final Spinner spinner7 = findViewById(R.id.spinner7);
        final List<String> list7 = new ArrayList<String>();
        list7.add("MECHANICS");
        list7.add("ENGINEERING MECHANICS STATICS");
        ArrayAdapter<String> adp7 = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, list7);
        adp7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner7.setAdapter(adp7);
        spinner7.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = parent.getItemAtPosition(position).toString();
                if (selectedItem.equals("ENGINEERING MECHANICS STATICS")) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://drive.google.com/file/d/1c7M0JNlwT7XXTTGXY3jWYT0UnsEeHeEV/view?usp=sharing"));
                    startActivity(intent);
                    spinner7.setSelection(0);
                }

            } // to close the onItemSelected

            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        final Spinner spinner8 = findViewById(R.id.spinner8);
        final List<String> list8 = new ArrayList<String>();
        list8.add("PREVIOUS YEARS PAPERS");
        list8.add("PREVIOUS YEARS PAPERS COLLECTION1");
        list8.add("PREVIOUS YEARS PAPERS COLLECTION2");
        ArrayAdapter<String> adp8 = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, list7);
        adp8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner8.setAdapter(adp8);
        spinner8.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = parent.getItemAtPosition(position).toString();
                if (selectedItem.equals("PREVIOUS YEARS PAPERS COLLECTION1")) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://drive.google.com/file/d/1s8-pfYDJp1ljY0Qz_75_ek_gEa0nbSFU/view?usp=sharing"));
                    startActivity(intent);
                    spinner8.setSelection(0);
                } else if (selectedItem.equals("PREVIOUS YEARS PAPERS COLLECTION2")) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://drive.google.com/file/d/1zVpgSJPRg38XFhf4AIAksg1UvYgIF_Z4/view?usp=sharing"));
                    startActivity(intent);
                    spinner8.setSelection(0);
                }

            } // to close the onItemSelected

            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        final Spinner spinner9 = findViewById(R.id.spinner9);
        final List<String> list9 = new ArrayList<String>();
        list9.add("LAB MANUAL SPECIMENS");
        list9.add("BASIC ELECTRICAL ENGINEERING");
        list9.add("CHEMISTRY");
        ArrayAdapter<String> adp9 = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, list9);
        adp9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner9.setAdapter(adp9);
        spinner9.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = parent.getItemAtPosition(position).toString();
                if (selectedItem.equals("BASIC ELECTRICAL ENGINEERING")) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://drive.google.com/file/d/1c7M0JNlwT7XXTTGXY3jWYT0UnsEeHeEV/view?usp=sharing"));
                    startActivity(intent);
                    spinner9.setSelection(0);
                } else if (selectedItem.equals("CHEMISTRY")) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://drive.google.com/file/d/1c7M0JNlwT7XXTTGXY3jWYT0UnsEeHeEV/view?usp=sharing"));
                    startActivity(intent);
                    spinner9.setSelection(0);
                }

            } // to close the onItemSelected

            public void onNothingSelected(AdapterView<?> parent) {

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
                intent=new Intent(books.this,menu.class);
                startActivity(intent);
                return true;
            case R.id.item2:
                intent=new Intent(books.this,books.class);
                startActivity(intent);
                return true;
            case R.id.item3:
                intent=new Intent(books.this,routes.class);
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
                Intent mainIntent = new Intent(books.this , recruiting.class);
                startActivity(mainIntent);
                return true;
            case R.id.item7:
                intent=new Intent(books.this,about_us.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}