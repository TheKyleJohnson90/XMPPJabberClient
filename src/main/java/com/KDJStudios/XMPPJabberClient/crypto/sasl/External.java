package com.KDJStudios.XMPPJabberClient.crypto.sasl;

import android.util.Base64;
import java.security.SecureRandom;

import com.KDJStudios.XMPPJabberClient.entities.Account;
import com.KDJStudios.XMPPJabberClient.xml.TagWriter;

public class External extends SaslMechanism {

	public External(TagWriter tagWriter, Account account, SecureRandom rng) {
		super(tagWriter, account, rng);
	}

	@Override
	public int getPriority() {
		return 25;
	}

	@Override
	public String getMechanism() {
		return "EXTERNAL";
	}

	@Override
	public String getClientFirstMessage() {
		return Base64.encodeToString(account.getJid().asBareJid().toString().getBytes(),Base64.NO_WRAP);
	}
}
