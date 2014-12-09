package com.example.katenzo.models;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;


public class GoogleBooks {

    @Expose
    private String kind;
    @Expose
    private Integer totalItems;
    @Expose
    private List<Item> items = new ArrayList<Item>();




    /**
     *
     * @return
     * The kind
     */
    public String getKind() {
        return kind;
    }

    /**
     *
     * @param kind
     * The kind
     */
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     *
     * @return
     * The totalItems
     */
    public Integer getTotalItems() {
        return totalItems;
    }

    /**
     *
     * @param totalItems
     * The totalItems
     */
    public void setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
    }

    /**
     *
     * @return
     * The items
     */
    public List<Item> getItems() {
        return items;
    }

    /**
     *
     * @param items
     * The items
     */
    public void setItems(List<Item> items) {
        this.items = items;
    }

}