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
public class Humanoid extends ExtraTerrestrial {
   
private int averageHeight;
private int averageWeight;
private String greeting;

MessageService output = new MessageService();

// Constructors

public Humanoid (String homePlanet, String name) {
    super (homePlanet, name);
    averageHeight = 0;
    averageWeight = 0;
    greeting = "howdy";
}

// getters

public int getAverageHeight () {
    return averageHeight;
}

public int getAverageWeight () {
    return averageWeight;
}

public String getGreeting () {
    return greeting;
}

// Setters 

public void setAverageHeight (int averageHeight) {
    if (averageHeight < 0 || averageHeight > 100)
    {
    throw new IllegalArgumentException ("Height is invalid.");
    }
    else
    {
    this.averageHeight = averageHeight;
    }
}


public void setAverageWeight (int averageWeight) {
    if (averageWeight < 0 || averageWeight > 100)
    {
    throw new IllegalArgumentException ("Weight is invalid.");
    }
    else
    {
    this.averageWeight = averageWeight;
    }
}


public void setGreeting (String greeting){
    if (greeting == null || greeting.isEmpty() == true) 
    {
    throw new IllegalArgumentException ("Greeting is invalid.");
    }
    else
    {
    this.greeting = greeting;
    }
}

// Methods

public void giveGreeting () {
    output.outputMessage (getGreeting());
}

    
    
}
