package com.literatura.literatura.controller;

import com.literatura.literatura.model.Libro;
import com.literatura.literatura.service.ConsumoAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Controlador {
    private final ConsumoAPI consumoAPI;

    @Autowired
    public Controlador(ConsumoAPI consumoAPI) {
        this.consumoAPI = consumoAPI;
    }

    public void mostrarDatos() {
        List<Libro> libros = consumoAPI.obtenerDatosProcesados();
        if (libros != null) {
            for (Libro libro : libros) {
                System.out.println("ID: " + libro.getId());
                System.out.println("Título: " + libro.getTitle());
                System.out.println("Autores: ");
                libro.getAuthors().forEach(author -> {
                    System.out.println("\tNombre: " + author.getName());
                    System.out.println("\tAño de nacimiento: " + author.getBirthYear());
                    System.out.println("\tAño de fallecimiento: " + author.getDeathYear());
                });
                System.out.print("Idiomas: ");
                for (String idioma : libro.getLanguages()) {
                    System.out.print(idioma + " ");
                }
                System.out.println();
                System.out.println("Descargas: " + libro.getDownloadCount());
                System.out.println("Media Type: " + libro.getMediaType());
                System.out.println("Subjects: " + libro.getSubjects());
                System.out.println("Formats: ");
                System.out.println("\ttext/html: " + libro.getFormats().getTextHtml());
                System.out.println("\tapplication/octet-stream: " + libro.getFormats().getApplicationOctetStream());
                System.out.println("\timage/jpeg: " + libro.getFormats().getImageJpeg());
                System.out.println("\tapplication/rdf+xml: " + libro.getFormats().getApplicationRdfXml());
                System.out.println("\tapplication/x-mobipocket-ebook: " + libro.getFormats().getApplicationMobipocketEbook());
                System.out.println("\tapplication/epub+zip: " + libro.getFormats().getApplicationEpubZip());
                System.out.println("\ttext/plain; charset=us-ascii: " + libro.getFormats().getTextPlainAscii());
                System.out.println("\n");
            }
        } else {
            System.out.println("No se pudieron obtener los datos.");
        }
    }
}
