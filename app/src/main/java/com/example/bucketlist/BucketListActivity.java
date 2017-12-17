package com.example.bucketlist;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

//TODO step 14: implement ItemArrayAdapter.ItemClickListener in this class and implement the itemOnLongClick method
/*@Override
public void itemOnLongClick(int position) {
        mItems.remove(position);
        mAdapter.notifyItemRemoved(position);

        }
     }*/

public class BucketListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bucket_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //TODO step 5: initialize the RecyclerView, LayoutManager and the List/ArrayList that holds the BucketList items

        //TODO step 6: add the items beneath here
/*        mItems.add("Skydiving");
        mItems.add("Fly a plane");
        mItems.add("Drive a Formula 1 car");
        mItems.add("Go to Japan");*/

        //TODO step 8: call updateUI() here

        //TODO step 10: build the whole functionality to add an new item to the bucketlist with the floating action button from the edittext added in the previous step
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_bucket_list, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //TODO step 7: add the updateUI() method
/*    private void updateUI() {
        if (mAdapter == null) {
            mAdapter = new ItemArrayAdapter(mItems, this);
            mRecyclerView.setAdapter(mAdapter);
        } else {
            mAdapter.notifyDataSetChanged();
        }
    }*/

}

//TODO step 17: The final version of the app can be tested now by running it and performing all functions.