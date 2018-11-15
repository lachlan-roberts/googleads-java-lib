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
 * ProductMarketplaceInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v201811;


/**
 * Marketplace information for a programmatic {@link Product}.
 */
public class ProductMarketplaceInfo  implements java.io.Serializable {
    /* The {@link AdExchangeEnvironment} of the AdX Web Property this
     * product will serve to.
     *                 <span class="constraint ReadOnly">This attribute is
     * read-only when:<ul><li>using programmatic guaranteed, using sales
     * management.</li></ul></span>
     *                 <span class="constraint Required">This attribute is
     * required when:<ul><li>using programmatic guaranteed, not using sales
     * management.</li></ul></span> */
    private com.google.api.ads.admanager.axis.v201811.AdExchangeEnvironment adExchangeEnvironment;

    /* Additional terms shown to the buyer in Marketplace.
     *                 When using sales management, this attribute is populated
     * with the
     *                 {@link ProductTemplateMarketplaceInfo#additionalTerms
     * additional terms} value from
     *                 the product template this product is created from.
     * To overwrite this, set the
     *                 {@link #additionalTermsSource} to {@link ValueSourceType#DIRECTLY_SPECIFIED}
     * when setting the value of this field. */
    private java.lang.String additionalTerms;

    /* Specifies the source of the {@link #additionalTerms} value.
     * To revert an overridden value to its default, set this field to {@link
     * ValueSourceType#PARENT}. */
    private com.google.api.ads.admanager.axis.v201811.ValueSourceType additionalTermsSource;

    public ProductMarketplaceInfo() {
    }

    public ProductMarketplaceInfo(
           com.google.api.ads.admanager.axis.v201811.AdExchangeEnvironment adExchangeEnvironment,
           java.lang.String additionalTerms,
           com.google.api.ads.admanager.axis.v201811.ValueSourceType additionalTermsSource) {
           this.adExchangeEnvironment = adExchangeEnvironment;
           this.additionalTerms = additionalTerms;
           this.additionalTermsSource = additionalTermsSource;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adExchangeEnvironment", getAdExchangeEnvironment())
            .add("additionalTerms", getAdditionalTerms())
            .add("additionalTermsSource", getAdditionalTermsSource())
            .toString();
    }

    /**
     * Gets the adExchangeEnvironment value for this ProductMarketplaceInfo.
     * 
     * @return adExchangeEnvironment   * The {@link AdExchangeEnvironment} of the AdX Web Property this
     * product will serve to.
     *                 <span class="constraint ReadOnly">This attribute is
     * read-only when:<ul><li>using programmatic guaranteed, using sales
     * management.</li></ul></span>
     *                 <span class="constraint Required">This attribute is
     * required when:<ul><li>using programmatic guaranteed, not using sales
     * management.</li></ul></span>
     */
    public com.google.api.ads.admanager.axis.v201811.AdExchangeEnvironment getAdExchangeEnvironment() {
        return adExchangeEnvironment;
    }


    /**
     * Sets the adExchangeEnvironment value for this ProductMarketplaceInfo.
     * 
     * @param adExchangeEnvironment   * The {@link AdExchangeEnvironment} of the AdX Web Property this
     * product will serve to.
     *                 <span class="constraint ReadOnly">This attribute is
     * read-only when:<ul><li>using programmatic guaranteed, using sales
     * management.</li></ul></span>
     *                 <span class="constraint Required">This attribute is
     * required when:<ul><li>using programmatic guaranteed, not using sales
     * management.</li></ul></span>
     */
    public void setAdExchangeEnvironment(com.google.api.ads.admanager.axis.v201811.AdExchangeEnvironment adExchangeEnvironment) {
        this.adExchangeEnvironment = adExchangeEnvironment;
    }


    /**
     * Gets the additionalTerms value for this ProductMarketplaceInfo.
     * 
     * @return additionalTerms   * Additional terms shown to the buyer in Marketplace.
     *                 When using sales management, this attribute is populated
     * with the
     *                 {@link ProductTemplateMarketplaceInfo#additionalTerms
     * additional terms} value from
     *                 the product template this product is created from.
     * To overwrite this, set the
     *                 {@link #additionalTermsSource} to {@link ValueSourceType#DIRECTLY_SPECIFIED}
     * when setting the value of this field.
     */
    public java.lang.String getAdditionalTerms() {
        return additionalTerms;
    }


    /**
     * Sets the additionalTerms value for this ProductMarketplaceInfo.
     * 
     * @param additionalTerms   * Additional terms shown to the buyer in Marketplace.
     *                 When using sales management, this attribute is populated
     * with the
     *                 {@link ProductTemplateMarketplaceInfo#additionalTerms
     * additional terms} value from
     *                 the product template this product is created from.
     * To overwrite this, set the
     *                 {@link #additionalTermsSource} to {@link ValueSourceType#DIRECTLY_SPECIFIED}
     * when setting the value of this field.
     */
    public void setAdditionalTerms(java.lang.String additionalTerms) {
        this.additionalTerms = additionalTerms;
    }


    /**
     * Gets the additionalTermsSource value for this ProductMarketplaceInfo.
     * 
     * @return additionalTermsSource   * Specifies the source of the {@link #additionalTerms} value.
     * To revert an overridden value to its default, set this field to {@link
     * ValueSourceType#PARENT}.
     */
    public com.google.api.ads.admanager.axis.v201811.ValueSourceType getAdditionalTermsSource() {
        return additionalTermsSource;
    }


    /**
     * Sets the additionalTermsSource value for this ProductMarketplaceInfo.
     * 
     * @param additionalTermsSource   * Specifies the source of the {@link #additionalTerms} value.
     * To revert an overridden value to its default, set this field to {@link
     * ValueSourceType#PARENT}.
     */
    public void setAdditionalTermsSource(com.google.api.ads.admanager.axis.v201811.ValueSourceType additionalTermsSource) {
        this.additionalTermsSource = additionalTermsSource;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductMarketplaceInfo)) return false;
        ProductMarketplaceInfo other = (ProductMarketplaceInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adExchangeEnvironment==null && other.getAdExchangeEnvironment()==null) || 
             (this.adExchangeEnvironment!=null &&
              this.adExchangeEnvironment.equals(other.getAdExchangeEnvironment()))) &&
            ((this.additionalTerms==null && other.getAdditionalTerms()==null) || 
             (this.additionalTerms!=null &&
              this.additionalTerms.equals(other.getAdditionalTerms()))) &&
            ((this.additionalTermsSource==null && other.getAdditionalTermsSource()==null) || 
             (this.additionalTermsSource!=null &&
              this.additionalTermsSource.equals(other.getAdditionalTermsSource())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAdExchangeEnvironment() != null) {
            _hashCode += getAdExchangeEnvironment().hashCode();
        }
        if (getAdditionalTerms() != null) {
            _hashCode += getAdditionalTerms().hashCode();
        }
        if (getAdditionalTermsSource() != null) {
            _hashCode += getAdditionalTermsSource().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductMarketplaceInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201811", "ProductMarketplaceInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adExchangeEnvironment");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201811", "adExchangeEnvironment"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201811", "AdExchangeEnvironment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalTerms");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201811", "additionalTerms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalTermsSource");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201811", "additionalTermsSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201811", "ValueSourceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
