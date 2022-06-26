import java.sql.*; 
import java.util.*; 
public class INSERTTABLE
{ 
public static void main(String args[]) { 
try { 
Class.forName("com.mysql.jdbc.Driver"); 
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Moviedetails","root",""); 
Statement st=con.createStatement(); 
Scanner sc = new Scanner(System.in); 
System.out.println("Enter the Movie details"); 
int moviename1 = sc.next(); 
String movieactor1= sc.next(); 
String movieactress1= sc.next(); 
String moviedirector1 = sc.next(); 
int movieyear1 = sc.nextInt(); 
String qry = "INSERT INTO MyMovies(Movie_Name,Movie_Actor,Movie_Actress,Movie_Director,Release_Year) VALUES ("+moviename1+",'"+movieactor1+"','"+movieactress1+"','"+moviedirector1+"',"+movieyear1+")"; 
st.executeUpdate(qry); 
con.close(); 
} 
catch(Exception e) 
{ 
System.out.println(e); 
} 
System.out.println("Row Inserted"); 
} 
} 
