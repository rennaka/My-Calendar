package com.example.calendar;

/**
 * Created by 廉 on 2017/02/15.
 */
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import java.util.Calendar;

public class CalendearDate {

    int [][] CalendarText = new int [6][7];

    public void CalendarInfoDecide(int Curyear , int Curmonth){
        int year = Curyear;
        int month = Curmonth;
        int FirstDay;  //最初の曜日
        int HasDay;    // 何日あるか

        Calendar calendar1 = Calendar.getInstance();

        calendar1.set(year,month+1,1);
        calendar1.add(Calendar.DAY_OF_MONTH, -1);
        HasDay = calendar1.get(Calendar.DAY_OF_MONTH);
        calendar1.set(year,month,1);
        FirstDay = calendar1.get(Calendar.DAY_OF_WEEK);

        int DayCounter = 1;
        for(int i = 0;i<6;i++){
            for(int j = 0;j<7;j++){
                CalendarText[i][j] = 0;
                if(i == 0){
                    if(j+1>=FirstDay){
                        CalendarText[i][j] = DayCounter;
                        DayCounter++;
                    }
                    else{
                        CalendarText[i][j] = -2;
                    }
                }
                else{
                    if(DayCounter>HasDay) {
                        CalendarText[i][j] = -2;
                    }
                    else {
                        CalendarText[i][j] = DayCounter;
                        DayCounter++;
                    }
                }
            }
        }
    }

}
