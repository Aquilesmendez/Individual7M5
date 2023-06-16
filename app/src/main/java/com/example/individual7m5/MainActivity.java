package com.example.individual7m5;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements Vista {

    private EditText passwordEditText;
    private TextView passwordStrengthTextView2;
    private Button checkButton;
    private Presentador presentador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        passwordEditText = findViewById(R.id.passwordEditText);
        passwordStrengthTextView2 = findViewById(R.id.passwordStrengthTextView2);
        checkButton = findViewById(R.id.checkButton);

        Modelo modelo = new Modelo();
        presentador = new Presentador(modelo, this);

        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String password = passwordEditText.getText().toString();
                presentador.validarContrasena(password);
            }
        });
    }

    @Override
    public void mostrarFortalezaContrasena(int fortaleza) {
        switch (fortaleza) {
            case 0:
                passwordStrengthTextView2.setText("Contraseña Debil");
                passwordStrengthTextView2.setTextColor(Color.RED);
                break;
            case 1:
                passwordStrengthTextView2.setText("Contraseña Media");
                passwordStrengthTextView2.setTextColor(Color.YELLOW);
                break;
            case 2:
                passwordStrengthTextView2.setText("Contraseña Fuerte");
                passwordStrengthTextView2.setTextColor(Color.GREEN);
                break;
        }
    }


}
