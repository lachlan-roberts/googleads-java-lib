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

/**
 * ActivityServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202008;

public interface ActivityServiceInterface extends java.rmi.Remote {

    /**
     * Creates a new {@link Activity} objects.
     *         
     *         
     * @param activities to be created.
     *         
     * @return the created activities with its IDs filled in.
     */
    public com.google.api.ads.admanager.axis.v202008.Activity[] createActivities(com.google.api.ads.admanager.axis.v202008.Activity[] activities) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202008.ApiException;

    /**
     * Gets an {@link ActivityPage} of {@link Activity} objects that
     * satisfy the given
     *         {@link Statement#query}. The following fields are supported
     * for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link Activity#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link Activity#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code expectedURL}</td>
     *         <td>{@link Activity#expectedURL}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link Activity#status}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code activityGroupId}</td>
     *         <td>{@link Activity#activityGroupId}</td>
     *         </tr>
     *         </table>
     *         
     *         
     * @param filterStatement a statement used to filter a set of activities.
     * 
     * @return the activities that match the given filter.
     */
    public com.google.api.ads.admanager.axis.v202008.ActivityPage getActivitiesByStatement(com.google.api.ads.admanager.axis.v202008.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202008.ApiException;

    /**
     * Updates the specified {@link Activity} objects.
     *         
     *         
     * @param activities to be updated.
     *         
     * @return the updated activities.
     */
    public com.google.api.ads.admanager.axis.v202008.Activity[] updateActivities(com.google.api.ads.admanager.axis.v202008.Activity[] activities) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202008.ApiException;
}
