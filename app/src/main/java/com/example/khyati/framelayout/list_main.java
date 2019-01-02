package com.example.khyati.framelayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class list_main extends AppCompatActivity {
    ListView list;

    String[] maintitle ={
            "Amul Gold","Amul Taaza",
            "Amul Shakti","Amul Deshi",
            "Amul Diamond","Amul Moti","Amul TeaSpacial","Amul Chaimaza","Amul CowMilk","Amul SlimTrim"
    };

    Integer[] imgid={
            R.drawable.amulgold,
            R.drawable.amultaaza500ml,
            R.drawable.amulshakti1l,
            R.drawable.amuldeshi,
            R.drawable.amuldiamond,
            R.drawable.amulmoti500,
            R.drawable.amulteaspecial,
            R.drawable.chaimaza,
            R.drawable.cowmilk,
            R.drawable.slimtrim
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_main);
        listofproducts_adapter adapter=new listofproducts_adapter(this, maintitle,imgid);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // TODO Auto-generated method stub
                if(position == 0) {
                    Intent intent =new Intent(list_main.this,sub_cat_gold.class);
                    startActivity(intent);


                    //code specific to first list item
                    Toast.makeText(getApplicationContext(),"Amul Gold",Toast.LENGTH_SHORT).show();
                }

                else if(position == 1) {
                    //code specific to 2nd list item
                    Toast.makeText(getApplicationContext(),"Amul Taaza",Toast.LENGTH_SHORT).show();
                    Intent intent =new Intent(list_main.this,sub_cat_taza.class);
                    startActivity(intent);
                }

                else if(position == 2) {

                    Toast.makeText(getApplicationContext(),"Amul Shakti",Toast.LENGTH_SHORT).show();
                    Intent intent =new Intent(list_main.this,sub_cat_shakti.class);
                    startActivity(intent);
                }
                else if(position == 3) {

                    Toast.makeText(getApplicationContext(),"Amul Deshi",Toast.LENGTH_SHORT).show();
                    Intent intent =new Intent(list_main.this,sub_cat_deshi.class);
                    startActivity(intent);
                }
                else if(position == 4) {

                    Toast.makeText(getApplicationContext(),"Amul Diamond",Toast.LENGTH_SHORT).show();
                    Intent intent =new Intent(list_main.this,sub_cat_diamond.class);
                    startActivity(intent);
                }
                else if(position == 5) {

                    Toast.makeText(getApplicationContext(),"Amul Moti",Toast.LENGTH_SHORT).show();
                    Intent intent =new Intent(list_main.this,sub_cat_moti.class);
                    startActivity(intent);
                }
                else if(position == 6) {

                    Toast.makeText(getApplicationContext(),"Amul Teaspacial",Toast.LENGTH_SHORT).show();
                    Intent intent =new Intent(list_main.this,sub_cat_teaspacial.class);
                    startActivity(intent);
                }
                else if(position == 7) {

                    Toast.makeText(getApplicationContext(),"Amul Chaimaza",Toast.LENGTH_SHORT).show();
                    Intent intent =new Intent(list_main.this,sub_cat_chaimaza.class);
                    startActivity(intent);
                }
                else if(position == 8) {

                    Toast.makeText(getApplicationContext(),"Amul CowMilk",Toast.LENGTH_SHORT).show();
                    Intent intent =new Intent(list_main.this,sub_cat_cow_milk.class);
                    startActivity(intent);
                }
                else if(position == 9) {

                    Toast.makeText(getApplicationContext(),"Amul SlimTrim",Toast.LENGTH_SHORT).show();
                    Intent intent =new Intent(list_main.this,sub_cat_slim_trim.class);
                    startActivity(intent);
                }

            }
        });
    }
}


