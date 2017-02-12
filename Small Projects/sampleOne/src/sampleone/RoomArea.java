package sampleone;

class Room
{
    float length;
    float breadth;
    void getdata(float a , float b)
    {
        length = a;
        breadth = b;
    }
}

public class RoomArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float area;
        Room room1 = new Room();        //creates an object room1
        room1.getdata(14,10);           //assgns value to lenfth and breadth
        area = room1.length * room1.breadth;
        
        System.out.println("Area = " + area);
    }
}
