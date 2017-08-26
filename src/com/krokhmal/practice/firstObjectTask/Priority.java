package com.krokhmal.practice.firstObjectTask;

public enum Priority {
    MIN(1, ".    "),
    LOW(2, "!    "),
    HIGH(3, "!!!  "),
    MAX(4, "!!!!!");

    int level;
    String signature;

    Priority(int level, String signature) {
        this.level = level;
        this.signature = signature;
    }

    public String getSignature() {
        return signature;
    }

    public static Priority fromString(String signature) {
        for (Priority priority : Priority.values())
            if (priority.signature.equals(signature))
                return priority;
        throw new IllegalArgumentException("\"signature\" is incorrect");
    }
}
