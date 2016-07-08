package personal.rtay49.cell_counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Count extends AppCompatActivity {
    Button cButton;
    EditText tL;
    EditText tR;
    EditText bL;
    EditText bR;
    EditText dF;

    TextView result;

    int iTL;
    int iTR;
    int iBL;
    int iBR;
    double dDF;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count);

        cButton = (Button)findViewById(R.id.calculate);
        tL = (EditText)findViewById(R.id.topLeft);
        tR = (EditText)findViewById(R.id.topRight);
        bL = (EditText)findViewById(R.id.bottomLeft);
        bR = (EditText)findViewById(R.id.bottomRight);
        dF = (EditText)findViewById(R.id.dilutionfac);
        result = (TextView)findViewById(R.id.res);
        cButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iTL = Integer.parseInt(tL.getText().toString());
                iTR = Integer.parseInt(tR.getText().toString());
                iBL = Integer.parseInt(bL.getText().toString());
                iBR = Integer.parseInt(bR.getText().toString());
                dDF = Double.parseDouble(dF.getText().toString());


                int cells = (int) calculate();

                result.setText(cells + " cells");

            }
        });
    }


    public double calculate(){


        double cornerAvg = (iTL * iTR * iBL * iBR)/4;

        double cells = cornerAvg * dDF * 100000;

        return cells;
    }
}

