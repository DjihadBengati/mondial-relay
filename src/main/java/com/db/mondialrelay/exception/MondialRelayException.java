package com.db.mondialrelay.exception;

import lombok.Getter;

import static java.lang.String.format;

/**
 * Mondial Relay exception
 *
 * @Author Djihad BENGATI
 */
@Getter
public class MondialRelayException extends Exception {
    private final String code;

    public MondialRelayException(String code, String message) {
        super(message);
        this.code = code;
    }


    public MondialRelayException(MondialRelayStatusCodeEnum errorStatusCode) {
        super(errorStatusCode.getMessage());
        this.code = errorStatusCode.getCode();
    }

    @Override
    public String toString() {
        return format("{code: %s, message: %s}", this.code, super.getMessage());
    }
}
