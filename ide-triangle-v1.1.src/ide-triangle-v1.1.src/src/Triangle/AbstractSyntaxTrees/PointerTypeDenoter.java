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
public class PointerTypeDenoter extends TypeDenoter {
    public Identifier I;
   public PointerTypeDenoter(Identifier i, SourcePosition pos) {
        super(pos);
        I = i;
    }

    public Object visit(Visitor v, Object o) {
        return v.visitPointerTypeDenoter(this, o);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof PointerTypeDenoter)) {
            return false;
        }

        PointerTypeDenoter other = (PointerTypeDenoter) obj;
        return I.spelling.equals(other.I.spelling);
    }
}
