import java.sql.*; 
public class CREATETABLE
{ 
public static void main(String args[]) 
{
try 
{ 
Class.forName("com.mysql.jdbc.Driver"); 
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Moviedetails","root",""); 
Statement st=con.createStatement(); 
st.executeUpdate("create table MyMovies ( Movie_Name varchar(25), Movie_Actor varchar(25), Movie_Actress varchar(25), Movie_Director varchar(25), Release_Year int(25))"); 
System.out.println("Table Created"); 
con.close(); 
} 
catch(Exception e) 
{ 
System.out.println(e); 
} 
} 
} 