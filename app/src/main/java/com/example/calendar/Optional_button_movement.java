package com.example.calendar;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.*;

import java.util.Calendar;

/**
 * Created by 廉 on 2017/02/20.
 */

public class Optional_button_movement {

    Calendar calendar = Calendar.getInstance();
    int Curyear = calendar.get(Calendar.YEAR);
    int Curmonth = calendar.get(Calendar.MONTH);
    static MainActivity mainactivity;

/*
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

        */

        public void color_setting(MainActivity mainactivity){

            this.mainactivity = mainactivity;
            LinearLayout poplayout = (LinearLayout)mainactivity.getLayoutInflater().inflate(R.layout.popup_status,null);
            PopupWindow pw = new PopupWindow(mainactivity);
            pw.setContentView(poplayout);
            pw.setBackgroundDrawable(null);
            mainactivity.findViewById(R.id.color_decide).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    RadioGroup rg_sun = (RadioGroup) v.findViewById(R.id.status_sun);
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
                    RadioGroup rg_mon = (RadioGroup) Optional_button_movement.mainactivity.findViewById(R.id.status_mon);
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
                    RadioGroup rg_tue = (RadioGroup) Optional_button_movement.mainactivity.findViewById(R.id.status_tue);
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
                    RadioGroup rg_wed = (RadioGroup) Optional_button_movement.mainactivity.findViewById(R.id.status_wed);
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
                    RadioGroup rg_thu = (RadioGroup) Optional_button_movement.mainactivity.findViewById(R.id.status_thu);
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
                    RadioGroup rg_fri = (RadioGroup) Optional_button_movement.mainactivity.findViewById(R.id.status_fri);
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
                    RadioGroup rg_sat = (RadioGroup) Optional_button_movement.mainactivity.findViewById(R.id.status_sat);
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
}
