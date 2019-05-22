package com.example.hospital_finder;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    EditText Email, Password;
    Button loginbtn ,user;
    String PasswordHolder, EmailHolder;
    String finalResult ;
    String HttpURL = "http://192.168.43.58/minorproj/login.php";
    Boolean CheckEditText ;
    ProgressDialog progressDialog;
    HashMap<String,String> hashMap = new HashMap<>();
    HttpParse httpParse = new HttpParse();
    public static final String UserEmail = "";
    private static final String TAG = "MainActivity";
        Button create ;
        SearchView search;
        ListView list;
        String [] hopital_name={"Shraddha hospital","Vijay shree hospital","Somnath hospital","Ram krishna hospital"};
        ArrayAdapter<String> adapter;



    //This is our viewPager

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginbtn=(Button)findViewById(R.id.login);
        user=(Button)findViewById(R.id.create2);
        create=(Button)findViewById(R.id.create);
        list=(ListView)findViewById(R.id.li);
        search =(SearchView) findViewById(R.id.se);
        Email=findViewById(R.id.editText);
        Password=findViewById(R.id.editText2);
        adapter= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,hopital_name);
        list.setAdapter(adapter);
        search.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String text) {


                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                adapter.getFilter().filter(newText);
                return false;
            }
        });




        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(MainActivity.this, Hospital_finder2Activity.class);
                startActivity(inte);
            }
        });



        //Login

            loginbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {  CheckEditTextIsEmptyOrNot();

                    if(CheckEditText){

                        UserLoginFunction(EmailHolder, PasswordHolder);


                    }
                    else {

                        Toast.makeText(MainActivity.this, "Please fill all form fields.", Toast.LENGTH_LONG).show();

                    }



                }
            });
            user.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent =new Intent(MainActivity.this,user.class);
                    startActivity(intent);
                }
            });

    }
    public void CheckEditTextIsEmptyOrNot(){

        EmailHolder = Email.getText().toString();
        PasswordHolder = Password.getText().toString();

        if(TextUtils.isEmpty(EmailHolder) || TextUtils.isEmpty(PasswordHolder))
        {
            CheckEditText = false;
        }
        else {

            CheckEditText = true ;
        }
    }

    public void UserLoginFunction(final String email, final String password){

        class UserLoginClass extends AsyncTask<String,Void,String> {

            @Override
            protected void onPreExecute() {
                super.onPreExecute();

                progressDialog = ProgressDialog.show(MainActivity.this,"Loading Data",null,true,true);
            }

            @Override
            protected void onPostExecute(String httpResponseMsg) {

                super.onPostExecute(httpResponseMsg);

                progressDialog.dismiss();
                Log.d(TAG, "onPostExecute: "+ httpResponseMsg);

                if(httpResponseMsg.equals("Connected successfullyData Matched")){
                    Log.e(TAG, "onPostExecute: inside this" );
                    Intent intent = new Intent(MainActivity.this, entered_login_page.class);
                    intent.putExtra(UserEmail,email);

                    startActivity(intent);
                    MainActivity.this.finish();
                }
                else{

                    Toast.makeText(MainActivity.this,httpResponseMsg,Toast.LENGTH_LONG).show();

                }

            }

            @Override
            protected String doInBackground(String... params) {

                hashMap.put("email",params[0]);

                hashMap.put("password",params[1]);

                finalResult = httpParse.postRequest(hashMap, HttpURL);

                return finalResult;
            }
        }

        UserLoginClass userLoginClass = new UserLoginClass();

        userLoginClass.execute(email,password);
    }
}

