package com.aws.lambda.magic.model.twilio;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("Response")
public class TwilioResponse {
	@JsonProperty("Message")
    private Message message;

    public TwilioResponse() {
        message = new Message();
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }
    
    @Override
	public String toString() {
		return "TwilioResponse [message=" + message + "]";
	}

    public class Message {
		@JsonProperty("Body")
        private String body;

        @JsonProperty("Media")
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        private String media;

        public String getBody() {
            return body;
        }

        public void setBody(String body) {
            this.body = body;
        }

        public String getMedia() {
            return media;
        }

        public void setMedia(String media) {
            this.media = media;
        }
        
        @Override
		public String toString() {
			return "Message [body=" + body + ", media=" + media + "]";
		}
    }
}