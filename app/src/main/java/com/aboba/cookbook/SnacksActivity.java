package com.aboba.cookbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class SnacksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snacks);
        ListView snacksList = findViewById(R.id.snacksList);
        TextView snackRecipe = findViewById(R.id.snackRecipe);
        ListAdapter adapter = ArrayAdapter.createFromResource(
                this, R.array.snacks, android.R.layout.simple_list_item_1);
        String[] snacksRecipes = getApplicationContext().getResources().getStringArray(R.array.snackRecipes);
        snacksList.setAdapter(adapter);
        snacksList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                              @Override
                                              public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                                  snackRecipe.setText(snacksRecipes[position]);
                                              }
                                          }
        );
    }
}