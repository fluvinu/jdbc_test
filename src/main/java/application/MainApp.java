package application;

import java.util.Scanner;

public class MainApp {
   private static Scanner sc= new Scanner(System.in);
   static servceC ser=new servceC();
    public static void main(String[] args) {
        System.out.println("select option");
        System.out.println("1 store filem");
        System.out.println("2 update film");
        System.out.println("3 display best film");
        System.out.println("4 display film to may get oscar");
        System.out.println("5 exit");
        int ch= sc.nextInt();
        switch (ch){
            case 1:
                storeFilm();
                break;
            case 2:
                updateFilm();
                break;
            case 3:
                displayFilmGR();
                break;
            case 4:
                oscarFilm();
                break;
            case 5:
                System.exit(0);
        }
        main(args);
    }
    public static void storeFilm(){
        System.out.println("enter film name ");
        String filmName= sc.next();
        System.out.println("enter film year");
        int filmyear= sc.nextInt();
        System.out.println("enter lang of film");
        String filmLanh= sc.next();
        System.out.println("enter ratin ot of 5");
        int ratating= sc.nextInt();
        fimlDetals fd=new fimlDetals(filmName,filmyear,filmLanh,ratating);
       int n= ser.storefilm(fd);
        System.out.println(n +" row updated ");
    }
    public static void updateFilm(){
        System.out.println("enter film name ");
        String filmNmae=sc.next();
        System.out.println("film year");
        int filmYear= sc.nextInt();
        int n = ser.updateFimlyear(filmNmae,filmYear);
        System.out.println(n+ " raw updated");
    }

    public static void displayFilmGR(){
        for (fimlDetals filGr: ser.filmGRRating()){
            System.out.println(filGr.getFilmId()+"  "+filGr.getFilmname()+"  "+filGr.getFilmLang()+"  "+filGr.getFilmRating()+"  "+filGr.getYear());
        }
    }

    public static void oscarFilm(){
        for (fimlDetals filGr: ser.filmGROscar()){
            System.out.println(filGr.getFilmId()+"  "+filGr.getFilmname()+"  "+filGr.getFilmLang()+"  "+filGr.getFilmRating()+"  "+filGr.getYear());
        }
    }

}
