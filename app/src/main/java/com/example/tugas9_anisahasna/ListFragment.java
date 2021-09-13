package com.example.tugas9_anisahasna;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ListFragment#newInstance} factory method to
 * create an instance of this fragment.
 *
 */
public class ListFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    Context context;
    RecyclerView recyclerView;
    RecyclerView.Adapter recyclerViewAdapter;
    RecyclerView.LayoutManager recylerViewLayoutManager;
    String[] teman = {
            "Irfan Lutfi", "Wahyu Muhammad", "Rahman Hasan", "Wahyu Bima", "Ibrahim Adi",
            "Abdul Zulfikar", "Zakaria Nur", "Hasan Susila", "Eka Guntur", "Darma Idris"
    };
    Integer[] usia = {
            18, 30, 26, 41, 32,
            22, 19, 33, 45, 24
    };

    String[] url = {
            "https://i.mydramalist.com/w6PLY_5f.jpg", "https://i.mydramalist.com/XKLRxf.jpg",
            "https://i.mydramalist.com/j8meyf.jpg", "https://i.mydramalist.com/kEpQwf.jpg",
            "https://i.mydramalist.com/Zvejqc.jpg", "https://i.mydramalist.com/6PlYW_5f.jpg",
            "https://i.mydramalist.com/0Kxmr_5f.jpg", "https://i.mydramalist.com/j8VlOf.jpg",
            "https://i.mydramalist.com/1kymd_5f.jpg", "https://i.mydramalist.com/p3Qx8_5f.jpg"
    };

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ListFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ListFragment newInstance(String param1, String param2) {
        ListFragment fragment = new ListFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public ListFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        context = view.getContext();
        recyclerView = view.findViewById(R.id.recyclerView);
        recylerViewLayoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(recylerViewLayoutManager);
        recyclerViewAdapter = new AdapterRecyclerView(context, teman, usia, url);
        recyclerView.setAdapter(recyclerViewAdapter);

        return view;
    }
}