import java.util.Scanner;
import java.util.Calendar;

public class calender {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int date,month,year;
		System.out.println("Enter the date (int number)");
		date = sc.nextInt();
		
		System.out.println("Enter the month (int number)");
		month = sc.nextInt();
		
		System.out.println("Enter the year (int number)");
		year = sc.nextInt();
		
		System.out.println("The provided year by you is "+date+"/"+month+"/"+year);
		
		System.out.println("**********************************************************************************************");
		System.out.println("                               CALENDER PROBLEM                                                ");
		
		System.out.println(" Press 1 :  Check for leap year");
		
		System.out.println("Press 2 :   Which day is the present date");
		
		int x = sc.nextInt();
		
		if(x == 1)
		{
			CheckLeap(year);
		}
		
		if(x==2)
		{
			WhichDay(date,month,year);
		}
	}



	private static void WhichDay(int date, int month, int year) {
		
		int odd_m = 0,odd_y1,odd_y,odd_d,x,odd_year,total_odds;
		
			odd_y1 = checkCentury(year);
			x  = year %100;
			odd_y = (x+(x/4)) % 7;
			
			odd_year = odd_y1 + odd_y;
			if(odd_year > 7)
			{
				odd_year=odd_year % 7;
			}
			
			
			// ************** month ***********
			
			
			switch (month)
			{
			case 1:
				odd_m = 0;
				break;
			case 2:
				odd_m = 3;
				
				break;
			case 3:
				odd_m = 3;
				break;
			case 4:
				odd_m = 6;
				break;
			case 5:
				odd_m = 1;
				break;
			case 6:
				odd_m = 4;
				break;
			case 7:
				odd_m = 6;
				break;
			case 8:
				odd_m = 2;
				break;
			case 9:
				odd_m = 5;
				break;
			case 10:
				odd_m = 0;
				break;
			case 11:
				odd_m = 3;
				break;
			case 12:
				odd_m = 5;
				break;	
			}
			
			
			odd_d = date%7;
			
			total_odds = odd_year+odd_m+odd_d;
			int code = total_odds % 7;
			//************DAY calculation********************************************************
		
			System.out.println(code);
			if(CheckLeap(year)== true)
			{
				code = code-1;
			}
			System.out.println(code);
			switch(code)
			{
			 	  case 1:
				    System.out.println("Monday");
				    break;
			 	  case 2:
				    System.out.println("Tuesday");
				    break;
				  case 3:
				    System.out.println("Wednesday");
				    break;
				  case 4:
				    System.out.println("Thursday");
				    break;
				  case 5:
				    System.out.println("Friday");
				    break;
				  case 6:
				    System.out.println("Saturday");
				    break;
				  case 0:
				    System.out.println("Sunday");
				    break;
				
			}
			
			
		
		
		
		
	}



	private static int checkCentury(int year) {
		
		if(year>=1700 && year<1800)
			return 4;
		else if(year>=1800 && year<1900)
			return 2;
		else if(year>=1900 && year<2000)
			return 0;
		else if(year>=2000 && year<2100)
			return 6;
		else if(year>=2100 && year<2200)
			return 4;
		else if(year>=2300 && year<2400)
			return 2;
		else if(year>=2400 && year<2500)
			return 0;
		else if(year>=2500 && year<2500)
			return 6;
		return 0;

		
			
	}



	private static boolean CheckLeap(int year) {
		if(year%4 == 0)
	    {
	        if( year%100 == 0)
	        {
	            if ( year%400 == 0)
	            {
	            	System.out.println(year+" is a leap year");
	            	return true;
	            }
	            else 
	            {
	            	System.out.println(year+" is not a leap year");
	            	return false;
	            }
	        }
	        return false;
	    }
		return false;
		
	}

}
