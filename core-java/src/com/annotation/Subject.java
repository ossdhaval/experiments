package com.annotation;

public class Subject {

    public void setJansPropertyX(String jansPropertyX) {
        this.jansPropertyX = jansPropertyX;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @JansConfigProperty(optionalType = "Mandatory", description = "This is PropertyX description")
    public String jansPropertyX;

    @JansConfigProperty(optionalType = "Optional", description = "This is weight description")
    public Integer weight;


    public Integer add()
    {
        return 2+1;
    }
}
