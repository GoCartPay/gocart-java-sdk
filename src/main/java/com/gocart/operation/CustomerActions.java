package com.gocart.operation;

import com.gocart.exceptions.GoCartClientException;
import com.gocart.model.customer.Customer;
import com.gocart.model.customer.EnrollmentStatus;
import com.gocart.net.GoCartRestClient;
import com.gocart.utils.HeaderUtil;
import org.apache.hc.core5.net.URIBuilder;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

import static com.gocart.GoCart.*;

/**
 * Defines the gocart-api operations that a merchant can complete for customers using the sdk
 */
public class CustomerActions {

    private final GoCartRestClient restClient;

    public CustomerActions(GoCartRestClient goCartRestClient) {
        this.restClient = goCartRestClient;
    }

    /**
     *
     * @param customer
     * @return the enrollment status of the customer
     */
    public EnrollmentStatus enrollCustomer(Customer customer) {
        goCartProperties.isValid();

        try {
            URI customerBaseUrl = new URIBuilder(GOCART_API_BASE).setPath(FORWARD_SLASH + CUSTOMERS).build();
            Map<String, String> requestHeaders = HeaderUtil.generateDefaultHttpHeaders();
            requestHeaders.put("x-merchant-id", goCartProperties.getMerchantId());
            EnrollmentStatus enrollmentStatus = restClient.sendPost(customerBaseUrl, requestHeaders, customer,
                    200, EnrollmentStatus.class);

            return enrollmentStatus;
        } catch (URISyntaxException e) {
            throw new GoCartClientException("Invalid URI", e);
        }
    }

}
