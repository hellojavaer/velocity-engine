/* Generated By:JJTree: Do not edit this line. ASTDirectiveArgs.java */

package org.apache.velocity.runtime.parser;

public class ASTDirectiveArgs extends SimpleNode {
  public ASTDirectiveArgs(int id) {
    super(id);
  }

  public ASTDirectiveArgs(Parser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
