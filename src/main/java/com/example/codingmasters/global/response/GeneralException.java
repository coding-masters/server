package com.example.codingmasters.global.response;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GeneralException extends RuntimeException {

    private Status status;

    public Body getBody() {
        return this.status.getBody();
    }

}

