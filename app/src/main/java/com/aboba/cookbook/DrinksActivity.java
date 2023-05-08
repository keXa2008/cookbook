package com.aboba.cookbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class DrinksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks);
        ListView drinksList = findViewById(R.id.drinksList);
        TextView drinkRecipe = findViewById(R.id.drinkRecipe);
        ListAdapter adapter = ArrayAdapter.createFromResource(
                this, R.array.drinks, android.R.layout.simple_list_item_1);
        String[] drinkRecipes = getApplicationContext().getResources().getStringArray(R.array.drinkRecipes);
        drinksList.setAdapter(adapter);
        drinksList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                              @Override
                                              public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                                  drinkRecipe.setText(drinkRecipes[position]);
                                              }
                                          }
        );
    }
}