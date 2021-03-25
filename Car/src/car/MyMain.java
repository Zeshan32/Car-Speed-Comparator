//Mohammad Malallah - 37814
package car;

import java.util.Scanner;

public class MyMain {
    public static  Car fastest(Car c1,Car c2,Car c3)//we make it static because we cannot call the non static in static method.
    {
         Car fastest=c1;
         if(fastest.getconsumption()<c2.getconsumption()&&c2.getconsumption()>=c3.getconsumption())
             fastest=c2;
         else if(fastest.getconsumption()<c3.getconsumption()&&c3.getconsumption()>=c2.getconsumption())
             fastest=c3;
      return fastest;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String carname,carmodel;
        int carnewprice,caroldprice,year;
        double consumption;
        Car benz=new Car("Mercsde","Gle",15000,2000,2019,5.6);
        Car gmc=new Car();
        gmc.SetCarName("GMC");
        gmc.SetCarModel("Envoy");
        gmc.SetCarnewPrice(10000);
        gmc.SetCaroldprice(5000);
        gmc.setyear(2018);
        gmc.setconsumption(5.6);
        System.out.print("Enter the name of car: ");
        carname=sc.nextLine();
        System.out.print("Enter the Model of car: ");
        carmodel=sc.nextLine();
        System.out.print("Enter the new price of car: ");
        carnewprice=sc.nextInt();
        System.out.print("Enter the old price of car: ");
        caroldprice=sc.nextInt();
        System.out.print("Enter the year of car: ");
        year=sc.nextInt();
        System.out.print("Enter the Consumption of car: ");
        consumption=sc.nextDouble();
        Car obj3=new Car(carname,carmodel,carnewprice,caroldprice,year,consumption);
        Car fastest=fastest(benz,gmc,obj3);
        System.out.println("The name of Fastest car: "+fastest.getcarname()+
        " The model of Fastest car: "+fastest.getcarmodel());
       System.out.println("The Difference for"+benz.getcarname()+
        " "+benz.getcarmodel()+" is:"+benz.calcLoss()+"KD");
       System.out.println("The Difference for "+gmc.getcarname()+
        " "+gmc.getcarmodel()+" is:"+gmc.calcLoss()+"KD");
       System.out.println("The Difference for"+obj3.getcarname()+
        " "+obj3.getcarmodel()+" is:"+obj3.calcLoss()+"KD");
                
    }
    
}
