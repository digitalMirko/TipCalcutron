package com.digitalmirko.tipcalcutron;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Bill Total EditText
    EditText billTotalEditText;

    //  5, 10, 15 & 20 Percentage Tip Buttons
    Button fivePercentBtn;
    Button tenPercentBtn;
    Button fifteenPercentBtn;
    Button twentyPercentBtn;

    // Tip & Total TextView
    TextView tipTotalTextView;
    TextView totalTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Bill Total EditText connection
        billTotalEditText = (EditText) findViewById(R.id.billTotalEditText);

        // 5, 10, 15 & 20 Percentage Tip Buttons connection
        fivePercentBtn = (Button) findViewById(R.id.fiveBtn);
        tenPercentBtn = (Button) findViewById(R.id.tenBtn);
        fifteenPercentBtn = (Button) findViewById(R.id.fifteenBtn);
        twentyPercentBtn = (Button) findViewById(R.id.twentyBtn);

        // Tip & Total TextView connections
        tipTotalTextView = (TextView) findViewById(R.id.tipTotalTextView);
//        tipTotalTextView.setText("Testing123"); // tested connection
        totalTextView = (TextView) findViewById(R.id.totalTextView);




    }
}
