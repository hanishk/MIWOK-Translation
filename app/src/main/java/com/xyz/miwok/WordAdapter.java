package com.xyz.miwok;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;
import  android.app.Activity;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    public  WordAdapter(Activity context , ArrayList<Word> words){
        super(context,0,words);
    }
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
       View listItemView =convertView;
        // there is no listView to show then call inflate method parent is listitem and false doenst add another listView
          if(listItemView == null){
              listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
          }

//          getItem is called from super class arrayadapter

        Word currentword = getItem(position);

        TextView miwokTextView =(TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentword.getMmiwokTranslation());

        TextView defaultTextView =(TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentword.getMdefaultTranslation());



        return  listItemView;
     }
}
