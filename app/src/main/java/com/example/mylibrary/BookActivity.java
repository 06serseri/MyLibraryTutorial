package com.example.mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class BookActivity extends AppCompatActivity {

    private TextView txtBookName, txtAuthor, txtPages, txtDescription;
    private Button btnAddToCurrentlyReading, btnAddToWantToReadList, btnAddToAlreadyRead, btnAddToFavorite;
    private ImageView bookImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        initViews();

        String longDescription = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";


        //TODO: Get the data from recycler view in here
        Book book = new Book(1, "1Q84", "Haruki Murakami", 1350, "https://ginadebacker.files.wordpress.com/2014/09/1q84-cover.jpg",
                "A work of  maddening brilliance", longDescription);

        setData(book);
    }

    private void setData(Book book) {
        txtBookName.setText(book.getName());
        txtAuthor.setText(book.getAuthor());
        txtPages.setText(String.valueOf(book.getPages()));
        txtDescription.setText(book.getLongDesc());
        Glide.with(this)
                .asBitmap().load(book.getImageUrl())
                .into(bookImage);
    }

    private void initViews() {
        txtBookName = findViewById(R.id.txtBookName);
        txtAuthor = findViewById(R.id.txtAuthor);
        txtPages = findViewById(R.id.txtPages);
        txtDescription = findViewById(R.id.txtDescription);

        btnAddToCurrentlyReading = findViewById(R.id.btnAddToCurrentlyReading);
        btnAddToWantToReadList = findViewById(R.id.btnAddToWantToReadList);
        btnAddToAlreadyRead = findViewById(R.id.btnAddToAlreadyRead);
        btnAddToFavorite = findViewById(R.id.btnAddToFavorite);

        bookImage = findViewById(R.id.bookImage);
    }
}