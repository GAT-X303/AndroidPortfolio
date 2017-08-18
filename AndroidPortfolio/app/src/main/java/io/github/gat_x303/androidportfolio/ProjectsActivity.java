package io.github.gat_x303.androidportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.net.URL;
import java.util.ArrayList;

/**
 * Created by allan on 2017-08-12.
 */

public class ProjectsActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        String title1 = "Analog to Digital Converter";
        String info1 = "To summarize this was about applying my knowledge of microprocessor systems that largely involved learning through the EsduinoXtreme. The microprocessor was coded in Assembly through CodeWarrior and connected with a USBDM to be programmed. The project required a circuit that took an input scaled it, and converted it to digital values to be displayed using Matlab.\n\nSkills Applied\n-Circuit Design\n-Assembly\n-Matlab";
        String address1 = "https://gat-x303.github.io/project1.html";

        String title2 = "My Portfolio Site";
        String info2 = "Apply my knowledge, in HTML/CSS and web design to create a website that will act as my online portfolio that will updated as I acquiring skills and complete projects.\n\nSkills Applied\n-HTML/CSS\n-Version Control via GitHub\n-Web Design";
        String address2 = "https://gat-x303.github.io/project2.html";

        String title3 = "Android Portfolio";
        String info3 = "To design an Android application and apply my skills of basic Android development that would contain similar information to my portfolio site.\n\nSkills Applied\n-Android Application Development\n-Java\n-UX Design";
        String address3 = "https://gat-x303.github.io/project3.html";

        ArrayList<Item> projectsList = new ArrayList<>();
        projectsList.add(new Item(title1, info1, address1));
        projectsList.add(new Item(title2, info2, address2));
        projectsList.add(new Item(title3, info3, address3));

        //creates RecyclerView along with a LinearLayoutManager, using the 2 allows use to recycle CardViews much like ArrayAdapter
        RecyclerView recList = (RecyclerView) findViewById(R.id.recyclerView);
        recList.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recList.setLayoutManager(linearLayoutManager);

        ItemRecyclerAdapter adapter = new ItemRecyclerAdapter(projectsList);
        recList.setAdapter(adapter);
    }
}
