package com.mobidev.integerrangechecker;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.util.Range;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //number to check range
        int i=15000;
        Range<Integer> range1=Range.create(0,12298);
        Range<Integer> range2=Range.create(12299,23885);
        Range<Integer> range3=Range.create(23886,35472);
        Range<Integer> range4=Range.create(35473,47059);

        if (range1.contains(i)){
            Toast.makeText(this, "range1", Toast.LENGTH_SHORT).show();
        }else if (range2.contains(i)){
            Toast.makeText(this, "range2", Toast.LENGTH_SHORT).show();

        }else if (range3.contains(i)){
            Toast.makeText(this, "range3", Toast.LENGTH_SHORT).show();

        }else if (range4.contains(i)){
            Toast.makeText(this, "range4", Toast.LENGTH_SHORT).show();

        }else{
            Toast.makeText(this, "above", Toast.LENGTH_SHORT).show();

        }
    }
}
