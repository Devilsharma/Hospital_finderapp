package com.example.hospital_finder;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class appointment extends AppCompatActivity {
    EditText e1,e2,e3,e4,e5,e6,e7;
    Button b1;
    ProgressDialog progressDialog;
    RequestQueue requestQueue;
    String HttpUrl = "http://192.168.43.58/minorproj/appointment.php";
    String Name, Age, Phoneno, Hospitallic, Appointment1, Address, Permission;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appointment);


        e1 = findViewById(R.id.edt1);
        e2 = findViewById(R.id.edt2);
        e3 = findViewById(R.id.edt3);
        e4 = findViewById(R.id.edt4);
        e5 = findViewById(R.id.edt5);
        e6 = findViewById(R.id.edt6);
        e7 = findViewById(R.id.edt7);
        b1 = findViewById(R.id.button3);

        requestQueue = Volley.newRequestQueue(appointment.this);

        progressDialog = new ProgressDialog(appointment.this);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                progressDialog.setMessage("Please Wait, We are Inserting Your Data on Server");
                progressDialog.show();

                // Calling method to get value from EditText.
                GetValueFromEditText();

                // Creating string request with post method.
                StringRequest stringRequest = new StringRequest(Request.Method.POST, HttpUrl,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String ServerResponse) {

                                // Hiding the progress dialog after all task complete.
                                progressDialog.dismiss();

                                // Showing response message coming from server.
                                Toast.makeText(appointment.this, ServerResponse, Toast.LENGTH_LONG).show();


                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError volleyError) {

                                // Hiding the progress dialog after all task complete.
                                progressDialog.dismiss();

                                // Showing error message if something goes wrong.
                                Toast.makeText(appointment.this, volleyError.toString(), Toast.LENGTH_LONG).show();
                            }
                        }) {
                    @Override
                    protected Map<String, String> getParams() {

                        // Creating Map String Params.
                        Map<String, String> params = new HashMap<String, String>();

                        // Adding All values to Params.
                        params.put("name", Name);
                        params.put("age", Age);
                        params.put("phone_no", Phoneno);
                        params.put("h_lic_no", Hospitallic);
                        params.put("appoinment_date", Appointment1);
                        params.put("address", Address);
                        params.put("permision", Permission);

                        return params;
                    }

                };

                // Creating RequestQueue.
                RequestQueue requestQueue = Volley.newRequestQueue(appointment.this);

                // Adding the StringRequest object into requestQueue.
                requestQueue.add(stringRequest);

            }
        });

    }

    public void GetValueFromEditText() {
        Name = e1.getText().toString().trim();
        Age = e2.getText().toString().trim();
        Phoneno = e3.getText().toString().trim();
        Hospitallic = e4.getText().toString().trim();
        Appointment1 = e5.getText().toString().trim();
        Address = e6.getText().toString().trim();
        Permission = e7.getText().toString().trim();

    }
}



