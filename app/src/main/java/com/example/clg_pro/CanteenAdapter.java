package com.example.clg_pro;

import android.content.Context;
import android.provider.SyncStateContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class CanteenAdapter extends ArrayAdapter<OurCanteen>
{
    private final Context context;
    private final ArrayList<OurCanteen> values;
    public CanteenAdapter(@NonNull Context context, ArrayList<OurCanteen> list) {
        super(context, R.layout.row_layout, list);
        this.context = context;
        this.values = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View rowView=inflater.inflate(R.layout.row_layout, parent, false);
        RatingBar rt=(RatingBar) rowView.findViewById(R.id.rate);
        TextView tvName = (TextView) rowView.findViewById(R.id.tvName);
        TextView tvLocation = (TextView) rowView.findViewById(R.id.tvLocation);
        TextView tvPriority = (TextView) rowView.findViewById(R.id.tvPriority);
        TextView tvDes = (TextView) rowView.findViewById(R.id.tvDes);
        rt.setRating(values.get(position).getReview());
        tvName.setText(values.get(position).getName());
        tvLocation.setText("Location: "+values.get(position).getLocation());
        tvPriority.setText("Priority: "+values.get(position).getPriority());
        tvDes.setText("Description: "+values.get(position).getDes());
        String imageName = values.get(position).getIcon();
        int icon = context.getResources().getIdentifier(imageName,"drawable",context.getPackageName());
        return rowView;
    }
}
