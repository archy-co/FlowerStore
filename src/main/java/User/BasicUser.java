package User;

import java.util.Random;

public class BasicUser implements User{
    private int status;
    protected int id;

    public BasicUser(){
        Random r = new Random();
        this.id = r.nextInt(100);
        this.status = 0;
    }

    public BasicUser(int status){
        Random r = new Random();
        this.id = r.nextInt(100);
        this.status = status;
    }

    public void update(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public int getId(){
        return id;
    }
}
