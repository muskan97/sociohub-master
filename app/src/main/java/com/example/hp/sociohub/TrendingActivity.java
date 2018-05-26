package com.example.hp.sociohub;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.util.Base64;
import android.util.Log;
import android.view.View;

import com.twitter.sdk.android.core.TwitterCore;
import com.twitter.sdk.android.core.TwitterSession;
import com.twitter.sdk.android.tweetui.SearchTimeline;
import com.twitter.sdk.android.tweetui.TweetTimelineRecyclerViewAdapter;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class TrendingActivity extends AppCompatActivity {

      @Override
    protected void onCreate(Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);
          setContentView(R.layout.activity_trending);

          // getTimelineForSearchTerm(URL_INDIA_TRENDING , this);

          final TwitterSession session = TwitterCore.getInstance().getSessionManager()
                  .getActiveSession();


          final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

          recyclerView.setLayoutManager(new LinearLayoutManager(this));


          if (session != null) {


              final SearchTimeline searchTimeline = new SearchTimeline.Builder()
                      .query("#" + "trending")
                      .maxItemsPerRequest(50)
                      .build();

              final TweetTimelineRecyclerViewAdapter adapter =
                      new TweetTimelineRecyclerViewAdapter.Builder(this)
                              .setTimeline(searchTimeline)
                              .setViewStyle(R.style.tw__TweetLightWithActionsStyle)
                              .build();

              recyclerView.setAdapter(adapter);


          }
      }




    public void finish(View view) {

          finish();
    }
}
