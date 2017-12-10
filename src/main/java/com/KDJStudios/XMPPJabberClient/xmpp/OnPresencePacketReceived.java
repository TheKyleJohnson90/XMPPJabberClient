package com.KDJStudios.XMPPJabberClient.xmpp;

import com.KDJStudios.XMPPJabberClient.entities.Account;
import com.KDJStudios.XMPPJabberClient.xmpp.stanzas.PresencePacket;

public interface OnPresencePacketReceived extends PacketReceived {
	public void onPresencePacketReceived(Account account, PresencePacket packet);
}
