package by.kolodyuk.fusionauth.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.Authorization;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import java.security.Principal;

@Api(authorizations = @Authorization("OAuth2"))
@RestController
public class MeController {

    @GetMapping("/principal")
    public Principal principal(@ApiIgnore Principal principal) {
        return principal;
    }

    @GetMapping("/user-id")
    public String userId(@ApiIgnore JwtAuthenticationToken token) {
        return token.getToken().getSubject();
    }

    // Second way to get userId
//    @GetMapping("/user-id")
//    public String userId(@ApiIgnore @AuthenticationPrincipal(expression = "claims.get('sub')") String userId) {
//        return userId;
//    }
}
