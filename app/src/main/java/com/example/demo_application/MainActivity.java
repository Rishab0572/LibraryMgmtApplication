package com.example.demo_application;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button issue;
    EditText fname,lname,bookname,bookid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        issue=findViewById(R.id.issue);
        fname=findViewById(R.id.fname);
        lname=findViewById(R.id.lname);
        bookname=findViewById(R.id.bookname);
        bookid=findViewById(R.id.bookid);

        issue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstname = fname.getText().toString();
                String lastname = lname.getText().toString();
                String bkname = bookname.getText().toString();
                String bkid = bookid.getText().toString();

                AlertDialog.Builder alt = new AlertDialog.Builder(MainActivity.this);

                alt.setTitle("Continue?");
                alt.setMessage("Do you want to continue?");
                alt.setCancelable(false);

                alt.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent i = new Intent(MainActivity.this,LibraryActivity.class);
                        i.putExtra("fnamenext",firstname);
                        i.putExtra("lnamenext",lastname);
                        i.putExtra("bknamenext",bkname);
                        i.putExtra("bkidnext",bkid);
                        startActivity(i);
                    }
                });

                alt.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                alt.create();
                alt.show();
            }
        });

    }
}