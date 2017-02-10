/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdvancedTechnologyInterface;


/**
 *
 * @author Owner
 */
public class TimeMachineInterface extends InterdimensionalVehicleInterface {
    
private String destinationYear;
private String destinationLocation;

MessageServiceInterface output = new MessageServiceInterface();

// Constructors

public TimeMachineInterface (String powerSource, String processingPower, int numberOfPassengers, String speed) {
    super (powerSource, processingPower, numberOfPassengers, speed);
    this.destinationYear = "not set";
    this.destinationLocation = "not set";
}

public TimeMachineInterface() {
    destinationYear = "present";
    destinationLocation = "present location";
}

// Getters

public String getDestinationYear () {
    return destinationYear;
}

public String getDestinationLocation () {
    return destinationLocation;
}

// Setters

public void setDestinationYear (String destinationYear) {
    if (destinationYear == null || destinationYear.isEmpty() == true || destinationYear.length() > 5) 
    {
    destinationYear = "present year";
    throw new IllegalArgumentException ("Destination year is invalid");
    }
    else
    {
    this.destinationYear = destinationYear;
    }
}


public void setDestinationLocation (String destinationLocation) {
    if (destinationLocation == null || destinationLocation.isEmpty() == true || destinationLocation.length() > 5) 
    {
    destinationYear = "present location";
    throw new IllegalArgumentException ("Destination location is invalid");
    }
    else
    {
    this.destinationLocation = destinationLocation;
    }
}


// methods

public void engageTimeTravle (String destinationYear, String destinationLocation) {
    setDestinationYear (destinationYear);
    setDestinationLocation (destinationLocation);
    turnOn();
    travel();
    output.outputMessage("to " + getDestinationLocation() + " in the year " + getDestinationYear() + ".");
}
    
  
}

