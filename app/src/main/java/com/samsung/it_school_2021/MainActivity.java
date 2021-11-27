package com.samsung.it_school_2021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // View - представление
    // TextView - output
    // Button - one, zero, plus, equal
    // click - ?
    // 1) OnClickListener
    // 2) onClick -> layout.xml
    private TextView output;
    private Long leftArg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        output = findViewById(R.id.output);
        Log.d("calc", "Calc app created...");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("calc", "Calc app stopped...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("calc", "Calc app destroyed...");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("calc", "Calc app started...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("calc", "Calc app resumed...");
    }

    public void processClick(View view) {
        Button button = (Button) view;
        String text = button.getText().toString();
        Log.d("calc", "Button " + text + " clicked!");
        switch (text) {
            case "0":
            case "1":
                output.append(button.getText());
                break;
            case "+":
                leftArg = Long.parseLong(output.getText().toString());
                output.setText("");
                break;
            case "=":
                Long result = leftArg + Long.parseLong(output.getText().toString());
                output.setText(String.valueOf(result));
                break;
        }

    }
}