package com.demo.characterdescription;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   private TextView textView;
   private Spinner spinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView =findViewById(R.id.characterDescription);
        spinner = findViewById(R.id.spinnerDescriotion);

    }

    public void takeDescription(View view) {

        int positon = spinner.getSelectedItemPosition();
        String[] descriptions = getResources().getStringArray(R.array.text_description);
        String description=descriptions[positon];
        textView.setText(description);
    }
}
