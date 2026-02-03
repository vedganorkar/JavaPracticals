import java.util.*; 

class Shipment { 
  String trackingId; 
  ArrayList<String> transitCities = new ArrayList<>(); 
  
  Shipment(String trackingId) { 
    this.trackingId = trackingId; 
  } 
  
  void addCity(String city) {         transitCities.add(city); 
  } 
  
  void auditJourney() { 
    System.out.println("Journey for Tracking ID " + trackingId + ":"); 
    for (String city : transitCities) {             System.out.println(" -> " + city); 
    } 
  } 
} 

class Pract2 { 
  
  static HashSet<String> trackingIds = new HashSet<>(); 
  static HashMap<String, Map<String, Integer>> warehouses = new HashMap<>(); 
  
  public static void main(String[] args) { 
    
    createShipment("TRK101");         createShipment("TRK101"); 
    
    System.out.println("\nFinal Warehouse Inventory:");         System.out.println(warehouses); 
  } 
  
  static void createShipment(String trackingId) { 
    
    if (trackingIds.contains(trackingId)) { 
      System.out.println("Duplicate Tracking ID " + trackingId + " detected! Shipment rejected.\n"); 
      return; 
    } 
    
    trackingIds.add(trackingId); 
    System.out.println("Shipment " + trackingId + " accepted."); 
    
    Shipment shipment = new Shipment(trackingId);         shipment.addCity("Pune");         shipment.addCity("Mumbai");         shipment.addCity("Delhi"); 
    
    updateWarehouse("WH1", "Paracetamol", 50); 
    
    shipment.auditJourney();
    System.out.println();     } 
    