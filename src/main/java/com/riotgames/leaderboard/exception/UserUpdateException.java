package com.riotgames.leaderboard.exception;

// RuntimeException: 명시적인 예외처리를 강제하지 않고 런타임 구동시 예상한 예외상황의 에러를 발생시킵니다.
public class UserUpdateException extends RuntimeException {

  public UserUpdateException(String msg) {
    super(msg);
  }
  
}
