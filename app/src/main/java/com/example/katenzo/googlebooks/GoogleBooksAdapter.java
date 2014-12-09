package com.example.katenzo.googlebooks;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.katenzo.models.ImageLinks;
import com.example.katenzo.models.Item;
import com.example.katenzo.models.VolumeInfo;
import com.squareup.picasso.Picasso;

import java.util.List;

public class GoogleBooksAdapter extends ArrayAdapter {
    public GoogleBooksAdapter(final List<Item> booksItem,
                                      final Context context) {
        super(context, 0, booksItem);
    }

    public View getView(final int position, View convertView, final ViewGroup parent) {
        ViewHolder viewHolder;

        if (convertView == null) {
            final LayoutInflater layoutInflater = LayoutInflater.from(getContext());
            convertView = layoutInflater.inflate(R.layout.row_search_result, null);

            viewHolder = new ViewHolder();
            viewHolder.bookThumbnail = (ImageView) convertView.findViewById(R.id.bookPic);
            viewHolder.bookTitle = (TextView) convertView
                    .findViewById(R.id.bookTitle);
            viewHolder.bookAuthor = (TextView) convertView
                    .findViewById(R.id.bookAuthor);

            viewHolder.bookRatingBar = (RatingBar) convertView.findViewById(R.id.bookRatingBar);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        final Item booksItem = (Item) getItem(position);
        VolumeInfo getVolumeInfo = booksItem.getVolumeInfo();
        List<String> authors = getVolumeInfo.getAuthors();
        ImageLinks imageLinks = getVolumeInfo.getImageLinks();




        viewHolder.bookAuthor.setText(getAuthor(authors));
        viewHolder.bookTitle.setText(getVolumeInfo.getTitle());
        Picasso.with(getContext()).load(getThumbsnailUri(imageLinks)).into(viewHolder.bookThumbnail);


        viewHolder.bookRatingBar.setRating(getRating(getVolumeInfo));

        return convertView;
    }

    private String getAuthor(List<String> authors) {
        if (authors.size() > 0) {
            return authors.get(0);
        }
        return "";
    }

    private float getRating(VolumeInfo getVolumeInfo) {
        return getVolumeInfo.getAverageRating();

    }

    private String getThumbsnailUri(ImageLinks imageLinks) {
        return imageLinks.getThumbnail();
    }

    private class ViewHolder {
        ImageView bookThumbnail;
        TextView bookTitle;
        TextView bookAuthor;
        RatingBar bookRatingBar;
    }
}
