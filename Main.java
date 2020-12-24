
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Seif
 */

public class Main {

    public static void DB(String username,int ID,String role){
                try{
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/orcl","scott","tiger");
              Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/MyDataBase","root","root");
            java.sql.Statement st=con.createStatement();
            String sql="select * from users";
            String sql2="insert into users (id,name,job) values (4,\'mohamed\',\'doctor\')";
            String sql3="delete from users where id=2";
            ResultSet rs=st.executeQuery(sql);
            st.executeUpdate(sql3);
            st.executeUpdate(sql2);
//            System.out.println(rs.getString("name") + " Is a "+rs.getString("job")+ " It's ID: "+rs.getInt("ID"));

//            while(rs.next()){
////                System.out.println(rs.getInt(1)+"  "+rs.getString(2));
////                con.close();
//                if(rs.getString("name").equals(username) && rs.getInt("ID")==(ID)&& rs.getString("job").equals(role)){
//                    System.out.println(rs.getString("name") + " Is a "+rs.getString("job")+ " It's ID: "+rs.getInt("ID"));
//                }
//            }
               
        }
        catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public static void main(String[] args) {
        GUI myFrame=new GUI();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//  Scanner input=new Scanner(System.in);
//        System.out.print("Username: ");
//        String Username=input.next();
//        System.out.print("ID: ");
//        int ID=input.nextInt();
//        System.out.println("Enter job role: ");
//        String role=input.next();
//        DB(Username,ID,role);



















////        switch(role){
//            case 1:
//                System.out.println("Admin Page");
//                break;
//            case 2:
//                System.out.println("Doctor Page");
//                break;
//            case 3:
//                System.out.println("Resiptianist Page");
//                break;
//        }
        


        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
