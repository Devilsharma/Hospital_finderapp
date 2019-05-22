package com.example.hospital_finder;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class Hospital_finder2Activity extends AppCompatActivity {

    TextView mName,mlicence,memail,madress,mstate,mdistrict,mpin,mPhone,mPassword,mowner,mstdyear,mpermission;
    EditText Edit_name,Edit_licence,Edit_email,Edit_address,Edit_state,Edit_district,Edit_pin,Edit_phone,Edit_password,Edit_owner,Edit_stdyear,Edit_permission;
    Button mSubmit;
     RadioGroup radioSexGroup;
     RadioButton radioSexButton;

    // Creating Volley RequestQueue.
    RequestQueue requestQueue;

    // Create string variable to hold the EditText Value.
    String NameHolder, licenceHolder, emailHolder, addressHolder, stateHolder, districtHolder,pinHolder,phoneHolder,passwordHolder,ownerHolder,stdyearHolder,permissionHolder,q1Holder;

    // Creating Progress dialog.
    ProgressDialog progressDialog;

    // Storing server url into String variable.
   String HttpUrl = "http://192.168.43.58/minorproj/Hospitalfinder.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital_finder2);

        mName = (TextView)findViewById(R.id.textView);
        mlicence= (TextView)findViewById(R.id.textView8);
        memail = (TextView)findViewById(R.id.textView7);
        madress= (TextView)findViewById(R.id.textView11);
        mstate=  (TextView)findViewById(R.id.textView12);
        mdistrict = (TextView)findViewById(R.id.textView10);
        mpin = (TextView)findViewById(R.id.textView13);
        mPhone=  (TextView)findViewById(R.id.textView6);
        mPassword=  (TextView)findViewById(R.id.textView20);
        mowner=  (TextView)findViewById(R.id.textView22);
        mstdyear=  (TextView)findViewById(R.id.textView23);
        mpermission=  (TextView)findViewById(R.id.textView21);

        Edit_name=(EditText)findViewById(R.id.editText5);
        Edit_licence=(EditText)findViewById(R.id.editText4);
        Edit_email=(EditText)findViewById(R.id.editText7);
        Edit_address=(EditText)findViewById(R.id.editText8);
        Edit_state=(EditText)findViewById(R.id.editText11);
        Edit_district=(EditText)findViewById(R.id.editText10);
        Edit_pin=(EditText) findViewById(R.id.editText9);
        Edit_phone=(EditText) findViewById(R.id.editText12);
        Edit_password=(EditText) findViewById(R.id.editText13);
        Edit_owner=(EditText) findViewById(R.id.editText14);
        Edit_stdyear=(EditText) findViewById(R.id.editText15);
        Edit_permission=(EditText) findViewById(R.id.editText16);
        radioSexGroup = (RadioGroup) findViewById(R.id.radioSex);
        //btnDisplay = (Button) findViewById(R.id.btnDisplay);

        mSubmit = (Button) findViewById(R.id.button3);
        int selectedId = radioSexGroup.getCheckedRadioButtonId();

        // find the radiobutton by returned id
        radioSexButton = (RadioButton) findViewById(selectedId);

        Toast.makeText(Hospital_finder2Activity.this,
                radioSexButton.getText(), Toast.LENGTH_SHORT).show();
     /*   RadioGroup rg = (RadioGroup) findViewById(R.id.radioSex);
        final String value =
                ((RadioButton)findViewById(rg.getCheckedRadioButtonId()))
                        .getText().toString();

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                Toast.makeText(getBaseContext(), value, Toast.LENGTH_SHORT).show();
*/

        // Creating Volley newRequestQueue .
        requestQueue = Volley.newRequestQueue(Hospital_finder2Activity.this);

        progressDialog = new ProgressDialog(Hospital_finder2Activity.this);



        mSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //code.....

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
                                Toast.makeText(Hospital_finder2Activity.this, ServerResponse, Toast.LENGTH_LONG).show();



                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError volleyError) {

                                // Hiding the progress dialog after all task complete.
                                progressDialog.dismiss();

                                // Showing error message if something goes wrong.
                                Toast.makeText(Hospital_finder2Activity.this, volleyError.toString(), Toast.LENGTH_LONG).show();
                            }
                        }) {
                    @Override
                    protected Map<String, String> getParams() {

                        // Creating Map String Params.
                        Map<String, String> params = new HashMap<String, String>();

                        // Adding All values to Params.
                        params.put("name", NameHolder);
                        params.put("licence", licenceHolder);
                        params.put("email", emailHolder);
                        params.put("address", addressHolder);
                        params.put("state", stateHolder);
                        params.put("district", districtHolder);
                        params.put("pin_code", pinHolder);
                        params.put("phone_no", phoneHolder);
                        params.put("password", passwordHolder);
                        params.put("owner", ownerHolder);
                        params.put("std_year", stdyearHolder);
                        params.put("q1", q1Holder);

                        return params;
                    }

                };

                // Creating RequestQueue.
                RequestQueue requestQueue = Volley.newRequestQueue(Hospital_finder2Activity.this);

                // Adding the StringRequest object into requestQueue.
                requestQueue.add(stringRequest);


            }
        });


    }


    // Creating method to get value from EditText.
    public void GetValueFromEditText(){
        NameHolder = Edit_name.getText().toString().trim();
        licenceHolder = Edit_licence.getText().toString().trim();
        emailHolder = Edit_email.getText().toString().trim();
        stateHolder = Edit_state.getText().toString().trim();
        addressHolder=Edit_address.getText().toString().trim();
        districtHolder = Edit_district.getText().toString().trim();
        pinHolder = Edit_pin.getText().toString().trim();
        phoneHolder = Edit_phone.getText().toString().trim();
        passwordHolder = Edit_password.getText().toString().trim();
        ownerHolder = Edit_owner.getText().toString().trim();
        stdyearHolder = Edit_stdyear.getText().toString().trim();
       // radioSexGroup = RadioGroup.OnCheckedChangeListener.toString().trim;
     //   radioSexGroup = RadioGrou.


    }
}
