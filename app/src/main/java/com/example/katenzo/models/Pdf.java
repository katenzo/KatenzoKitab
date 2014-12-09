package com.example.katenzo.models;


import com.google.gson.annotations.Expose;


public class Pdf {

    @Expose
    private Boolean isAvailable;

    /**
     *
     * @return
     * The isAvailable
     */
    public Boolean getIsAvailable() {
        return isAvailable;
    }

    /**
     *
     * @param isAvailable
     * The isAvailable
     */
    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

}