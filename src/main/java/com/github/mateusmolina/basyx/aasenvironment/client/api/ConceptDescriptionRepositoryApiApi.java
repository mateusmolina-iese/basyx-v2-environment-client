package com.github.mateusmolina.basyx.aasenvironment.client.api;

import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiClient;

import com.github.mateusmolina.basyx.aasenvironment.client.model.ConceptDescription;
import com.github.mateusmolina.basyx.aasenvironment.client.model.Result;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-03T12:33:09.780850700+02:00[Europe/Berlin]")
public class ConceptDescriptionRepositoryApiApi {
    private ApiClient apiClient;

    public ConceptDescriptionRepositoryApiApi() {
        this(new ApiClient());
    }

    public ConceptDescriptionRepositoryApiApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Deletes a Concept Description
     * 
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * <p><b>204</b> - Concept Description deleted successfully
     * <p><b>200</b> - Default error handling for unmentioned status codes
     * <p><b>403</b> - Forbidden
     * <p><b>400</b> - Bad Request, e.g. the request parameters of the format of the request body is wrong.
     * @param cdIdentifier The Concept Description’s unique id (UTF8-BASE64-URL-encoded) (required)
     * @return Result
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Result deleteConceptDescriptionById(String cdIdentifier) throws RestClientException {
        return deleteConceptDescriptionByIdWithHttpInfo(cdIdentifier).getBody();
    }

    /**
     * Deletes a Concept Description
     * 
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * <p><b>204</b> - Concept Description deleted successfully
     * <p><b>200</b> - Default error handling for unmentioned status codes
     * <p><b>403</b> - Forbidden
     * <p><b>400</b> - Bad Request, e.g. the request parameters of the format of the request body is wrong.
     * @param cdIdentifier The Concept Description’s unique id (UTF8-BASE64-URL-encoded) (required)
     * @return ResponseEntity&lt;Result&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Result> deleteConceptDescriptionByIdWithHttpInfo(String cdIdentifier) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'cdIdentifier' is set
        if (cdIdentifier == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cdIdentifier' when calling deleteConceptDescriptionById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("cdIdentifier", cdIdentifier);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Result> localReturnType = new ParameterizedTypeReference<Result>() {};
        return apiClient.invokeAPI("/concept-descriptions/{cdIdentifier}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Returns all Concept Descriptions
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>200</b> - Requested Concept Descriptions
     * <p><b>403</b> - Forbidden
     * <p><b>400</b> - Bad Request, e.g. the request parameters of the format of the request body is wrong.
     * @param idShort The Concept Description’s IdShort (optional)
     * @param isCaseOf IsCaseOf reference (UTF8-BASE64-URL-encoded) (optional)
     * @param dataSpecificationRef DataSpecification reference (UTF8-BASE64-URL-encoded) (optional)
     * @param limit The maximum number of elements in the response array (optional)
     * @param cursor A server-generated identifier retrieved from pagingMetadata that specifies from which position the result listing should continue (optional)
     * @return String
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public String getAllConceptDescriptions(String idShort, String isCaseOf, String dataSpecificationRef, String limit, String cursor) throws RestClientException {
        return getAllConceptDescriptionsWithHttpInfo(idShort, isCaseOf, dataSpecificationRef, limit, cursor).getBody();
    }

    /**
     * Returns all Concept Descriptions
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>200</b> - Requested Concept Descriptions
     * <p><b>403</b> - Forbidden
     * <p><b>400</b> - Bad Request, e.g. the request parameters of the format of the request body is wrong.
     * @param idShort The Concept Description’s IdShort (optional)
     * @param isCaseOf IsCaseOf reference (UTF8-BASE64-URL-encoded) (optional)
     * @param dataSpecificationRef DataSpecification reference (UTF8-BASE64-URL-encoded) (optional)
     * @param limit The maximum number of elements in the response array (optional)
     * @param cursor A server-generated identifier retrieved from pagingMetadata that specifies from which position the result listing should continue (optional)
     * @return ResponseEntity&lt;String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<String> getAllConceptDescriptionsWithHttpInfo(String idShort, String isCaseOf, String dataSpecificationRef, String limit, String cursor) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "idShort", idShort));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "isCaseOf", isCaseOf));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "dataSpecificationRef", dataSpecificationRef));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "cursor", cursor));


        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<String> localReturnType = new ParameterizedTypeReference<String>() {};
        return apiClient.invokeAPI("/concept-descriptions", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Returns a specific Concept Description
     * 
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * <p><b>200</b> - Default error handling for unmentioned status codes
     * <p><b>403</b> - Forbidden
     * <p><b>400</b> - Bad Request, e.g. the request parameters of the format of the request body is wrong.
     * @param cdIdentifier The Concept Description’s unique id (UTF8-BASE64-URL-encoded) (required)
     * @return Result
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Result getConceptDescriptionById(String cdIdentifier) throws RestClientException {
        return getConceptDescriptionByIdWithHttpInfo(cdIdentifier).getBody();
    }

    /**
     * Returns a specific Concept Description
     * 
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * <p><b>200</b> - Default error handling for unmentioned status codes
     * <p><b>403</b> - Forbidden
     * <p><b>400</b> - Bad Request, e.g. the request parameters of the format of the request body is wrong.
     * @param cdIdentifier The Concept Description’s unique id (UTF8-BASE64-URL-encoded) (required)
     * @return ResponseEntity&lt;Result&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Result> getConceptDescriptionByIdWithHttpInfo(String cdIdentifier) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'cdIdentifier' is set
        if (cdIdentifier == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cdIdentifier' when calling getConceptDescriptionById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("cdIdentifier", cdIdentifier);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Result> localReturnType = new ParameterizedTypeReference<Result>() {};
        return apiClient.invokeAPI("/concept-descriptions/{cdIdentifier}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Creates a new Concept Description
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>409</b> - Conflict, a resource which shall be created exists already. Might be thrown if a Submodel or SubmodelElement with the same ShortId is contained in a POST request.
     * <p><b>201</b> - Concept Description created successfully
     * <p><b>200</b> - Default error handling for unmentioned status codes
     * <p><b>403</b> - Forbidden
     * <p><b>400</b> - Bad Request, e.g. the request parameters of the format of the request body is wrong.
     * @param conceptDescription  (required)
     * @return Result
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Result postConceptDescription(ConceptDescription conceptDescription) throws RestClientException {
        return postConceptDescriptionWithHttpInfo(conceptDescription).getBody();
    }

    /**
     * Creates a new Concept Description
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>409</b> - Conflict, a resource which shall be created exists already. Might be thrown if a Submodel or SubmodelElement with the same ShortId is contained in a POST request.
     * <p><b>201</b> - Concept Description created successfully
     * <p><b>200</b> - Default error handling for unmentioned status codes
     * <p><b>403</b> - Forbidden
     * <p><b>400</b> - Bad Request, e.g. the request parameters of the format of the request body is wrong.
     * @param conceptDescription  (required)
     * @return ResponseEntity&lt;Result&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Result> postConceptDescriptionWithHttpInfo(ConceptDescription conceptDescription) throws RestClientException {
        Object localVarPostBody = conceptDescription;
        
        // verify the required parameter 'conceptDescription' is set
        if (conceptDescription == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'conceptDescription' when calling postConceptDescription");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Result> localReturnType = new ParameterizedTypeReference<Result>() {};
        return apiClient.invokeAPI("/concept-descriptions", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Updates an existing Concept Description
     * 
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * <p><b>200</b> - Default error handling for unmentioned status codes
     * <p><b>403</b> - Forbidden
     * <p><b>204</b> - Concept Description updated successfully
     * <p><b>400</b> - Bad Request, e.g. the request parameters of the format of the request body is wrong.
     * @param cdIdentifier The Concept Description’s unique id (UTF8-BASE64-URL-encoded) (required)
     * @param conceptDescription  (required)
     * @return Result
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Result putConceptDescriptionById(String cdIdentifier, ConceptDescription conceptDescription) throws RestClientException {
        return putConceptDescriptionByIdWithHttpInfo(cdIdentifier, conceptDescription).getBody();
    }

    /**
     * Updates an existing Concept Description
     * 
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * <p><b>200</b> - Default error handling for unmentioned status codes
     * <p><b>403</b> - Forbidden
     * <p><b>204</b> - Concept Description updated successfully
     * <p><b>400</b> - Bad Request, e.g. the request parameters of the format of the request body is wrong.
     * @param cdIdentifier The Concept Description’s unique id (UTF8-BASE64-URL-encoded) (required)
     * @param conceptDescription  (required)
     * @return ResponseEntity&lt;Result&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Result> putConceptDescriptionByIdWithHttpInfo(String cdIdentifier, ConceptDescription conceptDescription) throws RestClientException {
        Object localVarPostBody = conceptDescription;
        
        // verify the required parameter 'cdIdentifier' is set
        if (cdIdentifier == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cdIdentifier' when calling putConceptDescriptionById");
        }
        
        // verify the required parameter 'conceptDescription' is set
        if (conceptDescription == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'conceptDescription' when calling putConceptDescriptionById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("cdIdentifier", cdIdentifier);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Result> localReturnType = new ParameterizedTypeReference<Result>() {};
        return apiClient.invokeAPI("/concept-descriptions/{cdIdentifier}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
