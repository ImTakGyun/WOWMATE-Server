package com.wowmate.server.user.service;

public interface EmailService {
    String sendSimpleMessage(String to)throws Exception;
}
