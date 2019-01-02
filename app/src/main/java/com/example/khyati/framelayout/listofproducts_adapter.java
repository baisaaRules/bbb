package com.example.khyati.framelayout;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.khyati.framelayout.R;

public class listofproducts_adapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] maintitle;
    private final Integer[] imgid;

    public listofproducts_adapter(Activity context, String[] maintitle, Integer[] imgid) {
        super(context, R.layout.activity_listofproducts_adapter, maintitle);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.maintitle=maintitle;
        this.imgid=imgid;

    }
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.activity_listofproducts_adapter, null, true);

        TextView titleText = (TextView) rowView.findViewById(R.id.title);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);


        titleText.setText(maintitle[position]);
        imageView.setImageResource(imgid[position]);

        return rowView;


//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_listofproducts_adapter);
//
// }
    };
}
