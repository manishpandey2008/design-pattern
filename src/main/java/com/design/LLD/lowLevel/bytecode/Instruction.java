package com.design.LLD.lowLevel.bytecode;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Instruction {
    private OpCode opCode;
    private Object operand;
}
