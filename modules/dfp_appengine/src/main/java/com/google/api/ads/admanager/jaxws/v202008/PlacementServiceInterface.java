// Copyright 2020 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202008;

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
 *       Provides methods for creating, updating and retrieving {@link Placement}
 *       objects.
 *       
 *       <p>You can use a placement to group ad units. For example, you might have a
 *       placement that focuses on sports sites, which may be spread across different
 *       branches of your inventory. You might also have a "fire sale" placement that
 *       includes ad units that have not been selling and are consequently priced very
 *       attractively.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "PlacementServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v202008")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PlacementServiceInterface {


    /**
     * 
     *         Creates new {@link Placement} objects.
     *         
     *         @param placements the placements to create
     *         @return the new placements, with their IDs filled in
     *       
     * 
     * @param placements
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202008.Placement>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202008")
    @RequestWrapper(localName = "createPlacements", targetNamespace = "https://www.google.com/apis/ads/publisher/v202008", className = "com.google.api.ads.admanager.jaxws.v202008.PlacementServiceInterfacecreatePlacements")
    @ResponseWrapper(localName = "createPlacementsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202008", className = "com.google.api.ads.admanager.jaxws.v202008.PlacementServiceInterfacecreatePlacementsResponse")
    public List<Placement> createPlacements(
        @WebParam(name = "placements", targetNamespace = "https://www.google.com/apis/ads/publisher/v202008")
        List<Placement> placements)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@link PlacementPage} of {@link Placement} objects that satisfy the
     *         given {@link Statement#query}. The following fields are supported for
     *         filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code description}</td>
     *         <td>{@link Placement#description}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link Placement#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link Placement#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code placementCode}</td>
     *         <td>{@link Placement#placementCode}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link Placement#status}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lastModifiedDateTime}</td>
     *         <td>{@link Placement#lastModifiedDateTime}</td>
     *         </tr>
     *         </table>
     *         
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of placements
     *         @return the placements that match the given filter
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202008.PlacementPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202008")
    @RequestWrapper(localName = "getPlacementsByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202008", className = "com.google.api.ads.admanager.jaxws.v202008.PlacementServiceInterfacegetPlacementsByStatement")
    @ResponseWrapper(localName = "getPlacementsByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202008", className = "com.google.api.ads.admanager.jaxws.v202008.PlacementServiceInterfacegetPlacementsByStatementResponse")
    public PlacementPage getPlacementsByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202008")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Performs actions on {@link Placement} objects that match the given
     *         {@link Statement#query}.
     *         
     *         @param placementAction the action to perform
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of placements
     *         @return the result of the action performed
     *       
     * 
     * @param placementAction
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202008.UpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202008")
    @RequestWrapper(localName = "performPlacementAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v202008", className = "com.google.api.ads.admanager.jaxws.v202008.PlacementServiceInterfaceperformPlacementAction")
    @ResponseWrapper(localName = "performPlacementActionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202008", className = "com.google.api.ads.admanager.jaxws.v202008.PlacementServiceInterfaceperformPlacementActionResponse")
    public UpdateResult performPlacementAction(
        @WebParam(name = "placementAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v202008")
        PlacementAction placementAction,
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202008")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link Placement} objects.
     *         
     *         @param placements the placements to update
     *         @return the updated placements
     *       
     * 
     * @param placements
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202008.Placement>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202008")
    @RequestWrapper(localName = "updatePlacements", targetNamespace = "https://www.google.com/apis/ads/publisher/v202008", className = "com.google.api.ads.admanager.jaxws.v202008.PlacementServiceInterfaceupdatePlacements")
    @ResponseWrapper(localName = "updatePlacementsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202008", className = "com.google.api.ads.admanager.jaxws.v202008.PlacementServiceInterfaceupdatePlacementsResponse")
    public List<Placement> updatePlacements(
        @WebParam(name = "placements", targetNamespace = "https://www.google.com/apis/ads/publisher/v202008")
        List<Placement> placements)
        throws ApiException_Exception
    ;

}
