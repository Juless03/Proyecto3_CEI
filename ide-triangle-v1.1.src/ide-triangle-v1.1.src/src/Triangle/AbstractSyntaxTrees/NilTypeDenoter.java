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
public class NilTypeDenoter extends TypeDenoter {

    public NilTypeDenoter(SourcePosition thePosition) {
        super(thePosition);
    }

    public Object visit(Visitor v, Object o) {
        return v.visitNilTypeDenoter(this, o);
    }

    public boolean equals(Object obj) {
        return false;
    }
}
