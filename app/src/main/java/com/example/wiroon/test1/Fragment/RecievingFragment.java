package com.example.wiroon.test1.Fragment;


import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.wiroon.test1.R;
import com.example.wiroon.test1.ScanActivity;


/**
 * A simple {@link Fragment} subclass.
 */
public class RecievingFragment extends Fragment {
    private static final int RESULT_OK = 0;
    private Button btn_scan;
    TextView txtResult;
    public RecievingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.fragment_recieving, container, false);
        btn_scan = v.findViewById(R.id.scanBtn);
        btn_scan.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getApplicationContext(),ScanActivity.class);
                startActivityForResult(intent,999);
            }
        });



        return v;
    }
    public void onActivityResult(int requestCode, int resultCode, Intent intent) {


        if (resultCode == RESULT_OK)
        {
            //รับค่าข้อความที่ Scan ได้จาก QR Code
            String contents = intent.getStringExtra("SCAN_RESULT");
            txtResult.setText("Result : " + contents);//แสดงข้อความที่ได้ Scan ใส่ใน Layout
        }

    }


}
