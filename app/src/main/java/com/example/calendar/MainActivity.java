package com.example.calendar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.widget.Button;
import android.widget.EditText;
import android.app.Activity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    DataAppearance dataAppearance = new DataAppearance();
    Optional_button_movement obm = new Optional_button_movement();
    BackgroundColor bc = new BackgroundColor();
    PopupSchedule ps = new PopupSchedule();
    Calendar calendar = Calendar.getInstance();
    int Curyear = calendar.get(Calendar.YEAR);
    int Curmonth = calendar.get(Calendar.MONTH);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bc.color_month(this);
        optional_button_click();
        ps.day_button_click(this);
        FixedAppearance();

    }

    // 機能ボタンの処理
    public void optional_button_click() {
        findViewById(R.id.previous_Month).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                previous_month();
                FixedAppearance();
            }
        });

        findViewById(R.id.next_Month).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                next_month();
                FixedAppearance();
            }
        });

        findViewById(R.id.color_set).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                color_setting();
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
    public static void color_day(int status,int id,MainActivity mainactivity){
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


    // DataAppearanceクラスの内容


        CalendearDate calendeardate = new CalendearDate();

        public void FixedAppearance() {

            calendeardate.CalendarInfoDecide(Curyear,Curmonth);

            Button button1 = (Button)findViewById(R.id.day_1);
            if (calendeardate.CalendarText[0][0] > 0) {
                button1.setText(String.valueOf(calendeardate.CalendarText[0][0]));
            } else {
                button1.setText("");
            }
            Button button2 = (Button)findViewById(R.id.day_2);
            if (calendeardate.CalendarText[0][1] > 0) {
                button2.setText(String.valueOf(calendeardate.CalendarText[0][1]));
            } else {
                button2.setText("");
            }
            Button button3 = (Button)findViewById(R.id.day_3);
            if (calendeardate.CalendarText[0][2] > 0) {
                button3.setText(String.valueOf(calendeardate.CalendarText[0][2]));
            } else {
                button3.setText("");
            }
            Button button4 = (Button)findViewById(R.id.day_4);
            if (calendeardate.CalendarText[0][3] > 0) {
                button4.setText(String.valueOf(calendeardate.CalendarText[0][3]));
            } else {
                button4.setText("");
            }
            Button button5 = (Button)findViewById(R.id.day_5);
            if (calendeardate.CalendarText[0][4] > 0) {
                button5.setText(String.valueOf(calendeardate.CalendarText[0][4]));
            } else {
                button5.setText("");
            }
            Button button6 = (Button)findViewById(R.id.day_6);
            if (calendeardate.CalendarText[0][5] > 0) {
                button6.setText(String.valueOf(calendeardate.CalendarText[0][5]));
            } else {
                button6.setText("");
            }
            Button button7 = (Button)findViewById(R.id.day_7);
            if (calendeardate.CalendarText[0][6] > 0) {
                button7.setText(String.valueOf(calendeardate.CalendarText[0][6]));
            } else {
                button7.setText("");
            }
            Button button8 = (Button)findViewById(R.id.day_8);
            if (calendeardate.CalendarText[1][0] > 0) {
                button8.setText(String.valueOf(calendeardate.CalendarText[1][0]));
            } else {
                button8.setText("");
            }
            Button button9 = (Button)findViewById(R.id.day_9);
            if (calendeardate.CalendarText[1][1] > 0) {
                button9.setText(String.valueOf(calendeardate.CalendarText[1][1]));
            } else {
                button9.setText("");
            }
            Button button10 = (Button)findViewById(R.id.day_10);
            if (calendeardate.CalendarText[1][2] > 0) {
                button10.setText(String.valueOf(calendeardate.CalendarText[1][2]));
            } else {
                button10.setText("");
            }
            Button button11 = (Button)findViewById(R.id.day_11);
            if (calendeardate.CalendarText[1][3] > 0) {
                button11.setText(String.valueOf(calendeardate.CalendarText[1][3]));
            } else {
                button11.setText("");
            }
            Button button12 = (Button)findViewById(R.id.day_12);
            if (calendeardate.CalendarText[1][4] > 0) {
                button12.setText(String.valueOf(calendeardate.CalendarText[1][4]));
            } else {
                button12.setText("");
            }
            Button button13 = (Button)findViewById(R.id.day_13);
            if (calendeardate.CalendarText[1][5] > 0) {
                button13.setText(String.valueOf(calendeardate.CalendarText[1][5]));
            } else {
                button13.setText("");
            }
            Button button14 = (Button)findViewById(R.id.day_14);
            if (calendeardate.CalendarText[1][6] > 0) {
                button14.setText(String.valueOf(calendeardate.CalendarText[1][6]));
            } else {
                button14.setText("");
            }
            Button button15 = (Button)findViewById(R.id.day_15);
            if (calendeardate.CalendarText[2][0] > 0) {
                button15.setText(String.valueOf(calendeardate.CalendarText[2][0]));
            } else {
                button15.setText("");
            }
            Button button16 = (Button)findViewById(R.id.day_16);
            if (calendeardate.CalendarText[2][1] > 0) {
                button16.setText(String.valueOf(calendeardate.CalendarText[2][1]));
            } else {
                button16.setText("");
            }
            Button button17 = (Button)findViewById(R.id.day_17);
            if (calendeardate.CalendarText[2][2] > 0) {
                button17.setText(String.valueOf(calendeardate.CalendarText[2][2]));
            } else {
                button17.setText("");
            }
            Button button18 = (Button)findViewById(R.id.day_18);
            if (calendeardate.CalendarText[2][3] > 0) {
                button18.setText(String.valueOf(calendeardate.CalendarText[2][3]));
            } else {
                button18.setText("");
            }
            Button button19 = (Button)findViewById(R.id.day_19);
            if (calendeardate.CalendarText[2][4] > 0) {
                button19.setText(String.valueOf(calendeardate.CalendarText[2][4]));
            } else {
                button19.setText("");
            }
            Button button20 = (Button)findViewById(R.id.day_20);
            if (calendeardate.CalendarText[2][5] > 0) {
                button20.setText(String.valueOf(calendeardate.CalendarText[2][5]));
            } else {
                button20.setText("");
            }
            Button button21 = (Button)findViewById(R.id.day_21);
            if (calendeardate.CalendarText[2][6] > 0) {
                button21.setText(String.valueOf(calendeardate.CalendarText[2][6]));
            } else {
                button21.setText("");
            }
            Button button22 = (Button)findViewById(R.id.day_22);
            if (calendeardate.CalendarText[3][0] > 0) {
                button22.setText(String.valueOf(calendeardate.CalendarText[3][0]));
            } else {
                button22.setText("");
            }
            Button button23 = (Button)findViewById(R.id.day_23);
            if (calendeardate.CalendarText[3][1] > 0) {
                button23.setText(String.valueOf(calendeardate.CalendarText[3][1]));
            } else {
                button23.setText("");
            }
            Button button24 = (Button)findViewById(R.id.day_24);
            if (calendeardate.CalendarText[3][2] > 0) {
                button24.setText(String.valueOf(calendeardate.CalendarText[3][2]));
            } else {
                button24.setText("");
            }
            Button button25 = (Button)findViewById(R.id.day_25);
            if (calendeardate.CalendarText[3][3] > 0) {
                button25.setText(String.valueOf(calendeardate.CalendarText[3][3]));
            } else {
                button25.setText("");
            }
            Button button26 = (Button)findViewById(R.id.day_26);
            if (calendeardate.CalendarText[3][4] > 0) {
                button26.setText(String.valueOf(calendeardate.CalendarText[3][4]));
            } else {
                button26.setText("");
            }
            Button button27 = (Button)findViewById(R.id.day_27);
            if (calendeardate.CalendarText[3][5] > 0) {
                button27.setText(String.valueOf(calendeardate.CalendarText[3][5]));
            } else {
                button27.setText("");
            }
            Button button28 = (Button)findViewById(R.id.day_28);
            if (calendeardate.CalendarText[3][6] > 0) {
                button28.setText(String.valueOf(calendeardate.CalendarText[3][6]));
            } else {
                button28.setText("");
            }
            Button button29 = (Button)findViewById(R.id.day_29);
            if (calendeardate.CalendarText[4][0] > 0) {
                button29.setText(String.valueOf(calendeardate.CalendarText[4][0]));
            } else {
                button29.setText("");
            }
            Button button30 = (Button)findViewById(R.id.day_30);
            if (calendeardate.CalendarText[4][1] > 0) {
                button30.setText(String.valueOf(calendeardate.CalendarText[4][1]));
            } else {
                button30.setText("");
            }
            Button button31 = (Button)findViewById(R.id.day_31);
            if (calendeardate.CalendarText[4][2] > 0) {
                button31.setText(String.valueOf(calendeardate.CalendarText[4][2]));
            } else {
                button31.setText("");
            }
            Button button32 = (Button)findViewById(R.id.day_32);
            if (calendeardate.CalendarText[4][3] > 0) {
                button32.setText(String.valueOf(calendeardate.CalendarText[4][3]));
            } else {
                button32.setText("");
            }
            Button button33 = (Button)findViewById(R.id.day_33);
            if (calendeardate.CalendarText[4][4] > 0) {
                button33.setText(String.valueOf(calendeardate.CalendarText[4][4]));
            } else {
                button33.setText("");
            }
            Button button34 = (Button)findViewById(R.id.day_34);
            if (calendeardate.CalendarText[4][5] > 0) {
                button34.setText(String.valueOf(calendeardate.CalendarText[4][5]));
            } else {
                button34.setText("");
            }
            Button button35 = (Button)findViewById(R.id.day_35);
            if (calendeardate.CalendarText[4][6] > 0) {
                button35.setText(String.valueOf(calendeardate.CalendarText[4][6]));
            } else {
                button35.setText("");
            }
            Button button36 = (Button)findViewById(R.id.day_36);
            if (calendeardate.CalendarText[5][0] > 0) {
                button36.setText(String.valueOf(calendeardate.CalendarText[5][0]));
            } else {
                button36.setText("");
            }
            Button button37 = (Button)findViewById(R.id.day_37);
            if (calendeardate.CalendarText[5][1] > 0) {
                button37.setText(String.valueOf(calendeardate.CalendarText[5][1]));
            } else {
                button37.setText("");
            }
            Button button38 = (Button)findViewById(R.id.day_38);
            if (calendeardate.CalendarText[5][2] > 0) {
                button38.setText(String.valueOf(calendeardate.CalendarText[5][2]));
            } else {
                button38.setText("");
            }
            Button button39 = (Button)findViewById(R.id.day_39);
            if (calendeardate.CalendarText[5][3] > 0) {
                button39.setText(String.valueOf(calendeardate.CalendarText[5][3]));
            } else {
                button39.setText("");
            }
            Button button40 = (Button)findViewById(R.id.day_40);
            if (calendeardate.CalendarText[5][4] > 0) {
                button40.setText(String.valueOf(calendeardate.CalendarText[5][4]));
            } else {
                button40.setText("");
            }
            Button button41 = (Button)findViewById(R.id.day_41);
            if (calendeardate.CalendarText[5][5] > 0) {
                button41.setText(String.valueOf(calendeardate.CalendarText[5][5]));
            } else {
                button41.setText("");
            }
            Button button42 = (Button)findViewById(R.id.day_42);
            if (calendeardate.CalendarText[5][6] > 0) {
                button42.setText(String.valueOf(calendeardate.CalendarText[5][6]));
            } else {
                button42.setText("");
            }

            TextView textview = (TextView)findViewById(R.id.Title);
            textview.setText(String.valueOf(Curyear) + "年" + String.valueOf(Curmonth + 1) + "月");

        }




    //O
    public void color_setting(){

        LinearLayout poplayout = (LinearLayout)getLayoutInflater().inflate(R.layout.popup_status,null);
        PopupWindow pw = new PopupWindow();
        pw.setContentView(poplayout);
        pw.setBackgroundDrawable(null);
        findViewById(R.id.color_decide).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioGroup rg_sun = (RadioGroup)findViewById(R.id.status_sun);
                int id_sun = rg_sun.getCheckedRadioButtonId();
                if (id_sun == R.id.button_sun_red) {
                    BackgroundColor.Sun_status = 0;
                }
                if (id_sun == R.id.button_sun_blue) {
                    BackgroundColor.Sun_status = 1;
                }
                if (id_sun == R.id.button_sun_green) {
                    BackgroundColor.Sun_status = 2;
                }
                RadioGroup rg_mon = (RadioGroup)findViewById(R.id.status_mon);
                int id_mon = rg_mon.getCheckedRadioButtonId();
                if (id_mon == R.id.button_mon_red) {
                    BackgroundColor.Mon_status = 0;
                }
                if (id_mon == R.id.button_mon_blue) {
                    BackgroundColor.Mon_status = 1;
                }
                if (id_mon == R.id.button_mon_green) {
                    BackgroundColor.Mon_status = 2;
                }
                RadioGroup rg_tue = (RadioGroup)findViewById(R.id.status_tue);
                int id_tue = rg_tue.getCheckedRadioButtonId();
                if (id_tue == R.id.button_tue_red) {
                    BackgroundColor.Tue_status = 0;
                }
                if (id_tue == R.id.button_tue_blue) {
                    BackgroundColor.Tue_status = 1;
                }
                if (id_tue == R.id.button_tue_green) {
                    BackgroundColor.Tue_status = 2;
                }
                RadioGroup rg_wed = (RadioGroup)findViewById(R.id.status_wed);
                int id_wed = rg_wed.getCheckedRadioButtonId();
                if (id_wed == R.id.button_wed_red) {
                    BackgroundColor.Wed_status = 0;
                }
                if (id_wed == R.id.button_wed_blue) {
                    BackgroundColor.Wed_status = 1;
                }
                if (id_wed == R.id.button_wed_green) {
                    BackgroundColor.Wed_status = 2;
                }
                RadioGroup rg_thu = (RadioGroup)findViewById(R.id.status_thu);
                int id_thu = rg_thu.getCheckedRadioButtonId();
                if (id_thu == R.id.button_thu_red) {
                    BackgroundColor.Thu_status = 0;
                }
                if (id_thu == R.id.button_thu_blue) {
                    BackgroundColor.Thu_status = 1;
                }
                if (id_thu == R.id.button_thu_green) {
                    BackgroundColor.Thu_status = 2;
                }
                RadioGroup rg_fri = (RadioGroup)findViewById(R.id.status_fri);
                int id_fri = rg_fri.getCheckedRadioButtonId();
                if (id_fri == R.id.button_fri_red) {
                    BackgroundColor.Fri_status = 0;
                }
                if (id_fri == R.id.button_fri_blue) {
                    BackgroundColor.Fri_status = 1;
                }
                if (id_fri == R.id.button_fri_green) {
                    BackgroundColor.Fri_status = 2;
                }
                RadioGroup rg_sat = (RadioGroup)findViewById(R.id.status_sat);
                int id_sat = rg_sat.getCheckedRadioButtonId();
                if (id_sat == R.id.button_sat_red) {
                    BackgroundColor.Sat_status = 0;
                }
                if (id_sat == R.id.button_sat_blue) {
                    BackgroundColor.Sat_status = 1;
                }
                if (id_sat == R.id.button_sat_green) {
                    BackgroundColor.Sat_status = 2;
                }
            }
        });
    }

    public void previous_month(){
        if (Curmonth == 0) {
            Curyear--;
            Curmonth = 11;
        } else {
            Curmonth--;
        }
    }

    public void next_month(){
        if (Curmonth == 11) {
            Curyear++;
            Curmonth = 0;
        } else {
            Curmonth++;
        }
    }

}