package Deepa.Driver;

public class Encapsulation {
    private int Ssn;
    private String Name;
    private int Age;
    public int getESsn(){
        return Ssn;
    }
    public void setESsn(int newSsnVal) {
        Ssn = newSsnVal;
    }
    public String getEName(){
        return Name;
    }
    public void setEName(String newENameVal){
        Name = newENameVal;
    }
    public int getEAge(){
        return Age ;
    }
    public void setEAge(int newEAgeVal){
        Age=  newEAgeVal;
    }
}
