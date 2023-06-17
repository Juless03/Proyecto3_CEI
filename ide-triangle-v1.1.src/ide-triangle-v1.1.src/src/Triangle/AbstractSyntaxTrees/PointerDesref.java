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
public class PointerDesref extends Vname{
    public Vname V;

    public PointerDesref(Vname v, SourcePosition pos) {
        super(pos);
        V = v;
    }

    public Object visit(Visitor v, Object o) {
        return v.visitPointerDesref(this, o);
    }
}
