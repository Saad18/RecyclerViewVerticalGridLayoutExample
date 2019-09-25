package com.example.recyclerviewexample;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHOlder>{
    private Context context;
    private ArrayList<String> personName;
    private ArrayList<Integer> personImage;

    CustomAdapter(Context context, ArrayList<String> personName, ArrayList<Integer> personImage) {
        this.context = context;
        this.personName = personName;
        this.personImage = personImage;
    }


    @NonNull
    @Override
    public ViewHOlder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from( context );
        View v = inflater.inflate( R.layout.rowlayout,parent,false );
        return new ViewHOlder( v );
    }

    @Override
    public void onBindViewHolder( ViewHOlder holder, final int position) {
        holder.name.setText(  personName.get( position ) );
        holder.image.setImageResource( personImage.get( position ) );

        holder.itemView.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (context,SecondActivity.class);
                intent.putExtra( "image",(int) personImage.get(position) );
                context.startActivity( intent );
            }
        } );

    }

    @Override
    public int getItemCount() {
        return personName.size();
    }

    static class ViewHOlder extends RecyclerView.ViewHolder {
        TextView name;
        ImageView image;
        ViewHOlder( View itemView) {
            super( itemView );
             name = itemView.findViewById( R.id.name );
             image = itemView.findViewById( R.id.image );
        }
    }
}