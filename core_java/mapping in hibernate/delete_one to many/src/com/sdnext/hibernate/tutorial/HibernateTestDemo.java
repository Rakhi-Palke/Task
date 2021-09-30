package com.sdnext.hibernate.tutorial;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import com.sdnext.hibernate.tutorial.dto.UserDetails;
import com.sdnext.hibernate.tutorial.dto.Vehicle;
public class HibernateTestDemo {
/**
* @param args
*/
public static void main(String[] args)
{
UserDetails user = new UserDetails(); //create the user entity
Vehicle vehicle = new Vehicle(); //create the vehicle entity
vehicle.setVehicleName("BMW Car"); //set vehicle name
user.setUserName("Dinesh Rajput"); //set the user name
user.setVehicle(vehicle); //set the vehicle entity to the field of the user entity i.e. vehicle entity inside the user entity
SessionFactory sessionFactory = new Configuration().configure("/hibernate.cfg.xml").buildSessionFactory(); 
Session session = sessionFactory.openSession(); //create the session object
session.beginTransaction();//create the transaction from the session object
session.save(vehicle); // save the vehicle entity to the database
session.save(user); // save the user entity to the database

String sql = "DELETE FROM UserDetails WHERE USER_ID = 2";
Query query = session.createQuery(sql);
 int row = query.executeUpdate();
 if (row == 0)
     System.out.println("Doesnt deleted any row!");
 else

session.getTransaction().commit(); //close the transaction
session.close(); //close the session
}
}
