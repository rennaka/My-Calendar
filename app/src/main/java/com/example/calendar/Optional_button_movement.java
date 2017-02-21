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

        public void color_setting(MainActivity mainactivity){
            LinearLayout poplayout = (LinearLayout)mainactivity.getLayoutInflater().inflate(R.layout.popup_status,null);
            PopupWindow pw = new PopupWindow(mainactivity);
            pw.setContentView(poplayout);
            pw.setBackgroundDrawable(null);

        }
}
