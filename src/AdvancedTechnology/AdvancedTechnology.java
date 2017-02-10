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
public class AdvancedTechnology {
    

private String powerSource;
private String processingPower;

MessageService output = new MessageService();

// Constructor

public AdvancedTechnology (String powerSource, String processingPower) {
    this.powerSource = powerSource;
    this.processingPower = processingPower;
}

public AdvancedTechnology () {
    powerSource = "battery pack";
    processingPower = "12 Jigahurtz";
}


// Getters

public String getPowerSource () {
    return powerSource;
}

public String getProcessingPower() {
    return processingPower;
}


// Setters

public void setPowerSource (String powerSource) {
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

public void setProcessingPower (String processingPower) {
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

public void turnOn () {
    if ((processingPower.equals("no processing power") || (powerSource.equals("no power source"))))
    {
    output.outputMessage ("Invalid power to turn on.");
    }
    else
    {
    output.outputMessage ("Power is running at " + getProcessingPower() + " from a " + getPowerSource() + ".");
    }
}    
    
}
