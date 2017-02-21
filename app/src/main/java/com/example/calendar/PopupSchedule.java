package com.example.calendar;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

/**
 * Created by 廉 on 2017/02/20.
 */

public class PopupSchedule {

    CalendearDate calendeardate = new CalendearDate();
    MainActivity ma = new MainActivity();
    BackgroundColor bc = new BackgroundColor();
    Datatable dt = new Datatable();
    static int day;
    static MainActivity mainactivity;


    public void day_button_click(MainActivity mainactivity) {

        PopupSchedule.mainactivity = mainactivity;

        mainactivity.findViewById(R.id.day_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popup(PopupSchedule.mainactivity,calendeardate.CalendarText[0][0]);
            }
        });
        mainactivity.findViewById(R.id.day_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popup(PopupSchedule.mainactivity,calendeardate.CalendarText[0][1]);
            }
        });
        mainactivity.findViewById(R.id.day_3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popup(PopupSchedule.mainactivity,calendeardate.CalendarText[0][2]);
            }
        });
        mainactivity.findViewById(R.id.day_4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popup(PopupSchedule.mainactivity,calendeardate.CalendarText[0][3]);
            }
        });
        mainactivity.findViewById(R.id.day_5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popup(PopupSchedule.mainactivity,calendeardate.CalendarText[0][4]);
            }
        });
        mainactivity.findViewById(R.id.day_6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popup(PopupSchedule.mainactivity,calendeardate.CalendarText[0][5]);
            }
        });
        mainactivity.findViewById(R.id.day_7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popup(PopupSchedule.mainactivity,calendeardate.CalendarText[0][6]);
            }
        });
        mainactivity.findViewById(R.id.day_8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popup(PopupSchedule.mainactivity,calendeardate.CalendarText[1][0]);
            }
        });
        mainactivity.findViewById(R.id.day_9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popup(PopupSchedule.mainactivity,calendeardate.CalendarText[1][1]);
            }
        });
        mainactivity.findViewById(R.id.day_10).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popup(PopupSchedule.mainactivity,calendeardate.CalendarText[1][2]);
            }
        });
        mainactivity.findViewById(R.id.day_11).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popup(PopupSchedule.mainactivity,calendeardate.CalendarText[1][3]);
            }
        });
        mainactivity.findViewById(R.id.day_12).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popup(PopupSchedule.mainactivity,calendeardate.CalendarText[1][4]);
            }
        });
        mainactivity.findViewById(R.id.day_13).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popup(PopupSchedule.mainactivity,calendeardate.CalendarText[1][5]);
            }
        });
        mainactivity.findViewById(R.id.day_14).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popup(PopupSchedule.mainactivity,calendeardate.CalendarText[1][6]);
            }
        });
        mainactivity.findViewById(R.id.day_15).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popup(PopupSchedule.mainactivity,calendeardate.CalendarText[2][0]);
            }
        });
        mainactivity.findViewById(R.id.day_16).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popup(PopupSchedule.mainactivity,calendeardate.CalendarText[2][1]);
            }
        });
        mainactivity.findViewById(R.id.day_17).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popup(PopupSchedule.mainactivity,calendeardate.CalendarText[2][2]);
            }
        });
        mainactivity.findViewById(R.id.day_18).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popup(PopupSchedule.mainactivity,calendeardate.CalendarText[2][3]);
            }
        });
        mainactivity.findViewById(R.id.day_19).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popup(PopupSchedule.mainactivity,calendeardate.CalendarText[2][4]);
            }
        });
        mainactivity.findViewById(R.id.day_20).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popup(PopupSchedule.mainactivity,calendeardate.CalendarText[2][5]);
            }
        });
        mainactivity.findViewById(R.id.day_21).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popup(PopupSchedule.mainactivity,calendeardate.CalendarText[2][6]);
            }
        });
        mainactivity.findViewById(R.id.day_22).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popup(PopupSchedule.mainactivity,calendeardate.CalendarText[3][0]);
            }
        });
        mainactivity.findViewById(R.id.day_23).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popup(PopupSchedule.mainactivity,calendeardate.CalendarText[3][1]);
            }
        });
        mainactivity.findViewById(R.id.day_24).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popup(PopupSchedule.mainactivity,calendeardate.CalendarText[3][2]);
            }
        });
        mainactivity.findViewById(R.id.day_25).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popup(PopupSchedule.mainactivity,calendeardate.CalendarText[3][3]);
            }
        });
        mainactivity.findViewById(R.id.day_26).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popup(PopupSchedule.mainactivity,calendeardate.CalendarText[3][4]);
            }
        });
        mainactivity.findViewById(R.id.day_27).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popup(PopupSchedule.mainactivity,calendeardate.CalendarText[3][5]);
            }
        });
        mainactivity.findViewById(R.id.day_28).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popup(PopupSchedule.mainactivity,calendeardate.CalendarText[3][6]);
            }
        });
        mainactivity.findViewById(R.id.day_29).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popup(PopupSchedule.mainactivity,calendeardate.CalendarText[4][0]);
            }
        });
        mainactivity.findViewById(R.id.day_30).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popup(PopupSchedule.mainactivity,calendeardate.CalendarText[4][1]);
            }
        });
        mainactivity.findViewById(R.id.day_31).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popup(PopupSchedule.mainactivity,calendeardate.CalendarText[4][2]);
            }
        });
        mainactivity.findViewById(R.id.day_32).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popup(PopupSchedule.mainactivity,calendeardate.CalendarText[4][3]);
            }
        });
        mainactivity.findViewById(R.id.day_33).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popup(PopupSchedule.mainactivity,calendeardate.CalendarText[4][4]);
            }
        });
        mainactivity.findViewById(R.id.day_34).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popup(PopupSchedule.mainactivity,calendeardate.CalendarText[4][5]);
            }
        });
        mainactivity.findViewById(R.id.day_35).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popup(PopupSchedule.mainactivity,calendeardate.CalendarText[4][6]);
            }
        });
        mainactivity.findViewById(R.id.day_36).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popup(PopupSchedule.mainactivity,calendeardate.CalendarText[5][0]);
            }
        });
        mainactivity.findViewById(R.id.day_37).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popup(PopupSchedule.mainactivity,calendeardate.CalendarText[5][1]);
            }
        });
        mainactivity.findViewById(R.id.day_38).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popup(PopupSchedule.mainactivity,calendeardate.CalendarText[5][2]);
            }
        });
        mainactivity.findViewById(R.id.day_39).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popup(PopupSchedule.mainactivity,calendeardate.CalendarText[5][3]);
            }
        });
        mainactivity.findViewById(R.id.day_40).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popup(PopupSchedule.mainactivity,calendeardate.CalendarText[5][4]);
            }
        });
        mainactivity.findViewById(R.id.day_41).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popup(PopupSchedule.mainactivity,calendeardate.CalendarText[5][5]);
            }
        });
        mainactivity.findViewById(R.id.day_42).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popup(PopupSchedule.mainactivity,calendeardate.CalendarText[5][6]);
            }
        });


    }
    public void popup(final MainActivity mainactivity, int day){
        if(day != 0){
            this.day = day;
            final EditText edittext = new EditText(mainactivity);
            AlertDialog.Builder ad = new AlertDialog.Builder(mainactivity);
            ad.setTitle(String.valueOf(getCuryear())+"年"+String.valueOf(getCurmonth()+1)+"月"+String.valueOf(day)+"日の予定");
            if(dt.get_index(getCuryear(),getCurmonth(),day) == -1) {
                ad.setView(edittext);
            } else{
                edittext.setText(Datatable.list_day.get(dt.get_index(getCuryear(),getCurmonth(),day)).memo);
                ad.setView(edittext);
            }
            ad.setPositiveButton("進む", new DialogInterface.OnClickListener() {
                int result;
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    AlertDialog.Builder ad2 = new AlertDialog.Builder(PopupSchedule.mainactivity);
                    ad2.setTitle(String.valueOf(getCuryear())+"年"+String.valueOf(getCurmonth()+1)+"月"+String.valueOf(PopupSchedule.day)+"日のカラー");
                    String[] items = new String[] {"red","blue","green"};
                    int default_number = 0;

                    ad2.setSingleChoiceItems(items,default_number,new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            result = which;
                        }
                    });
                    ad2.setPositiveButton("登録", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Datatable datatable = new Datatable();
                            datatable.setdata(getCuryear(),getCurmonth(),PopupSchedule.day,result,edittext.getText().toString());
                            ma.color_day(result,getid()[PopupSchedule.day + bc.get_firstday(getCuryear(),getCurmonth()) - 2],mainactivity);
                        }
                    });
                    ad2.setNegativeButton("戻る", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            popup(PopupSchedule.mainactivity,PopupSchedule.day);
                        }
                    });
                    ad2.show();
                }
            });
            ad.setNegativeButton("戻る", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            ad.show();
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
    public int[] getid(){
        BackgroundColor bc = new BackgroundColor();
        return bc.id;
    }
}
