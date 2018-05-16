package com.devon;

public class MyClass implements HappyInterface {
    public String happy = "Im a little teapot";

    @Override
    public String getHappy() {
        return happy;
    }

    @Override
    public String getNotHappy() {
        return notHappy;
    }

    public String notHappy = "Im a little asshat";

    public String getSemiHappy() {
        return semiHappy;
    }

    public String semiHappy = "Im a little perterb";
}
