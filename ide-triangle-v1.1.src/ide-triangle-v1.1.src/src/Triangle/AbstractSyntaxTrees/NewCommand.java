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
public class NewCommand extends Command{
    public NewCommand (Identifier iAST, SourcePosition thePosition) {
    super (thePosition);
    I = iAST;
  }

  public Object visit(Visitor v, Object o) {
    return v.visitNewCommand(this, o);
  }


  public Identifier I;
}
