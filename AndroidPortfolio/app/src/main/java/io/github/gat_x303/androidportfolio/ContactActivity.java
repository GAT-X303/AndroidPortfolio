package io.github.gat_x303.androidportfolio;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

/**
 * Created by allan on 2017-08-15.
 */

public class ContactActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        LinearLayout emailView = (LinearLayout) findViewById(R.id.email);
        LinearLayout websiteView = (LinearLayout) findViewById(R.id.website);
        LinearLayout linkedinView = (LinearLayout) findViewById(R.id.linkedin);
        LinearLayout resumeView = (LinearLayout) findViewById(R.id.resume);

        final String websiteUrl = "https://gat-x303.github.io/";
        final String linkedinUrl = "https://www.linkedin.com/in/allanhieng/";
        final String resumeUrl = "https://docs.google.com/document/d/1k1JO39JSCCKBqi6_zjnVVQPLvJ6Chp8DMtt8ciPemnc/edit?usp=sharing";


        emailView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("message/rfc822");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"allanhieng@gmail.com"});
                v.getContext().startActivity(intent);
            }
        });

        websiteView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent((Intent.ACTION_VIEW));
                intent.setData(Uri.parse(websiteUrl));
                v.getContext().startActivity(intent);
            }
        });

        linkedinView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent((Intent.ACTION_VIEW));
                intent.setData(Uri.parse(linkedinUrl));
                v.getContext().startActivity(intent);
            }
        });

        resumeView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent((Intent.ACTION_VIEW));
                intent.setData(Uri.parse(resumeUrl));
                v.getContext().startActivity(intent);
            }
        });

    }
}
