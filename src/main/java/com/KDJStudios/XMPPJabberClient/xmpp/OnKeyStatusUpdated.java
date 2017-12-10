package com.KDJStudios.XMPPJabberClient.xmpp;

import com.KDJStudios.XMPPJabberClient.crypto.axolotl.AxolotlService;

public interface OnKeyStatusUpdated {
	public void onKeyStatusUpdated(AxolotlService.FetchStatus report);
}
