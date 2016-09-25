import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by anton on 25.09.16.
 */
public class main {
    public static void main(String[] args) {
        UserRepository usr = new UserRepository();
        usr.addUser("tony");
        usr.addUser("Katy");
        usr.addUser("maria");
        usr.addUser("Anton");
        usr.addUser("Dimon");
        usr.addUser("Slava");
        usr.addUser("Vasya");
        usr.addUser("Dasha");
        //ArrayList<User> usrLs = usr.getOrderUser();
        CopyOnWriteArrayList<User> usrLs=usr.getOrderUser();
        for (User usrL : usrLs) {
            System.out.println("He/She Id is "+usrL.getId() + "  name is: "+usrL.getName());
        }
       // System.out.println("****************");
        User us = usr.getUser(2);
        System.out.println("He/She Id is: "+ us.getId() + " name is: "+us.getName());
    }
}
