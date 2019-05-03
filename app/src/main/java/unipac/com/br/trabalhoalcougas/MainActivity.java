package unipac.com.br.trabalhoalcougas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Double alcool;
    Double gasolina;
    EditText gasolinaEdt, alcoolEdt;

    public void calcularBtn_click(View view) {
        alcoolEdt = (EditText) findViewById(R.id.alcoolEdt);
        gasolinaEdt = (EditText) findViewById(R.id.gasolinaEdt);

        alcool = Double.parseDouble(alcoolEdt.getText().toString());
        gasolina = Double.parseDouble(gasolinaEdt.getText().toString());


        if (alcool <= (gasolina * 0.7)) {
            Toast.makeText(getApplicationContext(), "Alcool é melhor", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), "Gasolina é melhor", Toast.LENGTH_SHORT).show();
        }
    }
}