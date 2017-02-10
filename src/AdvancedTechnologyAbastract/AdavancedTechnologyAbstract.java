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
public abstract class AdavancedTechnologyAbstract {
    

private String powerSource;
private String processingPower;

MessageService output = new MessageService();

// Constructor

public AdavancedTechnologyAbstract (String powerSource, String processingPower) {
    this.powerSource = powerSource;
    this.processingPower = processingPower;
}

public AdavancedTechnologyAbstract () {
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

public abstract void setPowerSource (String powerSource);

public abstract void setProcessingPower (String processingPower);

// Methods

public abstract void turnOn ();
     
}


