



package AdvancedTechnologyInterface;



public interface AdavancedTechnologyInterface {
    

MessageServiceInterface output = new MessageServiceInterface();

// Constructor

// Getters

public abstract String getPowerSource();

public abstract String getProcessingPower();


// Setters

public abstract void setPowerSource (String powerSource);

public abstract void setProcessingPower (String processingPower);

// Methods

public abstract void turnOn ();
     
}


