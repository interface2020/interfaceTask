package com.enums;

public enum UserStatus {
    invalid(0, "停用"),
    enabled(1, "启用");

    private int key;
    private String value;

    private UserStatus(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public static String getName(int key) {
        for (UserStatus status : UserStatus.values()) {
            if (status.key == key) {
                return status.value;
            }
        }
        return "";
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
