package fr.wcs.premierequeteandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

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


    }
}
