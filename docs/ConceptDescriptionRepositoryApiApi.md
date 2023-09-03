# ConceptDescriptionRepositoryApiApi

All URIs are relative to *http://localhost:8081*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteConceptDescriptionById**](ConceptDescriptionRepositoryApiApi.md#deleteConceptDescriptionById) | **DELETE** /concept-descriptions/{cdIdentifier} | Deletes a Concept Description |
| [**getAllConceptDescriptions**](ConceptDescriptionRepositoryApiApi.md#getAllConceptDescriptions) | **GET** /concept-descriptions | Returns all Concept Descriptions |
| [**getConceptDescriptionById**](ConceptDescriptionRepositoryApiApi.md#getConceptDescriptionById) | **GET** /concept-descriptions/{cdIdentifier} | Returns a specific Concept Description |
| [**postConceptDescription**](ConceptDescriptionRepositoryApiApi.md#postConceptDescription) | **POST** /concept-descriptions | Creates a new Concept Description |
| [**putConceptDescriptionById**](ConceptDescriptionRepositoryApiApi.md#putConceptDescriptionById) | **PUT** /concept-descriptions/{cdIdentifier} | Updates an existing Concept Description |



## deleteConceptDescriptionById

> Result deleteConceptDescriptionById(cdIdentifier)

Deletes a Concept Description

### Example

```java
// Import classes:
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiClient;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiException;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.Configuration;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.models.*;
import com.github.mateusmolina.basyx.aasenvironment.client.api.ConceptDescriptionRepositoryApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        ConceptDescriptionRepositoryApiApi apiInstance = new ConceptDescriptionRepositoryApiApi(defaultClient);
        String cdIdentifier = "cdIdentifier_example"; // String | The Concept Description’s unique id (UTF8-BASE64-URL-encoded)
        try {
            Result result = apiInstance.deleteConceptDescriptionById(cdIdentifier);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConceptDescriptionRepositoryApiApi#deleteConceptDescriptionById");
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
| **cdIdentifier** | **String**| The Concept Description’s unique id (UTF8-BASE64-URL-encoded) | |

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
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |
| **204** | Concept Description deleted successfully |  -  |
| **200** | Default error handling for unmentioned status codes |  -  |
| **403** | Forbidden |  -  |
| **400** | Bad Request, e.g. the request parameters of the format of the request body is wrong. |  -  |


## getAllConceptDescriptions

> String getAllConceptDescriptions(idShort, isCaseOf, dataSpecificationRef, limit, cursor)

Returns all Concept Descriptions

### Example

```java
// Import classes:
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiClient;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiException;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.Configuration;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.models.*;
import com.github.mateusmolina.basyx.aasenvironment.client.api.ConceptDescriptionRepositoryApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        ConceptDescriptionRepositoryApiApi apiInstance = new ConceptDescriptionRepositoryApiApi(defaultClient);
        String idShort = "idShort_example"; // String | The Concept Description’s IdShort
        String isCaseOf = "isCaseOf_example"; // String | IsCaseOf reference (UTF8-BASE64-URL-encoded)
        String dataSpecificationRef = "dataSpecificationRef_example"; // String | DataSpecification reference (UTF8-BASE64-URL-encoded)
        String limit = "1"; // String | The maximum number of elements in the response array
        String cursor = "cursor_example"; // String | A server-generated identifier retrieved from pagingMetadata that specifies from which position the result listing should continue
        try {
            String result = apiInstance.getAllConceptDescriptions(idShort, isCaseOf, dataSpecificationRef, limit, cursor);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConceptDescriptionRepositoryApiApi#getAllConceptDescriptions");
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
| **idShort** | **String**| The Concept Description’s IdShort | [optional] |
| **isCaseOf** | **String**| IsCaseOf reference (UTF8-BASE64-URL-encoded) | [optional] |
| **dataSpecificationRef** | **String**| DataSpecification reference (UTF8-BASE64-URL-encoded) | [optional] |
| **limit** | **String**| The maximum number of elements in the response array | [optional] [enum: 1] |
| **cursor** | **String**| A server-generated identifier retrieved from pagingMetadata that specifies from which position the result listing should continue | [optional] |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **500** | Internal Server Error |  -  |
| **200** | Requested Concept Descriptions |  -  |
| **403** | Forbidden |  -  |
| **400** | Bad Request, e.g. the request parameters of the format of the request body is wrong. |  -  |


## getConceptDescriptionById

> Result getConceptDescriptionById(cdIdentifier)

Returns a specific Concept Description

### Example

```java
// Import classes:
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiClient;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiException;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.Configuration;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.models.*;
import com.github.mateusmolina.basyx.aasenvironment.client.api.ConceptDescriptionRepositoryApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        ConceptDescriptionRepositoryApiApi apiInstance = new ConceptDescriptionRepositoryApiApi(defaultClient);
        String cdIdentifier = "cdIdentifier_example"; // String | The Concept Description’s unique id (UTF8-BASE64-URL-encoded)
        try {
            Result result = apiInstance.getConceptDescriptionById(cdIdentifier);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConceptDescriptionRepositoryApiApi#getConceptDescriptionById");
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
| **cdIdentifier** | **String**| The Concept Description’s unique id (UTF8-BASE64-URL-encoded) | |

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
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |
| **200** | Default error handling for unmentioned status codes |  -  |
| **403** | Forbidden |  -  |
| **400** | Bad Request, e.g. the request parameters of the format of the request body is wrong. |  -  |


## postConceptDescription

> Result postConceptDescription(conceptDescription)

Creates a new Concept Description

### Example

```java
// Import classes:
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiClient;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiException;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.Configuration;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.models.*;
import com.github.mateusmolina.basyx.aasenvironment.client.api.ConceptDescriptionRepositoryApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        ConceptDescriptionRepositoryApiApi apiInstance = new ConceptDescriptionRepositoryApiApi(defaultClient);
        ConceptDescription conceptDescription = new ConceptDescription(); // ConceptDescription | 
        try {
            Result result = apiInstance.postConceptDescription(conceptDescription);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConceptDescriptionRepositoryApiApi#postConceptDescription");
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
| **conceptDescription** | [**ConceptDescription**](ConceptDescription.md)|  | |

### Return type

[**Result**](Result.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **500** | Internal Server Error |  -  |
| **409** | Conflict, a resource which shall be created exists already. Might be thrown if a Submodel or SubmodelElement with the same ShortId is contained in a POST request. |  -  |
| **201** | Concept Description created successfully |  -  |
| **200** | Default error handling for unmentioned status codes |  -  |
| **403** | Forbidden |  -  |
| **400** | Bad Request, e.g. the request parameters of the format of the request body is wrong. |  -  |


## putConceptDescriptionById

> Result putConceptDescriptionById(cdIdentifier, conceptDescription)

Updates an existing Concept Description

### Example

```java
// Import classes:
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiClient;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiException;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.Configuration;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.models.*;
import com.github.mateusmolina.basyx.aasenvironment.client.api.ConceptDescriptionRepositoryApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        ConceptDescriptionRepositoryApiApi apiInstance = new ConceptDescriptionRepositoryApiApi(defaultClient);
        String cdIdentifier = "cdIdentifier_example"; // String | The Concept Description’s unique id (UTF8-BASE64-URL-encoded)
        ConceptDescription conceptDescription = new ConceptDescription(); // ConceptDescription | 
        try {
            Result result = apiInstance.putConceptDescriptionById(cdIdentifier, conceptDescription);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConceptDescriptionRepositoryApiApi#putConceptDescriptionById");
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
| **cdIdentifier** | **String**| The Concept Description’s unique id (UTF8-BASE64-URL-encoded) | |
| **conceptDescription** | [**ConceptDescription**](ConceptDescription.md)|  | |

### Return type

[**Result**](Result.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |
| **200** | Default error handling for unmentioned status codes |  -  |
| **403** | Forbidden |  -  |
| **204** | Concept Description updated successfully |  -  |
| **400** | Bad Request, e.g. the request parameters of the format of the request body is wrong. |  -  |

