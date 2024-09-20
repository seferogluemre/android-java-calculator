package com.example.calculator_app;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText numberOneText;
    EditText numberTwoText;
    TextView resultText;
    TextView errorText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // findViewById çağrılarını burada yapmalısın
        numberOneText = findViewById(R.id.numberOneText);
        numberTwoText = findViewById(R.id.numberTwoText);
        resultText = findViewById(R.id.resultText);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void sum(View view){
        if(numberOneText.getText().toString().matches("") || numberTwoText.getText().toString().matches("")){
            resultText.setText("Boş Alan Bırakmayınız!!!");
        }
        else{
            int numberOne=Integer.parseInt(numberOneText.getText().toString());
            int numberTwo=Integer.parseInt(numberTwoText.getText().toString());
            int result=numberOne+numberTwo;
            resultText.setText("Result: "+result);
        }
    }

    public void deduct(View view){
        if(numberOneText.getText().toString().matches("") || numberTwoText.getText().toString().matches("")){
            resultText.setText("Boş Alan Bırakmayınız!!!");
        }
        else{
            int numberOne=Integer.parseInt(numberOneText.getText().toString());
            int numberTwo=Integer.parseInt(numberTwoText.getText().toString());
            int result=numberOne-numberTwo;
            resultText.setText("Result: "+result);
        }
    }

    public void multiply(View view){
        if(numberOneText.getText().toString().matches("") || numberTwoText.getText().toString().matches("")){
            resultText.setText("Boş Alan Bırakmayınız!!!");
        }
        else{
            int numberOne=Integer.parseInt(numberOneText.getText().toString());
            int numberTwo=Integer.parseInt(numberTwoText.getText().toString());
            int result=numberOne*numberTwo;
            resultText.setText("Result: "+result);
        }
    }

    public void divide(View view){
        if(numberOneText.getText().toString().matches("") || numberTwoText.getText().toString().matches("")){
            resultText.setText("Boş Alan Bırakmayınız!!!");
        }
        else{
            int numberOne=Integer.parseInt(numberOneText.getText().toString());
            int numberTwo=Integer.parseInt(numberTwoText.getText().toString());
            int result=numberOne/numberTwo;
            resultText.setText("Result: "+result);
        }
    }

    public void clearAll(View view){
        numberOneText.setText("");
        numberTwoText.setText("");
        resultText.setText("Result : 0");
    }
}