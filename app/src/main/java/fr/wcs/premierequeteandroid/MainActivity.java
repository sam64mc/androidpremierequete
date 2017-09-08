package fr.wcs.premierequeteandroid;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CheckBox checkboxWilder = (CheckBox) findViewById(R.id.checkbox);

        checkboxWilder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               EditText editFirstname = (EditText) findViewById(R.id.firstname);
                EditText editlastname = (EditText)findViewById(R.id.lastname);
                Button buttonValidate = (Button)findViewById(R.id.button);
                if (checkboxWilder.isChecked()) {
                   // est coché
                    editFirstname.setEnabled(true);
                    editlastname.setEnabled(true);
                    buttonValidate.setEnabled(true);
                } else {
                    // n'est pas coché
                    editFirstname.setEnabled(false);
                    editlastname.setEnabled(false);
                    buttonValidate.setEnabled(false);
                }
            }
        });

        Button buttonValidate = (Button)findViewById(R.id.button);
        buttonValidate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editFirstname = (EditText) findViewById(R.id.firstname);
                EditText editlastname = (EditText)findViewById(R.id.lastname);
                if(editFirstname.getText().toString().isEmpty()
                || editlastname.getText().toString().isEmpty() )
                {
                    Context context = getApplicationContext();
                    CharSequence text = getResources().getString(R.string.error);
                    int duration = Toast.LENGTH_SHORT;

                    Toast messageErreur = Toast.makeText(context, text, duration);
                    messageErreur.show(); }
                else{
                    TextView textCongratulation = (TextView) findViewById(R.id.congratulation);
                    textCongratulation.setText(getResources().getString(R.string.congratulation)
                     + " " + editFirstname.getText().toString()
                      +" " + editlastname.getText().toString()
                    );


            }
        }
             });



    }
}
