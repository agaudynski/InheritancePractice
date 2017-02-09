

package Structure;

/**
 *

 */
public class Structure {
    
private int height;
private int width;
private int area;
private String material;

MessageService output = new MessageService();

// Constructors

public Structure (int height, int width, String material) {
    this.height = height;
    this.width = width;
    this.area = getArea();
    this.material = material;
}


// Getters

public int getHeight () {
    return height;
}

public int getWidth () {
    return width;
}

public int getArea () {
    return width * height;
}

public String getMaterial () {
    return material;
}

// Setters

public void setHeight(int height){
    if (height < 1) 
    {
    throw new IllegalArgumentException ("Height must be greater than 0.");
    }
    else
    {
    this.height = height;
    }
}

public void setWidth (int width) {
    if (width < 1)
    {
    throw new IllegalArgumentException ("Width must be greater than 0.");
    }
    else
    {
    this.width = width;
    }
}

public void setMaterial (String material) {
    if (material == null || material.isEmpty() == true || material.length() < 4)
    {
    throw new IllegalArgumentException ("Material can not be empty or less than 4 characters.");
    }
    else
    {
    this.material = material;
    }
}

// Methods

public void buildStructure () {
    output.outputMessage ("Work has been completed.");
}

public void remodelStructure (int height, int width) {
    this.setWidth(width);
    this.setHeight(height);
    this.buildStructure();
}

public void demolishStructure(){
    this.width = 0;
    this.height = 0;
    output.outputMessage ("Demolition is complete.");
}
    
    
}
