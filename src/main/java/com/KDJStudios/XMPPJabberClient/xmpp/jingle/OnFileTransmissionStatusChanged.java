package com.KDJStudios.XMPPJabberClient.xmpp.jingle;

import com.KDJStudios.XMPPJabberClient.entities.DownloadableFile;

public interface OnFileTransmissionStatusChanged {
	void onFileTransmitted(DownloadableFile file);

	void onFileTransferAborted();
}
