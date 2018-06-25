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

/**
 * FeedItemTargetServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201806.cm;

public interface FeedItemTargetServiceInterface extends java.rmi.Remote {

    /**
     * Returns a list of FeedItemTargets that meet the selector criteria.
     * 
     *         
     * @param selector Determines which FeedItemTargets to return. If empty
     * all FeedItemTargets are
     *         returned.
     *         
     * @return The list of FeedItemTargets.
     *         
     * @throws ApiException Indicates a problem with the request.
     */
    public com.google.api.ads.adwords.axis.v201806.cm.FeedItemTargetPage get(com.google.api.ads.adwords.axis.v201806.cm.Selector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201806.cm.ApiException;

    /**
     * Add and remove FeedItemTargets.
     *         
     *         
     * @param operations The operations to apply.
     *         
     * @return The resulting FeedItemTargets.
     *         
     * @throws ApiException Indicates a problem with the request.
     */
    public com.google.api.ads.adwords.axis.v201806.cm.FeedItemTargetReturnValue mutate(com.google.api.ads.adwords.axis.v201806.cm.FeedItemTargetOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201806.cm.ApiException;

    /**
     * Returns the list of FeedItemTargets that match the query.
     *         
     *         
     * @param query The SQL-like AWQL query string
     *         
     * @return A list of FeedItemTargets
     *         
     * @throws ApiException when the query is invalid or there are errors
     * processing the request.
     */
    public com.google.api.ads.adwords.axis.v201806.cm.FeedItemTargetPage query(java.lang.String query) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201806.cm.ApiException;
}