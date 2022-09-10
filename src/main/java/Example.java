// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;

import org.openapitools.client.api.PetsApi;
import org.openapitools.client.model.Pet;

import java.util.List;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080/v1");

        PetsApi apiInstance = new PetsApi(defaultClient);
        try {
            apiInstance.createPets();
            List<Pet> pets = apiInstance.listPets(10);

            for (Pet pet:pets) {
                System.out.println("Pet ID: " + pet.getId() + " - Name: " + pet.getName());
            }



        } catch (ApiException e) {
            System.err.println("Exception when calling PetsApi#createPets");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}


