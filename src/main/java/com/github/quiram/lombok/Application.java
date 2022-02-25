package com.github.quiram.lombok;

public class Application {
    public static void main(String[] args) {
        final StringGroup stringGroup = StringGroup.builder()
                .elements("abc", "123")
                .build();
        System.out.println(stringGroup);
    }
}
