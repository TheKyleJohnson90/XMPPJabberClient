package com.KDJStudios.XMPPJabberClient.xmpp.jingle;

import com.KDJStudios.XMPPJabberClient.entities.DownloadableFile;

public abstract class JingleTransport {
	public abstract void connect(final OnTransportConnected callback);

	public abstract void receive(final DownloadableFile file,
			final OnFileTransmissionStatusChanged callback);

	public abstract void send(final DownloadableFile file,
			final OnFileTransmissionStatusChanged callback);

	public abstract void disconnect();
}
