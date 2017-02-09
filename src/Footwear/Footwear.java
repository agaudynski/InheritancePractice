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
public class Footwear {
    
public int size;
public String material;

MessageService output = new MessageService();

// Constructor

public Footwear (int size, String material) {
    this.size = size;
    this.material = material;
}


// Getters

public int getSize () {
    return size;
}

public String getMaterial() {
    return material;
}


// Setters

public void setSize (int size){
    if (size < 1 || size > 15) 
    {
    throw new IllegalArgumentException ("Size must be between 1 and 15.");
    }
    else
    {
    this.size = size;
    }
}


public void setMaterial (String material) {
    if (material == null || material.isEmpty() == true || material.length() < 4)
    {
    throw new IllegalArgumentException ("Material can not be empty or less than 4 characters");
    }
    else
    {
    this.material = material;
    }
}

// Methods

public void increaseFootwearSize(){
    size = size + 1;
    output.outputMessage("Size is now " + getSize() + " .");
}

public void decreaseFootwearSize () {
    size = size - 1;
    output.outputMessage("Size is now " + getSize() + " .");
}   
    
}
