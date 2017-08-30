package com.krokhmal.practice.firstObjectTask;

public enum Priority {
    MIN(".    "),
    LOW("!    "),
    HIGH("!!!  "),
    MAX("!!!!!");

    int level;
    String signature;

    Priority(String signature) {
        this.level = level;
        this.signature = signature;
    }

    public String getSignature() {
        return signature;
    }

    public static Priority fromString(String signature) {
        for (Priority priority : Priority.values())
            if (priority.signature.equals(signature))
                return (priority);
        throw new IllegalArgumentException("\"signature\" is incorrect");
    }
}
