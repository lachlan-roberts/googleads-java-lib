// Copyright 2019 Google LLC
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


package com.google.api.ads.admanager.jaxws.v201911;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Provides methods for creating, updating, and retrieving {@link ForecastAdjustment}s and {@link
 *       TrafficForecastSegment}s.
 *       
 *       <p>Forecast adjustments allow editing the volume and traffic composition of forecasted inventory.
 *       Traffic forecast segments divide forecasted inventory into segments to which forecast adjustments
 *       can be applied.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "AdjustmentServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v201911")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AdjustmentServiceInterface {


    /**
     * 
     *         Returns a {@link TrafficForecastAdjustmentPage} of all {@link TrafficForecastAdjustment}s that
     *         satisfy the given {@link Statement#query}.
     *         
     *         <p>The following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link TrafficForecastAdjustment#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lastModifiedDateTime}</td>
     *         <td>{@link TrafficForecastAdjustment#lastModifiedDateTime}</td>
     *         </tr>
     *         </table>
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v201911.TrafficForecastAdjustmentPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201911")
    @RequestWrapper(localName = "getTrafficAdjustmentsByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201911", className = "com.google.api.ads.admanager.jaxws.v201911.AdjustmentServiceInterfacegetTrafficAdjustmentsByStatement")
    @ResponseWrapper(localName = "getTrafficAdjustmentsByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201911", className = "com.google.api.ads.admanager.jaxws.v201911.AdjustmentServiceInterfacegetTrafficAdjustmentsByStatementResponse")
    public TrafficForecastAdjustmentPage getTrafficAdjustmentsByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201911")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Saves all of the provided traffic adjustments.
     *         
     *         <p>If there is already a {@link TrafficForecastAdjustment} saved for the same {@link
     *         TrafficTimeSeriesFilterCriteria}, the pre-existing {@link TrafficForecastAdjustment} will be
     *         completely replaced with the submitted {@link TrafficForecastAdjustment}.
     *         
     *         <p>This method is no longer supported. To programmatically create adjustments, you must
     *         update to the V202005 API.
     *       
     * 
     * @param adjustments
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v201911.TrafficForecastAdjustment>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201911")
    @RequestWrapper(localName = "updateTrafficAdjustments", targetNamespace = "https://www.google.com/apis/ads/publisher/v201911", className = "com.google.api.ads.admanager.jaxws.v201911.AdjustmentServiceInterfaceupdateTrafficAdjustments")
    @ResponseWrapper(localName = "updateTrafficAdjustmentsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201911", className = "com.google.api.ads.admanager.jaxws.v201911.AdjustmentServiceInterfaceupdateTrafficAdjustmentsResponse")
    public List<TrafficForecastAdjustment> updateTrafficAdjustments(
        @WebParam(name = "adjustments", targetNamespace = "https://www.google.com/apis/ads/publisher/v201911")
        List<TrafficForecastAdjustment> adjustments)
        throws ApiException_Exception
    ;

}
