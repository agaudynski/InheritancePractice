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
public class Shoe extends Footwear {
    
private boolean hasLaces;
private String type;

MessageService output = new MessageService();

// Constructor

public Shoe (int size, String material, boolean hasLaces, String type){
    super (size, material);
    this.hasLaces = hasLaces;
    this.type = type;
}


// Getters

public boolean getHasLaces (){
    return hasLaces;
}

public String getType () {
    return type;
}

// Setters

public void setHasLaces (boolean hasLaces) {
this.hasLaces = hasLaces;
}

public void setType (String type){
    type = type.toUpperCase();
    if (type.equals("CASUAL") == true || type.equals("DRESS") == true || type.equals("ATHLETIC") == true)
    {
    this.type = type;
    }
    else
    this.type = "CASUAL";
    throw new IllegalArgumentException ("Shoe type was not valid");
    }


// Method

public void laceEmUp() {
    output.outputMessage("Show are on feet and tied up.");
}

}

    