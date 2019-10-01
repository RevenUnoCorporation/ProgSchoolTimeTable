import java.util.Scanner;

public class ComJobLine {

    public static void setAction(){
        Scanner in = new Scanner(System.in);
        int realLesson = 0;
        int realDay = 0;

        System.out.println("Если-бы ввели имя вашего бл****, е***** ребёнка - это ничего бы не изменило -_- $> ");
        String kidName = in.nextLine();

        System.out.println("Было-бы круто, если-бы вы ввели сегодняшний день -_- (Понедельник, вторник, среда, четверг или пятница) $> ");
        String realDayName = in.nextLine();

        System.out.println("Было-бы круто, если бы вы ввели класс, в котором учится ваш бл****, е***** ребёнок $> ");
        int kidClass = in.nextInt();

        System.out.println("Было-бы круто, если-бы вы ввели реальное время -_- (8,00; 8,30; 8,56 и.т.д) $> ");
        float realTime = in.nextFloat();
//---------------------------------------------------------------------
        if(kidClass >= 10 || kidClass < 0){
            System.out.println(" В этой школе всего 9 классов, е**** ты убл***к -_-");
       }
        if(kidClass == 1);
            kidClass--;

        if(realDayName.equalsIgnoreCase("Понедельник")) {realDay = 0;}
        if(realDayName.equalsIgnoreCase("Вторник")) { realDay = 1;}
        if(realDayName.equalsIgnoreCase("Среда"))   { realDay = 2;}
        if(realDayName.equalsIgnoreCase("Четверг")) { realDay = 3;}
        if(realDayName.equalsIgnoreCase("Пятница")) { realDay = 4;}

//----------------------------------------------------------------   (-_- ) xex
        if(realTime <= 8.00){
            realLesson = 0;

        }if (realTime >= 8.00 && realTime <= 8.40){
            realLesson = 1;

        }if(realTime >= 8.40 && realTime <= 9.00){
            realLesson = 0;
        }if(realTime <= 9.00 && realTime <= 9.40){
            realLesson = 2;
        }if(realTime >= 9.40 && realTime <= 10.00){
            realLesson = 0;
        }if (realTime >= 10.00 && realTime <= 10.40){
            realLesson = 3;
        }if(realTime >= 10.40 && realTime <= 11.00){
            realLesson = 0;
        }if(realTime >= 11.00 && realTime <= 11.40){
            realLesson = 4;
        }if(realTime >= 11.40 && realTime <= 12.00)
            realLesson = 0;
//------------------------------------------------------------- (-_- ) xex
        System.out.println("Сейчас ваш бл****, е***** ребёнок: ");
        System.out.println(BFTable.schoolClass[kidClass][realDay][realLesson]);
    }
}
