package com.example.calendar;

import java.util.ArrayList;


/**
 * Created by 廉 on 2017/02/19.
 */

public class Datatable {

    static ArrayList<DataStructure> list_day = new ArrayList<DataStructure>();

    public void setdata(int year,int month,int day,int status,String memo){
        DataStructure ds = new DataStructure();
        ds.year = year;
        ds.month = month;
        ds.day = day;
        ds.status = status;
        ds.memo = memo;
        list_day.add(ds);
    }
    public int get_index(int year,int month,int day){
        for(int i = 0;i<list_day.size();i++){
            if(list_day.get(i).year == year){
                if(list_day.get(i).month == month){
                    if(list_day.get(i).day == day){
                        return i;
                    }
                }
            }
        }
        return -1;
    }


    class DataStructure{
        int year;
        int month;
        int day;
        int status;
        String memo;
    }

}

