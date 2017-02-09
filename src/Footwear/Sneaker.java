/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Footwear;

/**
 *
 * @author Owner
 */
public class Sneaker extends Shoe {
    
private boolean hasCushion;
private String activityIntent;

MessageService output = new MessageService();

// Constructor

public Sneaker (int size, String material, boolean hasLaces, String type, boolean hasCushion, String activityIntent) {
    super (size, material, hasLaces, type);
    this.activityIntent = activityIntent;
}


// Getters
 
public boolean getHasCushion () {
    return hasCushion;
}

public String getActivityIntent () {
    return activityIntent;
}

// Setters

public void setHasCushion (boolean hasCushion) {
this.hasCushion = hasCushion;
}

public void setActivityIntent (String activityIntent) {
    activityIntent = activityIntent.toUpperCase();
    if (activityIntent.equals("RUNNING") == true || activityIntent.equals("CROSSTRAINING") == true || activityIntent.equals("SPORTS") == true)
    {
    this.activityIntent = activityIntent;
    }
    else
    this.activityIntent = "RUNNING";
    throw new IllegalArgumentException ("Shoe intent was not valid");
}


// Method
public void testThemOut() {
    output.outputMessage ("Jump around in shoes.");
}
    
    
}
