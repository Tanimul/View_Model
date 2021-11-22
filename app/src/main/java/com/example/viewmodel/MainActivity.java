package com.example.viewmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.viewmodel.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding activityMainBinding;
    CountViewModel countViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());

        countViewModel = new ViewModelProvider(this).get(CountViewModel.class);
        countNumber();

        activityMainBinding.add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countViewModel.numberAdd();
                countNumber();
            }
        });

        activityMainBinding.minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countViewModel.numberMinus();
                countNumber();
            }
        });
    }

    private void countNumber() {
        activityMainBinding.numberCount.setText("" + countViewModel.countNumber);
    }

}