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
public class MythicalBeast extends Monster {
    
private boolean isMagical;
private boolean canFly;

MessageService output = new MessageService();


public MythicalBeast (String size, String threatLevel) {
    super (size, threatLevel);
    this.isMagical = true;
    this.canFly = true;
}

// Getters

public boolean getIsMagical () {
    return isMagical;
}

public boolean getCanFly () {
    return canFly;
}

// Setters

public void setIsMagical (boolean isMagical) {
    this.isMagical = isMagical;
}

public void setCanFly (boolean canFly) {
    this.canFly = canFly;
}

// Methods

public void move () {
    if (canFly == true) 
    {
    output.outputMessage ("is flying");
    }
    else
    {
    output.outputMessage ("is walking");
    }
}    
    
}
