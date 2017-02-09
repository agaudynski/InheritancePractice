/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Politician;

/**
 *
 * @author Owner
 */
public class ElectedOfficial extends Politician {
    
private boolean isActive;
private int termLength;
private int termsServed;
private int termServing;
private int yearsServed;

MessageService output = new MessageService();

// Constructor
public ElectedOfficial (String name, int age, char gender, String party, boolean isActive, int termLength, int termServing, int yearsServed) {
    super (name, age, gender, party);
    this.isActive = isActive;
    this.termLength = termLength;
    this.yearsServed = yearsServed;
}


// Getters

public boolean getIsActive () {
    return isActive;
}

public int getTermLength() {
    return termLength;
}

public int getTermsServed () {
    return termsServed;
}

public int getTermServing () {
    return termServing;
}

public int getYearsServed () {
    return yearsServed;
}

// Setters

public void setIsActive (boolean isActive){
    this.isActive = isActive;
}

public void setTermLength (int termLength) {
    if (termLength < 1 || termLength > 10)
    {
    throw new IllegalArgumentException ("Term length must be between 1 and 10");
    }
    else
    {
    this.termLength = termLength;
    }
}

public void setTermsServed (int termsServed){
    if (termsServed < 1 || termsServed > 10)
    {
    throw new IllegalArgumentException ("Terms served must be between 0 and 10");
    }
    else
    {
    this.termsServed = termsServed;
    }
}

public void setTermServing (int termServing){
    if (termServing < 1 || termServing > 10)
    {
    throw new IllegalArgumentException ("Term serving must be between 1 and 10");
    }
    else
    {
    this.termServing = termServing;
    }
}


public void setYearsServed (int yearsServed) {
    if (yearsServed < 0 || yearsServed > 60)
    {
    throw new IllegalArgumentException ("Years served must be between 0 and 60");
    }
    else
    {
    this.yearsServed = yearsServed;
    }
}

// Methods

public void updateYearsServed () {
yearsServed += 1;
updateTermServing();
}

public void updateTermServing () {
    if ((yearsServed/termLength) > termServing) 
    {
    termServing = termServing + 1;
    }  
}

}
    
   
