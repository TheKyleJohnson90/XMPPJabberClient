package com.KDJStudios.XMPPJabberClient.xmpp;

import com.KDJStudios.XMPPJabberClient.entities.Account;
import com.KDJStudios.XMPPJabberClient.xmpp.stanzas.IqPacket;

public interface OnIqPacketReceived extends PacketReceived {
	void onIqPacketReceived(Account account, IqPacket packet);
}
