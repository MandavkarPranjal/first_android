package com.example.hello_world;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void btn_click (View view) {
        TextView txtHello = findViewById(R.id.txtMessage);
        EditText edt_txt_name = findViewById(R.id.edt_txt_name);
        txtHello.setText("Hello " + edt_txt_name.getText().toString());
    }
}
