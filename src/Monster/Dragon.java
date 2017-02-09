/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Monster;

/**
 *
 * @author Owner
 */
public class Dragon extends MythicalBeast {

private String color;
private boolean breathsFire;


MessageService output = new MessageService();


// Constructors
 
public Dragon (String size, String threatLevel, String color) {
    super (size, threatLevel);
    this.color = color;
    this.breathsFire = true;
}


// Getters

public String getColor () {
    return color;
}

public boolean getBreathsFire () {
return breathsFire;
}

// Setters

public void setColor (String color) {
    if (color == null || color.isEmpty() == true) 
    {
    color = "indistinguishable";
    throw new IllegalArgumentException ("Color is invalid");
    }
    else
    {
    this.color = color;
    }
}


public void setBreathsFire (boolean breathsFire) {
    this.breathsFire = breathsFire;
}


// Methods

public void attack () {
    if (getCanFly() == true && getBreathsFire() == true)
    {
    output.outputMessage ("The flying " + getColor() + " dragon is flying and breathing fire on your house.");
    }
    else 
    {
    output.outputMessage ("The " + getColor() + " dragon is walking around and smashing your house.");
    }
}
    
}
