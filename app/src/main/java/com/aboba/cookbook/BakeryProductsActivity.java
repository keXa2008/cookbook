package com.aboba.cookbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class BakeryProductsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bakery_products);
        ListView bakeryProductsList = findViewById(R.id.bakeryProductsList);
        TextView bakeryProductRecipe = findViewById(R.id.bakeryProductRecipe);
        ListAdapter adapter = ArrayAdapter.createFromResource(
                this, R.array.bakeryProducts, android.R.layout.simple_list_item_1);
        String[] bakeryProductRecipes = getApplicationContext().getResources().getStringArray(R.array.bakeryProductRecipes);
        bakeryProductsList.setAdapter(adapter);
        bakeryProductsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                              @Override
                                              public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                                  bakeryProductRecipe.setText(bakeryProductRecipes[position]);
                                              }
                                          }
        );
    }
}