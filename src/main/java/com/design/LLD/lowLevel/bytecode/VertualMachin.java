package com.design.LLD.lowLevel.bytecode;

import java.util.List;
import java.util.Stack;

public class VertualMachin {
    private Stack<Object> stack = new Stack<>();

    public void execute(List<Instruction> instructions, ExecutionContext context){
        for (Instruction i : instructions){
            switch (i.getOpCode()){
                case LOAD_VALUE->
                    stack.push(context.getValue((String) i.getOperand()));
                case PUSH_CONST->
                        stack.push(i.getOperand());
                case GT-> {
                    int a = (int) stack.pop();
                    int b = (int) stack.pop();
                    stack.push(a < b);
                }
                case EQ->{
                    Object a = stack.pop();
                    Object b = stack.pop();
                    stack.push(b.equals(a));
                }
                case AND->{
                    boolean a =(boolean) stack.pop();
                    boolean b = (boolean)stack.pop();
                    stack.push(a && b);
                }
                case SHOW_CONTENT->{
                    boolean allowed = (boolean) stack.pop();
                    if (allowed) {
                        System.out.println("✅ Content is visible");
                    } else {
                        System.out.println("❌ Content is hidden");
                    }
                }
            }
        }
    }
}
