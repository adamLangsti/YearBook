package com.example.yearbook;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class FragmentClass extends Fragment {

    public static final String MESSAGE = "";

    public static final String IMAGE = "image";

    public static FragmentClass newInstance(String message, int res_id) {

        FragmentClass fragment = new FragmentClass();

        Bundle bundle = new Bundle(1);
        bundle.putString(MESSAGE, message);
        bundle.putInt(IMAGE, res_id);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        String message = getArguments().getString(MESSAGE);

        int image = getArguments().getInt(IMAGE);

        View view = inflater.inflate(R.layout.fragment_layout, container, false);

        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);

        imageView.setImageResource(image);

        TextView messageTextView = (TextView)view.findViewById(R.id.textView);

        messageTextView.setText(message);

        return view;
    }
}

