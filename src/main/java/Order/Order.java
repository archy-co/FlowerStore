package Order;

import User.User;

import java.util.ArrayList;

public class Order {
    public ArrayList<User> users = new ArrayList<User>();

    public int addUser(User user){
        if(users.contains(user))
            return 1;

        this.users.add(user);
        return 0;
    }

    public int removeUser(User user){
        if(!users.contains(user))
            return 1;
        users.remove(user);
        return 0;
    }

    public void notifyUsers(){
        for(int i = 0; i < users.size(); i++){
            users.get(i).update(2);
        }
    }

    public void order(){
        notifyUsers();
    }

    public static QuickOrder createQuickOrder(){
        return new QuickOrder();
    }

    @Override
    public String toString() {
        return "Order{" +
                "users=" + users +
                '}';
    }
}
