package com.example.kidsapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils.YouTubePlayerTracker;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class CustomButton extends AbstractYouTubePlayerListener {
    /*View playerUi;
    Context context;
    TextView current,fullduration;
    ImageButton next,prevoius,play,fullsc;
    View progressBar;
    YouTubePlayer youTubePlayer;
    YouTubePlayerView youTubePlayerView;
    YouTubePlayerTracker playerTracker;

    public CustomButton(Context context,View cusplayerUi, YouTubePlayer youTubePlayer, YouTubePlayerView youTubePlayerView) {
        this.playerUi=cusplayerUi;
        this.context=context;
        this.youTubePlayer=youTubePlayer;
        this.youTubePlayerView=youTubePlayerView;

        playerTracker=new YouTubePlayerTracker();
        youTubePlayer.addListener(playerTracker);

        initViews(cusplayerUi);

    }

    private void initViews(View cusplayerUi) {
        current=playerUi.findViewById(R.id.time);
        fullduration=playerUi.findViewById(R.id.duration);
        next=playerUi.findViewById(R.id.next);
        prevoius=playerUi.findViewById(R.id.previous);
        play=playerUi.findViewById(R.id.play);
        progressBar=playerUi.findViewById(R.id.progressBar);
        fullsc=playerUi.findViewById(R.id.fullscreen);

        play.setOnClickListener((view)->{
            if (playerTracker.getState()==PlayerConstants.PlayerState.PLAYING) youTubePlayer.pause();
            else youTubePlayer.play();
        });

        youTubePlayerView.getYouTubePlayerWhenReady(youTubePlayer1 -> {
            setTimer();

            next.setVisibility(View.GONE);
            prevoius.setVisibility(View.GONE);
            play.setVisibility(View.GONE);
            progressBar.setVisibility(View.GONE);
            fullduration.setVisibility(View.GONE);
            current.setVisibility(View.GONE);
            fullsc.setVisibility(View.GONE);
        });

    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onCurrentSecond(@NonNull YouTubePlayer youTubePlayer, float second) {
        current.setText(second+"");
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onVideoDuration(@NonNull YouTubePlayer youTubePlayer, float duration) {
        fullduration.setText(duration+"");
    }

    @Override
    public void onStateChange(@NonNull YouTubePlayer youTubePlayer, @NonNull PlayerConstants.PlayerState state) {
        if (state==PlayerConstants.PlayerState.PAUSED||state==PlayerConstants.PlayerState.ENDED){
            setTimer();

           next.setVisibility(View.VISIBLE);
            prevoius.setVisibility(View.VISIBLE);
            play.setVisibility(View.VISIBLE);
            progressBar.setVisibility(View.VISIBLE);
            fullduration.setVisibility(View.VISIBLE);
            current.setVisibility(View.VISIBLE);
        }
    }

    private void setTimer() {
        next.postDelayed(new Runnable() {
            public void run() {
                next.setVisibility(View.INVISIBLE);
            }
        }, 5000);
        prevoius.postDelayed(new Runnable() {
            public void run() {
                prevoius.setVisibility(View.INVISIBLE);
            }
        }, 5000);
        play.postDelayed(new Runnable() {
            public void run() {
                play.setVisibility(View.INVISIBLE);
            }
        }, 5000);
        progressBar.postDelayed(new Runnable() {
            public void run() {
                progressBar.setVisibility(View.INVISIBLE);
            }
        }, 5000);
        fullduration.postDelayed(new Runnable() {
            public void run() {
                fullduration.setVisibility(View.INVISIBLE);
            }
        }, 5000);
        current.postDelayed(new Runnable() {
            public void run() {
                current.setVisibility(View.INVISIBLE);
            }
        }, 5000);
        fullsc.postDelayed(new Runnable() {
            public void run() {
                fullsc.setVisibility(View.INVISIBLE);
            }
        }, 5000);
    }*/
}

