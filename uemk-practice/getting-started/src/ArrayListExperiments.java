import java.util.ArrayList;

/*
* This idea can be used to work efficiently with
* co-ordinates by creating an arrayList of tuples,
* and then taking them out pair-wise at a time
* */

public class ArrayListExperiments {
    public static void main(String args[]){
        System.out.println("Hello Array Lists");
        System.out.println("ArrayList is a generic class with a " +
                "type parameter. It is specified as " +
                "\nArrayList<Type> ArrayListName = new ...");

        ArrayList<DemoObject> list = new ArrayList<>();
        list.add(new DemoObject(1,2));
        list.add(new DemoObject(3,4));
        list.add(new DemoObject(5,6));
        list.add(new DemoObject(7,8));
        list.add(new DemoObject(9,10));

        System.out.println(list.size());
        for (DemoObject obj:list
             ) {
            System.out.println("(" + obj.getI() + "," + obj.getJ() +
                    ") sum to " + obj.returnSum());
        }

        /*
        Other things as follows can be used to access the list unlike arrays
        * Remember to use list.set(index, value) while inserting values
        */

        System.out.println(list.get(0).getI() + " " + list.get(0).getJ());
        System.out.println(list.get(1).getI() + " " + list.get(0).getJ());

        list.ensureCapacity(15);            //Does not change list.size()
        System.out.println(list.size());    //stays 5 instead of 15 as I expected

        list.trimToSize();
        System.out.println(list.size());


        // To make an arrayList of Integers,
        // use the Integer class instead,
        // as AL of primitive types are not allowed

        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(100);
        integerList.add(101);
        for (int element:integerList) {
            System.out.println(element);
        }
    }
}
