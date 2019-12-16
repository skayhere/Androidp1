package com.cse.program1;

import androidx.appcompat.app.AppCompatActivity;
//import android.support.v7.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText et1,et2;
    String name;
    Button button;

    private static final String Tag=MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(Tag,"in method onCreate");
        et1= (EditText) findViewById(R.id.etFName);
        et2= (EditText) findViewById(R.id.etLName);
        name = et1.getText().toString();
        button=(Button) findViewById(R.id.btnSubmit);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("fname", et1.getText().toString());
        intent.putExtra("lname", et2.getText().toString());
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(Tag,"in method onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(Tag,"in method onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(Tag,"in method onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(Tag,"in method onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(Tag,"in method onDestroy");
    }

}
