package com.example.wiroon.test1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.wiroon.test1.R;
import com.google.zxing.Result;
import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class ScanActivity extends AppCompatActivity implements ZXingScannerView.ResultHandler {

    private ZXingScannerView zXingScannerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan);

        scan();
    }

    public void scan(){
        zXingScannerView =new ZXingScannerView(getApplicationContext());
        setContentView(zXingScannerView);
        zXingScannerView.setResultHandler(this);
        zXingScannerView.startCamera();

    }

    @Override
    protected void onPause() {
        super.onPause();
        zXingScannerView.stopCamera();
    }


    @Override
    public void handleResult(Result result) {// method ที่จะทำงานเมื่อ scan QR Code แล้ว
        Toast.makeText(getApplicationContext(),result.getText(), Toast.LENGTH_SHORT).show();
        zXingScannerView.stopCamera();

        Intent returnIntent = new Intent();
        returnIntent.putExtra("SCAN_RESULT",result.getText());
        setResult(RESULT_OK,returnIntent);
        finish();

    }
}
