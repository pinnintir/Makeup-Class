public class Makeup {
    private String brand;
    private int year;
    private String color;

    public Makeup() {

    }
    public Makeup(String brand, int year){
            this.brand = brand;
            this.year = year;
    }
    public Makeup(String brand, int version, String color){
        this.brand = brand;
        this.version = version;
        this.color = color;
    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public int getVersion(){
            return version;
    }
    public void setVersion(int version){
        this.version = version;
    }
    public String getColor (){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean isEcoFriendly(){
        return true;
    }
    public String lookatme(){
        return "Finally, makeup that looks and feels good!";
    }

    public string packageMakeup(String list){

    }
    public static void main(String[] args){
        Makeup makeup = new Makeup ("Essie", "2022", "pink")
        System.out.println(makeup.packageMakeup("currentline"))
    }
