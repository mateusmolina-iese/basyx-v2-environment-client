package com.github.mateusmolina.basyx.aasenvironment.client.api;

import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiClient;

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
public class SerializationApiApi {
    private ApiClient apiClient;

    public SerializationApiApi() {
        this(new ApiClient());
    }

    public SerializationApiApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Returns an appropriate serialization based on the specified format (see SerializationFormat)
     * 
     * <p><b>200</b> - Default error handling for unmentioned status codes
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * <p><b>403</b> - Forbidden
     * <p><b>400</b> - Bad Request, e.g. the request parameters of the format of the request body is wrong.
     * <p><b>401</b> - Unauthorized, e.g. the server refused the authorization attempt.
     * @param aasIds The Asset Administration Shells&#39; unique ids (UTF8-BASE64-URL-encoded) (optional)
     * @param submodelIds The Submodels&#39; unique ids (UTF8-BASE64-URL-encoded) (optional)
     * @param includeConceptDescriptions Include Concept Descriptions? (optional, default to true)
     * @return Result
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Result generateSerializationByIds(List<String> aasIds, List<String> submodelIds, String includeConceptDescriptions) throws RestClientException {
        return generateSerializationByIdsWithHttpInfo(aasIds, submodelIds, includeConceptDescriptions).getBody();
    }

    /**
     * Returns an appropriate serialization based on the specified format (see SerializationFormat)
     * 
     * <p><b>200</b> - Default error handling for unmentioned status codes
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * <p><b>403</b> - Forbidden
     * <p><b>400</b> - Bad Request, e.g. the request parameters of the format of the request body is wrong.
     * <p><b>401</b> - Unauthorized, e.g. the server refused the authorization attempt.
     * @param aasIds The Asset Administration Shells&#39; unique ids (UTF8-BASE64-URL-encoded) (optional)
     * @param submodelIds The Submodels&#39; unique ids (UTF8-BASE64-URL-encoded) (optional)
     * @param includeConceptDescriptions Include Concept Descriptions? (optional, default to true)
     * @return ResponseEntity&lt;Result&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Result> generateSerializationByIdsWithHttpInfo(List<String> aasIds, List<String> submodelIds, String includeConceptDescriptions) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "aasIds", aasIds));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "submodelIds", submodelIds));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "includeConceptDescriptions", includeConceptDescriptions));


        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Result> localReturnType = new ParameterizedTypeReference<Result>() {};
        return apiClient.invokeAPI("/serialization", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
