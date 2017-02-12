
package car;

/**
 * @author coder_nigga
 */
/***************************************************************/

public class Car {

    int maxSpeed = 100;
    int minSpeed = 0;
    
    double weight = 4079;
    
    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfCar = "Lucy";  
    
    double maxFuel = 16;
    double currentFuel = 8;
    double mpg = 26.4;
    
    int numberOfPeopleInCar = 1;
    int maxNumberOfPeopleInCar = 6;
    
/***************************************************************/
    
    public Car(){
        
    }
    
    public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn) {
        maxSpeed = customMaxSpeed;
        weight = customWeight;
        isTheCarOn = customIsTheCarOn;
    }
    
    //Getters and Setters
    
    public int getMaxSpeed(){
        return this.maxSpeed;
    }
    
    public void setMaxSpeed(int newMaxSpeed){
        this.maxSpeed = newMaxSpeed;
    }
    
    public int getMinSpeed(){
        return this.minSpeed;
    }
    
    public double getWeight(){
        return this.weight;
    }
    
    public boolean getIsTheCarOn(){
    return this.isTheCarOn;
    }
    
    public void printVariables() {
        System.out.println("MaxSpeed = " + maxSpeed);
        System.out.println("MinSpeed = " + minSpeed);
        System.out.println("Weight = " + weight);
        System.out.println("OnOffStatus = " + isTheCarOn);
        if (condition == 'A') {
             System.out.println("Perfect - " + condition);
        }
        else {
             System.out.println("Wrecked - " + condition);
        }
        System.out.println("NameOfCar = " + nameOfCar);
        System.out.println("NumberOfPeopleInCar = " + numberOfPeopleInCar);
        System.out.println("");
    }
    
    
    public void upgradeMaxSpeed() {
        setMaxSpeed(getMaxSpeed() + 10);
    }
    
    public void getIn() {
        if(numberOfPeopleInCar < maxNumberOfPeopleInCar){
                    numberOfPeopleInCar++;
                    System.out.println("Someone got in.");
        }
        else{
            System.out.println("No more room in car");
         }
    }
    
    public void getOut() {
        if(numberOfPeopleInCar != 0){
        numberOfPeopleInCar--;
        }
        else {
            System.out.println("No one is in the car");
        }
    }
    
    public double howManyMilesTillOutOfGas() {
        return currentFuel * mpg;
    }
    
    public double maxMilesPerFillup(){
        return maxFuel * mpg;
    }
    
    public void wreckCar() {
        condition = 'C';
    }

    public void turnTheCarOn() {
        if(!isTheCarOn){
            isTheCarOn = true;
            System.out.println("Turned the car on");
        }
        else{
            System.out.println("The car is already on");
        }
    }
    
    public void turnTheCarOff() {
        if(isTheCarOn == true){
            isTheCarOn = false;
            System.out.println("Turned the car off");
        }
        else{
            System.out.println("The car is already off");
        }
    }
    
    
/***************************************************************/
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Car tommycar = new Car();
        tommycar.getOut();
        tommycar.getOut();
        tommycar.getIn();
        tommycar.getIn();
        tommycar.getIn();
        tommycar.getIn();
        tommycar.getIn();
        tommycar.getIn();
        tommycar.getIn();
        tommycar.turnTheCarOn();
        tommycar.turnTheCarOn();
        tommycar.turnTheCarOff();
        tommycar.turnTheCarOff();
        
        
        
        
        
        
//        Car christmasPresent = new Car(550, 2000, false);
//        System.out.println("Christmas Car:");
//        christmasPresent.printVariables();
    }
}
