package com.ozgur.DiamondTest;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class GridAdapter extends BaseAdapter {

    Context context;
    private final String [] values;
    //private final int [] images;
    LayoutInflater layoutInflater;

    public GridAdapter(Context context, String[] values) {
        this.context = context;
        this.values = values;
    }

    @Override
    public int getCount() {
        return values.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);


        Holder holder = new Holder();
        View rowView;

        rowView = layoutInflater.inflate(R.layout.singleitem, null);
        //holder.tv =( TextView) rowView.findViewById(R.id.textview);
        //holder.img = (ImageView) rowView.findViewById(R.id.imageview);

        //holder.tv.setText(values[position]);
        //holder.img.setImageResource(images[position]);

        rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(GridAdapter.this.context.getApplicationContext(),activity_camera.class);
                I.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

                GridAdapter.this.context.getApplicationContext().startActivity(I);

                //Toast.makeText(context, "You Clicked "+values[position], Toast.LENGTH_LONG).show();

            }
        });

        return rowView;
    }

    public class Holder
    {
        TextView tv;
        ImageView img;
    }

}
