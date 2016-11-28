package com.digitalmirko.tipcalcutron;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tipTotalTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tipTotalTextView = (TextView) findViewById(R.id.textView3);

        tipTotalTextView.setText("Testing123");
    }
}
