// Copyright 2018 Google LLC
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


package com.google.api.ads.admanager.jaxws.v201811;

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
 *       Provides methods for creating, updating and retrieving {@link DaiAuthenticationKey} objects.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "DaiAuthenticationKeyServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v201811")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DaiAuthenticationKeyServiceInterface {


    /**
     * 
     *         Creates new {@link DaiAuthenticationKey} objects.
     *         
     *         <p>The following fields are required:
     *         
     *         <ul>
     *         <li>{@link DaiAuthenticationKey#name}
     *         </ul>
     *         
     *         @param daiAuthenticationKeys the DAI authentication keys to create
     *         @return the created DAI authentication keys with their IDs filled in
     *       
     * 
     * @param daiAuthenticationKeys
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v201811.DaiAuthenticationKey>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201811")
    @RequestWrapper(localName = "createDaiAuthenticationKeys", targetNamespace = "https://www.google.com/apis/ads/publisher/v201811", className = "com.google.api.ads.admanager.jaxws.v201811.DaiAuthenticationKeyServiceInterfacecreateDaiAuthenticationKeys")
    @ResponseWrapper(localName = "createDaiAuthenticationKeysResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201811", className = "com.google.api.ads.admanager.jaxws.v201811.DaiAuthenticationKeyServiceInterfacecreateDaiAuthenticationKeysResponse")
    public List<DaiAuthenticationKey> createDaiAuthenticationKeys(
        @WebParam(name = "daiAuthenticationKeys", targetNamespace = "https://www.google.com/apis/ads/publisher/v201811")
        List<DaiAuthenticationKey> daiAuthenticationKeys)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@link DaiAuthenticationKeyPage} of {@link DaiAuthenticationKey} objects that satisfy
     *         the given {@link Statement#query}. The following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link DaiAuthenticationKey#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link DaiAuthenticationKey#status}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link DaiAuthenticationKey#name}</td>
     *         </tr>
     *         </table>
     *         
     *         @param filterStatement a Publisher Query Language statement to filter a list of DAI
     *         authentication keys
     *         @return the DAI authentication keys that match the filter
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v201811.DaiAuthenticationKeyPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201811")
    @RequestWrapper(localName = "getDaiAuthenticationKeysByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201811", className = "com.google.api.ads.admanager.jaxws.v201811.DaiAuthenticationKeyServiceInterfacegetDaiAuthenticationKeysByStatement")
    @ResponseWrapper(localName = "getDaiAuthenticationKeysByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201811", className = "com.google.api.ads.admanager.jaxws.v201811.DaiAuthenticationKeyServiceInterfacegetDaiAuthenticationKeysByStatementResponse")
    public DaiAuthenticationKeyPage getDaiAuthenticationKeysByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201811")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Performs actions on {@link DaiAuthenticationKey} objects that match the given {@link
     *         Statement#query}.
     *         
     *         <p>DAI authentication keys cannot be deactivated if there are active {@link LiveStreamEvent}s
     *         or Content Sources that are using them.
     *         
     *         @param daiAuthenticationKeyAction the action to perform
     *         @param filterStatement a Publisher Query Language statement used to filter a set of live stream
     *         events
     *         @return the result of the action performed
     *       
     * 
     * @param filterStatement
     * @param daiAuthenticationKeyAction
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v201811.UpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201811")
    @RequestWrapper(localName = "performDaiAuthenticationKeyAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201811", className = "com.google.api.ads.admanager.jaxws.v201811.DaiAuthenticationKeyServiceInterfaceperformDaiAuthenticationKeyAction")
    @ResponseWrapper(localName = "performDaiAuthenticationKeyActionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201811", className = "com.google.api.ads.admanager.jaxws.v201811.DaiAuthenticationKeyServiceInterfaceperformDaiAuthenticationKeyActionResponse")
    public UpdateResult performDaiAuthenticationKeyAction(
        @WebParam(name = "daiAuthenticationKeyAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201811")
        DaiAuthenticationKeyAction daiAuthenticationKeyAction,
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201811")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link DaiAuthenticationKey} objects.
     *         
     *         @param daiAuthenticationKeys the video DAI authentication keys to update
     *         @return the updated DAI authentication keys
     *         @throws ApiException if there is an error updating the DAI authentication keys
     *       
     * 
     * @param daiAuthenticationKeys
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v201811.DaiAuthenticationKey>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201811")
    @RequestWrapper(localName = "updateDaiAuthenticationKeys", targetNamespace = "https://www.google.com/apis/ads/publisher/v201811", className = "com.google.api.ads.admanager.jaxws.v201811.DaiAuthenticationKeyServiceInterfaceupdateDaiAuthenticationKeys")
    @ResponseWrapper(localName = "updateDaiAuthenticationKeysResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201811", className = "com.google.api.ads.admanager.jaxws.v201811.DaiAuthenticationKeyServiceInterfaceupdateDaiAuthenticationKeysResponse")
    public List<DaiAuthenticationKey> updateDaiAuthenticationKeys(
        @WebParam(name = "daiAuthenticationKeys", targetNamespace = "https://www.google.com/apis/ads/publisher/v201811")
        List<DaiAuthenticationKey> daiAuthenticationKeys)
        throws ApiException_Exception
    ;

}
