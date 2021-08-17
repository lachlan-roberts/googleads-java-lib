// Copyright 2021 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.


package com.google.api.ads.admanager.jaxws.v202108;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "AdjustmentService", targetNamespace = "https://www.google.com/apis/ads/publisher/v202108", wsdlLocation = "https://ads.google.com/apis/ads/publisher/v202108/AdjustmentService?wsdl")
public class AdjustmentService
    extends Service
{

    private final static URL ADJUSTMENTSERVICE_WSDL_LOCATION;
    private final static WebServiceException ADJUSTMENTSERVICE_EXCEPTION;
    private final static QName ADJUSTMENTSERVICE_QNAME = new QName("https://www.google.com/apis/ads/publisher/v202108", "AdjustmentService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://ads.google.com/apis/ads/publisher/v202108/AdjustmentService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ADJUSTMENTSERVICE_WSDL_LOCATION = url;
        ADJUSTMENTSERVICE_EXCEPTION = e;
    }

    public AdjustmentService() {
        super(__getWsdlLocation(), ADJUSTMENTSERVICE_QNAME);
    }

    public AdjustmentService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns AdjustmentServiceInterface
     */
    @WebEndpoint(name = "AdjustmentServiceInterfacePort")
    public AdjustmentServiceInterface getAdjustmentServiceInterfacePort() {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v202108", "AdjustmentServiceInterfacePort"), AdjustmentServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AdjustmentServiceInterface
     */
    @WebEndpoint(name = "AdjustmentServiceInterfacePort")
    public AdjustmentServiceInterface getAdjustmentServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v202108", "AdjustmentServiceInterfacePort"), AdjustmentServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ADJUSTMENTSERVICE_EXCEPTION!= null) {
            throw ADJUSTMENTSERVICE_EXCEPTION;
        }
        return ADJUSTMENTSERVICE_WSDL_LOCATION;
    }

}
