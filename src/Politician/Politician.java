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
public class Politician {

private String name;
private int age;
private char gender;
private String party;

MessageService output = new MessageService();

// Constructor

public Politician (String name, int age, char gender, String party){
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.party = party;
}


// Getters

public String getName(){
    return name;
}

public int getAge(){
    return age;
}

public char getGender(){
    return gender;
}

public String party(){
    return party;
}

// Setters

public void setName(String name){
    if (name == null || name.isEmpty() || name.length() <= 4)
    {
    throw new IllegalArgumentException ("Name must be greater than 4 characters.");
    }
    else
    {
    this.name = name;
    }
}

public void setAge(int age){
    if (age < 32 || age < 90)
    {
    throw new IllegalArgumentException ("Age must be between 32 and 90.");
    }
    else
    {
    this.age = age;
    }
}

public void setGender(char gender){
    if (gender != 'M' || gender != 'F')
    {
    throw new IllegalArgumentException ("Gender must me M:Male or F:Female.");
    }
    else
    {
    this.gender = gender;
    }
}

public void setParty(String party){
    if (party == null || party.isEmpty() || party.length() <= 4)
    {
    throw new IllegalArgumentException ("Pary must be greater than 4 characters.");
    }
    else
    {
    this.party = party;
    }
}

// Methods
public void giveSpeech(){
    output.outputMessage (getName() + " is giving a speech.");
}


public void kissBabies(){
    output.outputMessage (getName() + " is kissing babies.");
}


    
}
