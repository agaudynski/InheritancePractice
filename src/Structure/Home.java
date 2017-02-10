/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Structure;

/**

 */
public class Home extends Building {
    
      
private boolean hasBackyard;
private boolean hasGarage;
private boolean isHouse;
private boolean isApartment;

MessageService output = new MessageService();


// Constructors

public Home (int height, int width, String material, int maxOccupants, int numberOfFloors, boolean isHouse) {
    super (height, width, material, maxOccupants, numberOfFloors);
        if (this.isHouse == true) 
        {
        this.isHouse = true;
        this.isApartment = false;
        }
        else
        {
        this.isHouse = false;
        this.isApartment = true;
        }
}

public Home () {
    hasBackyard = false;
    hasGarage = false;
    isHouse = true;
    isApartment = false;
}


// Getters

public boolean getIsApartment (){
    return isApartment;
}

public boolean getIsHouse () {
    return isHouse;
}

public boolean getHasBackyard () {
    return hasBackyard;
}

public boolean getHasGarage () {
    return hasGarage;
}

// Setters

public void setIsApartment (boolean isApartment) {
    this.isApartment = isApartment;
}

public void setIsHouse (boolean isHouse) {
    this.isHouse = isHouse;
}

public void setHasBackyard (boolean hasBackyard) {
    if (this.isHouse == true) {
    this.hasBackyard = hasBackyard;
    }
    else
    {
    this.hasBackyard = false;
    throw new IllegalArgumentException ("Apartments can not have backyards.");
    }
}

public void setHasGarage (boolean hasGarage) {
    if (this.isHouse == true) {
    this.hasGarage= hasGarage;
    }
    else
    {
    this.hasGarage = false;
    throw new IllegalArgumentException ("Apartments can not have a garage.");
    }
}


// Method

public void updatePropertyToHouse (){
    this.setIsHouse (true);
    this.setIsApartment (false);
    this.setHasBackyard (true);
    this.setHasGarage (true);
}

public void updatePropertyToApartment () {
    this.setIsHouse (false);
    this.setIsApartment (true);
    this.setHasBackyard (false);
    this.setHasGarage (false);
}

}
