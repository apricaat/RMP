package com.example.example;

import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button_id);
        button.setOnClickListener (
                button1->Log.i(TAG,"Пациенты")
        );


    }

    public void Click(View view) {
        Log.d("Push","onCreate");
    }
}
    @Override
public void onAttach(@NonBull Context context){
    super.onAttach(context);
    Log.i(TAG,"onAttach");
    Toast.makeText(context,"onAttach", Toast.LENGTH_LONG).show();
}
    @Override
    public void onCreate(@NonBull Context context){
        super.onAttach(context);
        Log.i(TAG,"onCreate");
        Toast.makeText(context,"onCreate", Toast.LENGTH_LONG).show();
    }

    @Nullable
    @Override
    public void onCreateView(@NonBull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){

        Log.i(TAG,"onCreateView");
        Toast.makeText(context,"onCreateView", Toast.LENGTH_LONG).show();
        return super.onCreateView(inflatter,container,savedInstanceState);
    }
    @Override
public void onViewStateRestored(@Nullable Bundle savedInstanceState){
    super.onViewStateRestored(savedInstanceState);
    }


