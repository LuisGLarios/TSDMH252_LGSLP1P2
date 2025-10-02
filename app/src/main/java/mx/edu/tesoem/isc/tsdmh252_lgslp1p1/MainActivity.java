package mx.edu.tesoem.isc.tsdmh252_lgslp1p1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    EditText n1,n2;

    Button blsumar,blresta,blmulti,blpot,blpoN,blraiz;
    TextView lbresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
           n1 = findViewById(R.id.n1);
           blsumar = findViewById(R.id.blsumar);
           n2 = findViewById(R.id.n2);
           lbresultado = findViewById(R.id.lbresultado);
           blresta = findViewById(R.id.blresta);
           blmulti = findViewById(R.id.blmulti);
           blpot = findViewById(R.id.blpot);
           blpoN = findViewById(R.id.blpoN);
           blraiz = findViewById(R.id.blraiz);

    }


    public void onclicksumar(View view){
        int v1,v2;
        v1 = Integer.parseInt(n1.getText().toString());
        v2 = Integer.parseInt(n2.getText().toString());
        String cadena = "El resultado de la suma es :"+String.valueOf( v1+v2);
        lbresultado.setText(cadena);
        
    }

    public void onclickresta(View view){
        int r1,r2;
        r1 = Integer.parseInt(n1.getText().toString());
        r2 = Integer.parseInt(n2.getText().toString());
        String cadena = "El resultado de la resta es :"+String.valueOf( r1-r2);
        lbresultado.setText(cadena);

    }

    public void onclickmulti(View view){
        int m1,m2;
        m1 = Integer.parseInt(n1.getText().toString());
        m2 = Integer.parseInt(n2.getText().toString());
        String cadena = "El resultado de la Multiplicacion es :"+String.valueOf( m1*m2);
        lbresultado.setText(cadena);

    }
    public void onclickdividir(View view){
        double m1, m2;

        m1 = Double.parseDouble(n1.getText().toString());
        m2 = Double.parseDouble(n2.getText().toString());

        if (m2 != 0) {
            String cadena = "El resultado de la División es: " + String.valueOf(m1 / m2);
            lbresultado.setText(cadena);
        } else {
            lbresultado.setText("Error: División entre cero");
        }
    }
    public void onclickelevar(View view){
        double E1;

        E1 = Double.parseDouble(n1.getText().toString());


        double resultado = E1 * E1;

        String cadena = "El resultado de elevar al cuadrado es: " + String.valueOf(resultado);
        lbresultado.setText(cadena);
    }


    public void onclickelevarN(View view) {
        // Base
        double N1 = Double.parseDouble(n1.getText().toString());

        // Exponente (lo lees desde otro EditText llamado n2)
        double N = Double.parseDouble(n2.getText().toString());

        // Potencia
        double resultado = Math.pow(N1, N);

        // Mostrar resultado
        String cadena = "El resultado de elevar " + N1 + " a la potencia " + N + " es: " + resultado;
        lbresultado.setText(cadena);
    }

    public void onclickraiz(View view) {
        // Tomamos el número
        double R1 = Double.parseDouble(n1.getText().toString());

        // Calculamos la raíz cuadrada
        double resultado = Math.sqrt(R1);

        // Mostramos el resultado
        String cadena = "La raíz cuadrada de " + R1 + " es: " + resultado;
        lbresultado.setText(cadena);
    }



}