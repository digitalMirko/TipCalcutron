package com.digitalmirko.tipcalcutron;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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
        fivePercentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                System.out.println("5% btn clicked"); // tested connection - logcat

                calcTheTip(0.05);
            }
        });

        tenPercentBtn = (Button) findViewById(R.id.tenBtn);
        tenPercentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                System.out.println("10% btn clicked");  // tested connection - logcat

                calcTheTip(0.1);
            }
        });

        fifteenPercentBtn = (Button) findViewById(R.id.fifteenBtn);
        fifteenPercentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                System.out.println("15% btn clicked"); // tested connection - logcat

                calcTheTip(0.15);
            }
        });

        twentyPercentBtn = (Button) findViewById(R.id.twentyBtn);
        twentyPercentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                System.out.println("20% btn clicked"); // tested connection - logcat

                calcTheTip(0.2);
            }
        });


        // Tip & Total TextView connections
        tipTotalTextView = (TextView) findViewById(R.id.tipTotalTextView);
//        tipTotalTextView.setText("Testing123"); // tested connection
        totalTextView = (TextView) findViewById(R.id.totalTextView);
    }

    void calcTheTip(Double tipPecentage) {
        // Get the number for the EditText
        Double billTotal = Double.valueOf(billTotalEditText.getText().toString());

       // Determine the Tip
        Double tipTotal = billTotal * tipPecentage;

        // Display the Tip
        tipTotalTextView.setText( String.format("%.0f", tipPecentage * 100) + "% Tip - $" + String.format("%.2f", tipTotal));

        // Determine the Total
        Double total = billTotal + tipTotal;

        // Display the Total
        totalTextView.setText("Total - $" + String.format("%.2f", total));;
    }
}
