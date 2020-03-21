package com.example.simple2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class MainActivity extends ListActivity {
    String[] countries={"Russia","USA","Canada","France"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_gallery_item,countries);
        setListAdapter(adapter);
    }
}
