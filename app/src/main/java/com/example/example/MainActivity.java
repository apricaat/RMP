package com.example.example;

import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.view.View.OnClickListener;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button_id);
        button.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.e("Push!!","onCreate");
                        Intent intent=new Intent(v.getContext(),MainActivity2.class);
                        startActivity(intent);

                }


        });

    }

    public void Click(View view) {
        Log.d("Push","onCreate");
    }
}