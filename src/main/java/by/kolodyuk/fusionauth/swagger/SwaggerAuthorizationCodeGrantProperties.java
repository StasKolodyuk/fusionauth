package by.kolodyuk.fusionauth.swagger;

import lombok.Data;

@Data
public class SwaggerAuthorizationCodeGrantProperties {

    private String authorizationUri;
    private String tokenUri;
    private String clientId;
    private String clientSecret;

}
