import java.util.Scanner;

public class ComJobLine {

    public static void setAction(){
        Scanner in = new Scanner(System.in);
        int realLesson = 0;
        int realDay = 0;

        System.out.println("Enter name your of fu**ing kid $> ");
        String kidName = in.nextLine();

        System.out.println("Enter class of your fu**ing kid $> ");
        int kidClass = in.nextInt();

        System.out.println("Enter Real Time, please (8.00, 8.30, 8,56 и.т.д) $> ");
        float realTime = in.nextFloat();

        System.out.println("Enter Real Day, please (Понедельник, вторник, среда, четверг или пятница) $> ");
        String realDayName = in.nextLine();
//---------------------------------------------------------------------
        if(kidClass >= 10 || kidClass < 0){
            System.out.println(" this school is 9 class, blyt -__- ");
       }
        if(kidClass == 1)
            kidClass--;

        for(String day:BFTable.dayTable){
            if(!realDayName.equalsIgnoreCase(day)){
                System.out.println("Enter REAL DAY, blyt !");
            }
        }
        if(realDayName.equalsIgnoreCase("Понедельник")) {realDay = 0;}
        if(realDayName.equalsIgnoreCase("Вторник")) { realDay = 1;}
        if(realDayName.equalsIgnoreCase("Среда"))   { realDay = 2;}
        if(realDayName.equalsIgnoreCase("Четверг")) { realDay = 3;}
        if(realDayName.equalsIgnoreCase("Пятница")) { realDay = 4;}

//----------------------------------------------------------------   (-_- ) xex
        if(realTime <= 8.00){
            realLesson = 0;
        }
        if(realTime >= 8.00 && realTime <= 8.40){
            realLesson = 1;
        }
        if(realTime >= 8.40 && realTime <= 9.00){
            realLesson = 0;
        }
        if(realTime <= 9.00 && realTime <= 9.40){
            realLesson = 2;
        }
        if(realTime >= 9.40 && realTime <= 10.00){
            realLesson = 0;
        }
        if(realTime >= 10.00 && realTime <= 10.40){
            realLesson = 3;
        }
        if(realTime >= 10.40 && realTime <= 11.00){
            realLesson = 0;
        }
        if(realTime >= 11.00 && realTime <= 11.40){
            realLesson = 4;
        }
        if(realTime >= 11.40 && realTime <= 12.00){
            realLesson = 1;
        }
//------------------------------------------------------------- (-_- ) xex
        System.out.println("После этого п##еца... вот то, что Вы искали: ");
        System.out.println(BFTable.dayTable[0][realDay][realLesson]);
    }
}