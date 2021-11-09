package facci.pablosaltos.primeraappandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.*;
import android.view.View;



public class MainActivity extends AppCompatActivity {
    private Button cToF, fToC;
    private TextView result;
    private EditText temperature;
    double result0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cToF = findViewById(R.id.cToF);
        fToC = findViewById((R.id.fToC));
        result = findViewById((R.id.resultado));
        temperature = findViewById(R.id.enterTemp);

        cToF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double temp = Double.parseDouble(temperature.getText().toString());
                result0 = (temp * 1.8) + 32;
                result.setText(String.valueOf(result0));
            }
        });

        fToC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double temp = Double.parseDouble(temperature.getText().toString());
                result0 = (temp - 32) / 1.8;
                result.setText(String.valueOf(result0));
            }
        });

        Log.e("aplicacionesmoviles1", "Pablo Fabian Saltos Carrillo");
    }
}