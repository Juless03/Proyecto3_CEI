/*
 * @(#)Token.java                        2.1 2003/10/07
 *
 * Copyright (C) 1999, 2003 D.A. Watt and D.F. Brown
 * Dept. of Computing Science, University of Glasgow, Glasgow G12 8QQ Scotland
 * and School of Computer and Math Sciences, The Robert Gordon University,
 * St. Andrew Street, Aberdeen AB25 1HG, Scotland.
 * All rights reserved.
 *
 * This software is provided free for educational use only. It may
 * not be used for commercial purposes without the prior written permission
 * of the authors.
 */

package Triangle.SyntacticAnalyzer;


final class Token extends Object {

  protected int kind;
  protected String spelling;
  protected SourcePosition position;

  public Token(int kind, String spelling, SourcePosition position) {

    if (kind == Token.IDENTIFIER) {
      int currentKind = firstReservedWord;
      boolean searching = true;

      while (searching) {
        int comparison = tokenTable[currentKind].compareTo(spelling);
        if (comparison == 0) {
          this.kind = currentKind;
          searching = false;
        } else if (comparison > 0 || currentKind == lastReservedWord) {
          this.kind = Token.IDENTIFIER;
          searching = false;
        } else {
          currentKind ++;
        }
      }
    } else
      this.kind = kind;

    this.spelling = spelling;
    this.position = position;

  }

  public static String spell (int kind) {
    return tokenTable[kind];
  }

  public String toString() {
    return "Kind=" + kind + ", spelling=" + spelling +
      ", position=" + position;
  }

  // Token classes...

public static final int

    // literals, identifiers, operators...
    INTLITERAL	= 0,
    CHARLITERAL	= 1,
    IDENTIFIER	= 2,
    OPERATOR	= 3,

// reserved words - must be in alphabetical order...
ARRAY         = 4,
BEGIN         = 5,
CASE          = 6,
CONST         = 7,
DO            = 8,
ELSE          = 9,
END           = 10,
FOR           = 11,
FROM          = 12,
FUNC          = 13,
IF            = 14,
IN            = 15,
LET           = 16,
NEW         = 17,
NIL        = 18,
OF            = 19,
POINTER  = 20,
PROC          = 21,
RECORD        = 22,
REPEAT        = 23,
THEN          = 24,
TO            = 25,
TYPE          = 26,
TYPEEND = 27,
UNTIL         = 28,
VAR           = 29,
WHILE         = 30,

// punctuation...
DOT           = 31,
COLON         = 32,
SEMICOLON     = 33,
COMMA         = 34,
BECOMES       = 35,
IS            = 36,
FLECHA = 37,

// brackets...
LPAREN        = 38,
RPAREN        = 39,
LBRACKET      = 40,
RBRACKET      = 41,
LCURLY        = 42,
RCURLY        = 43,

// special tokens...
EOT           = 44,
ERROR         =45;



  private static String[] tokenTable = new String[] {
    "<int>",
    "<char>",
    "<identifier>",
    "<operator>",
    "array",
    "begin",
    "case",
    "const",
    "do",
    "else",
    "end",
    "for",
    "from",
    "func",
    "if",
    "in",
    "let",
    "new",
    "nil",
    "of",
    "pointer",
    "proc",
    "record",
    "repeat",
    "then",
    "to",
    "type",
    "typeend",
    "until",
    "var",
    "while",
    ".",
    ":",
    ";",
    ",",
    ":=",
    "~",
    ".>",
    "(",
    ")",
    "[",
    "]",
    "{",
    "}",
    "",
    "<error>"
  };

  private final static int	firstReservedWord = Token.ARRAY,
  				lastReservedWord  = Token.WHILE;

}
