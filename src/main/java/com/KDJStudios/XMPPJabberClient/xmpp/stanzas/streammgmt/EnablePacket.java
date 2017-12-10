package com.KDJStudios.XMPPJabberClient.xmpp.stanzas.streammgmt;

import com.KDJStudios.XMPPJabberClient.xmpp.stanzas.AbstractStanza;

public class EnablePacket extends AbstractStanza {

	public EnablePacket(int smVersion) {
		super("enable");
		this.setAttribute("xmlns", "urn:xmpp:sm:" + smVersion);
		this.setAttribute("resume", "true");
	}

}
