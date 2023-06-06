/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangle.SyntacticAnalyzer;

import Triangle.AbstractSyntaxTrees.Identifier;
import Triangle.AbstractSyntaxTrees.TypeDenoter;

/**
 *
 * @author richa
 */
class NodeTypeDeclaration {
    public Identifier I;
    public TypeDenoter T;

    public NodeTypeDeclaration(Identifier i, TypeDenoter t, SourcePosition position) {
        super(position);
        this.I = i;
        this.T = t;
    }

    public Object visit(Visitor v, Object o) {
        return v.visitNodeTypeDeclaration(this, o);
    }
}
