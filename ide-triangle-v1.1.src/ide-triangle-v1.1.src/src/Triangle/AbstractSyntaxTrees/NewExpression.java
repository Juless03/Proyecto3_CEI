/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

/**
 *
 * @author richa
 */
public class NewExpression extends Expression {
    public Identifier I;
    public NewExpression(Identifier iAST, SourcePosition expressionPos) {
        super(expressionPos);
        I = iAST;
    }


    @Override
    public Object visit(Visitor v, Object o) {
      return v.visitNewExpression(this,o);
    }
    
}
