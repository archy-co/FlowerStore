package User;

public class Sender extends BasicUser implements User{
    private int status;

    public Sender(){
        super();
        this.status = 1;
    }

    public void update(int status){
        this.status = status;
    }

    public int getStatus(){
        return status;
    }
}
