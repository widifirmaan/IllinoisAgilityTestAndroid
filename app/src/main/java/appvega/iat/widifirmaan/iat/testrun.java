package appvega.iat.widifirmaan.iat;

import android.app.Notification;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class testrun extends AppCompatActivity {
    private Chronometer chronometer;
    private long pauseOffset;
    private boolean running;
    private Button btn;
    private EditText tname1;
    private EditText tname2;
    private EditText tname3;
    private EditText tname4;
    private RadioGroup radioSexGroup1;
    private RadioGroup radioSexGroup2;
    private RadioGroup radioSexGroup3;
    private RadioGroup radioSexGroup4;
    private TextView ttime1;
    private TextView ttime2;
    private TextView ttime3;
    private TextView ttime4;
    public static String stringdouble1;
    public static String stringdouble2;
    public static String stringdouble3;
    public static String stringdouble4;
    public static int jk11;
    public static int jk22;
    public static int jk33;
    public static int jk44;
    public static Editable stringname1;
    public static Editable stringname2;
    public static Editable stringname3;
    public static Editable stringname4;
    public static double ctime1;
    public static double ctime2;
    public static double ctime3;
    public static double ctime4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testrun);
        chronometer = findViewById(R.id.chronometer);
        chronometer.setFormat("Time: %s");
        chronometer.setBase(SystemClock.elapsedRealtime());

        chronometer.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
            @Override
            public void onChronometerTick(Chronometer chronometer) {
                if ((SystemClock.elapsedRealtime() - chronometer.getBase()) >= 3600000) {
                    chronometer.setBase(SystemClock.elapsedRealtime());
                    Toast.makeText(testrun.this, "SIP!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        tname1 = (EditText)findViewById(R.id.name1);
        tname2 = (EditText)findViewById(R.id.name2);
        tname3 = (EditText)findViewById(R.id.name3);
        tname4 = (EditText)findViewById(R.id.name4);
        radioSexGroup1 = (RadioGroup) findViewById(R.id.radioSex1);
        radioSexGroup2 = (RadioGroup) findViewById(R.id.radioSex2);
        radioSexGroup3 = (RadioGroup) findViewById(R.id.radioSex3);
        radioSexGroup4 = (RadioGroup) findViewById(R.id.radioSex4);
        ttime1 = (TextView)findViewById(R.id.time1);
        ttime2 = (TextView)findViewById(R.id.time2);
        ttime3 = (TextView)findViewById(R.id.time3);
        ttime4 = (TextView)findViewById(R.id.time4);
        Button bstop1 = (Button) findViewById(R.id.stop1);
        bstop1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                ctime1 = (double) (SystemClock.elapsedRealtime() - chronometer.getBase());
                double ttime11 = (double) (SystemClock.elapsedRealtime() - chronometer.getBase());
                int jk1 = ((RadioGroup) findViewById(R.id.radioSex1)).getCheckedRadioButtonId();
                RadioButton radioSexButton1 = (RadioButton) findViewById(jk1);
                jk11 = Integer.parseInt(radioSexButton1.getText().toString());
                stringdouble1= Double.toString(ttime11);
                ((TextView) findViewById(R.id.time1)).setText(stringdouble1);
                stringname1= tname1.getText();

            }
        });
        Button bstop2 = (Button) findViewById(R.id.stop2);
        bstop2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                ctime2 = (double) (SystemClock.elapsedRealtime() - chronometer.getBase());
                double ttime22 = (double) (SystemClock.elapsedRealtime() - chronometer.getBase());
                int jk2 = ((RadioGroup) findViewById(R.id.radioSex2)).getCheckedRadioButtonId();
                RadioButton radioSexButton2 = (RadioButton) findViewById(jk2);
                jk22 = Integer.parseInt(radioSexButton2.getText().toString());
                stringdouble2= Double.toString(ttime22);
                ((TextView) findViewById(R.id.time2)).setText(stringdouble2);
                stringname2= tname2.getText();
            }
        });
        Button bstop3 = (Button) findViewById(R.id.stop3);
        bstop3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                ctime3 = (double) (SystemClock.elapsedRealtime() - chronometer.getBase());
                double ttime33 = (double) (SystemClock.elapsedRealtime() - chronometer.getBase());
                int jk3 = ((RadioGroup) findViewById(R.id.radioSex3)).getCheckedRadioButtonId();
                RadioButton radioSexButton3 = (RadioButton) findViewById(jk3);
                jk33 = Integer.parseInt(radioSexButton3.getText().toString());
                stringdouble3= Double.toString(ttime33);
                ((TextView) findViewById(R.id.time3)).setText(stringdouble3);
                stringname3= tname3.getText();
            }
        });
        Button bstop4 = (Button) findViewById(R.id.stop4);
        bstop4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                ctime4 = (double) (SystemClock.elapsedRealtime() - chronometer.getBase());
                double ttime44 = (double) (SystemClock.elapsedRealtime() - chronometer.getBase());
                int jk4 = ((RadioGroup) findViewById(R.id.radioSex4)).getCheckedRadioButtonId();
                RadioButton radioSexButton4 = (RadioButton) findViewById(jk4);
                jk44 = Integer.parseInt(radioSexButton4.getText().toString());
                stringdouble4= Double.toString(ttime44);
                ((TextView) findViewById(R.id.time4)).setText(stringdouble4);
                stringname4= tname4.getText();
            }
        });
    }

    public void startChronometer(View v) {
        if (!running) {
            chronometer.setBase(SystemClock.elapsedRealtime() - pauseOffset);
            chronometer.start();
            running = true;
        }
    }

    public void pauseChronometer(View v) {
        if (running) {
            chronometer.stop();
            pauseOffset = SystemClock.elapsedRealtime() - chronometer.getBase();
            running = false;
        }
    }

    public void resetChronometer(View v) {
        chronometer.setBase(SystemClock.elapsedRealtime());
        pauseOffset = 0;
    }

}
