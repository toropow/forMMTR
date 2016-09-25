import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;


import static java.util.Collections.sort;

/**
 * Created by anton on 20.09.16.
 */
public class UserRepository implements Comparator<User> {

   // ArrayList<User> listUsers= new ArrayList();
    CopyOnWriteArrayList<User> listUsers = new CopyOnWriteArrayList<>();
    static int userId;

    public void addUser(String name){

        User newUser = new User(name,userId);
        userId++;
        listUsers.add(newUser);
    }
    public User getUser(int id) {
        for (User listUser : listUsers) {
            if (listUser.getId() == id) {
                return listUser;
               // break;
            }
        }
        return null;
    }

   @Override
    public int compare(User o1, User o2){
       return Integer.compare(o1.getId(),o2.getId());
    }


    public  CopyOnWriteArrayList<User> getOrderUser(){
       Collections.sort(listUsers, new UserRepository());

        return listUsers;
    }
}
