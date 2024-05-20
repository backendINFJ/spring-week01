package com.sparta.springweek01;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Memo {
    private String username;
    private  String contents;
}


class main {
    public static void main(String[] args) {

        Memo memo = new Memo();
        memo.getContents();
        memo.getUsername();
        // NoArgsConstructor에 의해 컴파일 오류 x

    }
}
