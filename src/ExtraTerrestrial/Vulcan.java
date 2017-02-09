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
public class Vulcan extends Humanoid {
   
private boolean isLogical;
private boolean inStarFleet;

MessageService output = new MessageService();

// Constructors
 
public Vulcan (String homePlanet, String name) {
    super (homePlanet, name);
    setHomePlanet ("Vulcan");
    setGreeting ("Live long and prosper");
    setIsLogical(true);
    setInStarFleet(false);
}

// Getters

public boolean getIsLogical() {
    return isLogical;
}

public boolean getInStarFleet() {
    return inStarFleet;
}

// Setters

public void setIsLogical (boolean isLogical) {
    this.isLogical = isLogical;
}

public void setInStarFleet (boolean inStarFleet) {
    this.inStarFleet = inStarFleet;
}

// Methods

public void findLogic () {
    if (getIsLogical() == true)
    {
        travelToEarch();
        giveGreeting();
        output.outputMessage("This visit is logical.");
    }
    else
    {
        travelToEarch();
        giveGreeting();
        output.outputMessage("This visit is illogical.");
    } 
}

}
