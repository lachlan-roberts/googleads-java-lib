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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents positions within and around a video where ads can be targeted to.
 *             
 *             <p>Example positions could be {@code pre-roll} (before the video plays), {@code post-roll} (after
 *             a video has completed playback) and {@code mid-roll} (during video playback).
 *             
 *             <p>Empty video position targeting means that all video positions are allowed. If a bumper line
 *             item has empty video position targeting it will be updated to target all bumper positions.
 *           
 * 
 * <p>Java class for VideoPositionTargeting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoPositionTargeting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="targetedPositions" type="{https://www.google.com/apis/ads/publisher/v202108}VideoPositionTarget" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoPositionTargeting", propOrder = {
    "targetedPositions"
})
public class VideoPositionTargeting {

    protected List<VideoPositionTarget> targetedPositions;

    /**
     * Gets the value of the targetedPositions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetedPositions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetedPositions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VideoPositionTarget }
     * 
     * 
     */
    public List<VideoPositionTarget> getTargetedPositions() {
        if (targetedPositions == null) {
            targetedPositions = new ArrayList<VideoPositionTarget>();
        }
        return this.targetedPositions;
    }

}
