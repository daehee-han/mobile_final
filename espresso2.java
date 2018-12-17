package com.kmu.afinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class espresso2 extends AppCompatActivity {

    EditText name;
    EditText date;
    EditText machine;
    EditText grinder;
    EditText grinder_num;
    EditText aci_st;
    EditText aci_ed;
    EditText aci_d;
    EditText sw_st;
    EditText sw_ed;
    EditText sw_d;
    EditText bt_st;
    EditText bt_ed;
    EditText bt_d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_espresso2);

        ImageButton b = (ImageButton)findViewById(R.id.create_bt);
        name = (EditText)findViewById(R.id.name_text);
        date = (EditText)findViewById(R.id.roasting_text);
        machine = (EditText)findViewById(R.id.machine_text);
        grinder = (EditText)findViewById(R.id.grinder_text);
        grinder_num = (EditText)findViewById(R.id.grinder_num);
        aci_st = (EditText)findViewById(R.id.aci_st);
        aci_ed = (EditText)findViewById(R.id.aci_ed);
        aci_d = (EditText)findViewById(R.id.aci_d);
        sw_st = (EditText)findViewById(R.id.sw_st);
        sw_ed = (EditText)findViewById(R.id.sw_ed);
        sw_d = (EditText)findViewById(R.id.sw_d);
        bt_st = (EditText)findViewById(R.id.bt_st);
        bt_ed = (EditText)findViewById(R.id.bt_ed);
        bt_d = (EditText)findViewById(R.id.bt_d);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(espresso2.this,
                        espresso3.class);
                intent.putExtra("name",name.getText().toString());
                intent.putExtra("date", date.getText().toString());
                intent.putExtra("machine",machine.getText().toString());
                intent.putExtra("grinder",grinder.getText().toString());
                intent.putExtra("grinder_num",Float.valueOf(grinder_num.getText().toString()));
                intent.putExtra("aci_st",Float.valueOf(aci_st.getText().toString()));
                intent.putExtra("aci_ed",Float.valueOf(aci_ed.getText().toString()));
                intent.putExtra("aci_d",Float.valueOf(aci_d.getText().toString()));
                intent.putExtra("sw_st",Float.valueOf(sw_st.getText().toString()));
                intent.putExtra("sw_ed",Float.valueOf(sw_ed.getText().toString()));
                intent.putExtra("sw_d",Float.valueOf(sw_d.getText().toString()));
                intent.putExtra("bt_st",Float.valueOf(bt_st.getText().toString()));
                intent.putExtra("bt_ed",Float.valueOf(bt_ed.getText().toString()));
                intent.putExtra("bt_d",Float.valueOf(bt_d.getText().toString()));
                startActivity(intent);
            }
        });
    }
}
