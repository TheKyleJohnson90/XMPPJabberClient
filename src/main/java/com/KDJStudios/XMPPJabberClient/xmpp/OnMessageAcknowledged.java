package com.KDJStudios.XMPPJabberClient.xmpp;

import com.KDJStudios.XMPPJabberClient.entities.Account;

public interface OnMessageAcknowledged {
	public void onMessageAcknowledged(Account account, String id);
}
