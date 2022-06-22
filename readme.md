# GoCart Java Client Library

## Requirements

- Java 11 or later
- Merchant Id and Merchant Api Key. These should have been provided to you in onboarding.

### Maven Dependency

```xml
<dependency>
    <groupId>com.gocartpay</groupId>
    <artifactId>gocart-java-sdk</artifactId>
    <version>2.0.1</version>
</dependency>
```

Versions v1.0.2 and earlier should be **NOT** used. Versions prior to v2.0.0 did not have the ability to specify a base url and 
did not perform the correct authentication for GET methods that included a query string.

### Gradle Dependency
```
implementation 'com.gocartpay:gocart-java-sdk:2.0.1'
```

### If you would rather manually install the JAR
You can find the jar [here](https://github.com/GoCartPay/gocart-java-sdk/releases/tag/2.0.1)

## Documentation

Refer to [GoCart Documentation](https://docs.gocartpay.com/docs) for additional information that is not included in this readme.

### Configuration Required To Use The SDK
**You will need to create the following environment variables:**
- GOCART_API_BASE_URL = {your_gocart_api_base_url} <br>
  **Note:** If this environment variable is not set it will default to the GoCart staging environment URL
  - Staging: `https://api-staging.gocartpay.com`
  - Production: `https://api.gocartpay.com`
- GOCART_MERCHANT_ID = {your_merchant_id}
- GOCART_API_KEY = {your_api_key}

### Authentication
The GoCart APi uses MAC with SHA-256 to authenticate most requests. The gocart-java-sdk will do MAC with SHA-256 authorization for you.
You just need to have your [properties set](#configuration-required-to-use-the-sdk).

## Examples of How To Use The SDK
For examples of how to use the sdk visit the repository [wiki](https://github.com/GoCartPay/gocart-java-sdk/wiki/GoCart-Java-SDK-Code-Samples).




