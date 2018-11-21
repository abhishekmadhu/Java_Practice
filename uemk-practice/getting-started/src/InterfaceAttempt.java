interface vehicle{
    void moveForward();
}

class Car implements vehicle{
    int loc;

    public int getLoc() {
        return loc;
    }

    public void setLoc(int loc) {
        this.loc = loc;
    }

    Car(int x){
        this.loc = x;
    }

    @Override
    public void moveForward() {
        this.loc++;
    }
}

public class InterfaceAttempt {
    public static void main(String args[]){
        Car a = new Car(10);
        a.moveForward();
        System.out.println(a.getLoc());
    }
}
