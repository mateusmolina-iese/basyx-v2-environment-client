# AssetAdministrationShellRepositoryApiApi

All URIs are relative to *http://localhost:8081*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteAssetAdministrationShellById**](AssetAdministrationShellRepositoryApiApi.md#deleteAssetAdministrationShellById) | **DELETE** /shells/{aasIdentifier} | Deletes an Asset Administration Shell |
| [**deleteSubmodelReferenceByIdAasRepository**](AssetAdministrationShellRepositoryApiApi.md#deleteSubmodelReferenceByIdAasRepository) | **DELETE** /shells/{aasIdentifier}/submodel-refs/{submodelIdentifier} | Deletes the submodel reference from the Asset Administration Shell. Does not delete the submodel itself! |
| [**getAllAssetAdministrationShells**](AssetAdministrationShellRepositoryApiApi.md#getAllAssetAdministrationShells) | **GET** /shells | Returns all Asset Administration Shells |
| [**getAllSubmodelReferencesAasRepository**](AssetAdministrationShellRepositoryApiApi.md#getAllSubmodelReferencesAasRepository) | **GET** /shells/{aasIdentifier}/submodel-refs | Returns all submodel references |
| [**getAssetAdministrationShellById**](AssetAdministrationShellRepositoryApiApi.md#getAssetAdministrationShellById) | **GET** /shells/{aasIdentifier} | Returns a specific Asset Administration Shell |
| [**getAssetInformationAasRepository**](AssetAdministrationShellRepositoryApiApi.md#getAssetInformationAasRepository) | **GET** /shells/{aasIdentifier}/asset-information | Returns the Asset Information |
| [**postAssetAdministrationShell**](AssetAdministrationShellRepositoryApiApi.md#postAssetAdministrationShell) | **POST** /shells | Creates a new Asset Administration Shell |
| [**postSubmodelReferenceAasRepository**](AssetAdministrationShellRepositoryApiApi.md#postSubmodelReferenceAasRepository) | **POST** /shells/{aasIdentifier}/submodel-refs | Creates a submodel reference at the Asset Administration Shell |
| [**putAssetAdministrationShellById**](AssetAdministrationShellRepositoryApiApi.md#putAssetAdministrationShellById) | **PUT** /shells/{aasIdentifier} | Updates an existing Asset Administration Shell |
| [**putAssetInformationAasRepository**](AssetAdministrationShellRepositoryApiApi.md#putAssetInformationAasRepository) | **PUT** /shells/{aasIdentifier}/asset-information | Updates the Asset Information |



## deleteAssetAdministrationShellById

> Result deleteAssetAdministrationShellById(aasIdentifier)

Deletes an Asset Administration Shell

### Example

```java
// Import classes:
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiClient;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiException;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.Configuration;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.models.*;
import com.github.mateusmolina.basyx.aasenvironment.client.api.AssetAdministrationShellRepositoryApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        AssetAdministrationShellRepositoryApiApi apiInstance = new AssetAdministrationShellRepositoryApiApi(defaultClient);
        String aasIdentifier = "aasIdentifier_example"; // String | The Asset Administration Shell’s unique id (UTF8-BASE64-URL-encoded)
        try {
            Result result = apiInstance.deleteAssetAdministrationShellById(aasIdentifier);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AssetAdministrationShellRepositoryApiApi#deleteAssetAdministrationShellById");
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
| **aasIdentifier** | **String**| The Asset Administration Shell’s unique id (UTF8-BASE64-URL-encoded) | |

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
| **204** | Asset Administration Shell deleted successfully |  -  |
| **401** | Unauthorized, e.g. the server refused the authorization attempt. |  -  |


## deleteSubmodelReferenceByIdAasRepository

> Result deleteSubmodelReferenceByIdAasRepository(aasIdentifier, submodelIdentifier)

Deletes the submodel reference from the Asset Administration Shell. Does not delete the submodel itself!

### Example

```java
// Import classes:
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiClient;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiException;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.Configuration;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.models.*;
import com.github.mateusmolina.basyx.aasenvironment.client.api.AssetAdministrationShellRepositoryApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        AssetAdministrationShellRepositoryApiApi apiInstance = new AssetAdministrationShellRepositoryApiApi(defaultClient);
        String aasIdentifier = "aasIdentifier_example"; // String | The Asset Administration Shell’s unique id (UTF8-BASE64-URL-encoded)
        String submodelIdentifier = "submodelIdentifier_example"; // String | The Submodel’s unique id (UTF8-BASE64-URL-encoded)
        try {
            Result result = apiInstance.deleteSubmodelReferenceByIdAasRepository(aasIdentifier, submodelIdentifier);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AssetAdministrationShellRepositoryApiApi#deleteSubmodelReferenceByIdAasRepository");
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
| **aasIdentifier** | **String**| The Asset Administration Shell’s unique id (UTF8-BASE64-URL-encoded) | |
| **submodelIdentifier** | **String**| The Submodel’s unique id (UTF8-BASE64-URL-encoded) | |

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
| **204** | Submodel reference deleted successfully |  -  |
| **200** | Default error handling for unmentioned status codes |  -  |
| **403** | Forbidden |  -  |
| **400** | Bad Request, e.g. the request parameters of the format of the request body is wrong. |  -  |
| **401** | Unauthorized, e.g. the server refused the authorization attempt. |  -  |


## getAllAssetAdministrationShells

> String getAllAssetAdministrationShells(assetIds, idShort, limit, cursor)

Returns all Asset Administration Shells

### Example

```java
// Import classes:
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiClient;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiException;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.Configuration;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.models.*;
import com.github.mateusmolina.basyx.aasenvironment.client.api.AssetAdministrationShellRepositoryApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        AssetAdministrationShellRepositoryApiApi apiInstance = new AssetAdministrationShellRepositoryApiApi(defaultClient);
        List<SpecificAssetID> assetIds = Arrays.asList(); // List<SpecificAssetID> | A list of specific Asset identifiers
        String idShort = "idShort_example"; // String | The Asset Administration Shell’s IdShort
        String limit = "1"; // String | The maximum number of elements in the response array
        String cursor = "cursor_example"; // String | A server-generated identifier retrieved from pagingMetadata that specifies from which position the result listing should continue
        try {
            String result = apiInstance.getAllAssetAdministrationShells(assetIds, idShort, limit, cursor);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AssetAdministrationShellRepositoryApiApi#getAllAssetAdministrationShells");
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
| **assetIds** | [**List&lt;SpecificAssetID&gt;**](SpecificAssetID.md)| A list of specific Asset identifiers | [optional] |
| **idShort** | **String**| The Asset Administration Shell’s IdShort | [optional] |
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
| **200** | Requested Asset Administration Shells |  -  |
| **403** | Forbidden |  -  |
| **400** | Bad Request, e.g. the request parameters of the format of the request body is wrong. |  -  |
| **401** | Unauthorized, e.g. the server refused the authorization attempt. |  -  |


## getAllSubmodelReferencesAasRepository

> Result getAllSubmodelReferencesAasRepository(aasIdentifier, limit, cursor)

Returns all submodel references

### Example

```java
// Import classes:
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiClient;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiException;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.Configuration;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.models.*;
import com.github.mateusmolina.basyx.aasenvironment.client.api.AssetAdministrationShellRepositoryApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        AssetAdministrationShellRepositoryApiApi apiInstance = new AssetAdministrationShellRepositoryApiApi(defaultClient);
        String aasIdentifier = "aasIdentifier_example"; // String | The Asset Administration Shell’s unique id (UTF8-BASE64-URL-encoded)
        String limit = "1"; // String | The maximum number of elements in the response array
        String cursor = "cursor_example"; // String | A server-generated identifier retrieved from pagingMetadata that specifies from which position the result listing should continue
        try {
            Result result = apiInstance.getAllSubmodelReferencesAasRepository(aasIdentifier, limit, cursor);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AssetAdministrationShellRepositoryApiApi#getAllSubmodelReferencesAasRepository");
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
| **aasIdentifier** | **String**| The Asset Administration Shell’s unique id (UTF8-BASE64-URL-encoded) | |
| **limit** | **String**| The maximum number of elements in the response array | [optional] [enum: 1] |
| **cursor** | **String**| A server-generated identifier retrieved from pagingMetadata that specifies from which position the result listing should continue | [optional] |

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


## getAssetAdministrationShellById

> Result getAssetAdministrationShellById(aasIdentifier)

Returns a specific Asset Administration Shell

### Example

```java
// Import classes:
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiClient;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiException;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.Configuration;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.models.*;
import com.github.mateusmolina.basyx.aasenvironment.client.api.AssetAdministrationShellRepositoryApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        AssetAdministrationShellRepositoryApiApi apiInstance = new AssetAdministrationShellRepositoryApiApi(defaultClient);
        String aasIdentifier = "aasIdentifier_example"; // String | The Asset Administration Shell’s unique id (UTF8-BASE64-URL-encoded)
        try {
            Result result = apiInstance.getAssetAdministrationShellById(aasIdentifier);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AssetAdministrationShellRepositoryApiApi#getAssetAdministrationShellById");
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
| **aasIdentifier** | **String**| The Asset Administration Shell’s unique id (UTF8-BASE64-URL-encoded) | |

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


## getAssetInformationAasRepository

> AssetInformation getAssetInformationAasRepository(aasIdentifier)

Returns the Asset Information

### Example

```java
// Import classes:
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiClient;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiException;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.Configuration;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.models.*;
import com.github.mateusmolina.basyx.aasenvironment.client.api.AssetAdministrationShellRepositoryApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        AssetAdministrationShellRepositoryApiApi apiInstance = new AssetAdministrationShellRepositoryApiApi(defaultClient);
        String aasIdentifier = "aasIdentifier_example"; // String | The Asset Administration Shell’s unique id (UTF8-BASE64-URL-encoded)
        try {
            AssetInformation result = apiInstance.getAssetInformationAasRepository(aasIdentifier);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AssetAdministrationShellRepositoryApiApi#getAssetInformationAasRepository");
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
| **aasIdentifier** | **String**| The Asset Administration Shell’s unique id (UTF8-BASE64-URL-encoded) | |

### Return type

[**AssetInformation**](AssetInformation.md)

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
| **200** | Requested Asset Information |  -  |
| **403** | Forbidden |  -  |
| **400** | Bad Request, e.g. the request parameters of the format of the request body is wrong. |  -  |
| **401** | Unauthorized, e.g. the server refused the authorization attempt. |  -  |


## postAssetAdministrationShell

> Result postAssetAdministrationShell(assetAdministrationShell)

Creates a new Asset Administration Shell

### Example

```java
// Import classes:
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiClient;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiException;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.Configuration;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.models.*;
import com.github.mateusmolina.basyx.aasenvironment.client.api.AssetAdministrationShellRepositoryApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        AssetAdministrationShellRepositoryApiApi apiInstance = new AssetAdministrationShellRepositoryApiApi(defaultClient);
        AssetAdministrationShell assetAdministrationShell = new AssetAdministrationShell(); // AssetAdministrationShell | 
        try {
            Result result = apiInstance.postAssetAdministrationShell(assetAdministrationShell);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AssetAdministrationShellRepositoryApiApi#postAssetAdministrationShell");
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
| **assetAdministrationShell** | [**AssetAdministrationShell**](AssetAdministrationShell.md)|  | |

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
| **201** | Asset Administration Shell created successfully |  -  |
| **409** | Conflict, a resource which shall be created exists already. Might be thrown if a Submodel or SubmodelElement with the same ShortId is contained in a POST request. |  -  |
| **200** | Default error handling for unmentioned status codes |  -  |
| **403** | Forbidden |  -  |
| **400** | Bad Request, e.g. the request parameters of the format of the request body is wrong. |  -  |
| **401** | Unauthorized, e.g. the server refused the authorization attempt. |  -  |


## postSubmodelReferenceAasRepository

> Result postSubmodelReferenceAasRepository(aasIdentifier, reference)

Creates a submodel reference at the Asset Administration Shell

### Example

```java
// Import classes:
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiClient;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiException;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.Configuration;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.models.*;
import com.github.mateusmolina.basyx.aasenvironment.client.api.AssetAdministrationShellRepositoryApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        AssetAdministrationShellRepositoryApiApi apiInstance = new AssetAdministrationShellRepositoryApiApi(defaultClient);
        String aasIdentifier = "aasIdentifier_example"; // String | The Asset Administration Shell’s unique id (UTF8-BASE64-URL-encoded)
        Reference reference = new Reference(); // Reference | 
        try {
            Result result = apiInstance.postSubmodelReferenceAasRepository(aasIdentifier, reference);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AssetAdministrationShellRepositoryApiApi#postSubmodelReferenceAasRepository");
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
| **aasIdentifier** | **String**| The Asset Administration Shell’s unique id (UTF8-BASE64-URL-encoded) | |
| **reference** | [**Reference**](Reference.md)|  | |

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
| **409** | Conflict, a resource which shall be created exists already. Might be thrown if a Submodel or SubmodelElement with the same ShortId is contained in a POST request. |  -  |
| **200** | Default error handling for unmentioned status codes |  -  |
| **403** | Forbidden |  -  |
| **201** | Submodel reference created successfully |  -  |
| **400** | Bad Request, e.g. the request parameters of the format of the request body is wrong. |  -  |
| **401** | Unauthorized, e.g. the server refused the authorization attempt. |  -  |


## putAssetAdministrationShellById

> Result putAssetAdministrationShellById(aasIdentifier, assetAdministrationShell)

Updates an existing Asset Administration Shell

### Example

```java
// Import classes:
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiClient;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiException;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.Configuration;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.models.*;
import com.github.mateusmolina.basyx.aasenvironment.client.api.AssetAdministrationShellRepositoryApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        AssetAdministrationShellRepositoryApiApi apiInstance = new AssetAdministrationShellRepositoryApiApi(defaultClient);
        String aasIdentifier = "aasIdentifier_example"; // String | The Asset Administration Shell’s unique id (UTF8-BASE64-URL-encoded)
        AssetAdministrationShell assetAdministrationShell = new AssetAdministrationShell(); // AssetAdministrationShell | 
        try {
            Result result = apiInstance.putAssetAdministrationShellById(aasIdentifier, assetAdministrationShell);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AssetAdministrationShellRepositoryApiApi#putAssetAdministrationShellById");
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
| **aasIdentifier** | **String**| The Asset Administration Shell’s unique id (UTF8-BASE64-URL-encoded) | |
| **assetAdministrationShell** | [**AssetAdministrationShell**](AssetAdministrationShell.md)|  | |

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
| **204** | Asset Administration Shell updated successfully |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |
| **200** | Default error handling for unmentioned status codes |  -  |
| **403** | Forbidden |  -  |
| **400** | Bad Request, e.g. the request parameters of the format of the request body is wrong. |  -  |
| **401** | Unauthorized, e.g. the server refused the authorization attempt. |  -  |


## putAssetInformationAasRepository

> Result putAssetInformationAasRepository(aasIdentifier, assetInformation)

Updates the Asset Information

### Example

```java
// Import classes:
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiClient;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiException;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.Configuration;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.models.*;
import com.github.mateusmolina.basyx.aasenvironment.client.api.AssetAdministrationShellRepositoryApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        AssetAdministrationShellRepositoryApiApi apiInstance = new AssetAdministrationShellRepositoryApiApi(defaultClient);
        String aasIdentifier = "aasIdentifier_example"; // String | The Asset Administration Shell’s unique id (UTF8-BASE64-URL-encoded)
        AssetInformation assetInformation = new AssetInformation(); // AssetInformation | 
        try {
            Result result = apiInstance.putAssetInformationAasRepository(aasIdentifier, assetInformation);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AssetAdministrationShellRepositoryApiApi#putAssetInformationAasRepository");
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
| **aasIdentifier** | **String**| The Asset Administration Shell’s unique id (UTF8-BASE64-URL-encoded) | |
| **assetInformation** | [**AssetInformation**](AssetInformation.md)|  | |

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
| **204** | Asset Information updated successfully |  -  |
| **400** | Bad Request, e.g. the request parameters of the format of the request body is wrong. |  -  |
| **401** | Unauthorized, e.g. the server refused the authorization attempt. |  -  |

