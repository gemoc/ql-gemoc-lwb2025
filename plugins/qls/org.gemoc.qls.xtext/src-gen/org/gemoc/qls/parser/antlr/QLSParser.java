/*
 * generated by Xtext 2.31.0
 */
package org.gemoc.qls.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.gemoc.qls.parser.antlr.internal.InternalQLSParser;
import org.gemoc.qls.services.QLSGrammarAccess;

public class QLSParser extends AbstractAntlrParser {

	@Inject
	private QLSGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalQLSParser createParser(XtextTokenStream stream) {
		return new InternalQLSParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "QLSModel";
	}

	public QLSGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(QLSGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
