package com.aboba.cookbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

public class SoupsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soups);
        ListView soupsList = findViewById(R.id.soupsList);
        TextView soupRecipe = findViewById(R.id.soupRecipe);
        ListAdapter adapter = ArrayAdapter.createFromResource(
                this, R.array.soups, android.R.layout.simple_list_item_1);
        String[] soupRecipes = getApplicationContext().getResources().getStringArray(R.array.soupRecipes);
        soupsList.setAdapter(adapter);
        soupsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                             @Override
                                             public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                                soupRecipe.setText(soupRecipes[position]);
                                             }
                                         }
        );
    }
}