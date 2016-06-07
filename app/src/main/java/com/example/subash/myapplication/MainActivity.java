package com.example.subash.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int counter;
    Button btn_add,btn_sub;
    TextView display;


    public void toast(String message){
            Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
        }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counter=0;
        btn_add = (Button)findViewById(R.id.bAdd);
        btn_sub =(Button)findViewById(R.id.bSub);
        display=(TextView)findViewById(R.id.tvDisplay);
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                counter++;
                display.setText("Your total is " + counter);
                toast("added");
            }

        });
        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter--;
                display.setText("Your total is "+ counter);
                toast("subtracted");
            }
        });
    }
}
