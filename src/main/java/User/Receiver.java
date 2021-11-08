package User;

public class Receiver extends BasicUser implements User{
    private int status;

    public Receiver(){
        super(0);
    }

    public void update(int status){
        this.status = status;
    }

    public int getStatus(){
        return status;
    }

}
