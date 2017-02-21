package com.example.calendar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.widget.Button;
import android.widget.EditText;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    DataAppearance dataAppearance = new DataAppearance();
    CalendearDate calendeardate = new CalendearDate();
    Optional_button_movement obm = new Optional_button_movement();
    BackgroundColor bc = new BackgroundColor();
    PopupSchedule ps = new PopupSchedule();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bc.color_month(this);
        optional_button_click(this);
        ps.day_button_click(this);
        dataAppearance.FixedAppearance(this);

    }

    // 機能ボタンの処理
    public void optional_button_click(final MainActivity mainactivity) {
        findViewById(R.id.previous_Month).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                obm.previous_month();
                dataAppearance.FixedAppearance(mainactivity);
            }
        });

        findViewById(R.id.next_Month).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                obm.next_month();
                dataAppearance.FixedAppearance(mainactivity);
            }
        });

        findViewById(R.id.color_set).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                obm.color_setting(mainactivity);
            }
        });
        
    }

    /*
      status  0:red
              1:blue
              2:green
              -1:gray(過去の日付)
              -2:white(未来で日付の存在しない場所)
       */
    public void color_day(int status,int id,MainActivity mainactivity){
        Button btn = (Button)mainactivity.findViewById(id);
        if(status == 0){
            btn.setBackgroundResource(R.drawable.bgcolor_status_0);
        }
        if(status == 1){
            btn.setBackgroundResource(R.drawable.bgcolor_status_1);
        }
        if(status == 2){
            btn.setBackgroundResource(R.drawable.bgcolor_status_2);
        }
        if(status == -1){
            btn.setBackgroundResource(R.drawable.bgcolor_status_before);
        }
        if(status == -2){
            btn.setBackgroundResource(R.drawable.bgcolor_status_blank);
        }
    }





}