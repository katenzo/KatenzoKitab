package com.example.katenzo.googlebooks;

import retrofit.RestAdapter;

/**
 * Created by katenzo on 12/8/14.
 */
public class GoogleBooksClient {

    private static final String API_URL = "https://www.googleapis.com/books/v1/";
    private static RestAdapter restAdapter;

    private static RestAdapter getRestAdapter() {
        if (restAdapter == null) {
            restAdapter = new RestAdapter.Builder()
                    .setEndpoint(API_URL)
                    .build();
        }
        return restAdapter;
    }

    public static GoogleBooksAPI getApiInterface() {

        GoogleBooksAPI googleBooksAPI = null;
        try {
            if (restAdapter == null) {
                restAdapter = getRestAdapter();
            }
            googleBooksAPI = restAdapter.create(GoogleBooksAPI.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return googleBooksAPI;
    }



}
