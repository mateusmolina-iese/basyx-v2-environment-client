package com.github.mateusmolina.basyx.aasenvironment.client.api;

import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiClient;

import com.github.mateusmolina.basyx.aasenvironment.client.model.OperationRequest;
import com.github.mateusmolina.basyx.aasenvironment.client.model.Result;
import com.github.mateusmolina.basyx.aasenvironment.client.model.Submodel;
import com.github.mateusmolina.basyx.aasenvironment.client.model.SubmodelElement;

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
public class SubmodelRepositoryApiApi {
    private ApiClient apiClient;

    public SubmodelRepositoryApiApi() {
        this(new ApiClient());
    }

    public SubmodelRepositoryApiApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Deletes a Submodel
     * 
     * <p><b>204</b> - Submodel deleted successfully
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * <p><b>200</b> - Default error handling for unmentioned status codes
     * <p><b>403</b> - Forbidden
     * <p><b>400</b> - Bad Request, e.g. the request parameters of the format of the request body is wrong.
     * <p><b>401</b> - Unauthorized, e.g. the server refused the authorization attempt.
     * @param submodelIdentifier The Submodel’s unique id (UTF8-BASE64-URL-encoded) (required)
     * @return Result
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Result deleteSubmodelById(String submodelIdentifier) throws RestClientException {
        return deleteSubmodelByIdWithHttpInfo(submodelIdentifier).getBody();
    }

    /**
     * Deletes a Submodel
     * 
     * <p><b>204</b> - Submodel deleted successfully
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * <p><b>200</b> - Default error handling for unmentioned status codes
     * <p><b>403</b> - Forbidden
     * <p><b>400</b> - Bad Request, e.g. the request parameters of the format of the request body is wrong.
     * <p><b>401</b> - Unauthorized, e.g. the server refused the authorization attempt.
     * @param submodelIdentifier The Submodel’s unique id (UTF8-BASE64-URL-encoded) (required)
     * @return ResponseEntity&lt;Result&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Result> deleteSubmodelByIdWithHttpInfo(String submodelIdentifier) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'submodelIdentifier' is set
        if (submodelIdentifier == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'submodelIdentifier' when calling deleteSubmodelById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("submodelIdentifier", submodelIdentifier);

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
        return apiClient.invokeAPI("/submodels/{submodelIdentifier}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Deletes a submodel element at a specified path within the submodel elements hierarchy
     * 
     * <p><b>204</b> - Submodel element deleted successfully
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * <p><b>200</b> - Default error handling for unmentioned status codes
     * <p><b>403</b> - Forbidden
     * <p><b>400</b> - Bad Request, e.g. the request parameters of the format of the request body is wrong.
     * <p><b>401</b> - Unauthorized, e.g. the server refused the authorization attempt.
     * @param submodelIdentifier The Submodel’s unique id (UTF8-BASE64-URL-encoded) (required)
     * @param idShortPath IdShort path to the submodel element (dot-separated) (required)
     * @return Result
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Result deleteSubmodelElementByPathSubmodelRepo(String submodelIdentifier, String idShortPath) throws RestClientException {
        return deleteSubmodelElementByPathSubmodelRepoWithHttpInfo(submodelIdentifier, idShortPath).getBody();
    }

    /**
     * Deletes a submodel element at a specified path within the submodel elements hierarchy
     * 
     * <p><b>204</b> - Submodel element deleted successfully
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * <p><b>200</b> - Default error handling for unmentioned status codes
     * <p><b>403</b> - Forbidden
     * <p><b>400</b> - Bad Request, e.g. the request parameters of the format of the request body is wrong.
     * <p><b>401</b> - Unauthorized, e.g. the server refused the authorization attempt.
     * @param submodelIdentifier The Submodel’s unique id (UTF8-BASE64-URL-encoded) (required)
     * @param idShortPath IdShort path to the submodel element (dot-separated) (required)
     * @return ResponseEntity&lt;Result&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Result> deleteSubmodelElementByPathSubmodelRepoWithHttpInfo(String submodelIdentifier, String idShortPath) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'submodelIdentifier' is set
        if (submodelIdentifier == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'submodelIdentifier' when calling deleteSubmodelElementByPathSubmodelRepo");
        }
        
        // verify the required parameter 'idShortPath' is set
        if (idShortPath == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'idShortPath' when calling deleteSubmodelElementByPathSubmodelRepo");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("submodelIdentifier", submodelIdentifier);
        uriVariables.put("idShortPath", idShortPath);

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
        return apiClient.invokeAPI("/submodels/{submodelIdentifier}/submodel-elements/{idShortPath}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Returns all submodel elements including their hierarchy
     * 
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * <p><b>200</b> - List of found submodel elements
     * <p><b>403</b> - Forbidden
     * <p><b>400</b> - Bad Request, e.g. the request parameters of the format of the request body is wrong.
     * <p><b>401</b> - Unauthorized, e.g. the server refused the authorization attempt.
     * @param submodelIdentifier The Submodel’s unique id (UTF8-BASE64-URL-encoded) (required)
     * @param limit The maximum number of elements in the response array (optional)
     * @param cursor A server-generated identifier retrieved from pagingMetadata that specifies from which position the result listing should continue (optional)
     * @param level Determines the structural depth of the respective resource content (optional, default to deep)
     * @param extent Determines to which extent the resource is being serialized (optional, default to withoutBlobValue)
     * @return String
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public String getAllSubmodelElements(String submodelIdentifier, String limit, String cursor, String level, String extent) throws RestClientException {
        return getAllSubmodelElementsWithHttpInfo(submodelIdentifier, limit, cursor, level, extent).getBody();
    }

    /**
     * Returns all submodel elements including their hierarchy
     * 
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * <p><b>200</b> - List of found submodel elements
     * <p><b>403</b> - Forbidden
     * <p><b>400</b> - Bad Request, e.g. the request parameters of the format of the request body is wrong.
     * <p><b>401</b> - Unauthorized, e.g. the server refused the authorization attempt.
     * @param submodelIdentifier The Submodel’s unique id (UTF8-BASE64-URL-encoded) (required)
     * @param limit The maximum number of elements in the response array (optional)
     * @param cursor A server-generated identifier retrieved from pagingMetadata that specifies from which position the result listing should continue (optional)
     * @param level Determines the structural depth of the respective resource content (optional, default to deep)
     * @param extent Determines to which extent the resource is being serialized (optional, default to withoutBlobValue)
     * @return ResponseEntity&lt;String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<String> getAllSubmodelElementsWithHttpInfo(String submodelIdentifier, String limit, String cursor, String level, String extent) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'submodelIdentifier' is set
        if (submodelIdentifier == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'submodelIdentifier' when calling getAllSubmodelElements");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("submodelIdentifier", submodelIdentifier);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "cursor", cursor));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "level", level));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "extent", extent));


        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<String> localReturnType = new ParameterizedTypeReference<String>() {};
        return apiClient.invokeAPI("/submodels/{submodelIdentifier}/submodel-elements", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Returns all Submodels
     * 
     * <p><b>200</b> - Default error handling for unmentioned status codes
     * <p><b>500</b> - Internal Server Error
     * <p><b>403</b> - Forbidden
     * <p><b>400</b> - Bad Request, e.g. the request parameters of the format of the request body is wrong.
     * <p><b>401</b> - Unauthorized, e.g. the server refused the authorization attempt.
     * @param semanticId The value of the semantic id reference (UTF8-BASE64-URL-encoded) (optional)
     * @param idShort The Asset Administration Shell’s IdShort (optional)
     * @param limit The maximum number of elements in the response array (optional)
     * @param cursor A server-generated identifier retrieved from pagingMetadata that specifies from which position the result listing should continue (optional)
     * @param level Determines the structural depth of the respective resource content (optional, default to deep)
     * @param extent Determines to which extent the resource is being serialized (optional, default to withoutBlobValue)
     * @return Result
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Result getAllSubmodels(String semanticId, String idShort, String limit, String cursor, String level, String extent) throws RestClientException {
        return getAllSubmodelsWithHttpInfo(semanticId, idShort, limit, cursor, level, extent).getBody();
    }

    /**
     * Returns all Submodels
     * 
     * <p><b>200</b> - Default error handling for unmentioned status codes
     * <p><b>500</b> - Internal Server Error
     * <p><b>403</b> - Forbidden
     * <p><b>400</b> - Bad Request, e.g. the request parameters of the format of the request body is wrong.
     * <p><b>401</b> - Unauthorized, e.g. the server refused the authorization attempt.
     * @param semanticId The value of the semantic id reference (UTF8-BASE64-URL-encoded) (optional)
     * @param idShort The Asset Administration Shell’s IdShort (optional)
     * @param limit The maximum number of elements in the response array (optional)
     * @param cursor A server-generated identifier retrieved from pagingMetadata that specifies from which position the result listing should continue (optional)
     * @param level Determines the structural depth of the respective resource content (optional, default to deep)
     * @param extent Determines to which extent the resource is being serialized (optional, default to withoutBlobValue)
     * @return ResponseEntity&lt;Result&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Result> getAllSubmodelsWithHttpInfo(String semanticId, String idShort, String limit, String cursor, String level, String extent) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "semanticId", semanticId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "idShort", idShort));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "cursor", cursor));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "level", level));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "extent", extent));


        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Result> localReturnType = new ParameterizedTypeReference<Result>() {};
        return apiClient.invokeAPI("/submodels", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Returns a specific Submodel
     * 
     * <p><b>200</b> - Default error handling for unmentioned status codes
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * <p><b>403</b> - Forbidden
     * <p><b>400</b> - Bad Request, e.g. the request parameters of the format of the request body is wrong.
     * <p><b>401</b> - Unauthorized, e.g. the server refused the authorization attempt.
     * @param submodelIdentifier The Submodel’s unique id (UTF8-BASE64-URL-encoded) (required)
     * @param level Determines the structural depth of the respective resource content (optional, default to deep)
     * @param extent Determines to which extent the resource is being serialized (optional, default to withoutBlobValue)
     * @return Result
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Result getSubmodelById(String submodelIdentifier, String level, String extent) throws RestClientException {
        return getSubmodelByIdWithHttpInfo(submodelIdentifier, level, extent).getBody();
    }

    /**
     * Returns a specific Submodel
     * 
     * <p><b>200</b> - Default error handling for unmentioned status codes
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * <p><b>403</b> - Forbidden
     * <p><b>400</b> - Bad Request, e.g. the request parameters of the format of the request body is wrong.
     * <p><b>401</b> - Unauthorized, e.g. the server refused the authorization attempt.
     * @param submodelIdentifier The Submodel’s unique id (UTF8-BASE64-URL-encoded) (required)
     * @param level Determines the structural depth of the respective resource content (optional, default to deep)
     * @param extent Determines to which extent the resource is being serialized (optional, default to withoutBlobValue)
     * @return ResponseEntity&lt;Result&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Result> getSubmodelByIdWithHttpInfo(String submodelIdentifier, String level, String extent) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'submodelIdentifier' is set
        if (submodelIdentifier == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'submodelIdentifier' when calling getSubmodelById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("submodelIdentifier", submodelIdentifier);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "level", level));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "extent", extent));


        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Result> localReturnType = new ParameterizedTypeReference<Result>() {};
        return apiClient.invokeAPI("/submodels/{submodelIdentifier}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Returns the metadata attributes of a specific Submodel
     * 
     * <p><b>200</b> - Default error handling for unmentioned status codes
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * <p><b>403</b> - Forbidden
     * <p><b>400</b> - Bad Request, e.g. the request parameters of the format of the request body is wrong.
     * <p><b>401</b> - Unauthorized, e.g. the server refused the authorization attempt.
     * @param submodelIdentifier The Submodel’s unique id (UTF8-BASE64-URL-encoded) (required)
     * @param level Determines the structural depth of the respective resource content (optional, default to deep)
     * @return Result
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Result getSubmodelByIdMetadata(String submodelIdentifier, String level) throws RestClientException {
        return getSubmodelByIdMetadataWithHttpInfo(submodelIdentifier, level).getBody();
    }

    /**
     * Returns the metadata attributes of a specific Submodel
     * 
     * <p><b>200</b> - Default error handling for unmentioned status codes
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * <p><b>403</b> - Forbidden
     * <p><b>400</b> - Bad Request, e.g. the request parameters of the format of the request body is wrong.
     * <p><b>401</b> - Unauthorized, e.g. the server refused the authorization attempt.
     * @param submodelIdentifier The Submodel’s unique id (UTF8-BASE64-URL-encoded) (required)
     * @param level Determines the structural depth of the respective resource content (optional, default to deep)
     * @return ResponseEntity&lt;Result&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Result> getSubmodelByIdMetadataWithHttpInfo(String submodelIdentifier, String level) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'submodelIdentifier' is set
        if (submodelIdentifier == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'submodelIdentifier' when calling getSubmodelByIdMetadata");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("submodelIdentifier", submodelIdentifier);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "level", level));


        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Result> localReturnType = new ParameterizedTypeReference<Result>() {};
        return apiClient.invokeAPI("/submodels/{submodelIdentifier}/$metadata", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Returns a specific Submodel in the ValueOnly representation
     * 
     * <p><b>200</b> - Default error handling for unmentioned status codes
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * <p><b>403</b> - Forbidden
     * <p><b>400</b> - Bad Request, e.g. the request parameters of the format of the request body is wrong.
     * <p><b>401</b> - Unauthorized, e.g. the server refused the authorization attempt.
     * @param submodelIdentifier The Submodel’s unique id (UTF8-BASE64-URL-encoded) (required)
     * @param level Determines the structural depth of the respective resource content (optional, default to deep)
     * @param extent Determines to which extent the resource is being serialized (optional, default to withoutBlobValue)
     * @return Result
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Result getSubmodelByIdValueOnly(String submodelIdentifier, String level, String extent) throws RestClientException {
        return getSubmodelByIdValueOnlyWithHttpInfo(submodelIdentifier, level, extent).getBody();
    }

    /**
     * Returns a specific Submodel in the ValueOnly representation
     * 
     * <p><b>200</b> - Default error handling for unmentioned status codes
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * <p><b>403</b> - Forbidden
     * <p><b>400</b> - Bad Request, e.g. the request parameters of the format of the request body is wrong.
     * <p><b>401</b> - Unauthorized, e.g. the server refused the authorization attempt.
     * @param submodelIdentifier The Submodel’s unique id (UTF8-BASE64-URL-encoded) (required)
     * @param level Determines the structural depth of the respective resource content (optional, default to deep)
     * @param extent Determines to which extent the resource is being serialized (optional, default to withoutBlobValue)
     * @return ResponseEntity&lt;Result&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Result> getSubmodelByIdValueOnlyWithHttpInfo(String submodelIdentifier, String level, String extent) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'submodelIdentifier' is set
        if (submodelIdentifier == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'submodelIdentifier' when calling getSubmodelByIdValueOnly");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("submodelIdentifier", submodelIdentifier);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "level", level));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "extent", extent));


        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Result> localReturnType = new ParameterizedTypeReference<Result>() {};
        return apiClient.invokeAPI("/submodels/{submodelIdentifier}/$value", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Returns a specific submodel element from the Submodel at a specified path
     * 
     * <p><b>200</b> - Default error handling for unmentioned status codes
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * <p><b>403</b> - Forbidden
     * <p><b>400</b> - Bad Request, e.g. the request parameters of the format of the request body is wrong.
     * <p><b>401</b> - Unauthorized, e.g. the server refused the authorization attempt.
     * @param submodelIdentifier The Submodel’s unique id (UTF8-BASE64-URL-encoded) (required)
     * @param idShortPath IdShort path to the submodel element (dot-separated) (required)
     * @param level Determines the structural depth of the respective resource content (optional, default to deep)
     * @param extent Determines to which extent the resource is being serialized (optional, default to withoutBlobValue)
     * @return Result
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Result getSubmodelElementByPathSubmodelRepo(String submodelIdentifier, String idShortPath, String level, String extent) throws RestClientException {
        return getSubmodelElementByPathSubmodelRepoWithHttpInfo(submodelIdentifier, idShortPath, level, extent).getBody();
    }

    /**
     * Returns a specific submodel element from the Submodel at a specified path
     * 
     * <p><b>200</b> - Default error handling for unmentioned status codes
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * <p><b>403</b> - Forbidden
     * <p><b>400</b> - Bad Request, e.g. the request parameters of the format of the request body is wrong.
     * <p><b>401</b> - Unauthorized, e.g. the server refused the authorization attempt.
     * @param submodelIdentifier The Submodel’s unique id (UTF8-BASE64-URL-encoded) (required)
     * @param idShortPath IdShort path to the submodel element (dot-separated) (required)
     * @param level Determines the structural depth of the respective resource content (optional, default to deep)
     * @param extent Determines to which extent the resource is being serialized (optional, default to withoutBlobValue)
     * @return ResponseEntity&lt;Result&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Result> getSubmodelElementByPathSubmodelRepoWithHttpInfo(String submodelIdentifier, String idShortPath, String level, String extent) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'submodelIdentifier' is set
        if (submodelIdentifier == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'submodelIdentifier' when calling getSubmodelElementByPathSubmodelRepo");
        }
        
        // verify the required parameter 'idShortPath' is set
        if (idShortPath == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'idShortPath' when calling getSubmodelElementByPathSubmodelRepo");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("submodelIdentifier", submodelIdentifier);
        uriVariables.put("idShortPath", idShortPath);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "level", level));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "extent", extent));


        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Result> localReturnType = new ParameterizedTypeReference<Result>() {};
        return apiClient.invokeAPI("/submodels/{submodelIdentifier}/submodel-elements/{idShortPath}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Returns a specific submodel element from the Submodel at a specified path in the ValueOnly representation
     * 
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * <p><b>200</b> - Requested submodel element
     * <p><b>403</b> - Forbidden
     * <p><b>400</b> - Bad Request, e.g. the request parameters of the format of the request body is wrong.
     * <p><b>401</b> - Unauthorized, e.g. the server refused the authorization attempt.
     * @param submodelIdentifier The Submodel’s unique id (UTF8-BASE64-URL-encoded) (required)
     * @param idShortPath IdShort path to the submodel element (dot-separated) (required)
     * @param level Determines the structural depth of the respective resource content (optional, default to deep)
     * @param extent Determines to which extent the resource is being serialized (optional, default to withoutBlobValue)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object getSubmodelElementByPathValueOnlySubmodelRepo(String submodelIdentifier, String idShortPath, String level, String extent) throws RestClientException {
        return getSubmodelElementByPathValueOnlySubmodelRepoWithHttpInfo(submodelIdentifier, idShortPath, level, extent).getBody();
    }

    /**
     * Returns a specific submodel element from the Submodel at a specified path in the ValueOnly representation
     * 
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * <p><b>200</b> - Requested submodel element
     * <p><b>403</b> - Forbidden
     * <p><b>400</b> - Bad Request, e.g. the request parameters of the format of the request body is wrong.
     * <p><b>401</b> - Unauthorized, e.g. the server refused the authorization attempt.
     * @param submodelIdentifier The Submodel’s unique id (UTF8-BASE64-URL-encoded) (required)
     * @param idShortPath IdShort path to the submodel element (dot-separated) (required)
     * @param level Determines the structural depth of the respective resource content (optional, default to deep)
     * @param extent Determines to which extent the resource is being serialized (optional, default to withoutBlobValue)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> getSubmodelElementByPathValueOnlySubmodelRepoWithHttpInfo(String submodelIdentifier, String idShortPath, String level, String extent) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'submodelIdentifier' is set
        if (submodelIdentifier == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'submodelIdentifier' when calling getSubmodelElementByPathValueOnlySubmodelRepo");
        }
        
        // verify the required parameter 'idShortPath' is set
        if (idShortPath == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'idShortPath' when calling getSubmodelElementByPathValueOnlySubmodelRepo");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("submodelIdentifier", submodelIdentifier);
        uriVariables.put("idShortPath", idShortPath);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "level", level));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "extent", extent));


        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/submodels/{submodelIdentifier}/submodel-elements/{idShortPath}/$value", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Synchronously or asynchronously invokes an Operation at a specified path
     * 
     * <p><b>200</b> - Default error handling for unmentioned status codes
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * <p><b>403</b> - Forbidden
     * <p><b>400</b> - Bad Request, e.g. the request parameters of the format of the request body is wrong.
     * <p><b>405</b> - Method not allowed - Invoke only valid for Operation submodel element
     * <p><b>401</b> - Unauthorized, e.g. the server refused the authorization attempt.
     * @param submodelIdentifier The Submodel’s unique id (UTF8-BASE64-URL-encoded) (required)
     * @param idShortPath IdShort path to the submodel element (dot-separated) (required)
     * @param operationRequest  (required)
     * @param async Determines whether an operation invocation is performed asynchronously or synchronously (optional, default to false)
     * @return Result
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Result invokeOperationSubmodelRepo(String submodelIdentifier, String idShortPath, OperationRequest operationRequest, String async) throws RestClientException {
        return invokeOperationSubmodelRepoWithHttpInfo(submodelIdentifier, idShortPath, operationRequest, async).getBody();
    }

    /**
     * Synchronously or asynchronously invokes an Operation at a specified path
     * 
     * <p><b>200</b> - Default error handling for unmentioned status codes
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * <p><b>403</b> - Forbidden
     * <p><b>400</b> - Bad Request, e.g. the request parameters of the format of the request body is wrong.
     * <p><b>405</b> - Method not allowed - Invoke only valid for Operation submodel element
     * <p><b>401</b> - Unauthorized, e.g. the server refused the authorization attempt.
     * @param submodelIdentifier The Submodel’s unique id (UTF8-BASE64-URL-encoded) (required)
     * @param idShortPath IdShort path to the submodel element (dot-separated) (required)
     * @param operationRequest  (required)
     * @param async Determines whether an operation invocation is performed asynchronously or synchronously (optional, default to false)
     * @return ResponseEntity&lt;Result&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Result> invokeOperationSubmodelRepoWithHttpInfo(String submodelIdentifier, String idShortPath, OperationRequest operationRequest, String async) throws RestClientException {
        Object localVarPostBody = operationRequest;
        
        // verify the required parameter 'submodelIdentifier' is set
        if (submodelIdentifier == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'submodelIdentifier' when calling invokeOperationSubmodelRepo");
        }
        
        // verify the required parameter 'idShortPath' is set
        if (idShortPath == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'idShortPath' when calling invokeOperationSubmodelRepo");
        }
        
        // verify the required parameter 'operationRequest' is set
        if (operationRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'operationRequest' when calling invokeOperationSubmodelRepo");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("submodelIdentifier", submodelIdentifier);
        uriVariables.put("idShortPath", idShortPath);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "async", async));


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
        return apiClient.invokeAPI("/submodels/{submodelIdentifier}/submodel-elements/{idShortPath}/invoke", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Updates the value of an existing SubmodelElement
     * 
     * <p><b>204</b> - Submodel updated successfully
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * <p><b>200</b> - Default error handling for unmentioned status codes
     * <p><b>403</b> - Forbidden
     * <p><b>400</b> - Bad Request, e.g. the request parameters of the format of the request body is wrong.
     * <p><b>401</b> - Unauthorized, e.g. the server refused the authorization attempt.
     * @param submodelIdentifier The Submodel’s unique id (UTF8-BASE64-URL-encoded) (required)
     * @param idShortPath IdShort path to the submodel element (dot-separated) (required)
     * @param body  (required)
     * @param level Determines the structural depth of the respective resource content (optional, default to core)
     * @return Result
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Result patchSubmodelElementByPathValueOnlySubmodelRepo(String submodelIdentifier, String idShortPath, Object body, String level) throws RestClientException {
        return patchSubmodelElementByPathValueOnlySubmodelRepoWithHttpInfo(submodelIdentifier, idShortPath, body, level).getBody();
    }

    /**
     * Updates the value of an existing SubmodelElement
     * 
     * <p><b>204</b> - Submodel updated successfully
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * <p><b>200</b> - Default error handling for unmentioned status codes
     * <p><b>403</b> - Forbidden
     * <p><b>400</b> - Bad Request, e.g. the request parameters of the format of the request body is wrong.
     * <p><b>401</b> - Unauthorized, e.g. the server refused the authorization attempt.
     * @param submodelIdentifier The Submodel’s unique id (UTF8-BASE64-URL-encoded) (required)
     * @param idShortPath IdShort path to the submodel element (dot-separated) (required)
     * @param body  (required)
     * @param level Determines the structural depth of the respective resource content (optional, default to core)
     * @return ResponseEntity&lt;Result&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Result> patchSubmodelElementByPathValueOnlySubmodelRepoWithHttpInfo(String submodelIdentifier, String idShortPath, Object body, String level) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'submodelIdentifier' is set
        if (submodelIdentifier == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'submodelIdentifier' when calling patchSubmodelElementByPathValueOnlySubmodelRepo");
        }
        
        // verify the required parameter 'idShortPath' is set
        if (idShortPath == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'idShortPath' when calling patchSubmodelElementByPathValueOnlySubmodelRepo");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling patchSubmodelElementByPathValueOnlySubmodelRepo");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("submodelIdentifier", submodelIdentifier);
        uriVariables.put("idShortPath", idShortPath);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "level", level));


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
        return apiClient.invokeAPI("/submodels/{submodelIdentifier}/submodel-elements/{idShortPath}/$value", HttpMethod.PATCH, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Creates a new Submodel
     * 
     * <p><b>201</b> - Submodel created successfully
     * <p><b>500</b> - Internal Server Error
     * <p><b>409</b> - Conflict, a resource which shall be created exists already. Might be thrown if a Submodel or SubmodelElement with the same ShortId is contained in a POST request.
     * <p><b>200</b> - Default error handling for unmentioned status codes
     * <p><b>403</b> - Forbidden
     * <p><b>400</b> - Bad Request, e.g. the request parameters of the format of the request body is wrong.
     * <p><b>401</b> - Unauthorized, e.g. the server refused the authorization attempt.
     * @param submodel  (required)
     * @return Result
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Result postSubmodel(Submodel submodel) throws RestClientException {
        return postSubmodelWithHttpInfo(submodel).getBody();
    }

    /**
     * Creates a new Submodel
     * 
     * <p><b>201</b> - Submodel created successfully
     * <p><b>500</b> - Internal Server Error
     * <p><b>409</b> - Conflict, a resource which shall be created exists already. Might be thrown if a Submodel or SubmodelElement with the same ShortId is contained in a POST request.
     * <p><b>200</b> - Default error handling for unmentioned status codes
     * <p><b>403</b> - Forbidden
     * <p><b>400</b> - Bad Request, e.g. the request parameters of the format of the request body is wrong.
     * <p><b>401</b> - Unauthorized, e.g. the server refused the authorization attempt.
     * @param submodel  (required)
     * @return ResponseEntity&lt;Result&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Result> postSubmodelWithHttpInfo(Submodel submodel) throws RestClientException {
        Object localVarPostBody = submodel;
        
        // verify the required parameter 'submodel' is set
        if (submodel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'submodel' when calling postSubmodel");
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
        return apiClient.invokeAPI("/submodels", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Creates a new submodel element at a specified path within submodel elements hierarchy
     * 
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * <p><b>409</b> - Conflict, a resource which shall be created exists already. Might be thrown if a Submodel or SubmodelElement with the same ShortId is contained in a POST request.
     * <p><b>201</b> - Submodel element created successfully
     * <p><b>200</b> - Default error handling for unmentioned status codes
     * <p><b>403</b> - Forbidden
     * <p><b>400</b> - Bad Request, e.g. the request parameters of the format of the request body is wrong.
     * <p><b>401</b> - Unauthorized, e.g. the server refused the authorization attempt.
     * @param submodelIdentifier The Submodel’s unique id (UTF8-BASE64-URL-encoded) (required)
     * @param idShortPath IdShort path to the submodel element (dot-separated) (required)
     * @param submodelElement  (required)
     * @param level Determines the structural depth of the respective resource content (optional, default to deep)
     * @param extent Determines to which extent the resource is being serialized (optional, default to withoutBlobValue)
     * @return Result
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Result postSubmodelElementByPathSubmodelRepo(String submodelIdentifier, String idShortPath, SubmodelElement submodelElement, String level, String extent) throws RestClientException {
        return postSubmodelElementByPathSubmodelRepoWithHttpInfo(submodelIdentifier, idShortPath, submodelElement, level, extent).getBody();
    }

    /**
     * Creates a new submodel element at a specified path within submodel elements hierarchy
     * 
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * <p><b>409</b> - Conflict, a resource which shall be created exists already. Might be thrown if a Submodel or SubmodelElement with the same ShortId is contained in a POST request.
     * <p><b>201</b> - Submodel element created successfully
     * <p><b>200</b> - Default error handling for unmentioned status codes
     * <p><b>403</b> - Forbidden
     * <p><b>400</b> - Bad Request, e.g. the request parameters of the format of the request body is wrong.
     * <p><b>401</b> - Unauthorized, e.g. the server refused the authorization attempt.
     * @param submodelIdentifier The Submodel’s unique id (UTF8-BASE64-URL-encoded) (required)
     * @param idShortPath IdShort path to the submodel element (dot-separated) (required)
     * @param submodelElement  (required)
     * @param level Determines the structural depth of the respective resource content (optional, default to deep)
     * @param extent Determines to which extent the resource is being serialized (optional, default to withoutBlobValue)
     * @return ResponseEntity&lt;Result&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Result> postSubmodelElementByPathSubmodelRepoWithHttpInfo(String submodelIdentifier, String idShortPath, SubmodelElement submodelElement, String level, String extent) throws RestClientException {
        Object localVarPostBody = submodelElement;
        
        // verify the required parameter 'submodelIdentifier' is set
        if (submodelIdentifier == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'submodelIdentifier' when calling postSubmodelElementByPathSubmodelRepo");
        }
        
        // verify the required parameter 'idShortPath' is set
        if (idShortPath == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'idShortPath' when calling postSubmodelElementByPathSubmodelRepo");
        }
        
        // verify the required parameter 'submodelElement' is set
        if (submodelElement == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'submodelElement' when calling postSubmodelElementByPathSubmodelRepo");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("submodelIdentifier", submodelIdentifier);
        uriVariables.put("idShortPath", idShortPath);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "level", level));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "extent", extent));


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
        return apiClient.invokeAPI("/submodels/{submodelIdentifier}/submodel-elements/{idShortPath}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Creates a new submodel element
     * 
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * <p><b>409</b> - Conflict, a resource which shall be created exists already. Might be thrown if a Submodel or SubmodelElement with the same ShortId is contained in a POST request.
     * <p><b>201</b> - Submodel element created successfully
     * <p><b>200</b> - Default error handling for unmentioned status codes
     * <p><b>403</b> - Forbidden
     * <p><b>400</b> - Bad Request, e.g. the request parameters of the format of the request body is wrong.
     * <p><b>401</b> - Unauthorized, e.g. the server refused the authorization attempt.
     * @param submodelIdentifier The Submodel’s unique id (UTF8-BASE64-URL-encoded) (required)
     * @param submodelElement  (required)
     * @return Result
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Result postSubmodelElementSubmodelRepo(String submodelIdentifier, SubmodelElement submodelElement) throws RestClientException {
        return postSubmodelElementSubmodelRepoWithHttpInfo(submodelIdentifier, submodelElement).getBody();
    }

    /**
     * Creates a new submodel element
     * 
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * <p><b>409</b> - Conflict, a resource which shall be created exists already. Might be thrown if a Submodel or SubmodelElement with the same ShortId is contained in a POST request.
     * <p><b>201</b> - Submodel element created successfully
     * <p><b>200</b> - Default error handling for unmentioned status codes
     * <p><b>403</b> - Forbidden
     * <p><b>400</b> - Bad Request, e.g. the request parameters of the format of the request body is wrong.
     * <p><b>401</b> - Unauthorized, e.g. the server refused the authorization attempt.
     * @param submodelIdentifier The Submodel’s unique id (UTF8-BASE64-URL-encoded) (required)
     * @param submodelElement  (required)
     * @return ResponseEntity&lt;Result&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Result> postSubmodelElementSubmodelRepoWithHttpInfo(String submodelIdentifier, SubmodelElement submodelElement) throws RestClientException {
        Object localVarPostBody = submodelElement;
        
        // verify the required parameter 'submodelIdentifier' is set
        if (submodelIdentifier == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'submodelIdentifier' when calling postSubmodelElementSubmodelRepo");
        }
        
        // verify the required parameter 'submodelElement' is set
        if (submodelElement == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'submodelElement' when calling postSubmodelElementSubmodelRepo");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("submodelIdentifier", submodelIdentifier);

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
        return apiClient.invokeAPI("/submodels/{submodelIdentifier}/submodel-elements", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Updates an existing Submodel
     * 
     * <p><b>204</b> - Submodel updated successfully
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * <p><b>200</b> - Default error handling for unmentioned status codes
     * <p><b>403</b> - Forbidden
     * <p><b>400</b> - Bad Request, e.g. the request parameters of the format of the request body is wrong.
     * <p><b>401</b> - Unauthorized, e.g. the server refused the authorization attempt.
     * @param submodelIdentifier The Submodel’s unique id (UTF8-BASE64-URL-encoded) (required)
     * @param submodel  (required)
     * @param level Determines the structural depth of the respective resource content (optional, default to deep)
     * @return Result
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Result putSubmodelById(String submodelIdentifier, Submodel submodel, String level) throws RestClientException {
        return putSubmodelByIdWithHttpInfo(submodelIdentifier, submodel, level).getBody();
    }

    /**
     * Updates an existing Submodel
     * 
     * <p><b>204</b> - Submodel updated successfully
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * <p><b>200</b> - Default error handling for unmentioned status codes
     * <p><b>403</b> - Forbidden
     * <p><b>400</b> - Bad Request, e.g. the request parameters of the format of the request body is wrong.
     * <p><b>401</b> - Unauthorized, e.g. the server refused the authorization attempt.
     * @param submodelIdentifier The Submodel’s unique id (UTF8-BASE64-URL-encoded) (required)
     * @param submodel  (required)
     * @param level Determines the structural depth of the respective resource content (optional, default to deep)
     * @return ResponseEntity&lt;Result&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Result> putSubmodelByIdWithHttpInfo(String submodelIdentifier, Submodel submodel, String level) throws RestClientException {
        Object localVarPostBody = submodel;
        
        // verify the required parameter 'submodelIdentifier' is set
        if (submodelIdentifier == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'submodelIdentifier' when calling putSubmodelById");
        }
        
        // verify the required parameter 'submodel' is set
        if (submodel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'submodel' when calling putSubmodelById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("submodelIdentifier", submodelIdentifier);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "level", level));


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
        return apiClient.invokeAPI("/submodels/{submodelIdentifier}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
