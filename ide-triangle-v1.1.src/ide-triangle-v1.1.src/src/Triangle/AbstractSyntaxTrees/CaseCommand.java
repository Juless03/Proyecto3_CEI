/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;
import java.util.HashMap;

/**
 *
 * @author richa
 */
public class CaseCommand extends Command{

       public CaseCommand(Expression eAST, HashMap<IntegerLiteral,Command> caseCommands, Command c1AST, SourcePosition thePosition) {
        super(thePosition);
        E = eAST;
        CC = caseCommands;
        C = c1AST;
    }
    @Override
    public Object visit(Visitor v, Object o) {
        return v.visitCaseCommand(this, o);
    }
    
    public Expression E;
    public HashMap<IntegerLiteral,Command> CC;
    public Command C;
    
}
