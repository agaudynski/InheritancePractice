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
public class President extends ElectedOfficial {
 
    // President extends ElectedOfficial

private String platform;
private String policy;
private final int MAX_TERMS = 2;

MessageService output = new MessageService();


// Constructor

public President (String name, int age, char gender, String party, boolean isActive, int termLength, int termServing, int yearsServed, String platform, String policy) {
    super (name, age, gender, party, isActive, termLength, termServing, yearsServed);
    this.platform = platform;
    this.policy = policy;
    setTermLength(4);
    setIsActive(true);
}

// Getters

public String getPolicy () {
    return policy;
}

public String getPlatform () {
    return platform;
}

// Setters

public void setPolicy (String policy) {
    if (policy == null || policy.isEmpty() || policy.length() < 5)
    {
    throw new IllegalArgumentException ("Policy must be supplied.");
    }
    else
    {
    this.policy = policy;
    }
}

// Methods

public void setPlatform (String platform) {
    if (platform == null || platform.isEmpty() || platform.length() < 5)
    {
    throw new IllegalArgumentException ("Platform must be supplied.");
    }
    else
    {
    this.platform = platform;
    }
}

public void campaignForReElection (int yearsServed) {
    if (yearsServed > 5)
    {
    System.out.println("President is not eligible for re-election.");
    }
    else
    {
    this.giveSpeech();
    this.kissBabies();
    }  
}

}