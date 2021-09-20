package com.example.testapikotlin.Building;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.testapikotlin.R;

public class UniversityBelval extends AppCompatActivity {

    private Button button;
    private TextView setupLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_university_belval);
        button = (Button) findViewById(R.id.button);
        setupLocation = (TextView) findViewById(R.id.setuplocation);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openActivity(); }
        });
    }

    public void openActivity(){
        setupLocation.setText("university_center");
        Intent intent1 = new Intent(UniversityBelval.this, VisitInBuilding.class);
        startActivity(intent1);

    }

}
