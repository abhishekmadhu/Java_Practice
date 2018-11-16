/*
* To be used as the object for all other experiments
*/
public class DemoObject {
    int i;
    int j;

    DemoObject(){

    }

    DemoObject(int i){
        this.i = i;
    }

    DemoObject(int i, int j){
        this.i = i;
        this.j = j;
    }

    int getI(){
        return this.i;
    }

    int getJ(){
        return this.j;
    }

    int returnSum(){
        return this.i + this.j;
    }
}
