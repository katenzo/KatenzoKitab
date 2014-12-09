package com.example.katenzo.googlebooks;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import com.example.katenzo.models.GoogleBooks;
import com.example.katenzo.models.Item;

import java.util.ArrayList;
import java.util.List;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;


public class SearchBooksActivity extends ActionBarActivity {

    private EditText searchEditText;
    private ListView booksListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_books);
        searchEditText = (EditText) findViewById(R.id.searchEditText);
        ImageButton searchButton = (ImageButton)  findViewById(R.id.searchButton);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callSearch();
            }
        });

        booksListView = (ListView) findViewById(R.id.searchList);
        final GoogleBooksAdapter adapter = new GoogleBooksAdapter(
                new ArrayList<Item>(), getApplicationContext());
        booksListView.setAdapter(adapter);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_search_books, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void callSearch(){
         GoogleBooksAPI bookAPI = GoogleBooksClient.getApiInterface();
        bookAPI.getBookList(searchEditText.getText().toString(), new Callback<GoogleBooks>() {
                 @Override
                 public void success(GoogleBooks books, Response response) {

                     final List<Item> booksItem = (List<Item>)   books.getItems();
                     final GoogleBooksAdapter adapter = (GoogleBooksAdapter)
                             booksListView.getAdapter();
                     adapter.clear();
                     adapter.addAll(booksItem);
                 }

                 @Override
                 public void failure(RetrofitError error) {
                     Toast.makeText(getApplicationContext(),error.getMessage() , Toast.LENGTH_LONG).show();
                 }
             });
    }
}
