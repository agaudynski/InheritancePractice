/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdvancedTechnologyAbastract;


/**
 *
 * @author Owner
 */
 
public class InterdimensionalVehicleAbstract extends AdavancedTechnologyAbstract {
    
private int numberOfPassengers;
private String speed;
private String processingPower;
private String powerSource;

MessageService output = new MessageService();

// constructors

public InterdimensionalVehicleAbstract (String powerSource, String processingPower, int numberOfPassengers, String speed) {
    super (powerSource, processingPower);
    this.numberOfPassengers = numberOfPassengers;
    this.speed = speed;
}

public InterdimensionalVehicleAbstract () {
    numberOfPassengers = 1;
    speed = "1 decayear";
}

// Getters

public int getNumberOfPassengers () {
    return numberOfPassengers;
}

public String getSpeed () {
    return speed;
}

// Setters

public void setNumberOfPassengers (int numberOfPassengers) {
    if (numberOfPassengers < 1 || numberOfPassengers > 5)
    {
    throw new IllegalArgumentException ("Passengers can be between 1 and 5");
    }
    else
    {
    this.numberOfPassengers = numberOfPassengers;
    }
}

public void setSpeed (String speed) {
    if (speed == null || speed.isEmpty() == true)
    {
    throw new IllegalArgumentException ("Entered speed is invalid");
    }
    else
    {
    this.speed = speed;
    }
}
// Override methods from abstract parent class
@Override
public void setPowerSource(String powerSource) {
    if (powerSource == null || powerSource.isEmpty() == true)
    {
    powerSource = "no power source";
    throw new IllegalArgumentException ("Invalid PowerSource");
    }
    else
    {
        this.powerSource = powerSource;
    }
}

@Override 
public void setProcessingPower(String processingPower) {
    if (processingPower == null || processingPower.isEmpty() == true)
    {
    processingPower = "no processing power";
    throw new IllegalArgumentException ("Insufficient Processing Power");
    }
    else
    {
    this.processingPower = processingPower;
    }
}
    

// Methods
@Override
public void turnOn () {
    if (powerSource.equals("battery pack") || (processingPower.equals("no processing power") || (powerSource.equals("no power source"))))
    {
    output.outputMessage ("Power seems to be having issues.");
    }
    else
    {
    output.outputMessage ("Power is running at " + getProcessingPower() + " from a " + getPowerSource() + ".");
    }
} 

public void travel () {
    output.outputMessage ("There are " + getNumberOfPassengers() + " traveling at " + getSpeed() + ".");
}  


}

