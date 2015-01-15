package com.addiscan.addiscodeaddressbook;

import android.app.Activity;
import android.location.Address;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.addiscan.addiscodeaddressbook.apihandler.AddressbookAPIHandler;
import com.addiscan.addiscodeaddressbook.apinterface.IAddressbook;
import com.addiscan.addiscodeaddressbook.clientdata.ClientData;
import com.addiscan.addiscodeaddressbook.models.Contact;
import com.addiscan.addiscodeaddressbook.models.ContactData;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;


public class Main extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView view = (TextView) findViewById(R.id.view);

        //List<Contact> contacts = new ArrayList<Contact>();
        //contacts = ClientData.getContacts();
        Button getBtn = (Button) findViewById(R.id.getBtn);
        //ClientData.getContact("6eae2c28-03fa-42b7-8b9f-b1cb634d8386").getFirstName();
        //view.setText(ClientData.GetContacts().get(0).toString());
        view.setText(ClientData.GetContacts().size());

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
