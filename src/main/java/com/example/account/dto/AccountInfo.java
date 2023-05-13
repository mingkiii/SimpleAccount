package com.example.account.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountInfo { //클라이언트와 어플리케이션 간에 필요한 것만 담아 응답으로 주고받을 때 사용
    private String accountNumber;
    private Long balance;

}
