/* Generated By:JJTree: Do not edit this line. ASTBlock.java */

package org.apache.velocity.runtime.parser;

import java.io.Writer;
import java.io.IOException;

import org.apache.velocity.Context;

public class ASTBlock extends SimpleNode
{
    public ASTBlock(int id)
    {
        super(id);
    }

    public ASTBlock(Parser p, int id)
    {
        super(p, id);
    }

    /** Accept the visitor. **/
    public Object jjtAccept(ParserVisitor visitor, Object data)
    {
        return visitor.visit(this, data);
    }

    public void render(Context context, Writer writer)
        throws IOException
    {
        int i, k = jjtGetNumChildren();

        for (i = 0; i < k; i++)
            jjtGetChild(i).render(context, writer);
    }
}
