/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Structure;

/**
 *
 * @author Owner
 */
public class Building extends Structure {
    
    // Variables
private int maxOccupants;
private int numberOfFloors;
private int temp;

MessageService output = new MessageService();

// Constructor
public Building (int height, int width, String material, int maxOccupants, int numberOfFloors){
    super (height, width, material);
    this.maxOccupants = maxOccupants;
    this.numberOfFloors = numberOfFloors;
    this.temp = 0;
}

// Getters

public int getMaxOccupants () {
    return maxOccupants;
}

public int getNumberOfFloors () {
    return numberOfFloors;
}

public int getTemp () {
    return temp;
}

// Setters

public void setMaxOccupants (int maxOccupants) {
    if (maxOccupants < 0)
    {
    throw new IllegalArgumentException ("Occupant can not be negative number.");
    }
    else
    {
    this.maxOccupants = maxOccupants;
    }
}

public void setNubmerOfFloors (int numberOfFloors) {
    if (numberOfFloors < 1 || numberOfFloors > 60)
    {
    throw new IllegalArgumentException ("Floors can not be less than 1 or more than 60.");
    }
    else
    {
    this.numberOfFloors = numberOfFloors;
    }
}

public void setTemp (int temp) {
    if (temp < 0 || temp > 95){
    throw new IllegalArgumentException ("Temperature must be between 0 and 95.");
    }
    else 
    {
    this.temp = temp;
    }
}

// Methods

public void coolBuilding (){
if (temp == 0) {
output.outputMessage ("The tempeerature is set to its minimum.");
}
else
{
temp = temp - 1;
output.outputMessage ("The tempeerature is now " + getTemp() + " degrees.");
}
}

public void heatBuilding (){
    if (temp == 95) {
    output.outputMessage ("The tempeerature is at its max.");
    }
    else
    {
    temp = temp + 1;
    output.outputMessage ("The tempeerature is now " + getTemp() + " degrees.");
    }
}

}
