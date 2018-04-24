package com.lv.util;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by xgq on 2018/4/4.
 */
public class DateTime {

    public static String getDate(){//字符串类型的时间
        Format format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return format.format(new Date());
    }

    public static Date getDate2(){//Date类型的时间
        return new Date();
    }

    public static Date dateParse(String date1){//字符串转Date
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            return sdf.parse(date1);
        }catch (Exception e){

        }
      return null;
    }
}
