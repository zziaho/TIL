package Today_I_Learned.TIL.JAVA;

import Today_I_Learned.TIL.TilApplication;
import org.springframework.boot.SpringApplication;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dateCompare {

    public static void main(String[] args) throws ParseException {

        String date1 = "20230110";
        String date2 = "20230301";
        String yyyy1 = date1.substring(0, 4);
        String yyyy2 = date2.substring(0, 4);
        String mmdd1 = date1.substring(4, 8);
        String mmdd2 = date2.substring(4, 8);

        DateFormat format = new SimpleDateFormat("MMdd");

        Date fdate1 = format.parse(mmdd1);
        Date fdate2 = format.parse(mmdd2);

        System.out.println(fdate1);
        System.out.println(fdate2);

//        System.out.println(fdate1.after(fdate2));
//        System.out.println(fdate1.before(fdate2));
//        System.out.println(fdate1.equals(fdate2));

        String yyyy = "";
        if(fdate1.after(fdate2)) {
            System.out.println("fdate1이 fdate2보다 이후이면");
            yyyy = Integer.toString(Integer.parseInt(yyyy1) + 2);
            System.out.println(yyyy);
        } else if(fdate1.before(fdate2)) {
            System.out.println("fdate1이 fdate2보다 이전이면");
            yyyy = Integer.toString(Integer.parseInt(yyyy1) + 1);
            System.out.println(yyyy);
        }
    }

}
