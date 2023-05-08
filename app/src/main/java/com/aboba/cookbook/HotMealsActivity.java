package com.aboba.cookbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class HotMealsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hot_meals);
        ListView soupsList = findViewById(R.id.hotMealsList);
        TextView soupRecipe = findViewById(R.id.hotMealRecipe);
        ListAdapter adapter = ArrayAdapter.createFromResource(
                this, R.array.hotMeals, android.R.layout.simple_list_item_1);
        String[] hotMealRecipes = getApplicationContext().getResources().getStringArray(R.array.hotMealRecipes);
        soupsList.setAdapter(adapter);
        soupsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                             @Override
                                             public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                                 soupRecipe.setText(hotMealRecipes[position]);
                                             }
                                         }
        );
    }
}