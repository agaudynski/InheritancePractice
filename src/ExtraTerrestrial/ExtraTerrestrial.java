/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExtraTerrestrial;

/**
 *
 * @author Owner
 */
public class ExtraTerrestrial {
   
private String homePlanet;
private String name;


MessageService output = new MessageService();


// constructors

public ExtraTerrestrial (String homePlanet, String name){
    this.homePlanet = homePlanet;
    this.name = name;
}

// Getters

public String getHomePlanet () {
    return homePlanet;
}

public String getName () {
    return name;
}

// Setters

public void setHomePlanet (String homePlanet) {
    if (homePlanet == null || homePlanet.isEmpty() == true) 
    {
        homePlanet = "unknown";
        throw new IllegalArgumentException ("Home planet is invalid");
    }
    else
    {
        this.homePlanet = homePlanet;
    }
}

public void setName (String name) {
    if (name == null || name.isEmpty() == true) 
    {
    name = "unknown";
    throw new IllegalArgumentException ("Name is invalid");
    }
    else
    {
    this.name = name;
    }
}


// Methods

public void travelToEarch () {
    output.outputMessage   (getName() + " is comeing to Earth from " + getHomePlanet());
}


     
}
