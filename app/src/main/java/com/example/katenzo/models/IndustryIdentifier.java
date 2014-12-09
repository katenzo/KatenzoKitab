package com.example.katenzo.models;


import com.google.gson.annotations.Expose;


public class IndustryIdentifier {

    @Expose
    private String type;
    @Expose
    private String identifier;

    /**
     *
     * @return
     * The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The identifier
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     *
     * @param identifier
     * The identifier
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

}