package com.github.mateusmolina.basyx.aasenvironment.client.api;

import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiClient;

import com.github.mateusmolina.basyx.aasenvironment.client.model.AssetAdministrationShell;
import com.github.mateusmolina.basyx.aasenvironment.client.model.AssetInformation;
import com.github.mateusmolina.basyx.aasenvironment.client.model.Reference;
import com.github.mateusmolina.basyx.aasenvironment.client.model.Result;
import com.github.mateusmolina.basyx.aasenvironment.client.model.SpecificAssetID;

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
public class AssetAdministrationShellRepositoryApiApi {
    private ApiClient apiClient;

    public AssetAdministrationShellRepositoryApiApi() {
        this(new ApiClient());
    }

    public AssetAdministrationShellRepositoryApiApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Deletes an Asset Administration Shell
     * 
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * <p><b>200</b> - Default error handling for unmentioned status codes
     * <p><b>403</b> - Forbidden
     * <p><b>204</b> - Asset Administration Shell deleted successfully
     * <p><b>401</b> - Unauthorized, e.g. the server refused the authorization attempt.
     * @param aasIdentifier The Asset Administration Shell’s unique id (UTF8-BASE64-URL-encoded) (required)
     * @return Result
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Result deleteAssetAdministrationShellById(String aasIdentifier) throws RestClientException {
        return deleteAssetAdministrationShellByIdWithHttpInfo(aasIdentifier).getBody();
    }

    /**
     * Deletes an Asset Administration Shell
     * 
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * <p><b>200</b> - Default error handling for unmentioned status codes
     * <p><b>403</b> - Forbidden
     * <p><b>204</b> - Asset Administration Shell deleted successfully
     * <p><b>401</b> - Unauthorized, e.g. the server refused the authorization attempt.
     * @param aasIdentifier The Asset Administration Shell’s unique id (UTF8-BASE64-URL-encoded) (required)
     * @return ResponseEntity&lt;Result&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Result> deleteAssetAdministrationShellByIdWithHttpInfo(String aasIdentifier) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'aasIdentifier' is set
        if (aasIdentifier == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'aasIdentifier' when calling deleteAssetAdministrationShellById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("aasIdentifier", aasIdentifier);

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
        return apiClient.invokeAPI("/shells/{aasIdentifier}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Deletes the submodel reference from the Asset Administration Shell. Does not delete the submodel itself!
     * 
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * <p><b>204</b> - Submodel reference deleted successfully
     * <p><b>200</b> - Default error handling for unmentioned status codes
     * <p><b>403</b> - Forbidden
     * <p><b>400</b> - Bad Request, e.g. the request parameters of the format of the request body is wrong.
     * <p><b>401</b> - Unauthorized, e.g. the server refused the authorization attempt.
     * @param aasIdentifier The Asset Administration Shell’s unique id (UTF8-BASE64-URL-encoded) (required)
     * @param submodelIdentifier The Submodel’s unique id (UTF8-BASE64-URL-encoded) (required)
     * @return Result
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Result deleteSubmodelReferenceByIdAasRepository(String aasIdentifier, String submodelIdentifier) throws RestClientException {
        return deleteSubmodelReferenceByIdAasRepositoryWithHttpInfo(aasIdentifier, submodelIdentifier).getBody();
    }

    /**
     * Deletes the submodel reference from the Asset Administration Shell. Does not delete the submodel itself!
     * 
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * <p><b>204</b> - Submodel reference deleted successfully
     * <p><b>200</b> - Default error handling for unmentioned status codes
     * <p><b>403</b> - Forbidden
     * <p><b>400</b> - Bad Request, e.g. the request parameters of the format of the request body is wrong.
     * <p><b>401</b> - Unauthorized, e.g. the server refused the authorization attempt.
     * @param aasIdentifier The Asset Administration Shell’s unique id (UTF8-BASE64-URL-encoded) (required)
     * @param submodelIdentifier The Submodel’s unique id (UTF8-BASE64-URL-encoded) (required)
     * @return ResponseEntity&lt;Result&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Result> deleteSubmodelReferenceByIdAasRepositoryWithHttpInfo(String aasIdentifier, String submodelIdentifier) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'aasIdentifier' is set
        if (aasIdentifier == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'aasIdentifier' when calling deleteSubmodelReferenceByIdAasRepository");
        }
        
        // verify the required parameter 'submodelIdentifier' is set
        if (submodelIdentifier == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'submodelIdentifier' when calling deleteSubmodelReferenceByIdAasRepository");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("aasIdentifier", aasIdentifier);
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
        return apiClient.invokeAPI("/shells/{aasIdentifier}/submodel-refs/{submodelIdentifier}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Returns all Asset Administration Shells
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>200</b> - Requested Asset Administration Shells
     * <p><b>403</b> - Forbidden
     * <p><b>400</b> - Bad Request, e.g. the request parameters of the format of the request body is wrong.
     * <p><b>401</b> - Unauthorized, e.g. the server refused the authorization attempt.
     * @param assetIds A list of specific Asset identifiers (optional)
     * @param idShort The Asset Administration Shell’s IdShort (optional)
     * @param limit The maximum number of elements in the response array (optional)
     * @param cursor A server-generated identifier retrieved from pagingMetadata that specifies from which position the result listing should continue (optional)
     * @return String
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public String getAllAssetAdministrationShells(List<SpecificAssetID> assetIds, String idShort, String limit, String cursor) throws RestClientException {
        return getAllAssetAdministrationShellsWithHttpInfo(assetIds, idShort, limit, cursor).getBody();
    }

    /**
     * Returns all Asset Administration Shells
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>200</b> - Requested Asset Administration Shells
     * <p><b>403</b> - Forbidden
     * <p><b>400</b> - Bad Request, e.g. the request parameters of the format of the request body is wrong.
     * <p><b>401</b> - Unauthorized, e.g. the server refused the authorization attempt.
     * @param assetIds A list of specific Asset identifiers (optional)
     * @param idShort The Asset Administration Shell’s IdShort (optional)
     * @param limit The maximum number of elements in the response array (optional)
     * @param cursor A server-generated identifier retrieved from pagingMetadata that specifies from which position the result listing should continue (optional)
     * @return ResponseEntity&lt;String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<String> getAllAssetAdministrationShellsWithHttpInfo(List<SpecificAssetID> assetIds, String idShort, String limit, String cursor) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "assetIds", assetIds));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "idShort", idShort));
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
        return apiClient.invokeAPI("/shells", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Returns all submodel references
     * 
     * <p><b>200</b> - Default error handling for unmentioned status codes
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * <p><b>403</b> - Forbidden
     * <p><b>400</b> - Bad Request, e.g. the request parameters of the format of the request body is wrong.
     * <p><b>401</b> - Unauthorized, e.g. the server refused the authorization attempt.
     * @param aasIdentifier The Asset Administration Shell’s unique id (UTF8-BASE64-URL-encoded) (required)
     * @param limit The maximum number of elements in the response array (optional)
     * @param cursor A server-generated identifier retrieved from pagingMetadata that specifies from which position the result listing should continue (optional)
     * @return Result
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Result getAllSubmodelReferencesAasRepository(String aasIdentifier, String limit, String cursor) throws RestClientException {
        return getAllSubmodelReferencesAasRepositoryWithHttpInfo(aasIdentifier, limit, cursor).getBody();
    }

    /**
     * Returns all submodel references
     * 
     * <p><b>200</b> - Default error handling for unmentioned status codes
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * <p><b>403</b> - Forbidden
     * <p><b>400</b> - Bad Request, e.g. the request parameters of the format of the request body is wrong.
     * <p><b>401</b> - Unauthorized, e.g. the server refused the authorization attempt.
     * @param aasIdentifier The Asset Administration Shell’s unique id (UTF8-BASE64-URL-encoded) (required)
     * @param limit The maximum number of elements in the response array (optional)
     * @param cursor A server-generated identifier retrieved from pagingMetadata that specifies from which position the result listing should continue (optional)
     * @return ResponseEntity&lt;Result&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Result> getAllSubmodelReferencesAasRepositoryWithHttpInfo(String aasIdentifier, String limit, String cursor) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'aasIdentifier' is set
        if (aasIdentifier == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'aasIdentifier' when calling getAllSubmodelReferencesAasRepository");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("aasIdentifier", aasIdentifier);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "cursor", cursor));


        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Result> localReturnType = new ParameterizedTypeReference<Result>() {};
        return apiClient.invokeAPI("/shells/{aasIdentifier}/submodel-refs", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Returns a specific Asset Administration Shell
     * 
     * <p><b>200</b> - Default error handling for unmentioned status codes
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * <p><b>403</b> - Forbidden
     * <p><b>400</b> - Bad Request, e.g. the request parameters of the format of the request body is wrong.
     * <p><b>401</b> - Unauthorized, e.g. the server refused the authorization attempt.
     * @param aasIdentifier The Asset Administration Shell’s unique id (UTF8-BASE64-URL-encoded) (required)
     * @return Result
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Result getAssetAdministrationShellById(String aasIdentifier) throws RestClientException {
        return getAssetAdministrationShellByIdWithHttpInfo(aasIdentifier).getBody();
    }

    /**
     * Returns a specific Asset Administration Shell
     * 
     * <p><b>200</b> - Default error handling for unmentioned status codes
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * <p><b>403</b> - Forbidden
     * <p><b>400</b> - Bad Request, e.g. the request parameters of the format of the request body is wrong.
     * <p><b>401</b> - Unauthorized, e.g. the server refused the authorization attempt.
     * @param aasIdentifier The Asset Administration Shell’s unique id (UTF8-BASE64-URL-encoded) (required)
     * @return ResponseEntity&lt;Result&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Result> getAssetAdministrationShellByIdWithHttpInfo(String aasIdentifier) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'aasIdentifier' is set
        if (aasIdentifier == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'aasIdentifier' when calling getAssetAdministrationShellById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("aasIdentifier", aasIdentifier);

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
        return apiClient.invokeAPI("/shells/{aasIdentifier}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Returns the Asset Information
     * 
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * <p><b>200</b> - Requested Asset Information
     * <p><b>403</b> - Forbidden
     * <p><b>400</b> - Bad Request, e.g. the request parameters of the format of the request body is wrong.
     * <p><b>401</b> - Unauthorized, e.g. the server refused the authorization attempt.
     * @param aasIdentifier The Asset Administration Shell’s unique id (UTF8-BASE64-URL-encoded) (required)
     * @return AssetInformation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AssetInformation getAssetInformationAasRepository(String aasIdentifier) throws RestClientException {
        return getAssetInformationAasRepositoryWithHttpInfo(aasIdentifier).getBody();
    }

    /**
     * Returns the Asset Information
     * 
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * <p><b>200</b> - Requested Asset Information
     * <p><b>403</b> - Forbidden
     * <p><b>400</b> - Bad Request, e.g. the request parameters of the format of the request body is wrong.
     * <p><b>401</b> - Unauthorized, e.g. the server refused the authorization attempt.
     * @param aasIdentifier The Asset Administration Shell’s unique id (UTF8-BASE64-URL-encoded) (required)
     * @return ResponseEntity&lt;AssetInformation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AssetInformation> getAssetInformationAasRepositoryWithHttpInfo(String aasIdentifier) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'aasIdentifier' is set
        if (aasIdentifier == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'aasIdentifier' when calling getAssetInformationAasRepository");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("aasIdentifier", aasIdentifier);

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

        ParameterizedTypeReference<AssetInformation> localReturnType = new ParameterizedTypeReference<AssetInformation>() {};
        return apiClient.invokeAPI("/shells/{aasIdentifier}/asset-information", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Creates a new Asset Administration Shell
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>201</b> - Asset Administration Shell created successfully
     * <p><b>409</b> - Conflict, a resource which shall be created exists already. Might be thrown if a Submodel or SubmodelElement with the same ShortId is contained in a POST request.
     * <p><b>200</b> - Default error handling for unmentioned status codes
     * <p><b>403</b> - Forbidden
     * <p><b>400</b> - Bad Request, e.g. the request parameters of the format of the request body is wrong.
     * <p><b>401</b> - Unauthorized, e.g. the server refused the authorization attempt.
     * @param assetAdministrationShell  (required)
     * @return Result
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Result postAssetAdministrationShell(AssetAdministrationShell assetAdministrationShell) throws RestClientException {
        return postAssetAdministrationShellWithHttpInfo(assetAdministrationShell).getBody();
    }

    /**
     * Creates a new Asset Administration Shell
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>201</b> - Asset Administration Shell created successfully
     * <p><b>409</b> - Conflict, a resource which shall be created exists already. Might be thrown if a Submodel or SubmodelElement with the same ShortId is contained in a POST request.
     * <p><b>200</b> - Default error handling for unmentioned status codes
     * <p><b>403</b> - Forbidden
     * <p><b>400</b> - Bad Request, e.g. the request parameters of the format of the request body is wrong.
     * <p><b>401</b> - Unauthorized, e.g. the server refused the authorization attempt.
     * @param assetAdministrationShell  (required)
     * @return ResponseEntity&lt;Result&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Result> postAssetAdministrationShellWithHttpInfo(AssetAdministrationShell assetAdministrationShell) throws RestClientException {
        Object localVarPostBody = assetAdministrationShell;
        
        // verify the required parameter 'assetAdministrationShell' is set
        if (assetAdministrationShell == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'assetAdministrationShell' when calling postAssetAdministrationShell");
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
        return apiClient.invokeAPI("/shells", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Creates a submodel reference at the Asset Administration Shell
     * 
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * <p><b>409</b> - Conflict, a resource which shall be created exists already. Might be thrown if a Submodel or SubmodelElement with the same ShortId is contained in a POST request.
     * <p><b>200</b> - Default error handling for unmentioned status codes
     * <p><b>403</b> - Forbidden
     * <p><b>201</b> - Submodel reference created successfully
     * <p><b>400</b> - Bad Request, e.g. the request parameters of the format of the request body is wrong.
     * <p><b>401</b> - Unauthorized, e.g. the server refused the authorization attempt.
     * @param aasIdentifier The Asset Administration Shell’s unique id (UTF8-BASE64-URL-encoded) (required)
     * @param reference  (required)
     * @return Result
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Result postSubmodelReferenceAasRepository(String aasIdentifier, Reference reference) throws RestClientException {
        return postSubmodelReferenceAasRepositoryWithHttpInfo(aasIdentifier, reference).getBody();
    }

    /**
     * Creates a submodel reference at the Asset Administration Shell
     * 
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * <p><b>409</b> - Conflict, a resource which shall be created exists already. Might be thrown if a Submodel or SubmodelElement with the same ShortId is contained in a POST request.
     * <p><b>200</b> - Default error handling for unmentioned status codes
     * <p><b>403</b> - Forbidden
     * <p><b>201</b> - Submodel reference created successfully
     * <p><b>400</b> - Bad Request, e.g. the request parameters of the format of the request body is wrong.
     * <p><b>401</b> - Unauthorized, e.g. the server refused the authorization attempt.
     * @param aasIdentifier The Asset Administration Shell’s unique id (UTF8-BASE64-URL-encoded) (required)
     * @param reference  (required)
     * @return ResponseEntity&lt;Result&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Result> postSubmodelReferenceAasRepositoryWithHttpInfo(String aasIdentifier, Reference reference) throws RestClientException {
        Object localVarPostBody = reference;
        
        // verify the required parameter 'aasIdentifier' is set
        if (aasIdentifier == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'aasIdentifier' when calling postSubmodelReferenceAasRepository");
        }
        
        // verify the required parameter 'reference' is set
        if (reference == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'reference' when calling postSubmodelReferenceAasRepository");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("aasIdentifier", aasIdentifier);

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
        return apiClient.invokeAPI("/shells/{aasIdentifier}/submodel-refs", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Updates an existing Asset Administration Shell
     * 
     * <p><b>204</b> - Asset Administration Shell updated successfully
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * <p><b>200</b> - Default error handling for unmentioned status codes
     * <p><b>403</b> - Forbidden
     * <p><b>400</b> - Bad Request, e.g. the request parameters of the format of the request body is wrong.
     * <p><b>401</b> - Unauthorized, e.g. the server refused the authorization attempt.
     * @param aasIdentifier The Asset Administration Shell’s unique id (UTF8-BASE64-URL-encoded) (required)
     * @param assetAdministrationShell  (required)
     * @return Result
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Result putAssetAdministrationShellById(String aasIdentifier, AssetAdministrationShell assetAdministrationShell) throws RestClientException {
        return putAssetAdministrationShellByIdWithHttpInfo(aasIdentifier, assetAdministrationShell).getBody();
    }

    /**
     * Updates an existing Asset Administration Shell
     * 
     * <p><b>204</b> - Asset Administration Shell updated successfully
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * <p><b>200</b> - Default error handling for unmentioned status codes
     * <p><b>403</b> - Forbidden
     * <p><b>400</b> - Bad Request, e.g. the request parameters of the format of the request body is wrong.
     * <p><b>401</b> - Unauthorized, e.g. the server refused the authorization attempt.
     * @param aasIdentifier The Asset Administration Shell’s unique id (UTF8-BASE64-URL-encoded) (required)
     * @param assetAdministrationShell  (required)
     * @return ResponseEntity&lt;Result&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Result> putAssetAdministrationShellByIdWithHttpInfo(String aasIdentifier, AssetAdministrationShell assetAdministrationShell) throws RestClientException {
        Object localVarPostBody = assetAdministrationShell;
        
        // verify the required parameter 'aasIdentifier' is set
        if (aasIdentifier == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'aasIdentifier' when calling putAssetAdministrationShellById");
        }
        
        // verify the required parameter 'assetAdministrationShell' is set
        if (assetAdministrationShell == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'assetAdministrationShell' when calling putAssetAdministrationShellById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("aasIdentifier", aasIdentifier);

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
        return apiClient.invokeAPI("/shells/{aasIdentifier}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Updates the Asset Information
     * 
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * <p><b>200</b> - Default error handling for unmentioned status codes
     * <p><b>403</b> - Forbidden
     * <p><b>204</b> - Asset Information updated successfully
     * <p><b>400</b> - Bad Request, e.g. the request parameters of the format of the request body is wrong.
     * <p><b>401</b> - Unauthorized, e.g. the server refused the authorization attempt.
     * @param aasIdentifier The Asset Administration Shell’s unique id (UTF8-BASE64-URL-encoded) (required)
     * @param assetInformation  (required)
     * @return Result
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Result putAssetInformationAasRepository(String aasIdentifier, AssetInformation assetInformation) throws RestClientException {
        return putAssetInformationAasRepositoryWithHttpInfo(aasIdentifier, assetInformation).getBody();
    }

    /**
     * Updates the Asset Information
     * 
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * <p><b>200</b> - Default error handling for unmentioned status codes
     * <p><b>403</b> - Forbidden
     * <p><b>204</b> - Asset Information updated successfully
     * <p><b>400</b> - Bad Request, e.g. the request parameters of the format of the request body is wrong.
     * <p><b>401</b> - Unauthorized, e.g. the server refused the authorization attempt.
     * @param aasIdentifier The Asset Administration Shell’s unique id (UTF8-BASE64-URL-encoded) (required)
     * @param assetInformation  (required)
     * @return ResponseEntity&lt;Result&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Result> putAssetInformationAasRepositoryWithHttpInfo(String aasIdentifier, AssetInformation assetInformation) throws RestClientException {
        Object localVarPostBody = assetInformation;
        
        // verify the required parameter 'aasIdentifier' is set
        if (aasIdentifier == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'aasIdentifier' when calling putAssetInformationAasRepository");
        }
        
        // verify the required parameter 'assetInformation' is set
        if (assetInformation == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'assetInformation' when calling putAssetInformationAasRepository");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("aasIdentifier", aasIdentifier);

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
        return apiClient.invokeAPI("/shells/{aasIdentifier}/asset-information", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
