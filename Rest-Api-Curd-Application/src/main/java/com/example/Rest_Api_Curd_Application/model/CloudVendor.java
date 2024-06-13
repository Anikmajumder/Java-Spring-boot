package com.example.Rest_Api_Curd_Application.model;

public class CloudVendor {
    
    private String vendorId;
    private String vendorName;
    private String VendorAddress;
    private String VendorPhoneNumber;

    public CloudVendor(){

    }
    
    
    public CloudVendor(String vendorId, String vendorName, String vendorAddress, String vendorPhoneNumber) {
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.VendorAddress = vendorAddress;
        this.VendorPhoneNumber = vendorPhoneNumber;
    }


    public String getVendorId() {
        return vendorId;
    }


    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }


    public String getVendorName() {
        return vendorName;
    }


    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }


    public String getVendorAddress() {
        return VendorAddress;
    }


    public void setVendorAddress(String vendorAddress) {
        VendorAddress = vendorAddress;
    }


    public String getVendorPhoneNumber() {
        return VendorPhoneNumber;
    }


    public void setVendorPhoneNumber(String vendorPhoneNumber) {
        VendorPhoneNumber = vendorPhoneNumber;
    }



    
}
