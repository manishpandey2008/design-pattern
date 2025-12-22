package com.design.LLD.lowLevel.bytecode;

import lombok.AllArgsConstructor;
import java.util.Map;

@AllArgsConstructor
public class ExecutionContext {
    private Map<String, Object> data;

    public Object getValue(String key){
        return data.get(key);
    }
}
