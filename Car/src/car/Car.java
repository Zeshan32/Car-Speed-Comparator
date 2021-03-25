//Mohammad Malallah - 37814
package car;


public class Car {
    private String carName;
    private String carModel;
    private int newCarprice;
    private int usedCarprice;
    private int year;
    private double consumptionper100;
    public Car()
    {
      carName="DefaultString";
      carModel="DefaultString";
      newCarprice=5;
      usedCarprice=5;
      year=5;
      consumptionper100=0.0;
      
      
    }
    public Car(String carstring,String carmodel,int newcarprice,int usedcarprice,int year,double consumption)
    {
       carName=carstring;
       carModel =carmodel;
       newCarprice= newcarprice; 
       usedCarprice=usedcarprice;
        this.year=    year;
        this.consumptionper100=consumption;      
    }
    public void SetCarName(String carstring)
    {
         this.carName=carstring;
    }
    public void SetCarModel(String carmodel)
    {
       this.carModel=carmodel;
    }
    public void SetCarnewPrice(int price)
    {
       this.newCarprice=price;
    }
    public void SetCaroldprice(int price)
    {
        this.usedCarprice=price;
    }
    public void setyear(int year)
    {
        this.year=year;
    }
    public void setconsumption(double consumption)
    {
       this.consumptionper100=consumption;
    }
    public String getcarname()
    {
        return this.carName;
    } 
    public String getcarmodel()
    {
       return this.carModel;
    }
    public int getnewcarprice()
    {
      return this.newCarprice;   
    }
     public int getoldprice()
     {
        return this.usedCarprice;
     }
     public int getyear()
     {
       return this.year;
     }
     public double getconsumption()
     { 
         return this.consumptionper100;
     
     }
     public void print()
     {
       System.out.println(this.carName+this.carModel+" of "+this.year+"costs"
               +this.newCarprice+" KD if it is new and"+this.usedCarprice+"if used"
       +"consumption of the 100km is  "+this.consumptionper100+"litres");
     
     }
     public int calcLoss()
     {
        return this.newCarprice-this.usedCarprice;
     }
     
}
