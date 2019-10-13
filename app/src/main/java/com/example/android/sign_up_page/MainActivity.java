package com.example.android.sign_up_page;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b;
    EditText name1,email1,pass1;
    String name;
    String email;
    String pass;
    RadioButton male;
    RadioButton female;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = (Button) findViewById(R.id.button);
        name1 = (EditText) findViewById(R.id.name);
        male = (RadioButton) findViewById(R.id.maleid);
        female = (RadioButton) findViewById(R.id.femaleid);
        email1 = (EditText) findViewById(R.id.email);
        pass1 = (EditText) findViewById(R.id.pass);
    }

    public void raj(View v)
    {
        name=name1.getText().toString();
        email=email1.getText().toString();
        pass=pass1.getText().toString();
        String gend;
        if(male.isChecked())
        {
            gend ="male";
        }
        else
            gend ="female";
        Toast.makeText(MainActivity.this,"Welcome",Toast.LENGTH_LONG).show();
        Intent ras=new Intent(MainActivity.this, Main2Activity.class);
        startActivity(ras);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if(newConfig.orientation==Configuration.ORIENTATION_LANDSCAPE)
            Toast.makeText(MainActivity.this,"changing orientation to Landscape is not recommended",Toast.LENGTH_LONG).show();

    }
}
