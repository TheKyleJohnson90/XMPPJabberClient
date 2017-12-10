package com.KDJStudios.XMPPJabberClient.xmpp.jingle;

import com.KDJStudios.XMPPJabberClient.entities.Account;
import com.KDJStudios.XMPPJabberClient.xmpp.PacketReceived;
import com.KDJStudios.XMPPJabberClient.xmpp.jingle.stanzas.JinglePacket;

public interface OnJinglePacketReceived extends PacketReceived {
	void onJinglePacketReceived(Account account, JinglePacket packet);
}
