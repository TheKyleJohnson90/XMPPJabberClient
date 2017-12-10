package com.KDJStudios.XMPPJabberClient.xmpp.stanzas.csi;

import com.KDJStudios.XMPPJabberClient.xmpp.stanzas.AbstractStanza;

public class ActivePacket extends AbstractStanza {
	public ActivePacket() {
		super("active");
		setAttribute("xmlns", "urn:xmpp:csi:0");
	}
}
