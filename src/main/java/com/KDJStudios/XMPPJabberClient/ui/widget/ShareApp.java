package com.KDJStudios.XMPPJabberClient.ui.widget;

import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by kyle on 2/18/2018.
 */

public class ShareApp extends PreferenceActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
        emailIntent.setType("text/plain");
        emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, "Hey there! Start chatting with me! Click the link to Download: https://play.google.com/store/apps/details?id=com.KDJStudios.XMPPJabberClient");
        emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Chat with me using XMPPJabberClient!");
        startActivity(emailIntent);
        super.onCreate(savedInstanceState);
    }
}
