package com.company;

public class JsonNumber extends JsonValue {
    private Number k;

    public JsonNumber(String k){
        int i= Integer.parseInt(k);
        this.k=i;
    }

    @Override
    public JsonValue get(int i) {
        return null;
    }

    @Override
    public JsonValue get(String s) {
        return null;
    }

    @Override
    public String toString() {
        return "JsonNumber{" +
                 k +
                '}';
    }
}
