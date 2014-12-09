package com.example.katenzo.models;

import com.google.gson.annotations.Expose;


public class SearchInfo {

    @Expose
    private String textSnippet;

    /**
     *
     * @return
     * The textSnippet
     */
    public String getTextSnippet() {
        return textSnippet;
    }

    /**
     *
     * @param textSnippet
     * The textSnippet
     */
    public void setTextSnippet(String textSnippet) {
        this.textSnippet = textSnippet;
    }

}
