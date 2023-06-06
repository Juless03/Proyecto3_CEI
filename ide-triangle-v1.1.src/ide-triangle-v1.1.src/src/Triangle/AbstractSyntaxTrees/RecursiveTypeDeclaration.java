/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangle.AbstractSyntaxTrees;

import Triangle.AbstractSyntaxTrees.Declaration;
import Triangle.AbstractSyntaxTrees.Identifier;
import Triangle.AbstractSyntaxTrees.Visitor;
import Triangle.SyntacticAnalyzer.SourcePosition;

/**
 *
 * @author richa
 */
public class RecursiveTypeDeclaration extends Declaration{
    public Identifier I;
    public Identifier NodeType;
    public NodeTypeDeclaration NodeTypeDeclaration;

    public RecursiveTypeDeclaration(Identifier nodeType, NodeTypeDeclaration nodeTypeDeclaration, SourcePosition position) {
        super(position);
        //this.I = i;
        this.NodeType = nodeType;
        this.NodeTypeDeclaration = nodeTypeDeclaration;
    }

    public Object visit(Visitor v, Object o) {
        return v.visitRecursiveTypeDeclaration(this, o);
    }


}
