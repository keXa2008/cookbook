package com.aboba.cookbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class SaladsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salads);
        ListView saladsList = findViewById(R.id.saladsList);
        TextView saladRecipe = findViewById(R.id.saladRecipe);
        ListAdapter adapter = ArrayAdapter.createFromResource(
                this, R.array.salads, android.R.layout.simple_list_item_1);
        String[] saladRecipes = getApplicationContext().getResources().getStringArray(R.array.saladRecipes);
        saladsList.setAdapter(adapter);
        saladsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                             @Override
                                             public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                                 saladRecipe.setText(saladRecipes[position]);
                                             }
                                         }
        );
    }
}