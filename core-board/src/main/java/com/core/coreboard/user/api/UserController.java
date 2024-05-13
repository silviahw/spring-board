package com.core.coreboard.user.api;


import com.core.coreboard.user.dto.SignUpRequest;
import com.core.coreboard.user.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/users")
    public ResponseEntity<Long> singUp(@RequestBody SignUpRequest signUpRequest){
       long createUserId=userService.singUp(signUpRequest.toUserInfo());
        userService.singUp(signUpRequest.toUserInfo());
        return ResponseEntity.ok(createUserId);


    }

    @GetMapping("/users/{userId}")
    public ResponseEntity<UserResponse> userInfo(@PathVariable long userId) {
       userService.read(userId);
    }
}
