package edu.csc.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        button.setOnClickListener(v ->{
            i=new Intent(MainActivity.this,MainActivity2.class);
            startActivity(i);
        });
    }
    private void addControls(){
        button = findViewById(R.id.thoat);
    }
    public void xuLyThoat(View view){
        finish();

    }
}