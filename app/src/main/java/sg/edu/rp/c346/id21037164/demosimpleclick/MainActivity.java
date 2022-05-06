package sg.edu.rp.c346.id21037164.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton tbtn;
    RadioGroup rgGender;
    String genders;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDisplay = findViewById(R.id.btna);
        etInput = findViewById(R.id.editTextInputa);
        tvDisplay = findViewById(R.id.textViewDisplaya);
        tbtn = findViewById(R.id.toggleButtonEnabled);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                String stringResponse = etInput.getText().toString();
                int checkedRadioId = rgGender.getCheckedRadioButtonId();
                if(checkedRadioId == R.id.radioButtonGenderMale){
                    // Write the code when male selected
                    genders = "He says";

                }
                else{
                    // Write the code when female selected
                    genders = "She says";

                }
                tvDisplay.setText(genders + value);
            }
        });

        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tbtn.isChecked()){
                    etInput.setEnabled(false);
                }




            }
        });







    }
}