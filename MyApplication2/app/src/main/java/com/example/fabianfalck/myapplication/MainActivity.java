package com.example.fabianfalck.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText pass_word;
    private Button button;

    public static final String MY_TAG = "my custom message";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("lifecycle","onCreate invoked");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lifecycle","onStart invoked");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifecycle","onResume invoked");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lifecycle","onPause invoked");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lifecycle","onStop invoked");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("lifecycle","onRestart invoked");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lifecycle","onDestroy invoked");
    }

    public void onButtonClick(View v){ //Import fixed with alt+enter
        EditText e1 = (EditText)findViewById(R.id.editText3);
        EditText e2 = (EditText)findViewById(R.id.editText4);
        TextView t1 = (TextView)findViewById(R.id.textView7);
        int num1 = Integer.parseInt(e1.getText().toString());
        int num2 = Integer.parseInt(e2.getText().toString());

        int sum = num1 + num2;

        t1.setText(Integer.toString(sum));

    }

    public void addListenerOnButton(){
        pass_word = (EditText) findViewById(R.id.editText2);
    }

}
