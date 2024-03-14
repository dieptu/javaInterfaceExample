public class Car implements ObjectInformation {
    private String model;
    private String vinNumber;

    public Car(String model, String vin){
        this.model = model;
        this.vinNumber = vin;
    }

    @Override
    public void displayInformation(){
        System.out.println("Model: " + model + "; \nVin number: " + vinNumber);
    }
    
}
