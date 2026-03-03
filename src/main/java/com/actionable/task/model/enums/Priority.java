package com.actionable.task.model.enums;

public enum Priority {
    LOW,
    MEDIUM,
    HIGH,
    SUPER,
    TOP,
    INVALID;

    public static Priority getPriority(int priority) {
        return switch (priority) {
            case 1 -> LOW;
            case 2 -> MEDIUM;
            case 3 -> HIGH;
            case 4 -> SUPER;
            case 5 -> TOP;
            default -> INVALID;
        };
    }

    public static int getPriority(Priority priority) {
        return switch (priority) {
            case LOW -> 1;
            case MEDIUM -> 2;
            case HIGH -> 3;
            case SUPER -> 4;
            case TOP -> 5;
            default -> 0;
        };
    }
}
