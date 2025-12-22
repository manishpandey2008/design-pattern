package com.design.LLD.lowLevel.bytecode;

import java.util.List;
import java.util.Map;

public class BytecodeDesignPattern {
    public static void main(String[] args) {
//        Current code flow
//        if (age > 18 && country.equals("IN")) {
//            System.out.println("Hi, This is Regular Code");
//        }

//        ByteCode Pattern Flow

        ExecutionContext context = new ExecutionContext(
                Map.of(
                        "age", 22,
                        "country", "IN"
                )
        );

        // Rule as bytecode
        List<Instruction> program = List.of(
                new Instruction(OpCode.LOAD_VALUE, "age"),
                new Instruction(OpCode.PUSH_CONST, 18),
                new Instruction(OpCode.GT, null),

                new Instruction(OpCode.LOAD_VALUE, "country"),
                new Instruction(OpCode.PUSH_CONST, "IN"),
                new Instruction(OpCode.EQ, null),

                new Instruction(OpCode.AND, null),
                new Instruction(OpCode.SHOW_CONTENT, null)
        );

        new VertualMachin().execute(program, context);

    }
}
