package com.example.abedurchowdhury.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public boolean isTriangular(int n) {
        int total = 0;
        int count = 1;
        while (total < n) {
            total += count;
            count++;
            if (total == n)
                return true;
        }
        return (total==0);
    }
    public boolean isSquare(int n) {
        double squareRoot = Math.sqrt(n);
        return (squareRoot == Math.floor(squareRoot));
    }
    public void makeToast(String string) {
        Toast.makeText(MainActivity.this, "Your number is "+string+"!", Toast.LENGTH_LONG).show();
    }
    public void calculate(View view) {
        EditText number_edit = (EditText) findViewById(R.id.number_edit);
        int userNumber = Integer.parseInt(number_edit.getText().toString());
        if (isTriangular(userNumber) && isSquare(userNumber))
            makeToast("both");
        else if (isTriangular(userNumber))
            makeToast("Triangular");
        else if (isSquare(userNumber))
            makeToast("Square");
        else
            makeToast("neither");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
