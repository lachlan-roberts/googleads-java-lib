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
 *       Provides methods for creating, updating and retrieving {@link ActivityGroup} objects.
 *       
 *       <p>An activity group contains {@link Activity} objects. Activities have a many-to-one
 *       relationship with activity groups, meaning each activity can belong to only one activity group,
 *       but activity groups can have multiple activities. An activity group can be used to manage the
 *       activities it contains.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "ActivityGroupServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v202108")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ActivityGroupServiceInterface {


    /**
     * 
     *         Creates a new {@link ActivityGroup} objects.
     *         
     *         @param activityGroups the activity groups to be created.
     *         @return the created activity groups with their IDs filled in.
     *       
     * 
     * @param activityGroups
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202108.ActivityGroup>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202108")
    @RequestWrapper(localName = "createActivityGroups", targetNamespace = "https://www.google.com/apis/ads/publisher/v202108", className = "com.google.api.ads.admanager.jaxws.v202108.ActivityGroupServiceInterfacecreateActivityGroups")
    @ResponseWrapper(localName = "createActivityGroupsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202108", className = "com.google.api.ads.admanager.jaxws.v202108.ActivityGroupServiceInterfacecreateActivityGroupsResponse")
    public List<ActivityGroup> createActivityGroups(
        @WebParam(name = "activityGroups", targetNamespace = "https://www.google.com/apis/ads/publisher/v202108")
        List<ActivityGroup> activityGroups)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets an {@link ActivityGroupPage} of {@link ActivityGroup} objects that satisfy the given
     *         {@link Statement#query}. The following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link ActivityGroup#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link ActivityGroup#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code impressionsLookback}</td>
     *         <td>{@link ActivityGroup#impressionsLookback}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code clicksLookback}</td>
     *         <td>{@link ActivityGroup#clicksLookback}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link ActivityGroup#status}</td>
     *         </tr>
     *         </table>
     *         
     *         @param filterStatement a statement used to filter a set of activity groups
     *         @return the activity groups that match the given filter
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202108.ActivityGroupPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202108")
    @RequestWrapper(localName = "getActivityGroupsByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202108", className = "com.google.api.ads.admanager.jaxws.v202108.ActivityGroupServiceInterfacegetActivityGroupsByStatement")
    @ResponseWrapper(localName = "getActivityGroupsByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202108", className = "com.google.api.ads.admanager.jaxws.v202108.ActivityGroupServiceInterfacegetActivityGroupsByStatementResponse")
    public ActivityGroupPage getActivityGroupsByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202108")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link ActivityGroup} objects.
     *         
     *         @param activityGroups the activity groups to update.
     *         @return the updated activity groups.
     *       
     * 
     * @param activityGroups
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202108.ActivityGroup>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202108")
    @RequestWrapper(localName = "updateActivityGroups", targetNamespace = "https://www.google.com/apis/ads/publisher/v202108", className = "com.google.api.ads.admanager.jaxws.v202108.ActivityGroupServiceInterfaceupdateActivityGroups")
    @ResponseWrapper(localName = "updateActivityGroupsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202108", className = "com.google.api.ads.admanager.jaxws.v202108.ActivityGroupServiceInterfaceupdateActivityGroupsResponse")
    public List<ActivityGroup> updateActivityGroups(
        @WebParam(name = "activityGroups", targetNamespace = "https://www.google.com/apis/ads/publisher/v202108")
        List<ActivityGroup> activityGroups)
        throws ApiException_Exception
    ;

}
