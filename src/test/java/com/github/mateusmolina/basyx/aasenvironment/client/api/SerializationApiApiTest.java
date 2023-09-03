/*
 * BaSyx AAS Environment Component
 * AAS Environment API
 *
 * The version of the OpenAPI document: 2.0
 * Contact: basyx-dev@eclipse.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.mateusmolina.basyx.aasenvironment.client.api;

import com.github.mateusmolina.basyx.aasenvironment.client.model.Result;
import org.junit.Test;
import org.junit.Ignore;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SerializationApiApi
 */
@Ignore
public class SerializationApiApiTest {

    private final SerializationApiApi api = new SerializationApiApi();

    
    /**
     * Returns an appropriate serialization based on the specified format (see SerializationFormat)
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void generateSerializationByIdsTest() {
        List<String> aasIds = null;
        List<String> submodelIds = null;
        String includeConceptDescriptions = null;
        Result response = api.generateSerializationByIds(aasIds, submodelIds, includeConceptDescriptions);

        // TODO: test validations
    }
    
}
