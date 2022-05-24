package sg.edu.rp.c346.id21024611.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {
    TextView textView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        textView4 = findViewById(R.id.textView3);

        Intent intentReceived = getIntent();
        double value = intentReceived.getDoubleExtra("value", 0.01);
        textView4.setText("Double value received is: " + value);
    }
}
