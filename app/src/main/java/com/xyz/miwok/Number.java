package com.xyz.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class Number extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

      // arrayList of word adapter
        ArrayList<Word> words=new ArrayList<Word>();

//        Word w=new Word("one","lutti");
//        words.add(w);
        words.add(new Word("one","lutti"));
        words.add(new Word("two","ottiko"));
        words.add(new Word("three","tolookosu"));
        words.add(new Word("four","oyyisa"));
        words.add(new Word("five","massokka"));
        words.add(new Word("six","temmokka"));
        words.add(new Word("seven","kenekaku"));
        words.add(new Word("eight","kawinta"));
        words.add(new Word("nine","wo'e"));
        words.add(new Word("ten","na'aacha"));

//        words.add("One");
  // ArrayList<String> words= new ArrayList<String>();

//        ArrayAdapter<Word> itemsAdapter =new ArrayAdapter<Word>(this,R.layout.list_item,words);
     WordAdapter adapter=new WordAdapter(this,words);
        ListView listView=(ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);






//        ArrayList<String> restaurantsToTry=new ArrayList<String>();
//        restaurantsToTry.add("Morning Cafe");
//        restaurantsToTry.add("BBQ Time");
//
//        restaurantsToTry.remove(0);
//        int numberOfRestaurants=restaurantsToTry.size();

    }
}
