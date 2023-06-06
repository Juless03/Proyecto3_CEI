/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangle.AbstractSyntaxTrees;

import Triangle.AbstractSyntaxTrees.Identifier;
import Triangle.AbstractSyntaxTrees.TypeDenoter;
import Triangle.SyntacticAnalyzer.SourcePosition;

/**
 *
 * @author richa
 */
public class NodeTypeDeclaration extends Declaration {
    public Identifier I;
    public TypeDenoter T;

    public NodeTypeDeclaration(Identifier iAST, TypeDenoter tAST, SourcePosition position) {
        super(position);
        this.I = iAST;
        this.T = tAST;
    }

    public Object visit(Visitor v, Object o) {
        return v.visitNodeTypeDeclaration(this, o);
    }
}
