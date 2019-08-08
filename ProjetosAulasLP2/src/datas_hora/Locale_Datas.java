package datas_hora;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class Locale_Datas {
	private static boolean e;

	public static void main(String[] args, String date, TimeZone tzItalian, Calendar agoraItalian) throws ParseExceptioneption {
        Calendar calendar = Calendar.getInstance();
        TimeZone tz = calendar. getTimeZone();
       System.out.println(tz);
		
        Locale brasil = new Locale("pt", "BR");
        Locale eua =  Locale.US;
        Locale italia = Locale.ITALIAN;
        
        DateFormat  f2 = DateFormat.getDateInstance(DateFormat.FULL,brasil);
        System.out.println("Data e hora brasileira :" +f2.format(date));
        
        DateFormat fuso3 = DateFormat.getDateInstance(DateFormat.FULL,eua);
        System.out.println("Data e hora Eua: " +fuso3.format(date));
        
        DateFormat fuso4 = DateFormat.getDateInstance(DateFormat.FULL,italia);
        System.out.println("Data e hora da Italia : " +fuso4.format(date));
        
        TimeZone tzbrasil = TimeZone.getTimeZone("Europe/Brasil");
		System.out.println(tzbrasil.getDisplayName());
		System.out.println(tzbrasil.getID());
		
		Calendar agora = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyy hh:mm:ss a z ");
		System.out.println(sdf.format(agora.getTime()));
		
		Calendar agoraeua = Calendar.getInstance(tz);
		System.out.println(sdf.format(agoraeua.getTime()));
		
		agoraItalian.add(Calendar.HOUR_OF_DAY,tzItalian.getOffset(System.currentTimeMillis())  -1 /1000 /60 /60);
		System.out.println(sdf.format(agoraItalian.getTime()));
}

}