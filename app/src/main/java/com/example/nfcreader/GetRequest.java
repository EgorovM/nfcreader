package com.example.nfcreader;

import android.os.AsyncTask;

import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.Arrays;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


public class GetRequest extends AsyncTask<String, Void, Void> {

    @Override
    protected Void doInBackground(String... index) {
        OkHttpClient client = new OkHttpClient();

        final String get_index = index[0];

        String url = "http://www.rlspace.ru/mark?index="+ get_index + "&location=" + MainActivity.location + "&secret_word=" + MainActivity.secret_word;

        //TODO
        //ParseJSON(get_index);

        final Request request = new Request.Builder()
                .url(url)
                .build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                MainActivity.playSound(MainActivity.WrongSound);

                e.printStackTrace();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (response.isSuccessful()){

                }
            }
        });

        return null;
    }
}