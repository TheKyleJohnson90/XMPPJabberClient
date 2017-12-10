package com.KDJStudios.XMPPJabberClient.entities;

import com.KDJStudios.XMPPJabberClient.xmpp.jid.Jid;

public interface Blockable {
	boolean isBlocked();
	boolean isDomainBlocked();
	Jid getBlockedJid();
	Jid getJid();
	Account getAccount();
}
