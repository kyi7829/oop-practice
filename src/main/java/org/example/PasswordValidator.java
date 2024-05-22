package org.example;

/**
 * 비밀번호는 최소 8자 이상 12자 이하여야 한다.
 * 비밀번호가 8자 미만 또는 12자 초과인 경우 IllegalArgumentException 예외를 발생시킨다.
 * 경계조건에 대해 테스트 코드를 작성해야 한다
 * */
public class PasswordValidator {
    private final static String PASSWORD_ELL_MSG_01 = "비밀번호는 8자 이상 12자 이하로 작성 해주세요.";
    public static void validate(String password) {
        int psSize = password.length();

        if (psSize < 8 || psSize > 12) {
             throw new IllegalArgumentException(PASSWORD_ELL_MSG_01);
        }
    }
}
