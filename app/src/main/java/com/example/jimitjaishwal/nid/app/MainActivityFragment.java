package com.example.jimitjaishwal.nid.app;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    final int image = R.drawable.nid;
    final String address = "Opp Tagore Hall, Paldi, Ahmedabad, Gujarat 380007";
    final String description = "The National Institute of Design (NID) is a design school in Ahmedabad," +
            " India. The institute functions as an autonomous body under the Department of Industrial Policy" +
            " and Promotion, Ministry of Commerce and Industry, government of India. NID is recognised by the Department " +
            "of Scientific and Industrial Research under Ministry of Science and Technology, government of India, as a " +
            "scientific and industrial design research organisation. In 2010 Business Week placed NID in its list of top" +
            " design schools in the world.";
    final String phoneNumber = "079 2662 9500";

    ContentAdapter adapter;
    List<Content> mContent = getContent();
    RecyclerView recyclerView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        adapter = new ContentAdapter(getActivity(), mContent);
        recyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_view);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        return rootView;
    }

    public List<Content> getContent() {
        List<Content> contents = new ArrayList<Content>();
        contents.add(new Content(image, phoneNumber, address, description));
        return contents;
    }
}
