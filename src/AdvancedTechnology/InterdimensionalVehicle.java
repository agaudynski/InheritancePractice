/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdvancedTechnology;

/**
 *
 * @author Owner
 */
public class InterdimensionalVehicle extends AdvancedTechnology {
    
private int numberOfPassengers;
private String speed;
private String processingPower;
private String powerSource;

MessageService output = new MessageService();

// constructors

public InterdimensionalVehicle (String powerSource, String processingPower, int numberOfPassengers, String speed) {
    super (powerSource, processingPower);
    this.numberOfPassengers = numberOfPassengers;
    this.speed = speed;
}

public InterdimensionalVehicle () {
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
