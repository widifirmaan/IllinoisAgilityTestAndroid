package appvega.iat.widifirmaan.iat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Statistik extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistik);
        addListenerOnButton();

    }

    public void addListenerOnButton() {
        Button btnDisplay = (Button) findViewById(R.id.button6);

        btnDisplay.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                if (testrun.stringdouble1 != null){
                    if(testrun.jk11 !=0){
                        if(testrun.stringname1 !=null){
                double time = Double.parseDouble(testrun.stringdouble1);
                int jk111 = testrun.jk11;
                Editable nama1 = testrun.stringname1;
                if (jk111 == 1) {
                    if (time > 1158000) {
                        ((TextView) findViewById(R.id.result1)).setText(nama1+"\t\t|\t\tPria\t\t|\t\t"+String.format("%.2f",Double.parseDouble(String.valueOf(testrun.ctime1)))+" Mnt\t\t|\t\tBuruk");
                    } else if (time >= 1092000 && time <= 1158000) {
                        ((TextView) findViewById(R.id.result1)).setText(nama1+"\t\t|\t\tPria\t\t|\t\t"+String.format("%.2f",Double.parseDouble(String.valueOf(testrun.ctime1)))+" Mnt\t\t|\t\tDibawah Rata Rata");
                    } else if (time >= 972000 && time <= 1086000) {
                        ((TextView) findViewById(R.id.result1)).setText(nama1+"\t\t|\t\tPria\t\t|\t\t"+String.format("%.2f",Double.parseDouble(String.valueOf(testrun.ctime1)))+" Mnt\t\t|\t\tRata Rata");
                    } else if (time >= 912000 && time <= 966000) {
                        ((TextView) findViewById(R.id.result1)).setText(nama1+"\t\t|\t\tPria\t\t|\t\t"+String.format("%.2f",Double.parseDouble(String.valueOf(testrun.ctime1)))+" Mnt\t\t|\t\tDiatas Rata Rata");
                    } else if (time < 912000) {
                        ((TextView) findViewById(R.id.result1)).setText(nama1+"\t\t|\t\tPria\t\t|\t\t"+String.format("%.2f",Double.parseDouble(String.valueOf(testrun.ctime1)))+" Mnt\t\t|\t\tSangat Baik");
                    }

                } else if (jk111 == 2) {
                    if (time > 1380000) {
                        ((TextView) findViewById(R.id.result1)).setText(nama1+"\t\t|\t\tWanita\t\t|\t\t"+String.format("%.2f",Double.parseDouble(String.valueOf(testrun.ctime1)))+" Mnt\t\t|\t\tBuruk");
                    } else if (time >= 1308000 && time <= 1380000) {
                        ((TextView) findViewById(R.id.result1)).setText(nama1+"\t\t|\t\tWanita\t\t|\t\t"+String.format("%.2f",Double.parseDouble(String.valueOf(testrun.ctime1)))+" Mnt\t\t|\t\tDibawah Rata Rata");
                    } else if (time >= 1080000 && time <= 1302000) {
                        ((TextView) findViewById(R.id.result1)).setText(nama1+"\t\t|\t\tWanita\t\t|\t\t"+String.format("%.2f",Double.parseDouble(String.valueOf(testrun.ctime1)))+" Mnt\t\t|\t\tRata Rata");
                    } else if (time >= 1020000 && time <= 1074000) {
                        ((TextView) findViewById(R.id.result1)).setText(nama1+"\t\t|\t\tWanita\t\t|\t\t"+String.format("%.2f",Double.parseDouble(String.valueOf(testrun.ctime1)))+" Mnt\t\t|\t\tDiatas Rata Rata");
                    } else if (time < 1020000) {
                        ((TextView) findViewById(R.id.result1)).setText(nama1+"\t\t|\t\tWanita\t\t|\t\t"+String.format("%.2f",Double.parseDouble(String.valueOf(testrun.ctime1)))+" Mnt\t\t|\t\tSangat Baik");
                    }
                } else {
                    ((TextView) findViewById(R.id.result1)).setText("Data Kosong/tidak lengkap");
                }

                } else {
                            ((TextView) findViewById(R.id.result1)).setText("Data Kosong/tidak lengkap");
                        }

                } else {
                        ((TextView) findViewById(R.id.result1)).setText("Data Kosong/tidak lengkap");
                    }

                } else {
                    ((TextView) findViewById(R.id.result1)).setText("Data Kosong/tidak lengkap");
                }
                if (testrun.stringdouble2 != null){
                    if(testrun.jk22 !=0){
                        if(testrun.stringname2 !=null){
                            double time = Double.parseDouble(testrun.stringdouble2);
                            int jk222 = testrun.jk22;
                            Editable nama2 = testrun.stringname2;
                            if (jk222 == 1) {
                                if (time > 1158000) {
                                    ((TextView) findViewById(R.id.result2)).setText(nama2+"\t\t|\t\tPria\t\t|\t\t"+String.format("%.2f",Double.parseDouble(String.valueOf(testrun.ctime2)))+" Mnt\t\t|\t\tBuruk");
                                } else if (time >= 1092000 && time <= 1158000) {
                                    ((TextView) findViewById(R.id.result2)).setText(nama2+"\t\t|\t\tPria\t\t|\t\t"+String.format("%.2f",Double.parseDouble(String.valueOf(testrun.ctime2)))+" Mnt\t\t|\t\tDibawah Rata Rata");
                                } else if (time >= 972000 && time <= 1086000) {
                                    ((TextView) findViewById(R.id.result2)).setText(nama2+"\t\t|\t\tPria\t\t|\t\t"+String.format("%.2f",Double.parseDouble(String.valueOf(testrun.ctime2)))+" Mnt\t\t|\t\tRata Rata");
                                } else if (time >= 912000 && time <= 966000) {
                                    ((TextView) findViewById(R.id.result2)).setText(nama2+"\t\t|\t\tPria\t\t|\t\t"+String.format("%.2f",Double.parseDouble(String.valueOf(testrun.ctime2)))+" Mnt\t\t|\t\tDiatas Rata Rata");
                                } else if (time < 912000) {
                                    ((TextView) findViewById(R.id.result2)).setText(nama2+"\t\t|\t\tPria\t\t|\t\t"+String.format("%.2f",Double.parseDouble(String.valueOf(testrun.ctime2)))+" Mnt\t\t|\t\tSangat Baik");
                                }

                            } else if (jk222 == 2) {
                                if (time > 1380000) {
                                    ((TextView) findViewById(R.id.result2)).setText(nama2+"\t\t|\t\tWanita\t\t|\t\t"+String.format("%.2f",Double.parseDouble(String.valueOf(testrun.ctime2)))+" Mnt\t\t|\t\tBuruk");
                                } else if (time >= 1308000 && time <= 1380000) {
                                    ((TextView) findViewById(R.id.result2)).setText(nama2+"\t\t|\t\tWanita\t\t|\t\t"+String.format("%.2f",Double.parseDouble(String.valueOf(testrun.ctime2)))+" Mnt\t\t|\t\tDibawah Rata Rata");
                                } else if (time >= 1080000 && time <= 1302000) {
                                    ((TextView) findViewById(R.id.result2)).setText(nama2+"\t\t|\t\tWanita\t\t|\t\t"+String.format("%.2f",Double.parseDouble(String.valueOf(testrun.ctime2)))+" Mnt\t\t|\t\tRata Rata");
                                } else if (time >= 1020000 && time <= 1074000) {
                                    ((TextView) findViewById(R.id.result2)).setText(nama2+"\t\t|\t\tWanita\t\t|\t\t"+String.format("%.2f",Double.parseDouble(String.valueOf(testrun.ctime2)))+" Mnt\t\t|\t\tDiatas Rata Rata");
                                } else if (time < 1020000) {
                                    ((TextView) findViewById(R.id.result2)).setText(nama2+"\t\t|\t\tWanita\t\t|\t\t"+String.format("%.2f",Double.parseDouble(String.valueOf(testrun.ctime2)))+" Mnt\t\t|\t\tSangat Baik");
                                }
                            } else {
                                ((TextView) findViewById(R.id.result2)).setText("Data Kosong/tidak lengkap");
                            }

                        } else {
                            ((TextView) findViewById(R.id.result2)).setText("Data Kosong/tidak lengkap");
                        }

                    } else {
                        ((TextView) findViewById(R.id.result2)).setText("Data Kosong/tidak lengkap");
                    }

                } else {
                    ((TextView) findViewById(R.id.result2)).setText("Data Kosong/tidak lengkap");
                }

                if (testrun.stringdouble3 != null){
                    if(testrun.jk33 !=0){
                        if(testrun.stringname3 !=null){
                            double time = Double.parseDouble(testrun.stringdouble3);
                            int jk333 = testrun.jk33;
                            Editable nama3 = testrun.stringname3;
                            if (jk333 == 1) {
                                if (time > 1158000) {
                                    ((TextView) findViewById(R.id.result3)).setText(nama3+"\t\t|\t\tPria\t\t|\t\t"+String.format("%.2f",Double.parseDouble(String.valueOf(testrun.ctime3)))+" Mnt\t\t|\t\tBuruk");
                                } else if (time >= 1092000 && time <= 1158000) {
                                    ((TextView) findViewById(R.id.result3)).setText(nama3+"\t\t|\t\tPria\t\t|\t\t"+String.format("%.2f",Double.parseDouble(String.valueOf(testrun.ctime3)))+" Mnt\t\t|\t\tDibawah Rata Rata");
                                } else if (time >= 972000 && time <= 1086000) {
                                    ((TextView) findViewById(R.id.result3)).setText(nama3+"\t\t|\t\tPria\t\t|\t\t"+String.format("%.2f",Double.parseDouble(String.valueOf(testrun.ctime3)))+" Mnt\t\t|\t\tRata Rata");
                                } else if (time >= 912000 && time <= 966000) {
                                    ((TextView) findViewById(R.id.result3)).setText(nama3+"\t\t|\t\tPria\t\t|\t\t"+String.format("%.2f",Double.parseDouble(String.valueOf(testrun.ctime3)))+" Mnt\t\t|\t\tDiatas Rata Rata");
                                } else if (time < 912000) {
                                    ((TextView) findViewById(R.id.result3)).setText(nama3+"\t\t|\t\tPria\t\t|\t\t"+String.format("%.2f",Double.parseDouble(String.valueOf(testrun.ctime3)))+" Mnt\t\t|\t\tSangat Baik");
                                }

                            } else if (jk333 == 2) {
                                if (time > 1380000) {
                                    ((TextView) findViewById(R.id.result3)).setText(nama3+"\t\t|\t\tWanita\t\t|\t\t"+String.format("%.2f",Double.parseDouble(String.valueOf(testrun.ctime3)))+" Mnt\t\t|\t\tBuruk");
                                } else if (time >= 1308000 && time <= 1380000) {
                                    ((TextView) findViewById(R.id.result3)).setText(nama3+"\t\t|\t\tWanita\t\t|\t\t"+String.format("%.2f",Double.parseDouble(String.valueOf(testrun.ctime3)))+" Mnt\t\t|\t\tDibawah Rata Rata");
                                } else if (time >= 1080000 && time <= 1302000) {
                                    ((TextView) findViewById(R.id.result3)).setText(nama3+"\t\t|\t\tWanita\t\t|\t\t"+String.format("%.2f",Double.parseDouble(String.valueOf(testrun.ctime3)))+" Mnt\t\t|\t\tRata Rata");
                                } else if (time >= 1020000 && time <= 1074000) {
                                    ((TextView) findViewById(R.id.result3)).setText(nama3+"\t\t|\t\tWanita\t\t|\t\t"+String.format("%.2f",Double.parseDouble(String.valueOf(testrun.ctime3)))+" Mnt\t\t|\t\tDiatas Rata Rata");
                                } else if (time < 1020000) {
                                    ((TextView) findViewById(R.id.result3)).setText(nama3+"\t\t|\t\tWanita\t\t|\t\t"+String.format("%.2f",Double.parseDouble(String.valueOf(testrun.ctime3)))+" Mnt\t\t|\t\tSangat Baik");
                                }
                            } else {
                                ((TextView) findViewById(R.id.result3)).setText("Data Kosong/tidak lengkap");
                            }

                        } else {
                            ((TextView) findViewById(R.id.result3)).setText("Data Kosong/tidak lengkap");
                        }

                    } else {
                        ((TextView) findViewById(R.id.result3)).setText("Data Kosong/tidak lengkap");
                    }

                } else {
                    ((TextView) findViewById(R.id.result3)).setText("Data Kosong/tidak lengkap");
                }
                if (testrun.stringdouble4 != null){
                    if(testrun.jk44 !=0){
                        if(testrun.stringname4 !=null){
                            double time = Double.parseDouble(testrun.stringdouble4);
                            int jk444 = testrun.jk44;
                            Editable nama4 = testrun.stringname4;
                            if (jk444 == 1) {
                                if (time > 1158000) {
                                    ((TextView) findViewById(R.id.result4)).setText(nama4+"\t\t|\t\tPria\t\t|\t\t"+String.format("%.2f",Double.parseDouble(String.valueOf(testrun.ctime4)))+" Mnt\t\t|\t\tBuruk");
                                } else if (time >= 1092000 && time <= 1158000) {
                                    ((TextView) findViewById(R.id.result4)).setText(nama4+"\t\t|\t\tPria\t\t|\t\t"+String.format("%.2f",Double.parseDouble(String.valueOf(testrun.ctime4)))+" Mnt\t\t|\t\tDibawah Rata Rata");
                                } else if (time >= 972000 && time <= 1086000) {
                                    ((TextView) findViewById(R.id.result4)).setText(nama4+"\t\t|\t\tPria\t\t|\t\t"+String.format("%.2f",Double.parseDouble(String.valueOf(testrun.ctime4)))+" Mnt\t\t|\t\tRata Rata");
                                } else if (time >= 912000 && time <= 966000) {
                                    ((TextView) findViewById(R.id.result4)).setText(nama4+"\t\t|\t\tPria\t\t|\t\t"+String.format("%.2f",Double.parseDouble(String.valueOf(testrun.ctime4)))+" Mnt\t\t|\t\tDiatas Rata Rata");
                                } else if (time < 912000) {
                                    ((TextView) findViewById(R.id.result4)).setText(nama4+"\t\t|\t\tPria\t\t|\t\t"+String.format("%.2f",Double.parseDouble(String.valueOf(testrun.ctime4)))+" Mnt\t\t|\t\tSangat Baik");
                                }

                            } else if (jk444 == 2) {
                                if (time > 1380000) {
                                    ((TextView) findViewById(R.id.result4)).setText(nama4+"\t\t|\t\tWanita\t\t|\t\t"+String.format("%.2f",Double.parseDouble(String.valueOf(testrun.ctime4)))+" Mnt\t\t|\t\tBuruk");
                                } else if (time >= 1308000 && time <= 1380000) {
                                    ((TextView) findViewById(R.id.result4)).setText(nama4+"\t\t|\t\tWanita\t\t|\t\t"+String.format("%.2f",Double.parseDouble(String.valueOf(testrun.ctime4)))+" Mnt\t\t|\t\tDibawah Rata Rata");
                                } else if (time >= 1080000 && time <= 1302000) {
                                    ((TextView) findViewById(R.id.result4)).setText(nama4+"\t\t|\t\tWanita\t\t|\t\t"+String.format("%.2f",Double.parseDouble(String.valueOf(testrun.ctime4)))+" Mnt\t\t|\t\tRata Rata");
                                } else if (time >= 1020000 && time <= 1074000) {
                                    ((TextView) findViewById(R.id.result4)).setText(nama4+"\t\t|\t\tWanita\t\t|\t\t"+String.format("%.2f",Double.parseDouble(String.valueOf(testrun.ctime4)))+" Mnt\t\t|\t\tDiatas Rata Rata");
                                } else if (time < 1020000) {
                                    ((TextView) findViewById(R.id.result4)).setText(nama4+"\t\t|\t\tWanita\t\t|\t\t"+String.format("%.2f",Double.parseDouble(String.valueOf(testrun.ctime4)))+" Mnt\t\t|\t\tSangat Baik");
                                }
                            } else {
                                ((TextView) findViewById(R.id.result4)).setText("Data Kosong/tidak lengkap");
                            }

                        } else {
                            ((TextView) findViewById(R.id.result4)).setText("Data Kosong/tidak lengkap");
                        }

                    } else {
                        ((TextView) findViewById(R.id.result4)).setText("Data Kosong/tidak lengkap");
                    }

                } else {
                    ((TextView) findViewById(R.id.result4)).setText("Data Kosong/tidak lengkap");
                }

            }

        });
    }

}
