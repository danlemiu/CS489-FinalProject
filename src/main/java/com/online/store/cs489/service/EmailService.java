package com.online.store.cs489.service;

import java.util.List;

public interface EmailService {

	void sendEmail(String content, String subject, List<String> emailTo);

}
