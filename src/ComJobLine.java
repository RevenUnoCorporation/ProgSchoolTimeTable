import java.util.Scanner;

public class ComJobLine {

    public static String lesDir = "/home/revenuno/IdeaProjects/SchoolTimeTable/tables/";

    public static void setAction(){
        Scanner in = new Scanner(System.in);
        String realLesson = null;
        String realDay = null;

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

        switch (realDayName.toUpperCase()){
            case "ПОНЕДЕЛЬНИК":
                realDay = "Monday";
                break;
            case "ВТОРНИК":
                realDay = "Thursday";
                break;
            default:
                System.out.println("Нет такого дня недели, е**** ны уёб*к!!");
        }

//----------------------------------------------------------------   (-_- ) xex
        if(realTime < 8.00)
            realLesson = "0";
        if (realTime >= 8.00 && realTime < 8.40)
            realLesson = "1";
        if(realTime >= 8.40 && realTime < 9.00)
            realLesson = "0";
        if(realTime >= 9.00 && realTime < 9.40)
            realLesson = "2";
        if(realTime >= 9.40 && realTime < 10.00)
            realLesson = "0";
        if (realTime >= 10.00 && realTime < 10.40)
            realLesson = "3";
        if(realTime >= 10.40 && realTime < 11.00)
            realLesson = "0";
        if(realTime >= 11.00 && realTime < 11.40)
            realLesson = "4";
        if(realTime >= 11.40 && realTime < 12.00)
            realLesson = "0";
//------------------------------------------------------------- (-_- ) xex

        lesDir = "/home/revenuno/IdeaProjects/SchoolTimeTable/tables/" + "Class" + kidClass + "/" + realDay + "/" + "less" + realLesson;
        System.out.println(lesDir);
        System.out.println("Сейчас ваш бл****, е***** ребёнок на: " + TableJobing.setLesson(lesDir));

    }
}
