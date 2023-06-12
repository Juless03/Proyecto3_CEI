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
public class IncompleteReference {
    public Identifier typeIdentifier;
    public SourcePosition referenceLocation;

    public IncompleteReference(Identifier typeIdentifier, SourcePosition thePosition) {
        this.typeIdentifier = typeIdentifier;
        this.referenceLocation = thePosition;
    }
}
