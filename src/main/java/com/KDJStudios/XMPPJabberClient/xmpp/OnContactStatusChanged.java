package com.KDJStudios.XMPPJabberClient.xmpp;

import com.KDJStudios.XMPPJabberClient.entities.Contact;

public interface OnContactStatusChanged {
	public void onContactStatusChanged(final Contact contact, final boolean online);
}
