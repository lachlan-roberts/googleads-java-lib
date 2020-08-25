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
 *       Provides methods for creating, updating and retrieving {@link Order} objects.
 *       <p>
 *       An order is a grouping of {@link LineItem} objects. Line items have a
 *       many-to-one relationship with orders, meaning each line item can belong to only one
 *       order, but orders can have multiple line items. An order can be used to
 *       manage the line items it contains.
 *       </p>
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "OrderServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v202008")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface OrderServiceInterface {


    /**
     * 
     *         Creates new {@link Order} objects.
     *         
     *         @param orders the orders to create
     *         @return the created orders with their IDs filled in
     *       
     * 
     * @param orders
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202008.Order>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202008")
    @RequestWrapper(localName = "createOrders", targetNamespace = "https://www.google.com/apis/ads/publisher/v202008", className = "com.google.api.ads.admanager.jaxws.v202008.OrderServiceInterfacecreateOrders")
    @ResponseWrapper(localName = "createOrdersResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202008", className = "com.google.api.ads.admanager.jaxws.v202008.OrderServiceInterfacecreateOrdersResponse")
    public List<Order> createOrders(
        @WebParam(name = "orders", targetNamespace = "https://www.google.com/apis/ads/publisher/v202008")
        List<Order> orders)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets an {@link OrderPage} of {@link Order} objects that satisfy the given
     *         {@link Statement#query}. The following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code advertiserId}</td>
     *         <td>{@link Order#advertiserId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code endDateTime}</td>
     *         <td>{@link Order#endDateTime}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link Order#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link Order#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code salespersonId}</td>
     *         <td>{@link Order#salespersonId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code startDateTime}</td>
     *         <td>{@link Order#startDateTime}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link Order#status}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code traffickerId}</td>
     *         <td>{@link Order#traffickerId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lastModifiedDateTime}</td>
     *         <td>{@link Order#lastModifiedDateTime}</td>
     *         </tr>
     *         </table>
     *         
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of orders
     *         @return the orders that match the given filter
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202008.OrderPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202008")
    @RequestWrapper(localName = "getOrdersByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202008", className = "com.google.api.ads.admanager.jaxws.v202008.OrderServiceInterfacegetOrdersByStatement")
    @ResponseWrapper(localName = "getOrdersByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202008", className = "com.google.api.ads.admanager.jaxws.v202008.OrderServiceInterfacegetOrdersByStatementResponse")
    public OrderPage getOrdersByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202008")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Performs actions on {@link Order} objects that match the given
     *         {@link Statement#query}.
     *         
     *         @param orderAction the action to perform
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of orders
     *         @return the result of the action performed
     *       
     * 
     * @param filterStatement
     * @param orderAction
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202008.UpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202008")
    @RequestWrapper(localName = "performOrderAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v202008", className = "com.google.api.ads.admanager.jaxws.v202008.OrderServiceInterfaceperformOrderAction")
    @ResponseWrapper(localName = "performOrderActionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202008", className = "com.google.api.ads.admanager.jaxws.v202008.OrderServiceInterfaceperformOrderActionResponse")
    public UpdateResult performOrderAction(
        @WebParam(name = "orderAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v202008")
        OrderAction orderAction,
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202008")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link Order} objects.
     *         
     *         @param orders the orders to update
     *         @return the updated orders
     *       
     * 
     * @param orders
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202008.Order>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202008")
    @RequestWrapper(localName = "updateOrders", targetNamespace = "https://www.google.com/apis/ads/publisher/v202008", className = "com.google.api.ads.admanager.jaxws.v202008.OrderServiceInterfaceupdateOrders")
    @ResponseWrapper(localName = "updateOrdersResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202008", className = "com.google.api.ads.admanager.jaxws.v202008.OrderServiceInterfaceupdateOrdersResponse")
    public List<Order> updateOrders(
        @WebParam(name = "orders", targetNamespace = "https://www.google.com/apis/ads/publisher/v202008")
        List<Order> orders)
        throws ApiException_Exception
    ;

}
