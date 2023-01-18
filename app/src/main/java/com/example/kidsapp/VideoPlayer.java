package com.example.kidsapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

import java.util.Random;

public class VideoPlayer extends AppCompatActivity {

    YouTubePlayerView youTubePlayerView;
    TextView player_des;
    Model model=new Model();
    RecyclerView recyclerView;
    Adapter adapter;

    Random rand=new Random();
    Random rand2=new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_player);

        player_des=findViewById(R.id.player_des);

        Intent intent=getIntent();
        String ind=intent.getStringExtra("ind");

        playVideo();

        recyclerView=findViewById(R.id.recy2);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Adapter(this);
        recyclerView.setAdapter(adapter);



    }

    private void playVideo() {
        Intent intent=getIntent();
        String ind=intent.getStringExtra("ind");
        YouTubePlayerView youTubePlayerView=findViewById(R.id.youtube_player_view);
        getLifecycle().addObserver(youTubePlayerView);
        youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                String id=model.videoIds[Integer.parseInt(ind)];
                youTubePlayer.loadVideo(id, 0);
            }
        });
        player_des.setText(model.title[Integer.parseInt(ind)]);


    }
    public void onBackPressed() {
        startActivity(new Intent(this,MainActivity.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));

    }

}