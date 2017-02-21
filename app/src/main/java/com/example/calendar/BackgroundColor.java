package com.example.calendar;

import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import java.util.Calendar;

/**
 * Created by 廉 on 2017/02/19.
 */

public class BackgroundColor {

    static int Sun_status = 0;
    static int Mon_status = 1;
    static int Tue_status = 1;
    static int Wed_status = 1;
    static int Thu_status = 1;
    static int Fri_status = 1;
    static int Sat_status = 0;
    static MainActivity mainactivity;
    int [] status = new int[42];
    int id[] = {R.id.day_1,R.id.day_2,R.id.day_3,R.id.day_4,R.id.day_5,R.id.day_6,R.id.day_7,R.id.day_8,R.id.day_9,R.id.day_10,R.id.day_11,R.id.day_12,R.id.day_13,R.id.day_14,R.id.day_15,R.id.day_16,R.id.day_17,R.id.day_18,R.id.day_19,R.id.day_20,R.id.day_21,R.id.day_22,R.id.day_23,R.id.day_24,R.id.day_25,R.id.day_26,R.id.day_27,R.id.day_28,R.id.day_29,R.id.day_30,R.id.day_31,R.id.day_32,R.id.day_33,R.id.day_34,R.id.day_35,R.id.day_36,R.id.day_37,R.id.day_38,R.id.day_39,R.id.day_40,R.id.day_41,R.id.day_42};
    CalendearDate calendeardate = new CalendearDate();
    MainActivity ma = new MainActivity();
    Calendar calendar = Calendar.getInstance();
    final int Nowyear = calendar.get(Calendar.YEAR);
    final int Nowmonth= calendar.get(Calendar.MONTH);
    final int Nowday = calendar.get(Calendar.DATE);

    /*
        0:過去
        1:未来
        2:現在(今月)
     */
    public int JudgePast(int year,int month){
        if(Nowyear<year){
            return 1;
        }else if(Nowyear>year){
            return 0;
        }
        else{
            if(Nowmonth<month){
                return 1;
            }else if(Nowmonth>month){
                return 0;
            }else{
                return 2;
            }
        }
    }

    public void StatusDecide(){
        if(JudgePast(getCuryear(),getCurmonth()) == 0){
            for(int i = 0;i<42;i++){
                status[i] = -1;
            }
        }
        else if(JudgePast(getCuryear(),getCurmonth()) == 2){
            Calendar calendar2 = Calendar.getInstance();
            calendar2.set(getCuryear(),getCurmonth(),1);
            int FirstDay = calendar2.get(Calendar.DAY_OF_WEEK);
            for(int i = 0;i<Nowday+FirstDay-1;i++){
                status[i] = -1;
            }
            for(int i = Nowday+FirstDay-1;i<42;i++){
                if(calendeardate.CalendarText[i/7][i%7] == -2) {
                    status[i] = -2;
                }
                else{
                    if(i%7 == 0){
                        status[i] = Sun_status;
                    }
                    if(i%7 == 1){
                        status[i] = Mon_status;
                    }
                    if(i%7 == 2){
                        status[i] = Tue_status;
                    }
                    if(i%7 == 3){
                        status[i] = Wed_status;
                    }
                    if(i%7 == 4){
                        status[i] = Thu_status;
                    }
                    if(i%7 == 5){
                        status[i] = Fri_status;
                    }
                    if(i%7 == 6){
                        status[i] = Sat_status;
                    }
                }
            }
        }
        else{
            for(int i = 0;i<42;i++){
                if(calendeardate.CalendarText[i/7][i%7] == -2) {
                    status[i] = -2;
                }
                else{
                    if(i%7 == 0){
                        status[i] = Sun_status;
                    }
                    if(i%7 == 1){
                        status[i] = Mon_status;
                    }
                    if(i%7 == 2){
                        status[i] = Tue_status;
                    }
                    if(i%7 == 3){
                        status[i] = Wed_status;
                    }
                    if(i%7 == 4){
                        status[i] = Thu_status;
                    }
                    if(i%7 == 5){
                        status[i] = Fri_status;
                    }
                    if(i%7 == 6){
                        status[i] = Sat_status;
                    }
                }
            }
        }
    }



    public int get_firstday(int year,int month){
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(year,month,1);
        int FirstDay = calendar2.get(Calendar.DAY_OF_WEEK);
        return FirstDay;
    }

    public void color_basic(MainActivity mainactivity){
        StatusDecide();
        for(int i = 0;i<42;i++){
            ma.color_day(status[i],id[i],mainactivity);
        }
    }

    public void color_appointment(MainActivity mainactivity){
        for(int i = 0;i<Datatable.list_day.size();i++){
            if(Datatable.list_day.get(i).year == getCuryear()){
                if(Datatable.list_day.get(i).month == getCurmonth()){
                    ma.color_day(Datatable.list_day.get(i).status,id[Datatable.list_day.get(i).day + get_firstday(getCuryear(),getCurmonth()) - 2],mainactivity);
                }
            }
        }
    }


    
    public int getCuryear(){
        Optional_button_movement obm = new Optional_button_movement();
        return obm.Curyear;
    }
    public int getCurmonth(){
        Optional_button_movement obm = new Optional_button_movement();
        return obm.Curmonth;
    }
    
}
