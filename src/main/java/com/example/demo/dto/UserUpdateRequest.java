package com.example.demo.dto;

import jakarta.validation.constraints.NotNull;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * ユーザー情報更新リクエストデータ
 *
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class UserUpdateRequest extends UserAddRequest{

    /**
     * ユーザーID
     */
    @NotNull
    private Long id;
}