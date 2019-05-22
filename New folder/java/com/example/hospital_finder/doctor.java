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

public class doctor extends AppCompatActivity {

    EditText e1,e2,e3,e4,e5,e6;
    Button b1;
    ProgressDialog progressDialog;
    RequestQueue requestQueue;
    String HttpUrl = "http://192.168.43.58/minorproj/doctor.php";
    String licno, id, name, email, mobile, specilization;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor);
        e1 = findViewById(R.id.ed1);
        e2 = findViewById(R.id.ed2);
        e3 = findViewById(R.id.ed3);
        e4 = findViewById(R.id.ed4);
        e5 = findViewById(R.id.ed5);
        e6 = findViewById(R.id.ed6);
        b1 = findViewById(R.id.button);

        requestQueue = Volley.newRequestQueue(doctor.this);

        progressDialog = new ProgressDialog(doctor.this);
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
                                Toast.makeText(doctor.this, ServerResponse, Toast.LENGTH_LONG).show();


                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError volleyError) {

                                // Hiding the progress dialog after all task complete.
                                progressDialog.dismiss();

                                // Showing error message if something goes wrong.
                                Toast.makeText(doctor.this, volleyError.toString(), Toast.LENGTH_LONG).show();
                            }
                        }) {
                    @Override
                    protected Map<String, String> getParams() {

                        // Creating Map String Params.
                        Map<String, String> params = new HashMap<String, String>();

                        // Adding All values to Params.
                        params.put("license", licno);
                        params.put("doctorid", id);
                        params.put("name", name);
                        params.put("emailid", email);
                        params.put("mobile", mobile);
                        params.put("specilization", specilization);

                        return params;
                    }

                };

                // Creating RequestQueue.
                RequestQueue requestQueue = Volley.newRequestQueue(doctor.this);

                // Adding the StringRequest object into requestQueue.
                requestQueue.add(stringRequest);

            }
        });

    }

    public void GetValueFromEditText() {
        licno = e1.getText().toString().trim();
        id = e2.getText().toString().trim();
        name = e3.getText().toString().trim();
        email = e4.getText().toString().trim();
        mobile = e5.getText().toString().trim();
        specilization = e6.getText().toString().trim();


    }
}
