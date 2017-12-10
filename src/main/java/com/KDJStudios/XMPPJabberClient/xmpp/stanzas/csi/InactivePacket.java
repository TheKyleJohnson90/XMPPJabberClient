package com.KDJStudios.XMPPJabberClient.xmpp.stanzas.csi;

import com.KDJStudios.XMPPJabberClient.xmpp.stanzas.AbstractStanza;

public class InactivePacket extends AbstractStanza {
	public InactivePacket() {
		super("inactive");
		setAttribute("xmlns", "urn:xmpp:csi:0");
	}
}
