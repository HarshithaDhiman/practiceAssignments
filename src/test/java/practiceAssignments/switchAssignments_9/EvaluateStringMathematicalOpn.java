package practiceAssignments.SwitchAssignments;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Scanner;

public class EvaluateStringMathematicalOpn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any mathetical expression: ");
        String str = sc.next();
        ScriptEngineManager sem = new ScriptEngineManager();
        ScriptEngine se = sem.getEngineByName("JavaScript");
        try {
            Object result = se.eval(str);
        } catch (ScriptException e) {
            throw new RuntimeException(e);
        }
    }
}
