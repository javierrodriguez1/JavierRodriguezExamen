package com.example.alvaaro.javierrodriguezexamen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvPaises;

    private static final String URL="https://restcountries.eu/rest/v2/all";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lvPaises = findViewById(R.id.lvPaises);


        RequestQueue request = Volley.newRequestQueue(this);
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, URL, null, new Response.Listener<JSONArray>(){

            @Override
            public void onResponse(JSONArray response) {

                ArrayList <Pais> listaDatos=new ArrayList<Pais>();
                try {

                    JSONArray jsonArrayPrincipal=new JSONArray(response.toString(0));


                    for(int i=0; i<jsonArrayPrincipal.length(); i++){
                        String nombre = jsonArrayPrincipal.getJSONArray(i).getJSONObject(i).getString("name");
                        String clave = jsonArrayPrincipal.getJSONArray(i).getJSONObject(i).getString("alpha2Code");
                        String capital = jsonArrayPrincipal.getJSONArray(i).getJSONObject(i).getString("capital");
                        String continente = jsonArrayPrincipal.getJSONArray(i).getJSONObject(i).getString("region");
                        String poblacion = jsonArrayPrincipal.getJSONArray(i).getJSONObject(i).getString("population");

                        String paisesFronterizos = jsonArrayPrincipal.getJSONArray(i).getJSONObject(i).getJSONArray("borders").getJSONObject(0).getString("");
                        String latitud = jsonArrayPrincipal.getJSONArray(i).getJSONObject(i).getJSONArray("latlng").getJSONObject(0).getString("");
                        String longitud = jsonArrayPrincipal.getJSONArray(i).getJSONObject(i).getJSONArray("latlng").getJSONObject(1).getString("");


                        Pais registro=new Pais(nombre, clave, capital, continente, poblacion, latitud, longitud, paisesFronterizos);

                        listaDatos.add(registro);

                    }


                    Adaptador adaptador = new Adaptador(getApplicationContext(), listaDatos);
                    lvPaises.setAdapter(adaptador);



                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                // TODO Auto-generated method stub

            }

        });
        request.add(jsonArrayRequest);

        lvPaises.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(getApplicationContext(), "Pinchado", Toast.LENGTH_SHORT).show();

            }
        });


    }
}

