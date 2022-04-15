package j16_static;

public class Car {
    private int serialNumber;
    private String company;
    private String model;

    public Car(int serialNumber, String company, String model){
        super();
        this.serialNumber=serialNumber;
        this.company=company;
        this.model=model;

    }

    public int getSerialNumber(){
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber){
        this.serialNumber=serialNumber;
    }


    public String getcompany(){
        return company;
    }

    public void setcompany(String company){
        this.company=company;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model=model;
    }

    @Override
    public String toString(){
        return "Car [serialNumber = " + serialNumber + ", company = " + company + ", model = " + model + "]";
    }
// create - to String
    
}
