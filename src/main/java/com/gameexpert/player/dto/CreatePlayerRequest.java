package com.gameexpert.player.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CreatePlayerRequest {

    // TODO Lv 3: 2~12글자의 영문 대소문자, 숫자와 밑줄을 허용하는 검증을 적용합니다.
    @NotBlank(message = "닉네임은 비어 있을 수 없습니다.")
    @Size(min = 2, max = 12, message = "닉네임은 2~12자여야 합니다.")
    @Pattern(regexp = "^[a-zA-Z0-9_]+$", message = "영문 대소문자, 숫자, 밑줄(_)만 사용할 수 있습니다.")
    private String nickname;

    public CreatePlayerRequest(String nickname) {
        this.nickname = nickname;
    }
}
