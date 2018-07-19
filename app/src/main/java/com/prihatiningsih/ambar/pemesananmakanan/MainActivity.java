package com.prihatiningsih.ambar.pemesananmakanan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText id_jumlhayam=(EditText) findViewById(R.id.id_jmlhayam);
        final EditText id_jumlhBebek=(EditText) findViewById(R.id.id_jmlhbebek);
        final EditText id_jumlhLele=(EditText) findViewById(R.id.id_jumlhLele);
        final CheckBox id_ayam=(CheckBox) findViewById(R.id.id_ayam);
        final CheckBox id_bebek=(CheckBox) findViewById(R.id.id_bebek);
        final CheckBox id_lele=(CheckBox) findViewById(R.id.id_lele);
        final TextView id_total=(TextView) findViewById(R.id.id_total);
        Button id_simpan=(Button) findViewById(R.id.id_button);

        id_simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int harga=0;
                int total_jml_ayam=0;
                int total_jml_bebek=0;
                int total_jml_lele=0;
                int total=0;

                if(id_ayam.isChecked()){
                    harga=12000;
                    total_jml_ayam=harga*Integer.parseInt(id_jumlhayam.getText().toString());

                }
                if(id_bebek.isChecked()){
                    harga=20000;
                    total_jml_bebek=harga*Integer.parseInt(id_jumlhBebek.getText().toString());

                }
                if(id_lele.isChecked()){
                    harga=12000;
                    total_jml_lele=harga*Integer.parseInt(id_jumlhLele.getText().toString());

                }
                total = total_jml_ayam + total_jml_bebek + total_jml_lele;
                id_total.setText(""+total);
            }
        });

    }
}
