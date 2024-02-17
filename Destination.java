import java.util.*;

class Destination {
    private String name;
    private List<Activity> activities;

   
}

class Activity {
    private String name;
    private String description;
    private double cost;
    private int capacity;
    private Destination destination;

  
}

class Passenger {
    private String name;
    private String passengerNumber;

    
}

class StandardPassenger extends Passenger {
    private double balance;

}

class GoldPassenger extends Passenger {
    private double balance;

   
}

class PremiumPassenger extends Passenger {
 
}

class TravelPackage {
    private String name;
    private int passengerCapacity;
    private List<Destination> itinerary;
    private List<Passenger> passengers;

  
}

class TravelAgencySystem {
    private List<TravelPackage> travelPackages;

   

    public void printItinerary(TravelPackage travelPackage) {
        
        System.out.println("Travel Package Name: " + travelPackage.getName());

     
        for (Destination destination : travelPackage.getItinerary()) {
            System.out.println("Destination: " + destination.getName());
            for (Activity activity : destination.getActivities()) {
                System.out.println("Activity: " + activity.getName());
                System.out.println("Description: " + activity.getDescription());
                System.out.println("Cost: " + activity.getCost());
                System.out.println("Capacity: " + activity.getCapacity());
            }
        }
    }

    public void printPassengerList(TravelPackage travelPackage) {
      
        System.out.println("Package Name: " + travelPackage.getName());
        System.out.println("Passenger Capacity: " + travelPackage.getPassengerCapacity());

       
        System.out.println("Number of Passengers Enrolled: " + travelPackage.getPassengers().size());

       
        for (Passenger passenger : travelPackage.getPassengers()) {
            System.out.println("Passenger Name: " + passenger.getName());
            System.out.println("Passenger Number: " + passenger.getPassengerNumber());
        }
    }

    public void printPassengerDetails(Passenger passenger) {
       
        System.out.println("Passenger Name: " + passenger.getName());
        System.out.println("Passenger Number: " + passenger.getPassengerNumber());

        
        if (passenger instanceof StandardPassenger) {
            System.out.println("Balance: " + ((StandardPassenger) passenger).getBalance());
        } else if (passenger instanceof GoldPassenger) {
            System.out.println("Balance: " + ((GoldPassenger) passenger).getBalance());
        }

        /
    }

    public void printAvailableActivities(List<Activity> activities) {
        for (Activity activity : activities) {
            if (activity.getCapacity() > 0) {
                System.out.println("Available Activity: " + activity.getName());
                System.out.println("Available Spaces: " + activity.getCapacity());
            }
        }
    }
}


class TravelPackage {
    private String packageCode;
    private String itinerary;

    
}

class Passenger {
    private String passengerCode;
    private String name;
    private String contact;

    
}


class TravelAgencySystem {
    private Map<String, TravelPackage> travelPackages; 
    private Map<String, Passenger> passengers;
    public TravelAgencySystem() {
        travelPackages = new HashMap<>();
        passengers = new HashMap<>();
    }

   
    public void addTravelPackage(TravelPackage travelPackage) {
        travelPackages.put(travelPackage.getPackageCode(), travelPackage);
    }

    public void updateTravelPackage(TravelPackage travelPackage) {
        travelPackages.put(travelPackage.getPackageCode(), travelPackage);
    }

    public void deleteTravelPackage(String packageCode) {
        travelPackages.remove(packageCode);
    }

    public void addPassenger(Passenger passenger) {
        passengers.put(passenger.getPassengerCode(), passenger);
    }

    public void updatePassenger(Passenger passenger) {
        passengers.put(passenger.getPassengerCode(), passenger);
    }

    public void deletePassenger(String passengerCode) {
        passengers.remove(passengerCode);
    }

  
public class Main {
    public static void main(String[] args) {
        
        TravelAgencySystem travelAgencySystem = new TravelAgencySystem();

        
        TravelPackage package1 = new TravelPackage("P1", "Itinerary for Package 1");
        travelAgencySystem.addTravelPackage(package1);

        
        Passenger passenger1 = new Passenger("PA1", "John Doe", "1234567890");
        travelAgencySystem.addPassenger(passenger1);

        
        package1.setItinerary("Updated itinerary for Package 1");
        travelAgencySystem.updateTravelPackage(package1);

        
        TravelPackage updatedPackage1 = travelAgencySystem.getTravelPackage("P1");
        System.out.println("Updated Itinerary for Package 1: " + updatedPackage1.getItinerary());
    }
}
