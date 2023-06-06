/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class RepeatUntilCommand extends Command {
  public RepeatUntilCommand(Command cAST, Expression eAST, SourcePosition thePosition) {
    super(thePosition);
    C = cAST;
    E = eAST;
    
  }


  public Object visit(Visitor v, Object o) {
    return v.visitRepeatUntilCommand(this, o);
  }

  public Command C;
  public Expression E;
  
}

