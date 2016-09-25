/**
 * Created by anton on 20.09.16.
 */
public class User {
    private String name;
    private int userId;
    public User(String name,int userId){
        this.name=name;
        this.userId=userId;
    }
    public int getId(){
        return userId;
    }
    public String getName(){
        return name;
    }


}
