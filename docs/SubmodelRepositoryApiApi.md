# SubmodelRepositoryApiApi

All URIs are relative to *http://localhost:8081*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteSubmodelById**](SubmodelRepositoryApiApi.md#deleteSubmodelById) | **DELETE** /submodels/{submodelIdentifier} | Deletes a Submodel |
| [**deleteSubmodelElementByPathSubmodelRepo**](SubmodelRepositoryApiApi.md#deleteSubmodelElementByPathSubmodelRepo) | **DELETE** /submodels/{submodelIdentifier}/submodel-elements/{idShortPath} | Deletes a submodel element at a specified path within the submodel elements hierarchy |
| [**getAllSubmodelElements**](SubmodelRepositoryApiApi.md#getAllSubmodelElements) | **GET** /submodels/{submodelIdentifier}/submodel-elements | Returns all submodel elements including their hierarchy |
| [**getAllSubmodels**](SubmodelRepositoryApiApi.md#getAllSubmodels) | **GET** /submodels | Returns all Submodels |
| [**getSubmodelById**](SubmodelRepositoryApiApi.md#getSubmodelById) | **GET** /submodels/{submodelIdentifier} | Returns a specific Submodel |
| [**getSubmodelByIdMetadata**](SubmodelRepositoryApiApi.md#getSubmodelByIdMetadata) | **GET** /submodels/{submodelIdentifier}/$metadata | Returns the metadata attributes of a specific Submodel |
| [**getSubmodelByIdValueOnly**](SubmodelRepositoryApiApi.md#getSubmodelByIdValueOnly) | **GET** /submodels/{submodelIdentifier}/$value | Returns a specific Submodel in the ValueOnly representation |
| [**getSubmodelElementByPathSubmodelRepo**](SubmodelRepositoryApiApi.md#getSubmodelElementByPathSubmodelRepo) | **GET** /submodels/{submodelIdentifier}/submodel-elements/{idShortPath} | Returns a specific submodel element from the Submodel at a specified path |
| [**getSubmodelElementByPathValueOnlySubmodelRepo**](SubmodelRepositoryApiApi.md#getSubmodelElementByPathValueOnlySubmodelRepo) | **GET** /submodels/{submodelIdentifier}/submodel-elements/{idShortPath}/$value | Returns a specific submodel element from the Submodel at a specified path in the ValueOnly representation |
| [**invokeOperationSubmodelRepo**](SubmodelRepositoryApiApi.md#invokeOperationSubmodelRepo) | **POST** /submodels/{submodelIdentifier}/submodel-elements/{idShortPath}/invoke | Synchronously or asynchronously invokes an Operation at a specified path |
| [**patchSubmodelElementByPathValueOnlySubmodelRepo**](SubmodelRepositoryApiApi.md#patchSubmodelElementByPathValueOnlySubmodelRepo) | **PATCH** /submodels/{submodelIdentifier}/submodel-elements/{idShortPath}/$value | Updates the value of an existing SubmodelElement |
| [**postSubmodel**](SubmodelRepositoryApiApi.md#postSubmodel) | **POST** /submodels | Creates a new Submodel |
| [**postSubmodelElementByPathSubmodelRepo**](SubmodelRepositoryApiApi.md#postSubmodelElementByPathSubmodelRepo) | **POST** /submodels/{submodelIdentifier}/submodel-elements/{idShortPath} | Creates a new submodel element at a specified path within submodel elements hierarchy |
| [**postSubmodelElementSubmodelRepo**](SubmodelRepositoryApiApi.md#postSubmodelElementSubmodelRepo) | **POST** /submodels/{submodelIdentifier}/submodel-elements | Creates a new submodel element |
| [**putSubmodelById**](SubmodelRepositoryApiApi.md#putSubmodelById) | **PUT** /submodels/{submodelIdentifier} | Updates an existing Submodel |



## deleteSubmodelById

> Result deleteSubmodelById(submodelIdentifier)

Deletes a Submodel

### Example

```java
// Import classes:
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiClient;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiException;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.Configuration;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.models.*;
import com.github.mateusmolina.basyx.aasenvironment.client.api.SubmodelRepositoryApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        SubmodelRepositoryApiApi apiInstance = new SubmodelRepositoryApiApi(defaultClient);
        String submodelIdentifier = "submodelIdentifier_example"; // String | The Submodel’s unique id (UTF8-BASE64-URL-encoded)
        try {
            Result result = apiInstance.deleteSubmodelById(submodelIdentifier);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubmodelRepositoryApiApi#deleteSubmodelById");
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
| **204** | Submodel deleted successfully |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |
| **200** | Default error handling for unmentioned status codes |  -  |
| **403** | Forbidden |  -  |
| **400** | Bad Request, e.g. the request parameters of the format of the request body is wrong. |  -  |
| **401** | Unauthorized, e.g. the server refused the authorization attempt. |  -  |


## deleteSubmodelElementByPathSubmodelRepo

> Result deleteSubmodelElementByPathSubmodelRepo(submodelIdentifier, idShortPath)

Deletes a submodel element at a specified path within the submodel elements hierarchy

### Example

```java
// Import classes:
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiClient;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiException;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.Configuration;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.models.*;
import com.github.mateusmolina.basyx.aasenvironment.client.api.SubmodelRepositoryApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        SubmodelRepositoryApiApi apiInstance = new SubmodelRepositoryApiApi(defaultClient);
        String submodelIdentifier = "submodelIdentifier_example"; // String | The Submodel’s unique id (UTF8-BASE64-URL-encoded)
        String idShortPath = "idShortPath_example"; // String | IdShort path to the submodel element (dot-separated)
        try {
            Result result = apiInstance.deleteSubmodelElementByPathSubmodelRepo(submodelIdentifier, idShortPath);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubmodelRepositoryApiApi#deleteSubmodelElementByPathSubmodelRepo");
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
| **submodelIdentifier** | **String**| The Submodel’s unique id (UTF8-BASE64-URL-encoded) | |
| **idShortPath** | **String**| IdShort path to the submodel element (dot-separated) | |

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
| **204** | Submodel element deleted successfully |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |
| **200** | Default error handling for unmentioned status codes |  -  |
| **403** | Forbidden |  -  |
| **400** | Bad Request, e.g. the request parameters of the format of the request body is wrong. |  -  |
| **401** | Unauthorized, e.g. the server refused the authorization attempt. |  -  |


## getAllSubmodelElements

> String getAllSubmodelElements(submodelIdentifier, limit, cursor, level, extent)

Returns all submodel elements including their hierarchy

### Example

```java
// Import classes:
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiClient;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiException;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.Configuration;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.models.*;
import com.github.mateusmolina.basyx.aasenvironment.client.api.SubmodelRepositoryApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        SubmodelRepositoryApiApi apiInstance = new SubmodelRepositoryApiApi(defaultClient);
        String submodelIdentifier = "submodelIdentifier_example"; // String | The Submodel’s unique id (UTF8-BASE64-URL-encoded)
        String limit = "1"; // String | The maximum number of elements in the response array
        String cursor = "cursor_example"; // String | A server-generated identifier retrieved from pagingMetadata that specifies from which position the result listing should continue
        String level = "deep"; // String | Determines the structural depth of the respective resource content
        String extent = "withBlobValue"; // String | Determines to which extent the resource is being serialized
        try {
            String result = apiInstance.getAllSubmodelElements(submodelIdentifier, limit, cursor, level, extent);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubmodelRepositoryApiApi#getAllSubmodelElements");
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
| **submodelIdentifier** | **String**| The Submodel’s unique id (UTF8-BASE64-URL-encoded) | |
| **limit** | **String**| The maximum number of elements in the response array | [optional] [enum: 1] |
| **cursor** | **String**| A server-generated identifier retrieved from pagingMetadata that specifies from which position the result listing should continue | [optional] |
| **level** | **String**| Determines the structural depth of the respective resource content | [optional] [default to deep] [enum: deep, core] |
| **extent** | **String**| Determines to which extent the resource is being serialized | [optional] [default to withoutBlobValue] [enum: withBlobValue, withoutBlobValue] |

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
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |
| **200** | List of found submodel elements |  -  |
| **403** | Forbidden |  -  |
| **400** | Bad Request, e.g. the request parameters of the format of the request body is wrong. |  -  |
| **401** | Unauthorized, e.g. the server refused the authorization attempt. |  -  |


## getAllSubmodels

> Result getAllSubmodels(semanticId, idShort, limit, cursor, level, extent)

Returns all Submodels

### Example

```java
// Import classes:
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiClient;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiException;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.Configuration;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.models.*;
import com.github.mateusmolina.basyx.aasenvironment.client.api.SubmodelRepositoryApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        SubmodelRepositoryApiApi apiInstance = new SubmodelRepositoryApiApi(defaultClient);
        String semanticId = "semanticId_example"; // String | The value of the semantic id reference (UTF8-BASE64-URL-encoded)
        String idShort = "idShort_example"; // String | The Asset Administration Shell’s IdShort
        String limit = "1"; // String | The maximum number of elements in the response array
        String cursor = "cursor_example"; // String | A server-generated identifier retrieved from pagingMetadata that specifies from which position the result listing should continue
        String level = "deep"; // String | Determines the structural depth of the respective resource content
        String extent = "withBlobValue"; // String | Determines to which extent the resource is being serialized
        try {
            Result result = apiInstance.getAllSubmodels(semanticId, idShort, limit, cursor, level, extent);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubmodelRepositoryApiApi#getAllSubmodels");
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
| **semanticId** | **String**| The value of the semantic id reference (UTF8-BASE64-URL-encoded) | [optional] |
| **idShort** | **String**| The Asset Administration Shell’s IdShort | [optional] |
| **limit** | **String**| The maximum number of elements in the response array | [optional] [enum: 1] |
| **cursor** | **String**| A server-generated identifier retrieved from pagingMetadata that specifies from which position the result listing should continue | [optional] |
| **level** | **String**| Determines the structural depth of the respective resource content | [optional] [default to deep] [enum: deep, core] |
| **extent** | **String**| Determines to which extent the resource is being serialized | [optional] [default to withoutBlobValue] [enum: withBlobValue, withoutBlobValue] |

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
| **500** | Internal Server Error |  -  |
| **403** | Forbidden |  -  |
| **400** | Bad Request, e.g. the request parameters of the format of the request body is wrong. |  -  |
| **401** | Unauthorized, e.g. the server refused the authorization attempt. |  -  |


## getSubmodelById

> Result getSubmodelById(submodelIdentifier, level, extent)

Returns a specific Submodel

### Example

```java
// Import classes:
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiClient;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiException;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.Configuration;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.models.*;
import com.github.mateusmolina.basyx.aasenvironment.client.api.SubmodelRepositoryApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        SubmodelRepositoryApiApi apiInstance = new SubmodelRepositoryApiApi(defaultClient);
        String submodelIdentifier = "submodelIdentifier_example"; // String | The Submodel’s unique id (UTF8-BASE64-URL-encoded)
        String level = "deep"; // String | Determines the structural depth of the respective resource content
        String extent = "withBlobValue"; // String | Determines to which extent the resource is being serialized
        try {
            Result result = apiInstance.getSubmodelById(submodelIdentifier, level, extent);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubmodelRepositoryApiApi#getSubmodelById");
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
| **submodelIdentifier** | **String**| The Submodel’s unique id (UTF8-BASE64-URL-encoded) | |
| **level** | **String**| Determines the structural depth of the respective resource content | [optional] [default to deep] [enum: deep, core] |
| **extent** | **String**| Determines to which extent the resource is being serialized | [optional] [default to withoutBlobValue] [enum: withBlobValue, withoutBlobValue] |

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


## getSubmodelByIdMetadata

> Result getSubmodelByIdMetadata(submodelIdentifier, level)

Returns the metadata attributes of a specific Submodel

### Example

```java
// Import classes:
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiClient;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiException;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.Configuration;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.models.*;
import com.github.mateusmolina.basyx.aasenvironment.client.api.SubmodelRepositoryApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        SubmodelRepositoryApiApi apiInstance = new SubmodelRepositoryApiApi(defaultClient);
        String submodelIdentifier = "submodelIdentifier_example"; // String | The Submodel’s unique id (UTF8-BASE64-URL-encoded)
        String level = "deep"; // String | Determines the structural depth of the respective resource content
        try {
            Result result = apiInstance.getSubmodelByIdMetadata(submodelIdentifier, level);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubmodelRepositoryApiApi#getSubmodelByIdMetadata");
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
| **submodelIdentifier** | **String**| The Submodel’s unique id (UTF8-BASE64-URL-encoded) | |
| **level** | **String**| Determines the structural depth of the respective resource content | [optional] [default to deep] [enum: deep, core] |

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


## getSubmodelByIdValueOnly

> Result getSubmodelByIdValueOnly(submodelIdentifier, level, extent)

Returns a specific Submodel in the ValueOnly representation

### Example

```java
// Import classes:
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiClient;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiException;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.Configuration;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.models.*;
import com.github.mateusmolina.basyx.aasenvironment.client.api.SubmodelRepositoryApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        SubmodelRepositoryApiApi apiInstance = new SubmodelRepositoryApiApi(defaultClient);
        String submodelIdentifier = "submodelIdentifier_example"; // String | The Submodel’s unique id (UTF8-BASE64-URL-encoded)
        String level = "deep"; // String | Determines the structural depth of the respective resource content
        String extent = "withBlobValue"; // String | Determines to which extent the resource is being serialized
        try {
            Result result = apiInstance.getSubmodelByIdValueOnly(submodelIdentifier, level, extent);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubmodelRepositoryApiApi#getSubmodelByIdValueOnly");
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
| **submodelIdentifier** | **String**| The Submodel’s unique id (UTF8-BASE64-URL-encoded) | |
| **level** | **String**| Determines the structural depth of the respective resource content | [optional] [default to deep] [enum: deep, core] |
| **extent** | **String**| Determines to which extent the resource is being serialized | [optional] [default to withoutBlobValue] [enum: withBlobValue, withoutBlobValue] |

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


## getSubmodelElementByPathSubmodelRepo

> Result getSubmodelElementByPathSubmodelRepo(submodelIdentifier, idShortPath, level, extent)

Returns a specific submodel element from the Submodel at a specified path

### Example

```java
// Import classes:
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiClient;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiException;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.Configuration;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.models.*;
import com.github.mateusmolina.basyx.aasenvironment.client.api.SubmodelRepositoryApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        SubmodelRepositoryApiApi apiInstance = new SubmodelRepositoryApiApi(defaultClient);
        String submodelIdentifier = "submodelIdentifier_example"; // String | The Submodel’s unique id (UTF8-BASE64-URL-encoded)
        String idShortPath = "idShortPath_example"; // String | IdShort path to the submodel element (dot-separated)
        String level = "deep"; // String | Determines the structural depth of the respective resource content
        String extent = "withBlobValue"; // String | Determines to which extent the resource is being serialized
        try {
            Result result = apiInstance.getSubmodelElementByPathSubmodelRepo(submodelIdentifier, idShortPath, level, extent);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubmodelRepositoryApiApi#getSubmodelElementByPathSubmodelRepo");
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
| **submodelIdentifier** | **String**| The Submodel’s unique id (UTF8-BASE64-URL-encoded) | |
| **idShortPath** | **String**| IdShort path to the submodel element (dot-separated) | |
| **level** | **String**| Determines the structural depth of the respective resource content | [optional] [default to deep] [enum: deep, core] |
| **extent** | **String**| Determines to which extent the resource is being serialized | [optional] [default to withoutBlobValue] [enum: withBlobValue, withoutBlobValue] |

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


## getSubmodelElementByPathValueOnlySubmodelRepo

> Object getSubmodelElementByPathValueOnlySubmodelRepo(submodelIdentifier, idShortPath, level, extent)

Returns a specific submodel element from the Submodel at a specified path in the ValueOnly representation

### Example

```java
// Import classes:
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiClient;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiException;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.Configuration;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.models.*;
import com.github.mateusmolina.basyx.aasenvironment.client.api.SubmodelRepositoryApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        SubmodelRepositoryApiApi apiInstance = new SubmodelRepositoryApiApi(defaultClient);
        String submodelIdentifier = "submodelIdentifier_example"; // String | The Submodel’s unique id (UTF8-BASE64-URL-encoded)
        String idShortPath = "idShortPath_example"; // String | IdShort path to the submodel element (dot-separated)
        String level = "deep"; // String | Determines the structural depth of the respective resource content
        String extent = "withBlobValue"; // String | Determines to which extent the resource is being serialized
        try {
            Object result = apiInstance.getSubmodelElementByPathValueOnlySubmodelRepo(submodelIdentifier, idShortPath, level, extent);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubmodelRepositoryApiApi#getSubmodelElementByPathValueOnlySubmodelRepo");
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
| **submodelIdentifier** | **String**| The Submodel’s unique id (UTF8-BASE64-URL-encoded) | |
| **idShortPath** | **String**| IdShort path to the submodel element (dot-separated) | |
| **level** | **String**| Determines the structural depth of the respective resource content | [optional] [default to deep] [enum: deep, core] |
| **extent** | **String**| Determines to which extent the resource is being serialized | [optional] [default to withoutBlobValue] [enum: withBlobValue, withoutBlobValue] |

### Return type

**Object**

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
| **200** | Requested submodel element |  -  |
| **403** | Forbidden |  -  |
| **400** | Bad Request, e.g. the request parameters of the format of the request body is wrong. |  -  |
| **401** | Unauthorized, e.g. the server refused the authorization attempt. |  -  |


## invokeOperationSubmodelRepo

> Result invokeOperationSubmodelRepo(submodelIdentifier, idShortPath, operationRequest, async)

Synchronously or asynchronously invokes an Operation at a specified path

### Example

```java
// Import classes:
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiClient;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiException;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.Configuration;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.models.*;
import com.github.mateusmolina.basyx.aasenvironment.client.api.SubmodelRepositoryApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        SubmodelRepositoryApiApi apiInstance = new SubmodelRepositoryApiApi(defaultClient);
        String submodelIdentifier = "submodelIdentifier_example"; // String | The Submodel’s unique id (UTF8-BASE64-URL-encoded)
        String idShortPath = "idShortPath_example"; // String | IdShort path to the submodel element (dot-separated)
        OperationRequest operationRequest = new OperationRequest(); // OperationRequest | 
        String async = "false"; // String | Determines whether an operation invocation is performed asynchronously or synchronously
        try {
            Result result = apiInstance.invokeOperationSubmodelRepo(submodelIdentifier, idShortPath, operationRequest, async);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubmodelRepositoryApiApi#invokeOperationSubmodelRepo");
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
| **submodelIdentifier** | **String**| The Submodel’s unique id (UTF8-BASE64-URL-encoded) | |
| **idShortPath** | **String**| IdShort path to the submodel element (dot-separated) | |
| **operationRequest** | [**OperationRequest**](OperationRequest.md)|  | |
| **async** | **String**| Determines whether an operation invocation is performed asynchronously or synchronously | [optional] [default to false] |

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
| **200** | Default error handling for unmentioned status codes |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |
| **403** | Forbidden |  -  |
| **400** | Bad Request, e.g. the request parameters of the format of the request body is wrong. |  -  |
| **405** | Method not allowed - Invoke only valid for Operation submodel element |  -  |
| **401** | Unauthorized, e.g. the server refused the authorization attempt. |  -  |


## patchSubmodelElementByPathValueOnlySubmodelRepo

> Result patchSubmodelElementByPathValueOnlySubmodelRepo(submodelIdentifier, idShortPath, body, level)

Updates the value of an existing SubmodelElement

### Example

```java
// Import classes:
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiClient;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiException;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.Configuration;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.models.*;
import com.github.mateusmolina.basyx.aasenvironment.client.api.SubmodelRepositoryApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        SubmodelRepositoryApiApi apiInstance = new SubmodelRepositoryApiApi(defaultClient);
        String submodelIdentifier = "submodelIdentifier_example"; // String | The Submodel’s unique id (UTF8-BASE64-URL-encoded)
        String idShortPath = "idShortPath_example"; // String | IdShort path to the submodel element (dot-separated)
        Object body = null; // Object | 
        String level = "core"; // String | Determines the structural depth of the respective resource content
        try {
            Result result = apiInstance.patchSubmodelElementByPathValueOnlySubmodelRepo(submodelIdentifier, idShortPath, body, level);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubmodelRepositoryApiApi#patchSubmodelElementByPathValueOnlySubmodelRepo");
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
| **submodelIdentifier** | **String**| The Submodel’s unique id (UTF8-BASE64-URL-encoded) | |
| **idShortPath** | **String**| IdShort path to the submodel element (dot-separated) | |
| **body** | **Object**|  | |
| **level** | **String**| Determines the structural depth of the respective resource content | [optional] [default to core] [enum: core] |

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
| **204** | Submodel updated successfully |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |
| **200** | Default error handling for unmentioned status codes |  -  |
| **403** | Forbidden |  -  |
| **400** | Bad Request, e.g. the request parameters of the format of the request body is wrong. |  -  |
| **401** | Unauthorized, e.g. the server refused the authorization attempt. |  -  |


## postSubmodel

> Result postSubmodel(submodel)

Creates a new Submodel

### Example

```java
// Import classes:
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiClient;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiException;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.Configuration;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.models.*;
import com.github.mateusmolina.basyx.aasenvironment.client.api.SubmodelRepositoryApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        SubmodelRepositoryApiApi apiInstance = new SubmodelRepositoryApiApi(defaultClient);
        Submodel submodel = new Submodel(); // Submodel | 
        try {
            Result result = apiInstance.postSubmodel(submodel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubmodelRepositoryApiApi#postSubmodel");
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
| **submodel** | [**Submodel**](Submodel.md)|  | |

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
| **201** | Submodel created successfully |  -  |
| **500** | Internal Server Error |  -  |
| **409** | Conflict, a resource which shall be created exists already. Might be thrown if a Submodel or SubmodelElement with the same ShortId is contained in a POST request. |  -  |
| **200** | Default error handling for unmentioned status codes |  -  |
| **403** | Forbidden |  -  |
| **400** | Bad Request, e.g. the request parameters of the format of the request body is wrong. |  -  |
| **401** | Unauthorized, e.g. the server refused the authorization attempt. |  -  |


## postSubmodelElementByPathSubmodelRepo

> Result postSubmodelElementByPathSubmodelRepo(submodelIdentifier, idShortPath, submodelElement, level, extent)

Creates a new submodel element at a specified path within submodel elements hierarchy

### Example

```java
// Import classes:
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiClient;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiException;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.Configuration;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.models.*;
import com.github.mateusmolina.basyx.aasenvironment.client.api.SubmodelRepositoryApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        SubmodelRepositoryApiApi apiInstance = new SubmodelRepositoryApiApi(defaultClient);
        String submodelIdentifier = "submodelIdentifier_example"; // String | The Submodel’s unique id (UTF8-BASE64-URL-encoded)
        String idShortPath = "idShortPath_example"; // String | IdShort path to the submodel element (dot-separated)
        SubmodelElement submodelElement = new SubmodelElement(); // SubmodelElement | 
        String level = "deep"; // String | Determines the structural depth of the respective resource content
        String extent = "withBlobValue"; // String | Determines to which extent the resource is being serialized
        try {
            Result result = apiInstance.postSubmodelElementByPathSubmodelRepo(submodelIdentifier, idShortPath, submodelElement, level, extent);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubmodelRepositoryApiApi#postSubmodelElementByPathSubmodelRepo");
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
| **submodelIdentifier** | **String**| The Submodel’s unique id (UTF8-BASE64-URL-encoded) | |
| **idShortPath** | **String**| IdShort path to the submodel element (dot-separated) | |
| **submodelElement** | [**SubmodelElement**](SubmodelElement.md)|  | |
| **level** | **String**| Determines the structural depth of the respective resource content | [optional] [default to deep] [enum: deep, core] |
| **extent** | **String**| Determines to which extent the resource is being serialized | [optional] [default to withoutBlobValue] [enum: withBlobValue, withoutBlobValue] |

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
| **201** | Submodel element created successfully |  -  |
| **200** | Default error handling for unmentioned status codes |  -  |
| **403** | Forbidden |  -  |
| **400** | Bad Request, e.g. the request parameters of the format of the request body is wrong. |  -  |
| **401** | Unauthorized, e.g. the server refused the authorization attempt. |  -  |


## postSubmodelElementSubmodelRepo

> Result postSubmodelElementSubmodelRepo(submodelIdentifier, submodelElement)

Creates a new submodel element

### Example

```java
// Import classes:
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiClient;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiException;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.Configuration;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.models.*;
import com.github.mateusmolina.basyx.aasenvironment.client.api.SubmodelRepositoryApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        SubmodelRepositoryApiApi apiInstance = new SubmodelRepositoryApiApi(defaultClient);
        String submodelIdentifier = "submodelIdentifier_example"; // String | The Submodel’s unique id (UTF8-BASE64-URL-encoded)
        SubmodelElement submodelElement = new SubmodelElement(); // SubmodelElement | 
        try {
            Result result = apiInstance.postSubmodelElementSubmodelRepo(submodelIdentifier, submodelElement);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubmodelRepositoryApiApi#postSubmodelElementSubmodelRepo");
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
| **submodelIdentifier** | **String**| The Submodel’s unique id (UTF8-BASE64-URL-encoded) | |
| **submodelElement** | [**SubmodelElement**](SubmodelElement.md)|  | |

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
| **201** | Submodel element created successfully |  -  |
| **200** | Default error handling for unmentioned status codes |  -  |
| **403** | Forbidden |  -  |
| **400** | Bad Request, e.g. the request parameters of the format of the request body is wrong. |  -  |
| **401** | Unauthorized, e.g. the server refused the authorization attempt. |  -  |


## putSubmodelById

> Result putSubmodelById(submodelIdentifier, submodel, level)

Updates an existing Submodel

### Example

```java
// Import classes:
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiClient;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiException;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.Configuration;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.models.*;
import com.github.mateusmolina.basyx.aasenvironment.client.api.SubmodelRepositoryApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        SubmodelRepositoryApiApi apiInstance = new SubmodelRepositoryApiApi(defaultClient);
        String submodelIdentifier = "submodelIdentifier_example"; // String | The Submodel’s unique id (UTF8-BASE64-URL-encoded)
        Submodel submodel = new Submodel(); // Submodel | 
        String level = "deep"; // String | Determines the structural depth of the respective resource content
        try {
            Result result = apiInstance.putSubmodelById(submodelIdentifier, submodel, level);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubmodelRepositoryApiApi#putSubmodelById");
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
| **submodelIdentifier** | **String**| The Submodel’s unique id (UTF8-BASE64-URL-encoded) | |
| **submodel** | [**Submodel**](Submodel.md)|  | |
| **level** | **String**| Determines the structural depth of the respective resource content | [optional] [default to deep] [enum: deep] |

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
| **204** | Submodel updated successfully |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |
| **200** | Default error handling for unmentioned status codes |  -  |
| **403** | Forbidden |  -  |
| **400** | Bad Request, e.g. the request parameters of the format of the request body is wrong. |  -  |
| **401** | Unauthorized, e.g. the server refused the authorization attempt. |  -  |

