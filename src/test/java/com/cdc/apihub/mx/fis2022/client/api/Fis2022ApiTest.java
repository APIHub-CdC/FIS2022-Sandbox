package com.cdc.apihub.mx.fis2022.client.api;

import com.cdc.apihub.mx.fis2022.client.ApiClient;
import com.cdc.apihub.mx.fis2022.client.model.RequestDatosGenerales;
import com.cdc.apihub.mx.fis2022.client.model.RequestFolios;
import com.cdc.apihub.mx.fis2022.client.model.ResponseScore;
import okhttp3.OkHttpClient;
import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Fis2022ApiTest {

    private Logger logger = LoggerFactory.getLogger(Fis2022ApiTest.class.getName());
    private final Fis2022Api api = new Fis2022Api();

    private ApiClient apiClient = null;
    private String url = "the_url"; //CHANGE IT TO VALID URL
    private String xApiKey = "your_apikey"; //CHANGE IT TO YOUR API KEY

    @Before()
    public void Setup() {
        this.apiClient = api.getApiClient();
        this.apiClient.setBasePath(url);
        OkHttpClient okHttpClient = new OkHttpClient().newBuilder().build();
        apiClient.setHttpClient(okHttpClient);
    }

    @Test
    public void devuelveelScoreFISTest() throws Exception {

        RequestDatosGenerales requestDatosGenerales = new RequestDatosGenerales();
        RequestFolios requestFolios = new RequestFolios();

        requestDatosGenerales.setPrimerNombre("NULL"); //CHANGE TO VALID DATA
        requestDatosGenerales.setApellidoPaterno("NULL"); //CHANGE TO VALID DATA
        requestDatosGenerales.setApellidoMaterno("NULL"); //CHANGE TO VALID DATA
        requestDatosGenerales.setFechaNacimiento("NULL"); //CHANGE TO VALID DATA
        requestDatosGenerales.setDireccion("NULL"); //CHANGE TO VALID DATA
        requestDatosGenerales.setColonia("NULL"); //CHANGE TO VALID DATA
        requestDatosGenerales.setCiudad("NULL"); //CHANGE TO VALID DATA
        requestDatosGenerales.setEstado("NULL"); //CHANGE TO VALID DATA
        requestDatosGenerales.setPais("NULL"); //CHANGE TO VALID DATA
        requestDatosGenerales.setDelegacionMunicipio("NULL"); //CHANGE TO VALID DATA
        requestDatosGenerales.setCp("NULL"); //CHANGE TO VALID DATA
        requestDatosGenerales.setRfc("NULL"); //CHANGE TO VALID DATA
        requestDatosGenerales.setFolioOtorgante("NULL"); //CHANGE TO VALID DATA

        requestFolios.setFolioConsulta("NULL"); //CHANGE TO VALID DATA
        requestFolios.setFolioOtorgante("NULL"); //CHANGE TO VALID DATA

        String contentType = "application/json";
        ResponseScore response = api.devuelveelScoreFIS( xApiKey, requestDatosGenerales, contentType);

        logger.info(response.toString());
    }
    
}
