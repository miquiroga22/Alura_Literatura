package com.literatura.literatura.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Format {
    @JsonProperty("text/html")
    private String textHtml;

    @JsonProperty("application/octet-stream")
    private String applicationOctetStream;

    @JsonProperty("image/jpeg")
    private String imageJpeg;

    @JsonProperty("application/rdf+xml")
    private String applicationRdfXml;

    @JsonProperty("application/x-mobipocket-ebook")
    private String applicationMobipocketEbook;

    @JsonProperty("application/epub+zip")
    private String applicationEpubZip;

    @JsonProperty("text/plain; charset=us-ascii")
    private String textPlainAscii;

    // Getters y Setters
    public String getTextHtml() {
        return textHtml;
    }

    public void setTextHtml(String textHtml) {
        this.textHtml = textHtml;
    }

    public String getApplicationOctetStream() {
        return applicationOctetStream;
    }

    public void setApplicationOctetStream(String applicationOctetStream) {
        this.applicationOctetStream = applicationOctetStream;
    }

    public String getImageJpeg() {
        return imageJpeg;
    }

    public void setImageJpeg(String imageJpeg) {
        this.imageJpeg = imageJpeg;
    }

    public String getApplicationRdfXml() {
        return applicationRdfXml;
    }

    public void setApplicationRdfXml(String applicationRdfXml) {
        this.applicationRdfXml = applicationRdfXml;
    }

    public String getApplicationMobipocketEbook() {
        return applicationMobipocketEbook;
    }

    public void setApplicationMobipocketEbook(String applicationMobipocketEbook) {
        this.applicationMobipocketEbook = applicationMobipocketEbook;
    }

    public String getApplicationEpubZip() {
        return applicationEpubZip;
    }

    public void setApplicationEpubZip(String applicationEpubZip) {
        this.applicationEpubZip = applicationEpubZip;
    }

    public String getTextPlainAscii() {
        return textPlainAscii;
    }

    public void setTextPlainAscii(String textPlainAscii) {
        this.textPlainAscii = textPlainAscii;
    }
}
