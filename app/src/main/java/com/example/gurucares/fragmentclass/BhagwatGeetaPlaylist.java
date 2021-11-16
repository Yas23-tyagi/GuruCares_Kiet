package com.example.gurucares.fragmentclass;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gurucares.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BhagwatGeetaPlaylist#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BhagwatGeetaPlaylist extends Fragment {
    CardView geetachapter1,geetachapter2,geetachapter3,geetachapter4,geetachapter5,geetachapter6,
             geetachapter7,geetachapter8,geetachapter9,geetachapter10,geetachapter11,geetachapter12,
             geetachapter13,geetachapter14,geetachapter15,geetachapter16,geetachapter17,geetachapter18;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public BhagwatGeetaPlaylist() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BhagwatGeetaPlaylist.
     */
    // TODO: Rename and change types and number of parameters
    public static BhagwatGeetaPlaylist newInstance(String param1, String param2) {
        BhagwatGeetaPlaylist fragment = new BhagwatGeetaPlaylist();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
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
        View view = inflater.inflate(R.layout.fragment_bhagwat_geeta_playlist, container, false);
        geetachapter1 = view.findViewById(R.id.geetachap1);
        geetachapter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                geetachapter1.setBackground(ContextCompat.getDrawable(getContext(),R.drawable.blackoutlinebg));
                SharedPreferences sharedPref = getActivity().getPreferences(Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString("VideoID", "_9Gsy6c-UIA");
                editor.apply();
                AppCompatActivity activity = (AppCompatActivity) v.getContext();
                Fragment myFragment = new Adhyays();
                activity.getSupportFragmentManager().beginTransaction().replace(R.id.fragment, myFragment).addToBackStack(null).commit();
            }
        });

        geetachapter2 = view.findViewById(R.id.geetachap2);
        geetachapter2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                geetachapter2.setBackground(ContextCompat.getDrawable(getContext(),R.drawable.blackoutlinebg));
                SharedPreferences sharedPref = getActivity().getPreferences(Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString("VideoID", "mBjAzqoKJoI");
                editor.apply();
                AppCompatActivity activity = (AppCompatActivity) v.getContext();
                Fragment myFragment = new Adhyays();
                activity.getSupportFragmentManager().beginTransaction().replace(R.id.fragment, myFragment).addToBackStack(null).commit();
            }
        });

        geetachapter3 = view.findViewById(R.id.geetachap3);
        geetachapter3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                geetachapter3.setBackground(ContextCompat.getDrawable(getContext(),R.drawable.blackoutlinebg));
                SharedPreferences sharedPref = getActivity().getPreferences(Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString("VideoID", "g4oEUP4Ztas");
                editor.apply();
                AppCompatActivity activity = (AppCompatActivity) v.getContext();
                Fragment myFragment = new Adhyays();
                activity.getSupportFragmentManager().beginTransaction().replace(R.id.fragment, myFragment).addToBackStack(null).commit();
            }
        });

        geetachapter4 = view.findViewById(R.id.geetachap4);
        geetachapter4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                geetachapter4.setBackground(ContextCompat.getDrawable(getContext(),R.drawable.blackoutlinebg));
                SharedPreferences sharedPref = getActivity().getPreferences(Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString("VideoID", "E-TECeu7nDw");
                editor.apply();
                AppCompatActivity activity = (AppCompatActivity) v.getContext();
                Fragment myFragment = new Adhyays();
                activity.getSupportFragmentManager().beginTransaction().replace(R.id.fragment, myFragment).addToBackStack(null).commit();
            }
        });

        geetachapter5 = view.findViewById(R.id.geetachap5);
        geetachapter5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                geetachapter5.setBackground(ContextCompat.getDrawable(getContext(),R.drawable.blackoutlinebg));
                SharedPreferences sharedPref = getActivity().getPreferences(Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString("VideoID", "e9cJwVIpPVc");
                editor.apply();
                AppCompatActivity activity = (AppCompatActivity) v.getContext();
                Fragment myFragment = new Adhyays();
                activity.getSupportFragmentManager().beginTransaction().replace(R.id.fragment, myFragment).addToBackStack(null).commit();
            }
        });

        geetachapter6 = view.findViewById(R.id.geetachap6);
        geetachapter6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                geetachapter6.setBackground(ContextCompat.getDrawable(getContext(),R.drawable.blackoutlinebg));
                SharedPreferences sharedPref = getActivity().getPreferences(Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString("VideoID", "MogyeLoe9gs");
                editor.apply();
                AppCompatActivity activity = (AppCompatActivity) v.getContext();
                Fragment myFragment = new Adhyays();
                activity.getSupportFragmentManager().beginTransaction().replace(R.id.fragment, myFragment).addToBackStack(null).commit();
            }
        });

        geetachapter7 = view.findViewById(R.id.geetachap7);
        geetachapter7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                geetachapter7.setBackground(ContextCompat.getDrawable(getContext(),R.drawable.blackoutlinebg));
                SharedPreferences sharedPref = getActivity().getPreferences(Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString("VideoID", "MJlzBHbxDSk");
                editor.apply();
                AppCompatActivity activity = (AppCompatActivity) v.getContext();
                Fragment myFragment = new Adhyays();
                activity.getSupportFragmentManager().beginTransaction().replace(R.id.fragment, myFragment).addToBackStack(null).commit();
            }
        });

        geetachapter8 = view.findViewById(R.id.geetachap8);
        geetachapter8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                geetachapter8.setBackground(ContextCompat.getDrawable(getContext(),R.drawable.blackoutlinebg));
                SharedPreferences sharedPref = getActivity().getPreferences(Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString("VideoID", "mm7QSrjoM5g");
                editor.apply();
                AppCompatActivity activity = (AppCompatActivity) v.getContext();
                Fragment myFragment = new Adhyays();
                activity.getSupportFragmentManager().beginTransaction().replace(R.id.fragment, myFragment).addToBackStack(null).commit();
            }
        });

        geetachapter9 = view.findViewById(R.id.geetachap9);
        geetachapter9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                geetachapter9.setBackground(ContextCompat.getDrawable(getContext(),R.drawable.blackoutlinebg));
                SharedPreferences sharedPref = getActivity().getPreferences(Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString("VideoID", "eHj0JiiuRaQ");
                editor.apply();
                AppCompatActivity activity = (AppCompatActivity) v.getContext();
                Fragment myFragment = new Adhyays();
                activity.getSupportFragmentManager().beginTransaction().replace(R.id.fragment, myFragment).addToBackStack(null).commit();
            }
        });

        geetachapter10 = view.findViewById(R.id.geetachap10);
        geetachapter10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                geetachapter10.setBackground(ContextCompat.getDrawable(getContext(),R.drawable.blackoutlinebg));
                SharedPreferences sharedPref = getActivity().getPreferences(Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString("VideoID", "a0FGJEZqdHY");
                editor.apply();
                AppCompatActivity activity = (AppCompatActivity) v.getContext();
                Fragment myFragment = new Adhyays();
                activity.getSupportFragmentManager().beginTransaction().replace(R.id.fragment, myFragment).addToBackStack(null).commit();
            }
        });

        geetachapter11 = view.findViewById(R.id.geetachap11);
        geetachapter11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                geetachapter11.setBackground(ContextCompat.getDrawable(getContext(),R.drawable.blackoutlinebg));
                SharedPreferences sharedPref = getActivity().getPreferences(Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString("VideoID", "4bABPNlueAY");
                editor.apply();
                AppCompatActivity activity = (AppCompatActivity) v.getContext();
                Fragment myFragment = new Adhyays();
                activity.getSupportFragmentManager().beginTransaction().replace(R.id.fragment, myFragment).addToBackStack(null).commit();
            }
        });

        geetachapter12 = view.findViewById(R.id.geetachap12);
        geetachapter12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                geetachapter12.setBackground(ContextCompat.getDrawable(getContext(),R.drawable.blackoutlinebg));
                SharedPreferences sharedPref = getActivity().getPreferences(Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString("VideoID", "XqHvlUQ8BG8");
                editor.apply();
                AppCompatActivity activity = (AppCompatActivity) v.getContext();
                Fragment myFragment = new Adhyays();
                activity.getSupportFragmentManager().beginTransaction().replace(R.id.fragment, myFragment).addToBackStack(null).commit();
            }
        });

        geetachapter13 = view.findViewById(R.id.geetachap13);
        geetachapter13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                geetachapter13.setBackground(ContextCompat.getDrawable(getContext(),R.drawable.blackoutlinebg));
                SharedPreferences sharedPref = getActivity().getPreferences(Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString("VideoID", "b5h2STZX7Ro");
                editor.apply();
                AppCompatActivity activity = (AppCompatActivity) v.getContext();
                Fragment myFragment = new Adhyays();
                activity.getSupportFragmentManager().beginTransaction().replace(R.id.fragment, myFragment).addToBackStack(null).commit();
            }
        });

        geetachapter14 = view.findViewById(R.id.geetachap14);
        geetachapter14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                geetachapter14.setBackground(ContextCompat.getDrawable(getContext(),R.drawable.blackoutlinebg));
                SharedPreferences sharedPref = getActivity().getPreferences(Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString("VideoID", "ag54cHCfJGU");
                editor.apply();
                AppCompatActivity activity = (AppCompatActivity) v.getContext();
                Fragment myFragment = new Adhyays();
                activity.getSupportFragmentManager().beginTransaction().replace(R.id.fragment, myFragment).addToBackStack(null).commit();
            }
        });

        geetachapter15 = view.findViewById(R.id.geetachap15);
        geetachapter15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                geetachapter15.setBackground(ContextCompat.getDrawable(getContext(),R.drawable.blackoutlinebg));
                SharedPreferences sharedPref = getActivity().getPreferences(Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString("VideoID", "zsQVLsDvyL0");
                editor.apply();
                AppCompatActivity activity = (AppCompatActivity) v.getContext();
                Fragment myFragment = new Adhyays();
                activity.getSupportFragmentManager().beginTransaction().replace(R.id.fragment, myFragment).addToBackStack(null).commit();
            }
        });

        geetachapter16 = view.findViewById(R.id.geetachap16);
        geetachapter16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                geetachapter16.setBackground(ContextCompat.getDrawable(getContext(),R.drawable.blackoutlinebg));
                SharedPreferences sharedPref = getActivity().getPreferences(Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString("VideoID", "sosTze3oJMw");
                editor.apply();
                AppCompatActivity activity = (AppCompatActivity) v.getContext();
                Fragment myFragment = new Adhyays();
                activity.getSupportFragmentManager().beginTransaction().replace(R.id.fragment, myFragment).addToBackStack(null).commit();
            }
        });

        geetachapter17 = view.findViewById(R.id.geetachap17);
        geetachapter17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                geetachapter17.setBackground(ContextCompat.getDrawable(getContext(),R.drawable.blackoutlinebg));
                SharedPreferences sharedPref = getActivity().getPreferences(Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString("VideoID", "xU9M2F0iVno");
                editor.apply();
                AppCompatActivity activity = (AppCompatActivity) v.getContext();
                Fragment myFragment = new Adhyays();
                activity.getSupportFragmentManager().beginTransaction().replace(R.id.fragment, myFragment).addToBackStack(null).commit();
            }
        });

        geetachapter18 = view.findViewById(R.id.geetachap18);
        geetachapter18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                geetachapter18.setBackground(ContextCompat.getDrawable(getContext(),R.drawable.blackoutlinebg));
                SharedPreferences sharedPref = getActivity().getPreferences(Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString("VideoID", "1qhbkOfs280");
                editor.apply();
                AppCompatActivity activity = (AppCompatActivity) v.getContext();
                Fragment myFragment = new Adhyays();
                activity.getSupportFragmentManager().beginTransaction().replace(R.id.fragment, myFragment).addToBackStack(null).commit();
            }
        });

        return view;
    }
}