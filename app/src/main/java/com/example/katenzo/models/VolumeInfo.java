package com.example.katenzo.models;

import java.util.ArrayList;
import java.util.List;

import com.example.katenzo.models.ImageLinks;
import com.example.katenzo.models.IndustryIdentifier;
import com.example.katenzo.models.ReadingModes;
import com.google.gson.annotations.Expose;


public class VolumeInfo {

    @Expose
    private String title;
    @Expose
    private List<String> authors = new ArrayList<String>();
    @Expose
    private String publisher;
    @Expose
    private List<IndustryIdentifier> industryIdentifiers = new ArrayList<IndustryIdentifier>();
    @Expose
    private ReadingModes readingModes;
    @Expose
    private String printType;
    @Expose
    private String contentVersion;
    @Expose
    private ImageLinks imageLinks;
    @Expose
    private String language;
    @Expose
    private String previewLink;
    @Expose
    private String infoLink;
    @Expose
    private String canonicalVolumeLink;

    @Expose
    private float averageRating;
    @Expose
    private Integer ratingCount;

    public float getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(float averageRating) {
        this.averageRating = averageRating;
    }

    public Integer getRatingCount() {
        return ratingCount;
    }

    public void setRatingCount(Integer ratingCount) {
        this.averageRating = ratingCount;
    }

    /**
     *
     * @return
     * The title
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     * The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     * The authors
     */
    public List<String> getAuthors() {
        return authors;
    }

    /**
     *
     * @param authors
     * The authors
     */
    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    /**
     *
     * @return
     * The publisher
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     *
     * @param publisher
     * The publisher
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     *
     * @return
     * The industryIdentifiers
     */
    public List<IndustryIdentifier> getIndustryIdentifiers() {
        return industryIdentifiers;
    }

    /**
     *
     * @param industryIdentifiers
     * The industryIdentifiers
     */
    public void setIndustryIdentifiers(List<IndustryIdentifier> industryIdentifiers) {
        this.industryIdentifiers = industryIdentifiers;
    }

    /**
     *
     * @return
     * The readingModes
     */
    public ReadingModes getReadingModes() {
        return readingModes;
    }

    /**
     *
     * @param readingModes
     * The readingModes
     */
    public void setReadingModes(ReadingModes readingModes) {
        this.readingModes = readingModes;
    }

    /**
     *
     * @return
     * The printType
     */
    public String getPrintType() {
        return printType;
    }

    /**
     *
     * @param printType
     * The printType
     */
    public void setPrintType(String printType) {
        this.printType = printType;
    }

    /**
     *
     * @return
     * The contentVersion
     */
    public String getContentVersion() {
        return contentVersion;
    }

    /**
     *
     * @param contentVersion
     * The contentVersion
     */
    public void setContentVersion(String contentVersion) {
        this.contentVersion = contentVersion;
    }

    /**
     *
     * @return
     * The imageLinks
     */
    public ImageLinks getImageLinks() {
        return imageLinks;
    }

    /**
     *
     * @param imageLinks
     * The imageLinks
     */
    public void setImageLinks(ImageLinks imageLinks) {
        this.imageLinks = imageLinks;
    }

    /**
     *
     * @return
     * The language
     */
    public String getLanguage() {
        return language;
    }

    /**
     *
     * @param language
     * The language
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     *
     * @return
     * The previewLink
     */
    public String getPreviewLink() {
        return previewLink;
    }

    /**
     *
     * @param previewLink
     * The previewLink
     */
    public void setPreviewLink(String previewLink) {
        this.previewLink = previewLink;
    }

    /**
     *
     * @return
     * The infoLink
     */
    public String getInfoLink() {
        return infoLink;
    }

    /**
     *
     * @param infoLink
     * The infoLink
     */
    public void setInfoLink(String infoLink) {
        this.infoLink = infoLink;
    }

    /**
     *
     * @return
     * The canonicalVolumeLink
     */
    public String getCanonicalVolumeLink() {
        return canonicalVolumeLink;
    }

    /**
     *
     * @param canonicalVolumeLink
     * The canonicalVolumeLink
     */
    public void setCanonicalVolumeLink(String canonicalVolumeLink) {
        this.canonicalVolumeLink = canonicalVolumeLink;
    }

}