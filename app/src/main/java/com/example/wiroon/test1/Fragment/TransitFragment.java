package com.example.wiroon.test1.Fragment;


import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.wiroon.test1.MainActivity;
import com.example.wiroon.test1.R;

import org.json.JSONObject;

/**
 * A simple {@link Fragment} subclass.
 */
public class TransitFragment extends Fragment {

    private EditText txtbarcode;
    private RecyclerView mRecyclerViewTransit;
    private Button btnscan;
    private Button btncamera;
    private Button btnconfirm;
    private Context mContext;
   // private TransitAdapter itemadapter;
    private Button btncancel;
    private Button btnok;
    private EditText location;
    private ScaleAnimation animbye;
    private EditText txt_qty;
    private EditText txt_lot;
    private TextView txt_item;
    private JSONObject js;
    private LinearLayout ln;
    //private Appconfig appconfig;
    private JSONObject temp;
    private Dialog dialog;
    private RecyclerView.LayoutManager mLayoutManager;

    public TransitFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        MainActivity.FragmentName = "Transit";
        final View view = inflater.inflate(R.layout.fragment_transit, container, false);
        txtbarcode = (EditText) view.findViewById(R.id.txt_transit_sticker);
        mContext = getContext();
        mRecyclerViewTransit = (RecyclerView) view.findViewById(R.id.Recyclerview_Transit);

        return view;
    }

//    btncamera.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            getFragmentManager().beginTransaction().replace(R.id.content, CameraFragment.newInstance("Transit_Barcode"), "tag_barcode").addToBackStack("ScanCode Fragment").commit();
//        }
//    });


}
