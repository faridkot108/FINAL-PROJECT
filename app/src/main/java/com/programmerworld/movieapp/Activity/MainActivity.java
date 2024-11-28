package com.programmerworld.movieapp.Activity;

import android.app.DownloadManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.Request;
import com.android.volley.Request.Method;
import com.android.volley.RequestQueue;
import com.android.volley.Response;


import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.programmerworld.movieapp.Adapter.FilmListAdapter;
import com.programmerworld.movieapp.Domain.Filmitem;
import com.programmerworld.movieapp.Domain.ListFilm;
import com.programmerworld.movieapp.R;

public class MainActivity<Gson> extends AppCompatActivity {
private RecyclerView.Adapter adapterNewMovie;
    private RecyclerView.Adapter adapterUpcoming;
private RecyclerView recyclerViewNewMovies;
    private RecyclerView recyclerViewUpcoming;
private RequestQueue mRequestQueue;
private StringRequest mRequest;
    private View loading1;
    private final StringRequest mStringRequest2 = new StringRequest(Method.GET, "https://moviesapi.ir/api/v1/movies?page=3", this::onErrorResponse);

    private void sendRequest2() {
    }

    private void sendRequest1() {
        mRequestQueue = Volley.newRequestQueue(this);
        loading1.setVisibility(RecyclerView.VISIBLE);
        Request<?> mStringRequest = null;
        mRequestQueue.add(mStringRequest);
        Gson gson = new Gson();
        loading1.setVisibility(View.GONE);
        Object response = null;
        ListFilm items = gson.clone();
        adapterNewMovie = new FilmListAdapter(items);
        recyclerViewNewMovies.setAdapter(adapterNewMovie);
        loading1.setVisibility(View.GONE);

    }


            private void sendRequest1() {
                mRequestQueue= Volley.newRequestQueue(this);
                View loading2;
                mRequestQueue.add(mStringRequest2);
                private StringRequest mStringRequest2 = new StringRequest(Method.GET, "https://moviesapi.ir/api/v1/movies?page=3", response -> {
                loading2.setVisibility(RecyclerView.VISIBLE);
                Gson gson = new Gson();
                loading2.setVisibility(View.GONE);
                ListFilm items = gson.clone(response, ListFilm.class);
                adapterUpcoming = new FilmListAdapter(items);
                recyclerViewUpcoming.setAdapter(adapterUpcoming);
                loading2.setVisibility(View.GONE);
        public void onResponse(String response) {

    }
},new Response.ErrorListener(){

};
private ProgressBar loading1;
    private ProgressBar loading3;

    @Override
    protected void onCreate;; Bundle savedInstanceState;
                savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }


    }



    private void initView() {
        recyclerViewNewMovies=findViewById(R.id.view1);
        recyclerViewNewMovies.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
recyclerViewUpcoming=findViewById(R.id.view1);
        RecyclerView.LayoutManager LinearLayoutManager = null;
        recyclerViewUpcoming.setLayoutManager(LinearLayoutManager,this,LinearLayoutManager.HORIZONTAL,false);
loading1=findViewById(R.id.loading1);

    }

    private void onErrorResponse(VolleyError response) {
        initView();
        sendRequest1();
        sendRequest2();
    }
}