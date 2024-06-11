package com.literatura.literatura.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.literatura.literatura.client.ClienteAPI;
import com.literatura.literatura.model.Libro;
import com.literatura.literatura.model.LibroResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class ConsumoAPI {

    private final ClienteAPI clienteAPI;

    @Autowired
    public ConsumoAPI(ClienteAPI clienteAPI) {
        this.clienteAPI = clienteAPI;
    }

    public List<Libro> obtenerDatosProcesados() {
        try {
            String json = clienteAPI.getDatosAPI();
            ObjectMapper mapper = new ObjectMapper();
            LibroResponse response = mapper.readValue(json, LibroResponse.class);
            return response.getResults();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
