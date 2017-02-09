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
public class Monster {

private String size;
private String threatLevel;


MessageService output = new MessageService();


// Constructors

public Monster (String size, String threatLevel) {
    this.size = size;
    this.threatLevel = threatLevel;
}


// Getters

public String getSize () {
    return size;
}

public String getThreatLevel () {
    return threatLevel;
}

// Setters

public void setSize(String size){
    if (size == null || size.isEmpty() == true || size.length() < 2)
    {
    throw new IllegalArgumentException ("Invalid size.");
    }
    else
    {
    this.size = size;
    }
}


public void setThreatLevel (String threatLevel){
    if (threatLevel == null || threatLevel.isEmpty() == true|| threatLevel.length() < 2)
    {
    throw new IllegalArgumentException ("Invalid threat level.");
    }
    else
    {
    this.threatLevel = threatLevel;
    }
}


// Methods

public void monsterRoar () {
    output.outputMessage  ("Rawwar!");
}
    
}
