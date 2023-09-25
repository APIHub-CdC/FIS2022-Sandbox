# FIS Financial Inclusion Score

FIS Financial Inclusion Score, developed by Cículo de Crédito, allows you to evaluate people without credit history. Its purpose is to promote financial inclusion by qualifying 100% of this population.

## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the dependencies, the following command must be executed:
```shell
mvn install -Dmaven.test.skip=true
```

## Getting started

#### Step 1. Get your ```x-api-key```
 Get your ```x-api-key``` Following step 1, 2 and 3 the start guide ***https://developer.circulodecredito.com.mx/guia-de-inicio*** 

#### Step 2. Change url and request data
In the ```Fis2022ApiTest.java``` file, found at ```/src/test/com/cdc/apihub/mx/fis2022/client/api/```. The request data for API consumption must be modified as shown in the following code snippet with the corresponding data:


``` java

public class EmploymentVerificationApiTest {
    ...
    private String url = "https://circulodecredito-dev.apigee.net/sandbox/v1/fis2022 ";
    private String xApiKey = "your_apikey"; //CHANGE IT TO YOUR API KEY
    ...
    ...
    @Test
    public void devuelveelScoreFISTest() throws Exception {
        ...
        RequestDatosGenerales requestDatosGenerales = new RequestDatosGenerales();
        Request body = new Request();
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
        ...
    }
    ...
```
### Step 3. Set request data

This product accepts two types of formats. You can send a request with general information about the person you are interested in or you can configure folios if you prefer.

You must configure the request information (requestDatosGenerales or requestFolios) in the second parameter of the "devuelveelScoreFIS" method as shown in the following line of code:

``` java
ResponseScore response = api.devuelveelScoreFIS( xApiKey, requestDatosGenerales, contentType);
```

### Step 4. Run the unit test

Having the previous steps, all that remains is to run the unit test, with the following command:
```shell
mvn test -Dmaven.install.skip=true
```

---
[TERMS AND CONDITIONS](https://github.com/APIHub-CdC/licencias-cdc)