package com.example.calendar;

import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import java.util.Calendar;

/**
 * Created by 廉 on 2017/02/20.
 */

// ボタン、テキストボックスに値を表示
public class DataAppearance {

    CalendearDate calendeardate = new CalendearDate();

    public void FixedAppearance(MainActivity mainactivity){

        calendeardate.CalendarInfoDecide(getCuryear(),getCurmonth());

        Button button1 = (Button)mainactivity.findViewById(R.id.day_1);
        if(calendeardate.CalendarText[0][0] > 0){
            button1.setText(String.valueOf(calendeardate.CalendarText[0][0]));
        }else{
            button1.setText("");
        }
        Button button2 = (Button)mainactivity.findViewById(R.id.day_2);
        if(calendeardate.CalendarText[0][1] > 0){
            button2.setText(String.valueOf(calendeardate.CalendarText[0][1]));
        }else{
            button2.setText("");
        }
        Button button3 = (Button)mainactivity.findViewById(R.id.day_3);
        if(calendeardate.CalendarText[0][2] > 0){
            button3.setText(String.valueOf(calendeardate.CalendarText[0][2]));
        }else{
            button3.setText("");
        }
        Button button4 = (Button)mainactivity.findViewById(R.id.day_4);
        if(calendeardate.CalendarText[0][3] > 0){
            button4.setText(String.valueOf(calendeardate.CalendarText[0][3]));
        }else{
            button4.setText("");
        }
        Button button5 = (Button)mainactivity.findViewById(R.id.day_5);
        if(calendeardate.CalendarText[0][4] > 0){
            button5.setText(String.valueOf(calendeardate.CalendarText[0][4]));
        }else{
            button5.setText("");
        }
        Button button6 = (Button)mainactivity.findViewById(R.id.day_6);
        if(calendeardate.CalendarText[0][5] > 0){
            button6.setText(String.valueOf(calendeardate.CalendarText[0][5]));
        }else{
            button6.setText("");
        }
        Button button7 = (Button)mainactivity.findViewById(R.id.day_7);
        if(calendeardate.CalendarText[0][6] > 0){
            button7.setText(String.valueOf(calendeardate.CalendarText[0][6]));
        }else{
            button7.setText("");
        }
        Button button8 = (Button)mainactivity.findViewById(R.id.day_8);
        if(calendeardate.CalendarText[1][0] > 0){
            button8.setText(String.valueOf(calendeardate.CalendarText[1][0]));
        }else{
            button8.setText("");
        }
        Button button9 = (Button)mainactivity.findViewById(R.id.day_9);
        if(calendeardate.CalendarText[1][1] > 0){
            button9.setText(String.valueOf(calendeardate.CalendarText[1][1]));
        }else{
            button9.setText("");
        }
        Button button10 = (Button)mainactivity.findViewById(R.id.day_10);
        if(calendeardate.CalendarText[1][2] > 0){
            button10.setText(String.valueOf(calendeardate.CalendarText[1][2]));
        }else{
            button10.setText("");
        }
        Button button11 = (Button)mainactivity.findViewById(R.id.day_11);
        if(calendeardate.CalendarText[1][3] > 0){
            button11.setText(String.valueOf(calendeardate.CalendarText[1][3]));
        }else{
            button11.setText("");
        }
        Button button12 = (Button)mainactivity.findViewById(R.id.day_12);
        if(calendeardate.CalendarText[1][4] > 0){
            button12.setText(String.valueOf(calendeardate.CalendarText[1][4]));
        }else{
            button12.setText("");
        }
        Button button13 = (Button)mainactivity.findViewById(R.id.day_13);
        if(calendeardate.CalendarText[1][5] > 0){
            button13.setText(String.valueOf(calendeardate.CalendarText[1][5]));
        }else{
            button13.setText("");
        }
        Button button14 = (Button)mainactivity.findViewById(R.id.day_14);
        if(calendeardate.CalendarText[1][6] > 0){
            button14.setText(String.valueOf(calendeardate.CalendarText[1][6]));
        }else{
            button14.setText("");
        }
        Button button15 = (Button)mainactivity.findViewById(R.id.day_15);
        if(calendeardate.CalendarText[2][0] > 0){
            button15.setText(String.valueOf(calendeardate.CalendarText[2][0]));
        }else{
            button15.setText("");
        }
        Button button16 = (Button)mainactivity.findViewById(R.id.day_16);
        if(calendeardate.CalendarText[2][1] > 0){
            button16.setText(String.valueOf(calendeardate.CalendarText[2][1]));
        }else{
            button16.setText("");
        }
        Button button17 = (Button)mainactivity.findViewById(R.id.day_17);
        if(calendeardate.CalendarText[2][2] > 0){
            button17.setText(String.valueOf(calendeardate.CalendarText[2][2]));
        }else{
            button17.setText("");
        }
        Button button18 = (Button)mainactivity.findViewById(R.id.day_18);
        if(calendeardate.CalendarText[2][3] > 0){
            button18.setText(String.valueOf(calendeardate.CalendarText[2][3]));
        }else{
            button18.setText("");
        }
        Button button19 = (Button)mainactivity.findViewById(R.id.day_19);
        if(calendeardate.CalendarText[2][4] > 0){
            button19.setText(String.valueOf(calendeardate.CalendarText[2][4]));
        }else{
            button19.setText("");
        }
        Button button20 = (Button)mainactivity.findViewById(R.id.day_20);
        if(calendeardate.CalendarText[2][5] > 0) {
            button20.setText(String.valueOf(calendeardate.CalendarText[2][5]));
        }else{
            button20.setText("");
        }
        Button button21 = (Button)mainactivity.findViewById(R.id.day_21);
        if(calendeardate.CalendarText[2][6] > 0){
            button21.setText(String.valueOf(calendeardate.CalendarText[2][6]));
        }else{
            button21.setText("");
        }
        Button button22 = (Button)mainactivity.findViewById(R.id.day_22);
        if(calendeardate.CalendarText[3][0] > 0){
            button22.setText(String.valueOf(calendeardate.CalendarText[3][0]));
        }else{
            button22.setText("");
        }
        Button button23 = (Button)mainactivity.findViewById(R.id.day_23);
        if(calendeardate.CalendarText[3][1] > 0){
            button23.setText(String.valueOf(calendeardate.CalendarText[3][1]));
        }else{
            button23.setText("");
        }
        Button button24 = (Button)mainactivity.findViewById(R.id.day_24);
        if(calendeardate.CalendarText[3][2] > 0){
            button24.setText(String.valueOf(calendeardate.CalendarText[3][2]));
        }else{
            button24.setText("");
        }
        Button button25 = (Button)mainactivity.findViewById(R.id.day_25);
        if(calendeardate.CalendarText[3][3] > 0){
            button25.setText(String.valueOf(calendeardate.CalendarText[3][3]));
        }else{
            button25.setText("");
        }
        Button button26 = (Button)mainactivity.findViewById(R.id.day_26);
        if(calendeardate.CalendarText[3][4] > 0){
            button26.setText(String.valueOf(calendeardate.CalendarText[3][4]));
        }else{
            button26.setText("");
        }
        Button button27 = (Button)mainactivity.findViewById(R.id.day_27);
        if(calendeardate.CalendarText[3][5] > 0){
            button27.setText(String.valueOf(calendeardate.CalendarText[3][5]));
        }else{
            button27.setText("");
        }
        Button button28 = (Button)mainactivity.findViewById(R.id.day_28);
        if(calendeardate.CalendarText[3][6] > 0){
            button28.setText(String.valueOf(calendeardate.CalendarText[3][6]));
        }else{
            button28.setText("");
        }
        Button button29 = (Button)mainactivity.findViewById(R.id.day_29);
        if(calendeardate.CalendarText[4][0] > 0){
            button29.setText(String.valueOf(calendeardate.CalendarText[4][0]));
        }else{
            button29.setText("");
        }
        Button button30 = (Button)mainactivity.findViewById(R.id.day_30);
        if(calendeardate.CalendarText[4][1] > 0){
            button30.setText(String.valueOf(calendeardate.CalendarText[4][1]));
        }else{
            button30.setText("");
        }
        Button button31 = (Button)mainactivity.findViewById(R.id.day_31);
        if(calendeardate.CalendarText[4][2] > 0){
            button31.setText(String.valueOf(calendeardate.CalendarText[4][2]));
        }else{
            button31.setText("");
        }
        Button button32 = (Button)mainactivity.findViewById(R.id.day_32);
        if(calendeardate.CalendarText[4][3] > 0){
            button32.setText(String.valueOf(calendeardate.CalendarText[4][3]));
        }else{
            button32.setText("");
        }
        Button button33 = (Button)mainactivity.findViewById(R.id.day_33);
        if(calendeardate.CalendarText[4][4] > 0){
            button33.setText(String.valueOf(calendeardate.CalendarText[4][4]));
        }else{
            button33.setText("");
        }
        Button button34 = (Button)mainactivity.findViewById(R.id.day_34);
        if(calendeardate.CalendarText[4][5] > 0){
            button34.setText(String.valueOf(calendeardate.CalendarText[4][5]));
        }else{
            button34.setText("");
        }
        Button button35 = (Button)mainactivity.findViewById(R.id.day_35);
        if(calendeardate.CalendarText[4][6] > 0){
            button35.setText(String.valueOf(calendeardate.CalendarText[4][6]));
        }else{
            button35.setText("");
        }
        Button button36 = (Button)mainactivity.findViewById(R.id.day_36);
        if(calendeardate.CalendarText[5][0] > 0){
            button36.setText(String.valueOf(calendeardate.CalendarText[5][0]));
        }else{
            button36.setText("");
        }
        Button button37 = (Button)mainactivity.findViewById(R.id.day_37);
        if(calendeardate.CalendarText[5][1] > 0){
            button37.setText(String.valueOf(calendeardate.CalendarText[5][1]));
        }else{
            button37.setText("");
        }
        Button button38 = (Button)mainactivity.findViewById(R.id.day_38);
        if(calendeardate.CalendarText[5][2] > 0){
            button38.setText(String.valueOf(calendeardate.CalendarText[5][2]));
        }else{
            button38.setText("");
        }
        Button button39 = (Button)mainactivity.findViewById(R.id.day_39);
        if(calendeardate.CalendarText[5][3] > 0){
            button39.setText(String.valueOf(calendeardate.CalendarText[5][3]));
        }else{
            button39.setText("");
        }
        Button button40 = (Button)mainactivity.findViewById(R.id.day_40);
        if(calendeardate.CalendarText[5][4] > 0){
            button40.setText(String.valueOf(calendeardate.CalendarText[5][4]));
        }else{
            button40.setText("");
        }
        Button button41 = (Button)mainactivity.findViewById(R.id.day_41);
        if(calendeardate.CalendarText[5][5] > 0){
            button41.setText(String.valueOf(calendeardate.CalendarText[5][5]));
        }else{
            button41.setText("");
        }
        Button button42 = (Button)mainactivity.findViewById(R.id.day_42);
        if(calendeardate.CalendarText[5][6] > 0){
            button42.setText(String.valueOf(calendeardate.CalendarText[5][6]));
        }else{
            button42.setText("");
        }

        TextView textview = (TextView)mainactivity.findViewById(R.id.Title);
        textview.setText(String.valueOf(getCuryear())+"年"+String.valueOf(getCurmonth()+1)+"月");

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

