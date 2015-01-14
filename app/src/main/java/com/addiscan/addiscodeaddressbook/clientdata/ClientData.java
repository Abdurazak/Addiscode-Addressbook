package com.addiscan.addiscodeaddressbook.clientdata;

import android.location.Address;

import com.addiscan.addiscodeaddressbook.apihandler.AddressbookAPIHandler;
import com.addiscan.addiscodeaddressbook.models.Contact;
import com.addiscan.addiscodeaddressbook.models.ContactData;
import com.addiscan.addiscodeaddressbook.models.ResponseStatus;

import java.util.ArrayList;
import java.util.List;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by Abdu on 1/14/2015.
 */
public class ClientData {
    private static List<Contact> Contacts = new ArrayList<Contact>();
    private static ResponseStatus responseStatus = new ResponseStatus();
    private static Contact contact = new Contact();

    public static List<Contact> getContacts(){
        AddressbookAPIHandler.getApiInterface().getContacts(new Callback<ContactData>() {
            @Override
            public void success(ContactData contactData, Response response) {
                for(int i=0;i<contactData.getContacts().size();i++){
                    Contacts.add(contactData.getContacts().get(i));
                }
            }

            @Override
            public void failure(RetrofitError error) {

            }
        });
        return Contacts;
    }

    public Contact getContact(String Id){
        AddressbookAPIHandler.getApiInterface().getContactDetail(Id,new Callback<Contact>() {
            @Override
            public void success(Contact contactr, Response response) {

                contact = contactr;
            }

            @Override
            public void failure(RetrofitError error) {

            }
        });
        return contact;
    }

    public void SaveContact(String firstName,String lastName,String phoneNumber,String email){

        AddressbookAPIHandler.getApiInterface().SaveContact(firstName,lastName,phoneNumber,email,new Callback<ContactData>() {
            @Override
            public void success(ContactData contactData, Response response) {

            }

            @Override
            public void failure(RetrofitError error) {

            }
        });

    }

    public void UpdateContact(String firstName,String lastName,String phoneNumber,String email){
        AddressbookAPIHandler.getApiInterface().UpdateContact(firstName,lastName,phoneNumber,email,new Callback<ContactData>() {
            @Override
            public void success(ContactData contactData, Response response) {

            }

            @Override
            public void failure(RetrofitError error) {

            }
        });
    }


}
