package com.example.katenzo.googlebooks;

import com.example.katenzo.models.GoogleBooks;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by katenzo on 12/8/14.
 */
public interface GoogleBooksAPI {
    @GET("/volumes?maxResults=10")
    void getBookList(@Query("q") String booksSearch, Callback<GoogleBooks> callback);
}
