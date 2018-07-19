package com.aws.lambda.magic.model.twilio;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TwilioRequest {
	@JsonProperty("ToCountry")
	private String toCountry;
	
	@JsonProperty("ToState")
    private String toState;
	
	@JsonProperty("SmsMessageSid")
    private String smsMessageSid;
    
	@JsonProperty("NumMedia")
    private String numMedia;
    
	@JsonProperty("ToCity")
    private String toCity;
    
	@JsonProperty("FromZip")
    private String fromZip;
    
	@JsonProperty("SmsSid")
    private String smsSid;
    
	@JsonProperty("FromState")
    private String fromState;
    
	@JsonProperty("SmsStatus")
    private String smsStatus;
    
	@JsonProperty("FromCity")
    private String fromCity;
    
	@JsonProperty("Body")
    private String body;
    
	@JsonProperty("FromCountry")
    private String fromCountry;
    
	@JsonProperty("To")
    private String to;
    
	@JsonProperty("MessagingServiceSid")
    private String messagingServiceSid;
    
	@JsonProperty("ToZip")
    private String toZip;
    
	@JsonProperty("NumSegments")
    private String numSegments;
    
	@JsonProperty("MessageSid")
    private String messageSid;
    
	@JsonProperty("AccountSid")
    private String accountSid;
    
	@JsonProperty("From")
    private String from;
    
	@JsonProperty("ApiVersion")
    private String apiVersion;

    public String getToCountry() {
        return toCountry;
    }

    public void setToCountry(String toCountry) {
        this.toCountry = toCountry;
    }

    public String getToState() {
        return toState;
    }

    public void setToState(String toState) {
        this.toState = toState;
    }

    public String getSmsMessageSid() {
        return smsMessageSid;
    }

    public void setSmsMessageSid(String smsMessageSid) {
        this.smsMessageSid = smsMessageSid;
    }

    public String getNumMedia() {
        return numMedia;
    }

    public void setNumMedia(String numMedia) {
        this.numMedia = numMedia;
    }

    public String getToCity() {
        return toCity;
    }

    public void setToCity(String toCity) {
        this.toCity = toCity;
    }

    public String getFromZip() {
        return fromZip;
    }

    public void setFromZip(String fromZip) {
        this.fromZip = fromZip;
    }

    public String getSmsSid() {
        return smsSid;
    }

    public void setSmsSid(String smsSid) {
        this.smsSid = smsSid;
    }

    public String getFromState() {
        return fromState;
    }

    public void setFromState(String fromState) {
        this.fromState = fromState;
    }

    public String getSmsStatus() {
        return smsStatus;
    }

    public void setSmsStatus(String smsStatus) {
        this.smsStatus = smsStatus;
    }

    public String getFromCity() {
        return fromCity;
    }

    public void setFromCity(String fromCity) {
        this.fromCity = fromCity;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getFromCountry() {
        return fromCountry;
    }

    public void setFromCountry(String fromCountry) {
        this.fromCountry = fromCountry;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getMessagingServiceSid() {
        return messagingServiceSid;
    }

    public void setMessagingServiceSid(String messagingServiceSid) {
        this.messagingServiceSid = messagingServiceSid;
    }

    public String getToZip() {
        return toZip;
    }

    public void setToZip(String toZip) {
        this.toZip = toZip;
    }

    public String getNumSegments() {
        return numSegments;
    }

    public void setNumSegments(String numSegments) {
        this.numSegments = numSegments;
    }

    public String getMessageSid() {
        return messageSid;
    }

    public void setMessageSid(String messageSid) {
        this.messageSid = messageSid;
    }

    public String getAccountSid() {
        return accountSid;
    }

    public void setAccountSid(String accountSid) {
        this.accountSid = accountSid;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }
    
    @Override
	public String toString() {
		return "TwilioRequest [toCountry=" + toCountry + ", toState=" + toState + ", smsMessageSid=" + smsMessageSid
				+ ", numMedia=" + numMedia + ", toCity=" + toCity + ", fromZip=" + fromZip + ", smsSid=" + smsSid
				+ ", fromState=" + fromState + ", smsStatus=" + smsStatus + ", fromCity=" + fromCity + ", body=" + body
				+ ", fromCountry=" + fromCountry + ", to=" + to + ", messagingServiceSid=" + messagingServiceSid
				+ ", toZip=" + toZip + ", numSegments=" + numSegments + ", messageSid=" + messageSid + ", accountSid="
				+ accountSid + ", from=" + from + ", apiVersion=" + apiVersion + "]";
	}
}
