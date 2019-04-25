package appvega.iat.widifirmaan.iat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import java.util.List;

public class Statistik extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistik);
        addListenerOnButton();

    }

    public void addListenerOnButton() {
        TextView tview = (TextView)findViewById(R.id.textView7);
        RadioGroup radioSexGroup = (RadioGroup) findViewById(R.id.radioSex);
        Button btnDisplay = (Button) findViewById(R.id.button6);

        btnDisplay.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                double time = Double.parseDouble(((EditText) findViewById(R.id.editText6)).getText().toString());
                int jk = ((RadioGroup) findViewById(R.id.radioSex)).getCheckedRadioButtonId();
                RadioButton radioSexButton = (RadioButton) findViewById(jk);
                int jk2 = Integer.parseInt(radioSexButton.getText().toString());
                try  {
                    InputMethodManager imm = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
                } catch (Exception e) {

                }
                if (jk2 == 1) {
                    if (time > 19.3) {
                        ((TextView) findViewById(R.id.textView7)).setText("Buruk");
                    } else if (time >= 18.2 && time <= 19.3) {
                        ((TextView) findViewById(R.id.textView7)).setText("Dibawah Rata Rata");
                    } else if (time >= 16.2 && time <= 18.1) {
                        ((TextView) findViewById(R.id.textView7)).setText("Rata Rata");
                    } else if (time >= 15.2 && time <= 16.1) {
                        ((TextView) findViewById(R.id.textView7)).setText("Diatas Rata Rata");
                    } else if (time < 15.2) {
                        ((TextView) findViewById(R.id.textView7)).setText("Sangat Baik");
                    }

                } else if (jk2 == 2) {
                    if (time > 23.0) {
                        ((TextView) findViewById(R.id.textView7)).setText("Buruk");
                    } else if (time >= 21.8 && time <= 23.0) {
                        ((TextView) findViewById(R.id.textView7)).setText("Dibawah Rata Rata");
                    } else if (time >= 18.0 && time <= 21.7) {
                        ((TextView) findViewById(R.id.textView7)).setText("Rata Rata");
                    } else if (time >= 17.0 && time <= 17.9) {
                        ((TextView) findViewById(R.id.textView7)).setText("Diatas Rata Rata");
                    } else if (time < 17) {
                        ((TextView) findViewById(R.id.textView7)).setText("Sangat Baik");
                    }
                } else {
                    ((TextView) findViewById(R.id.textView7)).setText("Error :)");
                }

            }

        });
    }

}
