package com.KDJStudios.XMPPJabberClient.xmpp.stanzas.streammgmt;

import com.KDJStudios.XMPPJabberClient.xmpp.stanzas.AbstractStanza;

public class RequestPacket extends AbstractStanza {

	public RequestPacket(int smVersion) {
		super("r");
		this.setAttribute("xmlns", "urn:xmpp:sm:" + smVersion);
	}

}
