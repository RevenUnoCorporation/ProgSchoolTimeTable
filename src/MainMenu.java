/* сдесь будет проиходить весь экшн */

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class MainMenu {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] clas = new String[] {"1 class", "2 class"};
        String[] day = new String[] {"Monday", "Thursday"};
        ImageIcon img = new ImageIcon("/home/revenuno/IdeaProjects/SchoolTimeTable/img/external");
//-------------------------------------------------------------------------------
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh");
//-------------------------------------------------------------------------------
        JOptionPane.showMessageDialog(null, "vot ono:" + calendar.getTime());
        ComJobLine.name = JOptionPane.showInputDialog(null, "Как зовут малыша? ;)", "СлаваУкраине!", JOptionPane.QUESTION_MESSAGE);
        ComJobLine.kidClass = (int)JOptionPane.showInputDialog(null, "В каком он классе? :))", "СлаваУкраине!", JOptionPane.PLAIN_MESSAGE, img, clas, clas[0]);
        ComJobLine.realDay = (String)JOptionPane.showInputDialog(null, "Какой сегодня день?", "СлаваУкраине!", JOptionPane.PLAIN_MESSAGE, img, day,day[0]);
//-------------------------------------------------------------------------------
        System.out.println("\t by RavenNano");
        System.out.println("Enter '_help', but program to help you ^-^ ");
        System.out.println(TableJobing.setLesson("/home/revenuno/IdeaProjects/SchoolTimeTable/tables/Class1/Monday/less0"));
        System.out.println(ComJobLine.kidClass);

        System.out.print("$> ");
        String comm = in.nextLine();

        switch (comm){
            case "setAction":
                ComJobLine.setAction();
        }
    }
}
