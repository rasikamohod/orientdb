/* Generated By:JJTree: Do not edit this line. OWhereClause.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=O,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.orientechnologies.orient.core.sql.parser;

import com.orientechnologies.orient.core.db.record.OIdentifiable;

public class OWhereClause extends SimpleNode {
  OBooleanExpression baseExpression;

  public OWhereClause(int id) {
    super(id);
  }

  public OWhereClause(OrientSql p, int id) {
    super(p, id);
  }

  /** Accept the visitor. **/
  public Object jjtAccept(OrientSqlVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }

  public boolean matchesFilters(OIdentifiable currentRecord) {
    if (baseExpression == null) {
      return true;
    }
    return baseExpression.evaluate(currentRecord);
  }

  @Override public String toString() {
    if(baseExpression==null){
      return "TODO";
    }
    return baseExpression.toString();
  }
}
/* JavaCC - OriginalChecksum=e8015d01ce1ab2bc337062e9e3f2603e (do not edit this line) */
