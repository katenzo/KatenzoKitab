package com.example.katenzo.models;


import com.google.gson.annotations.Expose;


public class SaleInfo {

    @Expose
    private String country;
    @Expose
    private String saleability;
    @Expose
    private Boolean isEbook;

    /**
     *
     * @return
     * The country
     */
    public String getCountry() {
        return country;
    }

    /**
     *
     * @param country
     * The country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     *
     * @return
     * The saleability
     */
    public String getSaleability() {
        return saleability;
    }

    /**
     *
     * @param saleability
     * The saleability
     */
    public void setSaleability(String saleability) {
        this.saleability = saleability;
    }

    /**
     *
     * @return
     * The isEbook
     */
    public Boolean getIsEbook() {
        return isEbook;
    }

    /**
     *
     * @param isEbook
     * The isEbook
     */
    public void setIsEbook(Boolean isEbook) {
        this.isEbook = isEbook;
    }

}