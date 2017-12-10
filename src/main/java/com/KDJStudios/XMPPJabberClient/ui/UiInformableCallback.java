package com.KDJStudios.XMPPJabberClient.ui;

public interface UiInformableCallback<T> extends UiCallback<T> {
    void inform(String text);
}
