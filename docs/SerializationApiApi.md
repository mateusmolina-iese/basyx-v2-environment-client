# SerializationApiApi

All URIs are relative to *http://localhost:8081*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**generateSerializationByIds**](SerializationApiApi.md#generateSerializationByIds) | **GET** /serialization | Returns an appropriate serialization based on the specified format (see SerializationFormat) |



## generateSerializationByIds

> Result generateSerializationByIds(aasIds, submodelIds, includeConceptDescriptions)

Returns an appropriate serialization based on the specified format (see SerializationFormat)

### Example

```java
// Import classes:
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiClient;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiException;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.Configuration;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.models.*;
import com.github.mateusmolina.basyx.aasenvironment.client.api.SerializationApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        SerializationApiApi apiInstance = new SerializationApiApi(defaultClient);
        List<String> aasIds = Arrays.asList(); // List<String> | The Asset Administration Shells' unique ids (UTF8-BASE64-URL-encoded)
        List<String> submodelIds = Arrays.asList(); // List<String> | The Submodels' unique ids (UTF8-BASE64-URL-encoded)
        String includeConceptDescriptions = "true"; // String | Include Concept Descriptions?
        try {
            Result result = apiInstance.generateSerializationByIds(aasIds, submodelIds, includeConceptDescriptions);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SerializationApiApi#generateSerializationByIds");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **aasIds** | [**List&lt;String&gt;**](String.md)| The Asset Administration Shells&#39; unique ids (UTF8-BASE64-URL-encoded) | [optional] |
| **submodelIds** | [**List&lt;String&gt;**](String.md)| The Submodels&#39; unique ids (UTF8-BASE64-URL-encoded) | [optional] |
| **includeConceptDescriptions** | **String**| Include Concept Descriptions? | [optional] [default to true] |

### Return type

[**Result**](Result.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default error handling for unmentioned status codes |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |
| **403** | Forbidden |  -  |
| **400** | Bad Request, e.g. the request parameters of the format of the request body is wrong. |  -  |
| **401** | Unauthorized, e.g. the server refused the authorization attempt. |  -  |

