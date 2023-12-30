package application;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class servceC {
   static Connection conn=null;
   static {
       String url="jdbc:mysql://localhost:3306/testjdbc";
       String uname="root";
       String pass="tiger";
       try {
           conn = DriverManager.getConnection(url,uname,pass);
       } catch (SQLException e) {
           System.out.println(e);
       }

   }


   public int storefilm(fimlDetals film){
       int n=0;
       String storeQ="insert into filmdetails (film_name,film_year,film_lang,film_rating) values(?,?,?,?);";
       try {
           PreparedStatement pstmt=conn.prepareStatement(storeQ);
           pstmt.setString(1,film.getFilmname());
           pstmt.setInt(2,film.getYear());
           pstmt.setString(3,film.getFilmLang());
           pstmt.setInt(4,film.getFilmRating());
          n= pstmt.executeUpdate();
       } catch (SQLException e) {
           System.out.println(e);
       }
    return n;
   }

   public int updateFimlyear(String Fname,int Fyear){
       int n=0;
       String upQ="update filmdetails set film_year=? where film_name=?;";
       try {
           PreparedStatement pstmt=conn.prepareStatement(upQ);
           pstmt.setInt(1,Fyear);
           pstmt.setString(2,Fname);
           n=pstmt.executeUpdate();
       } catch (SQLException e) {
           System.out.println(e);
       }
       return n;
   }

   public List<fimlDetals> filmGRRating(){
       List<fimlDetals> filmGr=new ArrayList<>();
       String quary="select * from filmdetails where film_rating >3;";
       try {
          Statement stmt= conn.createStatement();
          ResultSet rs =stmt.executeQuery(quary);
          while (rs.next()){
              fimlDetals fd=new fimlDetals(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getInt(5));
              filmGr.add(fd);
          }
       } catch (SQLException e) {
           System.out.println(e);
       }
       return filmGr;
   }

    public List<fimlDetals> filmGROscar(){
        List<fimlDetals> filmGr=new ArrayList<>();
        String quary="select * from filmdetails where film_rating =5 order by film_year limit 5;";
        try {
            Statement stmt= conn.createStatement();
            ResultSet rs =stmt.executeQuery(quary);
            while (rs.next()){
                fimlDetals fd=new fimlDetals(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getInt(5));
                filmGr.add(fd);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return filmGr;
    }
}
