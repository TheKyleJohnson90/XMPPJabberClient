package com.KDJStudios.XMPPJabberClient.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.KDJStudios.XMPPJabberClient.R;
import com.KDJStudios.XMPPJabberClient.utils.ThemeHelper;

import static com.KDJStudios.XMPPJabberClient.ui.XmppActivity.configureActionBar;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setTheme(ThemeHelper.find(this));

        setContentView(R.layout.activity_about);
        setSupportActionBar(findViewById(R.id.toolbar));
        configureActionBar(getSupportActionBar());
    }
}
