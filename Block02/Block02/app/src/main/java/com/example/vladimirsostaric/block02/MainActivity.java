package com.example.vladimirsostaric.block02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView animals = (ListView) findViewById(R.id.animalsList);

        final ArrayAdapter<CharSequence> animalsAdapter = ArrayAdapter.createFromResource(this, R.array.animals, android.R.layout.simple_list_item_1);
        animals.setAdapter(animalsAdapter);

        animals.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String message = getString(R.string.pickMessage) + " " + animalsAdapter.getItem(position);
                Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
