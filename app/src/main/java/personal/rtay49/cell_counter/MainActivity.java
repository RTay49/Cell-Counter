package personal.rtay49.cell_counter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void goCount(View view){
        Intent intent = new Intent(this, Count.class);
        startActivity(intent);
    }

    public void goConcentration(View view){
        Intent intent = new Intent(this, Concentration.class);
        startActivity(intent);
    }
}
