package com.addiscan.addiscodeaddressbook.apinterface;

import com.addiscan.addiscodeaddressbook.models.*;

import retrofit.Callback;
import retrofit.http.*;

/**
 * Created by Abdu on 1/14/2015.
 */
public interface IAddressbook {
    @GET("/Contact")
    public void getContacts(Callback<ContactData>response);
    @GET("/Contact/{Id}")
    public void getContactDetail(@Path("Id")String ContactId,Callback<Contact>response);
    @POST("/Contact")
    public void SaveContact(String firstName,String lastName,String phoneNumber,String email,Callback<ContactData>response);
    @PUT("/Contact")
    public void UpdateContact(String firstName,String LastName,String PhoneNumber,String Email,Callback<ContactData>response);
    @DELETE("/Contact/{Id}")
    public void DeleteContact(@Path("Id")String ContactId,Callback<ResponseStatus>response);
}
