package com.example.sqylite;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviderKt;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button;
   ViewModely viewModely;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.name);
        button=findViewById(R.id.btn);

         viewModely= ViewModelProviders.of(this).get(ViewModely.class);

         viewModely.mutableLiveData.observe(this, new Observer<String>() {
             @Override
             public void onChanged(String s) {

             }
         });



        onClick();


    }



    private void onClick() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              viewModely.setUpModel();
            }
        });
    }



}
