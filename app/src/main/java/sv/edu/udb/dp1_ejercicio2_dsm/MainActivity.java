package sv.edu.udb.dp1_ejercicio2_dsm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private EditText number1;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1 = findViewById(R.id.number1);
        tv = findViewById(R.id.tv);
    }
    public void seno (View view){
        String valor1=number1.getText().toString();
        if(valor1.matches("")){
            tv.setText("No igreso el dato 💣");
        }else{
            trigonometricas(valor1,1);
        }
    }
    public void coceno (View view){
        String valor1=number1.getText().toString();
        if(valor1.matches("")){
            tv.setText("No igreso el dato 💣");
        }else{
            trigonometricas(valor1,2);
        }
    }

    public void logaritmo (View view){
        String valor1=number1.getText().toString();
        if(valor1.matches("")){
            tv.setText("No igreso el dato 💣");
        }
        else{
            Float nro1=Float.parseFloat(valor1);
            if(nro1 > 0 ){
                double logo = Math.log10(nro1);
                DecimalFormat dFormatter = new DecimalFormat("#.####");
                String formatted1 = dFormatter.format(logo);
                String resu=String.valueOf("Logaritmo base 10: " + formatted1);
                tv.setText(resu);
            }else{
                tv.setText("Error");
            };
        }
    }
    public void raiz (View view){
        String valor1=number1.getText().toString();
        if(valor1.matches("")){
            tv.setText("No igreso el dato 💣");
        }else{
            Float nro1=Float.parseFloat(valor1);
            if(nro1 > 0 ){
                double raizC = Math.sqrt(nro1);
                DecimalFormat dFormatter = new DecimalFormat("#.####");
                String formatted1 = dFormatter.format(raizC);
                String resu=String.valueOf(formatted1);
                tv.setText(resu);
            }else{
                tv.setText("Error");
            };
        }

    }

    public void trigonometricas (String valor1, int index){
        double nro1 = Double.parseDouble(valor1);
        double operation;
        if(index == 2){
            operation = Math.cos(nro1);
        }else{
            operation =  Math.sin(nro1);
        }
        double degree = operation * (180/3.14159265359);

        DecimalFormat dFormatter = new DecimalFormat("#.##");
        String formatted1 = dFormatter.format(operation);
        String formatted2 = dFormatter.format(degree);


        String resu=String.valueOf(formatted1);
        String resu2=String.valueOf(formatted2);
        tv.setText("Radianes: " + resu + "\n Grados: " + resu2);
    }

}