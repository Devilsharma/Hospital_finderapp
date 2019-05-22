package com.example.hospital_finder;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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

public class treatment extends AppCompatActivity {
    EditText e1, e2, e3;
    Button b1;
    ProgressDialog progressDialog;
    RequestQueue requestQueue;
    String HttpUrl = "https://192.168.43.58/minorproj/treatment.php";
    //String HttpUrl = "https://118.185.43.122/0187cs161071/minorproj/treatment.php";
    String License, Treatment, Cost;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treatment);
        e1 = findViewById(R.id.editText7);
        e2 = findViewById(R.id.editText8);
        e3 = findViewById(R.id.editText9);
        b1 = findViewById(R.id.button2);

        requestQueue = Volley.newRequestQueue(treatment.this);

        progressDialog = new ProgressDialog(treatment.this);
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
                                Toast.makeText(treatment.this, ServerResponse, Toast.LENGTH_LONG).show();


                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError volleyError) {

                                // Hiding the progress dialog after all task complete.
                                progressDialog.dismiss();

                                // Showing error message if something goes wrong.
                                Toast.makeText(treatment.this, volleyError.toString(), Toast.LENGTH_LONG).show();
                            }
                        }) {
                    @Override
                    protected Map<String, String> getParams() {

                        // Creating Map String Params.
                        Map<String, String> params = new HashMap<String, String>();

                        // Adding All values to Params.
                        params.put("license", License);
                        params.put("treatment", Treatment);
                        params.put("cost", Cost);

                        return params;
                    }

                };

                // Creating RequestQueue.
                RequestQueue requestQueue = Volley.newRequestQueue(treatment.this);

                // Adding the StringRequest object into requestQueue.
                requestQueue.add(stringRequest);

            }
        });

    }

    public void GetValueFromEditText() {
        License = e1.getText().toString().trim();
        Treatment = e2.getText().toString().trim();
        Cost = e3.getText().toString().trim();

    }
}

