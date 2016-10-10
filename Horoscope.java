import java.util.Scanner;
class Horoscope
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String sign = "";
        String firstDate = "";
        String secondDate = "";
        String monthString = "";
        String horoscope = "";
        String dayString = "";
        int signNum = 0;

        System.out.println("On what day of the month were you born? (number)");
        int day = scan.nextInt();
        System.out.println(day);

        System.out.println("In which month were you born? (number)");
        int month = scan.nextInt();
        System.out.println(month);

        switch (month) 
        {
            case 1: monthString = "January";
                    break;
            case 2: monthString = "Feburary";
                    break;
            case 3: monthString = "March";
                    break;
            case 4: monthString = "April";
                    break;
            case 5: monthString = "May";
                    break;
            case 6: monthString = "June";
                    break;
            case 7: monthString = "July";
                    break;
            case 8: monthString = "August";
                    break;
            case 9: monthString = "September";
                    break;
            case 10: monthString = "October";
                    break;
            case 11: monthString = "November";
                    break;
            case 12: monthString = "December";
        }

        switch (day)
        {
            case 1: dayString = "First";
                    break;
            case 2: dayString = "Second";
                    break;
            case 3: dayString = "Third";
                    break;
            case 4: dayString = "Fourth";
                    break;
            case 5: dayString = "Fifth";
                    break;
            case 6: dayString = "Sixth";
                    break;
            case 7: dayString = "Seventh";
                    break;
            case 8: dayString
        }


    
        if (month == 3) 
        {
            if (day >= 1 && day <= 20)
            {
                sign = "Pisces";
                signNum = 1;
            }else if (day >= 21 && day <= 31) 
            {
                sign = "Aries";
                signNum = 2;
            }
        }

        if (month == 4)
        {
            if (day >= 1 && day <= 19)
            {
                sign = "Aries";
                signNum = 2;
            }else if (day >= 20 && day <= 31)
            {
                sign = "Taurus";
                signNum = 3;
            }
        }

        if (month == 5)
        {
            if (day >= 1 && day <= 20)
            {
                sign = "Taurus";
                signNum = 3;
            }else if (day >= 21 && day <= 31)
            {
                sign = "Gemini";
                signNum = 4;
            }
        }

        if (month == 6)
        {
            if (day >= 1 && day <= 20)
            {
                sign = "Gemini";
                signNum = 4;
            }else if (day >= 21 && day <= 31)
            {
                sign = "Cancer";
                signNum = 5;
            }
        }

        if (month == 7)
        {
            if (day >= 1 && day <= 22)
            {
                sign = "Cancer";
                signNum = 5;
            }else if (day >= 23 && day <= 31)
            {
                sign = "Leo";
                signNum = 6;
            }
        }

        if (month == 8)
        {
            if (day >= 1 && day <= 22)
            {
                sign = "Leo";
                signNum = 6;
            }else if (day >= 23 && day <= 31)
            {
                sign = "Virgo";
                signNum = 7;
            }
        }

        if (month == 9)
        {
            if (day >= 1 && day <= 22)
            {
                sign = "Virgo";
                signNum = 7;
            }else if (day >= 23 && day <= 31)
            {
                sign = "Libra";
                signNum = 8;
            }
        }

        if (month == 10)
        {
            if (day >= 1 && day <= 22)
            {
                sign = "Libra";
                signNum = 8;
            }else if (day >= 23 && day <= 31)
            {
                sign = "Scorpio";
                signNum = 9;
            }
        }

        if (month == 11)
        {
            if (day >= 1 && day <= 21)
            {
                sign = "Scorpio";
                signNum = 9; 
            }else if (day >= 22 && day <= 31)
            {
                sign = "Sagittarius";
                signNum = 10;
            }
        }

        if (month == 12)
        {
            if (day >= 1 && day <= 21)
            {
                sign = "Sagittarius";
                signNum = 10;
            }else if (day >= 22 && day <= 31)
            {
                sign = "Capricorn";
                signNum = 11;
            }
        }

        if (month == 1)
        {
            if (day >= 1 && day <= 19)
            {
                sign = "Capricorn";
                signNum = 11;
            }else if (day >= 20 && day <= 31)
            {
                sign = "Aquarius";
                signNum = 12;
            }
        }

        if (month == 2)
        {
            if (day >= 1 && day <= 18)
            {
                sign = "Aquarius";
                signNum = 12;
            }else if (day >= 18 && day <= 31)
            {
                sign = "Pisces";
                signNum = 1;
            }
        }
          
        switch (signNum)
        {
            case 1: horoscope = "Fish";
                    break;
            case 2: horoscope = "Ram";
                    break;
            case 3: horoscope = "Bull";
                    break;
            case 4: horoscope = "Twins";
                    break;
            case 5: horoscope = "Crab";
                    break;
            case 6: horoscope = "Lion";
                    break;
            case 7: horoscope = "Virgin";
                    break;
            case 8: horoscope = "Scales";
                    break;
            case 9: horoscope = "Scorpion";
                    break;
            case 10: horoscope = "Centaur";
                    break;
            case 11: horoscope = "Sea-goat";
                    break;
            case 12: horoscope = "Water-bearer";
                    break;
        }

        if (month > 12 || month < 1)
        {
            System.out.println("error");
        }else if (day < 1 || month > 31)
        {
            System.out.println("error");
        }else 
        {
            System.out.println("Your sign is: " + sign);
            System.out.println("Your birthday is: " + monthString);
            System.out.println("Horoscope: " + horoscope);
        } 
    }
}