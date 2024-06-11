package com.literatura.literatura.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LibroResponse {
    private List<Libro> results;

    public List<Libro> getResults() {
        return results;
    }

    public void setResults(List<Libro> results) {
        this.results = results;
    }
}
