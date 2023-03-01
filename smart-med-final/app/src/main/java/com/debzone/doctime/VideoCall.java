package com.debzone.doctime;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import org.jitsi.meet.sdk.JitsiMeet;
import org.jitsi.meet.sdk.JitsiMeetActivity;
import org.jitsi.meet.sdk.JitsiMeetConferenceOptions;

import java.net.MalformedURLException;
import java.net.URL;

public class VideoCall extends AppCompatActivity {

    EditText secretCode;
    Button join;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_call);

        secretCode = findViewById(R.id.editTextTextPersonName);
        join = findViewById(R.id.button);
        URL server;

        try {
            server = new URL("https://meet.jit.si");
            JitsiMeetConferenceOptions defaultOptions =
                    new JitsiMeetConferenceOptions.Builder()
                            .setServerURL(server)
//                            .setFeatureFlag("welcomePage.enabled", false)
                            .build();

            JitsiMeet.setDefaultConferenceOptions(defaultOptions);


        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        join.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                JitsiMeetConferenceOptions options = new JitsiMeetConferenceOptions.Builder()

                        .setRoom(secretCode.getText().toString())
                        .setFeatureFlag("welcomePage.enabled", false)
                        .build();

                JitsiMeetActivity.launch(VideoCall.this, options);
            }
        });
    }
}