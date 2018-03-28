package com.KDJStudios.XMPPJabberClient.ui;

import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;

import com.KDJStudios.XMPPJabberClient.R;

import static com.KDJStudios.XMPPJabberClient.ui.XmppActivity.configureActionBar;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Boolean dark = PreferenceManager.getDefaultSharedPreferences(getApplicationContext())
                        .getString("theme", "light").equals("dark");
        int mTheme = dark ? R.style.XMPPJabberClientTheme_Dark : R.style.XMPPJabberClientTheme;
        setTheme(mTheme);

        setContentView(R.layout.activity_about);
        setSupportActionBar(findViewById(R.id.toolbar));
        configureActionBar(getSupportActionBar());
    }
}
