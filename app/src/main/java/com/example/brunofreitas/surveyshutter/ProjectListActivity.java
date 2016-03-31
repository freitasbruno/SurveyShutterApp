package com.example.brunofreitas.surveyshutter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ProjectListActivity extends Activity{

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_project_list);

        // 1. pass context and data to the custom adapter
        ProjectListArrayAdapter adapter = new ProjectListArrayAdapter(this, generateData());

        // 2. Get ListView from activity_main.xml
        ListView listView = (ListView) findViewById(R.id.listview);

        // 3. setListAdapter
        listView.setAdapter(adapter);

        listView.getFirstVisiblePosition();
    }

    private ArrayList<Project> generateData(){
        ArrayList<Project> items = new ArrayList<>();
        items.add(new Project(1, 0, "Item 1","First Item on the list"));
        items.add(new Project(1, 0, "Item 1","First Item on the list"));
        items.add(new Project(2, 1, "Item 2", "Second Item on the list"));
        items.add(new Project(3, 1, "Item 3", "Third Item on the list"));
        items.add(new Project(1, 0, "Item 4","First Item on the list"));
        items.add(new Project(2, 1, "Item 5", "Second Item on the list"));
        items.add(new Project(3, 1, "Item 6", "Third Item on the list"));
        items.add(new Project(1, 0, "Item 7","First Item on the list"));
        items.add(new Project(2, 1, "Item 8", "Second Item on the list"));
        items.add(new Project(3, 1, "Item 9", "Third Item on the list"));
        items.add(new Project(1, 0, "Item 10","First Item on the list"));
        items.add(new Project(2, 1, "Item 11", "Second Item on the list"));
        items.add(new Project(3, 1, "Item 12", "Third Item on the list"));
        items.add(new Project(1, 0, "Item 13","First Item on the list"));
        items.add(new Project(2, 1, "Item 14", "Second Item on the list"));
        items.add(new Project(3, 1, "Item 15", "Third Item on the list"));

        return items;
    }

}
