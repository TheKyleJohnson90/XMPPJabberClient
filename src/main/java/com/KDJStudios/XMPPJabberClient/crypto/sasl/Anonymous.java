package com.KDJStudios.XMPPJabberClient.crypto.sasl;

import java.security.SecureRandom;

import com.KDJStudios.XMPPJabberClient.entities.Account;
import com.KDJStudios.XMPPJabberClient.xml.TagWriter;

public class Anonymous extends SaslMechanism {

	public Anonymous(TagWriter tagWriter, Account account, SecureRandom rng) {
		super(tagWriter, account, rng);
	}

	@Override
	public int getPriority() {
		return 0;
	}

	@Override
	public String getMechanism() {
		return "ANONYMOUS";
	}

	@Override
	public String getClientFirstMessage() {
		return "";
	}
}
