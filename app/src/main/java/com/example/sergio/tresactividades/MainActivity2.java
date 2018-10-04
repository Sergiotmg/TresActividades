package com.example.sergio.tresactividades;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String texto = intent.getStringExtra(MainActivity.TEXT_EXTRA);
        TextView bbb=findViewById(R.id.textView2);//lo nombro y cojo el que tiene esa id en el
    //activity_main2.xml
        bbb.setText(texto);

    }

}




