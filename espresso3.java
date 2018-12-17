package com.kmu.afinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;


public class espresso3 extends AppCompatActivity {
    TextView title;

    EditText grind_num;
    EditText coffee_num;
    EditText water_num;
    EditText time_num;
    EditText aci_num;
    EditText sw_num;
    EditText bt_num;

    ImageButton grind_up;
    ImageButton grind_down;
    ImageButton coffee_up;
    ImageButton coffee_down;
    ImageButton water_up;
    ImageButton water_down;
    ImageButton time_up;
    ImageButton time_down;
    ImageButton aci_up;
    ImageButton aci_down;
    ImageButton sw_up;
    ImageButton sw_down;
    ImageButton bt_up;
    ImageButton bt_down;

    float aci_d;
    float aci_st;
    float aci_ed;
    float sw_d;
    float sw_st;
    float sw_ed;
    float bt_d;
    float bt_st;
    float bt_ed;
    float grinder_num;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_espresso3);

        title=(TextView)findViewById(R.id.maintitle);

        grind_num=(EditText)findViewById(R.id.grind_num);
        coffee_num=(EditText)findViewById(R.id.coffee_num);
        water_num=(EditText)findViewById(R.id.water_num);
        time_num=(EditText)findViewById(R.id.time_num);
        aci_num=(EditText)findViewById(R.id.aci_num);
        sw_num=(EditText)findViewById(R.id.sw_num);
        bt_num=(EditText)findViewById(R.id.bt_num);

        grind_up=(ImageButton)findViewById(R.id.grind_up);
        grind_down=(ImageButton)findViewById(R.id.grind_down);
        coffee_up=(ImageButton)findViewById(R.id.coffee_up);
        coffee_down=(ImageButton)findViewById(R.id.coffee_down);
        water_up=(ImageButton)findViewById(R.id.water_up);
        water_down=(ImageButton)findViewById(R.id.water_down);
        time_up=(ImageButton)findViewById(R.id.time_up);
        time_down=(ImageButton)findViewById(R.id.time_down);
        aci_up=(ImageButton)findViewById(R.id.aci_up);
        aci_down=(ImageButton)findViewById(R.id.aci_down);
        sw_up=(ImageButton)findViewById(R.id.sw_up);
        sw_down=(ImageButton)findViewById(R.id.sw_down);
        bt_up=(ImageButton)findViewById(R.id.bt_up);
        bt_down=(ImageButton)findViewById(R.id.bt_down);

        Intent intent = getIntent();

        String name = intent.getExtras().getString("name"); /*String형*/
        title.setText(name);

        aci_st = intent.getExtras().getFloat("aci_st");
        aci_ed = intent.getExtras().getFloat("aci_ed");
        aci_d = intent.getExtras().getFloat("aci_d");
        sw_st = intent.getExtras().getFloat("sw_st");
        sw_ed = intent.getExtras().getFloat("sw_ed");
        sw_d = intent.getExtras().getFloat("sw_d");
        bt_st = intent.getExtras().getFloat("bt_st");
        bt_ed = intent.getExtras().getFloat("bt_ed");
        bt_d = intent.getExtras().getFloat("bt_d");

        grinder_num = intent.getExtras().getFloat("grinder_num");
        String grinder = intent.getExtras().getString("grinder");
        String machine = intent.getExtras().getString("machine");
        String date = intent.getExtras().getString("date");

        grind_num.setText("5");
        aci_num.setText(String.valueOf(""+(aci_st+aci_ed)/2));
        sw_num.setText(String.valueOf(""+(sw_st+sw_ed)/2));
        bt_num.setText(String.valueOf(""+(bt_st+bt_ed)/2));



        View.OnClickListener listener = new View.OnClickListener()
        {
            public void onClick(View v)
            {
                switch (v.getId())
                {
                    case R.id.aci_up:
                        Float i = Float.parseFloat(aci_num.getText().toString());
                        aci_num.setText(String.valueOf(""+(i+aci_d)));
                        break;
                    case R.id.aci_down:
                        Float a = Float.parseFloat(aci_num.getText().toString());
                        aci_num.setText(String.valueOf(""+(a-aci_d)));
                        break;
                    case R.id.sw_up:
                        Float b = Float.parseFloat(aci_num.getText().toString());
                        aci_num.setText(String.valueOf(""+(b+aci_d)));
                        break;
                    case R.id.sw_down:
                        Float c = Float.parseFloat(aci_num.getText().toString());
                        aci_num.setText(String.valueOf(""+(c-aci_d)));
                        break;
                    case R.id.bt_up:
                        Float i = Float.parseFloat(aci_num.getText().toString());
                        aci_num.setText(String.valueOf(""+(i+aci_d)));
                        break;
                    case R.id.bt_down:
                        Float a = Float.parseFloat(aci_num.getText().toString());
                        aci_num.setText(String.valueOf(""+(a-aci_d)));
                        break;
                }
            }
        };

        aci_up.setOnClickListener(listener);
        aci_down.setOnClickListener(listener);







    }
}
