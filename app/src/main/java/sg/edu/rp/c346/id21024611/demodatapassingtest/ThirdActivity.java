package sg.edu.rp.c346.id21024611.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class ThirdActivity extends AppCompatActivity {
    TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        textView3 = findViewById(R.id.textView3);
        Intent intentReceived = getIntent();
        char value = intentReceived.getCharExtra("value", 'a');
        textView3.setText("Character value received is: " + value);

    }
}
