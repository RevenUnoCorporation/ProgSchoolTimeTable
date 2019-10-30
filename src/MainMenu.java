/* сдесь будет проиходить весь экшн */

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String kidName;

        System.out.println("\t by RavenNano");
        System.out.println("Enter '_help', but program to help you ^-^ ");
        System.out.println(TableJobing.setLesson("/home/revenuno/IdeaProjects/SchoolTimeTable/tables/Class1/Monday/less0"));

        System.out.print("$> ");
        String comm = in.nextLine();

        switch (comm){
            case "setAction":
                ComJobLine.setAction();
        }
    }
}
