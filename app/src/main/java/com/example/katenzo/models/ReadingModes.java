package com.example.katenzo.models;


import com.google.gson.annotations.Expose;


public class ReadingModes {

    @Expose
    private Boolean text;
    @Expose
    private Boolean image;

    /**
     *
     * @return
     * The text
     */
    public Boolean getText() {
        return text;
    }

    /**
     *
     * @param text
     * The text
     */
    public void setText(Boolean text) {
        this.text = text;
    }

    /**
     *
     * @return
     * The image
     */
    public Boolean getImage() {
        return image;
    }

    /**
     *
     * @param image
     * The image
     */
    public void setImage(Boolean image) {
        this.image = image;
    }

}