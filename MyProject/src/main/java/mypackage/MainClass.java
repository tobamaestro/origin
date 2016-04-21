package mypackage;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Toba on 10-Apr-16.
 */
public class MainClass {

    public static void main(String args[]) {


        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss") ;
        String date = sdf.format(new Date());

        System.out.println(date);



    }



}
