package com.dianrong.common.uniauth.cas.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * notification system config properties
 * 
 * @author xiaofeng.chen@dianrong.com
 * @since jdk1.7
 * @date 2017年1月9日
 */
@Getter
@ToString
@NoArgsConstructor
@Component
@Deprecated
public class NotificationConfig {
    /**
     * sms template name to send a verify code
     */
    @Value("#{uniauthConfig['notification_sms_template']}")
    private String smsTemplateName;
    /**
     * identity to access notification endpoint
     */
    @Value("#{uniauthConfig['notification_key']}")
    private String notificationUserKey;
    /**
     * notification system endpoint
     */
    @Value("#{uniauthConfig['notification_endpoint']}")
    private String notificationEndpoint;
    /**
     * default mail from
     */
    @Value("#{uniauthConfig['internal.mail.smtp.femail']}")
    private String internalSmtpFromEmail;

}
