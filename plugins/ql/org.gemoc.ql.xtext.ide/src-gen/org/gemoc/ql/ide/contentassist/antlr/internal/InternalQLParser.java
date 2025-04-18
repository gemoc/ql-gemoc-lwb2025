package org.gemoc.ql.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.gemoc.ql.services.QLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'EDate'", "'='", "'and'", "'or'", "'E'", "'e'", "'PLUS'", "'MINUS'", "'MULT'", "'DIV'", "'EQUAL'", "'NOTEQUAL'", "'GREATER'", "'LOWER'", "'GREATEROREQUAL'", "'LOWEROREQUAL'", "'AND'", "'OR'", "'-'", "'not'", "'+'", "'*'", "'/'", "'>'", "'<'", "'>='", "'<='", "'QLModel'", "'{'", "'}'", "'('", "')'", "'submitDate'", "'Form'", "'definitions'", "'if'", "'ValueType'", "'unit'", "'booleanType'", "'integerType'", "'min'", "'max'", "'decimalType'", "'dateType'", "'enumerationType'", "'literals'", "','", "'StringValueType'", "'IntegerValue'", "'intValue'", "'StringValue'", "'stringValue'", "'BooleanValue'", "'DateValue'", "'dateValue'", "'DecimalValue'", "'decimalValue'", "'.'", "'question'", "':'", "'currentValue'", "';'", "'canSubmit'", "'booleanValue'", "'mandatory'", "'isDisplayed'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalQLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalQLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalQLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalQL.g"; }


    	private QLGrammarAccess grammarAccess;

    	public void setGrammarAccess(QLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleQLModel"
    // InternalQL.g:53:1: entryRuleQLModel : ruleQLModel EOF ;
    public final void entryRuleQLModel() throws RecognitionException {
        try {
            // InternalQL.g:54:1: ( ruleQLModel EOF )
            // InternalQL.g:55:1: ruleQLModel EOF
            {
             before(grammarAccess.getQLModelRule()); 
            pushFollow(FOLLOW_1);
            ruleQLModel();

            state._fsp--;

             after(grammarAccess.getQLModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQLModel"


    // $ANTLR start "ruleQLModel"
    // InternalQL.g:62:1: ruleQLModel : ( ( rule__QLModel__Group__0 ) ) ;
    public final void ruleQLModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:66:2: ( ( ( rule__QLModel__Group__0 ) ) )
            // InternalQL.g:67:2: ( ( rule__QLModel__Group__0 ) )
            {
            // InternalQL.g:67:2: ( ( rule__QLModel__Group__0 ) )
            // InternalQL.g:68:3: ( rule__QLModel__Group__0 )
            {
             before(grammarAccess.getQLModelAccess().getGroup()); 
            // InternalQL.g:69:3: ( rule__QLModel__Group__0 )
            // InternalQL.g:69:4: rule__QLModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QLModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQLModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQLModel"


    // $ANTLR start "entryRuleValueType"
    // InternalQL.g:78:1: entryRuleValueType : ruleValueType EOF ;
    public final void entryRuleValueType() throws RecognitionException {
        try {
            // InternalQL.g:79:1: ( ruleValueType EOF )
            // InternalQL.g:80:1: ruleValueType EOF
            {
             before(grammarAccess.getValueTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleValueType();

            state._fsp--;

             after(grammarAccess.getValueTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValueType"


    // $ANTLR start "ruleValueType"
    // InternalQL.g:87:1: ruleValueType : ( ( rule__ValueType__Alternatives ) ) ;
    public final void ruleValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:91:2: ( ( ( rule__ValueType__Alternatives ) ) )
            // InternalQL.g:92:2: ( ( rule__ValueType__Alternatives ) )
            {
            // InternalQL.g:92:2: ( ( rule__ValueType__Alternatives ) )
            // InternalQL.g:93:3: ( rule__ValueType__Alternatives )
            {
             before(grammarAccess.getValueTypeAccess().getAlternatives()); 
            // InternalQL.g:94:3: ( rule__ValueType__Alternatives )
            // InternalQL.g:94:4: rule__ValueType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ValueType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValueType"


    // $ANTLR start "entryRuleExpression"
    // InternalQL.g:103:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalQL.g:104:1: ( ruleExpression EOF )
            // InternalQL.g:105:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalQL.g:112:1: ruleExpression : ( ruleUnaryOrPrimaryExpression ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:116:2: ( ( ruleUnaryOrPrimaryExpression ) )
            // InternalQL.g:117:2: ( ruleUnaryOrPrimaryExpression )
            {
            // InternalQL.g:117:2: ( ruleUnaryOrPrimaryExpression )
            // InternalQL.g:118:3: ruleUnaryOrPrimaryExpression
            {
             before(grammarAccess.getExpressionAccess().getUnaryOrPrimaryExpressionParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleUnaryOrPrimaryExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getUnaryOrPrimaryExpressionParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleUnaryOrPrimaryExpression"
    // InternalQL.g:128:1: entryRuleUnaryOrPrimaryExpression : ruleUnaryOrPrimaryExpression EOF ;
    public final void entryRuleUnaryOrPrimaryExpression() throws RecognitionException {
        try {
            // InternalQL.g:129:1: ( ruleUnaryOrPrimaryExpression EOF )
            // InternalQL.g:130:1: ruleUnaryOrPrimaryExpression EOF
            {
             before(grammarAccess.getUnaryOrPrimaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleUnaryOrPrimaryExpression();

            state._fsp--;

             after(grammarAccess.getUnaryOrPrimaryExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnaryOrPrimaryExpression"


    // $ANTLR start "ruleUnaryOrPrimaryExpression"
    // InternalQL.g:137:1: ruleUnaryOrPrimaryExpression : ( ( rule__UnaryOrPrimaryExpression__Alternatives ) ) ;
    public final void ruleUnaryOrPrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:141:2: ( ( ( rule__UnaryOrPrimaryExpression__Alternatives ) ) )
            // InternalQL.g:142:2: ( ( rule__UnaryOrPrimaryExpression__Alternatives ) )
            {
            // InternalQL.g:142:2: ( ( rule__UnaryOrPrimaryExpression__Alternatives ) )
            // InternalQL.g:143:3: ( rule__UnaryOrPrimaryExpression__Alternatives )
            {
             before(grammarAccess.getUnaryOrPrimaryExpressionAccess().getAlternatives()); 
            // InternalQL.g:144:3: ( rule__UnaryOrPrimaryExpression__Alternatives )
            // InternalQL.g:144:4: rule__UnaryOrPrimaryExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__UnaryOrPrimaryExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnaryOrPrimaryExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnaryOrPrimaryExpression"


    // $ANTLR start "entryRuleUnaryExpression"
    // InternalQL.g:153:1: entryRuleUnaryExpression : ruleUnaryExpression EOF ;
    public final void entryRuleUnaryExpression() throws RecognitionException {
        try {
            // InternalQL.g:154:1: ( ruleUnaryExpression EOF )
            // InternalQL.g:155:1: ruleUnaryExpression EOF
            {
             before(grammarAccess.getUnaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleUnaryExpression();

            state._fsp--;

             after(grammarAccess.getUnaryExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnaryExpression"


    // $ANTLR start "ruleUnaryExpression"
    // InternalQL.g:162:1: ruleUnaryExpression : ( ( rule__UnaryExpression__Group__0 ) ) ;
    public final void ruleUnaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:166:2: ( ( ( rule__UnaryExpression__Group__0 ) ) )
            // InternalQL.g:167:2: ( ( rule__UnaryExpression__Group__0 ) )
            {
            // InternalQL.g:167:2: ( ( rule__UnaryExpression__Group__0 ) )
            // InternalQL.g:168:3: ( rule__UnaryExpression__Group__0 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getGroup()); 
            // InternalQL.g:169:3: ( rule__UnaryExpression__Group__0 )
            // InternalQL.g:169:4: rule__UnaryExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnaryExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalQL.g:178:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // InternalQL.g:179:1: ( rulePrimaryExpression EOF )
            // InternalQL.g:180:1: rulePrimaryExpression EOF
            {
             before(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalQL.g:187:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:191:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // InternalQL.g:192:2: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // InternalQL.g:192:2: ( ( rule__PrimaryExpression__Alternatives ) )
            // InternalQL.g:193:3: ( rule__PrimaryExpression__Alternatives )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            // InternalQL.g:194:3: ( rule__PrimaryExpression__Alternatives )
            // InternalQL.g:194:4: rule__PrimaryExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleOrExpression"
    // InternalQL.g:203:1: entryRuleOrExpression : ruleOrExpression EOF ;
    public final void entryRuleOrExpression() throws RecognitionException {
        try {
            // InternalQL.g:204:1: ( ruleOrExpression EOF )
            // InternalQL.g:205:1: ruleOrExpression EOF
            {
             before(grammarAccess.getOrExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // InternalQL.g:212:1: ruleOrExpression : ( ( rule__OrExpression__Group__0 ) ) ;
    public final void ruleOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:216:2: ( ( ( rule__OrExpression__Group__0 ) ) )
            // InternalQL.g:217:2: ( ( rule__OrExpression__Group__0 ) )
            {
            // InternalQL.g:217:2: ( ( rule__OrExpression__Group__0 ) )
            // InternalQL.g:218:3: ( rule__OrExpression__Group__0 )
            {
             before(grammarAccess.getOrExpressionAccess().getGroup()); 
            // InternalQL.g:219:3: ( rule__OrExpression__Group__0 )
            // InternalQL.g:219:4: rule__OrExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // InternalQL.g:228:1: entryRuleAndExpression : ruleAndExpression EOF ;
    public final void entryRuleAndExpression() throws RecognitionException {
        try {
            // InternalQL.g:229:1: ( ruleAndExpression EOF )
            // InternalQL.g:230:1: ruleAndExpression EOF
            {
             before(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalQL.g:237:1: ruleAndExpression : ( ( rule__AndExpression__Group__0 ) ) ;
    public final void ruleAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:241:2: ( ( ( rule__AndExpression__Group__0 ) ) )
            // InternalQL.g:242:2: ( ( rule__AndExpression__Group__0 ) )
            {
            // InternalQL.g:242:2: ( ( rule__AndExpression__Group__0 ) )
            // InternalQL.g:243:3: ( rule__AndExpression__Group__0 )
            {
             before(grammarAccess.getAndExpressionAccess().getGroup()); 
            // InternalQL.g:244:3: ( rule__AndExpression__Group__0 )
            // InternalQL.g:244:4: rule__AndExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleEqualExpression"
    // InternalQL.g:253:1: entryRuleEqualExpression : ruleEqualExpression EOF ;
    public final void entryRuleEqualExpression() throws RecognitionException {
        try {
            // InternalQL.g:254:1: ( ruleEqualExpression EOF )
            // InternalQL.g:255:1: ruleEqualExpression EOF
            {
             before(grammarAccess.getEqualExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleEqualExpression();

            state._fsp--;

             after(grammarAccess.getEqualExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEqualExpression"


    // $ANTLR start "ruleEqualExpression"
    // InternalQL.g:262:1: ruleEqualExpression : ( ( rule__EqualExpression__Group__0 ) ) ;
    public final void ruleEqualExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:266:2: ( ( ( rule__EqualExpression__Group__0 ) ) )
            // InternalQL.g:267:2: ( ( rule__EqualExpression__Group__0 ) )
            {
            // InternalQL.g:267:2: ( ( rule__EqualExpression__Group__0 ) )
            // InternalQL.g:268:3: ( rule__EqualExpression__Group__0 )
            {
             before(grammarAccess.getEqualExpressionAccess().getGroup()); 
            // InternalQL.g:269:3: ( rule__EqualExpression__Group__0 )
            // InternalQL.g:269:4: rule__EqualExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EqualExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEqualExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEqualExpression"


    // $ANTLR start "entryRuleComparisionExpression"
    // InternalQL.g:278:1: entryRuleComparisionExpression : ruleComparisionExpression EOF ;
    public final void entryRuleComparisionExpression() throws RecognitionException {
        try {
            // InternalQL.g:279:1: ( ruleComparisionExpression EOF )
            // InternalQL.g:280:1: ruleComparisionExpression EOF
            {
             before(grammarAccess.getComparisionExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleComparisionExpression();

            state._fsp--;

             after(grammarAccess.getComparisionExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComparisionExpression"


    // $ANTLR start "ruleComparisionExpression"
    // InternalQL.g:287:1: ruleComparisionExpression : ( ( rule__ComparisionExpression__Group__0 ) ) ;
    public final void ruleComparisionExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:291:2: ( ( ( rule__ComparisionExpression__Group__0 ) ) )
            // InternalQL.g:292:2: ( ( rule__ComparisionExpression__Group__0 ) )
            {
            // InternalQL.g:292:2: ( ( rule__ComparisionExpression__Group__0 ) )
            // InternalQL.g:293:3: ( rule__ComparisionExpression__Group__0 )
            {
             before(grammarAccess.getComparisionExpressionAccess().getGroup()); 
            // InternalQL.g:294:3: ( rule__ComparisionExpression__Group__0 )
            // InternalQL.g:294:4: rule__ComparisionExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComparisionExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComparisionExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparisionExpression"


    // $ANTLR start "entryRuleAdditionExpression"
    // InternalQL.g:303:1: entryRuleAdditionExpression : ruleAdditionExpression EOF ;
    public final void entryRuleAdditionExpression() throws RecognitionException {
        try {
            // InternalQL.g:304:1: ( ruleAdditionExpression EOF )
            // InternalQL.g:305:1: ruleAdditionExpression EOF
            {
             before(grammarAccess.getAdditionExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleAdditionExpression();

            state._fsp--;

             after(grammarAccess.getAdditionExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAdditionExpression"


    // $ANTLR start "ruleAdditionExpression"
    // InternalQL.g:312:1: ruleAdditionExpression : ( ( rule__AdditionExpression__Group__0 ) ) ;
    public final void ruleAdditionExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:316:2: ( ( ( rule__AdditionExpression__Group__0 ) ) )
            // InternalQL.g:317:2: ( ( rule__AdditionExpression__Group__0 ) )
            {
            // InternalQL.g:317:2: ( ( rule__AdditionExpression__Group__0 ) )
            // InternalQL.g:318:3: ( rule__AdditionExpression__Group__0 )
            {
             before(grammarAccess.getAdditionExpressionAccess().getGroup()); 
            // InternalQL.g:319:3: ( rule__AdditionExpression__Group__0 )
            // InternalQL.g:319:4: rule__AdditionExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AdditionExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdditionExpression"


    // $ANTLR start "entryRuleMultiplicationExpression"
    // InternalQL.g:328:1: entryRuleMultiplicationExpression : ruleMultiplicationExpression EOF ;
    public final void entryRuleMultiplicationExpression() throws RecognitionException {
        try {
            // InternalQL.g:329:1: ( ruleMultiplicationExpression EOF )
            // InternalQL.g:330:1: ruleMultiplicationExpression EOF
            {
             before(grammarAccess.getMultiplicationExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiplicationExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicationExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiplicationExpression"


    // $ANTLR start "ruleMultiplicationExpression"
    // InternalQL.g:337:1: ruleMultiplicationExpression : ( ( rule__MultiplicationExpression__Group__0 ) ) ;
    public final void ruleMultiplicationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:341:2: ( ( ( rule__MultiplicationExpression__Group__0 ) ) )
            // InternalQL.g:342:2: ( ( rule__MultiplicationExpression__Group__0 ) )
            {
            // InternalQL.g:342:2: ( ( rule__MultiplicationExpression__Group__0 ) )
            // InternalQL.g:343:3: ( rule__MultiplicationExpression__Group__0 )
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getGroup()); 
            // InternalQL.g:344:3: ( rule__MultiplicationExpression__Group__0 )
            // InternalQL.g:344:4: rule__MultiplicationExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicationExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplicationExpression"


    // $ANTLR start "entryRuleCall"
    // InternalQL.g:353:1: entryRuleCall : ruleCall EOF ;
    public final void entryRuleCall() throws RecognitionException {
        try {
            // InternalQL.g:354:1: ( ruleCall EOF )
            // InternalQL.g:355:1: ruleCall EOF
            {
             before(grammarAccess.getCallRule()); 
            pushFollow(FOLLOW_1);
            ruleCall();

            state._fsp--;

             after(grammarAccess.getCallRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCall"


    // $ANTLR start "ruleCall"
    // InternalQL.g:362:1: ruleCall : ( ( rule__Call__Alternatives ) ) ;
    public final void ruleCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:366:2: ( ( ( rule__Call__Alternatives ) ) )
            // InternalQL.g:367:2: ( ( rule__Call__Alternatives ) )
            {
            // InternalQL.g:367:2: ( ( rule__Call__Alternatives ) )
            // InternalQL.g:368:3: ( rule__Call__Alternatives )
            {
             before(grammarAccess.getCallAccess().getAlternatives()); 
            // InternalQL.g:369:3: ( rule__Call__Alternatives )
            // InternalQL.g:369:4: rule__Call__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Call__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCallAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCall"


    // $ANTLR start "entryRuleValue"
    // InternalQL.g:378:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalQL.g:379:1: ( ruleValue EOF )
            // InternalQL.g:380:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalQL.g:387:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:391:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalQL.g:392:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalQL.g:392:2: ( ( rule__Value__Alternatives ) )
            // InternalQL.g:393:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalQL.g:394:3: ( rule__Value__Alternatives )
            // InternalQL.g:394:4: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleForm"
    // InternalQL.g:403:1: entryRuleForm : ruleForm EOF ;
    public final void entryRuleForm() throws RecognitionException {
        try {
            // InternalQL.g:404:1: ( ruleForm EOF )
            // InternalQL.g:405:1: ruleForm EOF
            {
             before(grammarAccess.getFormRule()); 
            pushFollow(FOLLOW_1);
            ruleForm();

            state._fsp--;

             after(grammarAccess.getFormRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleForm"


    // $ANTLR start "ruleForm"
    // InternalQL.g:412:1: ruleForm : ( ( rule__Form__Group__0 ) ) ;
    public final void ruleForm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:416:2: ( ( ( rule__Form__Group__0 ) ) )
            // InternalQL.g:417:2: ( ( rule__Form__Group__0 ) )
            {
            // InternalQL.g:417:2: ( ( rule__Form__Group__0 ) )
            // InternalQL.g:418:3: ( rule__Form__Group__0 )
            {
             before(grammarAccess.getFormAccess().getGroup()); 
            // InternalQL.g:419:3: ( rule__Form__Group__0 )
            // InternalQL.g:419:4: rule__Form__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Form__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFormAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForm"


    // $ANTLR start "entryRuleDefinitionGroup"
    // InternalQL.g:428:1: entryRuleDefinitionGroup : ruleDefinitionGroup EOF ;
    public final void entryRuleDefinitionGroup() throws RecognitionException {
        try {
            // InternalQL.g:429:1: ( ruleDefinitionGroup EOF )
            // InternalQL.g:430:1: ruleDefinitionGroup EOF
            {
             before(grammarAccess.getDefinitionGroupRule()); 
            pushFollow(FOLLOW_1);
            ruleDefinitionGroup();

            state._fsp--;

             after(grammarAccess.getDefinitionGroupRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefinitionGroup"


    // $ANTLR start "ruleDefinitionGroup"
    // InternalQL.g:437:1: ruleDefinitionGroup : ( ( rule__DefinitionGroup__Group__0 ) ) ;
    public final void ruleDefinitionGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:441:2: ( ( ( rule__DefinitionGroup__Group__0 ) ) )
            // InternalQL.g:442:2: ( ( rule__DefinitionGroup__Group__0 ) )
            {
            // InternalQL.g:442:2: ( ( rule__DefinitionGroup__Group__0 ) )
            // InternalQL.g:443:3: ( rule__DefinitionGroup__Group__0 )
            {
             before(grammarAccess.getDefinitionGroupAccess().getGroup()); 
            // InternalQL.g:444:3: ( rule__DefinitionGroup__Group__0 )
            // InternalQL.g:444:4: rule__DefinitionGroup__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DefinitionGroup__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionGroupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefinitionGroup"


    // $ANTLR start "entryRuleEDate"
    // InternalQL.g:453:1: entryRuleEDate : ruleEDate EOF ;
    public final void entryRuleEDate() throws RecognitionException {
        try {
            // InternalQL.g:454:1: ( ruleEDate EOF )
            // InternalQL.g:455:1: ruleEDate EOF
            {
             before(grammarAccess.getEDateRule()); 
            pushFollow(FOLLOW_1);
            ruleEDate();

            state._fsp--;

             after(grammarAccess.getEDateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEDate"


    // $ANTLR start "ruleEDate"
    // InternalQL.g:462:1: ruleEDate : ( 'EDate' ) ;
    public final void ruleEDate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:466:2: ( ( 'EDate' ) )
            // InternalQL.g:467:2: ( 'EDate' )
            {
            // InternalQL.g:467:2: ( 'EDate' )
            // InternalQL.g:468:3: 'EDate'
            {
             before(grammarAccess.getEDateAccess().getEDateKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getEDateAccess().getEDateKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDate"


    // $ANTLR start "entryRuleEString"
    // InternalQL.g:478:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalQL.g:479:1: ( ruleEString EOF )
            // InternalQL.g:480:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalQL.g:487:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:491:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalQL.g:492:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalQL.g:492:2: ( ( rule__EString__Alternatives ) )
            // InternalQL.g:493:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalQL.g:494:3: ( rule__EString__Alternatives )
            // InternalQL.g:494:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleQuestionGroup"
    // InternalQL.g:503:1: entryRuleQuestionGroup : ruleQuestionGroup EOF ;
    public final void entryRuleQuestionGroup() throws RecognitionException {
        try {
            // InternalQL.g:504:1: ( ruleQuestionGroup EOF )
            // InternalQL.g:505:1: ruleQuestionGroup EOF
            {
             before(grammarAccess.getQuestionGroupRule()); 
            pushFollow(FOLLOW_1);
            ruleQuestionGroup();

            state._fsp--;

             after(grammarAccess.getQuestionGroupRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuestionGroup"


    // $ANTLR start "ruleQuestionGroup"
    // InternalQL.g:512:1: ruleQuestionGroup : ( ( rule__QuestionGroup__Group__0 ) ) ;
    public final void ruleQuestionGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:516:2: ( ( ( rule__QuestionGroup__Group__0 ) ) )
            // InternalQL.g:517:2: ( ( rule__QuestionGroup__Group__0 ) )
            {
            // InternalQL.g:517:2: ( ( rule__QuestionGroup__Group__0 ) )
            // InternalQL.g:518:3: ( rule__QuestionGroup__Group__0 )
            {
             before(grammarAccess.getQuestionGroupAccess().getGroup()); 
            // InternalQL.g:519:3: ( rule__QuestionGroup__Group__0 )
            // InternalQL.g:519:4: rule__QuestionGroup__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QuestionGroup__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionGroupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuestionGroup"


    // $ANTLR start "entryRuleQuestion"
    // InternalQL.g:528:1: entryRuleQuestion : ruleQuestion EOF ;
    public final void entryRuleQuestion() throws RecognitionException {
        try {
            // InternalQL.g:529:1: ( ruleQuestion EOF )
            // InternalQL.g:530:1: ruleQuestion EOF
            {
             before(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_1);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // InternalQL.g:537:1: ruleQuestion : ( ( rule__Question__QuestionDefinitionAssignment ) ) ;
    public final void ruleQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:541:2: ( ( ( rule__Question__QuestionDefinitionAssignment ) ) )
            // InternalQL.g:542:2: ( ( rule__Question__QuestionDefinitionAssignment ) )
            {
            // InternalQL.g:542:2: ( ( rule__Question__QuestionDefinitionAssignment ) )
            // InternalQL.g:543:3: ( rule__Question__QuestionDefinitionAssignment )
            {
             before(grammarAccess.getQuestionAccess().getQuestionDefinitionAssignment()); 
            // InternalQL.g:544:3: ( rule__Question__QuestionDefinitionAssignment )
            // InternalQL.g:544:4: rule__Question__QuestionDefinitionAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Question__QuestionDefinitionAssignment();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getQuestionDefinitionAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleValueType_Impl"
    // InternalQL.g:553:1: entryRuleValueType_Impl : ruleValueType_Impl EOF ;
    public final void entryRuleValueType_Impl() throws RecognitionException {
        try {
            // InternalQL.g:554:1: ( ruleValueType_Impl EOF )
            // InternalQL.g:555:1: ruleValueType_Impl EOF
            {
             before(grammarAccess.getValueType_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleValueType_Impl();

            state._fsp--;

             after(grammarAccess.getValueType_ImplRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValueType_Impl"


    // $ANTLR start "ruleValueType_Impl"
    // InternalQL.g:562:1: ruleValueType_Impl : ( ( rule__ValueType_Impl__Group__0 ) ) ;
    public final void ruleValueType_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:566:2: ( ( ( rule__ValueType_Impl__Group__0 ) ) )
            // InternalQL.g:567:2: ( ( rule__ValueType_Impl__Group__0 ) )
            {
            // InternalQL.g:567:2: ( ( rule__ValueType_Impl__Group__0 ) )
            // InternalQL.g:568:3: ( rule__ValueType_Impl__Group__0 )
            {
             before(grammarAccess.getValueType_ImplAccess().getGroup()); 
            // InternalQL.g:569:3: ( rule__ValueType_Impl__Group__0 )
            // InternalQL.g:569:4: rule__ValueType_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ValueType_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getValueType_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValueType_Impl"


    // $ANTLR start "entryRuleConstantCall"
    // InternalQL.g:578:1: entryRuleConstantCall : ruleConstantCall EOF ;
    public final void entryRuleConstantCall() throws RecognitionException {
        try {
            // InternalQL.g:579:1: ( ruleConstantCall EOF )
            // InternalQL.g:580:1: ruleConstantCall EOF
            {
             before(grammarAccess.getConstantCallRule()); 
            pushFollow(FOLLOW_1);
            ruleConstantCall();

            state._fsp--;

             after(grammarAccess.getConstantCallRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstantCall"


    // $ANTLR start "ruleConstantCall"
    // InternalQL.g:587:1: ruleConstantCall : ( ( rule__ConstantCall__Group__0 ) ) ;
    public final void ruleConstantCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:591:2: ( ( ( rule__ConstantCall__Group__0 ) ) )
            // InternalQL.g:592:2: ( ( rule__ConstantCall__Group__0 ) )
            {
            // InternalQL.g:592:2: ( ( rule__ConstantCall__Group__0 ) )
            // InternalQL.g:593:3: ( rule__ConstantCall__Group__0 )
            {
             before(grammarAccess.getConstantCallAccess().getGroup()); 
            // InternalQL.g:594:3: ( rule__ConstantCall__Group__0 )
            // InternalQL.g:594:4: rule__ConstantCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConstantCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstantCallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstantCall"


    // $ANTLR start "entryRuleQuestionCall"
    // InternalQL.g:603:1: entryRuleQuestionCall : ruleQuestionCall EOF ;
    public final void entryRuleQuestionCall() throws RecognitionException {
        try {
            // InternalQL.g:604:1: ( ruleQuestionCall EOF )
            // InternalQL.g:605:1: ruleQuestionCall EOF
            {
             before(grammarAccess.getQuestionCallRule()); 
            pushFollow(FOLLOW_1);
            ruleQuestionCall();

            state._fsp--;

             after(grammarAccess.getQuestionCallRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuestionCall"


    // $ANTLR start "ruleQuestionCall"
    // InternalQL.g:612:1: ruleQuestionCall : ( ( rule__QuestionCall__Group__0 ) ) ;
    public final void ruleQuestionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:616:2: ( ( ( rule__QuestionCall__Group__0 ) ) )
            // InternalQL.g:617:2: ( ( rule__QuestionCall__Group__0 ) )
            {
            // InternalQL.g:617:2: ( ( rule__QuestionCall__Group__0 ) )
            // InternalQL.g:618:3: ( rule__QuestionCall__Group__0 )
            {
             before(grammarAccess.getQuestionCallAccess().getGroup()); 
            // InternalQL.g:619:3: ( rule__QuestionCall__Group__0 )
            // InternalQL.g:619:4: rule__QuestionCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QuestionCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionCallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuestionCall"


    // $ANTLR start "entryRuleBooleanValueType"
    // InternalQL.g:628:1: entryRuleBooleanValueType : ruleBooleanValueType EOF ;
    public final void entryRuleBooleanValueType() throws RecognitionException {
        try {
            // InternalQL.g:629:1: ( ruleBooleanValueType EOF )
            // InternalQL.g:630:1: ruleBooleanValueType EOF
            {
             before(grammarAccess.getBooleanValueTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanValueType();

            state._fsp--;

             after(grammarAccess.getBooleanValueTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanValueType"


    // $ANTLR start "ruleBooleanValueType"
    // InternalQL.g:637:1: ruleBooleanValueType : ( ( rule__BooleanValueType__Group__0 ) ) ;
    public final void ruleBooleanValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:641:2: ( ( ( rule__BooleanValueType__Group__0 ) ) )
            // InternalQL.g:642:2: ( ( rule__BooleanValueType__Group__0 ) )
            {
            // InternalQL.g:642:2: ( ( rule__BooleanValueType__Group__0 ) )
            // InternalQL.g:643:3: ( rule__BooleanValueType__Group__0 )
            {
             before(grammarAccess.getBooleanValueTypeAccess().getGroup()); 
            // InternalQL.g:644:3: ( rule__BooleanValueType__Group__0 )
            // InternalQL.g:644:4: rule__BooleanValueType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanValueType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanValueTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanValueType"


    // $ANTLR start "entryRuleIntegerValueType"
    // InternalQL.g:653:1: entryRuleIntegerValueType : ruleIntegerValueType EOF ;
    public final void entryRuleIntegerValueType() throws RecognitionException {
        try {
            // InternalQL.g:654:1: ( ruleIntegerValueType EOF )
            // InternalQL.g:655:1: ruleIntegerValueType EOF
            {
             before(grammarAccess.getIntegerValueTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleIntegerValueType();

            state._fsp--;

             after(grammarAccess.getIntegerValueTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntegerValueType"


    // $ANTLR start "ruleIntegerValueType"
    // InternalQL.g:662:1: ruleIntegerValueType : ( ( rule__IntegerValueType__Group__0 ) ) ;
    public final void ruleIntegerValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:666:2: ( ( ( rule__IntegerValueType__Group__0 ) ) )
            // InternalQL.g:667:2: ( ( rule__IntegerValueType__Group__0 ) )
            {
            // InternalQL.g:667:2: ( ( rule__IntegerValueType__Group__0 ) )
            // InternalQL.g:668:3: ( rule__IntegerValueType__Group__0 )
            {
             before(grammarAccess.getIntegerValueTypeAccess().getGroup()); 
            // InternalQL.g:669:3: ( rule__IntegerValueType__Group__0 )
            // InternalQL.g:669:4: rule__IntegerValueType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IntegerValueType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerValueTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntegerValueType"


    // $ANTLR start "entryRuleDecimalValueType"
    // InternalQL.g:678:1: entryRuleDecimalValueType : ruleDecimalValueType EOF ;
    public final void entryRuleDecimalValueType() throws RecognitionException {
        try {
            // InternalQL.g:679:1: ( ruleDecimalValueType EOF )
            // InternalQL.g:680:1: ruleDecimalValueType EOF
            {
             before(grammarAccess.getDecimalValueTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleDecimalValueType();

            state._fsp--;

             after(grammarAccess.getDecimalValueTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDecimalValueType"


    // $ANTLR start "ruleDecimalValueType"
    // InternalQL.g:687:1: ruleDecimalValueType : ( ( rule__DecimalValueType__Group__0 ) ) ;
    public final void ruleDecimalValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:691:2: ( ( ( rule__DecimalValueType__Group__0 ) ) )
            // InternalQL.g:692:2: ( ( rule__DecimalValueType__Group__0 ) )
            {
            // InternalQL.g:692:2: ( ( rule__DecimalValueType__Group__0 ) )
            // InternalQL.g:693:3: ( rule__DecimalValueType__Group__0 )
            {
             before(grammarAccess.getDecimalValueTypeAccess().getGroup()); 
            // InternalQL.g:694:3: ( rule__DecimalValueType__Group__0 )
            // InternalQL.g:694:4: rule__DecimalValueType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DecimalValueType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDecimalValueTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDecimalValueType"


    // $ANTLR start "entryRuleDateValueType"
    // InternalQL.g:703:1: entryRuleDateValueType : ruleDateValueType EOF ;
    public final void entryRuleDateValueType() throws RecognitionException {
        try {
            // InternalQL.g:704:1: ( ruleDateValueType EOF )
            // InternalQL.g:705:1: ruleDateValueType EOF
            {
             before(grammarAccess.getDateValueTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleDateValueType();

            state._fsp--;

             after(grammarAccess.getDateValueTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDateValueType"


    // $ANTLR start "ruleDateValueType"
    // InternalQL.g:712:1: ruleDateValueType : ( ( rule__DateValueType__Group__0 ) ) ;
    public final void ruleDateValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:716:2: ( ( ( rule__DateValueType__Group__0 ) ) )
            // InternalQL.g:717:2: ( ( rule__DateValueType__Group__0 ) )
            {
            // InternalQL.g:717:2: ( ( rule__DateValueType__Group__0 ) )
            // InternalQL.g:718:3: ( rule__DateValueType__Group__0 )
            {
             before(grammarAccess.getDateValueTypeAccess().getGroup()); 
            // InternalQL.g:719:3: ( rule__DateValueType__Group__0 )
            // InternalQL.g:719:4: rule__DateValueType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DateValueType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDateValueTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDateValueType"


    // $ANTLR start "entryRuleEnumerationValueType"
    // InternalQL.g:728:1: entryRuleEnumerationValueType : ruleEnumerationValueType EOF ;
    public final void entryRuleEnumerationValueType() throws RecognitionException {
        try {
            // InternalQL.g:729:1: ( ruleEnumerationValueType EOF )
            // InternalQL.g:730:1: ruleEnumerationValueType EOF
            {
             before(grammarAccess.getEnumerationValueTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumerationValueType();

            state._fsp--;

             after(grammarAccess.getEnumerationValueTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumerationValueType"


    // $ANTLR start "ruleEnumerationValueType"
    // InternalQL.g:737:1: ruleEnumerationValueType : ( ( rule__EnumerationValueType__Group__0 ) ) ;
    public final void ruleEnumerationValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:741:2: ( ( ( rule__EnumerationValueType__Group__0 ) ) )
            // InternalQL.g:742:2: ( ( rule__EnumerationValueType__Group__0 ) )
            {
            // InternalQL.g:742:2: ( ( rule__EnumerationValueType__Group__0 ) )
            // InternalQL.g:743:3: ( rule__EnumerationValueType__Group__0 )
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getGroup()); 
            // InternalQL.g:744:3: ( rule__EnumerationValueType__Group__0 )
            // InternalQL.g:744:4: rule__EnumerationValueType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationValueTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumerationValueType"


    // $ANTLR start "entryRuleStringValueType"
    // InternalQL.g:753:1: entryRuleStringValueType : ruleStringValueType EOF ;
    public final void entryRuleStringValueType() throws RecognitionException {
        try {
            // InternalQL.g:754:1: ( ruleStringValueType EOF )
            // InternalQL.g:755:1: ruleStringValueType EOF
            {
             before(grammarAccess.getStringValueTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleStringValueType();

            state._fsp--;

             after(grammarAccess.getStringValueTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringValueType"


    // $ANTLR start "ruleStringValueType"
    // InternalQL.g:762:1: ruleStringValueType : ( ( rule__StringValueType__Group__0 ) ) ;
    public final void ruleStringValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:766:2: ( ( ( rule__StringValueType__Group__0 ) ) )
            // InternalQL.g:767:2: ( ( rule__StringValueType__Group__0 ) )
            {
            // InternalQL.g:767:2: ( ( rule__StringValueType__Group__0 ) )
            // InternalQL.g:768:3: ( rule__StringValueType__Group__0 )
            {
             before(grammarAccess.getStringValueTypeAccess().getGroup()); 
            // InternalQL.g:769:3: ( rule__StringValueType__Group__0 )
            // InternalQL.g:769:4: rule__StringValueType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StringValueType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringValueTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringValueType"


    // $ANTLR start "entryRuleEInt"
    // InternalQL.g:778:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalQL.g:779:1: ( ruleEInt EOF )
            // InternalQL.g:780:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalQL.g:787:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:791:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalQL.g:792:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalQL.g:792:2: ( ( rule__EInt__Group__0 ) )
            // InternalQL.g:793:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalQL.g:794:3: ( rule__EInt__Group__0 )
            // InternalQL.g:794:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEnumerationLiteral"
    // InternalQL.g:803:1: entryRuleEnumerationLiteral : ruleEnumerationLiteral EOF ;
    public final void entryRuleEnumerationLiteral() throws RecognitionException {
        try {
            // InternalQL.g:804:1: ( ruleEnumerationLiteral EOF )
            // InternalQL.g:805:1: ruleEnumerationLiteral EOF
            {
             before(grammarAccess.getEnumerationLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumerationLiteral();

            state._fsp--;

             after(grammarAccess.getEnumerationLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumerationLiteral"


    // $ANTLR start "ruleEnumerationLiteral"
    // InternalQL.g:812:1: ruleEnumerationLiteral : ( ( rule__EnumerationLiteral__Group__0 ) ) ;
    public final void ruleEnumerationLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:816:2: ( ( ( rule__EnumerationLiteral__Group__0 ) ) )
            // InternalQL.g:817:2: ( ( rule__EnumerationLiteral__Group__0 ) )
            {
            // InternalQL.g:817:2: ( ( rule__EnumerationLiteral__Group__0 ) )
            // InternalQL.g:818:3: ( rule__EnumerationLiteral__Group__0 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getGroup()); 
            // InternalQL.g:819:3: ( rule__EnumerationLiteral__Group__0 )
            // InternalQL.g:819:4: rule__EnumerationLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumerationLiteral"


    // $ANTLR start "entryRuleIntegerValue"
    // InternalQL.g:828:1: entryRuleIntegerValue : ruleIntegerValue EOF ;
    public final void entryRuleIntegerValue() throws RecognitionException {
        try {
            // InternalQL.g:829:1: ( ruleIntegerValue EOF )
            // InternalQL.g:830:1: ruleIntegerValue EOF
            {
             before(grammarAccess.getIntegerValueRule()); 
            pushFollow(FOLLOW_1);
            ruleIntegerValue();

            state._fsp--;

             after(grammarAccess.getIntegerValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntegerValue"


    // $ANTLR start "ruleIntegerValue"
    // InternalQL.g:837:1: ruleIntegerValue : ( ( rule__IntegerValue__Group__0 ) ) ;
    public final void ruleIntegerValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:841:2: ( ( ( rule__IntegerValue__Group__0 ) ) )
            // InternalQL.g:842:2: ( ( rule__IntegerValue__Group__0 ) )
            {
            // InternalQL.g:842:2: ( ( rule__IntegerValue__Group__0 ) )
            // InternalQL.g:843:3: ( rule__IntegerValue__Group__0 )
            {
             before(grammarAccess.getIntegerValueAccess().getGroup()); 
            // InternalQL.g:844:3: ( rule__IntegerValue__Group__0 )
            // InternalQL.g:844:4: rule__IntegerValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IntegerValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntegerValue"


    // $ANTLR start "entryRuleStringValue"
    // InternalQL.g:853:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalQL.g:854:1: ( ruleStringValue EOF )
            // InternalQL.g:855:1: ruleStringValue EOF
            {
             before(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_1);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getStringValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalQL.g:862:1: ruleStringValue : ( ( rule__StringValue__Group__0 ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:866:2: ( ( ( rule__StringValue__Group__0 ) ) )
            // InternalQL.g:867:2: ( ( rule__StringValue__Group__0 ) )
            {
            // InternalQL.g:867:2: ( ( rule__StringValue__Group__0 ) )
            // InternalQL.g:868:3: ( rule__StringValue__Group__0 )
            {
             before(grammarAccess.getStringValueAccess().getGroup()); 
            // InternalQL.g:869:3: ( rule__StringValue__Group__0 )
            // InternalQL.g:869:4: rule__StringValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StringValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleBooleanValue"
    // InternalQL.g:878:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // InternalQL.g:879:1: ( ruleBooleanValue EOF )
            // InternalQL.g:880:1: ruleBooleanValue EOF
            {
             before(grammarAccess.getBooleanValueRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanValue();

            state._fsp--;

             after(grammarAccess.getBooleanValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // InternalQL.g:887:1: ruleBooleanValue : ( ( rule__BooleanValue__Group__0 ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:891:2: ( ( ( rule__BooleanValue__Group__0 ) ) )
            // InternalQL.g:892:2: ( ( rule__BooleanValue__Group__0 ) )
            {
            // InternalQL.g:892:2: ( ( rule__BooleanValue__Group__0 ) )
            // InternalQL.g:893:3: ( rule__BooleanValue__Group__0 )
            {
             before(grammarAccess.getBooleanValueAccess().getGroup()); 
            // InternalQL.g:894:3: ( rule__BooleanValue__Group__0 )
            // InternalQL.g:894:4: rule__BooleanValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleDateValue"
    // InternalQL.g:903:1: entryRuleDateValue : ruleDateValue EOF ;
    public final void entryRuleDateValue() throws RecognitionException {
        try {
            // InternalQL.g:904:1: ( ruleDateValue EOF )
            // InternalQL.g:905:1: ruleDateValue EOF
            {
             before(grammarAccess.getDateValueRule()); 
            pushFollow(FOLLOW_1);
            ruleDateValue();

            state._fsp--;

             after(grammarAccess.getDateValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDateValue"


    // $ANTLR start "ruleDateValue"
    // InternalQL.g:912:1: ruleDateValue : ( ( rule__DateValue__Group__0 ) ) ;
    public final void ruleDateValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:916:2: ( ( ( rule__DateValue__Group__0 ) ) )
            // InternalQL.g:917:2: ( ( rule__DateValue__Group__0 ) )
            {
            // InternalQL.g:917:2: ( ( rule__DateValue__Group__0 ) )
            // InternalQL.g:918:3: ( rule__DateValue__Group__0 )
            {
             before(grammarAccess.getDateValueAccess().getGroup()); 
            // InternalQL.g:919:3: ( rule__DateValue__Group__0 )
            // InternalQL.g:919:4: rule__DateValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DateValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDateValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDateValue"


    // $ANTLR start "entryRuleDecimalValue"
    // InternalQL.g:928:1: entryRuleDecimalValue : ruleDecimalValue EOF ;
    public final void entryRuleDecimalValue() throws RecognitionException {
        try {
            // InternalQL.g:929:1: ( ruleDecimalValue EOF )
            // InternalQL.g:930:1: ruleDecimalValue EOF
            {
             before(grammarAccess.getDecimalValueRule()); 
            pushFollow(FOLLOW_1);
            ruleDecimalValue();

            state._fsp--;

             after(grammarAccess.getDecimalValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDecimalValue"


    // $ANTLR start "ruleDecimalValue"
    // InternalQL.g:937:1: ruleDecimalValue : ( ( rule__DecimalValue__Group__0 ) ) ;
    public final void ruleDecimalValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:941:2: ( ( ( rule__DecimalValue__Group__0 ) ) )
            // InternalQL.g:942:2: ( ( rule__DecimalValue__Group__0 ) )
            {
            // InternalQL.g:942:2: ( ( rule__DecimalValue__Group__0 ) )
            // InternalQL.g:943:3: ( rule__DecimalValue__Group__0 )
            {
             before(grammarAccess.getDecimalValueAccess().getGroup()); 
            // InternalQL.g:944:3: ( rule__DecimalValue__Group__0 )
            // InternalQL.g:944:4: rule__DecimalValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DecimalValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDecimalValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDecimalValue"


    // $ANTLR start "entryRuleEFloat"
    // InternalQL.g:953:1: entryRuleEFloat : ruleEFloat EOF ;
    public final void entryRuleEFloat() throws RecognitionException {
        try {
            // InternalQL.g:954:1: ( ruleEFloat EOF )
            // InternalQL.g:955:1: ruleEFloat EOF
            {
             before(grammarAccess.getEFloatRule()); 
            pushFollow(FOLLOW_1);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getEFloatRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // InternalQL.g:962:1: ruleEFloat : ( ( rule__EFloat__Group__0 ) ) ;
    public final void ruleEFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:966:2: ( ( ( rule__EFloat__Group__0 ) ) )
            // InternalQL.g:967:2: ( ( rule__EFloat__Group__0 ) )
            {
            // InternalQL.g:967:2: ( ( rule__EFloat__Group__0 ) )
            // InternalQL.g:968:3: ( rule__EFloat__Group__0 )
            {
             before(grammarAccess.getEFloatAccess().getGroup()); 
            // InternalQL.g:969:3: ( rule__EFloat__Group__0 )
            // InternalQL.g:969:4: rule__EFloat__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEFloatAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "entryRuleQuestionDefinition"
    // InternalQL.g:978:1: entryRuleQuestionDefinition : ruleQuestionDefinition EOF ;
    public final void entryRuleQuestionDefinition() throws RecognitionException {
        try {
            // InternalQL.g:979:1: ( ruleQuestionDefinition EOF )
            // InternalQL.g:980:1: ruleQuestionDefinition EOF
            {
             before(grammarAccess.getQuestionDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleQuestionDefinition();

            state._fsp--;

             after(grammarAccess.getQuestionDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuestionDefinition"


    // $ANTLR start "ruleQuestionDefinition"
    // InternalQL.g:987:1: ruleQuestionDefinition : ( ( rule__QuestionDefinition__Group__0 ) ) ;
    public final void ruleQuestionDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:991:2: ( ( ( rule__QuestionDefinition__Group__0 ) ) )
            // InternalQL.g:992:2: ( ( rule__QuestionDefinition__Group__0 ) )
            {
            // InternalQL.g:992:2: ( ( rule__QuestionDefinition__Group__0 ) )
            // InternalQL.g:993:3: ( rule__QuestionDefinition__Group__0 )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getGroup()); 
            // InternalQL.g:994:3: ( rule__QuestionDefinition__Group__0 )
            // InternalQL.g:994:4: rule__QuestionDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuestionDefinition"


    // $ANTLR start "ruleBinaryOperatorKind"
    // InternalQL.g:1003:1: ruleBinaryOperatorKind : ( ( rule__BinaryOperatorKind__Alternatives ) ) ;
    public final void ruleBinaryOperatorKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1007:1: ( ( ( rule__BinaryOperatorKind__Alternatives ) ) )
            // InternalQL.g:1008:2: ( ( rule__BinaryOperatorKind__Alternatives ) )
            {
            // InternalQL.g:1008:2: ( ( rule__BinaryOperatorKind__Alternatives ) )
            // InternalQL.g:1009:3: ( rule__BinaryOperatorKind__Alternatives )
            {
             before(grammarAccess.getBinaryOperatorKindAccess().getAlternatives()); 
            // InternalQL.g:1010:3: ( rule__BinaryOperatorKind__Alternatives )
            // InternalQL.g:1010:4: rule__BinaryOperatorKind__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BinaryOperatorKind__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBinaryOperatorKindAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinaryOperatorKind"


    // $ANTLR start "ruleUnaryOperatorKind"
    // InternalQL.g:1019:1: ruleUnaryOperatorKind : ( ( rule__UnaryOperatorKind__Alternatives ) ) ;
    public final void ruleUnaryOperatorKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1023:1: ( ( ( rule__UnaryOperatorKind__Alternatives ) ) )
            // InternalQL.g:1024:2: ( ( rule__UnaryOperatorKind__Alternatives ) )
            {
            // InternalQL.g:1024:2: ( ( rule__UnaryOperatorKind__Alternatives ) )
            // InternalQL.g:1025:3: ( rule__UnaryOperatorKind__Alternatives )
            {
             before(grammarAccess.getUnaryOperatorKindAccess().getAlternatives()); 
            // InternalQL.g:1026:3: ( rule__UnaryOperatorKind__Alternatives )
            // InternalQL.g:1026:4: rule__UnaryOperatorKind__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__UnaryOperatorKind__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnaryOperatorKindAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnaryOperatorKind"


    // $ANTLR start "ruleAdditionOperatorKind"
    // InternalQL.g:1035:1: ruleAdditionOperatorKind : ( ( rule__AdditionOperatorKind__Alternatives ) ) ;
    public final void ruleAdditionOperatorKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1039:1: ( ( ( rule__AdditionOperatorKind__Alternatives ) ) )
            // InternalQL.g:1040:2: ( ( rule__AdditionOperatorKind__Alternatives ) )
            {
            // InternalQL.g:1040:2: ( ( rule__AdditionOperatorKind__Alternatives ) )
            // InternalQL.g:1041:3: ( rule__AdditionOperatorKind__Alternatives )
            {
             before(grammarAccess.getAdditionOperatorKindAccess().getAlternatives()); 
            // InternalQL.g:1042:3: ( rule__AdditionOperatorKind__Alternatives )
            // InternalQL.g:1042:4: rule__AdditionOperatorKind__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AdditionOperatorKind__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAdditionOperatorKindAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdditionOperatorKind"


    // $ANTLR start "ruleMultiplicationOperatorKind"
    // InternalQL.g:1051:1: ruleMultiplicationOperatorKind : ( ( rule__MultiplicationOperatorKind__Alternatives ) ) ;
    public final void ruleMultiplicationOperatorKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1055:1: ( ( ( rule__MultiplicationOperatorKind__Alternatives ) ) )
            // InternalQL.g:1056:2: ( ( rule__MultiplicationOperatorKind__Alternatives ) )
            {
            // InternalQL.g:1056:2: ( ( rule__MultiplicationOperatorKind__Alternatives ) )
            // InternalQL.g:1057:3: ( rule__MultiplicationOperatorKind__Alternatives )
            {
             before(grammarAccess.getMultiplicationOperatorKindAccess().getAlternatives()); 
            // InternalQL.g:1058:3: ( rule__MultiplicationOperatorKind__Alternatives )
            // InternalQL.g:1058:4: rule__MultiplicationOperatorKind__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicationOperatorKind__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationOperatorKindAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplicationOperatorKind"


    // $ANTLR start "ruleEqualOperatorKind"
    // InternalQL.g:1067:1: ruleEqualOperatorKind : ( ( '=' ) ) ;
    public final void ruleEqualOperatorKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1071:1: ( ( ( '=' ) ) )
            // InternalQL.g:1072:2: ( ( '=' ) )
            {
            // InternalQL.g:1072:2: ( ( '=' ) )
            // InternalQL.g:1073:3: ( '=' )
            {
             before(grammarAccess.getEqualOperatorKindAccess().getEQUALEnumLiteralDeclaration()); 
            // InternalQL.g:1074:3: ( '=' )
            // InternalQL.g:1074:4: '='
            {
            match(input,12,FOLLOW_2); 

            }

             after(grammarAccess.getEqualOperatorKindAccess().getEQUALEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEqualOperatorKind"


    // $ANTLR start "ruleComparisionOperatorKind"
    // InternalQL.g:1083:1: ruleComparisionOperatorKind : ( ( rule__ComparisionOperatorKind__Alternatives ) ) ;
    public final void ruleComparisionOperatorKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1087:1: ( ( ( rule__ComparisionOperatorKind__Alternatives ) ) )
            // InternalQL.g:1088:2: ( ( rule__ComparisionOperatorKind__Alternatives ) )
            {
            // InternalQL.g:1088:2: ( ( rule__ComparisionOperatorKind__Alternatives ) )
            // InternalQL.g:1089:3: ( rule__ComparisionOperatorKind__Alternatives )
            {
             before(grammarAccess.getComparisionOperatorKindAccess().getAlternatives()); 
            // InternalQL.g:1090:3: ( rule__ComparisionOperatorKind__Alternatives )
            // InternalQL.g:1090:4: rule__ComparisionOperatorKind__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ComparisionOperatorKind__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComparisionOperatorKindAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparisionOperatorKind"


    // $ANTLR start "ruleAndOperatorKind"
    // InternalQL.g:1099:1: ruleAndOperatorKind : ( ( 'and' ) ) ;
    public final void ruleAndOperatorKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1103:1: ( ( ( 'and' ) ) )
            // InternalQL.g:1104:2: ( ( 'and' ) )
            {
            // InternalQL.g:1104:2: ( ( 'and' ) )
            // InternalQL.g:1105:3: ( 'and' )
            {
             before(grammarAccess.getAndOperatorKindAccess().getANDEnumLiteralDeclaration()); 
            // InternalQL.g:1106:3: ( 'and' )
            // InternalQL.g:1106:4: 'and'
            {
            match(input,13,FOLLOW_2); 

            }

             after(grammarAccess.getAndOperatorKindAccess().getANDEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAndOperatorKind"


    // $ANTLR start "ruleOrOperatorKind"
    // InternalQL.g:1115:1: ruleOrOperatorKind : ( ( 'or' ) ) ;
    public final void ruleOrOperatorKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1119:1: ( ( ( 'or' ) ) )
            // InternalQL.g:1120:2: ( ( 'or' ) )
            {
            // InternalQL.g:1120:2: ( ( 'or' ) )
            // InternalQL.g:1121:3: ( 'or' )
            {
             before(grammarAccess.getOrOperatorKindAccess().getOREnumLiteralDeclaration()); 
            // InternalQL.g:1122:3: ( 'or' )
            // InternalQL.g:1122:4: 'or'
            {
            match(input,14,FOLLOW_2); 

            }

             after(grammarAccess.getOrOperatorKindAccess().getOREnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrOperatorKind"


    // $ANTLR start "rule__QLModel__Alternatives_4"
    // InternalQL.g:1130:1: rule__QLModel__Alternatives_4 : ( ( ( rule__QLModel__DefinitionGroupAssignment_4_0 ) ) | ( ( rule__QLModel__FormsAssignment_4_1 ) ) );
    public final void rule__QLModel__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1134:1: ( ( ( rule__QLModel__DefinitionGroupAssignment_4_0 ) ) | ( ( rule__QLModel__FormsAssignment_4_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==45) ) {
                alt1=1;
            }
            else if ( (LA1_0==44) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalQL.g:1135:2: ( ( rule__QLModel__DefinitionGroupAssignment_4_0 ) )
                    {
                    // InternalQL.g:1135:2: ( ( rule__QLModel__DefinitionGroupAssignment_4_0 ) )
                    // InternalQL.g:1136:3: ( rule__QLModel__DefinitionGroupAssignment_4_0 )
                    {
                     before(grammarAccess.getQLModelAccess().getDefinitionGroupAssignment_4_0()); 
                    // InternalQL.g:1137:3: ( rule__QLModel__DefinitionGroupAssignment_4_0 )
                    // InternalQL.g:1137:4: rule__QLModel__DefinitionGroupAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QLModel__DefinitionGroupAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getQLModelAccess().getDefinitionGroupAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQL.g:1141:2: ( ( rule__QLModel__FormsAssignment_4_1 ) )
                    {
                    // InternalQL.g:1141:2: ( ( rule__QLModel__FormsAssignment_4_1 ) )
                    // InternalQL.g:1142:3: ( rule__QLModel__FormsAssignment_4_1 )
                    {
                     before(grammarAccess.getQLModelAccess().getFormsAssignment_4_1()); 
                    // InternalQL.g:1143:3: ( rule__QLModel__FormsAssignment_4_1 )
                    // InternalQL.g:1143:4: rule__QLModel__FormsAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__QLModel__FormsAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getQLModelAccess().getFormsAssignment_4_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Alternatives_4"


    // $ANTLR start "rule__ValueType__Alternatives"
    // InternalQL.g:1151:1: rule__ValueType__Alternatives : ( ( ruleValueType_Impl ) | ( ruleBooleanValueType ) | ( ruleIntegerValueType ) | ( ruleDecimalValueType ) | ( ruleDateValueType ) | ( ruleEnumerationValueType ) | ( ruleStringValueType ) );
    public final void rule__ValueType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1155:1: ( ( ruleValueType_Impl ) | ( ruleBooleanValueType ) | ( ruleIntegerValueType ) | ( ruleDecimalValueType ) | ( ruleDateValueType ) | ( ruleEnumerationValueType ) | ( ruleStringValueType ) )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt2=1;
                }
                break;
            case 49:
                {
                alt2=2;
                }
                break;
            case 50:
                {
                alt2=3;
                }
                break;
            case 53:
                {
                alt2=4;
                }
                break;
            case 54:
                {
                alt2=5;
                }
                break;
            case 55:
                {
                alt2=6;
                }
                break;
            case 58:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalQL.g:1156:2: ( ruleValueType_Impl )
                    {
                    // InternalQL.g:1156:2: ( ruleValueType_Impl )
                    // InternalQL.g:1157:3: ruleValueType_Impl
                    {
                     before(grammarAccess.getValueTypeAccess().getValueType_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleValueType_Impl();

                    state._fsp--;

                     after(grammarAccess.getValueTypeAccess().getValueType_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQL.g:1162:2: ( ruleBooleanValueType )
                    {
                    // InternalQL.g:1162:2: ( ruleBooleanValueType )
                    // InternalQL.g:1163:3: ruleBooleanValueType
                    {
                     before(grammarAccess.getValueTypeAccess().getBooleanValueTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBooleanValueType();

                    state._fsp--;

                     after(grammarAccess.getValueTypeAccess().getBooleanValueTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQL.g:1168:2: ( ruleIntegerValueType )
                    {
                    // InternalQL.g:1168:2: ( ruleIntegerValueType )
                    // InternalQL.g:1169:3: ruleIntegerValueType
                    {
                     before(grammarAccess.getValueTypeAccess().getIntegerValueTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleIntegerValueType();

                    state._fsp--;

                     after(grammarAccess.getValueTypeAccess().getIntegerValueTypeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalQL.g:1174:2: ( ruleDecimalValueType )
                    {
                    // InternalQL.g:1174:2: ( ruleDecimalValueType )
                    // InternalQL.g:1175:3: ruleDecimalValueType
                    {
                     before(grammarAccess.getValueTypeAccess().getDecimalValueTypeParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDecimalValueType();

                    state._fsp--;

                     after(grammarAccess.getValueTypeAccess().getDecimalValueTypeParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalQL.g:1180:2: ( ruleDateValueType )
                    {
                    // InternalQL.g:1180:2: ( ruleDateValueType )
                    // InternalQL.g:1181:3: ruleDateValueType
                    {
                     before(grammarAccess.getValueTypeAccess().getDateValueTypeParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleDateValueType();

                    state._fsp--;

                     after(grammarAccess.getValueTypeAccess().getDateValueTypeParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalQL.g:1186:2: ( ruleEnumerationValueType )
                    {
                    // InternalQL.g:1186:2: ( ruleEnumerationValueType )
                    // InternalQL.g:1187:3: ruleEnumerationValueType
                    {
                     before(grammarAccess.getValueTypeAccess().getEnumerationValueTypeParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleEnumerationValueType();

                    state._fsp--;

                     after(grammarAccess.getValueTypeAccess().getEnumerationValueTypeParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalQL.g:1192:2: ( ruleStringValueType )
                    {
                    // InternalQL.g:1192:2: ( ruleStringValueType )
                    // InternalQL.g:1193:3: ruleStringValueType
                    {
                     before(grammarAccess.getValueTypeAccess().getStringValueTypeParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleStringValueType();

                    state._fsp--;

                     after(grammarAccess.getValueTypeAccess().getStringValueTypeParserRuleCall_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueType__Alternatives"


    // $ANTLR start "rule__UnaryOrPrimaryExpression__Alternatives"
    // InternalQL.g:1202:1: rule__UnaryOrPrimaryExpression__Alternatives : ( ( rulePrimaryExpression ) | ( ruleUnaryExpression ) );
    public final void rule__UnaryOrPrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1206:1: ( ( rulePrimaryExpression ) | ( ruleUnaryExpression ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_STRING && LA3_0<=RULE_ID)||LA3_0==41||LA3_0==59||LA3_0==61||LA3_0==63||LA3_0==66||LA3_0==74) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=29 && LA3_0<=30)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalQL.g:1207:2: ( rulePrimaryExpression )
                    {
                    // InternalQL.g:1207:2: ( rulePrimaryExpression )
                    // InternalQL.g:1208:3: rulePrimaryExpression
                    {
                     before(grammarAccess.getUnaryOrPrimaryExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePrimaryExpression();

                    state._fsp--;

                     after(grammarAccess.getUnaryOrPrimaryExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQL.g:1213:2: ( ruleUnaryExpression )
                    {
                    // InternalQL.g:1213:2: ( ruleUnaryExpression )
                    // InternalQL.g:1214:3: ruleUnaryExpression
                    {
                     before(grammarAccess.getUnaryOrPrimaryExpressionAccess().getUnaryExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleUnaryExpression();

                    state._fsp--;

                     after(grammarAccess.getUnaryOrPrimaryExpressionAccess().getUnaryExpressionParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryOrPrimaryExpression__Alternatives"


    // $ANTLR start "rule__PrimaryExpression__Alternatives"
    // InternalQL.g:1223:1: rule__PrimaryExpression__Alternatives : ( ( ruleCall ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1227:1: ( ( ruleCall ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_ID)||LA4_0==59||LA4_0==61||LA4_0==63||LA4_0==66||LA4_0==74) ) {
                alt4=1;
            }
            else if ( (LA4_0==41) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalQL.g:1228:2: ( ruleCall )
                    {
                    // InternalQL.g:1228:2: ( ruleCall )
                    // InternalQL.g:1229:3: ruleCall
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getCallParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCall();

                    state._fsp--;

                     after(grammarAccess.getPrimaryExpressionAccess().getCallParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQL.g:1234:2: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    {
                    // InternalQL.g:1234:2: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    // InternalQL.g:1235:3: ( rule__PrimaryExpression__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_1()); 
                    // InternalQL.g:1236:3: ( rule__PrimaryExpression__Group_1__0 )
                    // InternalQL.g:1236:4: rule__PrimaryExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Alternatives"


    // $ANTLR start "rule__PrimaryExpression__Alternatives_1_1"
    // InternalQL.g:1244:1: rule__PrimaryExpression__Alternatives_1_1 : ( ( ruleOrExpression ) | ( ruleUnaryExpression ) );
    public final void rule__PrimaryExpression__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1248:1: ( ( ruleOrExpression ) | ( ruleUnaryExpression ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)||LA5_0==41||LA5_0==59||LA5_0==61||LA5_0==63||LA5_0==66||LA5_0==74) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=29 && LA5_0<=30)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalQL.g:1249:2: ( ruleOrExpression )
                    {
                    // InternalQL.g:1249:2: ( ruleOrExpression )
                    // InternalQL.g:1250:3: ruleOrExpression
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getOrExpressionParserRuleCall_1_1_0()); 
                    pushFollow(FOLLOW_2);
                    ruleOrExpression();

                    state._fsp--;

                     after(grammarAccess.getPrimaryExpressionAccess().getOrExpressionParserRuleCall_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQL.g:1255:2: ( ruleUnaryExpression )
                    {
                    // InternalQL.g:1255:2: ( ruleUnaryExpression )
                    // InternalQL.g:1256:3: ruleUnaryExpression
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getUnaryExpressionParserRuleCall_1_1_1()); 
                    pushFollow(FOLLOW_2);
                    ruleUnaryExpression();

                    state._fsp--;

                     after(grammarAccess.getPrimaryExpressionAccess().getUnaryExpressionParserRuleCall_1_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Alternatives_1_1"


    // $ANTLR start "rule__Call__Alternatives"
    // InternalQL.g:1265:1: rule__Call__Alternatives : ( ( ruleConstantCall ) | ( ruleQuestionCall ) );
    public final void rule__Call__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1269:1: ( ( ruleConstantCall ) | ( ruleQuestionCall ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==59||LA6_0==61||LA6_0==63||LA6_0==66||LA6_0==74) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_ID)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalQL.g:1270:2: ( ruleConstantCall )
                    {
                    // InternalQL.g:1270:2: ( ruleConstantCall )
                    // InternalQL.g:1271:3: ruleConstantCall
                    {
                     before(grammarAccess.getCallAccess().getConstantCallParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleConstantCall();

                    state._fsp--;

                     after(grammarAccess.getCallAccess().getConstantCallParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQL.g:1276:2: ( ruleQuestionCall )
                    {
                    // InternalQL.g:1276:2: ( ruleQuestionCall )
                    // InternalQL.g:1277:3: ruleQuestionCall
                    {
                     before(grammarAccess.getCallAccess().getQuestionCallParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleQuestionCall();

                    state._fsp--;

                     after(grammarAccess.getCallAccess().getQuestionCallParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Alternatives"


    // $ANTLR start "rule__Value__Alternatives"
    // InternalQL.g:1286:1: rule__Value__Alternatives : ( ( ruleIntegerValue ) | ( ruleStringValue ) | ( ruleBooleanValue ) | ( ruleDateValue ) | ( ruleDecimalValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1290:1: ( ( ruleIntegerValue ) | ( ruleStringValue ) | ( ruleBooleanValue ) | ( ruleDateValue ) | ( ruleDecimalValue ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt7=1;
                }
                break;
            case 61:
                {
                alt7=2;
                }
                break;
            case 63:
            case 74:
                {
                alt7=3;
                }
                break;
            case 64:
                {
                alt7=4;
                }
                break;
            case 66:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalQL.g:1291:2: ( ruleIntegerValue )
                    {
                    // InternalQL.g:1291:2: ( ruleIntegerValue )
                    // InternalQL.g:1292:3: ruleIntegerValue
                    {
                     before(grammarAccess.getValueAccess().getIntegerValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIntegerValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getIntegerValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQL.g:1297:2: ( ruleStringValue )
                    {
                    // InternalQL.g:1297:2: ( ruleStringValue )
                    // InternalQL.g:1298:3: ruleStringValue
                    {
                     before(grammarAccess.getValueAccess().getStringValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStringValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getStringValueParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQL.g:1303:2: ( ruleBooleanValue )
                    {
                    // InternalQL.g:1303:2: ( ruleBooleanValue )
                    // InternalQL.g:1304:3: ruleBooleanValue
                    {
                     before(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBooleanValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalQL.g:1309:2: ( ruleDateValue )
                    {
                    // InternalQL.g:1309:2: ( ruleDateValue )
                    // InternalQL.g:1310:3: ruleDateValue
                    {
                     before(grammarAccess.getValueAccess().getDateValueParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDateValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getDateValueParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalQL.g:1315:2: ( ruleDecimalValue )
                    {
                    // InternalQL.g:1315:2: ( ruleDecimalValue )
                    // InternalQL.g:1316:3: ruleDecimalValue
                    {
                     before(grammarAccess.getValueAccess().getDecimalValueParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleDecimalValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getDecimalValueParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__DefinitionGroup__Alternatives_3"
    // InternalQL.g:1325:1: rule__DefinitionGroup__Alternatives_3 : ( ( ( rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0 ) ) | ( ( rule__DefinitionGroup__DataTypesAssignment_3_1 ) ) );
    public final void rule__DefinitionGroup__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1329:1: ( ( ( rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0 ) ) | ( ( rule__DefinitionGroup__DataTypesAssignment_3_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==69||LA8_0==75) ) {
                alt8=1;
            }
            else if ( (LA8_0==47||(LA8_0>=49 && LA8_0<=50)||(LA8_0>=53 && LA8_0<=55)||LA8_0==58) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalQL.g:1330:2: ( ( rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0 ) )
                    {
                    // InternalQL.g:1330:2: ( ( rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0 ) )
                    // InternalQL.g:1331:3: ( rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0 )
                    {
                     before(grammarAccess.getDefinitionGroupAccess().getQuestionDefinitionsAssignment_3_0()); 
                    // InternalQL.g:1332:3: ( rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0 )
                    // InternalQL.g:1332:4: rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDefinitionGroupAccess().getQuestionDefinitionsAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQL.g:1336:2: ( ( rule__DefinitionGroup__DataTypesAssignment_3_1 ) )
                    {
                    // InternalQL.g:1336:2: ( ( rule__DefinitionGroup__DataTypesAssignment_3_1 ) )
                    // InternalQL.g:1337:3: ( rule__DefinitionGroup__DataTypesAssignment_3_1 )
                    {
                     before(grammarAccess.getDefinitionGroupAccess().getDataTypesAssignment_3_1()); 
                    // InternalQL.g:1338:3: ( rule__DefinitionGroup__DataTypesAssignment_3_1 )
                    // InternalQL.g:1338:4: rule__DefinitionGroup__DataTypesAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__DefinitionGroup__DataTypesAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getDefinitionGroupAccess().getDataTypesAssignment_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionGroup__Alternatives_3"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalQL.g:1346:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1350:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalQL.g:1351:2: ( RULE_STRING )
                    {
                    // InternalQL.g:1351:2: ( RULE_STRING )
                    // InternalQL.g:1352:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQL.g:1357:2: ( RULE_ID )
                    {
                    // InternalQL.g:1357:2: ( RULE_ID )
                    // InternalQL.g:1358:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__QuestionGroup__Alternatives_3"
    // InternalQL.g:1367:1: rule__QuestionGroup__Alternatives_3 : ( ( ( rule__QuestionGroup__QuestionGroupsAssignment_3_0 ) ) | ( ( rule__QuestionGroup__QuestionsAssignment_3_1 ) ) );
    public final void rule__QuestionGroup__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1371:1: ( ( ( rule__QuestionGroup__QuestionGroupsAssignment_3_0 ) ) | ( ( rule__QuestionGroup__QuestionsAssignment_3_1 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==39||LA10_0==46) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_ID)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalQL.g:1372:2: ( ( rule__QuestionGroup__QuestionGroupsAssignment_3_0 ) )
                    {
                    // InternalQL.g:1372:2: ( ( rule__QuestionGroup__QuestionGroupsAssignment_3_0 ) )
                    // InternalQL.g:1373:3: ( rule__QuestionGroup__QuestionGroupsAssignment_3_0 )
                    {
                     before(grammarAccess.getQuestionGroupAccess().getQuestionGroupsAssignment_3_0()); 
                    // InternalQL.g:1374:3: ( rule__QuestionGroup__QuestionGroupsAssignment_3_0 )
                    // InternalQL.g:1374:4: rule__QuestionGroup__QuestionGroupsAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QuestionGroup__QuestionGroupsAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getQuestionGroupAccess().getQuestionGroupsAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQL.g:1378:2: ( ( rule__QuestionGroup__QuestionsAssignment_3_1 ) )
                    {
                    // InternalQL.g:1378:2: ( ( rule__QuestionGroup__QuestionsAssignment_3_1 ) )
                    // InternalQL.g:1379:3: ( rule__QuestionGroup__QuestionsAssignment_3_1 )
                    {
                     before(grammarAccess.getQuestionGroupAccess().getQuestionsAssignment_3_1()); 
                    // InternalQL.g:1380:3: ( rule__QuestionGroup__QuestionsAssignment_3_1 )
                    // InternalQL.g:1380:4: rule__QuestionGroup__QuestionsAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__QuestionGroup__QuestionsAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getQuestionGroupAccess().getQuestionsAssignment_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Alternatives_3"


    // $ANTLR start "rule__ConstantCall__ValueAlternatives_1_0"
    // InternalQL.g:1388:1: rule__ConstantCall__ValueAlternatives_1_0 : ( ( ruleStringValue ) | ( ruleIntegerValue ) | ( ruleBooleanValue ) | ( ruleDecimalValue ) );
    public final void rule__ConstantCall__ValueAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1392:1: ( ( ruleStringValue ) | ( ruleIntegerValue ) | ( ruleBooleanValue ) | ( ruleDecimalValue ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt11=1;
                }
                break;
            case 59:
                {
                alt11=2;
                }
                break;
            case 63:
            case 74:
                {
                alt11=3;
                }
                break;
            case 66:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalQL.g:1393:2: ( ruleStringValue )
                    {
                    // InternalQL.g:1393:2: ( ruleStringValue )
                    // InternalQL.g:1394:3: ruleStringValue
                    {
                     before(grammarAccess.getConstantCallAccess().getValueStringValueParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStringValue();

                    state._fsp--;

                     after(grammarAccess.getConstantCallAccess().getValueStringValueParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQL.g:1399:2: ( ruleIntegerValue )
                    {
                    // InternalQL.g:1399:2: ( ruleIntegerValue )
                    // InternalQL.g:1400:3: ruleIntegerValue
                    {
                     before(grammarAccess.getConstantCallAccess().getValueIntegerValueParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIntegerValue();

                    state._fsp--;

                     after(grammarAccess.getConstantCallAccess().getValueIntegerValueParserRuleCall_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQL.g:1405:2: ( ruleBooleanValue )
                    {
                    // InternalQL.g:1405:2: ( ruleBooleanValue )
                    // InternalQL.g:1406:3: ruleBooleanValue
                    {
                     before(grammarAccess.getConstantCallAccess().getValueBooleanValueParserRuleCall_1_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBooleanValue();

                    state._fsp--;

                     after(grammarAccess.getConstantCallAccess().getValueBooleanValueParserRuleCall_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalQL.g:1411:2: ( ruleDecimalValue )
                    {
                    // InternalQL.g:1411:2: ( ruleDecimalValue )
                    // InternalQL.g:1412:3: ruleDecimalValue
                    {
                     before(grammarAccess.getConstantCallAccess().getValueDecimalValueParserRuleCall_1_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDecimalValue();

                    state._fsp--;

                     after(grammarAccess.getConstantCallAccess().getValueDecimalValueParserRuleCall_1_0_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantCall__ValueAlternatives_1_0"


    // $ANTLR start "rule__EFloat__Alternatives_4_0"
    // InternalQL.g:1421:1: rule__EFloat__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EFloat__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1425:1: ( ( 'E' ) | ( 'e' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==15) ) {
                alt12=1;
            }
            else if ( (LA12_0==16) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalQL.g:1426:2: ( 'E' )
                    {
                    // InternalQL.g:1426:2: ( 'E' )
                    // InternalQL.g:1427:3: 'E'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQL.g:1432:2: ( 'e' )
                    {
                    // InternalQL.g:1432:2: ( 'e' )
                    // InternalQL.g:1433:3: 'e'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Alternatives_4_0"


    // $ANTLR start "rule__BinaryOperatorKind__Alternatives"
    // InternalQL.g:1442:1: rule__BinaryOperatorKind__Alternatives : ( ( ( 'PLUS' ) ) | ( ( 'MINUS' ) ) | ( ( 'MULT' ) ) | ( ( 'DIV' ) ) | ( ( 'EQUAL' ) ) | ( ( 'NOTEQUAL' ) ) | ( ( 'GREATER' ) ) | ( ( 'LOWER' ) ) | ( ( 'GREATEROREQUAL' ) ) | ( ( 'LOWEROREQUAL' ) ) | ( ( 'AND' ) ) | ( ( 'OR' ) ) );
    public final void rule__BinaryOperatorKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1446:1: ( ( ( 'PLUS' ) ) | ( ( 'MINUS' ) ) | ( ( 'MULT' ) ) | ( ( 'DIV' ) ) | ( ( 'EQUAL' ) ) | ( ( 'NOTEQUAL' ) ) | ( ( 'GREATER' ) ) | ( ( 'LOWER' ) ) | ( ( 'GREATEROREQUAL' ) ) | ( ( 'LOWEROREQUAL' ) ) | ( ( 'AND' ) ) | ( ( 'OR' ) ) )
            int alt13=12;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt13=1;
                }
                break;
            case 18:
                {
                alt13=2;
                }
                break;
            case 19:
                {
                alt13=3;
                }
                break;
            case 20:
                {
                alt13=4;
                }
                break;
            case 21:
                {
                alt13=5;
                }
                break;
            case 22:
                {
                alt13=6;
                }
                break;
            case 23:
                {
                alt13=7;
                }
                break;
            case 24:
                {
                alt13=8;
                }
                break;
            case 25:
                {
                alt13=9;
                }
                break;
            case 26:
                {
                alt13=10;
                }
                break;
            case 27:
                {
                alt13=11;
                }
                break;
            case 28:
                {
                alt13=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalQL.g:1447:2: ( ( 'PLUS' ) )
                    {
                    // InternalQL.g:1447:2: ( ( 'PLUS' ) )
                    // InternalQL.g:1448:3: ( 'PLUS' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getPLUSEnumLiteralDeclaration_0()); 
                    // InternalQL.g:1449:3: ( 'PLUS' )
                    // InternalQL.g:1449:4: 'PLUS'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getPLUSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQL.g:1453:2: ( ( 'MINUS' ) )
                    {
                    // InternalQL.g:1453:2: ( ( 'MINUS' ) )
                    // InternalQL.g:1454:3: ( 'MINUS' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getMINUSEnumLiteralDeclaration_1()); 
                    // InternalQL.g:1455:3: ( 'MINUS' )
                    // InternalQL.g:1455:4: 'MINUS'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getMINUSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQL.g:1459:2: ( ( 'MULT' ) )
                    {
                    // InternalQL.g:1459:2: ( ( 'MULT' ) )
                    // InternalQL.g:1460:3: ( 'MULT' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getMULTEnumLiteralDeclaration_2()); 
                    // InternalQL.g:1461:3: ( 'MULT' )
                    // InternalQL.g:1461:4: 'MULT'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getMULTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalQL.g:1465:2: ( ( 'DIV' ) )
                    {
                    // InternalQL.g:1465:2: ( ( 'DIV' ) )
                    // InternalQL.g:1466:3: ( 'DIV' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getDIVEnumLiteralDeclaration_3()); 
                    // InternalQL.g:1467:3: ( 'DIV' )
                    // InternalQL.g:1467:4: 'DIV'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getDIVEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalQL.g:1471:2: ( ( 'EQUAL' ) )
                    {
                    // InternalQL.g:1471:2: ( ( 'EQUAL' ) )
                    // InternalQL.g:1472:3: ( 'EQUAL' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getEQUALEnumLiteralDeclaration_4()); 
                    // InternalQL.g:1473:3: ( 'EQUAL' )
                    // InternalQL.g:1473:4: 'EQUAL'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getEQUALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalQL.g:1477:2: ( ( 'NOTEQUAL' ) )
                    {
                    // InternalQL.g:1477:2: ( ( 'NOTEQUAL' ) )
                    // InternalQL.g:1478:3: ( 'NOTEQUAL' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getNOTEQUALEnumLiteralDeclaration_5()); 
                    // InternalQL.g:1479:3: ( 'NOTEQUAL' )
                    // InternalQL.g:1479:4: 'NOTEQUAL'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getNOTEQUALEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalQL.g:1483:2: ( ( 'GREATER' ) )
                    {
                    // InternalQL.g:1483:2: ( ( 'GREATER' ) )
                    // InternalQL.g:1484:3: ( 'GREATER' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getGREATEREnumLiteralDeclaration_6()); 
                    // InternalQL.g:1485:3: ( 'GREATER' )
                    // InternalQL.g:1485:4: 'GREATER'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getGREATEREnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalQL.g:1489:2: ( ( 'LOWER' ) )
                    {
                    // InternalQL.g:1489:2: ( ( 'LOWER' ) )
                    // InternalQL.g:1490:3: ( 'LOWER' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getLOWEREnumLiteralDeclaration_7()); 
                    // InternalQL.g:1491:3: ( 'LOWER' )
                    // InternalQL.g:1491:4: 'LOWER'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getLOWEREnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalQL.g:1495:2: ( ( 'GREATEROREQUAL' ) )
                    {
                    // InternalQL.g:1495:2: ( ( 'GREATEROREQUAL' ) )
                    // InternalQL.g:1496:3: ( 'GREATEROREQUAL' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getGREATEROREQUALEnumLiteralDeclaration_8()); 
                    // InternalQL.g:1497:3: ( 'GREATEROREQUAL' )
                    // InternalQL.g:1497:4: 'GREATEROREQUAL'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getGREATEROREQUALEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalQL.g:1501:2: ( ( 'LOWEROREQUAL' ) )
                    {
                    // InternalQL.g:1501:2: ( ( 'LOWEROREQUAL' ) )
                    // InternalQL.g:1502:3: ( 'LOWEROREQUAL' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getLOWEROREQUALEnumLiteralDeclaration_9()); 
                    // InternalQL.g:1503:3: ( 'LOWEROREQUAL' )
                    // InternalQL.g:1503:4: 'LOWEROREQUAL'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getLOWEROREQUALEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalQL.g:1507:2: ( ( 'AND' ) )
                    {
                    // InternalQL.g:1507:2: ( ( 'AND' ) )
                    // InternalQL.g:1508:3: ( 'AND' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getANDEnumLiteralDeclaration_10()); 
                    // InternalQL.g:1509:3: ( 'AND' )
                    // InternalQL.g:1509:4: 'AND'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getANDEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalQL.g:1513:2: ( ( 'OR' ) )
                    {
                    // InternalQL.g:1513:2: ( ( 'OR' ) )
                    // InternalQL.g:1514:3: ( 'OR' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getOREnumLiteralDeclaration_11()); 
                    // InternalQL.g:1515:3: ( 'OR' )
                    // InternalQL.g:1515:4: 'OR'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getOREnumLiteralDeclaration_11()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryOperatorKind__Alternatives"


    // $ANTLR start "rule__UnaryOperatorKind__Alternatives"
    // InternalQL.g:1523:1: rule__UnaryOperatorKind__Alternatives : ( ( ( '-' ) ) | ( ( 'not' ) ) );
    public final void rule__UnaryOperatorKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1527:1: ( ( ( '-' ) ) | ( ( 'not' ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            else if ( (LA14_0==30) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalQL.g:1528:2: ( ( '-' ) )
                    {
                    // InternalQL.g:1528:2: ( ( '-' ) )
                    // InternalQL.g:1529:3: ( '-' )
                    {
                     before(grammarAccess.getUnaryOperatorKindAccess().getUNARYMINUSEnumLiteralDeclaration_0()); 
                    // InternalQL.g:1530:3: ( '-' )
                    // InternalQL.g:1530:4: '-'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getUnaryOperatorKindAccess().getUNARYMINUSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQL.g:1534:2: ( ( 'not' ) )
                    {
                    // InternalQL.g:1534:2: ( ( 'not' ) )
                    // InternalQL.g:1535:3: ( 'not' )
                    {
                     before(grammarAccess.getUnaryOperatorKindAccess().getNOTEnumLiteralDeclaration_1()); 
                    // InternalQL.g:1536:3: ( 'not' )
                    // InternalQL.g:1536:4: 'not'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getUnaryOperatorKindAccess().getNOTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryOperatorKind__Alternatives"


    // $ANTLR start "rule__AdditionOperatorKind__Alternatives"
    // InternalQL.g:1544:1: rule__AdditionOperatorKind__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__AdditionOperatorKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1548:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            else if ( (LA15_0==29) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalQL.g:1549:2: ( ( '+' ) )
                    {
                    // InternalQL.g:1549:2: ( ( '+' ) )
                    // InternalQL.g:1550:3: ( '+' )
                    {
                     before(grammarAccess.getAdditionOperatorKindAccess().getPLUSEnumLiteralDeclaration_0()); 
                    // InternalQL.g:1551:3: ( '+' )
                    // InternalQL.g:1551:4: '+'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getAdditionOperatorKindAccess().getPLUSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQL.g:1555:2: ( ( '-' ) )
                    {
                    // InternalQL.g:1555:2: ( ( '-' ) )
                    // InternalQL.g:1556:3: ( '-' )
                    {
                     before(grammarAccess.getAdditionOperatorKindAccess().getMINUSEnumLiteralDeclaration_1()); 
                    // InternalQL.g:1557:3: ( '-' )
                    // InternalQL.g:1557:4: '-'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getAdditionOperatorKindAccess().getMINUSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionOperatorKind__Alternatives"


    // $ANTLR start "rule__MultiplicationOperatorKind__Alternatives"
    // InternalQL.g:1565:1: rule__MultiplicationOperatorKind__Alternatives : ( ( ( '*' ) ) | ( ( '/' ) ) );
    public final void rule__MultiplicationOperatorKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1569:1: ( ( ( '*' ) ) | ( ( '/' ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==32) ) {
                alt16=1;
            }
            else if ( (LA16_0==33) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalQL.g:1570:2: ( ( '*' ) )
                    {
                    // InternalQL.g:1570:2: ( ( '*' ) )
                    // InternalQL.g:1571:3: ( '*' )
                    {
                     before(grammarAccess.getMultiplicationOperatorKindAccess().getMULTEnumLiteralDeclaration_0()); 
                    // InternalQL.g:1572:3: ( '*' )
                    // InternalQL.g:1572:4: '*'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getMultiplicationOperatorKindAccess().getMULTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQL.g:1576:2: ( ( '/' ) )
                    {
                    // InternalQL.g:1576:2: ( ( '/' ) )
                    // InternalQL.g:1577:3: ( '/' )
                    {
                     before(grammarAccess.getMultiplicationOperatorKindAccess().getDIVEnumLiteralDeclaration_1()); 
                    // InternalQL.g:1578:3: ( '/' )
                    // InternalQL.g:1578:4: '/'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getMultiplicationOperatorKindAccess().getDIVEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationOperatorKind__Alternatives"


    // $ANTLR start "rule__ComparisionOperatorKind__Alternatives"
    // InternalQL.g:1586:1: rule__ComparisionOperatorKind__Alternatives : ( ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) );
    public final void rule__ComparisionOperatorKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1590:1: ( ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt17=1;
                }
                break;
            case 35:
                {
                alt17=2;
                }
                break;
            case 36:
                {
                alt17=3;
                }
                break;
            case 37:
                {
                alt17=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalQL.g:1591:2: ( ( '>' ) )
                    {
                    // InternalQL.g:1591:2: ( ( '>' ) )
                    // InternalQL.g:1592:3: ( '>' )
                    {
                     before(grammarAccess.getComparisionOperatorKindAccess().getGREATEREnumLiteralDeclaration_0()); 
                    // InternalQL.g:1593:3: ( '>' )
                    // InternalQL.g:1593:4: '>'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisionOperatorKindAccess().getGREATEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQL.g:1597:2: ( ( '<' ) )
                    {
                    // InternalQL.g:1597:2: ( ( '<' ) )
                    // InternalQL.g:1598:3: ( '<' )
                    {
                     before(grammarAccess.getComparisionOperatorKindAccess().getLOWEREnumLiteralDeclaration_1()); 
                    // InternalQL.g:1599:3: ( '<' )
                    // InternalQL.g:1599:4: '<'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisionOperatorKindAccess().getLOWEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQL.g:1603:2: ( ( '>=' ) )
                    {
                    // InternalQL.g:1603:2: ( ( '>=' ) )
                    // InternalQL.g:1604:3: ( '>=' )
                    {
                     before(grammarAccess.getComparisionOperatorKindAccess().getGREATEROREQUALEnumLiteralDeclaration_2()); 
                    // InternalQL.g:1605:3: ( '>=' )
                    // InternalQL.g:1605:4: '>='
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisionOperatorKindAccess().getGREATEROREQUALEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalQL.g:1609:2: ( ( '<=' ) )
                    {
                    // InternalQL.g:1609:2: ( ( '<=' ) )
                    // InternalQL.g:1610:3: ( '<=' )
                    {
                     before(grammarAccess.getComparisionOperatorKindAccess().getLOWEROREQUALEnumLiteralDeclaration_3()); 
                    // InternalQL.g:1611:3: ( '<=' )
                    // InternalQL.g:1611:4: '<='
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisionOperatorKindAccess().getLOWEROREQUALEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisionOperatorKind__Alternatives"


    // $ANTLR start "rule__QLModel__Group__0"
    // InternalQL.g:1619:1: rule__QLModel__Group__0 : rule__QLModel__Group__0__Impl rule__QLModel__Group__1 ;
    public final void rule__QLModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1623:1: ( rule__QLModel__Group__0__Impl rule__QLModel__Group__1 )
            // InternalQL.g:1624:2: rule__QLModel__Group__0__Impl rule__QLModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__QLModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QLModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group__0"


    // $ANTLR start "rule__QLModel__Group__0__Impl"
    // InternalQL.g:1631:1: rule__QLModel__Group__0__Impl : ( () ) ;
    public final void rule__QLModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1635:1: ( ( () ) )
            // InternalQL.g:1636:1: ( () )
            {
            // InternalQL.g:1636:1: ( () )
            // InternalQL.g:1637:2: ()
            {
             before(grammarAccess.getQLModelAccess().getQLModelAction_0()); 
            // InternalQL.g:1638:2: ()
            // InternalQL.g:1638:3: 
            {
            }

             after(grammarAccess.getQLModelAccess().getQLModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group__0__Impl"


    // $ANTLR start "rule__QLModel__Group__1"
    // InternalQL.g:1646:1: rule__QLModel__Group__1 : rule__QLModel__Group__1__Impl rule__QLModel__Group__2 ;
    public final void rule__QLModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1650:1: ( rule__QLModel__Group__1__Impl rule__QLModel__Group__2 )
            // InternalQL.g:1651:2: rule__QLModel__Group__1__Impl rule__QLModel__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__QLModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QLModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group__1"


    // $ANTLR start "rule__QLModel__Group__1__Impl"
    // InternalQL.g:1658:1: rule__QLModel__Group__1__Impl : ( 'QLModel' ) ;
    public final void rule__QLModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1662:1: ( ( 'QLModel' ) )
            // InternalQL.g:1663:1: ( 'QLModel' )
            {
            // InternalQL.g:1663:1: ( 'QLModel' )
            // InternalQL.g:1664:2: 'QLModel'
            {
             before(grammarAccess.getQLModelAccess().getQLModelKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getQLModelAccess().getQLModelKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group__1__Impl"


    // $ANTLR start "rule__QLModel__Group__2"
    // InternalQL.g:1673:1: rule__QLModel__Group__2 : rule__QLModel__Group__2__Impl rule__QLModel__Group__3 ;
    public final void rule__QLModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1677:1: ( rule__QLModel__Group__2__Impl rule__QLModel__Group__3 )
            // InternalQL.g:1678:2: rule__QLModel__Group__2__Impl rule__QLModel__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__QLModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QLModel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group__2"


    // $ANTLR start "rule__QLModel__Group__2__Impl"
    // InternalQL.g:1685:1: rule__QLModel__Group__2__Impl : ( ( rule__QLModel__Group_2__0 )? ) ;
    public final void rule__QLModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1689:1: ( ( ( rule__QLModel__Group_2__0 )? ) )
            // InternalQL.g:1690:1: ( ( rule__QLModel__Group_2__0 )? )
            {
            // InternalQL.g:1690:1: ( ( rule__QLModel__Group_2__0 )? )
            // InternalQL.g:1691:2: ( rule__QLModel__Group_2__0 )?
            {
             before(grammarAccess.getQLModelAccess().getGroup_2()); 
            // InternalQL.g:1692:2: ( rule__QLModel__Group_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==41) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalQL.g:1692:3: rule__QLModel__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QLModel__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQLModelAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group__2__Impl"


    // $ANTLR start "rule__QLModel__Group__3"
    // InternalQL.g:1700:1: rule__QLModel__Group__3 : rule__QLModel__Group__3__Impl rule__QLModel__Group__4 ;
    public final void rule__QLModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1704:1: ( rule__QLModel__Group__3__Impl rule__QLModel__Group__4 )
            // InternalQL.g:1705:2: rule__QLModel__Group__3__Impl rule__QLModel__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__QLModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QLModel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group__3"


    // $ANTLR start "rule__QLModel__Group__3__Impl"
    // InternalQL.g:1712:1: rule__QLModel__Group__3__Impl : ( '{' ) ;
    public final void rule__QLModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1716:1: ( ( '{' ) )
            // InternalQL.g:1717:1: ( '{' )
            {
            // InternalQL.g:1717:1: ( '{' )
            // InternalQL.g:1718:2: '{'
            {
             before(grammarAccess.getQLModelAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getQLModelAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group__3__Impl"


    // $ANTLR start "rule__QLModel__Group__4"
    // InternalQL.g:1727:1: rule__QLModel__Group__4 : rule__QLModel__Group__4__Impl rule__QLModel__Group__5 ;
    public final void rule__QLModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1731:1: ( rule__QLModel__Group__4__Impl rule__QLModel__Group__5 )
            // InternalQL.g:1732:2: rule__QLModel__Group__4__Impl rule__QLModel__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__QLModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QLModel__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group__4"


    // $ANTLR start "rule__QLModel__Group__4__Impl"
    // InternalQL.g:1739:1: rule__QLModel__Group__4__Impl : ( ( rule__QLModel__Alternatives_4 )* ) ;
    public final void rule__QLModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1743:1: ( ( ( rule__QLModel__Alternatives_4 )* ) )
            // InternalQL.g:1744:1: ( ( rule__QLModel__Alternatives_4 )* )
            {
            // InternalQL.g:1744:1: ( ( rule__QLModel__Alternatives_4 )* )
            // InternalQL.g:1745:2: ( rule__QLModel__Alternatives_4 )*
            {
             before(grammarAccess.getQLModelAccess().getAlternatives_4()); 
            // InternalQL.g:1746:2: ( rule__QLModel__Alternatives_4 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=44 && LA19_0<=45)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalQL.g:1746:3: rule__QLModel__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__QLModel__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getQLModelAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group__4__Impl"


    // $ANTLR start "rule__QLModel__Group__5"
    // InternalQL.g:1754:1: rule__QLModel__Group__5 : rule__QLModel__Group__5__Impl ;
    public final void rule__QLModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1758:1: ( rule__QLModel__Group__5__Impl )
            // InternalQL.g:1759:2: rule__QLModel__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QLModel__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group__5"


    // $ANTLR start "rule__QLModel__Group__5__Impl"
    // InternalQL.g:1765:1: rule__QLModel__Group__5__Impl : ( '}' ) ;
    public final void rule__QLModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1769:1: ( ( '}' ) )
            // InternalQL.g:1770:1: ( '}' )
            {
            // InternalQL.g:1770:1: ( '}' )
            // InternalQL.g:1771:2: '}'
            {
             before(grammarAccess.getQLModelAccess().getRightCurlyBracketKeyword_5()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getQLModelAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group__5__Impl"


    // $ANTLR start "rule__QLModel__Group_2__0"
    // InternalQL.g:1781:1: rule__QLModel__Group_2__0 : rule__QLModel__Group_2__0__Impl rule__QLModel__Group_2__1 ;
    public final void rule__QLModel__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1785:1: ( rule__QLModel__Group_2__0__Impl rule__QLModel__Group_2__1 )
            // InternalQL.g:1786:2: rule__QLModel__Group_2__0__Impl rule__QLModel__Group_2__1
            {
            pushFollow(FOLLOW_7);
            rule__QLModel__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QLModel__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_2__0"


    // $ANTLR start "rule__QLModel__Group_2__0__Impl"
    // InternalQL.g:1793:1: rule__QLModel__Group_2__0__Impl : ( '(' ) ;
    public final void rule__QLModel__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1797:1: ( ( '(' ) )
            // InternalQL.g:1798:1: ( '(' )
            {
            // InternalQL.g:1798:1: ( '(' )
            // InternalQL.g:1799:2: '('
            {
             before(grammarAccess.getQLModelAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getQLModelAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_2__0__Impl"


    // $ANTLR start "rule__QLModel__Group_2__1"
    // InternalQL.g:1808:1: rule__QLModel__Group_2__1 : rule__QLModel__Group_2__1__Impl rule__QLModel__Group_2__2 ;
    public final void rule__QLModel__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1812:1: ( rule__QLModel__Group_2__1__Impl rule__QLModel__Group_2__2 )
            // InternalQL.g:1813:2: rule__QLModel__Group_2__1__Impl rule__QLModel__Group_2__2
            {
            pushFollow(FOLLOW_7);
            rule__QLModel__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QLModel__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_2__1"


    // $ANTLR start "rule__QLModel__Group_2__1__Impl"
    // InternalQL.g:1820:1: rule__QLModel__Group_2__1__Impl : ( ( rule__QLModel__CanSubmitAssignment_2_1 )? ) ;
    public final void rule__QLModel__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1824:1: ( ( ( rule__QLModel__CanSubmitAssignment_2_1 )? ) )
            // InternalQL.g:1825:1: ( ( rule__QLModel__CanSubmitAssignment_2_1 )? )
            {
            // InternalQL.g:1825:1: ( ( rule__QLModel__CanSubmitAssignment_2_1 )? )
            // InternalQL.g:1826:2: ( rule__QLModel__CanSubmitAssignment_2_1 )?
            {
             before(grammarAccess.getQLModelAccess().getCanSubmitAssignment_2_1()); 
            // InternalQL.g:1827:2: ( rule__QLModel__CanSubmitAssignment_2_1 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==73) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalQL.g:1827:3: rule__QLModel__CanSubmitAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__QLModel__CanSubmitAssignment_2_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQLModelAccess().getCanSubmitAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_2__1__Impl"


    // $ANTLR start "rule__QLModel__Group_2__2"
    // InternalQL.g:1835:1: rule__QLModel__Group_2__2 : rule__QLModel__Group_2__2__Impl rule__QLModel__Group_2__3 ;
    public final void rule__QLModel__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1839:1: ( rule__QLModel__Group_2__2__Impl rule__QLModel__Group_2__3 )
            // InternalQL.g:1840:2: rule__QLModel__Group_2__2__Impl rule__QLModel__Group_2__3
            {
            pushFollow(FOLLOW_7);
            rule__QLModel__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QLModel__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_2__2"


    // $ANTLR start "rule__QLModel__Group_2__2__Impl"
    // InternalQL.g:1847:1: rule__QLModel__Group_2__2__Impl : ( ( rule__QLModel__Group_2_2__0 )? ) ;
    public final void rule__QLModel__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1851:1: ( ( ( rule__QLModel__Group_2_2__0 )? ) )
            // InternalQL.g:1852:1: ( ( rule__QLModel__Group_2_2__0 )? )
            {
            // InternalQL.g:1852:1: ( ( rule__QLModel__Group_2_2__0 )? )
            // InternalQL.g:1853:2: ( rule__QLModel__Group_2_2__0 )?
            {
             before(grammarAccess.getQLModelAccess().getGroup_2_2()); 
            // InternalQL.g:1854:2: ( rule__QLModel__Group_2_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==43) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalQL.g:1854:3: rule__QLModel__Group_2_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QLModel__Group_2_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQLModelAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_2__2__Impl"


    // $ANTLR start "rule__QLModel__Group_2__3"
    // InternalQL.g:1862:1: rule__QLModel__Group_2__3 : rule__QLModel__Group_2__3__Impl ;
    public final void rule__QLModel__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1866:1: ( rule__QLModel__Group_2__3__Impl )
            // InternalQL.g:1867:2: rule__QLModel__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QLModel__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_2__3"


    // $ANTLR start "rule__QLModel__Group_2__3__Impl"
    // InternalQL.g:1873:1: rule__QLModel__Group_2__3__Impl : ( ')' ) ;
    public final void rule__QLModel__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1877:1: ( ( ')' ) )
            // InternalQL.g:1878:1: ( ')' )
            {
            // InternalQL.g:1878:1: ( ')' )
            // InternalQL.g:1879:2: ')'
            {
             before(grammarAccess.getQLModelAccess().getRightParenthesisKeyword_2_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getQLModelAccess().getRightParenthesisKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_2__3__Impl"


    // $ANTLR start "rule__QLModel__Group_2_2__0"
    // InternalQL.g:1889:1: rule__QLModel__Group_2_2__0 : rule__QLModel__Group_2_2__0__Impl rule__QLModel__Group_2_2__1 ;
    public final void rule__QLModel__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1893:1: ( rule__QLModel__Group_2_2__0__Impl rule__QLModel__Group_2_2__1 )
            // InternalQL.g:1894:2: rule__QLModel__Group_2_2__0__Impl rule__QLModel__Group_2_2__1
            {
            pushFollow(FOLLOW_8);
            rule__QLModel__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QLModel__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_2_2__0"


    // $ANTLR start "rule__QLModel__Group_2_2__0__Impl"
    // InternalQL.g:1901:1: rule__QLModel__Group_2_2__0__Impl : ( 'submitDate' ) ;
    public final void rule__QLModel__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1905:1: ( ( 'submitDate' ) )
            // InternalQL.g:1906:1: ( 'submitDate' )
            {
            // InternalQL.g:1906:1: ( 'submitDate' )
            // InternalQL.g:1907:2: 'submitDate'
            {
             before(grammarAccess.getQLModelAccess().getSubmitDateKeyword_2_2_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getQLModelAccess().getSubmitDateKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_2_2__0__Impl"


    // $ANTLR start "rule__QLModel__Group_2_2__1"
    // InternalQL.g:1916:1: rule__QLModel__Group_2_2__1 : rule__QLModel__Group_2_2__1__Impl ;
    public final void rule__QLModel__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1920:1: ( rule__QLModel__Group_2_2__1__Impl )
            // InternalQL.g:1921:2: rule__QLModel__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QLModel__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_2_2__1"


    // $ANTLR start "rule__QLModel__Group_2_2__1__Impl"
    // InternalQL.g:1927:1: rule__QLModel__Group_2_2__1__Impl : ( ( rule__QLModel__SubmitDateAssignment_2_2_1 ) ) ;
    public final void rule__QLModel__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1931:1: ( ( ( rule__QLModel__SubmitDateAssignment_2_2_1 ) ) )
            // InternalQL.g:1932:1: ( ( rule__QLModel__SubmitDateAssignment_2_2_1 ) )
            {
            // InternalQL.g:1932:1: ( ( rule__QLModel__SubmitDateAssignment_2_2_1 ) )
            // InternalQL.g:1933:2: ( rule__QLModel__SubmitDateAssignment_2_2_1 )
            {
             before(grammarAccess.getQLModelAccess().getSubmitDateAssignment_2_2_1()); 
            // InternalQL.g:1934:2: ( rule__QLModel__SubmitDateAssignment_2_2_1 )
            // InternalQL.g:1934:3: rule__QLModel__SubmitDateAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__QLModel__SubmitDateAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getQLModelAccess().getSubmitDateAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_2_2__1__Impl"


    // $ANTLR start "rule__UnaryExpression__Group__0"
    // InternalQL.g:1943:1: rule__UnaryExpression__Group__0 : rule__UnaryExpression__Group__0__Impl rule__UnaryExpression__Group__1 ;
    public final void rule__UnaryExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1947:1: ( rule__UnaryExpression__Group__0__Impl rule__UnaryExpression__Group__1 )
            // InternalQL.g:1948:2: rule__UnaryExpression__Group__0__Impl rule__UnaryExpression__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__UnaryExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnaryExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group__0"


    // $ANTLR start "rule__UnaryExpression__Group__0__Impl"
    // InternalQL.g:1955:1: rule__UnaryExpression__Group__0__Impl : ( () ) ;
    public final void rule__UnaryExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1959:1: ( ( () ) )
            // InternalQL.g:1960:1: ( () )
            {
            // InternalQL.g:1960:1: ( () )
            // InternalQL.g:1961:2: ()
            {
             before(grammarAccess.getUnaryExpressionAccess().getBasicUnaryExpressionAction_0()); 
            // InternalQL.g:1962:2: ()
            // InternalQL.g:1962:3: 
            {
            }

             after(grammarAccess.getUnaryExpressionAccess().getBasicUnaryExpressionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group__0__Impl"


    // $ANTLR start "rule__UnaryExpression__Group__1"
    // InternalQL.g:1970:1: rule__UnaryExpression__Group__1 : rule__UnaryExpression__Group__1__Impl rule__UnaryExpression__Group__2 ;
    public final void rule__UnaryExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1974:1: ( rule__UnaryExpression__Group__1__Impl rule__UnaryExpression__Group__2 )
            // InternalQL.g:1975:2: rule__UnaryExpression__Group__1__Impl rule__UnaryExpression__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__UnaryExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnaryExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group__1"


    // $ANTLR start "rule__UnaryExpression__Group__1__Impl"
    // InternalQL.g:1982:1: rule__UnaryExpression__Group__1__Impl : ( ( rule__UnaryExpression__OperatorAssignment_1 ) ) ;
    public final void rule__UnaryExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1986:1: ( ( ( rule__UnaryExpression__OperatorAssignment_1 ) ) )
            // InternalQL.g:1987:1: ( ( rule__UnaryExpression__OperatorAssignment_1 ) )
            {
            // InternalQL.g:1987:1: ( ( rule__UnaryExpression__OperatorAssignment_1 ) )
            // InternalQL.g:1988:2: ( rule__UnaryExpression__OperatorAssignment_1 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getOperatorAssignment_1()); 
            // InternalQL.g:1989:2: ( rule__UnaryExpression__OperatorAssignment_1 )
            // InternalQL.g:1989:3: rule__UnaryExpression__OperatorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__OperatorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUnaryExpressionAccess().getOperatorAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group__1__Impl"


    // $ANTLR start "rule__UnaryExpression__Group__2"
    // InternalQL.g:1997:1: rule__UnaryExpression__Group__2 : rule__UnaryExpression__Group__2__Impl ;
    public final void rule__UnaryExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2001:1: ( rule__UnaryExpression__Group__2__Impl )
            // InternalQL.g:2002:2: rule__UnaryExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group__2"


    // $ANTLR start "rule__UnaryExpression__Group__2__Impl"
    // InternalQL.g:2008:1: rule__UnaryExpression__Group__2__Impl : ( ( rule__UnaryExpression__OperandAssignment_2 ) ) ;
    public final void rule__UnaryExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2012:1: ( ( ( rule__UnaryExpression__OperandAssignment_2 ) ) )
            // InternalQL.g:2013:1: ( ( rule__UnaryExpression__OperandAssignment_2 ) )
            {
            // InternalQL.g:2013:1: ( ( rule__UnaryExpression__OperandAssignment_2 ) )
            // InternalQL.g:2014:2: ( rule__UnaryExpression__OperandAssignment_2 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getOperandAssignment_2()); 
            // InternalQL.g:2015:2: ( rule__UnaryExpression__OperandAssignment_2 )
            // InternalQL.g:2015:3: rule__UnaryExpression__OperandAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__OperandAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUnaryExpressionAccess().getOperandAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_1__0"
    // InternalQL.g:2024:1: rule__PrimaryExpression__Group_1__0 : rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 ;
    public final void rule__PrimaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2028:1: ( rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 )
            // InternalQL.g:2029:2: rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__PrimaryExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__0"


    // $ANTLR start "rule__PrimaryExpression__Group_1__0__Impl"
    // InternalQL.g:2036:1: rule__PrimaryExpression__Group_1__0__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2040:1: ( ( '(' ) )
            // InternalQL.g:2041:1: ( '(' )
            {
            // InternalQL.g:2041:1: ( '(' )
            // InternalQL.g:2042:2: '('
            {
             before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_1__1"
    // InternalQL.g:2051:1: rule__PrimaryExpression__Group_1__1 : rule__PrimaryExpression__Group_1__1__Impl rule__PrimaryExpression__Group_1__2 ;
    public final void rule__PrimaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2055:1: ( rule__PrimaryExpression__Group_1__1__Impl rule__PrimaryExpression__Group_1__2 )
            // InternalQL.g:2056:2: rule__PrimaryExpression__Group_1__1__Impl rule__PrimaryExpression__Group_1__2
            {
            pushFollow(FOLLOW_11);
            rule__PrimaryExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__1"


    // $ANTLR start "rule__PrimaryExpression__Group_1__1__Impl"
    // InternalQL.g:2063:1: rule__PrimaryExpression__Group_1__1__Impl : ( ( rule__PrimaryExpression__Alternatives_1_1 ) ) ;
    public final void rule__PrimaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2067:1: ( ( ( rule__PrimaryExpression__Alternatives_1_1 ) ) )
            // InternalQL.g:2068:1: ( ( rule__PrimaryExpression__Alternatives_1_1 ) )
            {
            // InternalQL.g:2068:1: ( ( rule__PrimaryExpression__Alternatives_1_1 ) )
            // InternalQL.g:2069:2: ( rule__PrimaryExpression__Alternatives_1_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAlternatives_1_1()); 
            // InternalQL.g:2070:2: ( rule__PrimaryExpression__Alternatives_1_1 )
            // InternalQL.g:2070:3: rule__PrimaryExpression__Alternatives_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Alternatives_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getAlternatives_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_1__2"
    // InternalQL.g:2078:1: rule__PrimaryExpression__Group_1__2 : rule__PrimaryExpression__Group_1__2__Impl ;
    public final void rule__PrimaryExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2082:1: ( rule__PrimaryExpression__Group_1__2__Impl )
            // InternalQL.g:2083:2: rule__PrimaryExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__2"


    // $ANTLR start "rule__PrimaryExpression__Group_1__2__Impl"
    // InternalQL.g:2089:1: rule__PrimaryExpression__Group_1__2__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2093:1: ( ( ')' ) )
            // InternalQL.g:2094:1: ( ')' )
            {
            // InternalQL.g:2094:1: ( ')' )
            // InternalQL.g:2095:2: ')'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_1_2()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__2__Impl"


    // $ANTLR start "rule__OrExpression__Group__0"
    // InternalQL.g:2105:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2109:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // InternalQL.g:2110:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__OrExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__0"


    // $ANTLR start "rule__OrExpression__Group__0__Impl"
    // InternalQL.g:2117:1: rule__OrExpression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2121:1: ( ( ruleAndExpression ) )
            // InternalQL.g:2122:1: ( ruleAndExpression )
            {
            // InternalQL.g:2122:1: ( ruleAndExpression )
            // InternalQL.g:2123:2: ruleAndExpression
            {
             before(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__0__Impl"


    // $ANTLR start "rule__OrExpression__Group__1"
    // InternalQL.g:2132:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2136:1: ( rule__OrExpression__Group__1__Impl )
            // InternalQL.g:2137:2: rule__OrExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__1"


    // $ANTLR start "rule__OrExpression__Group__1__Impl"
    // InternalQL.g:2143:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2147:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // InternalQL.g:2148:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // InternalQL.g:2148:1: ( ( rule__OrExpression__Group_1__0 )* )
            // InternalQL.g:2149:2: ( rule__OrExpression__Group_1__0 )*
            {
             before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            // InternalQL.g:2150:2: ( rule__OrExpression__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==14) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalQL.g:2150:3: rule__OrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__OrExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getOrExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__1__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__0"
    // InternalQL.g:2159:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2163:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // InternalQL.g:2164:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__OrExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__0"


    // $ANTLR start "rule__OrExpression__Group_1__0__Impl"
    // InternalQL.g:2171:1: rule__OrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2175:1: ( ( () ) )
            // InternalQL.g:2176:1: ( () )
            {
            // InternalQL.g:2176:1: ( () )
            // InternalQL.g:2177:2: ()
            {
             before(grammarAccess.getOrExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0()); 
            // InternalQL.g:2178:2: ()
            // InternalQL.g:2178:3: 
            {
            }

             after(grammarAccess.getOrExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__0__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__1"
    // InternalQL.g:2186:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2190:1: ( rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 )
            // InternalQL.g:2191:2: rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2
            {
            pushFollow(FOLLOW_14);
            rule__OrExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__1"


    // $ANTLR start "rule__OrExpression__Group_1__1__Impl"
    // InternalQL.g:2198:1: rule__OrExpression__Group_1__1__Impl : ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2202:1: ( ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) )
            // InternalQL.g:2203:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            {
            // InternalQL.g:2203:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            // InternalQL.g:2204:2: ( rule__OrExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getOrExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalQL.g:2205:2: ( rule__OrExpression__OperatorAssignment_1_1 )
            // InternalQL.g:2205:3: rule__OrExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOrExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__1__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__2"
    // InternalQL.g:2213:1: rule__OrExpression__Group_1__2 : rule__OrExpression__Group_1__2__Impl ;
    public final void rule__OrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2217:1: ( rule__OrExpression__Group_1__2__Impl )
            // InternalQL.g:2218:2: rule__OrExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__2"


    // $ANTLR start "rule__OrExpression__Group_1__2__Impl"
    // InternalQL.g:2224:1: rule__OrExpression__Group_1__2__Impl : ( ( rule__OrExpression__RhsOperandAssignment_1_2 ) ) ;
    public final void rule__OrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2228:1: ( ( ( rule__OrExpression__RhsOperandAssignment_1_2 ) ) )
            // InternalQL.g:2229:1: ( ( rule__OrExpression__RhsOperandAssignment_1_2 ) )
            {
            // InternalQL.g:2229:1: ( ( rule__OrExpression__RhsOperandAssignment_1_2 ) )
            // InternalQL.g:2230:2: ( rule__OrExpression__RhsOperandAssignment_1_2 )
            {
             before(grammarAccess.getOrExpressionAccess().getRhsOperandAssignment_1_2()); 
            // InternalQL.g:2231:2: ( rule__OrExpression__RhsOperandAssignment_1_2 )
            // InternalQL.g:2231:3: rule__OrExpression__RhsOperandAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__RhsOperandAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOrExpressionAccess().getRhsOperandAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__2__Impl"


    // $ANTLR start "rule__AndExpression__Group__0"
    // InternalQL.g:2240:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2244:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // InternalQL.g:2245:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__AndExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__0"


    // $ANTLR start "rule__AndExpression__Group__0__Impl"
    // InternalQL.g:2252:1: rule__AndExpression__Group__0__Impl : ( ruleEqualExpression ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2256:1: ( ( ruleEqualExpression ) )
            // InternalQL.g:2257:1: ( ruleEqualExpression )
            {
            // InternalQL.g:2257:1: ( ruleEqualExpression )
            // InternalQL.g:2258:2: ruleEqualExpression
            {
             before(grammarAccess.getAndExpressionAccess().getEqualExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEqualExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionAccess().getEqualExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__0__Impl"


    // $ANTLR start "rule__AndExpression__Group__1"
    // InternalQL.g:2267:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2271:1: ( rule__AndExpression__Group__1__Impl )
            // InternalQL.g:2272:2: rule__AndExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__1"


    // $ANTLR start "rule__AndExpression__Group__1__Impl"
    // InternalQL.g:2278:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2282:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // InternalQL.g:2283:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // InternalQL.g:2283:1: ( ( rule__AndExpression__Group_1__0 )* )
            // InternalQL.g:2284:2: ( rule__AndExpression__Group_1__0 )*
            {
             before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            // InternalQL.g:2285:2: ( rule__AndExpression__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==13) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalQL.g:2285:3: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__AndExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getAndExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__1__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__0"
    // InternalQL.g:2294:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2298:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // InternalQL.g:2299:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
            {
            pushFollow(FOLLOW_15);
            rule__AndExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__0"


    // $ANTLR start "rule__AndExpression__Group_1__0__Impl"
    // InternalQL.g:2306:1: rule__AndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2310:1: ( ( () ) )
            // InternalQL.g:2311:1: ( () )
            {
            // InternalQL.g:2311:1: ( () )
            // InternalQL.g:2312:2: ()
            {
             before(grammarAccess.getAndExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0()); 
            // InternalQL.g:2313:2: ()
            // InternalQL.g:2313:3: 
            {
            }

             after(grammarAccess.getAndExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__0__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__1"
    // InternalQL.g:2321:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2325:1: ( rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 )
            // InternalQL.g:2326:2: rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2
            {
            pushFollow(FOLLOW_14);
            rule__AndExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__1"


    // $ANTLR start "rule__AndExpression__Group_1__1__Impl"
    // InternalQL.g:2333:1: rule__AndExpression__Group_1__1__Impl : ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2337:1: ( ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) )
            // InternalQL.g:2338:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            {
            // InternalQL.g:2338:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            // InternalQL.g:2339:2: ( rule__AndExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAndExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalQL.g:2340:2: ( rule__AndExpression__OperatorAssignment_1_1 )
            // InternalQL.g:2340:3: rule__AndExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__1__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__2"
    // InternalQL.g:2348:1: rule__AndExpression__Group_1__2 : rule__AndExpression__Group_1__2__Impl ;
    public final void rule__AndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2352:1: ( rule__AndExpression__Group_1__2__Impl )
            // InternalQL.g:2353:2: rule__AndExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__2"


    // $ANTLR start "rule__AndExpression__Group_1__2__Impl"
    // InternalQL.g:2359:1: rule__AndExpression__Group_1__2__Impl : ( ( rule__AndExpression__RhsOperandAssignment_1_2 ) ) ;
    public final void rule__AndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2363:1: ( ( ( rule__AndExpression__RhsOperandAssignment_1_2 ) ) )
            // InternalQL.g:2364:1: ( ( rule__AndExpression__RhsOperandAssignment_1_2 ) )
            {
            // InternalQL.g:2364:1: ( ( rule__AndExpression__RhsOperandAssignment_1_2 ) )
            // InternalQL.g:2365:2: ( rule__AndExpression__RhsOperandAssignment_1_2 )
            {
             before(grammarAccess.getAndExpressionAccess().getRhsOperandAssignment_1_2()); 
            // InternalQL.g:2366:2: ( rule__AndExpression__RhsOperandAssignment_1_2 )
            // InternalQL.g:2366:3: rule__AndExpression__RhsOperandAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__RhsOperandAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getRhsOperandAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__2__Impl"


    // $ANTLR start "rule__EqualExpression__Group__0"
    // InternalQL.g:2375:1: rule__EqualExpression__Group__0 : rule__EqualExpression__Group__0__Impl rule__EqualExpression__Group__1 ;
    public final void rule__EqualExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2379:1: ( rule__EqualExpression__Group__0__Impl rule__EqualExpression__Group__1 )
            // InternalQL.g:2380:2: rule__EqualExpression__Group__0__Impl rule__EqualExpression__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__EqualExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EqualExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualExpression__Group__0"


    // $ANTLR start "rule__EqualExpression__Group__0__Impl"
    // InternalQL.g:2387:1: rule__EqualExpression__Group__0__Impl : ( ruleComparisionExpression ) ;
    public final void rule__EqualExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2391:1: ( ( ruleComparisionExpression ) )
            // InternalQL.g:2392:1: ( ruleComparisionExpression )
            {
            // InternalQL.g:2392:1: ( ruleComparisionExpression )
            // InternalQL.g:2393:2: ruleComparisionExpression
            {
             before(grammarAccess.getEqualExpressionAccess().getComparisionExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleComparisionExpression();

            state._fsp--;

             after(grammarAccess.getEqualExpressionAccess().getComparisionExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualExpression__Group__0__Impl"


    // $ANTLR start "rule__EqualExpression__Group__1"
    // InternalQL.g:2402:1: rule__EqualExpression__Group__1 : rule__EqualExpression__Group__1__Impl ;
    public final void rule__EqualExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2406:1: ( rule__EqualExpression__Group__1__Impl )
            // InternalQL.g:2407:2: rule__EqualExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EqualExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualExpression__Group__1"


    // $ANTLR start "rule__EqualExpression__Group__1__Impl"
    // InternalQL.g:2413:1: rule__EqualExpression__Group__1__Impl : ( ( rule__EqualExpression__Group_1__0 )* ) ;
    public final void rule__EqualExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2417:1: ( ( ( rule__EqualExpression__Group_1__0 )* ) )
            // InternalQL.g:2418:1: ( ( rule__EqualExpression__Group_1__0 )* )
            {
            // InternalQL.g:2418:1: ( ( rule__EqualExpression__Group_1__0 )* )
            // InternalQL.g:2419:2: ( rule__EqualExpression__Group_1__0 )*
            {
             before(grammarAccess.getEqualExpressionAccess().getGroup_1()); 
            // InternalQL.g:2420:2: ( rule__EqualExpression__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==12) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalQL.g:2420:3: rule__EqualExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__EqualExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getEqualExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualExpression__Group__1__Impl"


    // $ANTLR start "rule__EqualExpression__Group_1__0"
    // InternalQL.g:2429:1: rule__EqualExpression__Group_1__0 : rule__EqualExpression__Group_1__0__Impl rule__EqualExpression__Group_1__1 ;
    public final void rule__EqualExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2433:1: ( rule__EqualExpression__Group_1__0__Impl rule__EqualExpression__Group_1__1 )
            // InternalQL.g:2434:2: rule__EqualExpression__Group_1__0__Impl rule__EqualExpression__Group_1__1
            {
            pushFollow(FOLLOW_17);
            rule__EqualExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EqualExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualExpression__Group_1__0"


    // $ANTLR start "rule__EqualExpression__Group_1__0__Impl"
    // InternalQL.g:2441:1: rule__EqualExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__EqualExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2445:1: ( ( () ) )
            // InternalQL.g:2446:1: ( () )
            {
            // InternalQL.g:2446:1: ( () )
            // InternalQL.g:2447:2: ()
            {
             before(grammarAccess.getEqualExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0()); 
            // InternalQL.g:2448:2: ()
            // InternalQL.g:2448:3: 
            {
            }

             after(grammarAccess.getEqualExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualExpression__Group_1__0__Impl"


    // $ANTLR start "rule__EqualExpression__Group_1__1"
    // InternalQL.g:2456:1: rule__EqualExpression__Group_1__1 : rule__EqualExpression__Group_1__1__Impl rule__EqualExpression__Group_1__2 ;
    public final void rule__EqualExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2460:1: ( rule__EqualExpression__Group_1__1__Impl rule__EqualExpression__Group_1__2 )
            // InternalQL.g:2461:2: rule__EqualExpression__Group_1__1__Impl rule__EqualExpression__Group_1__2
            {
            pushFollow(FOLLOW_14);
            rule__EqualExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EqualExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualExpression__Group_1__1"


    // $ANTLR start "rule__EqualExpression__Group_1__1__Impl"
    // InternalQL.g:2468:1: rule__EqualExpression__Group_1__1__Impl : ( ( rule__EqualExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__EqualExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2472:1: ( ( ( rule__EqualExpression__OperatorAssignment_1_1 ) ) )
            // InternalQL.g:2473:1: ( ( rule__EqualExpression__OperatorAssignment_1_1 ) )
            {
            // InternalQL.g:2473:1: ( ( rule__EqualExpression__OperatorAssignment_1_1 ) )
            // InternalQL.g:2474:2: ( rule__EqualExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getEqualExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalQL.g:2475:2: ( rule__EqualExpression__OperatorAssignment_1_1 )
            // InternalQL.g:2475:3: rule__EqualExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__EqualExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEqualExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualExpression__Group_1__1__Impl"


    // $ANTLR start "rule__EqualExpression__Group_1__2"
    // InternalQL.g:2483:1: rule__EqualExpression__Group_1__2 : rule__EqualExpression__Group_1__2__Impl ;
    public final void rule__EqualExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2487:1: ( rule__EqualExpression__Group_1__2__Impl )
            // InternalQL.g:2488:2: rule__EqualExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EqualExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualExpression__Group_1__2"


    // $ANTLR start "rule__EqualExpression__Group_1__2__Impl"
    // InternalQL.g:2494:1: rule__EqualExpression__Group_1__2__Impl : ( ( rule__EqualExpression__RhsOperandAssignment_1_2 ) ) ;
    public final void rule__EqualExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2498:1: ( ( ( rule__EqualExpression__RhsOperandAssignment_1_2 ) ) )
            // InternalQL.g:2499:1: ( ( rule__EqualExpression__RhsOperandAssignment_1_2 ) )
            {
            // InternalQL.g:2499:1: ( ( rule__EqualExpression__RhsOperandAssignment_1_2 ) )
            // InternalQL.g:2500:2: ( rule__EqualExpression__RhsOperandAssignment_1_2 )
            {
             before(grammarAccess.getEqualExpressionAccess().getRhsOperandAssignment_1_2()); 
            // InternalQL.g:2501:2: ( rule__EqualExpression__RhsOperandAssignment_1_2 )
            // InternalQL.g:2501:3: rule__EqualExpression__RhsOperandAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__EqualExpression__RhsOperandAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEqualExpressionAccess().getRhsOperandAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualExpression__Group_1__2__Impl"


    // $ANTLR start "rule__ComparisionExpression__Group__0"
    // InternalQL.g:2510:1: rule__ComparisionExpression__Group__0 : rule__ComparisionExpression__Group__0__Impl rule__ComparisionExpression__Group__1 ;
    public final void rule__ComparisionExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2514:1: ( rule__ComparisionExpression__Group__0__Impl rule__ComparisionExpression__Group__1 )
            // InternalQL.g:2515:2: rule__ComparisionExpression__Group__0__Impl rule__ComparisionExpression__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__ComparisionExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComparisionExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisionExpression__Group__0"


    // $ANTLR start "rule__ComparisionExpression__Group__0__Impl"
    // InternalQL.g:2522:1: rule__ComparisionExpression__Group__0__Impl : ( ruleAdditionExpression ) ;
    public final void rule__ComparisionExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2526:1: ( ( ruleAdditionExpression ) )
            // InternalQL.g:2527:1: ( ruleAdditionExpression )
            {
            // InternalQL.g:2527:1: ( ruleAdditionExpression )
            // InternalQL.g:2528:2: ruleAdditionExpression
            {
             before(grammarAccess.getComparisionExpressionAccess().getAdditionExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAdditionExpression();

            state._fsp--;

             after(grammarAccess.getComparisionExpressionAccess().getAdditionExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisionExpression__Group__0__Impl"


    // $ANTLR start "rule__ComparisionExpression__Group__1"
    // InternalQL.g:2537:1: rule__ComparisionExpression__Group__1 : rule__ComparisionExpression__Group__1__Impl ;
    public final void rule__ComparisionExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2541:1: ( rule__ComparisionExpression__Group__1__Impl )
            // InternalQL.g:2542:2: rule__ComparisionExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComparisionExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisionExpression__Group__1"


    // $ANTLR start "rule__ComparisionExpression__Group__1__Impl"
    // InternalQL.g:2548:1: rule__ComparisionExpression__Group__1__Impl : ( ( rule__ComparisionExpression__Group_1__0 )* ) ;
    public final void rule__ComparisionExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2552:1: ( ( ( rule__ComparisionExpression__Group_1__0 )* ) )
            // InternalQL.g:2553:1: ( ( rule__ComparisionExpression__Group_1__0 )* )
            {
            // InternalQL.g:2553:1: ( ( rule__ComparisionExpression__Group_1__0 )* )
            // InternalQL.g:2554:2: ( rule__ComparisionExpression__Group_1__0 )*
            {
             before(grammarAccess.getComparisionExpressionAccess().getGroup_1()); 
            // InternalQL.g:2555:2: ( rule__ComparisionExpression__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=34 && LA25_0<=37)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalQL.g:2555:3: rule__ComparisionExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__ComparisionExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getComparisionExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisionExpression__Group__1__Impl"


    // $ANTLR start "rule__ComparisionExpression__Group_1__0"
    // InternalQL.g:2564:1: rule__ComparisionExpression__Group_1__0 : rule__ComparisionExpression__Group_1__0__Impl rule__ComparisionExpression__Group_1__1 ;
    public final void rule__ComparisionExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2568:1: ( rule__ComparisionExpression__Group_1__0__Impl rule__ComparisionExpression__Group_1__1 )
            // InternalQL.g:2569:2: rule__ComparisionExpression__Group_1__0__Impl rule__ComparisionExpression__Group_1__1
            {
            pushFollow(FOLLOW_19);
            rule__ComparisionExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComparisionExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisionExpression__Group_1__0"


    // $ANTLR start "rule__ComparisionExpression__Group_1__0__Impl"
    // InternalQL.g:2576:1: rule__ComparisionExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ComparisionExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2580:1: ( ( () ) )
            // InternalQL.g:2581:1: ( () )
            {
            // InternalQL.g:2581:1: ( () )
            // InternalQL.g:2582:2: ()
            {
             before(grammarAccess.getComparisionExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0()); 
            // InternalQL.g:2583:2: ()
            // InternalQL.g:2583:3: 
            {
            }

             after(grammarAccess.getComparisionExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisionExpression__Group_1__0__Impl"


    // $ANTLR start "rule__ComparisionExpression__Group_1__1"
    // InternalQL.g:2591:1: rule__ComparisionExpression__Group_1__1 : rule__ComparisionExpression__Group_1__1__Impl rule__ComparisionExpression__Group_1__2 ;
    public final void rule__ComparisionExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2595:1: ( rule__ComparisionExpression__Group_1__1__Impl rule__ComparisionExpression__Group_1__2 )
            // InternalQL.g:2596:2: rule__ComparisionExpression__Group_1__1__Impl rule__ComparisionExpression__Group_1__2
            {
            pushFollow(FOLLOW_14);
            rule__ComparisionExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComparisionExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisionExpression__Group_1__1"


    // $ANTLR start "rule__ComparisionExpression__Group_1__1__Impl"
    // InternalQL.g:2603:1: rule__ComparisionExpression__Group_1__1__Impl : ( ( rule__ComparisionExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ComparisionExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2607:1: ( ( ( rule__ComparisionExpression__OperatorAssignment_1_1 ) ) )
            // InternalQL.g:2608:1: ( ( rule__ComparisionExpression__OperatorAssignment_1_1 ) )
            {
            // InternalQL.g:2608:1: ( ( rule__ComparisionExpression__OperatorAssignment_1_1 ) )
            // InternalQL.g:2609:2: ( rule__ComparisionExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getComparisionExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalQL.g:2610:2: ( rule__ComparisionExpression__OperatorAssignment_1_1 )
            // InternalQL.g:2610:3: rule__ComparisionExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ComparisionExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getComparisionExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisionExpression__Group_1__1__Impl"


    // $ANTLR start "rule__ComparisionExpression__Group_1__2"
    // InternalQL.g:2618:1: rule__ComparisionExpression__Group_1__2 : rule__ComparisionExpression__Group_1__2__Impl ;
    public final void rule__ComparisionExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2622:1: ( rule__ComparisionExpression__Group_1__2__Impl )
            // InternalQL.g:2623:2: rule__ComparisionExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComparisionExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisionExpression__Group_1__2"


    // $ANTLR start "rule__ComparisionExpression__Group_1__2__Impl"
    // InternalQL.g:2629:1: rule__ComparisionExpression__Group_1__2__Impl : ( ( rule__ComparisionExpression__RhsOperandAssignment_1_2 ) ) ;
    public final void rule__ComparisionExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2633:1: ( ( ( rule__ComparisionExpression__RhsOperandAssignment_1_2 ) ) )
            // InternalQL.g:2634:1: ( ( rule__ComparisionExpression__RhsOperandAssignment_1_2 ) )
            {
            // InternalQL.g:2634:1: ( ( rule__ComparisionExpression__RhsOperandAssignment_1_2 ) )
            // InternalQL.g:2635:2: ( rule__ComparisionExpression__RhsOperandAssignment_1_2 )
            {
             before(grammarAccess.getComparisionExpressionAccess().getRhsOperandAssignment_1_2()); 
            // InternalQL.g:2636:2: ( rule__ComparisionExpression__RhsOperandAssignment_1_2 )
            // InternalQL.g:2636:3: rule__ComparisionExpression__RhsOperandAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ComparisionExpression__RhsOperandAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getComparisionExpressionAccess().getRhsOperandAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisionExpression__Group_1__2__Impl"


    // $ANTLR start "rule__AdditionExpression__Group__0"
    // InternalQL.g:2645:1: rule__AdditionExpression__Group__0 : rule__AdditionExpression__Group__0__Impl rule__AdditionExpression__Group__1 ;
    public final void rule__AdditionExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2649:1: ( rule__AdditionExpression__Group__0__Impl rule__AdditionExpression__Group__1 )
            // InternalQL.g:2650:2: rule__AdditionExpression__Group__0__Impl rule__AdditionExpression__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__AdditionExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdditionExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group__0"


    // $ANTLR start "rule__AdditionExpression__Group__0__Impl"
    // InternalQL.g:2657:1: rule__AdditionExpression__Group__0__Impl : ( ruleMultiplicationExpression ) ;
    public final void rule__AdditionExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2661:1: ( ( ruleMultiplicationExpression ) )
            // InternalQL.g:2662:1: ( ruleMultiplicationExpression )
            {
            // InternalQL.g:2662:1: ( ruleMultiplicationExpression )
            // InternalQL.g:2663:2: ruleMultiplicationExpression
            {
             before(grammarAccess.getAdditionExpressionAccess().getMultiplicationExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicationExpression();

            state._fsp--;

             after(grammarAccess.getAdditionExpressionAccess().getMultiplicationExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group__0__Impl"


    // $ANTLR start "rule__AdditionExpression__Group__1"
    // InternalQL.g:2672:1: rule__AdditionExpression__Group__1 : rule__AdditionExpression__Group__1__Impl ;
    public final void rule__AdditionExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2676:1: ( rule__AdditionExpression__Group__1__Impl )
            // InternalQL.g:2677:2: rule__AdditionExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdditionExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group__1"


    // $ANTLR start "rule__AdditionExpression__Group__1__Impl"
    // InternalQL.g:2683:1: rule__AdditionExpression__Group__1__Impl : ( ( rule__AdditionExpression__Group_1__0 )* ) ;
    public final void rule__AdditionExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2687:1: ( ( ( rule__AdditionExpression__Group_1__0 )* ) )
            // InternalQL.g:2688:1: ( ( rule__AdditionExpression__Group_1__0 )* )
            {
            // InternalQL.g:2688:1: ( ( rule__AdditionExpression__Group_1__0 )* )
            // InternalQL.g:2689:2: ( rule__AdditionExpression__Group_1__0 )*
            {
             before(grammarAccess.getAdditionExpressionAccess().getGroup_1()); 
            // InternalQL.g:2690:2: ( rule__AdditionExpression__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==29||LA26_0==31) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalQL.g:2690:3: rule__AdditionExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__AdditionExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getAdditionExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group__1__Impl"


    // $ANTLR start "rule__AdditionExpression__Group_1__0"
    // InternalQL.g:2699:1: rule__AdditionExpression__Group_1__0 : rule__AdditionExpression__Group_1__0__Impl rule__AdditionExpression__Group_1__1 ;
    public final void rule__AdditionExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2703:1: ( rule__AdditionExpression__Group_1__0__Impl rule__AdditionExpression__Group_1__1 )
            // InternalQL.g:2704:2: rule__AdditionExpression__Group_1__0__Impl rule__AdditionExpression__Group_1__1
            {
            pushFollow(FOLLOW_21);
            rule__AdditionExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdditionExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group_1__0"


    // $ANTLR start "rule__AdditionExpression__Group_1__0__Impl"
    // InternalQL.g:2711:1: rule__AdditionExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AdditionExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2715:1: ( ( () ) )
            // InternalQL.g:2716:1: ( () )
            {
            // InternalQL.g:2716:1: ( () )
            // InternalQL.g:2717:2: ()
            {
             before(grammarAccess.getAdditionExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0()); 
            // InternalQL.g:2718:2: ()
            // InternalQL.g:2718:3: 
            {
            }

             after(grammarAccess.getAdditionExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group_1__0__Impl"


    // $ANTLR start "rule__AdditionExpression__Group_1__1"
    // InternalQL.g:2726:1: rule__AdditionExpression__Group_1__1 : rule__AdditionExpression__Group_1__1__Impl rule__AdditionExpression__Group_1__2 ;
    public final void rule__AdditionExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2730:1: ( rule__AdditionExpression__Group_1__1__Impl rule__AdditionExpression__Group_1__2 )
            // InternalQL.g:2731:2: rule__AdditionExpression__Group_1__1__Impl rule__AdditionExpression__Group_1__2
            {
            pushFollow(FOLLOW_14);
            rule__AdditionExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdditionExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group_1__1"


    // $ANTLR start "rule__AdditionExpression__Group_1__1__Impl"
    // InternalQL.g:2738:1: rule__AdditionExpression__Group_1__1__Impl : ( ( rule__AdditionExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AdditionExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2742:1: ( ( ( rule__AdditionExpression__OperatorAssignment_1_1 ) ) )
            // InternalQL.g:2743:1: ( ( rule__AdditionExpression__OperatorAssignment_1_1 ) )
            {
            // InternalQL.g:2743:1: ( ( rule__AdditionExpression__OperatorAssignment_1_1 ) )
            // InternalQL.g:2744:2: ( rule__AdditionExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAdditionExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalQL.g:2745:2: ( rule__AdditionExpression__OperatorAssignment_1_1 )
            // InternalQL.g:2745:3: rule__AdditionExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AdditionExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAdditionExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group_1__1__Impl"


    // $ANTLR start "rule__AdditionExpression__Group_1__2"
    // InternalQL.g:2753:1: rule__AdditionExpression__Group_1__2 : rule__AdditionExpression__Group_1__2__Impl ;
    public final void rule__AdditionExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2757:1: ( rule__AdditionExpression__Group_1__2__Impl )
            // InternalQL.g:2758:2: rule__AdditionExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdditionExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group_1__2"


    // $ANTLR start "rule__AdditionExpression__Group_1__2__Impl"
    // InternalQL.g:2764:1: rule__AdditionExpression__Group_1__2__Impl : ( ( rule__AdditionExpression__RhsOperandAssignment_1_2 ) ) ;
    public final void rule__AdditionExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2768:1: ( ( ( rule__AdditionExpression__RhsOperandAssignment_1_2 ) ) )
            // InternalQL.g:2769:1: ( ( rule__AdditionExpression__RhsOperandAssignment_1_2 ) )
            {
            // InternalQL.g:2769:1: ( ( rule__AdditionExpression__RhsOperandAssignment_1_2 ) )
            // InternalQL.g:2770:2: ( rule__AdditionExpression__RhsOperandAssignment_1_2 )
            {
             before(grammarAccess.getAdditionExpressionAccess().getRhsOperandAssignment_1_2()); 
            // InternalQL.g:2771:2: ( rule__AdditionExpression__RhsOperandAssignment_1_2 )
            // InternalQL.g:2771:3: rule__AdditionExpression__RhsOperandAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__AdditionExpression__RhsOperandAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAdditionExpressionAccess().getRhsOperandAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group_1__2__Impl"


    // $ANTLR start "rule__MultiplicationExpression__Group__0"
    // InternalQL.g:2780:1: rule__MultiplicationExpression__Group__0 : rule__MultiplicationExpression__Group__0__Impl rule__MultiplicationExpression__Group__1 ;
    public final void rule__MultiplicationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2784:1: ( rule__MultiplicationExpression__Group__0__Impl rule__MultiplicationExpression__Group__1 )
            // InternalQL.g:2785:2: rule__MultiplicationExpression__Group__0__Impl rule__MultiplicationExpression__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__MultiplicationExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicationExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group__0"


    // $ANTLR start "rule__MultiplicationExpression__Group__0__Impl"
    // InternalQL.g:2792:1: rule__MultiplicationExpression__Group__0__Impl : ( rulePrimaryExpression ) ;
    public final void rule__MultiplicationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2796:1: ( ( rulePrimaryExpression ) )
            // InternalQL.g:2797:1: ( rulePrimaryExpression )
            {
            // InternalQL.g:2797:1: ( rulePrimaryExpression )
            // InternalQL.g:2798:2: rulePrimaryExpression
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicationExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group__0__Impl"


    // $ANTLR start "rule__MultiplicationExpression__Group__1"
    // InternalQL.g:2807:1: rule__MultiplicationExpression__Group__1 : rule__MultiplicationExpression__Group__1__Impl ;
    public final void rule__MultiplicationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2811:1: ( rule__MultiplicationExpression__Group__1__Impl )
            // InternalQL.g:2812:2: rule__MultiplicationExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicationExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group__1"


    // $ANTLR start "rule__MultiplicationExpression__Group__1__Impl"
    // InternalQL.g:2818:1: rule__MultiplicationExpression__Group__1__Impl : ( ( rule__MultiplicationExpression__Group_1__0 )* ) ;
    public final void rule__MultiplicationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2822:1: ( ( ( rule__MultiplicationExpression__Group_1__0 )* ) )
            // InternalQL.g:2823:1: ( ( rule__MultiplicationExpression__Group_1__0 )* )
            {
            // InternalQL.g:2823:1: ( ( rule__MultiplicationExpression__Group_1__0 )* )
            // InternalQL.g:2824:2: ( rule__MultiplicationExpression__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getGroup_1()); 
            // InternalQL.g:2825:2: ( rule__MultiplicationExpression__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=32 && LA27_0<=33)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalQL.g:2825:3: rule__MultiplicationExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__MultiplicationExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getMultiplicationExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group__1__Impl"


    // $ANTLR start "rule__MultiplicationExpression__Group_1__0"
    // InternalQL.g:2834:1: rule__MultiplicationExpression__Group_1__0 : rule__MultiplicationExpression__Group_1__0__Impl rule__MultiplicationExpression__Group_1__1 ;
    public final void rule__MultiplicationExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2838:1: ( rule__MultiplicationExpression__Group_1__0__Impl rule__MultiplicationExpression__Group_1__1 )
            // InternalQL.g:2839:2: rule__MultiplicationExpression__Group_1__0__Impl rule__MultiplicationExpression__Group_1__1
            {
            pushFollow(FOLLOW_23);
            rule__MultiplicationExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicationExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group_1__0"


    // $ANTLR start "rule__MultiplicationExpression__Group_1__0__Impl"
    // InternalQL.g:2846:1: rule__MultiplicationExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__MultiplicationExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2850:1: ( ( () ) )
            // InternalQL.g:2851:1: ( () )
            {
            // InternalQL.g:2851:1: ( () )
            // InternalQL.g:2852:2: ()
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0()); 
            // InternalQL.g:2853:2: ()
            // InternalQL.g:2853:3: 
            {
            }

             after(grammarAccess.getMultiplicationExpressionAccess().getBasicBinaryExpressionLhsOperandAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group_1__0__Impl"


    // $ANTLR start "rule__MultiplicationExpression__Group_1__1"
    // InternalQL.g:2861:1: rule__MultiplicationExpression__Group_1__1 : rule__MultiplicationExpression__Group_1__1__Impl rule__MultiplicationExpression__Group_1__2 ;
    public final void rule__MultiplicationExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2865:1: ( rule__MultiplicationExpression__Group_1__1__Impl rule__MultiplicationExpression__Group_1__2 )
            // InternalQL.g:2866:2: rule__MultiplicationExpression__Group_1__1__Impl rule__MultiplicationExpression__Group_1__2
            {
            pushFollow(FOLLOW_10);
            rule__MultiplicationExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicationExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group_1__1"


    // $ANTLR start "rule__MultiplicationExpression__Group_1__1__Impl"
    // InternalQL.g:2873:1: rule__MultiplicationExpression__Group_1__1__Impl : ( ( rule__MultiplicationExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__MultiplicationExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2877:1: ( ( ( rule__MultiplicationExpression__OperatorAssignment_1_1 ) ) )
            // InternalQL.g:2878:1: ( ( rule__MultiplicationExpression__OperatorAssignment_1_1 ) )
            {
            // InternalQL.g:2878:1: ( ( rule__MultiplicationExpression__OperatorAssignment_1_1 ) )
            // InternalQL.g:2879:2: ( rule__MultiplicationExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalQL.g:2880:2: ( rule__MultiplicationExpression__OperatorAssignment_1_1 )
            // InternalQL.g:2880:3: rule__MultiplicationExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicationExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group_1__1__Impl"


    // $ANTLR start "rule__MultiplicationExpression__Group_1__2"
    // InternalQL.g:2888:1: rule__MultiplicationExpression__Group_1__2 : rule__MultiplicationExpression__Group_1__2__Impl ;
    public final void rule__MultiplicationExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2892:1: ( rule__MultiplicationExpression__Group_1__2__Impl )
            // InternalQL.g:2893:2: rule__MultiplicationExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicationExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group_1__2"


    // $ANTLR start "rule__MultiplicationExpression__Group_1__2__Impl"
    // InternalQL.g:2899:1: rule__MultiplicationExpression__Group_1__2__Impl : ( ( rule__MultiplicationExpression__RhsOperandAssignment_1_2 ) ) ;
    public final void rule__MultiplicationExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2903:1: ( ( ( rule__MultiplicationExpression__RhsOperandAssignment_1_2 ) ) )
            // InternalQL.g:2904:1: ( ( rule__MultiplicationExpression__RhsOperandAssignment_1_2 ) )
            {
            // InternalQL.g:2904:1: ( ( rule__MultiplicationExpression__RhsOperandAssignment_1_2 ) )
            // InternalQL.g:2905:2: ( rule__MultiplicationExpression__RhsOperandAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getRhsOperandAssignment_1_2()); 
            // InternalQL.g:2906:2: ( rule__MultiplicationExpression__RhsOperandAssignment_1_2 )
            // InternalQL.g:2906:3: rule__MultiplicationExpression__RhsOperandAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicationExpression__RhsOperandAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationExpressionAccess().getRhsOperandAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group_1__2__Impl"


    // $ANTLR start "rule__Form__Group__0"
    // InternalQL.g:2915:1: rule__Form__Group__0 : rule__Form__Group__0__Impl rule__Form__Group__1 ;
    public final void rule__Form__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2919:1: ( rule__Form__Group__0__Impl rule__Form__Group__1 )
            // InternalQL.g:2920:2: rule__Form__Group__0__Impl rule__Form__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Form__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Form__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__0"


    // $ANTLR start "rule__Form__Group__0__Impl"
    // InternalQL.g:2927:1: rule__Form__Group__0__Impl : ( 'Form' ) ;
    public final void rule__Form__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2931:1: ( ( 'Form' ) )
            // InternalQL.g:2932:1: ( 'Form' )
            {
            // InternalQL.g:2932:1: ( 'Form' )
            // InternalQL.g:2933:2: 'Form'
            {
             before(grammarAccess.getFormAccess().getFormKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getFormAccess().getFormKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__0__Impl"


    // $ANTLR start "rule__Form__Group__1"
    // InternalQL.g:2942:1: rule__Form__Group__1 : rule__Form__Group__1__Impl rule__Form__Group__2 ;
    public final void rule__Form__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2946:1: ( rule__Form__Group__1__Impl rule__Form__Group__2 )
            // InternalQL.g:2947:2: rule__Form__Group__1__Impl rule__Form__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__Form__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Form__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__1"


    // $ANTLR start "rule__Form__Group__1__Impl"
    // InternalQL.g:2954:1: rule__Form__Group__1__Impl : ( ( rule__Form__NameAssignment_1 ) ) ;
    public final void rule__Form__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2958:1: ( ( ( rule__Form__NameAssignment_1 ) ) )
            // InternalQL.g:2959:1: ( ( rule__Form__NameAssignment_1 ) )
            {
            // InternalQL.g:2959:1: ( ( rule__Form__NameAssignment_1 ) )
            // InternalQL.g:2960:2: ( rule__Form__NameAssignment_1 )
            {
             before(grammarAccess.getFormAccess().getNameAssignment_1()); 
            // InternalQL.g:2961:2: ( rule__Form__NameAssignment_1 )
            // InternalQL.g:2961:3: rule__Form__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Form__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFormAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__1__Impl"


    // $ANTLR start "rule__Form__Group__2"
    // InternalQL.g:2969:1: rule__Form__Group__2 : rule__Form__Group__2__Impl ;
    public final void rule__Form__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2973:1: ( rule__Form__Group__2__Impl )
            // InternalQL.g:2974:2: rule__Form__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Form__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__2"


    // $ANTLR start "rule__Form__Group__2__Impl"
    // InternalQL.g:2980:1: rule__Form__Group__2__Impl : ( ( rule__Form__QuestionGroupAssignment_2 ) ) ;
    public final void rule__Form__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2984:1: ( ( ( rule__Form__QuestionGroupAssignment_2 ) ) )
            // InternalQL.g:2985:1: ( ( rule__Form__QuestionGroupAssignment_2 ) )
            {
            // InternalQL.g:2985:1: ( ( rule__Form__QuestionGroupAssignment_2 ) )
            // InternalQL.g:2986:2: ( rule__Form__QuestionGroupAssignment_2 )
            {
             before(grammarAccess.getFormAccess().getQuestionGroupAssignment_2()); 
            // InternalQL.g:2987:2: ( rule__Form__QuestionGroupAssignment_2 )
            // InternalQL.g:2987:3: rule__Form__QuestionGroupAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Form__QuestionGroupAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFormAccess().getQuestionGroupAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__2__Impl"


    // $ANTLR start "rule__DefinitionGroup__Group__0"
    // InternalQL.g:2996:1: rule__DefinitionGroup__Group__0 : rule__DefinitionGroup__Group__0__Impl rule__DefinitionGroup__Group__1 ;
    public final void rule__DefinitionGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3000:1: ( rule__DefinitionGroup__Group__0__Impl rule__DefinitionGroup__Group__1 )
            // InternalQL.g:3001:2: rule__DefinitionGroup__Group__0__Impl rule__DefinitionGroup__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__DefinitionGroup__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefinitionGroup__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionGroup__Group__0"


    // $ANTLR start "rule__DefinitionGroup__Group__0__Impl"
    // InternalQL.g:3008:1: rule__DefinitionGroup__Group__0__Impl : ( () ) ;
    public final void rule__DefinitionGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3012:1: ( ( () ) )
            // InternalQL.g:3013:1: ( () )
            {
            // InternalQL.g:3013:1: ( () )
            // InternalQL.g:3014:2: ()
            {
             before(grammarAccess.getDefinitionGroupAccess().getDefinitionGroupAction_0()); 
            // InternalQL.g:3015:2: ()
            // InternalQL.g:3015:3: 
            {
            }

             after(grammarAccess.getDefinitionGroupAccess().getDefinitionGroupAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionGroup__Group__0__Impl"


    // $ANTLR start "rule__DefinitionGroup__Group__1"
    // InternalQL.g:3023:1: rule__DefinitionGroup__Group__1 : rule__DefinitionGroup__Group__1__Impl rule__DefinitionGroup__Group__2 ;
    public final void rule__DefinitionGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3027:1: ( rule__DefinitionGroup__Group__1__Impl rule__DefinitionGroup__Group__2 )
            // InternalQL.g:3028:2: rule__DefinitionGroup__Group__1__Impl rule__DefinitionGroup__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__DefinitionGroup__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefinitionGroup__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionGroup__Group__1"


    // $ANTLR start "rule__DefinitionGroup__Group__1__Impl"
    // InternalQL.g:3035:1: rule__DefinitionGroup__Group__1__Impl : ( 'definitions' ) ;
    public final void rule__DefinitionGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3039:1: ( ( 'definitions' ) )
            // InternalQL.g:3040:1: ( 'definitions' )
            {
            // InternalQL.g:3040:1: ( 'definitions' )
            // InternalQL.g:3041:2: 'definitions'
            {
             before(grammarAccess.getDefinitionGroupAccess().getDefinitionsKeyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getDefinitionGroupAccess().getDefinitionsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionGroup__Group__1__Impl"


    // $ANTLR start "rule__DefinitionGroup__Group__2"
    // InternalQL.g:3050:1: rule__DefinitionGroup__Group__2 : rule__DefinitionGroup__Group__2__Impl rule__DefinitionGroup__Group__3 ;
    public final void rule__DefinitionGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3054:1: ( rule__DefinitionGroup__Group__2__Impl rule__DefinitionGroup__Group__3 )
            // InternalQL.g:3055:2: rule__DefinitionGroup__Group__2__Impl rule__DefinitionGroup__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__DefinitionGroup__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefinitionGroup__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionGroup__Group__2"


    // $ANTLR start "rule__DefinitionGroup__Group__2__Impl"
    // InternalQL.g:3062:1: rule__DefinitionGroup__Group__2__Impl : ( '{' ) ;
    public final void rule__DefinitionGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3066:1: ( ( '{' ) )
            // InternalQL.g:3067:1: ( '{' )
            {
            // InternalQL.g:3067:1: ( '{' )
            // InternalQL.g:3068:2: '{'
            {
             before(grammarAccess.getDefinitionGroupAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getDefinitionGroupAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionGroup__Group__2__Impl"


    // $ANTLR start "rule__DefinitionGroup__Group__3"
    // InternalQL.g:3077:1: rule__DefinitionGroup__Group__3 : rule__DefinitionGroup__Group__3__Impl rule__DefinitionGroup__Group__4 ;
    public final void rule__DefinitionGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3081:1: ( rule__DefinitionGroup__Group__3__Impl rule__DefinitionGroup__Group__4 )
            // InternalQL.g:3082:2: rule__DefinitionGroup__Group__3__Impl rule__DefinitionGroup__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__DefinitionGroup__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefinitionGroup__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionGroup__Group__3"


    // $ANTLR start "rule__DefinitionGroup__Group__3__Impl"
    // InternalQL.g:3089:1: rule__DefinitionGroup__Group__3__Impl : ( ( rule__DefinitionGroup__Alternatives_3 )* ) ;
    public final void rule__DefinitionGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3093:1: ( ( ( rule__DefinitionGroup__Alternatives_3 )* ) )
            // InternalQL.g:3094:1: ( ( rule__DefinitionGroup__Alternatives_3 )* )
            {
            // InternalQL.g:3094:1: ( ( rule__DefinitionGroup__Alternatives_3 )* )
            // InternalQL.g:3095:2: ( rule__DefinitionGroup__Alternatives_3 )*
            {
             before(grammarAccess.getDefinitionGroupAccess().getAlternatives_3()); 
            // InternalQL.g:3096:2: ( rule__DefinitionGroup__Alternatives_3 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==47||(LA28_0>=49 && LA28_0<=50)||(LA28_0>=53 && LA28_0<=55)||LA28_0==58||LA28_0==69||LA28_0==75) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalQL.g:3096:3: rule__DefinitionGroup__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__DefinitionGroup__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getDefinitionGroupAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionGroup__Group__3__Impl"


    // $ANTLR start "rule__DefinitionGroup__Group__4"
    // InternalQL.g:3104:1: rule__DefinitionGroup__Group__4 : rule__DefinitionGroup__Group__4__Impl ;
    public final void rule__DefinitionGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3108:1: ( rule__DefinitionGroup__Group__4__Impl )
            // InternalQL.g:3109:2: rule__DefinitionGroup__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefinitionGroup__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionGroup__Group__4"


    // $ANTLR start "rule__DefinitionGroup__Group__4__Impl"
    // InternalQL.g:3115:1: rule__DefinitionGroup__Group__4__Impl : ( '}' ) ;
    public final void rule__DefinitionGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3119:1: ( ( '}' ) )
            // InternalQL.g:3120:1: ( '}' )
            {
            // InternalQL.g:3120:1: ( '}' )
            // InternalQL.g:3121:2: '}'
            {
             before(grammarAccess.getDefinitionGroupAccess().getRightCurlyBracketKeyword_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getDefinitionGroupAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionGroup__Group__4__Impl"


    // $ANTLR start "rule__QuestionGroup__Group__0"
    // InternalQL.g:3131:1: rule__QuestionGroup__Group__0 : rule__QuestionGroup__Group__0__Impl rule__QuestionGroup__Group__1 ;
    public final void rule__QuestionGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3135:1: ( rule__QuestionGroup__Group__0__Impl rule__QuestionGroup__Group__1 )
            // InternalQL.g:3136:2: rule__QuestionGroup__Group__0__Impl rule__QuestionGroup__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__QuestionGroup__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionGroup__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group__0"


    // $ANTLR start "rule__QuestionGroup__Group__0__Impl"
    // InternalQL.g:3143:1: rule__QuestionGroup__Group__0__Impl : ( () ) ;
    public final void rule__QuestionGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3147:1: ( ( () ) )
            // InternalQL.g:3148:1: ( () )
            {
            // InternalQL.g:3148:1: ( () )
            // InternalQL.g:3149:2: ()
            {
             before(grammarAccess.getQuestionGroupAccess().getQuestionGroupAction_0()); 
            // InternalQL.g:3150:2: ()
            // InternalQL.g:3150:3: 
            {
            }

             after(grammarAccess.getQuestionGroupAccess().getQuestionGroupAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group__0__Impl"


    // $ANTLR start "rule__QuestionGroup__Group__1"
    // InternalQL.g:3158:1: rule__QuestionGroup__Group__1 : rule__QuestionGroup__Group__1__Impl rule__QuestionGroup__Group__2 ;
    public final void rule__QuestionGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3162:1: ( rule__QuestionGroup__Group__1__Impl rule__QuestionGroup__Group__2 )
            // InternalQL.g:3163:2: rule__QuestionGroup__Group__1__Impl rule__QuestionGroup__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__QuestionGroup__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionGroup__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group__1"


    // $ANTLR start "rule__QuestionGroup__Group__1__Impl"
    // InternalQL.g:3170:1: rule__QuestionGroup__Group__1__Impl : ( ( rule__QuestionGroup__Group_1__0 )? ) ;
    public final void rule__QuestionGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3174:1: ( ( ( rule__QuestionGroup__Group_1__0 )? ) )
            // InternalQL.g:3175:1: ( ( rule__QuestionGroup__Group_1__0 )? )
            {
            // InternalQL.g:3175:1: ( ( rule__QuestionGroup__Group_1__0 )? )
            // InternalQL.g:3176:2: ( rule__QuestionGroup__Group_1__0 )?
            {
             before(grammarAccess.getQuestionGroupAccess().getGroup_1()); 
            // InternalQL.g:3177:2: ( rule__QuestionGroup__Group_1__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==46) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalQL.g:3177:3: rule__QuestionGroup__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QuestionGroup__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionGroupAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group__1__Impl"


    // $ANTLR start "rule__QuestionGroup__Group__2"
    // InternalQL.g:3185:1: rule__QuestionGroup__Group__2 : rule__QuestionGroup__Group__2__Impl rule__QuestionGroup__Group__3 ;
    public final void rule__QuestionGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3189:1: ( rule__QuestionGroup__Group__2__Impl rule__QuestionGroup__Group__3 )
            // InternalQL.g:3190:2: rule__QuestionGroup__Group__2__Impl rule__QuestionGroup__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__QuestionGroup__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionGroup__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group__2"


    // $ANTLR start "rule__QuestionGroup__Group__2__Impl"
    // InternalQL.g:3197:1: rule__QuestionGroup__Group__2__Impl : ( '{' ) ;
    public final void rule__QuestionGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3201:1: ( ( '{' ) )
            // InternalQL.g:3202:1: ( '{' )
            {
            // InternalQL.g:3202:1: ( '{' )
            // InternalQL.g:3203:2: '{'
            {
             before(grammarAccess.getQuestionGroupAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getQuestionGroupAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group__2__Impl"


    // $ANTLR start "rule__QuestionGroup__Group__3"
    // InternalQL.g:3212:1: rule__QuestionGroup__Group__3 : rule__QuestionGroup__Group__3__Impl rule__QuestionGroup__Group__4 ;
    public final void rule__QuestionGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3216:1: ( rule__QuestionGroup__Group__3__Impl rule__QuestionGroup__Group__4 )
            // InternalQL.g:3217:2: rule__QuestionGroup__Group__3__Impl rule__QuestionGroup__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__QuestionGroup__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionGroup__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group__3"


    // $ANTLR start "rule__QuestionGroup__Group__3__Impl"
    // InternalQL.g:3224:1: rule__QuestionGroup__Group__3__Impl : ( ( rule__QuestionGroup__Alternatives_3 )* ) ;
    public final void rule__QuestionGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3228:1: ( ( ( rule__QuestionGroup__Alternatives_3 )* ) )
            // InternalQL.g:3229:1: ( ( rule__QuestionGroup__Alternatives_3 )* )
            {
            // InternalQL.g:3229:1: ( ( rule__QuestionGroup__Alternatives_3 )* )
            // InternalQL.g:3230:2: ( rule__QuestionGroup__Alternatives_3 )*
            {
             before(grammarAccess.getQuestionGroupAccess().getAlternatives_3()); 
            // InternalQL.g:3231:2: ( rule__QuestionGroup__Alternatives_3 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=RULE_STRING && LA30_0<=RULE_ID)||LA30_0==39||LA30_0==46) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalQL.g:3231:3: rule__QuestionGroup__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__QuestionGroup__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getQuestionGroupAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group__3__Impl"


    // $ANTLR start "rule__QuestionGroup__Group__4"
    // InternalQL.g:3239:1: rule__QuestionGroup__Group__4 : rule__QuestionGroup__Group__4__Impl ;
    public final void rule__QuestionGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3243:1: ( rule__QuestionGroup__Group__4__Impl )
            // InternalQL.g:3244:2: rule__QuestionGroup__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuestionGroup__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group__4"


    // $ANTLR start "rule__QuestionGroup__Group__4__Impl"
    // InternalQL.g:3250:1: rule__QuestionGroup__Group__4__Impl : ( '}' ) ;
    public final void rule__QuestionGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3254:1: ( ( '}' ) )
            // InternalQL.g:3255:1: ( '}' )
            {
            // InternalQL.g:3255:1: ( '}' )
            // InternalQL.g:3256:2: '}'
            {
             before(grammarAccess.getQuestionGroupAccess().getRightCurlyBracketKeyword_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getQuestionGroupAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group__4__Impl"


    // $ANTLR start "rule__QuestionGroup__Group_1__0"
    // InternalQL.g:3266:1: rule__QuestionGroup__Group_1__0 : rule__QuestionGroup__Group_1__0__Impl rule__QuestionGroup__Group_1__1 ;
    public final void rule__QuestionGroup__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3270:1: ( rule__QuestionGroup__Group_1__0__Impl rule__QuestionGroup__Group_1__1 )
            // InternalQL.g:3271:2: rule__QuestionGroup__Group_1__0__Impl rule__QuestionGroup__Group_1__1
            {
            pushFollow(FOLLOW_33);
            rule__QuestionGroup__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionGroup__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_1__0"


    // $ANTLR start "rule__QuestionGroup__Group_1__0__Impl"
    // InternalQL.g:3278:1: rule__QuestionGroup__Group_1__0__Impl : ( 'if' ) ;
    public final void rule__QuestionGroup__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3282:1: ( ( 'if' ) )
            // InternalQL.g:3283:1: ( 'if' )
            {
            // InternalQL.g:3283:1: ( 'if' )
            // InternalQL.g:3284:2: 'if'
            {
             before(grammarAccess.getQuestionGroupAccess().getIfKeyword_1_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getQuestionGroupAccess().getIfKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_1__0__Impl"


    // $ANTLR start "rule__QuestionGroup__Group_1__1"
    // InternalQL.g:3293:1: rule__QuestionGroup__Group_1__1 : rule__QuestionGroup__Group_1__1__Impl rule__QuestionGroup__Group_1__2 ;
    public final void rule__QuestionGroup__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3297:1: ( rule__QuestionGroup__Group_1__1__Impl rule__QuestionGroup__Group_1__2 )
            // InternalQL.g:3298:2: rule__QuestionGroup__Group_1__1__Impl rule__QuestionGroup__Group_1__2
            {
            pushFollow(FOLLOW_10);
            rule__QuestionGroup__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionGroup__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_1__1"


    // $ANTLR start "rule__QuestionGroup__Group_1__1__Impl"
    // InternalQL.g:3305:1: rule__QuestionGroup__Group_1__1__Impl : ( '(' ) ;
    public final void rule__QuestionGroup__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3309:1: ( ( '(' ) )
            // InternalQL.g:3310:1: ( '(' )
            {
            // InternalQL.g:3310:1: ( '(' )
            // InternalQL.g:3311:2: '('
            {
             before(grammarAccess.getQuestionGroupAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getQuestionGroupAccess().getLeftParenthesisKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_1__1__Impl"


    // $ANTLR start "rule__QuestionGroup__Group_1__2"
    // InternalQL.g:3320:1: rule__QuestionGroup__Group_1__2 : rule__QuestionGroup__Group_1__2__Impl rule__QuestionGroup__Group_1__3 ;
    public final void rule__QuestionGroup__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3324:1: ( rule__QuestionGroup__Group_1__2__Impl rule__QuestionGroup__Group_1__3 )
            // InternalQL.g:3325:2: rule__QuestionGroup__Group_1__2__Impl rule__QuestionGroup__Group_1__3
            {
            pushFollow(FOLLOW_11);
            rule__QuestionGroup__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionGroup__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_1__2"


    // $ANTLR start "rule__QuestionGroup__Group_1__2__Impl"
    // InternalQL.g:3332:1: rule__QuestionGroup__Group_1__2__Impl : ( ( rule__QuestionGroup__GuardAssignment_1_2 ) ) ;
    public final void rule__QuestionGroup__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3336:1: ( ( ( rule__QuestionGroup__GuardAssignment_1_2 ) ) )
            // InternalQL.g:3337:1: ( ( rule__QuestionGroup__GuardAssignment_1_2 ) )
            {
            // InternalQL.g:3337:1: ( ( rule__QuestionGroup__GuardAssignment_1_2 ) )
            // InternalQL.g:3338:2: ( rule__QuestionGroup__GuardAssignment_1_2 )
            {
             before(grammarAccess.getQuestionGroupAccess().getGuardAssignment_1_2()); 
            // InternalQL.g:3339:2: ( rule__QuestionGroup__GuardAssignment_1_2 )
            // InternalQL.g:3339:3: rule__QuestionGroup__GuardAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__QuestionGroup__GuardAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getQuestionGroupAccess().getGuardAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_1__2__Impl"


    // $ANTLR start "rule__QuestionGroup__Group_1__3"
    // InternalQL.g:3347:1: rule__QuestionGroup__Group_1__3 : rule__QuestionGroup__Group_1__3__Impl ;
    public final void rule__QuestionGroup__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3351:1: ( rule__QuestionGroup__Group_1__3__Impl )
            // InternalQL.g:3352:2: rule__QuestionGroup__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuestionGroup__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_1__3"


    // $ANTLR start "rule__QuestionGroup__Group_1__3__Impl"
    // InternalQL.g:3358:1: rule__QuestionGroup__Group_1__3__Impl : ( ')' ) ;
    public final void rule__QuestionGroup__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3362:1: ( ( ')' ) )
            // InternalQL.g:3363:1: ( ')' )
            {
            // InternalQL.g:3363:1: ( ')' )
            // InternalQL.g:3364:2: ')'
            {
             before(grammarAccess.getQuestionGroupAccess().getRightParenthesisKeyword_1_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getQuestionGroupAccess().getRightParenthesisKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_1__3__Impl"


    // $ANTLR start "rule__ValueType_Impl__Group__0"
    // InternalQL.g:3374:1: rule__ValueType_Impl__Group__0 : rule__ValueType_Impl__Group__0__Impl rule__ValueType_Impl__Group__1 ;
    public final void rule__ValueType_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3378:1: ( rule__ValueType_Impl__Group__0__Impl rule__ValueType_Impl__Group__1 )
            // InternalQL.g:3379:2: rule__ValueType_Impl__Group__0__Impl rule__ValueType_Impl__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__ValueType_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValueType_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueType_Impl__Group__0"


    // $ANTLR start "rule__ValueType_Impl__Group__0__Impl"
    // InternalQL.g:3386:1: rule__ValueType_Impl__Group__0__Impl : ( () ) ;
    public final void rule__ValueType_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3390:1: ( ( () ) )
            // InternalQL.g:3391:1: ( () )
            {
            // InternalQL.g:3391:1: ( () )
            // InternalQL.g:3392:2: ()
            {
             before(grammarAccess.getValueType_ImplAccess().getValueTypeAction_0()); 
            // InternalQL.g:3393:2: ()
            // InternalQL.g:3393:3: 
            {
            }

             after(grammarAccess.getValueType_ImplAccess().getValueTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueType_Impl__Group__0__Impl"


    // $ANTLR start "rule__ValueType_Impl__Group__1"
    // InternalQL.g:3401:1: rule__ValueType_Impl__Group__1 : rule__ValueType_Impl__Group__1__Impl rule__ValueType_Impl__Group__2 ;
    public final void rule__ValueType_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3405:1: ( rule__ValueType_Impl__Group__1__Impl rule__ValueType_Impl__Group__2 )
            // InternalQL.g:3406:2: rule__ValueType_Impl__Group__1__Impl rule__ValueType_Impl__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__ValueType_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValueType_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueType_Impl__Group__1"


    // $ANTLR start "rule__ValueType_Impl__Group__1__Impl"
    // InternalQL.g:3413:1: rule__ValueType_Impl__Group__1__Impl : ( 'ValueType' ) ;
    public final void rule__ValueType_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3417:1: ( ( 'ValueType' ) )
            // InternalQL.g:3418:1: ( 'ValueType' )
            {
            // InternalQL.g:3418:1: ( 'ValueType' )
            // InternalQL.g:3419:2: 'ValueType'
            {
             before(grammarAccess.getValueType_ImplAccess().getValueTypeKeyword_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getValueType_ImplAccess().getValueTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueType_Impl__Group__1__Impl"


    // $ANTLR start "rule__ValueType_Impl__Group__2"
    // InternalQL.g:3428:1: rule__ValueType_Impl__Group__2 : rule__ValueType_Impl__Group__2__Impl rule__ValueType_Impl__Group__3 ;
    public final void rule__ValueType_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3432:1: ( rule__ValueType_Impl__Group__2__Impl rule__ValueType_Impl__Group__3 )
            // InternalQL.g:3433:2: rule__ValueType_Impl__Group__2__Impl rule__ValueType_Impl__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__ValueType_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValueType_Impl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueType_Impl__Group__2"


    // $ANTLR start "rule__ValueType_Impl__Group__2__Impl"
    // InternalQL.g:3440:1: rule__ValueType_Impl__Group__2__Impl : ( ( rule__ValueType_Impl__NameAssignment_2 ) ) ;
    public final void rule__ValueType_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3444:1: ( ( ( rule__ValueType_Impl__NameAssignment_2 ) ) )
            // InternalQL.g:3445:1: ( ( rule__ValueType_Impl__NameAssignment_2 ) )
            {
            // InternalQL.g:3445:1: ( ( rule__ValueType_Impl__NameAssignment_2 ) )
            // InternalQL.g:3446:2: ( rule__ValueType_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getValueType_ImplAccess().getNameAssignment_2()); 
            // InternalQL.g:3447:2: ( rule__ValueType_Impl__NameAssignment_2 )
            // InternalQL.g:3447:3: rule__ValueType_Impl__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ValueType_Impl__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getValueType_ImplAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueType_Impl__Group__2__Impl"


    // $ANTLR start "rule__ValueType_Impl__Group__3"
    // InternalQL.g:3455:1: rule__ValueType_Impl__Group__3 : rule__ValueType_Impl__Group__3__Impl rule__ValueType_Impl__Group__4 ;
    public final void rule__ValueType_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3459:1: ( rule__ValueType_Impl__Group__3__Impl rule__ValueType_Impl__Group__4 )
            // InternalQL.g:3460:2: rule__ValueType_Impl__Group__3__Impl rule__ValueType_Impl__Group__4
            {
            pushFollow(FOLLOW_35);
            rule__ValueType_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValueType_Impl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueType_Impl__Group__3"


    // $ANTLR start "rule__ValueType_Impl__Group__3__Impl"
    // InternalQL.g:3467:1: rule__ValueType_Impl__Group__3__Impl : ( '{' ) ;
    public final void rule__ValueType_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3471:1: ( ( '{' ) )
            // InternalQL.g:3472:1: ( '{' )
            {
            // InternalQL.g:3472:1: ( '{' )
            // InternalQL.g:3473:2: '{'
            {
             before(grammarAccess.getValueType_ImplAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getValueType_ImplAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueType_Impl__Group__3__Impl"


    // $ANTLR start "rule__ValueType_Impl__Group__4"
    // InternalQL.g:3482:1: rule__ValueType_Impl__Group__4 : rule__ValueType_Impl__Group__4__Impl rule__ValueType_Impl__Group__5 ;
    public final void rule__ValueType_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3486:1: ( rule__ValueType_Impl__Group__4__Impl rule__ValueType_Impl__Group__5 )
            // InternalQL.g:3487:2: rule__ValueType_Impl__Group__4__Impl rule__ValueType_Impl__Group__5
            {
            pushFollow(FOLLOW_35);
            rule__ValueType_Impl__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValueType_Impl__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueType_Impl__Group__4"


    // $ANTLR start "rule__ValueType_Impl__Group__4__Impl"
    // InternalQL.g:3494:1: rule__ValueType_Impl__Group__4__Impl : ( ( rule__ValueType_Impl__Group_4__0 )? ) ;
    public final void rule__ValueType_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3498:1: ( ( ( rule__ValueType_Impl__Group_4__0 )? ) )
            // InternalQL.g:3499:1: ( ( rule__ValueType_Impl__Group_4__0 )? )
            {
            // InternalQL.g:3499:1: ( ( rule__ValueType_Impl__Group_4__0 )? )
            // InternalQL.g:3500:2: ( rule__ValueType_Impl__Group_4__0 )?
            {
             before(grammarAccess.getValueType_ImplAccess().getGroup_4()); 
            // InternalQL.g:3501:2: ( rule__ValueType_Impl__Group_4__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==48) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalQL.g:3501:3: rule__ValueType_Impl__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ValueType_Impl__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getValueType_ImplAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueType_Impl__Group__4__Impl"


    // $ANTLR start "rule__ValueType_Impl__Group__5"
    // InternalQL.g:3509:1: rule__ValueType_Impl__Group__5 : rule__ValueType_Impl__Group__5__Impl ;
    public final void rule__ValueType_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3513:1: ( rule__ValueType_Impl__Group__5__Impl )
            // InternalQL.g:3514:2: rule__ValueType_Impl__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ValueType_Impl__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueType_Impl__Group__5"


    // $ANTLR start "rule__ValueType_Impl__Group__5__Impl"
    // InternalQL.g:3520:1: rule__ValueType_Impl__Group__5__Impl : ( '}' ) ;
    public final void rule__ValueType_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3524:1: ( ( '}' ) )
            // InternalQL.g:3525:1: ( '}' )
            {
            // InternalQL.g:3525:1: ( '}' )
            // InternalQL.g:3526:2: '}'
            {
             before(grammarAccess.getValueType_ImplAccess().getRightCurlyBracketKeyword_5()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getValueType_ImplAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueType_Impl__Group__5__Impl"


    // $ANTLR start "rule__ValueType_Impl__Group_4__0"
    // InternalQL.g:3536:1: rule__ValueType_Impl__Group_4__0 : rule__ValueType_Impl__Group_4__0__Impl rule__ValueType_Impl__Group_4__1 ;
    public final void rule__ValueType_Impl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3540:1: ( rule__ValueType_Impl__Group_4__0__Impl rule__ValueType_Impl__Group_4__1 )
            // InternalQL.g:3541:2: rule__ValueType_Impl__Group_4__0__Impl rule__ValueType_Impl__Group_4__1
            {
            pushFollow(FOLLOW_25);
            rule__ValueType_Impl__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValueType_Impl__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueType_Impl__Group_4__0"


    // $ANTLR start "rule__ValueType_Impl__Group_4__0__Impl"
    // InternalQL.g:3548:1: rule__ValueType_Impl__Group_4__0__Impl : ( 'unit' ) ;
    public final void rule__ValueType_Impl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3552:1: ( ( 'unit' ) )
            // InternalQL.g:3553:1: ( 'unit' )
            {
            // InternalQL.g:3553:1: ( 'unit' )
            // InternalQL.g:3554:2: 'unit'
            {
             before(grammarAccess.getValueType_ImplAccess().getUnitKeyword_4_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getValueType_ImplAccess().getUnitKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueType_Impl__Group_4__0__Impl"


    // $ANTLR start "rule__ValueType_Impl__Group_4__1"
    // InternalQL.g:3563:1: rule__ValueType_Impl__Group_4__1 : rule__ValueType_Impl__Group_4__1__Impl ;
    public final void rule__ValueType_Impl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3567:1: ( rule__ValueType_Impl__Group_4__1__Impl )
            // InternalQL.g:3568:2: rule__ValueType_Impl__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ValueType_Impl__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueType_Impl__Group_4__1"


    // $ANTLR start "rule__ValueType_Impl__Group_4__1__Impl"
    // InternalQL.g:3574:1: rule__ValueType_Impl__Group_4__1__Impl : ( ( rule__ValueType_Impl__UnitAssignment_4_1 ) ) ;
    public final void rule__ValueType_Impl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3578:1: ( ( ( rule__ValueType_Impl__UnitAssignment_4_1 ) ) )
            // InternalQL.g:3579:1: ( ( rule__ValueType_Impl__UnitAssignment_4_1 ) )
            {
            // InternalQL.g:3579:1: ( ( rule__ValueType_Impl__UnitAssignment_4_1 ) )
            // InternalQL.g:3580:2: ( rule__ValueType_Impl__UnitAssignment_4_1 )
            {
             before(grammarAccess.getValueType_ImplAccess().getUnitAssignment_4_1()); 
            // InternalQL.g:3581:2: ( rule__ValueType_Impl__UnitAssignment_4_1 )
            // InternalQL.g:3581:3: rule__ValueType_Impl__UnitAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ValueType_Impl__UnitAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getValueType_ImplAccess().getUnitAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueType_Impl__Group_4__1__Impl"


    // $ANTLR start "rule__ConstantCall__Group__0"
    // InternalQL.g:3590:1: rule__ConstantCall__Group__0 : rule__ConstantCall__Group__0__Impl rule__ConstantCall__Group__1 ;
    public final void rule__ConstantCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3594:1: ( rule__ConstantCall__Group__0__Impl rule__ConstantCall__Group__1 )
            // InternalQL.g:3595:2: rule__ConstantCall__Group__0__Impl rule__ConstantCall__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__ConstantCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstantCall__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantCall__Group__0"


    // $ANTLR start "rule__ConstantCall__Group__0__Impl"
    // InternalQL.g:3602:1: rule__ConstantCall__Group__0__Impl : ( () ) ;
    public final void rule__ConstantCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3606:1: ( ( () ) )
            // InternalQL.g:3607:1: ( () )
            {
            // InternalQL.g:3607:1: ( () )
            // InternalQL.g:3608:2: ()
            {
             before(grammarAccess.getConstantCallAccess().getConstantCallAction_0()); 
            // InternalQL.g:3609:2: ()
            // InternalQL.g:3609:3: 
            {
            }

             after(grammarAccess.getConstantCallAccess().getConstantCallAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantCall__Group__0__Impl"


    // $ANTLR start "rule__ConstantCall__Group__1"
    // InternalQL.g:3617:1: rule__ConstantCall__Group__1 : rule__ConstantCall__Group__1__Impl ;
    public final void rule__ConstantCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3621:1: ( rule__ConstantCall__Group__1__Impl )
            // InternalQL.g:3622:2: rule__ConstantCall__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConstantCall__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantCall__Group__1"


    // $ANTLR start "rule__ConstantCall__Group__1__Impl"
    // InternalQL.g:3628:1: rule__ConstantCall__Group__1__Impl : ( ( rule__ConstantCall__ValueAssignment_1 ) ) ;
    public final void rule__ConstantCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3632:1: ( ( ( rule__ConstantCall__ValueAssignment_1 ) ) )
            // InternalQL.g:3633:1: ( ( rule__ConstantCall__ValueAssignment_1 ) )
            {
            // InternalQL.g:3633:1: ( ( rule__ConstantCall__ValueAssignment_1 ) )
            // InternalQL.g:3634:2: ( rule__ConstantCall__ValueAssignment_1 )
            {
             before(grammarAccess.getConstantCallAccess().getValueAssignment_1()); 
            // InternalQL.g:3635:2: ( rule__ConstantCall__ValueAssignment_1 )
            // InternalQL.g:3635:3: rule__ConstantCall__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ConstantCall__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConstantCallAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantCall__Group__1__Impl"


    // $ANTLR start "rule__QuestionCall__Group__0"
    // InternalQL.g:3644:1: rule__QuestionCall__Group__0 : rule__QuestionCall__Group__0__Impl rule__QuestionCall__Group__1 ;
    public final void rule__QuestionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3648:1: ( rule__QuestionCall__Group__0__Impl rule__QuestionCall__Group__1 )
            // InternalQL.g:3649:2: rule__QuestionCall__Group__0__Impl rule__QuestionCall__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__QuestionCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionCall__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionCall__Group__0"


    // $ANTLR start "rule__QuestionCall__Group__0__Impl"
    // InternalQL.g:3656:1: rule__QuestionCall__Group__0__Impl : ( () ) ;
    public final void rule__QuestionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3660:1: ( ( () ) )
            // InternalQL.g:3661:1: ( () )
            {
            // InternalQL.g:3661:1: ( () )
            // InternalQL.g:3662:2: ()
            {
             before(grammarAccess.getQuestionCallAccess().getQuestionCallAction_0()); 
            // InternalQL.g:3663:2: ()
            // InternalQL.g:3663:3: 
            {
            }

             after(grammarAccess.getQuestionCallAccess().getQuestionCallAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionCall__Group__0__Impl"


    // $ANTLR start "rule__QuestionCall__Group__1"
    // InternalQL.g:3671:1: rule__QuestionCall__Group__1 : rule__QuestionCall__Group__1__Impl ;
    public final void rule__QuestionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3675:1: ( rule__QuestionCall__Group__1__Impl )
            // InternalQL.g:3676:2: rule__QuestionCall__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuestionCall__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionCall__Group__1"


    // $ANTLR start "rule__QuestionCall__Group__1__Impl"
    // InternalQL.g:3682:1: rule__QuestionCall__Group__1__Impl : ( ( rule__QuestionCall__QuestionAssignment_1 ) ) ;
    public final void rule__QuestionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3686:1: ( ( ( rule__QuestionCall__QuestionAssignment_1 ) ) )
            // InternalQL.g:3687:1: ( ( rule__QuestionCall__QuestionAssignment_1 ) )
            {
            // InternalQL.g:3687:1: ( ( rule__QuestionCall__QuestionAssignment_1 ) )
            // InternalQL.g:3688:2: ( rule__QuestionCall__QuestionAssignment_1 )
            {
             before(grammarAccess.getQuestionCallAccess().getQuestionAssignment_1()); 
            // InternalQL.g:3689:2: ( rule__QuestionCall__QuestionAssignment_1 )
            // InternalQL.g:3689:3: rule__QuestionCall__QuestionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__QuestionCall__QuestionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionCallAccess().getQuestionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionCall__Group__1__Impl"


    // $ANTLR start "rule__BooleanValueType__Group__0"
    // InternalQL.g:3698:1: rule__BooleanValueType__Group__0 : rule__BooleanValueType__Group__0__Impl rule__BooleanValueType__Group__1 ;
    public final void rule__BooleanValueType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3702:1: ( rule__BooleanValueType__Group__0__Impl rule__BooleanValueType__Group__1 )
            // InternalQL.g:3703:2: rule__BooleanValueType__Group__0__Impl rule__BooleanValueType__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__BooleanValueType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanValueType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueType__Group__0"


    // $ANTLR start "rule__BooleanValueType__Group__0__Impl"
    // InternalQL.g:3710:1: rule__BooleanValueType__Group__0__Impl : ( () ) ;
    public final void rule__BooleanValueType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3714:1: ( ( () ) )
            // InternalQL.g:3715:1: ( () )
            {
            // InternalQL.g:3715:1: ( () )
            // InternalQL.g:3716:2: ()
            {
             before(grammarAccess.getBooleanValueTypeAccess().getBooleanValueTypeAction_0()); 
            // InternalQL.g:3717:2: ()
            // InternalQL.g:3717:3: 
            {
            }

             after(grammarAccess.getBooleanValueTypeAccess().getBooleanValueTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueType__Group__0__Impl"


    // $ANTLR start "rule__BooleanValueType__Group__1"
    // InternalQL.g:3725:1: rule__BooleanValueType__Group__1 : rule__BooleanValueType__Group__1__Impl rule__BooleanValueType__Group__2 ;
    public final void rule__BooleanValueType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3729:1: ( rule__BooleanValueType__Group__1__Impl rule__BooleanValueType__Group__2 )
            // InternalQL.g:3730:2: rule__BooleanValueType__Group__1__Impl rule__BooleanValueType__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__BooleanValueType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanValueType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueType__Group__1"


    // $ANTLR start "rule__BooleanValueType__Group__1__Impl"
    // InternalQL.g:3737:1: rule__BooleanValueType__Group__1__Impl : ( 'booleanType' ) ;
    public final void rule__BooleanValueType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3741:1: ( ( 'booleanType' ) )
            // InternalQL.g:3742:1: ( 'booleanType' )
            {
            // InternalQL.g:3742:1: ( 'booleanType' )
            // InternalQL.g:3743:2: 'booleanType'
            {
             before(grammarAccess.getBooleanValueTypeAccess().getBooleanTypeKeyword_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getBooleanValueTypeAccess().getBooleanTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueType__Group__1__Impl"


    // $ANTLR start "rule__BooleanValueType__Group__2"
    // InternalQL.g:3752:1: rule__BooleanValueType__Group__2 : rule__BooleanValueType__Group__2__Impl rule__BooleanValueType__Group__3 ;
    public final void rule__BooleanValueType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3756:1: ( rule__BooleanValueType__Group__2__Impl rule__BooleanValueType__Group__3 )
            // InternalQL.g:3757:2: rule__BooleanValueType__Group__2__Impl rule__BooleanValueType__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__BooleanValueType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanValueType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueType__Group__2"


    // $ANTLR start "rule__BooleanValueType__Group__2__Impl"
    // InternalQL.g:3764:1: rule__BooleanValueType__Group__2__Impl : ( ( rule__BooleanValueType__NameAssignment_2 ) ) ;
    public final void rule__BooleanValueType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3768:1: ( ( ( rule__BooleanValueType__NameAssignment_2 ) ) )
            // InternalQL.g:3769:1: ( ( rule__BooleanValueType__NameAssignment_2 ) )
            {
            // InternalQL.g:3769:1: ( ( rule__BooleanValueType__NameAssignment_2 ) )
            // InternalQL.g:3770:2: ( rule__BooleanValueType__NameAssignment_2 )
            {
             before(grammarAccess.getBooleanValueTypeAccess().getNameAssignment_2()); 
            // InternalQL.g:3771:2: ( rule__BooleanValueType__NameAssignment_2 )
            // InternalQL.g:3771:3: rule__BooleanValueType__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BooleanValueType__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBooleanValueTypeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueType__Group__2__Impl"


    // $ANTLR start "rule__BooleanValueType__Group__3"
    // InternalQL.g:3779:1: rule__BooleanValueType__Group__3 : rule__BooleanValueType__Group__3__Impl ;
    public final void rule__BooleanValueType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3783:1: ( rule__BooleanValueType__Group__3__Impl )
            // InternalQL.g:3784:2: rule__BooleanValueType__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanValueType__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueType__Group__3"


    // $ANTLR start "rule__BooleanValueType__Group__3__Impl"
    // InternalQL.g:3790:1: rule__BooleanValueType__Group__3__Impl : ( ( rule__BooleanValueType__Group_3__0 )? ) ;
    public final void rule__BooleanValueType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3794:1: ( ( ( rule__BooleanValueType__Group_3__0 )? ) )
            // InternalQL.g:3795:1: ( ( rule__BooleanValueType__Group_3__0 )? )
            {
            // InternalQL.g:3795:1: ( ( rule__BooleanValueType__Group_3__0 )? )
            // InternalQL.g:3796:2: ( rule__BooleanValueType__Group_3__0 )?
            {
             before(grammarAccess.getBooleanValueTypeAccess().getGroup_3()); 
            // InternalQL.g:3797:2: ( rule__BooleanValueType__Group_3__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==39) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalQL.g:3797:3: rule__BooleanValueType__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BooleanValueType__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBooleanValueTypeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueType__Group__3__Impl"


    // $ANTLR start "rule__BooleanValueType__Group_3__0"
    // InternalQL.g:3806:1: rule__BooleanValueType__Group_3__0 : rule__BooleanValueType__Group_3__0__Impl rule__BooleanValueType__Group_3__1 ;
    public final void rule__BooleanValueType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3810:1: ( rule__BooleanValueType__Group_3__0__Impl rule__BooleanValueType__Group_3__1 )
            // InternalQL.g:3811:2: rule__BooleanValueType__Group_3__0__Impl rule__BooleanValueType__Group_3__1
            {
            pushFollow(FOLLOW_35);
            rule__BooleanValueType__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanValueType__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueType__Group_3__0"


    // $ANTLR start "rule__BooleanValueType__Group_3__0__Impl"
    // InternalQL.g:3818:1: rule__BooleanValueType__Group_3__0__Impl : ( '{' ) ;
    public final void rule__BooleanValueType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3822:1: ( ( '{' ) )
            // InternalQL.g:3823:1: ( '{' )
            {
            // InternalQL.g:3823:1: ( '{' )
            // InternalQL.g:3824:2: '{'
            {
             before(grammarAccess.getBooleanValueTypeAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getBooleanValueTypeAccess().getLeftCurlyBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueType__Group_3__0__Impl"


    // $ANTLR start "rule__BooleanValueType__Group_3__1"
    // InternalQL.g:3833:1: rule__BooleanValueType__Group_3__1 : rule__BooleanValueType__Group_3__1__Impl rule__BooleanValueType__Group_3__2 ;
    public final void rule__BooleanValueType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3837:1: ( rule__BooleanValueType__Group_3__1__Impl rule__BooleanValueType__Group_3__2 )
            // InternalQL.g:3838:2: rule__BooleanValueType__Group_3__1__Impl rule__BooleanValueType__Group_3__2
            {
            pushFollow(FOLLOW_35);
            rule__BooleanValueType__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanValueType__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueType__Group_3__1"


    // $ANTLR start "rule__BooleanValueType__Group_3__1__Impl"
    // InternalQL.g:3845:1: rule__BooleanValueType__Group_3__1__Impl : ( ( rule__BooleanValueType__Group_3_1__0 )? ) ;
    public final void rule__BooleanValueType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3849:1: ( ( ( rule__BooleanValueType__Group_3_1__0 )? ) )
            // InternalQL.g:3850:1: ( ( rule__BooleanValueType__Group_3_1__0 )? )
            {
            // InternalQL.g:3850:1: ( ( rule__BooleanValueType__Group_3_1__0 )? )
            // InternalQL.g:3851:2: ( rule__BooleanValueType__Group_3_1__0 )?
            {
             before(grammarAccess.getBooleanValueTypeAccess().getGroup_3_1()); 
            // InternalQL.g:3852:2: ( rule__BooleanValueType__Group_3_1__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==48) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalQL.g:3852:3: rule__BooleanValueType__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BooleanValueType__Group_3_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBooleanValueTypeAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueType__Group_3__1__Impl"


    // $ANTLR start "rule__BooleanValueType__Group_3__2"
    // InternalQL.g:3860:1: rule__BooleanValueType__Group_3__2 : rule__BooleanValueType__Group_3__2__Impl ;
    public final void rule__BooleanValueType__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3864:1: ( rule__BooleanValueType__Group_3__2__Impl )
            // InternalQL.g:3865:2: rule__BooleanValueType__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanValueType__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueType__Group_3__2"


    // $ANTLR start "rule__BooleanValueType__Group_3__2__Impl"
    // InternalQL.g:3871:1: rule__BooleanValueType__Group_3__2__Impl : ( '}' ) ;
    public final void rule__BooleanValueType__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3875:1: ( ( '}' ) )
            // InternalQL.g:3876:1: ( '}' )
            {
            // InternalQL.g:3876:1: ( '}' )
            // InternalQL.g:3877:2: '}'
            {
             before(grammarAccess.getBooleanValueTypeAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getBooleanValueTypeAccess().getRightCurlyBracketKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueType__Group_3__2__Impl"


    // $ANTLR start "rule__BooleanValueType__Group_3_1__0"
    // InternalQL.g:3887:1: rule__BooleanValueType__Group_3_1__0 : rule__BooleanValueType__Group_3_1__0__Impl rule__BooleanValueType__Group_3_1__1 ;
    public final void rule__BooleanValueType__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3891:1: ( rule__BooleanValueType__Group_3_1__0__Impl rule__BooleanValueType__Group_3_1__1 )
            // InternalQL.g:3892:2: rule__BooleanValueType__Group_3_1__0__Impl rule__BooleanValueType__Group_3_1__1
            {
            pushFollow(FOLLOW_25);
            rule__BooleanValueType__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanValueType__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueType__Group_3_1__0"


    // $ANTLR start "rule__BooleanValueType__Group_3_1__0__Impl"
    // InternalQL.g:3899:1: rule__BooleanValueType__Group_3_1__0__Impl : ( 'unit' ) ;
    public final void rule__BooleanValueType__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3903:1: ( ( 'unit' ) )
            // InternalQL.g:3904:1: ( 'unit' )
            {
            // InternalQL.g:3904:1: ( 'unit' )
            // InternalQL.g:3905:2: 'unit'
            {
             before(grammarAccess.getBooleanValueTypeAccess().getUnitKeyword_3_1_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getBooleanValueTypeAccess().getUnitKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueType__Group_3_1__0__Impl"


    // $ANTLR start "rule__BooleanValueType__Group_3_1__1"
    // InternalQL.g:3914:1: rule__BooleanValueType__Group_3_1__1 : rule__BooleanValueType__Group_3_1__1__Impl ;
    public final void rule__BooleanValueType__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3918:1: ( rule__BooleanValueType__Group_3_1__1__Impl )
            // InternalQL.g:3919:2: rule__BooleanValueType__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanValueType__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueType__Group_3_1__1"


    // $ANTLR start "rule__BooleanValueType__Group_3_1__1__Impl"
    // InternalQL.g:3925:1: rule__BooleanValueType__Group_3_1__1__Impl : ( ( rule__BooleanValueType__UnitAssignment_3_1_1 ) ) ;
    public final void rule__BooleanValueType__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3929:1: ( ( ( rule__BooleanValueType__UnitAssignment_3_1_1 ) ) )
            // InternalQL.g:3930:1: ( ( rule__BooleanValueType__UnitAssignment_3_1_1 ) )
            {
            // InternalQL.g:3930:1: ( ( rule__BooleanValueType__UnitAssignment_3_1_1 ) )
            // InternalQL.g:3931:2: ( rule__BooleanValueType__UnitAssignment_3_1_1 )
            {
             before(grammarAccess.getBooleanValueTypeAccess().getUnitAssignment_3_1_1()); 
            // InternalQL.g:3932:2: ( rule__BooleanValueType__UnitAssignment_3_1_1 )
            // InternalQL.g:3932:3: rule__BooleanValueType__UnitAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__BooleanValueType__UnitAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBooleanValueTypeAccess().getUnitAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueType__Group_3_1__1__Impl"


    // $ANTLR start "rule__IntegerValueType__Group__0"
    // InternalQL.g:3941:1: rule__IntegerValueType__Group__0 : rule__IntegerValueType__Group__0__Impl rule__IntegerValueType__Group__1 ;
    public final void rule__IntegerValueType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3945:1: ( rule__IntegerValueType__Group__0__Impl rule__IntegerValueType__Group__1 )
            // InternalQL.g:3946:2: rule__IntegerValueType__Group__0__Impl rule__IntegerValueType__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__IntegerValueType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerValueType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group__0"


    // $ANTLR start "rule__IntegerValueType__Group__0__Impl"
    // InternalQL.g:3953:1: rule__IntegerValueType__Group__0__Impl : ( () ) ;
    public final void rule__IntegerValueType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3957:1: ( ( () ) )
            // InternalQL.g:3958:1: ( () )
            {
            // InternalQL.g:3958:1: ( () )
            // InternalQL.g:3959:2: ()
            {
             before(grammarAccess.getIntegerValueTypeAccess().getIntegerValueTypeAction_0()); 
            // InternalQL.g:3960:2: ()
            // InternalQL.g:3960:3: 
            {
            }

             after(grammarAccess.getIntegerValueTypeAccess().getIntegerValueTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group__0__Impl"


    // $ANTLR start "rule__IntegerValueType__Group__1"
    // InternalQL.g:3968:1: rule__IntegerValueType__Group__1 : rule__IntegerValueType__Group__1__Impl rule__IntegerValueType__Group__2 ;
    public final void rule__IntegerValueType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3972:1: ( rule__IntegerValueType__Group__1__Impl rule__IntegerValueType__Group__2 )
            // InternalQL.g:3973:2: rule__IntegerValueType__Group__1__Impl rule__IntegerValueType__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__IntegerValueType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerValueType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group__1"


    // $ANTLR start "rule__IntegerValueType__Group__1__Impl"
    // InternalQL.g:3980:1: rule__IntegerValueType__Group__1__Impl : ( 'integerType' ) ;
    public final void rule__IntegerValueType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3984:1: ( ( 'integerType' ) )
            // InternalQL.g:3985:1: ( 'integerType' )
            {
            // InternalQL.g:3985:1: ( 'integerType' )
            // InternalQL.g:3986:2: 'integerType'
            {
             before(grammarAccess.getIntegerValueTypeAccess().getIntegerTypeKeyword_1()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getIntegerValueTypeAccess().getIntegerTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group__1__Impl"


    // $ANTLR start "rule__IntegerValueType__Group__2"
    // InternalQL.g:3995:1: rule__IntegerValueType__Group__2 : rule__IntegerValueType__Group__2__Impl rule__IntegerValueType__Group__3 ;
    public final void rule__IntegerValueType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3999:1: ( rule__IntegerValueType__Group__2__Impl rule__IntegerValueType__Group__3 )
            // InternalQL.g:4000:2: rule__IntegerValueType__Group__2__Impl rule__IntegerValueType__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__IntegerValueType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerValueType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group__2"


    // $ANTLR start "rule__IntegerValueType__Group__2__Impl"
    // InternalQL.g:4007:1: rule__IntegerValueType__Group__2__Impl : ( ( rule__IntegerValueType__NameAssignment_2 ) ) ;
    public final void rule__IntegerValueType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4011:1: ( ( ( rule__IntegerValueType__NameAssignment_2 ) ) )
            // InternalQL.g:4012:1: ( ( rule__IntegerValueType__NameAssignment_2 ) )
            {
            // InternalQL.g:4012:1: ( ( rule__IntegerValueType__NameAssignment_2 ) )
            // InternalQL.g:4013:2: ( rule__IntegerValueType__NameAssignment_2 )
            {
             before(grammarAccess.getIntegerValueTypeAccess().getNameAssignment_2()); 
            // InternalQL.g:4014:2: ( rule__IntegerValueType__NameAssignment_2 )
            // InternalQL.g:4014:3: rule__IntegerValueType__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__IntegerValueType__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIntegerValueTypeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group__2__Impl"


    // $ANTLR start "rule__IntegerValueType__Group__3"
    // InternalQL.g:4022:1: rule__IntegerValueType__Group__3 : rule__IntegerValueType__Group__3__Impl ;
    public final void rule__IntegerValueType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4026:1: ( rule__IntegerValueType__Group__3__Impl )
            // InternalQL.g:4027:2: rule__IntegerValueType__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntegerValueType__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group__3"


    // $ANTLR start "rule__IntegerValueType__Group__3__Impl"
    // InternalQL.g:4033:1: rule__IntegerValueType__Group__3__Impl : ( ( rule__IntegerValueType__Group_3__0 )? ) ;
    public final void rule__IntegerValueType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4037:1: ( ( ( rule__IntegerValueType__Group_3__0 )? ) )
            // InternalQL.g:4038:1: ( ( rule__IntegerValueType__Group_3__0 )? )
            {
            // InternalQL.g:4038:1: ( ( rule__IntegerValueType__Group_3__0 )? )
            // InternalQL.g:4039:2: ( rule__IntegerValueType__Group_3__0 )?
            {
             before(grammarAccess.getIntegerValueTypeAccess().getGroup_3()); 
            // InternalQL.g:4040:2: ( rule__IntegerValueType__Group_3__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==39) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalQL.g:4040:3: rule__IntegerValueType__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IntegerValueType__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntegerValueTypeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group__3__Impl"


    // $ANTLR start "rule__IntegerValueType__Group_3__0"
    // InternalQL.g:4049:1: rule__IntegerValueType__Group_3__0 : rule__IntegerValueType__Group_3__0__Impl rule__IntegerValueType__Group_3__1 ;
    public final void rule__IntegerValueType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4053:1: ( rule__IntegerValueType__Group_3__0__Impl rule__IntegerValueType__Group_3__1 )
            // InternalQL.g:4054:2: rule__IntegerValueType__Group_3__0__Impl rule__IntegerValueType__Group_3__1
            {
            pushFollow(FOLLOW_39);
            rule__IntegerValueType__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerValueType__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_3__0"


    // $ANTLR start "rule__IntegerValueType__Group_3__0__Impl"
    // InternalQL.g:4061:1: rule__IntegerValueType__Group_3__0__Impl : ( '{' ) ;
    public final void rule__IntegerValueType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4065:1: ( ( '{' ) )
            // InternalQL.g:4066:1: ( '{' )
            {
            // InternalQL.g:4066:1: ( '{' )
            // InternalQL.g:4067:2: '{'
            {
             before(grammarAccess.getIntegerValueTypeAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getIntegerValueTypeAccess().getLeftCurlyBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_3__0__Impl"


    // $ANTLR start "rule__IntegerValueType__Group_3__1"
    // InternalQL.g:4076:1: rule__IntegerValueType__Group_3__1 : rule__IntegerValueType__Group_3__1__Impl rule__IntegerValueType__Group_3__2 ;
    public final void rule__IntegerValueType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4080:1: ( rule__IntegerValueType__Group_3__1__Impl rule__IntegerValueType__Group_3__2 )
            // InternalQL.g:4081:2: rule__IntegerValueType__Group_3__1__Impl rule__IntegerValueType__Group_3__2
            {
            pushFollow(FOLLOW_39);
            rule__IntegerValueType__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerValueType__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_3__1"


    // $ANTLR start "rule__IntegerValueType__Group_3__1__Impl"
    // InternalQL.g:4088:1: rule__IntegerValueType__Group_3__1__Impl : ( ( rule__IntegerValueType__Group_3_1__0 )? ) ;
    public final void rule__IntegerValueType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4092:1: ( ( ( rule__IntegerValueType__Group_3_1__0 )? ) )
            // InternalQL.g:4093:1: ( ( rule__IntegerValueType__Group_3_1__0 )? )
            {
            // InternalQL.g:4093:1: ( ( rule__IntegerValueType__Group_3_1__0 )? )
            // InternalQL.g:4094:2: ( rule__IntegerValueType__Group_3_1__0 )?
            {
             before(grammarAccess.getIntegerValueTypeAccess().getGroup_3_1()); 
            // InternalQL.g:4095:2: ( rule__IntegerValueType__Group_3_1__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==48) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalQL.g:4095:3: rule__IntegerValueType__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IntegerValueType__Group_3_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntegerValueTypeAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_3__1__Impl"


    // $ANTLR start "rule__IntegerValueType__Group_3__2"
    // InternalQL.g:4103:1: rule__IntegerValueType__Group_3__2 : rule__IntegerValueType__Group_3__2__Impl rule__IntegerValueType__Group_3__3 ;
    public final void rule__IntegerValueType__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4107:1: ( rule__IntegerValueType__Group_3__2__Impl rule__IntegerValueType__Group_3__3 )
            // InternalQL.g:4108:2: rule__IntegerValueType__Group_3__2__Impl rule__IntegerValueType__Group_3__3
            {
            pushFollow(FOLLOW_39);
            rule__IntegerValueType__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerValueType__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_3__2"


    // $ANTLR start "rule__IntegerValueType__Group_3__2__Impl"
    // InternalQL.g:4115:1: rule__IntegerValueType__Group_3__2__Impl : ( ( rule__IntegerValueType__Group_3_2__0 )? ) ;
    public final void rule__IntegerValueType__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4119:1: ( ( ( rule__IntegerValueType__Group_3_2__0 )? ) )
            // InternalQL.g:4120:1: ( ( rule__IntegerValueType__Group_3_2__0 )? )
            {
            // InternalQL.g:4120:1: ( ( rule__IntegerValueType__Group_3_2__0 )? )
            // InternalQL.g:4121:2: ( rule__IntegerValueType__Group_3_2__0 )?
            {
             before(grammarAccess.getIntegerValueTypeAccess().getGroup_3_2()); 
            // InternalQL.g:4122:2: ( rule__IntegerValueType__Group_3_2__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==51) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalQL.g:4122:3: rule__IntegerValueType__Group_3_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IntegerValueType__Group_3_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntegerValueTypeAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_3__2__Impl"


    // $ANTLR start "rule__IntegerValueType__Group_3__3"
    // InternalQL.g:4130:1: rule__IntegerValueType__Group_3__3 : rule__IntegerValueType__Group_3__3__Impl rule__IntegerValueType__Group_3__4 ;
    public final void rule__IntegerValueType__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4134:1: ( rule__IntegerValueType__Group_3__3__Impl rule__IntegerValueType__Group_3__4 )
            // InternalQL.g:4135:2: rule__IntegerValueType__Group_3__3__Impl rule__IntegerValueType__Group_3__4
            {
            pushFollow(FOLLOW_39);
            rule__IntegerValueType__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerValueType__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_3__3"


    // $ANTLR start "rule__IntegerValueType__Group_3__3__Impl"
    // InternalQL.g:4142:1: rule__IntegerValueType__Group_3__3__Impl : ( ( rule__IntegerValueType__Group_3_3__0 )? ) ;
    public final void rule__IntegerValueType__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4146:1: ( ( ( rule__IntegerValueType__Group_3_3__0 )? ) )
            // InternalQL.g:4147:1: ( ( rule__IntegerValueType__Group_3_3__0 )? )
            {
            // InternalQL.g:4147:1: ( ( rule__IntegerValueType__Group_3_3__0 )? )
            // InternalQL.g:4148:2: ( rule__IntegerValueType__Group_3_3__0 )?
            {
             before(grammarAccess.getIntegerValueTypeAccess().getGroup_3_3()); 
            // InternalQL.g:4149:2: ( rule__IntegerValueType__Group_3_3__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==52) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalQL.g:4149:3: rule__IntegerValueType__Group_3_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IntegerValueType__Group_3_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntegerValueTypeAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_3__3__Impl"


    // $ANTLR start "rule__IntegerValueType__Group_3__4"
    // InternalQL.g:4157:1: rule__IntegerValueType__Group_3__4 : rule__IntegerValueType__Group_3__4__Impl ;
    public final void rule__IntegerValueType__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4161:1: ( rule__IntegerValueType__Group_3__4__Impl )
            // InternalQL.g:4162:2: rule__IntegerValueType__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntegerValueType__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_3__4"


    // $ANTLR start "rule__IntegerValueType__Group_3__4__Impl"
    // InternalQL.g:4168:1: rule__IntegerValueType__Group_3__4__Impl : ( '}' ) ;
    public final void rule__IntegerValueType__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4172:1: ( ( '}' ) )
            // InternalQL.g:4173:1: ( '}' )
            {
            // InternalQL.g:4173:1: ( '}' )
            // InternalQL.g:4174:2: '}'
            {
             before(grammarAccess.getIntegerValueTypeAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getIntegerValueTypeAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_3__4__Impl"


    // $ANTLR start "rule__IntegerValueType__Group_3_1__0"
    // InternalQL.g:4184:1: rule__IntegerValueType__Group_3_1__0 : rule__IntegerValueType__Group_3_1__0__Impl rule__IntegerValueType__Group_3_1__1 ;
    public final void rule__IntegerValueType__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4188:1: ( rule__IntegerValueType__Group_3_1__0__Impl rule__IntegerValueType__Group_3_1__1 )
            // InternalQL.g:4189:2: rule__IntegerValueType__Group_3_1__0__Impl rule__IntegerValueType__Group_3_1__1
            {
            pushFollow(FOLLOW_25);
            rule__IntegerValueType__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerValueType__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_3_1__0"


    // $ANTLR start "rule__IntegerValueType__Group_3_1__0__Impl"
    // InternalQL.g:4196:1: rule__IntegerValueType__Group_3_1__0__Impl : ( 'unit' ) ;
    public final void rule__IntegerValueType__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4200:1: ( ( 'unit' ) )
            // InternalQL.g:4201:1: ( 'unit' )
            {
            // InternalQL.g:4201:1: ( 'unit' )
            // InternalQL.g:4202:2: 'unit'
            {
             before(grammarAccess.getIntegerValueTypeAccess().getUnitKeyword_3_1_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getIntegerValueTypeAccess().getUnitKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_3_1__0__Impl"


    // $ANTLR start "rule__IntegerValueType__Group_3_1__1"
    // InternalQL.g:4211:1: rule__IntegerValueType__Group_3_1__1 : rule__IntegerValueType__Group_3_1__1__Impl ;
    public final void rule__IntegerValueType__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4215:1: ( rule__IntegerValueType__Group_3_1__1__Impl )
            // InternalQL.g:4216:2: rule__IntegerValueType__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntegerValueType__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_3_1__1"


    // $ANTLR start "rule__IntegerValueType__Group_3_1__1__Impl"
    // InternalQL.g:4222:1: rule__IntegerValueType__Group_3_1__1__Impl : ( ( rule__IntegerValueType__UnitAssignment_3_1_1 ) ) ;
    public final void rule__IntegerValueType__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4226:1: ( ( ( rule__IntegerValueType__UnitAssignment_3_1_1 ) ) )
            // InternalQL.g:4227:1: ( ( rule__IntegerValueType__UnitAssignment_3_1_1 ) )
            {
            // InternalQL.g:4227:1: ( ( rule__IntegerValueType__UnitAssignment_3_1_1 ) )
            // InternalQL.g:4228:2: ( rule__IntegerValueType__UnitAssignment_3_1_1 )
            {
             before(grammarAccess.getIntegerValueTypeAccess().getUnitAssignment_3_1_1()); 
            // InternalQL.g:4229:2: ( rule__IntegerValueType__UnitAssignment_3_1_1 )
            // InternalQL.g:4229:3: rule__IntegerValueType__UnitAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__IntegerValueType__UnitAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getIntegerValueTypeAccess().getUnitAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_3_1__1__Impl"


    // $ANTLR start "rule__IntegerValueType__Group_3_2__0"
    // InternalQL.g:4238:1: rule__IntegerValueType__Group_3_2__0 : rule__IntegerValueType__Group_3_2__0__Impl rule__IntegerValueType__Group_3_2__1 ;
    public final void rule__IntegerValueType__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4242:1: ( rule__IntegerValueType__Group_3_2__0__Impl rule__IntegerValueType__Group_3_2__1 )
            // InternalQL.g:4243:2: rule__IntegerValueType__Group_3_2__0__Impl rule__IntegerValueType__Group_3_2__1
            {
            pushFollow(FOLLOW_40);
            rule__IntegerValueType__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerValueType__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_3_2__0"


    // $ANTLR start "rule__IntegerValueType__Group_3_2__0__Impl"
    // InternalQL.g:4250:1: rule__IntegerValueType__Group_3_2__0__Impl : ( 'min' ) ;
    public final void rule__IntegerValueType__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4254:1: ( ( 'min' ) )
            // InternalQL.g:4255:1: ( 'min' )
            {
            // InternalQL.g:4255:1: ( 'min' )
            // InternalQL.g:4256:2: 'min'
            {
             before(grammarAccess.getIntegerValueTypeAccess().getMinKeyword_3_2_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getIntegerValueTypeAccess().getMinKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_3_2__0__Impl"


    // $ANTLR start "rule__IntegerValueType__Group_3_2__1"
    // InternalQL.g:4265:1: rule__IntegerValueType__Group_3_2__1 : rule__IntegerValueType__Group_3_2__1__Impl ;
    public final void rule__IntegerValueType__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4269:1: ( rule__IntegerValueType__Group_3_2__1__Impl )
            // InternalQL.g:4270:2: rule__IntegerValueType__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntegerValueType__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_3_2__1"


    // $ANTLR start "rule__IntegerValueType__Group_3_2__1__Impl"
    // InternalQL.g:4276:1: rule__IntegerValueType__Group_3_2__1__Impl : ( ( rule__IntegerValueType__MinAssignment_3_2_1 ) ) ;
    public final void rule__IntegerValueType__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4280:1: ( ( ( rule__IntegerValueType__MinAssignment_3_2_1 ) ) )
            // InternalQL.g:4281:1: ( ( rule__IntegerValueType__MinAssignment_3_2_1 ) )
            {
            // InternalQL.g:4281:1: ( ( rule__IntegerValueType__MinAssignment_3_2_1 ) )
            // InternalQL.g:4282:2: ( rule__IntegerValueType__MinAssignment_3_2_1 )
            {
             before(grammarAccess.getIntegerValueTypeAccess().getMinAssignment_3_2_1()); 
            // InternalQL.g:4283:2: ( rule__IntegerValueType__MinAssignment_3_2_1 )
            // InternalQL.g:4283:3: rule__IntegerValueType__MinAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__IntegerValueType__MinAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getIntegerValueTypeAccess().getMinAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_3_2__1__Impl"


    // $ANTLR start "rule__IntegerValueType__Group_3_3__0"
    // InternalQL.g:4292:1: rule__IntegerValueType__Group_3_3__0 : rule__IntegerValueType__Group_3_3__0__Impl rule__IntegerValueType__Group_3_3__1 ;
    public final void rule__IntegerValueType__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4296:1: ( rule__IntegerValueType__Group_3_3__0__Impl rule__IntegerValueType__Group_3_3__1 )
            // InternalQL.g:4297:2: rule__IntegerValueType__Group_3_3__0__Impl rule__IntegerValueType__Group_3_3__1
            {
            pushFollow(FOLLOW_40);
            rule__IntegerValueType__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerValueType__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_3_3__0"


    // $ANTLR start "rule__IntegerValueType__Group_3_3__0__Impl"
    // InternalQL.g:4304:1: rule__IntegerValueType__Group_3_3__0__Impl : ( 'max' ) ;
    public final void rule__IntegerValueType__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4308:1: ( ( 'max' ) )
            // InternalQL.g:4309:1: ( 'max' )
            {
            // InternalQL.g:4309:1: ( 'max' )
            // InternalQL.g:4310:2: 'max'
            {
             before(grammarAccess.getIntegerValueTypeAccess().getMaxKeyword_3_3_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getIntegerValueTypeAccess().getMaxKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_3_3__0__Impl"


    // $ANTLR start "rule__IntegerValueType__Group_3_3__1"
    // InternalQL.g:4319:1: rule__IntegerValueType__Group_3_3__1 : rule__IntegerValueType__Group_3_3__1__Impl ;
    public final void rule__IntegerValueType__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4323:1: ( rule__IntegerValueType__Group_3_3__1__Impl )
            // InternalQL.g:4324:2: rule__IntegerValueType__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntegerValueType__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_3_3__1"


    // $ANTLR start "rule__IntegerValueType__Group_3_3__1__Impl"
    // InternalQL.g:4330:1: rule__IntegerValueType__Group_3_3__1__Impl : ( ( rule__IntegerValueType__MaxAssignment_3_3_1 ) ) ;
    public final void rule__IntegerValueType__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4334:1: ( ( ( rule__IntegerValueType__MaxAssignment_3_3_1 ) ) )
            // InternalQL.g:4335:1: ( ( rule__IntegerValueType__MaxAssignment_3_3_1 ) )
            {
            // InternalQL.g:4335:1: ( ( rule__IntegerValueType__MaxAssignment_3_3_1 ) )
            // InternalQL.g:4336:2: ( rule__IntegerValueType__MaxAssignment_3_3_1 )
            {
             before(grammarAccess.getIntegerValueTypeAccess().getMaxAssignment_3_3_1()); 
            // InternalQL.g:4337:2: ( rule__IntegerValueType__MaxAssignment_3_3_1 )
            // InternalQL.g:4337:3: rule__IntegerValueType__MaxAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__IntegerValueType__MaxAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getIntegerValueTypeAccess().getMaxAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_3_3__1__Impl"


    // $ANTLR start "rule__DecimalValueType__Group__0"
    // InternalQL.g:4346:1: rule__DecimalValueType__Group__0 : rule__DecimalValueType__Group__0__Impl rule__DecimalValueType__Group__1 ;
    public final void rule__DecimalValueType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4350:1: ( rule__DecimalValueType__Group__0__Impl rule__DecimalValueType__Group__1 )
            // InternalQL.g:4351:2: rule__DecimalValueType__Group__0__Impl rule__DecimalValueType__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__DecimalValueType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DecimalValueType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueType__Group__0"


    // $ANTLR start "rule__DecimalValueType__Group__0__Impl"
    // InternalQL.g:4358:1: rule__DecimalValueType__Group__0__Impl : ( () ) ;
    public final void rule__DecimalValueType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4362:1: ( ( () ) )
            // InternalQL.g:4363:1: ( () )
            {
            // InternalQL.g:4363:1: ( () )
            // InternalQL.g:4364:2: ()
            {
             before(grammarAccess.getDecimalValueTypeAccess().getDecimalValueTypeAction_0()); 
            // InternalQL.g:4365:2: ()
            // InternalQL.g:4365:3: 
            {
            }

             after(grammarAccess.getDecimalValueTypeAccess().getDecimalValueTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueType__Group__0__Impl"


    // $ANTLR start "rule__DecimalValueType__Group__1"
    // InternalQL.g:4373:1: rule__DecimalValueType__Group__1 : rule__DecimalValueType__Group__1__Impl rule__DecimalValueType__Group__2 ;
    public final void rule__DecimalValueType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4377:1: ( rule__DecimalValueType__Group__1__Impl rule__DecimalValueType__Group__2 )
            // InternalQL.g:4378:2: rule__DecimalValueType__Group__1__Impl rule__DecimalValueType__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__DecimalValueType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DecimalValueType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueType__Group__1"


    // $ANTLR start "rule__DecimalValueType__Group__1__Impl"
    // InternalQL.g:4385:1: rule__DecimalValueType__Group__1__Impl : ( 'decimalType' ) ;
    public final void rule__DecimalValueType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4389:1: ( ( 'decimalType' ) )
            // InternalQL.g:4390:1: ( 'decimalType' )
            {
            // InternalQL.g:4390:1: ( 'decimalType' )
            // InternalQL.g:4391:2: 'decimalType'
            {
             before(grammarAccess.getDecimalValueTypeAccess().getDecimalTypeKeyword_1()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getDecimalValueTypeAccess().getDecimalTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueType__Group__1__Impl"


    // $ANTLR start "rule__DecimalValueType__Group__2"
    // InternalQL.g:4400:1: rule__DecimalValueType__Group__2 : rule__DecimalValueType__Group__2__Impl rule__DecimalValueType__Group__3 ;
    public final void rule__DecimalValueType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4404:1: ( rule__DecimalValueType__Group__2__Impl rule__DecimalValueType__Group__3 )
            // InternalQL.g:4405:2: rule__DecimalValueType__Group__2__Impl rule__DecimalValueType__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__DecimalValueType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DecimalValueType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueType__Group__2"


    // $ANTLR start "rule__DecimalValueType__Group__2__Impl"
    // InternalQL.g:4412:1: rule__DecimalValueType__Group__2__Impl : ( ( rule__DecimalValueType__NameAssignment_2 ) ) ;
    public final void rule__DecimalValueType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4416:1: ( ( ( rule__DecimalValueType__NameAssignment_2 ) ) )
            // InternalQL.g:4417:1: ( ( rule__DecimalValueType__NameAssignment_2 ) )
            {
            // InternalQL.g:4417:1: ( ( rule__DecimalValueType__NameAssignment_2 ) )
            // InternalQL.g:4418:2: ( rule__DecimalValueType__NameAssignment_2 )
            {
             before(grammarAccess.getDecimalValueTypeAccess().getNameAssignment_2()); 
            // InternalQL.g:4419:2: ( rule__DecimalValueType__NameAssignment_2 )
            // InternalQL.g:4419:3: rule__DecimalValueType__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DecimalValueType__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDecimalValueTypeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueType__Group__2__Impl"


    // $ANTLR start "rule__DecimalValueType__Group__3"
    // InternalQL.g:4427:1: rule__DecimalValueType__Group__3 : rule__DecimalValueType__Group__3__Impl ;
    public final void rule__DecimalValueType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4431:1: ( rule__DecimalValueType__Group__3__Impl )
            // InternalQL.g:4432:2: rule__DecimalValueType__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DecimalValueType__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueType__Group__3"


    // $ANTLR start "rule__DecimalValueType__Group__3__Impl"
    // InternalQL.g:4438:1: rule__DecimalValueType__Group__3__Impl : ( ( rule__DecimalValueType__Group_3__0 )? ) ;
    public final void rule__DecimalValueType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4442:1: ( ( ( rule__DecimalValueType__Group_3__0 )? ) )
            // InternalQL.g:4443:1: ( ( rule__DecimalValueType__Group_3__0 )? )
            {
            // InternalQL.g:4443:1: ( ( rule__DecimalValueType__Group_3__0 )? )
            // InternalQL.g:4444:2: ( rule__DecimalValueType__Group_3__0 )?
            {
             before(grammarAccess.getDecimalValueTypeAccess().getGroup_3()); 
            // InternalQL.g:4445:2: ( rule__DecimalValueType__Group_3__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==39) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalQL.g:4445:3: rule__DecimalValueType__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DecimalValueType__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDecimalValueTypeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueType__Group__3__Impl"


    // $ANTLR start "rule__DecimalValueType__Group_3__0"
    // InternalQL.g:4454:1: rule__DecimalValueType__Group_3__0 : rule__DecimalValueType__Group_3__0__Impl rule__DecimalValueType__Group_3__1 ;
    public final void rule__DecimalValueType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4458:1: ( rule__DecimalValueType__Group_3__0__Impl rule__DecimalValueType__Group_3__1 )
            // InternalQL.g:4459:2: rule__DecimalValueType__Group_3__0__Impl rule__DecimalValueType__Group_3__1
            {
            pushFollow(FOLLOW_35);
            rule__DecimalValueType__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DecimalValueType__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueType__Group_3__0"


    // $ANTLR start "rule__DecimalValueType__Group_3__0__Impl"
    // InternalQL.g:4466:1: rule__DecimalValueType__Group_3__0__Impl : ( '{' ) ;
    public final void rule__DecimalValueType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4470:1: ( ( '{' ) )
            // InternalQL.g:4471:1: ( '{' )
            {
            // InternalQL.g:4471:1: ( '{' )
            // InternalQL.g:4472:2: '{'
            {
             before(grammarAccess.getDecimalValueTypeAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getDecimalValueTypeAccess().getLeftCurlyBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueType__Group_3__0__Impl"


    // $ANTLR start "rule__DecimalValueType__Group_3__1"
    // InternalQL.g:4481:1: rule__DecimalValueType__Group_3__1 : rule__DecimalValueType__Group_3__1__Impl rule__DecimalValueType__Group_3__2 ;
    public final void rule__DecimalValueType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4485:1: ( rule__DecimalValueType__Group_3__1__Impl rule__DecimalValueType__Group_3__2 )
            // InternalQL.g:4486:2: rule__DecimalValueType__Group_3__1__Impl rule__DecimalValueType__Group_3__2
            {
            pushFollow(FOLLOW_35);
            rule__DecimalValueType__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DecimalValueType__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueType__Group_3__1"


    // $ANTLR start "rule__DecimalValueType__Group_3__1__Impl"
    // InternalQL.g:4493:1: rule__DecimalValueType__Group_3__1__Impl : ( ( rule__DecimalValueType__Group_3_1__0 )? ) ;
    public final void rule__DecimalValueType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4497:1: ( ( ( rule__DecimalValueType__Group_3_1__0 )? ) )
            // InternalQL.g:4498:1: ( ( rule__DecimalValueType__Group_3_1__0 )? )
            {
            // InternalQL.g:4498:1: ( ( rule__DecimalValueType__Group_3_1__0 )? )
            // InternalQL.g:4499:2: ( rule__DecimalValueType__Group_3_1__0 )?
            {
             before(grammarAccess.getDecimalValueTypeAccess().getGroup_3_1()); 
            // InternalQL.g:4500:2: ( rule__DecimalValueType__Group_3_1__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==48) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalQL.g:4500:3: rule__DecimalValueType__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DecimalValueType__Group_3_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDecimalValueTypeAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueType__Group_3__1__Impl"


    // $ANTLR start "rule__DecimalValueType__Group_3__2"
    // InternalQL.g:4508:1: rule__DecimalValueType__Group_3__2 : rule__DecimalValueType__Group_3__2__Impl ;
    public final void rule__DecimalValueType__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4512:1: ( rule__DecimalValueType__Group_3__2__Impl )
            // InternalQL.g:4513:2: rule__DecimalValueType__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DecimalValueType__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueType__Group_3__2"


    // $ANTLR start "rule__DecimalValueType__Group_3__2__Impl"
    // InternalQL.g:4519:1: rule__DecimalValueType__Group_3__2__Impl : ( '}' ) ;
    public final void rule__DecimalValueType__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4523:1: ( ( '}' ) )
            // InternalQL.g:4524:1: ( '}' )
            {
            // InternalQL.g:4524:1: ( '}' )
            // InternalQL.g:4525:2: '}'
            {
             before(grammarAccess.getDecimalValueTypeAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getDecimalValueTypeAccess().getRightCurlyBracketKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueType__Group_3__2__Impl"


    // $ANTLR start "rule__DecimalValueType__Group_3_1__0"
    // InternalQL.g:4535:1: rule__DecimalValueType__Group_3_1__0 : rule__DecimalValueType__Group_3_1__0__Impl rule__DecimalValueType__Group_3_1__1 ;
    public final void rule__DecimalValueType__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4539:1: ( rule__DecimalValueType__Group_3_1__0__Impl rule__DecimalValueType__Group_3_1__1 )
            // InternalQL.g:4540:2: rule__DecimalValueType__Group_3_1__0__Impl rule__DecimalValueType__Group_3_1__1
            {
            pushFollow(FOLLOW_25);
            rule__DecimalValueType__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DecimalValueType__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueType__Group_3_1__0"


    // $ANTLR start "rule__DecimalValueType__Group_3_1__0__Impl"
    // InternalQL.g:4547:1: rule__DecimalValueType__Group_3_1__0__Impl : ( 'unit' ) ;
    public final void rule__DecimalValueType__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4551:1: ( ( 'unit' ) )
            // InternalQL.g:4552:1: ( 'unit' )
            {
            // InternalQL.g:4552:1: ( 'unit' )
            // InternalQL.g:4553:2: 'unit'
            {
             before(grammarAccess.getDecimalValueTypeAccess().getUnitKeyword_3_1_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getDecimalValueTypeAccess().getUnitKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueType__Group_3_1__0__Impl"


    // $ANTLR start "rule__DecimalValueType__Group_3_1__1"
    // InternalQL.g:4562:1: rule__DecimalValueType__Group_3_1__1 : rule__DecimalValueType__Group_3_1__1__Impl ;
    public final void rule__DecimalValueType__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4566:1: ( rule__DecimalValueType__Group_3_1__1__Impl )
            // InternalQL.g:4567:2: rule__DecimalValueType__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DecimalValueType__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueType__Group_3_1__1"


    // $ANTLR start "rule__DecimalValueType__Group_3_1__1__Impl"
    // InternalQL.g:4573:1: rule__DecimalValueType__Group_3_1__1__Impl : ( ( rule__DecimalValueType__UnitAssignment_3_1_1 ) ) ;
    public final void rule__DecimalValueType__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4577:1: ( ( ( rule__DecimalValueType__UnitAssignment_3_1_1 ) ) )
            // InternalQL.g:4578:1: ( ( rule__DecimalValueType__UnitAssignment_3_1_1 ) )
            {
            // InternalQL.g:4578:1: ( ( rule__DecimalValueType__UnitAssignment_3_1_1 ) )
            // InternalQL.g:4579:2: ( rule__DecimalValueType__UnitAssignment_3_1_1 )
            {
             before(grammarAccess.getDecimalValueTypeAccess().getUnitAssignment_3_1_1()); 
            // InternalQL.g:4580:2: ( rule__DecimalValueType__UnitAssignment_3_1_1 )
            // InternalQL.g:4580:3: rule__DecimalValueType__UnitAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DecimalValueType__UnitAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDecimalValueTypeAccess().getUnitAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueType__Group_3_1__1__Impl"


    // $ANTLR start "rule__DateValueType__Group__0"
    // InternalQL.g:4589:1: rule__DateValueType__Group__0 : rule__DateValueType__Group__0__Impl rule__DateValueType__Group__1 ;
    public final void rule__DateValueType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4593:1: ( rule__DateValueType__Group__0__Impl rule__DateValueType__Group__1 )
            // InternalQL.g:4594:2: rule__DateValueType__Group__0__Impl rule__DateValueType__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__DateValueType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DateValueType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValueType__Group__0"


    // $ANTLR start "rule__DateValueType__Group__0__Impl"
    // InternalQL.g:4601:1: rule__DateValueType__Group__0__Impl : ( () ) ;
    public final void rule__DateValueType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4605:1: ( ( () ) )
            // InternalQL.g:4606:1: ( () )
            {
            // InternalQL.g:4606:1: ( () )
            // InternalQL.g:4607:2: ()
            {
             before(grammarAccess.getDateValueTypeAccess().getDateValueTypeAction_0()); 
            // InternalQL.g:4608:2: ()
            // InternalQL.g:4608:3: 
            {
            }

             after(grammarAccess.getDateValueTypeAccess().getDateValueTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValueType__Group__0__Impl"


    // $ANTLR start "rule__DateValueType__Group__1"
    // InternalQL.g:4616:1: rule__DateValueType__Group__1 : rule__DateValueType__Group__1__Impl rule__DateValueType__Group__2 ;
    public final void rule__DateValueType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4620:1: ( rule__DateValueType__Group__1__Impl rule__DateValueType__Group__2 )
            // InternalQL.g:4621:2: rule__DateValueType__Group__1__Impl rule__DateValueType__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__DateValueType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DateValueType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValueType__Group__1"


    // $ANTLR start "rule__DateValueType__Group__1__Impl"
    // InternalQL.g:4628:1: rule__DateValueType__Group__1__Impl : ( 'dateType' ) ;
    public final void rule__DateValueType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4632:1: ( ( 'dateType' ) )
            // InternalQL.g:4633:1: ( 'dateType' )
            {
            // InternalQL.g:4633:1: ( 'dateType' )
            // InternalQL.g:4634:2: 'dateType'
            {
             before(grammarAccess.getDateValueTypeAccess().getDateTypeKeyword_1()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getDateValueTypeAccess().getDateTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValueType__Group__1__Impl"


    // $ANTLR start "rule__DateValueType__Group__2"
    // InternalQL.g:4643:1: rule__DateValueType__Group__2 : rule__DateValueType__Group__2__Impl rule__DateValueType__Group__3 ;
    public final void rule__DateValueType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4647:1: ( rule__DateValueType__Group__2__Impl rule__DateValueType__Group__3 )
            // InternalQL.g:4648:2: rule__DateValueType__Group__2__Impl rule__DateValueType__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__DateValueType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DateValueType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValueType__Group__2"


    // $ANTLR start "rule__DateValueType__Group__2__Impl"
    // InternalQL.g:4655:1: rule__DateValueType__Group__2__Impl : ( ( rule__DateValueType__NameAssignment_2 ) ) ;
    public final void rule__DateValueType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4659:1: ( ( ( rule__DateValueType__NameAssignment_2 ) ) )
            // InternalQL.g:4660:1: ( ( rule__DateValueType__NameAssignment_2 ) )
            {
            // InternalQL.g:4660:1: ( ( rule__DateValueType__NameAssignment_2 ) )
            // InternalQL.g:4661:2: ( rule__DateValueType__NameAssignment_2 )
            {
             before(grammarAccess.getDateValueTypeAccess().getNameAssignment_2()); 
            // InternalQL.g:4662:2: ( rule__DateValueType__NameAssignment_2 )
            // InternalQL.g:4662:3: rule__DateValueType__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DateValueType__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDateValueTypeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValueType__Group__2__Impl"


    // $ANTLR start "rule__DateValueType__Group__3"
    // InternalQL.g:4670:1: rule__DateValueType__Group__3 : rule__DateValueType__Group__3__Impl ;
    public final void rule__DateValueType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4674:1: ( rule__DateValueType__Group__3__Impl )
            // InternalQL.g:4675:2: rule__DateValueType__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DateValueType__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValueType__Group__3"


    // $ANTLR start "rule__DateValueType__Group__3__Impl"
    // InternalQL.g:4681:1: rule__DateValueType__Group__3__Impl : ( ( rule__DateValueType__Group_3__0 )? ) ;
    public final void rule__DateValueType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4685:1: ( ( ( rule__DateValueType__Group_3__0 )? ) )
            // InternalQL.g:4686:1: ( ( rule__DateValueType__Group_3__0 )? )
            {
            // InternalQL.g:4686:1: ( ( rule__DateValueType__Group_3__0 )? )
            // InternalQL.g:4687:2: ( rule__DateValueType__Group_3__0 )?
            {
             before(grammarAccess.getDateValueTypeAccess().getGroup_3()); 
            // InternalQL.g:4688:2: ( rule__DateValueType__Group_3__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==39) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalQL.g:4688:3: rule__DateValueType__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DateValueType__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDateValueTypeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValueType__Group__3__Impl"


    // $ANTLR start "rule__DateValueType__Group_3__0"
    // InternalQL.g:4697:1: rule__DateValueType__Group_3__0 : rule__DateValueType__Group_3__0__Impl rule__DateValueType__Group_3__1 ;
    public final void rule__DateValueType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4701:1: ( rule__DateValueType__Group_3__0__Impl rule__DateValueType__Group_3__1 )
            // InternalQL.g:4702:2: rule__DateValueType__Group_3__0__Impl rule__DateValueType__Group_3__1
            {
            pushFollow(FOLLOW_35);
            rule__DateValueType__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DateValueType__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValueType__Group_3__0"


    // $ANTLR start "rule__DateValueType__Group_3__0__Impl"
    // InternalQL.g:4709:1: rule__DateValueType__Group_3__0__Impl : ( '{' ) ;
    public final void rule__DateValueType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4713:1: ( ( '{' ) )
            // InternalQL.g:4714:1: ( '{' )
            {
            // InternalQL.g:4714:1: ( '{' )
            // InternalQL.g:4715:2: '{'
            {
             before(grammarAccess.getDateValueTypeAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getDateValueTypeAccess().getLeftCurlyBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValueType__Group_3__0__Impl"


    // $ANTLR start "rule__DateValueType__Group_3__1"
    // InternalQL.g:4724:1: rule__DateValueType__Group_3__1 : rule__DateValueType__Group_3__1__Impl rule__DateValueType__Group_3__2 ;
    public final void rule__DateValueType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4728:1: ( rule__DateValueType__Group_3__1__Impl rule__DateValueType__Group_3__2 )
            // InternalQL.g:4729:2: rule__DateValueType__Group_3__1__Impl rule__DateValueType__Group_3__2
            {
            pushFollow(FOLLOW_35);
            rule__DateValueType__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DateValueType__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValueType__Group_3__1"


    // $ANTLR start "rule__DateValueType__Group_3__1__Impl"
    // InternalQL.g:4736:1: rule__DateValueType__Group_3__1__Impl : ( ( rule__DateValueType__Group_3_1__0 )? ) ;
    public final void rule__DateValueType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4740:1: ( ( ( rule__DateValueType__Group_3_1__0 )? ) )
            // InternalQL.g:4741:1: ( ( rule__DateValueType__Group_3_1__0 )? )
            {
            // InternalQL.g:4741:1: ( ( rule__DateValueType__Group_3_1__0 )? )
            // InternalQL.g:4742:2: ( rule__DateValueType__Group_3_1__0 )?
            {
             before(grammarAccess.getDateValueTypeAccess().getGroup_3_1()); 
            // InternalQL.g:4743:2: ( rule__DateValueType__Group_3_1__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==48) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalQL.g:4743:3: rule__DateValueType__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DateValueType__Group_3_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDateValueTypeAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValueType__Group_3__1__Impl"


    // $ANTLR start "rule__DateValueType__Group_3__2"
    // InternalQL.g:4751:1: rule__DateValueType__Group_3__2 : rule__DateValueType__Group_3__2__Impl ;
    public final void rule__DateValueType__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4755:1: ( rule__DateValueType__Group_3__2__Impl )
            // InternalQL.g:4756:2: rule__DateValueType__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DateValueType__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValueType__Group_3__2"


    // $ANTLR start "rule__DateValueType__Group_3__2__Impl"
    // InternalQL.g:4762:1: rule__DateValueType__Group_3__2__Impl : ( '}' ) ;
    public final void rule__DateValueType__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4766:1: ( ( '}' ) )
            // InternalQL.g:4767:1: ( '}' )
            {
            // InternalQL.g:4767:1: ( '}' )
            // InternalQL.g:4768:2: '}'
            {
             before(grammarAccess.getDateValueTypeAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getDateValueTypeAccess().getRightCurlyBracketKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValueType__Group_3__2__Impl"


    // $ANTLR start "rule__DateValueType__Group_3_1__0"
    // InternalQL.g:4778:1: rule__DateValueType__Group_3_1__0 : rule__DateValueType__Group_3_1__0__Impl rule__DateValueType__Group_3_1__1 ;
    public final void rule__DateValueType__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4782:1: ( rule__DateValueType__Group_3_1__0__Impl rule__DateValueType__Group_3_1__1 )
            // InternalQL.g:4783:2: rule__DateValueType__Group_3_1__0__Impl rule__DateValueType__Group_3_1__1
            {
            pushFollow(FOLLOW_25);
            rule__DateValueType__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DateValueType__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValueType__Group_3_1__0"


    // $ANTLR start "rule__DateValueType__Group_3_1__0__Impl"
    // InternalQL.g:4790:1: rule__DateValueType__Group_3_1__0__Impl : ( 'unit' ) ;
    public final void rule__DateValueType__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4794:1: ( ( 'unit' ) )
            // InternalQL.g:4795:1: ( 'unit' )
            {
            // InternalQL.g:4795:1: ( 'unit' )
            // InternalQL.g:4796:2: 'unit'
            {
             before(grammarAccess.getDateValueTypeAccess().getUnitKeyword_3_1_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getDateValueTypeAccess().getUnitKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValueType__Group_3_1__0__Impl"


    // $ANTLR start "rule__DateValueType__Group_3_1__1"
    // InternalQL.g:4805:1: rule__DateValueType__Group_3_1__1 : rule__DateValueType__Group_3_1__1__Impl ;
    public final void rule__DateValueType__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4809:1: ( rule__DateValueType__Group_3_1__1__Impl )
            // InternalQL.g:4810:2: rule__DateValueType__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DateValueType__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValueType__Group_3_1__1"


    // $ANTLR start "rule__DateValueType__Group_3_1__1__Impl"
    // InternalQL.g:4816:1: rule__DateValueType__Group_3_1__1__Impl : ( ( rule__DateValueType__UnitAssignment_3_1_1 ) ) ;
    public final void rule__DateValueType__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4820:1: ( ( ( rule__DateValueType__UnitAssignment_3_1_1 ) ) )
            // InternalQL.g:4821:1: ( ( rule__DateValueType__UnitAssignment_3_1_1 ) )
            {
            // InternalQL.g:4821:1: ( ( rule__DateValueType__UnitAssignment_3_1_1 ) )
            // InternalQL.g:4822:2: ( rule__DateValueType__UnitAssignment_3_1_1 )
            {
             before(grammarAccess.getDateValueTypeAccess().getUnitAssignment_3_1_1()); 
            // InternalQL.g:4823:2: ( rule__DateValueType__UnitAssignment_3_1_1 )
            // InternalQL.g:4823:3: rule__DateValueType__UnitAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DateValueType__UnitAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDateValueTypeAccess().getUnitAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValueType__Group_3_1__1__Impl"


    // $ANTLR start "rule__EnumerationValueType__Group__0"
    // InternalQL.g:4832:1: rule__EnumerationValueType__Group__0 : rule__EnumerationValueType__Group__0__Impl rule__EnumerationValueType__Group__1 ;
    public final void rule__EnumerationValueType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4836:1: ( rule__EnumerationValueType__Group__0__Impl rule__EnumerationValueType__Group__1 )
            // InternalQL.g:4837:2: rule__EnumerationValueType__Group__0__Impl rule__EnumerationValueType__Group__1
            {
            pushFollow(FOLLOW_43);
            rule__EnumerationValueType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group__0"


    // $ANTLR start "rule__EnumerationValueType__Group__0__Impl"
    // InternalQL.g:4844:1: rule__EnumerationValueType__Group__0__Impl : ( () ) ;
    public final void rule__EnumerationValueType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4848:1: ( ( () ) )
            // InternalQL.g:4849:1: ( () )
            {
            // InternalQL.g:4849:1: ( () )
            // InternalQL.g:4850:2: ()
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getEnumerationValueTypeAction_0()); 
            // InternalQL.g:4851:2: ()
            // InternalQL.g:4851:3: 
            {
            }

             after(grammarAccess.getEnumerationValueTypeAccess().getEnumerationValueTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group__0__Impl"


    // $ANTLR start "rule__EnumerationValueType__Group__1"
    // InternalQL.g:4859:1: rule__EnumerationValueType__Group__1 : rule__EnumerationValueType__Group__1__Impl rule__EnumerationValueType__Group__2 ;
    public final void rule__EnumerationValueType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4863:1: ( rule__EnumerationValueType__Group__1__Impl rule__EnumerationValueType__Group__2 )
            // InternalQL.g:4864:2: rule__EnumerationValueType__Group__1__Impl rule__EnumerationValueType__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__EnumerationValueType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group__1"


    // $ANTLR start "rule__EnumerationValueType__Group__1__Impl"
    // InternalQL.g:4871:1: rule__EnumerationValueType__Group__1__Impl : ( 'enumerationType' ) ;
    public final void rule__EnumerationValueType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4875:1: ( ( 'enumerationType' ) )
            // InternalQL.g:4876:1: ( 'enumerationType' )
            {
            // InternalQL.g:4876:1: ( 'enumerationType' )
            // InternalQL.g:4877:2: 'enumerationType'
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getEnumerationTypeKeyword_1()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getEnumerationValueTypeAccess().getEnumerationTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group__1__Impl"


    // $ANTLR start "rule__EnumerationValueType__Group__2"
    // InternalQL.g:4886:1: rule__EnumerationValueType__Group__2 : rule__EnumerationValueType__Group__2__Impl rule__EnumerationValueType__Group__3 ;
    public final void rule__EnumerationValueType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4890:1: ( rule__EnumerationValueType__Group__2__Impl rule__EnumerationValueType__Group__3 )
            // InternalQL.g:4891:2: rule__EnumerationValueType__Group__2__Impl rule__EnumerationValueType__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__EnumerationValueType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group__2"


    // $ANTLR start "rule__EnumerationValueType__Group__2__Impl"
    // InternalQL.g:4898:1: rule__EnumerationValueType__Group__2__Impl : ( ( rule__EnumerationValueType__NameAssignment_2 ) ) ;
    public final void rule__EnumerationValueType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4902:1: ( ( ( rule__EnumerationValueType__NameAssignment_2 ) ) )
            // InternalQL.g:4903:1: ( ( rule__EnumerationValueType__NameAssignment_2 ) )
            {
            // InternalQL.g:4903:1: ( ( rule__EnumerationValueType__NameAssignment_2 ) )
            // InternalQL.g:4904:2: ( rule__EnumerationValueType__NameAssignment_2 )
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getNameAssignment_2()); 
            // InternalQL.g:4905:2: ( rule__EnumerationValueType__NameAssignment_2 )
            // InternalQL.g:4905:3: rule__EnumerationValueType__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationValueTypeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group__2__Impl"


    // $ANTLR start "rule__EnumerationValueType__Group__3"
    // InternalQL.g:4913:1: rule__EnumerationValueType__Group__3 : rule__EnumerationValueType__Group__3__Impl ;
    public final void rule__EnumerationValueType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4917:1: ( rule__EnumerationValueType__Group__3__Impl )
            // InternalQL.g:4918:2: rule__EnumerationValueType__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group__3"


    // $ANTLR start "rule__EnumerationValueType__Group__3__Impl"
    // InternalQL.g:4924:1: rule__EnumerationValueType__Group__3__Impl : ( ( rule__EnumerationValueType__Group_3__0 )? ) ;
    public final void rule__EnumerationValueType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4928:1: ( ( ( rule__EnumerationValueType__Group_3__0 )? ) )
            // InternalQL.g:4929:1: ( ( rule__EnumerationValueType__Group_3__0 )? )
            {
            // InternalQL.g:4929:1: ( ( rule__EnumerationValueType__Group_3__0 )? )
            // InternalQL.g:4930:2: ( rule__EnumerationValueType__Group_3__0 )?
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getGroup_3()); 
            // InternalQL.g:4931:2: ( rule__EnumerationValueType__Group_3__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==39) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalQL.g:4931:3: rule__EnumerationValueType__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumerationValueType__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumerationValueTypeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group__3__Impl"


    // $ANTLR start "rule__EnumerationValueType__Group_3__0"
    // InternalQL.g:4940:1: rule__EnumerationValueType__Group_3__0 : rule__EnumerationValueType__Group_3__0__Impl rule__EnumerationValueType__Group_3__1 ;
    public final void rule__EnumerationValueType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4944:1: ( rule__EnumerationValueType__Group_3__0__Impl rule__EnumerationValueType__Group_3__1 )
            // InternalQL.g:4945:2: rule__EnumerationValueType__Group_3__0__Impl rule__EnumerationValueType__Group_3__1
            {
            pushFollow(FOLLOW_44);
            rule__EnumerationValueType__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_3__0"


    // $ANTLR start "rule__EnumerationValueType__Group_3__0__Impl"
    // InternalQL.g:4952:1: rule__EnumerationValueType__Group_3__0__Impl : ( '{' ) ;
    public final void rule__EnumerationValueType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4956:1: ( ( '{' ) )
            // InternalQL.g:4957:1: ( '{' )
            {
            // InternalQL.g:4957:1: ( '{' )
            // InternalQL.g:4958:2: '{'
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getEnumerationValueTypeAccess().getLeftCurlyBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_3__0__Impl"


    // $ANTLR start "rule__EnumerationValueType__Group_3__1"
    // InternalQL.g:4967:1: rule__EnumerationValueType__Group_3__1 : rule__EnumerationValueType__Group_3__1__Impl rule__EnumerationValueType__Group_3__2 ;
    public final void rule__EnumerationValueType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4971:1: ( rule__EnumerationValueType__Group_3__1__Impl rule__EnumerationValueType__Group_3__2 )
            // InternalQL.g:4972:2: rule__EnumerationValueType__Group_3__1__Impl rule__EnumerationValueType__Group_3__2
            {
            pushFollow(FOLLOW_44);
            rule__EnumerationValueType__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_3__1"


    // $ANTLR start "rule__EnumerationValueType__Group_3__1__Impl"
    // InternalQL.g:4979:1: rule__EnumerationValueType__Group_3__1__Impl : ( ( rule__EnumerationValueType__Group_3_1__0 )? ) ;
    public final void rule__EnumerationValueType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4983:1: ( ( ( rule__EnumerationValueType__Group_3_1__0 )? ) )
            // InternalQL.g:4984:1: ( ( rule__EnumerationValueType__Group_3_1__0 )? )
            {
            // InternalQL.g:4984:1: ( ( rule__EnumerationValueType__Group_3_1__0 )? )
            // InternalQL.g:4985:2: ( rule__EnumerationValueType__Group_3_1__0 )?
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getGroup_3_1()); 
            // InternalQL.g:4986:2: ( rule__EnumerationValueType__Group_3_1__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==48) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalQL.g:4986:3: rule__EnumerationValueType__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumerationValueType__Group_3_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumerationValueTypeAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_3__1__Impl"


    // $ANTLR start "rule__EnumerationValueType__Group_3__2"
    // InternalQL.g:4994:1: rule__EnumerationValueType__Group_3__2 : rule__EnumerationValueType__Group_3__2__Impl rule__EnumerationValueType__Group_3__3 ;
    public final void rule__EnumerationValueType__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4998:1: ( rule__EnumerationValueType__Group_3__2__Impl rule__EnumerationValueType__Group_3__3 )
            // InternalQL.g:4999:2: rule__EnumerationValueType__Group_3__2__Impl rule__EnumerationValueType__Group_3__3
            {
            pushFollow(FOLLOW_44);
            rule__EnumerationValueType__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_3__2"


    // $ANTLR start "rule__EnumerationValueType__Group_3__2__Impl"
    // InternalQL.g:5006:1: rule__EnumerationValueType__Group_3__2__Impl : ( ( rule__EnumerationValueType__Group_3_2__0 )? ) ;
    public final void rule__EnumerationValueType__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5010:1: ( ( ( rule__EnumerationValueType__Group_3_2__0 )? ) )
            // InternalQL.g:5011:1: ( ( rule__EnumerationValueType__Group_3_2__0 )? )
            {
            // InternalQL.g:5011:1: ( ( rule__EnumerationValueType__Group_3_2__0 )? )
            // InternalQL.g:5012:2: ( rule__EnumerationValueType__Group_3_2__0 )?
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getGroup_3_2()); 
            // InternalQL.g:5013:2: ( rule__EnumerationValueType__Group_3_2__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==56) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalQL.g:5013:3: rule__EnumerationValueType__Group_3_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumerationValueType__Group_3_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumerationValueTypeAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_3__2__Impl"


    // $ANTLR start "rule__EnumerationValueType__Group_3__3"
    // InternalQL.g:5021:1: rule__EnumerationValueType__Group_3__3 : rule__EnumerationValueType__Group_3__3__Impl ;
    public final void rule__EnumerationValueType__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5025:1: ( rule__EnumerationValueType__Group_3__3__Impl )
            // InternalQL.g:5026:2: rule__EnumerationValueType__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_3__3"


    // $ANTLR start "rule__EnumerationValueType__Group_3__3__Impl"
    // InternalQL.g:5032:1: rule__EnumerationValueType__Group_3__3__Impl : ( '}' ) ;
    public final void rule__EnumerationValueType__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5036:1: ( ( '}' ) )
            // InternalQL.g:5037:1: ( '}' )
            {
            // InternalQL.g:5037:1: ( '}' )
            // InternalQL.g:5038:2: '}'
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getEnumerationValueTypeAccess().getRightCurlyBracketKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_3__3__Impl"


    // $ANTLR start "rule__EnumerationValueType__Group_3_1__0"
    // InternalQL.g:5048:1: rule__EnumerationValueType__Group_3_1__0 : rule__EnumerationValueType__Group_3_1__0__Impl rule__EnumerationValueType__Group_3_1__1 ;
    public final void rule__EnumerationValueType__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5052:1: ( rule__EnumerationValueType__Group_3_1__0__Impl rule__EnumerationValueType__Group_3_1__1 )
            // InternalQL.g:5053:2: rule__EnumerationValueType__Group_3_1__0__Impl rule__EnumerationValueType__Group_3_1__1
            {
            pushFollow(FOLLOW_25);
            rule__EnumerationValueType__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_3_1__0"


    // $ANTLR start "rule__EnumerationValueType__Group_3_1__0__Impl"
    // InternalQL.g:5060:1: rule__EnumerationValueType__Group_3_1__0__Impl : ( 'unit' ) ;
    public final void rule__EnumerationValueType__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5064:1: ( ( 'unit' ) )
            // InternalQL.g:5065:1: ( 'unit' )
            {
            // InternalQL.g:5065:1: ( 'unit' )
            // InternalQL.g:5066:2: 'unit'
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getUnitKeyword_3_1_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getEnumerationValueTypeAccess().getUnitKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_3_1__0__Impl"


    // $ANTLR start "rule__EnumerationValueType__Group_3_1__1"
    // InternalQL.g:5075:1: rule__EnumerationValueType__Group_3_1__1 : rule__EnumerationValueType__Group_3_1__1__Impl ;
    public final void rule__EnumerationValueType__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5079:1: ( rule__EnumerationValueType__Group_3_1__1__Impl )
            // InternalQL.g:5080:2: rule__EnumerationValueType__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_3_1__1"


    // $ANTLR start "rule__EnumerationValueType__Group_3_1__1__Impl"
    // InternalQL.g:5086:1: rule__EnumerationValueType__Group_3_1__1__Impl : ( ( rule__EnumerationValueType__UnitAssignment_3_1_1 ) ) ;
    public final void rule__EnumerationValueType__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5090:1: ( ( ( rule__EnumerationValueType__UnitAssignment_3_1_1 ) ) )
            // InternalQL.g:5091:1: ( ( rule__EnumerationValueType__UnitAssignment_3_1_1 ) )
            {
            // InternalQL.g:5091:1: ( ( rule__EnumerationValueType__UnitAssignment_3_1_1 ) )
            // InternalQL.g:5092:2: ( rule__EnumerationValueType__UnitAssignment_3_1_1 )
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getUnitAssignment_3_1_1()); 
            // InternalQL.g:5093:2: ( rule__EnumerationValueType__UnitAssignment_3_1_1 )
            // InternalQL.g:5093:3: rule__EnumerationValueType__UnitAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__UnitAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationValueTypeAccess().getUnitAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_3_1__1__Impl"


    // $ANTLR start "rule__EnumerationValueType__Group_3_2__0"
    // InternalQL.g:5102:1: rule__EnumerationValueType__Group_3_2__0 : rule__EnumerationValueType__Group_3_2__0__Impl rule__EnumerationValueType__Group_3_2__1 ;
    public final void rule__EnumerationValueType__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5106:1: ( rule__EnumerationValueType__Group_3_2__0__Impl rule__EnumerationValueType__Group_3_2__1 )
            // InternalQL.g:5107:2: rule__EnumerationValueType__Group_3_2__0__Impl rule__EnumerationValueType__Group_3_2__1
            {
            pushFollow(FOLLOW_28);
            rule__EnumerationValueType__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_3_2__0"


    // $ANTLR start "rule__EnumerationValueType__Group_3_2__0__Impl"
    // InternalQL.g:5114:1: rule__EnumerationValueType__Group_3_2__0__Impl : ( 'literals' ) ;
    public final void rule__EnumerationValueType__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5118:1: ( ( 'literals' ) )
            // InternalQL.g:5119:1: ( 'literals' )
            {
            // InternalQL.g:5119:1: ( 'literals' )
            // InternalQL.g:5120:2: 'literals'
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getLiteralsKeyword_3_2_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getEnumerationValueTypeAccess().getLiteralsKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_3_2__0__Impl"


    // $ANTLR start "rule__EnumerationValueType__Group_3_2__1"
    // InternalQL.g:5129:1: rule__EnumerationValueType__Group_3_2__1 : rule__EnumerationValueType__Group_3_2__1__Impl rule__EnumerationValueType__Group_3_2__2 ;
    public final void rule__EnumerationValueType__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5133:1: ( rule__EnumerationValueType__Group_3_2__1__Impl rule__EnumerationValueType__Group_3_2__2 )
            // InternalQL.g:5134:2: rule__EnumerationValueType__Group_3_2__1__Impl rule__EnumerationValueType__Group_3_2__2
            {
            pushFollow(FOLLOW_25);
            rule__EnumerationValueType__Group_3_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group_3_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_3_2__1"


    // $ANTLR start "rule__EnumerationValueType__Group_3_2__1__Impl"
    // InternalQL.g:5141:1: rule__EnumerationValueType__Group_3_2__1__Impl : ( '{' ) ;
    public final void rule__EnumerationValueType__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5145:1: ( ( '{' ) )
            // InternalQL.g:5146:1: ( '{' )
            {
            // InternalQL.g:5146:1: ( '{' )
            // InternalQL.g:5147:2: '{'
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getLeftCurlyBracketKeyword_3_2_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getEnumerationValueTypeAccess().getLeftCurlyBracketKeyword_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_3_2__1__Impl"


    // $ANTLR start "rule__EnumerationValueType__Group_3_2__2"
    // InternalQL.g:5156:1: rule__EnumerationValueType__Group_3_2__2 : rule__EnumerationValueType__Group_3_2__2__Impl rule__EnumerationValueType__Group_3_2__3 ;
    public final void rule__EnumerationValueType__Group_3_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5160:1: ( rule__EnumerationValueType__Group_3_2__2__Impl rule__EnumerationValueType__Group_3_2__3 )
            // InternalQL.g:5161:2: rule__EnumerationValueType__Group_3_2__2__Impl rule__EnumerationValueType__Group_3_2__3
            {
            pushFollow(FOLLOW_45);
            rule__EnumerationValueType__Group_3_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group_3_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_3_2__2"


    // $ANTLR start "rule__EnumerationValueType__Group_3_2__2__Impl"
    // InternalQL.g:5168:1: rule__EnumerationValueType__Group_3_2__2__Impl : ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_2 ) ) ;
    public final void rule__EnumerationValueType__Group_3_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5172:1: ( ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_2 ) ) )
            // InternalQL.g:5173:1: ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_2 ) )
            {
            // InternalQL.g:5173:1: ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_2 ) )
            // InternalQL.g:5174:2: ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_2 )
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getEnumerationLiteralsAssignment_3_2_2()); 
            // InternalQL.g:5175:2: ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_2 )
            // InternalQL.g:5175:3: rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_2
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_2();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationValueTypeAccess().getEnumerationLiteralsAssignment_3_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_3_2__2__Impl"


    // $ANTLR start "rule__EnumerationValueType__Group_3_2__3"
    // InternalQL.g:5183:1: rule__EnumerationValueType__Group_3_2__3 : rule__EnumerationValueType__Group_3_2__3__Impl rule__EnumerationValueType__Group_3_2__4 ;
    public final void rule__EnumerationValueType__Group_3_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5187:1: ( rule__EnumerationValueType__Group_3_2__3__Impl rule__EnumerationValueType__Group_3_2__4 )
            // InternalQL.g:5188:2: rule__EnumerationValueType__Group_3_2__3__Impl rule__EnumerationValueType__Group_3_2__4
            {
            pushFollow(FOLLOW_45);
            rule__EnumerationValueType__Group_3_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group_3_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_3_2__3"


    // $ANTLR start "rule__EnumerationValueType__Group_3_2__3__Impl"
    // InternalQL.g:5195:1: rule__EnumerationValueType__Group_3_2__3__Impl : ( ( rule__EnumerationValueType__Group_3_2_3__0 )* ) ;
    public final void rule__EnumerationValueType__Group_3_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5199:1: ( ( ( rule__EnumerationValueType__Group_3_2_3__0 )* ) )
            // InternalQL.g:5200:1: ( ( rule__EnumerationValueType__Group_3_2_3__0 )* )
            {
            // InternalQL.g:5200:1: ( ( rule__EnumerationValueType__Group_3_2_3__0 )* )
            // InternalQL.g:5201:2: ( rule__EnumerationValueType__Group_3_2_3__0 )*
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getGroup_3_2_3()); 
            // InternalQL.g:5202:2: ( rule__EnumerationValueType__Group_3_2_3__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==57) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalQL.g:5202:3: rule__EnumerationValueType__Group_3_2_3__0
            	    {
            	    pushFollow(FOLLOW_46);
            	    rule__EnumerationValueType__Group_3_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

             after(grammarAccess.getEnumerationValueTypeAccess().getGroup_3_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_3_2__3__Impl"


    // $ANTLR start "rule__EnumerationValueType__Group_3_2__4"
    // InternalQL.g:5210:1: rule__EnumerationValueType__Group_3_2__4 : rule__EnumerationValueType__Group_3_2__4__Impl ;
    public final void rule__EnumerationValueType__Group_3_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5214:1: ( rule__EnumerationValueType__Group_3_2__4__Impl )
            // InternalQL.g:5215:2: rule__EnumerationValueType__Group_3_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group_3_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_3_2__4"


    // $ANTLR start "rule__EnumerationValueType__Group_3_2__4__Impl"
    // InternalQL.g:5221:1: rule__EnumerationValueType__Group_3_2__4__Impl : ( '}' ) ;
    public final void rule__EnumerationValueType__Group_3_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5225:1: ( ( '}' ) )
            // InternalQL.g:5226:1: ( '}' )
            {
            // InternalQL.g:5226:1: ( '}' )
            // InternalQL.g:5227:2: '}'
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getRightCurlyBracketKeyword_3_2_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getEnumerationValueTypeAccess().getRightCurlyBracketKeyword_3_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_3_2__4__Impl"


    // $ANTLR start "rule__EnumerationValueType__Group_3_2_3__0"
    // InternalQL.g:5237:1: rule__EnumerationValueType__Group_3_2_3__0 : rule__EnumerationValueType__Group_3_2_3__0__Impl rule__EnumerationValueType__Group_3_2_3__1 ;
    public final void rule__EnumerationValueType__Group_3_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5241:1: ( rule__EnumerationValueType__Group_3_2_3__0__Impl rule__EnumerationValueType__Group_3_2_3__1 )
            // InternalQL.g:5242:2: rule__EnumerationValueType__Group_3_2_3__0__Impl rule__EnumerationValueType__Group_3_2_3__1
            {
            pushFollow(FOLLOW_25);
            rule__EnumerationValueType__Group_3_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group_3_2_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_3_2_3__0"


    // $ANTLR start "rule__EnumerationValueType__Group_3_2_3__0__Impl"
    // InternalQL.g:5249:1: rule__EnumerationValueType__Group_3_2_3__0__Impl : ( ',' ) ;
    public final void rule__EnumerationValueType__Group_3_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5253:1: ( ( ',' ) )
            // InternalQL.g:5254:1: ( ',' )
            {
            // InternalQL.g:5254:1: ( ',' )
            // InternalQL.g:5255:2: ','
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getCommaKeyword_3_2_3_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getEnumerationValueTypeAccess().getCommaKeyword_3_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_3_2_3__0__Impl"


    // $ANTLR start "rule__EnumerationValueType__Group_3_2_3__1"
    // InternalQL.g:5264:1: rule__EnumerationValueType__Group_3_2_3__1 : rule__EnumerationValueType__Group_3_2_3__1__Impl ;
    public final void rule__EnumerationValueType__Group_3_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5268:1: ( rule__EnumerationValueType__Group_3_2_3__1__Impl )
            // InternalQL.g:5269:2: rule__EnumerationValueType__Group_3_2_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group_3_2_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_3_2_3__1"


    // $ANTLR start "rule__EnumerationValueType__Group_3_2_3__1__Impl"
    // InternalQL.g:5275:1: rule__EnumerationValueType__Group_3_2_3__1__Impl : ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_3_1 ) ) ;
    public final void rule__EnumerationValueType__Group_3_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5279:1: ( ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_3_1 ) ) )
            // InternalQL.g:5280:1: ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_3_1 ) )
            {
            // InternalQL.g:5280:1: ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_3_1 ) )
            // InternalQL.g:5281:2: ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_3_1 )
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getEnumerationLiteralsAssignment_3_2_3_1()); 
            // InternalQL.g:5282:2: ( rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_3_1 )
            // InternalQL.g:5282:3: rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_3_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationValueTypeAccess().getEnumerationLiteralsAssignment_3_2_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_3_2_3__1__Impl"


    // $ANTLR start "rule__StringValueType__Group__0"
    // InternalQL.g:5291:1: rule__StringValueType__Group__0 : rule__StringValueType__Group__0__Impl rule__StringValueType__Group__1 ;
    public final void rule__StringValueType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5295:1: ( rule__StringValueType__Group__0__Impl rule__StringValueType__Group__1 )
            // InternalQL.g:5296:2: rule__StringValueType__Group__0__Impl rule__StringValueType__Group__1
            {
            pushFollow(FOLLOW_47);
            rule__StringValueType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringValueType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueType__Group__0"


    // $ANTLR start "rule__StringValueType__Group__0__Impl"
    // InternalQL.g:5303:1: rule__StringValueType__Group__0__Impl : ( () ) ;
    public final void rule__StringValueType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5307:1: ( ( () ) )
            // InternalQL.g:5308:1: ( () )
            {
            // InternalQL.g:5308:1: ( () )
            // InternalQL.g:5309:2: ()
            {
             before(grammarAccess.getStringValueTypeAccess().getStringValueTypeAction_0()); 
            // InternalQL.g:5310:2: ()
            // InternalQL.g:5310:3: 
            {
            }

             after(grammarAccess.getStringValueTypeAccess().getStringValueTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueType__Group__0__Impl"


    // $ANTLR start "rule__StringValueType__Group__1"
    // InternalQL.g:5318:1: rule__StringValueType__Group__1 : rule__StringValueType__Group__1__Impl rule__StringValueType__Group__2 ;
    public final void rule__StringValueType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5322:1: ( rule__StringValueType__Group__1__Impl rule__StringValueType__Group__2 )
            // InternalQL.g:5323:2: rule__StringValueType__Group__1__Impl rule__StringValueType__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__StringValueType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringValueType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueType__Group__1"


    // $ANTLR start "rule__StringValueType__Group__1__Impl"
    // InternalQL.g:5330:1: rule__StringValueType__Group__1__Impl : ( 'StringValueType' ) ;
    public final void rule__StringValueType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5334:1: ( ( 'StringValueType' ) )
            // InternalQL.g:5335:1: ( 'StringValueType' )
            {
            // InternalQL.g:5335:1: ( 'StringValueType' )
            // InternalQL.g:5336:2: 'StringValueType'
            {
             before(grammarAccess.getStringValueTypeAccess().getStringValueTypeKeyword_1()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getStringValueTypeAccess().getStringValueTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueType__Group__1__Impl"


    // $ANTLR start "rule__StringValueType__Group__2"
    // InternalQL.g:5345:1: rule__StringValueType__Group__2 : rule__StringValueType__Group__2__Impl rule__StringValueType__Group__3 ;
    public final void rule__StringValueType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5349:1: ( rule__StringValueType__Group__2__Impl rule__StringValueType__Group__3 )
            // InternalQL.g:5350:2: rule__StringValueType__Group__2__Impl rule__StringValueType__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__StringValueType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringValueType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueType__Group__2"


    // $ANTLR start "rule__StringValueType__Group__2__Impl"
    // InternalQL.g:5357:1: rule__StringValueType__Group__2__Impl : ( ( rule__StringValueType__NameAssignment_2 ) ) ;
    public final void rule__StringValueType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5361:1: ( ( ( rule__StringValueType__NameAssignment_2 ) ) )
            // InternalQL.g:5362:1: ( ( rule__StringValueType__NameAssignment_2 ) )
            {
            // InternalQL.g:5362:1: ( ( rule__StringValueType__NameAssignment_2 ) )
            // InternalQL.g:5363:2: ( rule__StringValueType__NameAssignment_2 )
            {
             before(grammarAccess.getStringValueTypeAccess().getNameAssignment_2()); 
            // InternalQL.g:5364:2: ( rule__StringValueType__NameAssignment_2 )
            // InternalQL.g:5364:3: rule__StringValueType__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__StringValueType__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStringValueTypeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueType__Group__2__Impl"


    // $ANTLR start "rule__StringValueType__Group__3"
    // InternalQL.g:5372:1: rule__StringValueType__Group__3 : rule__StringValueType__Group__3__Impl ;
    public final void rule__StringValueType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5376:1: ( rule__StringValueType__Group__3__Impl )
            // InternalQL.g:5377:2: rule__StringValueType__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringValueType__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueType__Group__3"


    // $ANTLR start "rule__StringValueType__Group__3__Impl"
    // InternalQL.g:5383:1: rule__StringValueType__Group__3__Impl : ( ( rule__StringValueType__Group_3__0 )? ) ;
    public final void rule__StringValueType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5387:1: ( ( ( rule__StringValueType__Group_3__0 )? ) )
            // InternalQL.g:5388:1: ( ( rule__StringValueType__Group_3__0 )? )
            {
            // InternalQL.g:5388:1: ( ( rule__StringValueType__Group_3__0 )? )
            // InternalQL.g:5389:2: ( rule__StringValueType__Group_3__0 )?
            {
             before(grammarAccess.getStringValueTypeAccess().getGroup_3()); 
            // InternalQL.g:5390:2: ( rule__StringValueType__Group_3__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==39) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalQL.g:5390:3: rule__StringValueType__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringValueType__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringValueTypeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueType__Group__3__Impl"


    // $ANTLR start "rule__StringValueType__Group_3__0"
    // InternalQL.g:5399:1: rule__StringValueType__Group_3__0 : rule__StringValueType__Group_3__0__Impl rule__StringValueType__Group_3__1 ;
    public final void rule__StringValueType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5403:1: ( rule__StringValueType__Group_3__0__Impl rule__StringValueType__Group_3__1 )
            // InternalQL.g:5404:2: rule__StringValueType__Group_3__0__Impl rule__StringValueType__Group_3__1
            {
            pushFollow(FOLLOW_35);
            rule__StringValueType__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringValueType__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueType__Group_3__0"


    // $ANTLR start "rule__StringValueType__Group_3__0__Impl"
    // InternalQL.g:5411:1: rule__StringValueType__Group_3__0__Impl : ( '{' ) ;
    public final void rule__StringValueType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5415:1: ( ( '{' ) )
            // InternalQL.g:5416:1: ( '{' )
            {
            // InternalQL.g:5416:1: ( '{' )
            // InternalQL.g:5417:2: '{'
            {
             before(grammarAccess.getStringValueTypeAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getStringValueTypeAccess().getLeftCurlyBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueType__Group_3__0__Impl"


    // $ANTLR start "rule__StringValueType__Group_3__1"
    // InternalQL.g:5426:1: rule__StringValueType__Group_3__1 : rule__StringValueType__Group_3__1__Impl rule__StringValueType__Group_3__2 ;
    public final void rule__StringValueType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5430:1: ( rule__StringValueType__Group_3__1__Impl rule__StringValueType__Group_3__2 )
            // InternalQL.g:5431:2: rule__StringValueType__Group_3__1__Impl rule__StringValueType__Group_3__2
            {
            pushFollow(FOLLOW_35);
            rule__StringValueType__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringValueType__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueType__Group_3__1"


    // $ANTLR start "rule__StringValueType__Group_3__1__Impl"
    // InternalQL.g:5438:1: rule__StringValueType__Group_3__1__Impl : ( ( rule__StringValueType__Group_3_1__0 )? ) ;
    public final void rule__StringValueType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5442:1: ( ( ( rule__StringValueType__Group_3_1__0 )? ) )
            // InternalQL.g:5443:1: ( ( rule__StringValueType__Group_3_1__0 )? )
            {
            // InternalQL.g:5443:1: ( ( rule__StringValueType__Group_3_1__0 )? )
            // InternalQL.g:5444:2: ( rule__StringValueType__Group_3_1__0 )?
            {
             before(grammarAccess.getStringValueTypeAccess().getGroup_3_1()); 
            // InternalQL.g:5445:2: ( rule__StringValueType__Group_3_1__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==48) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalQL.g:5445:3: rule__StringValueType__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringValueType__Group_3_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringValueTypeAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueType__Group_3__1__Impl"


    // $ANTLR start "rule__StringValueType__Group_3__2"
    // InternalQL.g:5453:1: rule__StringValueType__Group_3__2 : rule__StringValueType__Group_3__2__Impl ;
    public final void rule__StringValueType__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5457:1: ( rule__StringValueType__Group_3__2__Impl )
            // InternalQL.g:5458:2: rule__StringValueType__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringValueType__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueType__Group_3__2"


    // $ANTLR start "rule__StringValueType__Group_3__2__Impl"
    // InternalQL.g:5464:1: rule__StringValueType__Group_3__2__Impl : ( '}' ) ;
    public final void rule__StringValueType__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5468:1: ( ( '}' ) )
            // InternalQL.g:5469:1: ( '}' )
            {
            // InternalQL.g:5469:1: ( '}' )
            // InternalQL.g:5470:2: '}'
            {
             before(grammarAccess.getStringValueTypeAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getStringValueTypeAccess().getRightCurlyBracketKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueType__Group_3__2__Impl"


    // $ANTLR start "rule__StringValueType__Group_3_1__0"
    // InternalQL.g:5480:1: rule__StringValueType__Group_3_1__0 : rule__StringValueType__Group_3_1__0__Impl rule__StringValueType__Group_3_1__1 ;
    public final void rule__StringValueType__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5484:1: ( rule__StringValueType__Group_3_1__0__Impl rule__StringValueType__Group_3_1__1 )
            // InternalQL.g:5485:2: rule__StringValueType__Group_3_1__0__Impl rule__StringValueType__Group_3_1__1
            {
            pushFollow(FOLLOW_25);
            rule__StringValueType__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringValueType__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueType__Group_3_1__0"


    // $ANTLR start "rule__StringValueType__Group_3_1__0__Impl"
    // InternalQL.g:5492:1: rule__StringValueType__Group_3_1__0__Impl : ( 'unit' ) ;
    public final void rule__StringValueType__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5496:1: ( ( 'unit' ) )
            // InternalQL.g:5497:1: ( 'unit' )
            {
            // InternalQL.g:5497:1: ( 'unit' )
            // InternalQL.g:5498:2: 'unit'
            {
             before(grammarAccess.getStringValueTypeAccess().getUnitKeyword_3_1_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getStringValueTypeAccess().getUnitKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueType__Group_3_1__0__Impl"


    // $ANTLR start "rule__StringValueType__Group_3_1__1"
    // InternalQL.g:5507:1: rule__StringValueType__Group_3_1__1 : rule__StringValueType__Group_3_1__1__Impl ;
    public final void rule__StringValueType__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5511:1: ( rule__StringValueType__Group_3_1__1__Impl )
            // InternalQL.g:5512:2: rule__StringValueType__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringValueType__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueType__Group_3_1__1"


    // $ANTLR start "rule__StringValueType__Group_3_1__1__Impl"
    // InternalQL.g:5518:1: rule__StringValueType__Group_3_1__1__Impl : ( ( rule__StringValueType__UnitAssignment_3_1_1 ) ) ;
    public final void rule__StringValueType__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5522:1: ( ( ( rule__StringValueType__UnitAssignment_3_1_1 ) ) )
            // InternalQL.g:5523:1: ( ( rule__StringValueType__UnitAssignment_3_1_1 ) )
            {
            // InternalQL.g:5523:1: ( ( rule__StringValueType__UnitAssignment_3_1_1 ) )
            // InternalQL.g:5524:2: ( rule__StringValueType__UnitAssignment_3_1_1 )
            {
             before(grammarAccess.getStringValueTypeAccess().getUnitAssignment_3_1_1()); 
            // InternalQL.g:5525:2: ( rule__StringValueType__UnitAssignment_3_1_1 )
            // InternalQL.g:5525:3: rule__StringValueType__UnitAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__StringValueType__UnitAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getStringValueTypeAccess().getUnitAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueType__Group_3_1__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalQL.g:5534:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5538:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalQL.g:5539:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalQL.g:5546:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5550:1: ( ( ( '-' )? ) )
            // InternalQL.g:5551:1: ( ( '-' )? )
            {
            // InternalQL.g:5551:1: ( ( '-' )? )
            // InternalQL.g:5552:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalQL.g:5553:2: ( '-' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==29) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalQL.g:5553:3: '-'
                    {
                    match(input,29,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalQL.g:5561:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5565:1: ( rule__EInt__Group__1__Impl )
            // InternalQL.g:5566:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalQL.g:5572:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5576:1: ( ( RULE_INT ) )
            // InternalQL.g:5577:1: ( RULE_INT )
            {
            // InternalQL.g:5577:1: ( RULE_INT )
            // InternalQL.g:5578:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__EnumerationLiteral__Group__0"
    // InternalQL.g:5588:1: rule__EnumerationLiteral__Group__0 : rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1 ;
    public final void rule__EnumerationLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5592:1: ( rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1 )
            // InternalQL.g:5593:2: rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__EnumerationLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group__0"


    // $ANTLR start "rule__EnumerationLiteral__Group__0__Impl"
    // InternalQL.g:5600:1: rule__EnumerationLiteral__Group__0__Impl : ( () ) ;
    public final void rule__EnumerationLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5604:1: ( ( () ) )
            // InternalQL.g:5605:1: ( () )
            {
            // InternalQL.g:5605:1: ( () )
            // InternalQL.g:5606:2: ()
            {
             before(grammarAccess.getEnumerationLiteralAccess().getEnumerationLiteralAction_0()); 
            // InternalQL.g:5607:2: ()
            // InternalQL.g:5607:3: 
            {
            }

             after(grammarAccess.getEnumerationLiteralAccess().getEnumerationLiteralAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group__0__Impl"


    // $ANTLR start "rule__EnumerationLiteral__Group__1"
    // InternalQL.g:5615:1: rule__EnumerationLiteral__Group__1 : rule__EnumerationLiteral__Group__1__Impl ;
    public final void rule__EnumerationLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5619:1: ( rule__EnumerationLiteral__Group__1__Impl )
            // InternalQL.g:5620:2: rule__EnumerationLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationLiteral__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group__1"


    // $ANTLR start "rule__EnumerationLiteral__Group__1__Impl"
    // InternalQL.g:5626:1: rule__EnumerationLiteral__Group__1__Impl : ( ( rule__EnumerationLiteral__NameAssignment_1 ) ) ;
    public final void rule__EnumerationLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5630:1: ( ( ( rule__EnumerationLiteral__NameAssignment_1 ) ) )
            // InternalQL.g:5631:1: ( ( rule__EnumerationLiteral__NameAssignment_1 ) )
            {
            // InternalQL.g:5631:1: ( ( rule__EnumerationLiteral__NameAssignment_1 ) )
            // InternalQL.g:5632:2: ( rule__EnumerationLiteral__NameAssignment_1 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getNameAssignment_1()); 
            // InternalQL.g:5633:2: ( rule__EnumerationLiteral__NameAssignment_1 )
            // InternalQL.g:5633:3: rule__EnumerationLiteral__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationLiteral__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationLiteralAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group__1__Impl"


    // $ANTLR start "rule__IntegerValue__Group__0"
    // InternalQL.g:5642:1: rule__IntegerValue__Group__0 : rule__IntegerValue__Group__0__Impl rule__IntegerValue__Group__1 ;
    public final void rule__IntegerValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5646:1: ( rule__IntegerValue__Group__0__Impl rule__IntegerValue__Group__1 )
            // InternalQL.g:5647:2: rule__IntegerValue__Group__0__Impl rule__IntegerValue__Group__1
            {
            pushFollow(FOLLOW_48);
            rule__IntegerValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValue__Group__0"


    // $ANTLR start "rule__IntegerValue__Group__0__Impl"
    // InternalQL.g:5654:1: rule__IntegerValue__Group__0__Impl : ( () ) ;
    public final void rule__IntegerValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5658:1: ( ( () ) )
            // InternalQL.g:5659:1: ( () )
            {
            // InternalQL.g:5659:1: ( () )
            // InternalQL.g:5660:2: ()
            {
             before(grammarAccess.getIntegerValueAccess().getIntegerValueAction_0()); 
            // InternalQL.g:5661:2: ()
            // InternalQL.g:5661:3: 
            {
            }

             after(grammarAccess.getIntegerValueAccess().getIntegerValueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValue__Group__0__Impl"


    // $ANTLR start "rule__IntegerValue__Group__1"
    // InternalQL.g:5669:1: rule__IntegerValue__Group__1 : rule__IntegerValue__Group__1__Impl rule__IntegerValue__Group__2 ;
    public final void rule__IntegerValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5673:1: ( rule__IntegerValue__Group__1__Impl rule__IntegerValue__Group__2 )
            // InternalQL.g:5674:2: rule__IntegerValue__Group__1__Impl rule__IntegerValue__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__IntegerValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerValue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValue__Group__1"


    // $ANTLR start "rule__IntegerValue__Group__1__Impl"
    // InternalQL.g:5681:1: rule__IntegerValue__Group__1__Impl : ( 'IntegerValue' ) ;
    public final void rule__IntegerValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5685:1: ( ( 'IntegerValue' ) )
            // InternalQL.g:5686:1: ( 'IntegerValue' )
            {
            // InternalQL.g:5686:1: ( 'IntegerValue' )
            // InternalQL.g:5687:2: 'IntegerValue'
            {
             before(grammarAccess.getIntegerValueAccess().getIntegerValueKeyword_1()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getIntegerValueAccess().getIntegerValueKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValue__Group__1__Impl"


    // $ANTLR start "rule__IntegerValue__Group__2"
    // InternalQL.g:5696:1: rule__IntegerValue__Group__2 : rule__IntegerValue__Group__2__Impl rule__IntegerValue__Group__3 ;
    public final void rule__IntegerValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5700:1: ( rule__IntegerValue__Group__2__Impl rule__IntegerValue__Group__3 )
            // InternalQL.g:5701:2: rule__IntegerValue__Group__2__Impl rule__IntegerValue__Group__3
            {
            pushFollow(FOLLOW_49);
            rule__IntegerValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerValue__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValue__Group__2"


    // $ANTLR start "rule__IntegerValue__Group__2__Impl"
    // InternalQL.g:5708:1: rule__IntegerValue__Group__2__Impl : ( '{' ) ;
    public final void rule__IntegerValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5712:1: ( ( '{' ) )
            // InternalQL.g:5713:1: ( '{' )
            {
            // InternalQL.g:5713:1: ( '{' )
            // InternalQL.g:5714:2: '{'
            {
             before(grammarAccess.getIntegerValueAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getIntegerValueAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValue__Group__2__Impl"


    // $ANTLR start "rule__IntegerValue__Group__3"
    // InternalQL.g:5723:1: rule__IntegerValue__Group__3 : rule__IntegerValue__Group__3__Impl rule__IntegerValue__Group__4 ;
    public final void rule__IntegerValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5727:1: ( rule__IntegerValue__Group__3__Impl rule__IntegerValue__Group__4 )
            // InternalQL.g:5728:2: rule__IntegerValue__Group__3__Impl rule__IntegerValue__Group__4
            {
            pushFollow(FOLLOW_49);
            rule__IntegerValue__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerValue__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValue__Group__3"


    // $ANTLR start "rule__IntegerValue__Group__3__Impl"
    // InternalQL.g:5735:1: rule__IntegerValue__Group__3__Impl : ( ( rule__IntegerValue__Group_3__0 )? ) ;
    public final void rule__IntegerValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5739:1: ( ( ( rule__IntegerValue__Group_3__0 )? ) )
            // InternalQL.g:5740:1: ( ( rule__IntegerValue__Group_3__0 )? )
            {
            // InternalQL.g:5740:1: ( ( rule__IntegerValue__Group_3__0 )? )
            // InternalQL.g:5741:2: ( rule__IntegerValue__Group_3__0 )?
            {
             before(grammarAccess.getIntegerValueAccess().getGroup_3()); 
            // InternalQL.g:5742:2: ( rule__IntegerValue__Group_3__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==60) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalQL.g:5742:3: rule__IntegerValue__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IntegerValue__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntegerValueAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValue__Group__3__Impl"


    // $ANTLR start "rule__IntegerValue__Group__4"
    // InternalQL.g:5750:1: rule__IntegerValue__Group__4 : rule__IntegerValue__Group__4__Impl ;
    public final void rule__IntegerValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5754:1: ( rule__IntegerValue__Group__4__Impl )
            // InternalQL.g:5755:2: rule__IntegerValue__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntegerValue__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValue__Group__4"


    // $ANTLR start "rule__IntegerValue__Group__4__Impl"
    // InternalQL.g:5761:1: rule__IntegerValue__Group__4__Impl : ( '}' ) ;
    public final void rule__IntegerValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5765:1: ( ( '}' ) )
            // InternalQL.g:5766:1: ( '}' )
            {
            // InternalQL.g:5766:1: ( '}' )
            // InternalQL.g:5767:2: '}'
            {
             before(grammarAccess.getIntegerValueAccess().getRightCurlyBracketKeyword_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getIntegerValueAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValue__Group__4__Impl"


    // $ANTLR start "rule__IntegerValue__Group_3__0"
    // InternalQL.g:5777:1: rule__IntegerValue__Group_3__0 : rule__IntegerValue__Group_3__0__Impl rule__IntegerValue__Group_3__1 ;
    public final void rule__IntegerValue__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5781:1: ( rule__IntegerValue__Group_3__0__Impl rule__IntegerValue__Group_3__1 )
            // InternalQL.g:5782:2: rule__IntegerValue__Group_3__0__Impl rule__IntegerValue__Group_3__1
            {
            pushFollow(FOLLOW_40);
            rule__IntegerValue__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerValue__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValue__Group_3__0"


    // $ANTLR start "rule__IntegerValue__Group_3__0__Impl"
    // InternalQL.g:5789:1: rule__IntegerValue__Group_3__0__Impl : ( 'intValue' ) ;
    public final void rule__IntegerValue__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5793:1: ( ( 'intValue' ) )
            // InternalQL.g:5794:1: ( 'intValue' )
            {
            // InternalQL.g:5794:1: ( 'intValue' )
            // InternalQL.g:5795:2: 'intValue'
            {
             before(grammarAccess.getIntegerValueAccess().getIntValueKeyword_3_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getIntegerValueAccess().getIntValueKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValue__Group_3__0__Impl"


    // $ANTLR start "rule__IntegerValue__Group_3__1"
    // InternalQL.g:5804:1: rule__IntegerValue__Group_3__1 : rule__IntegerValue__Group_3__1__Impl ;
    public final void rule__IntegerValue__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5808:1: ( rule__IntegerValue__Group_3__1__Impl )
            // InternalQL.g:5809:2: rule__IntegerValue__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntegerValue__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValue__Group_3__1"


    // $ANTLR start "rule__IntegerValue__Group_3__1__Impl"
    // InternalQL.g:5815:1: rule__IntegerValue__Group_3__1__Impl : ( ( rule__IntegerValue__IntValueAssignment_3_1 ) ) ;
    public final void rule__IntegerValue__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5819:1: ( ( ( rule__IntegerValue__IntValueAssignment_3_1 ) ) )
            // InternalQL.g:5820:1: ( ( rule__IntegerValue__IntValueAssignment_3_1 ) )
            {
            // InternalQL.g:5820:1: ( ( rule__IntegerValue__IntValueAssignment_3_1 ) )
            // InternalQL.g:5821:2: ( rule__IntegerValue__IntValueAssignment_3_1 )
            {
             before(grammarAccess.getIntegerValueAccess().getIntValueAssignment_3_1()); 
            // InternalQL.g:5822:2: ( rule__IntegerValue__IntValueAssignment_3_1 )
            // InternalQL.g:5822:3: rule__IntegerValue__IntValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__IntegerValue__IntValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getIntegerValueAccess().getIntValueAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValue__Group_3__1__Impl"


    // $ANTLR start "rule__StringValue__Group__0"
    // InternalQL.g:5831:1: rule__StringValue__Group__0 : rule__StringValue__Group__0__Impl rule__StringValue__Group__1 ;
    public final void rule__StringValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5835:1: ( rule__StringValue__Group__0__Impl rule__StringValue__Group__1 )
            // InternalQL.g:5836:2: rule__StringValue__Group__0__Impl rule__StringValue__Group__1
            {
            pushFollow(FOLLOW_50);
            rule__StringValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Group__0"


    // $ANTLR start "rule__StringValue__Group__0__Impl"
    // InternalQL.g:5843:1: rule__StringValue__Group__0__Impl : ( () ) ;
    public final void rule__StringValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5847:1: ( ( () ) )
            // InternalQL.g:5848:1: ( () )
            {
            // InternalQL.g:5848:1: ( () )
            // InternalQL.g:5849:2: ()
            {
             before(grammarAccess.getStringValueAccess().getStringValueAction_0()); 
            // InternalQL.g:5850:2: ()
            // InternalQL.g:5850:3: 
            {
            }

             after(grammarAccess.getStringValueAccess().getStringValueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Group__0__Impl"


    // $ANTLR start "rule__StringValue__Group__1"
    // InternalQL.g:5858:1: rule__StringValue__Group__1 : rule__StringValue__Group__1__Impl rule__StringValue__Group__2 ;
    public final void rule__StringValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5862:1: ( rule__StringValue__Group__1__Impl rule__StringValue__Group__2 )
            // InternalQL.g:5863:2: rule__StringValue__Group__1__Impl rule__StringValue__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__StringValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringValue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Group__1"


    // $ANTLR start "rule__StringValue__Group__1__Impl"
    // InternalQL.g:5870:1: rule__StringValue__Group__1__Impl : ( 'StringValue' ) ;
    public final void rule__StringValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5874:1: ( ( 'StringValue' ) )
            // InternalQL.g:5875:1: ( 'StringValue' )
            {
            // InternalQL.g:5875:1: ( 'StringValue' )
            // InternalQL.g:5876:2: 'StringValue'
            {
             before(grammarAccess.getStringValueAccess().getStringValueKeyword_1()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getStringValueAccess().getStringValueKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Group__1__Impl"


    // $ANTLR start "rule__StringValue__Group__2"
    // InternalQL.g:5885:1: rule__StringValue__Group__2 : rule__StringValue__Group__2__Impl rule__StringValue__Group__3 ;
    public final void rule__StringValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5889:1: ( rule__StringValue__Group__2__Impl rule__StringValue__Group__3 )
            // InternalQL.g:5890:2: rule__StringValue__Group__2__Impl rule__StringValue__Group__3
            {
            pushFollow(FOLLOW_51);
            rule__StringValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringValue__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Group__2"


    // $ANTLR start "rule__StringValue__Group__2__Impl"
    // InternalQL.g:5897:1: rule__StringValue__Group__2__Impl : ( '{' ) ;
    public final void rule__StringValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5901:1: ( ( '{' ) )
            // InternalQL.g:5902:1: ( '{' )
            {
            // InternalQL.g:5902:1: ( '{' )
            // InternalQL.g:5903:2: '{'
            {
             before(grammarAccess.getStringValueAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getStringValueAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Group__2__Impl"


    // $ANTLR start "rule__StringValue__Group__3"
    // InternalQL.g:5912:1: rule__StringValue__Group__3 : rule__StringValue__Group__3__Impl rule__StringValue__Group__4 ;
    public final void rule__StringValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5916:1: ( rule__StringValue__Group__3__Impl rule__StringValue__Group__4 )
            // InternalQL.g:5917:2: rule__StringValue__Group__3__Impl rule__StringValue__Group__4
            {
            pushFollow(FOLLOW_51);
            rule__StringValue__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringValue__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Group__3"


    // $ANTLR start "rule__StringValue__Group__3__Impl"
    // InternalQL.g:5924:1: rule__StringValue__Group__3__Impl : ( ( rule__StringValue__Group_3__0 )? ) ;
    public final void rule__StringValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5928:1: ( ( ( rule__StringValue__Group_3__0 )? ) )
            // InternalQL.g:5929:1: ( ( rule__StringValue__Group_3__0 )? )
            {
            // InternalQL.g:5929:1: ( ( rule__StringValue__Group_3__0 )? )
            // InternalQL.g:5930:2: ( rule__StringValue__Group_3__0 )?
            {
             before(grammarAccess.getStringValueAccess().getGroup_3()); 
            // InternalQL.g:5931:2: ( rule__StringValue__Group_3__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==62) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalQL.g:5931:3: rule__StringValue__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringValue__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringValueAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Group__3__Impl"


    // $ANTLR start "rule__StringValue__Group__4"
    // InternalQL.g:5939:1: rule__StringValue__Group__4 : rule__StringValue__Group__4__Impl ;
    public final void rule__StringValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5943:1: ( rule__StringValue__Group__4__Impl )
            // InternalQL.g:5944:2: rule__StringValue__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringValue__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Group__4"


    // $ANTLR start "rule__StringValue__Group__4__Impl"
    // InternalQL.g:5950:1: rule__StringValue__Group__4__Impl : ( '}' ) ;
    public final void rule__StringValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5954:1: ( ( '}' ) )
            // InternalQL.g:5955:1: ( '}' )
            {
            // InternalQL.g:5955:1: ( '}' )
            // InternalQL.g:5956:2: '}'
            {
             before(grammarAccess.getStringValueAccess().getRightCurlyBracketKeyword_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getStringValueAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Group__4__Impl"


    // $ANTLR start "rule__StringValue__Group_3__0"
    // InternalQL.g:5966:1: rule__StringValue__Group_3__0 : rule__StringValue__Group_3__0__Impl rule__StringValue__Group_3__1 ;
    public final void rule__StringValue__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5970:1: ( rule__StringValue__Group_3__0__Impl rule__StringValue__Group_3__1 )
            // InternalQL.g:5971:2: rule__StringValue__Group_3__0__Impl rule__StringValue__Group_3__1
            {
            pushFollow(FOLLOW_25);
            rule__StringValue__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringValue__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Group_3__0"


    // $ANTLR start "rule__StringValue__Group_3__0__Impl"
    // InternalQL.g:5978:1: rule__StringValue__Group_3__0__Impl : ( 'stringValue' ) ;
    public final void rule__StringValue__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5982:1: ( ( 'stringValue' ) )
            // InternalQL.g:5983:1: ( 'stringValue' )
            {
            // InternalQL.g:5983:1: ( 'stringValue' )
            // InternalQL.g:5984:2: 'stringValue'
            {
             before(grammarAccess.getStringValueAccess().getStringValueKeyword_3_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getStringValueAccess().getStringValueKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Group_3__0__Impl"


    // $ANTLR start "rule__StringValue__Group_3__1"
    // InternalQL.g:5993:1: rule__StringValue__Group_3__1 : rule__StringValue__Group_3__1__Impl ;
    public final void rule__StringValue__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5997:1: ( rule__StringValue__Group_3__1__Impl )
            // InternalQL.g:5998:2: rule__StringValue__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringValue__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Group_3__1"


    // $ANTLR start "rule__StringValue__Group_3__1__Impl"
    // InternalQL.g:6004:1: rule__StringValue__Group_3__1__Impl : ( ( rule__StringValue__StringValueAssignment_3_1 ) ) ;
    public final void rule__StringValue__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6008:1: ( ( ( rule__StringValue__StringValueAssignment_3_1 ) ) )
            // InternalQL.g:6009:1: ( ( rule__StringValue__StringValueAssignment_3_1 ) )
            {
            // InternalQL.g:6009:1: ( ( rule__StringValue__StringValueAssignment_3_1 ) )
            // InternalQL.g:6010:2: ( rule__StringValue__StringValueAssignment_3_1 )
            {
             before(grammarAccess.getStringValueAccess().getStringValueAssignment_3_1()); 
            // InternalQL.g:6011:2: ( rule__StringValue__StringValueAssignment_3_1 )
            // InternalQL.g:6011:3: rule__StringValue__StringValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__StringValue__StringValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStringValueAccess().getStringValueAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Group_3__1__Impl"


    // $ANTLR start "rule__BooleanValue__Group__0"
    // InternalQL.g:6020:1: rule__BooleanValue__Group__0 : rule__BooleanValue__Group__0__Impl rule__BooleanValue__Group__1 ;
    public final void rule__BooleanValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6024:1: ( rule__BooleanValue__Group__0__Impl rule__BooleanValue__Group__1 )
            // InternalQL.g:6025:2: rule__BooleanValue__Group__0__Impl rule__BooleanValue__Group__1
            {
            pushFollow(FOLLOW_52);
            rule__BooleanValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__Group__0"


    // $ANTLR start "rule__BooleanValue__Group__0__Impl"
    // InternalQL.g:6032:1: rule__BooleanValue__Group__0__Impl : ( () ) ;
    public final void rule__BooleanValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6036:1: ( ( () ) )
            // InternalQL.g:6037:1: ( () )
            {
            // InternalQL.g:6037:1: ( () )
            // InternalQL.g:6038:2: ()
            {
             before(grammarAccess.getBooleanValueAccess().getBooleanValueAction_0()); 
            // InternalQL.g:6039:2: ()
            // InternalQL.g:6039:3: 
            {
            }

             after(grammarAccess.getBooleanValueAccess().getBooleanValueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__Group__0__Impl"


    // $ANTLR start "rule__BooleanValue__Group__1"
    // InternalQL.g:6047:1: rule__BooleanValue__Group__1 : rule__BooleanValue__Group__1__Impl rule__BooleanValue__Group__2 ;
    public final void rule__BooleanValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6051:1: ( rule__BooleanValue__Group__1__Impl rule__BooleanValue__Group__2 )
            // InternalQL.g:6052:2: rule__BooleanValue__Group__1__Impl rule__BooleanValue__Group__2
            {
            pushFollow(FOLLOW_52);
            rule__BooleanValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanValue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__Group__1"


    // $ANTLR start "rule__BooleanValue__Group__1__Impl"
    // InternalQL.g:6059:1: rule__BooleanValue__Group__1__Impl : ( ( rule__BooleanValue__BooleanValueAssignment_1 )? ) ;
    public final void rule__BooleanValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6063:1: ( ( ( rule__BooleanValue__BooleanValueAssignment_1 )? ) )
            // InternalQL.g:6064:1: ( ( rule__BooleanValue__BooleanValueAssignment_1 )? )
            {
            // InternalQL.g:6064:1: ( ( rule__BooleanValue__BooleanValueAssignment_1 )? )
            // InternalQL.g:6065:2: ( rule__BooleanValue__BooleanValueAssignment_1 )?
            {
             before(grammarAccess.getBooleanValueAccess().getBooleanValueAssignment_1()); 
            // InternalQL.g:6066:2: ( rule__BooleanValue__BooleanValueAssignment_1 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==74) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalQL.g:6066:3: rule__BooleanValue__BooleanValueAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__BooleanValue__BooleanValueAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBooleanValueAccess().getBooleanValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__Group__1__Impl"


    // $ANTLR start "rule__BooleanValue__Group__2"
    // InternalQL.g:6074:1: rule__BooleanValue__Group__2 : rule__BooleanValue__Group__2__Impl ;
    public final void rule__BooleanValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6078:1: ( rule__BooleanValue__Group__2__Impl )
            // InternalQL.g:6079:2: rule__BooleanValue__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanValue__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__Group__2"


    // $ANTLR start "rule__BooleanValue__Group__2__Impl"
    // InternalQL.g:6085:1: rule__BooleanValue__Group__2__Impl : ( 'BooleanValue' ) ;
    public final void rule__BooleanValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6089:1: ( ( 'BooleanValue' ) )
            // InternalQL.g:6090:1: ( 'BooleanValue' )
            {
            // InternalQL.g:6090:1: ( 'BooleanValue' )
            // InternalQL.g:6091:2: 'BooleanValue'
            {
             before(grammarAccess.getBooleanValueAccess().getBooleanValueKeyword_2()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getBooleanValueAccess().getBooleanValueKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__Group__2__Impl"


    // $ANTLR start "rule__DateValue__Group__0"
    // InternalQL.g:6101:1: rule__DateValue__Group__0 : rule__DateValue__Group__0__Impl rule__DateValue__Group__1 ;
    public final void rule__DateValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6105:1: ( rule__DateValue__Group__0__Impl rule__DateValue__Group__1 )
            // InternalQL.g:6106:2: rule__DateValue__Group__0__Impl rule__DateValue__Group__1
            {
            pushFollow(FOLLOW_53);
            rule__DateValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DateValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValue__Group__0"


    // $ANTLR start "rule__DateValue__Group__0__Impl"
    // InternalQL.g:6113:1: rule__DateValue__Group__0__Impl : ( () ) ;
    public final void rule__DateValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6117:1: ( ( () ) )
            // InternalQL.g:6118:1: ( () )
            {
            // InternalQL.g:6118:1: ( () )
            // InternalQL.g:6119:2: ()
            {
             before(grammarAccess.getDateValueAccess().getDateValueAction_0()); 
            // InternalQL.g:6120:2: ()
            // InternalQL.g:6120:3: 
            {
            }

             after(grammarAccess.getDateValueAccess().getDateValueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValue__Group__0__Impl"


    // $ANTLR start "rule__DateValue__Group__1"
    // InternalQL.g:6128:1: rule__DateValue__Group__1 : rule__DateValue__Group__1__Impl rule__DateValue__Group__2 ;
    public final void rule__DateValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6132:1: ( rule__DateValue__Group__1__Impl rule__DateValue__Group__2 )
            // InternalQL.g:6133:2: rule__DateValue__Group__1__Impl rule__DateValue__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__DateValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DateValue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValue__Group__1"


    // $ANTLR start "rule__DateValue__Group__1__Impl"
    // InternalQL.g:6140:1: rule__DateValue__Group__1__Impl : ( 'DateValue' ) ;
    public final void rule__DateValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6144:1: ( ( 'DateValue' ) )
            // InternalQL.g:6145:1: ( 'DateValue' )
            {
            // InternalQL.g:6145:1: ( 'DateValue' )
            // InternalQL.g:6146:2: 'DateValue'
            {
             before(grammarAccess.getDateValueAccess().getDateValueKeyword_1()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getDateValueAccess().getDateValueKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValue__Group__1__Impl"


    // $ANTLR start "rule__DateValue__Group__2"
    // InternalQL.g:6155:1: rule__DateValue__Group__2 : rule__DateValue__Group__2__Impl rule__DateValue__Group__3 ;
    public final void rule__DateValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6159:1: ( rule__DateValue__Group__2__Impl rule__DateValue__Group__3 )
            // InternalQL.g:6160:2: rule__DateValue__Group__2__Impl rule__DateValue__Group__3
            {
            pushFollow(FOLLOW_54);
            rule__DateValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DateValue__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValue__Group__2"


    // $ANTLR start "rule__DateValue__Group__2__Impl"
    // InternalQL.g:6167:1: rule__DateValue__Group__2__Impl : ( '{' ) ;
    public final void rule__DateValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6171:1: ( ( '{' ) )
            // InternalQL.g:6172:1: ( '{' )
            {
            // InternalQL.g:6172:1: ( '{' )
            // InternalQL.g:6173:2: '{'
            {
             before(grammarAccess.getDateValueAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getDateValueAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValue__Group__2__Impl"


    // $ANTLR start "rule__DateValue__Group__3"
    // InternalQL.g:6182:1: rule__DateValue__Group__3 : rule__DateValue__Group__3__Impl rule__DateValue__Group__4 ;
    public final void rule__DateValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6186:1: ( rule__DateValue__Group__3__Impl rule__DateValue__Group__4 )
            // InternalQL.g:6187:2: rule__DateValue__Group__3__Impl rule__DateValue__Group__4
            {
            pushFollow(FOLLOW_54);
            rule__DateValue__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DateValue__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValue__Group__3"


    // $ANTLR start "rule__DateValue__Group__3__Impl"
    // InternalQL.g:6194:1: rule__DateValue__Group__3__Impl : ( ( rule__DateValue__Group_3__0 )? ) ;
    public final void rule__DateValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6198:1: ( ( ( rule__DateValue__Group_3__0 )? ) )
            // InternalQL.g:6199:1: ( ( rule__DateValue__Group_3__0 )? )
            {
            // InternalQL.g:6199:1: ( ( rule__DateValue__Group_3__0 )? )
            // InternalQL.g:6200:2: ( rule__DateValue__Group_3__0 )?
            {
             before(grammarAccess.getDateValueAccess().getGroup_3()); 
            // InternalQL.g:6201:2: ( rule__DateValue__Group_3__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==65) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalQL.g:6201:3: rule__DateValue__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DateValue__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDateValueAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValue__Group__3__Impl"


    // $ANTLR start "rule__DateValue__Group__4"
    // InternalQL.g:6209:1: rule__DateValue__Group__4 : rule__DateValue__Group__4__Impl ;
    public final void rule__DateValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6213:1: ( rule__DateValue__Group__4__Impl )
            // InternalQL.g:6214:2: rule__DateValue__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DateValue__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValue__Group__4"


    // $ANTLR start "rule__DateValue__Group__4__Impl"
    // InternalQL.g:6220:1: rule__DateValue__Group__4__Impl : ( '}' ) ;
    public final void rule__DateValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6224:1: ( ( '}' ) )
            // InternalQL.g:6225:1: ( '}' )
            {
            // InternalQL.g:6225:1: ( '}' )
            // InternalQL.g:6226:2: '}'
            {
             before(grammarAccess.getDateValueAccess().getRightCurlyBracketKeyword_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getDateValueAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValue__Group__4__Impl"


    // $ANTLR start "rule__DateValue__Group_3__0"
    // InternalQL.g:6236:1: rule__DateValue__Group_3__0 : rule__DateValue__Group_3__0__Impl rule__DateValue__Group_3__1 ;
    public final void rule__DateValue__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6240:1: ( rule__DateValue__Group_3__0__Impl rule__DateValue__Group_3__1 )
            // InternalQL.g:6241:2: rule__DateValue__Group_3__0__Impl rule__DateValue__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__DateValue__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DateValue__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValue__Group_3__0"


    // $ANTLR start "rule__DateValue__Group_3__0__Impl"
    // InternalQL.g:6248:1: rule__DateValue__Group_3__0__Impl : ( 'dateValue' ) ;
    public final void rule__DateValue__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6252:1: ( ( 'dateValue' ) )
            // InternalQL.g:6253:1: ( 'dateValue' )
            {
            // InternalQL.g:6253:1: ( 'dateValue' )
            // InternalQL.g:6254:2: 'dateValue'
            {
             before(grammarAccess.getDateValueAccess().getDateValueKeyword_3_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getDateValueAccess().getDateValueKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValue__Group_3__0__Impl"


    // $ANTLR start "rule__DateValue__Group_3__1"
    // InternalQL.g:6263:1: rule__DateValue__Group_3__1 : rule__DateValue__Group_3__1__Impl ;
    public final void rule__DateValue__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6267:1: ( rule__DateValue__Group_3__1__Impl )
            // InternalQL.g:6268:2: rule__DateValue__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DateValue__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValue__Group_3__1"


    // $ANTLR start "rule__DateValue__Group_3__1__Impl"
    // InternalQL.g:6274:1: rule__DateValue__Group_3__1__Impl : ( ( rule__DateValue__DateValueAssignment_3_1 ) ) ;
    public final void rule__DateValue__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6278:1: ( ( ( rule__DateValue__DateValueAssignment_3_1 ) ) )
            // InternalQL.g:6279:1: ( ( rule__DateValue__DateValueAssignment_3_1 ) )
            {
            // InternalQL.g:6279:1: ( ( rule__DateValue__DateValueAssignment_3_1 ) )
            // InternalQL.g:6280:2: ( rule__DateValue__DateValueAssignment_3_1 )
            {
             before(grammarAccess.getDateValueAccess().getDateValueAssignment_3_1()); 
            // InternalQL.g:6281:2: ( rule__DateValue__DateValueAssignment_3_1 )
            // InternalQL.g:6281:3: rule__DateValue__DateValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__DateValue__DateValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDateValueAccess().getDateValueAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValue__Group_3__1__Impl"


    // $ANTLR start "rule__DecimalValue__Group__0"
    // InternalQL.g:6290:1: rule__DecimalValue__Group__0 : rule__DecimalValue__Group__0__Impl rule__DecimalValue__Group__1 ;
    public final void rule__DecimalValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6294:1: ( rule__DecimalValue__Group__0__Impl rule__DecimalValue__Group__1 )
            // InternalQL.g:6295:2: rule__DecimalValue__Group__0__Impl rule__DecimalValue__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__DecimalValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DecimalValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValue__Group__0"


    // $ANTLR start "rule__DecimalValue__Group__0__Impl"
    // InternalQL.g:6302:1: rule__DecimalValue__Group__0__Impl : ( () ) ;
    public final void rule__DecimalValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6306:1: ( ( () ) )
            // InternalQL.g:6307:1: ( () )
            {
            // InternalQL.g:6307:1: ( () )
            // InternalQL.g:6308:2: ()
            {
             before(grammarAccess.getDecimalValueAccess().getDecimalValueAction_0()); 
            // InternalQL.g:6309:2: ()
            // InternalQL.g:6309:3: 
            {
            }

             after(grammarAccess.getDecimalValueAccess().getDecimalValueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValue__Group__0__Impl"


    // $ANTLR start "rule__DecimalValue__Group__1"
    // InternalQL.g:6317:1: rule__DecimalValue__Group__1 : rule__DecimalValue__Group__1__Impl rule__DecimalValue__Group__2 ;
    public final void rule__DecimalValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6321:1: ( rule__DecimalValue__Group__1__Impl rule__DecimalValue__Group__2 )
            // InternalQL.g:6322:2: rule__DecimalValue__Group__1__Impl rule__DecimalValue__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__DecimalValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DecimalValue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValue__Group__1"


    // $ANTLR start "rule__DecimalValue__Group__1__Impl"
    // InternalQL.g:6329:1: rule__DecimalValue__Group__1__Impl : ( 'DecimalValue' ) ;
    public final void rule__DecimalValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6333:1: ( ( 'DecimalValue' ) )
            // InternalQL.g:6334:1: ( 'DecimalValue' )
            {
            // InternalQL.g:6334:1: ( 'DecimalValue' )
            // InternalQL.g:6335:2: 'DecimalValue'
            {
             before(grammarAccess.getDecimalValueAccess().getDecimalValueKeyword_1()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getDecimalValueAccess().getDecimalValueKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValue__Group__1__Impl"


    // $ANTLR start "rule__DecimalValue__Group__2"
    // InternalQL.g:6344:1: rule__DecimalValue__Group__2 : rule__DecimalValue__Group__2__Impl rule__DecimalValue__Group__3 ;
    public final void rule__DecimalValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6348:1: ( rule__DecimalValue__Group__2__Impl rule__DecimalValue__Group__3 )
            // InternalQL.g:6349:2: rule__DecimalValue__Group__2__Impl rule__DecimalValue__Group__3
            {
            pushFollow(FOLLOW_55);
            rule__DecimalValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DecimalValue__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValue__Group__2"


    // $ANTLR start "rule__DecimalValue__Group__2__Impl"
    // InternalQL.g:6356:1: rule__DecimalValue__Group__2__Impl : ( '{' ) ;
    public final void rule__DecimalValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6360:1: ( ( '{' ) )
            // InternalQL.g:6361:1: ( '{' )
            {
            // InternalQL.g:6361:1: ( '{' )
            // InternalQL.g:6362:2: '{'
            {
             before(grammarAccess.getDecimalValueAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getDecimalValueAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValue__Group__2__Impl"


    // $ANTLR start "rule__DecimalValue__Group__3"
    // InternalQL.g:6371:1: rule__DecimalValue__Group__3 : rule__DecimalValue__Group__3__Impl rule__DecimalValue__Group__4 ;
    public final void rule__DecimalValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6375:1: ( rule__DecimalValue__Group__3__Impl rule__DecimalValue__Group__4 )
            // InternalQL.g:6376:2: rule__DecimalValue__Group__3__Impl rule__DecimalValue__Group__4
            {
            pushFollow(FOLLOW_55);
            rule__DecimalValue__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DecimalValue__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValue__Group__3"


    // $ANTLR start "rule__DecimalValue__Group__3__Impl"
    // InternalQL.g:6383:1: rule__DecimalValue__Group__3__Impl : ( ( rule__DecimalValue__Group_3__0 )? ) ;
    public final void rule__DecimalValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6387:1: ( ( ( rule__DecimalValue__Group_3__0 )? ) )
            // InternalQL.g:6388:1: ( ( rule__DecimalValue__Group_3__0 )? )
            {
            // InternalQL.g:6388:1: ( ( rule__DecimalValue__Group_3__0 )? )
            // InternalQL.g:6389:2: ( rule__DecimalValue__Group_3__0 )?
            {
             before(grammarAccess.getDecimalValueAccess().getGroup_3()); 
            // InternalQL.g:6390:2: ( rule__DecimalValue__Group_3__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==67) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalQL.g:6390:3: rule__DecimalValue__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DecimalValue__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDecimalValueAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValue__Group__3__Impl"


    // $ANTLR start "rule__DecimalValue__Group__4"
    // InternalQL.g:6398:1: rule__DecimalValue__Group__4 : rule__DecimalValue__Group__4__Impl ;
    public final void rule__DecimalValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6402:1: ( rule__DecimalValue__Group__4__Impl )
            // InternalQL.g:6403:2: rule__DecimalValue__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DecimalValue__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValue__Group__4"


    // $ANTLR start "rule__DecimalValue__Group__4__Impl"
    // InternalQL.g:6409:1: rule__DecimalValue__Group__4__Impl : ( '}' ) ;
    public final void rule__DecimalValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6413:1: ( ( '}' ) )
            // InternalQL.g:6414:1: ( '}' )
            {
            // InternalQL.g:6414:1: ( '}' )
            // InternalQL.g:6415:2: '}'
            {
             before(grammarAccess.getDecimalValueAccess().getRightCurlyBracketKeyword_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getDecimalValueAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValue__Group__4__Impl"


    // $ANTLR start "rule__DecimalValue__Group_3__0"
    // InternalQL.g:6425:1: rule__DecimalValue__Group_3__0 : rule__DecimalValue__Group_3__0__Impl rule__DecimalValue__Group_3__1 ;
    public final void rule__DecimalValue__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6429:1: ( rule__DecimalValue__Group_3__0__Impl rule__DecimalValue__Group_3__1 )
            // InternalQL.g:6430:2: rule__DecimalValue__Group_3__0__Impl rule__DecimalValue__Group_3__1
            {
            pushFollow(FOLLOW_56);
            rule__DecimalValue__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DecimalValue__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValue__Group_3__0"


    // $ANTLR start "rule__DecimalValue__Group_3__0__Impl"
    // InternalQL.g:6437:1: rule__DecimalValue__Group_3__0__Impl : ( 'decimalValue' ) ;
    public final void rule__DecimalValue__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6441:1: ( ( 'decimalValue' ) )
            // InternalQL.g:6442:1: ( 'decimalValue' )
            {
            // InternalQL.g:6442:1: ( 'decimalValue' )
            // InternalQL.g:6443:2: 'decimalValue'
            {
             before(grammarAccess.getDecimalValueAccess().getDecimalValueKeyword_3_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getDecimalValueAccess().getDecimalValueKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValue__Group_3__0__Impl"


    // $ANTLR start "rule__DecimalValue__Group_3__1"
    // InternalQL.g:6452:1: rule__DecimalValue__Group_3__1 : rule__DecimalValue__Group_3__1__Impl ;
    public final void rule__DecimalValue__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6456:1: ( rule__DecimalValue__Group_3__1__Impl )
            // InternalQL.g:6457:2: rule__DecimalValue__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DecimalValue__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValue__Group_3__1"


    // $ANTLR start "rule__DecimalValue__Group_3__1__Impl"
    // InternalQL.g:6463:1: rule__DecimalValue__Group_3__1__Impl : ( ( rule__DecimalValue__DecimalValueAssignment_3_1 ) ) ;
    public final void rule__DecimalValue__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6467:1: ( ( ( rule__DecimalValue__DecimalValueAssignment_3_1 ) ) )
            // InternalQL.g:6468:1: ( ( rule__DecimalValue__DecimalValueAssignment_3_1 ) )
            {
            // InternalQL.g:6468:1: ( ( rule__DecimalValue__DecimalValueAssignment_3_1 ) )
            // InternalQL.g:6469:2: ( rule__DecimalValue__DecimalValueAssignment_3_1 )
            {
             before(grammarAccess.getDecimalValueAccess().getDecimalValueAssignment_3_1()); 
            // InternalQL.g:6470:2: ( rule__DecimalValue__DecimalValueAssignment_3_1 )
            // InternalQL.g:6470:3: rule__DecimalValue__DecimalValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__DecimalValue__DecimalValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDecimalValueAccess().getDecimalValueAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValue__Group_3__1__Impl"


    // $ANTLR start "rule__EFloat__Group__0"
    // InternalQL.g:6479:1: rule__EFloat__Group__0 : rule__EFloat__Group__0__Impl rule__EFloat__Group__1 ;
    public final void rule__EFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6483:1: ( rule__EFloat__Group__0__Impl rule__EFloat__Group__1 )
            // InternalQL.g:6484:2: rule__EFloat__Group__0__Impl rule__EFloat__Group__1
            {
            pushFollow(FOLLOW_56);
            rule__EFloat__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__0"


    // $ANTLR start "rule__EFloat__Group__0__Impl"
    // InternalQL.g:6491:1: rule__EFloat__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6495:1: ( ( ( '-' )? ) )
            // InternalQL.g:6496:1: ( ( '-' )? )
            {
            // InternalQL.g:6496:1: ( ( '-' )? )
            // InternalQL.g:6497:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 
            // InternalQL.g:6498:2: ( '-' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==29) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalQL.g:6498:3: '-'
                    {
                    match(input,29,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__0__Impl"


    // $ANTLR start "rule__EFloat__Group__1"
    // InternalQL.g:6506:1: rule__EFloat__Group__1 : rule__EFloat__Group__1__Impl rule__EFloat__Group__2 ;
    public final void rule__EFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6510:1: ( rule__EFloat__Group__1__Impl rule__EFloat__Group__2 )
            // InternalQL.g:6511:2: rule__EFloat__Group__1__Impl rule__EFloat__Group__2
            {
            pushFollow(FOLLOW_56);
            rule__EFloat__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__1"


    // $ANTLR start "rule__EFloat__Group__1__Impl"
    // InternalQL.g:6518:1: rule__EFloat__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6522:1: ( ( ( RULE_INT )? ) )
            // InternalQL.g:6523:1: ( ( RULE_INT )? )
            {
            // InternalQL.g:6523:1: ( ( RULE_INT )? )
            // InternalQL.g:6524:2: ( RULE_INT )?
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 
            // InternalQL.g:6525:2: ( RULE_INT )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_INT) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalQL.g:6525:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__1__Impl"


    // $ANTLR start "rule__EFloat__Group__2"
    // InternalQL.g:6533:1: rule__EFloat__Group__2 : rule__EFloat__Group__2__Impl rule__EFloat__Group__3 ;
    public final void rule__EFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6537:1: ( rule__EFloat__Group__2__Impl rule__EFloat__Group__3 )
            // InternalQL.g:6538:2: rule__EFloat__Group__2__Impl rule__EFloat__Group__3
            {
            pushFollow(FOLLOW_57);
            rule__EFloat__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__2"


    // $ANTLR start "rule__EFloat__Group__2__Impl"
    // InternalQL.g:6545:1: rule__EFloat__Group__2__Impl : ( '.' ) ;
    public final void rule__EFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6549:1: ( ( '.' ) )
            // InternalQL.g:6550:1: ( '.' )
            {
            // InternalQL.g:6550:1: ( '.' )
            // InternalQL.g:6551:2: '.'
            {
             before(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__2__Impl"


    // $ANTLR start "rule__EFloat__Group__3"
    // InternalQL.g:6560:1: rule__EFloat__Group__3 : rule__EFloat__Group__3__Impl rule__EFloat__Group__4 ;
    public final void rule__EFloat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6564:1: ( rule__EFloat__Group__3__Impl rule__EFloat__Group__4 )
            // InternalQL.g:6565:2: rule__EFloat__Group__3__Impl rule__EFloat__Group__4
            {
            pushFollow(FOLLOW_58);
            rule__EFloat__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__3"


    // $ANTLR start "rule__EFloat__Group__3__Impl"
    // InternalQL.g:6572:1: rule__EFloat__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6576:1: ( ( RULE_INT ) )
            // InternalQL.g:6577:1: ( RULE_INT )
            {
            // InternalQL.g:6577:1: ( RULE_INT )
            // InternalQL.g:6578:2: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__3__Impl"


    // $ANTLR start "rule__EFloat__Group__4"
    // InternalQL.g:6587:1: rule__EFloat__Group__4 : rule__EFloat__Group__4__Impl ;
    public final void rule__EFloat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6591:1: ( rule__EFloat__Group__4__Impl )
            // InternalQL.g:6592:2: rule__EFloat__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__4"


    // $ANTLR start "rule__EFloat__Group__4__Impl"
    // InternalQL.g:6598:1: rule__EFloat__Group__4__Impl : ( ( rule__EFloat__Group_4__0 )? ) ;
    public final void rule__EFloat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6602:1: ( ( ( rule__EFloat__Group_4__0 )? ) )
            // InternalQL.g:6603:1: ( ( rule__EFloat__Group_4__0 )? )
            {
            // InternalQL.g:6603:1: ( ( rule__EFloat__Group_4__0 )? )
            // InternalQL.g:6604:2: ( rule__EFloat__Group_4__0 )?
            {
             before(grammarAccess.getEFloatAccess().getGroup_4()); 
            // InternalQL.g:6605:2: ( rule__EFloat__Group_4__0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=15 && LA56_0<=16)) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalQL.g:6605:3: rule__EFloat__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EFloat__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__4__Impl"


    // $ANTLR start "rule__EFloat__Group_4__0"
    // InternalQL.g:6614:1: rule__EFloat__Group_4__0 : rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 ;
    public final void rule__EFloat__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6618:1: ( rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 )
            // InternalQL.g:6619:2: rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1
            {
            pushFollow(FOLLOW_40);
            rule__EFloat__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__0"


    // $ANTLR start "rule__EFloat__Group_4__0__Impl"
    // InternalQL.g:6626:1: rule__EFloat__Group_4__0__Impl : ( ( rule__EFloat__Alternatives_4_0 ) ) ;
    public final void rule__EFloat__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6630:1: ( ( ( rule__EFloat__Alternatives_4_0 ) ) )
            // InternalQL.g:6631:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            {
            // InternalQL.g:6631:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            // InternalQL.g:6632:2: ( rule__EFloat__Alternatives_4_0 )
            {
             before(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 
            // InternalQL.g:6633:2: ( rule__EFloat__Alternatives_4_0 )
            // InternalQL.g:6633:3: rule__EFloat__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__0__Impl"


    // $ANTLR start "rule__EFloat__Group_4__1"
    // InternalQL.g:6641:1: rule__EFloat__Group_4__1 : rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 ;
    public final void rule__EFloat__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6645:1: ( rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 )
            // InternalQL.g:6646:2: rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2
            {
            pushFollow(FOLLOW_40);
            rule__EFloat__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__1"


    // $ANTLR start "rule__EFloat__Group_4__1__Impl"
    // InternalQL.g:6653:1: rule__EFloat__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6657:1: ( ( ( '-' )? ) )
            // InternalQL.g:6658:1: ( ( '-' )? )
            {
            // InternalQL.g:6658:1: ( ( '-' )? )
            // InternalQL.g:6659:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 
            // InternalQL.g:6660:2: ( '-' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==29) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalQL.g:6660:3: '-'
                    {
                    match(input,29,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__1__Impl"


    // $ANTLR start "rule__EFloat__Group_4__2"
    // InternalQL.g:6668:1: rule__EFloat__Group_4__2 : rule__EFloat__Group_4__2__Impl ;
    public final void rule__EFloat__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6672:1: ( rule__EFloat__Group_4__2__Impl )
            // InternalQL.g:6673:2: rule__EFloat__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__2"


    // $ANTLR start "rule__EFloat__Group_4__2__Impl"
    // InternalQL.g:6679:1: rule__EFloat__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6683:1: ( ( RULE_INT ) )
            // InternalQL.g:6684:1: ( RULE_INT )
            {
            // InternalQL.g:6684:1: ( RULE_INT )
            // InternalQL.g:6685:2: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__2__Impl"


    // $ANTLR start "rule__QuestionDefinition__Group__0"
    // InternalQL.g:6695:1: rule__QuestionDefinition__Group__0 : rule__QuestionDefinition__Group__0__Impl rule__QuestionDefinition__Group__1 ;
    public final void rule__QuestionDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6699:1: ( rule__QuestionDefinition__Group__0__Impl rule__QuestionDefinition__Group__1 )
            // InternalQL.g:6700:2: rule__QuestionDefinition__Group__0__Impl rule__QuestionDefinition__Group__1
            {
            pushFollow(FOLLOW_59);
            rule__QuestionDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group__0"


    // $ANTLR start "rule__QuestionDefinition__Group__0__Impl"
    // InternalQL.g:6707:1: rule__QuestionDefinition__Group__0__Impl : ( ( rule__QuestionDefinition__IsMandatoryAssignment_0 )? ) ;
    public final void rule__QuestionDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6711:1: ( ( ( rule__QuestionDefinition__IsMandatoryAssignment_0 )? ) )
            // InternalQL.g:6712:1: ( ( rule__QuestionDefinition__IsMandatoryAssignment_0 )? )
            {
            // InternalQL.g:6712:1: ( ( rule__QuestionDefinition__IsMandatoryAssignment_0 )? )
            // InternalQL.g:6713:2: ( rule__QuestionDefinition__IsMandatoryAssignment_0 )?
            {
             before(grammarAccess.getQuestionDefinitionAccess().getIsMandatoryAssignment_0()); 
            // InternalQL.g:6714:2: ( rule__QuestionDefinition__IsMandatoryAssignment_0 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==75) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalQL.g:6714:3: rule__QuestionDefinition__IsMandatoryAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QuestionDefinition__IsMandatoryAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionDefinitionAccess().getIsMandatoryAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group__0__Impl"


    // $ANTLR start "rule__QuestionDefinition__Group__1"
    // InternalQL.g:6722:1: rule__QuestionDefinition__Group__1 : rule__QuestionDefinition__Group__1__Impl rule__QuestionDefinition__Group__2 ;
    public final void rule__QuestionDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6726:1: ( rule__QuestionDefinition__Group__1__Impl rule__QuestionDefinition__Group__2 )
            // InternalQL.g:6727:2: rule__QuestionDefinition__Group__1__Impl rule__QuestionDefinition__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__QuestionDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group__1"


    // $ANTLR start "rule__QuestionDefinition__Group__1__Impl"
    // InternalQL.g:6734:1: rule__QuestionDefinition__Group__1__Impl : ( 'question' ) ;
    public final void rule__QuestionDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6738:1: ( ( 'question' ) )
            // InternalQL.g:6739:1: ( 'question' )
            {
            // InternalQL.g:6739:1: ( 'question' )
            // InternalQL.g:6740:2: 'question'
            {
             before(grammarAccess.getQuestionDefinitionAccess().getQuestionKeyword_1()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getQuestionDefinitionAccess().getQuestionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group__1__Impl"


    // $ANTLR start "rule__QuestionDefinition__Group__2"
    // InternalQL.g:6749:1: rule__QuestionDefinition__Group__2 : rule__QuestionDefinition__Group__2__Impl rule__QuestionDefinition__Group__3 ;
    public final void rule__QuestionDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6753:1: ( rule__QuestionDefinition__Group__2__Impl rule__QuestionDefinition__Group__3 )
            // InternalQL.g:6754:2: rule__QuestionDefinition__Group__2__Impl rule__QuestionDefinition__Group__3
            {
            pushFollow(FOLLOW_60);
            rule__QuestionDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group__2"


    // $ANTLR start "rule__QuestionDefinition__Group__2__Impl"
    // InternalQL.g:6761:1: rule__QuestionDefinition__Group__2__Impl : ( ( rule__QuestionDefinition__NameAssignment_2 ) ) ;
    public final void rule__QuestionDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6765:1: ( ( ( rule__QuestionDefinition__NameAssignment_2 ) ) )
            // InternalQL.g:6766:1: ( ( rule__QuestionDefinition__NameAssignment_2 ) )
            {
            // InternalQL.g:6766:1: ( ( rule__QuestionDefinition__NameAssignment_2 ) )
            // InternalQL.g:6767:2: ( rule__QuestionDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getNameAssignment_2()); 
            // InternalQL.g:6768:2: ( rule__QuestionDefinition__NameAssignment_2 )
            // InternalQL.g:6768:3: rule__QuestionDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getQuestionDefinitionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group__2__Impl"


    // $ANTLR start "rule__QuestionDefinition__Group__3"
    // InternalQL.g:6776:1: rule__QuestionDefinition__Group__3 : rule__QuestionDefinition__Group__3__Impl rule__QuestionDefinition__Group__4 ;
    public final void rule__QuestionDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6780:1: ( rule__QuestionDefinition__Group__3__Impl rule__QuestionDefinition__Group__4 )
            // InternalQL.g:6781:2: rule__QuestionDefinition__Group__3__Impl rule__QuestionDefinition__Group__4
            {
            pushFollow(FOLLOW_60);
            rule__QuestionDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group__3"


    // $ANTLR start "rule__QuestionDefinition__Group__3__Impl"
    // InternalQL.g:6788:1: rule__QuestionDefinition__Group__3__Impl : ( ( rule__QuestionDefinition__Group_3__0 )? ) ;
    public final void rule__QuestionDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6792:1: ( ( ( rule__QuestionDefinition__Group_3__0 )? ) )
            // InternalQL.g:6793:1: ( ( rule__QuestionDefinition__Group_3__0 )? )
            {
            // InternalQL.g:6793:1: ( ( rule__QuestionDefinition__Group_3__0 )? )
            // InternalQL.g:6794:2: ( rule__QuestionDefinition__Group_3__0 )?
            {
             before(grammarAccess.getQuestionDefinitionAccess().getGroup_3()); 
            // InternalQL.g:6795:2: ( rule__QuestionDefinition__Group_3__0 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==41) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalQL.g:6795:3: rule__QuestionDefinition__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QuestionDefinition__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionDefinitionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group__3__Impl"


    // $ANTLR start "rule__QuestionDefinition__Group__4"
    // InternalQL.g:6803:1: rule__QuestionDefinition__Group__4 : rule__QuestionDefinition__Group__4__Impl rule__QuestionDefinition__Group__5 ;
    public final void rule__QuestionDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6807:1: ( rule__QuestionDefinition__Group__4__Impl rule__QuestionDefinition__Group__5 )
            // InternalQL.g:6808:2: rule__QuestionDefinition__Group__4__Impl rule__QuestionDefinition__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__QuestionDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group__4"


    // $ANTLR start "rule__QuestionDefinition__Group__4__Impl"
    // InternalQL.g:6815:1: rule__QuestionDefinition__Group__4__Impl : ( ':' ) ;
    public final void rule__QuestionDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6819:1: ( ( ':' ) )
            // InternalQL.g:6820:1: ( ':' )
            {
            // InternalQL.g:6820:1: ( ':' )
            // InternalQL.g:6821:2: ':'
            {
             before(grammarAccess.getQuestionDefinitionAccess().getColonKeyword_4()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getQuestionDefinitionAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group__4__Impl"


    // $ANTLR start "rule__QuestionDefinition__Group__5"
    // InternalQL.g:6830:1: rule__QuestionDefinition__Group__5 : rule__QuestionDefinition__Group__5__Impl rule__QuestionDefinition__Group__6 ;
    public final void rule__QuestionDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6834:1: ( rule__QuestionDefinition__Group__5__Impl rule__QuestionDefinition__Group__6 )
            // InternalQL.g:6835:2: rule__QuestionDefinition__Group__5__Impl rule__QuestionDefinition__Group__6
            {
            pushFollow(FOLLOW_25);
            rule__QuestionDefinition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group__5"


    // $ANTLR start "rule__QuestionDefinition__Group__5__Impl"
    // InternalQL.g:6842:1: rule__QuestionDefinition__Group__5__Impl : ( ( rule__QuestionDefinition__LabelAssignment_5 ) ) ;
    public final void rule__QuestionDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6846:1: ( ( ( rule__QuestionDefinition__LabelAssignment_5 ) ) )
            // InternalQL.g:6847:1: ( ( rule__QuestionDefinition__LabelAssignment_5 ) )
            {
            // InternalQL.g:6847:1: ( ( rule__QuestionDefinition__LabelAssignment_5 ) )
            // InternalQL.g:6848:2: ( rule__QuestionDefinition__LabelAssignment_5 )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getLabelAssignment_5()); 
            // InternalQL.g:6849:2: ( rule__QuestionDefinition__LabelAssignment_5 )
            // InternalQL.g:6849:3: rule__QuestionDefinition__LabelAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__LabelAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getQuestionDefinitionAccess().getLabelAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group__5__Impl"


    // $ANTLR start "rule__QuestionDefinition__Group__6"
    // InternalQL.g:6857:1: rule__QuestionDefinition__Group__6 : rule__QuestionDefinition__Group__6__Impl rule__QuestionDefinition__Group__7 ;
    public final void rule__QuestionDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6861:1: ( rule__QuestionDefinition__Group__6__Impl rule__QuestionDefinition__Group__7 )
            // InternalQL.g:6862:2: rule__QuestionDefinition__Group__6__Impl rule__QuestionDefinition__Group__7
            {
            pushFollow(FOLLOW_17);
            rule__QuestionDefinition__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group__6"


    // $ANTLR start "rule__QuestionDefinition__Group__6__Impl"
    // InternalQL.g:6869:1: rule__QuestionDefinition__Group__6__Impl : ( ( rule__QuestionDefinition__DataTypeAssignment_6 ) ) ;
    public final void rule__QuestionDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6873:1: ( ( ( rule__QuestionDefinition__DataTypeAssignment_6 ) ) )
            // InternalQL.g:6874:1: ( ( rule__QuestionDefinition__DataTypeAssignment_6 ) )
            {
            // InternalQL.g:6874:1: ( ( rule__QuestionDefinition__DataTypeAssignment_6 ) )
            // InternalQL.g:6875:2: ( rule__QuestionDefinition__DataTypeAssignment_6 )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getDataTypeAssignment_6()); 
            // InternalQL.g:6876:2: ( rule__QuestionDefinition__DataTypeAssignment_6 )
            // InternalQL.g:6876:3: rule__QuestionDefinition__DataTypeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__DataTypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getQuestionDefinitionAccess().getDataTypeAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group__6__Impl"


    // $ANTLR start "rule__QuestionDefinition__Group__7"
    // InternalQL.g:6884:1: rule__QuestionDefinition__Group__7 : rule__QuestionDefinition__Group__7__Impl ;
    public final void rule__QuestionDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6888:1: ( rule__QuestionDefinition__Group__7__Impl )
            // InternalQL.g:6889:2: rule__QuestionDefinition__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group__7"


    // $ANTLR start "rule__QuestionDefinition__Group__7__Impl"
    // InternalQL.g:6895:1: rule__QuestionDefinition__Group__7__Impl : ( ( rule__QuestionDefinition__Group_7__0 )? ) ;
    public final void rule__QuestionDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6899:1: ( ( ( rule__QuestionDefinition__Group_7__0 )? ) )
            // InternalQL.g:6900:1: ( ( rule__QuestionDefinition__Group_7__0 )? )
            {
            // InternalQL.g:6900:1: ( ( rule__QuestionDefinition__Group_7__0 )? )
            // InternalQL.g:6901:2: ( rule__QuestionDefinition__Group_7__0 )?
            {
             before(grammarAccess.getQuestionDefinitionAccess().getGroup_7()); 
            // InternalQL.g:6902:2: ( rule__QuestionDefinition__Group_7__0 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==12) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalQL.g:6902:3: rule__QuestionDefinition__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QuestionDefinition__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionDefinitionAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group__7__Impl"


    // $ANTLR start "rule__QuestionDefinition__Group_3__0"
    // InternalQL.g:6911:1: rule__QuestionDefinition__Group_3__0 : rule__QuestionDefinition__Group_3__0__Impl rule__QuestionDefinition__Group_3__1 ;
    public final void rule__QuestionDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6915:1: ( rule__QuestionDefinition__Group_3__0__Impl rule__QuestionDefinition__Group_3__1 )
            // InternalQL.g:6916:2: rule__QuestionDefinition__Group_3__0__Impl rule__QuestionDefinition__Group_3__1
            {
            pushFollow(FOLLOW_61);
            rule__QuestionDefinition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group_3__0"


    // $ANTLR start "rule__QuestionDefinition__Group_3__0__Impl"
    // InternalQL.g:6923:1: rule__QuestionDefinition__Group_3__0__Impl : ( '(' ) ;
    public final void rule__QuestionDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6927:1: ( ( '(' ) )
            // InternalQL.g:6928:1: ( '(' )
            {
            // InternalQL.g:6928:1: ( '(' )
            // InternalQL.g:6929:2: '('
            {
             before(grammarAccess.getQuestionDefinitionAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getQuestionDefinitionAccess().getLeftParenthesisKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group_3__0__Impl"


    // $ANTLR start "rule__QuestionDefinition__Group_3__1"
    // InternalQL.g:6938:1: rule__QuestionDefinition__Group_3__1 : rule__QuestionDefinition__Group_3__1__Impl rule__QuestionDefinition__Group_3__2 ;
    public final void rule__QuestionDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6942:1: ( rule__QuestionDefinition__Group_3__1__Impl rule__QuestionDefinition__Group_3__2 )
            // InternalQL.g:6943:2: rule__QuestionDefinition__Group_3__1__Impl rule__QuestionDefinition__Group_3__2
            {
            pushFollow(FOLLOW_61);
            rule__QuestionDefinition__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group_3__1"


    // $ANTLR start "rule__QuestionDefinition__Group_3__1__Impl"
    // InternalQL.g:6950:1: rule__QuestionDefinition__Group_3__1__Impl : ( ( rule__QuestionDefinition__IsDisplayedAssignment_3_1 )? ) ;
    public final void rule__QuestionDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6954:1: ( ( ( rule__QuestionDefinition__IsDisplayedAssignment_3_1 )? ) )
            // InternalQL.g:6955:1: ( ( rule__QuestionDefinition__IsDisplayedAssignment_3_1 )? )
            {
            // InternalQL.g:6955:1: ( ( rule__QuestionDefinition__IsDisplayedAssignment_3_1 )? )
            // InternalQL.g:6956:2: ( rule__QuestionDefinition__IsDisplayedAssignment_3_1 )?
            {
             before(grammarAccess.getQuestionDefinitionAccess().getIsDisplayedAssignment_3_1()); 
            // InternalQL.g:6957:2: ( rule__QuestionDefinition__IsDisplayedAssignment_3_1 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==76) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalQL.g:6957:3: rule__QuestionDefinition__IsDisplayedAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__QuestionDefinition__IsDisplayedAssignment_3_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionDefinitionAccess().getIsDisplayedAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group_3__1__Impl"


    // $ANTLR start "rule__QuestionDefinition__Group_3__2"
    // InternalQL.g:6965:1: rule__QuestionDefinition__Group_3__2 : rule__QuestionDefinition__Group_3__2__Impl rule__QuestionDefinition__Group_3__3 ;
    public final void rule__QuestionDefinition__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6969:1: ( rule__QuestionDefinition__Group_3__2__Impl rule__QuestionDefinition__Group_3__3 )
            // InternalQL.g:6970:2: rule__QuestionDefinition__Group_3__2__Impl rule__QuestionDefinition__Group_3__3
            {
            pushFollow(FOLLOW_61);
            rule__QuestionDefinition__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group_3__2"


    // $ANTLR start "rule__QuestionDefinition__Group_3__2__Impl"
    // InternalQL.g:6977:1: rule__QuestionDefinition__Group_3__2__Impl : ( ( rule__QuestionDefinition__Group_3_2__0 )? ) ;
    public final void rule__QuestionDefinition__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6981:1: ( ( ( rule__QuestionDefinition__Group_3_2__0 )? ) )
            // InternalQL.g:6982:1: ( ( rule__QuestionDefinition__Group_3_2__0 )? )
            {
            // InternalQL.g:6982:1: ( ( rule__QuestionDefinition__Group_3_2__0 )? )
            // InternalQL.g:6983:2: ( rule__QuestionDefinition__Group_3_2__0 )?
            {
             before(grammarAccess.getQuestionDefinitionAccess().getGroup_3_2()); 
            // InternalQL.g:6984:2: ( rule__QuestionDefinition__Group_3_2__0 )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==71) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalQL.g:6984:3: rule__QuestionDefinition__Group_3_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QuestionDefinition__Group_3_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionDefinitionAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group_3__2__Impl"


    // $ANTLR start "rule__QuestionDefinition__Group_3__3"
    // InternalQL.g:6992:1: rule__QuestionDefinition__Group_3__3 : rule__QuestionDefinition__Group_3__3__Impl ;
    public final void rule__QuestionDefinition__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6996:1: ( rule__QuestionDefinition__Group_3__3__Impl )
            // InternalQL.g:6997:2: rule__QuestionDefinition__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group_3__3"


    // $ANTLR start "rule__QuestionDefinition__Group_3__3__Impl"
    // InternalQL.g:7003:1: rule__QuestionDefinition__Group_3__3__Impl : ( ')' ) ;
    public final void rule__QuestionDefinition__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7007:1: ( ( ')' ) )
            // InternalQL.g:7008:1: ( ')' )
            {
            // InternalQL.g:7008:1: ( ')' )
            // InternalQL.g:7009:2: ')'
            {
             before(grammarAccess.getQuestionDefinitionAccess().getRightParenthesisKeyword_3_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getQuestionDefinitionAccess().getRightParenthesisKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group_3__3__Impl"


    // $ANTLR start "rule__QuestionDefinition__Group_3_2__0"
    // InternalQL.g:7019:1: rule__QuestionDefinition__Group_3_2__0 : rule__QuestionDefinition__Group_3_2__0__Impl rule__QuestionDefinition__Group_3_2__1 ;
    public final void rule__QuestionDefinition__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7023:1: ( rule__QuestionDefinition__Group_3_2__0__Impl rule__QuestionDefinition__Group_3_2__1 )
            // InternalQL.g:7024:2: rule__QuestionDefinition__Group_3_2__0__Impl rule__QuestionDefinition__Group_3_2__1
            {
            pushFollow(FOLLOW_62);
            rule__QuestionDefinition__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group_3_2__0"


    // $ANTLR start "rule__QuestionDefinition__Group_3_2__0__Impl"
    // InternalQL.g:7031:1: rule__QuestionDefinition__Group_3_2__0__Impl : ( 'currentValue' ) ;
    public final void rule__QuestionDefinition__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7035:1: ( ( 'currentValue' ) )
            // InternalQL.g:7036:1: ( 'currentValue' )
            {
            // InternalQL.g:7036:1: ( 'currentValue' )
            // InternalQL.g:7037:2: 'currentValue'
            {
             before(grammarAccess.getQuestionDefinitionAccess().getCurrentValueKeyword_3_2_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getQuestionDefinitionAccess().getCurrentValueKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group_3_2__0__Impl"


    // $ANTLR start "rule__QuestionDefinition__Group_3_2__1"
    // InternalQL.g:7046:1: rule__QuestionDefinition__Group_3_2__1 : rule__QuestionDefinition__Group_3_2__1__Impl ;
    public final void rule__QuestionDefinition__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7050:1: ( rule__QuestionDefinition__Group_3_2__1__Impl )
            // InternalQL.g:7051:2: rule__QuestionDefinition__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group_3_2__1"


    // $ANTLR start "rule__QuestionDefinition__Group_3_2__1__Impl"
    // InternalQL.g:7057:1: rule__QuestionDefinition__Group_3_2__1__Impl : ( ( rule__QuestionDefinition__CurrentValueAssignment_3_2_1 ) ) ;
    public final void rule__QuestionDefinition__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7061:1: ( ( ( rule__QuestionDefinition__CurrentValueAssignment_3_2_1 ) ) )
            // InternalQL.g:7062:1: ( ( rule__QuestionDefinition__CurrentValueAssignment_3_2_1 ) )
            {
            // InternalQL.g:7062:1: ( ( rule__QuestionDefinition__CurrentValueAssignment_3_2_1 ) )
            // InternalQL.g:7063:2: ( rule__QuestionDefinition__CurrentValueAssignment_3_2_1 )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getCurrentValueAssignment_3_2_1()); 
            // InternalQL.g:7064:2: ( rule__QuestionDefinition__CurrentValueAssignment_3_2_1 )
            // InternalQL.g:7064:3: rule__QuestionDefinition__CurrentValueAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__CurrentValueAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionDefinitionAccess().getCurrentValueAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group_3_2__1__Impl"


    // $ANTLR start "rule__QuestionDefinition__Group_7__0"
    // InternalQL.g:7073:1: rule__QuestionDefinition__Group_7__0 : rule__QuestionDefinition__Group_7__0__Impl rule__QuestionDefinition__Group_7__1 ;
    public final void rule__QuestionDefinition__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7077:1: ( rule__QuestionDefinition__Group_7__0__Impl rule__QuestionDefinition__Group_7__1 )
            // InternalQL.g:7078:2: rule__QuestionDefinition__Group_7__0__Impl rule__QuestionDefinition__Group_7__1
            {
            pushFollow(FOLLOW_10);
            rule__QuestionDefinition__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group_7__0"


    // $ANTLR start "rule__QuestionDefinition__Group_7__0__Impl"
    // InternalQL.g:7085:1: rule__QuestionDefinition__Group_7__0__Impl : ( '=' ) ;
    public final void rule__QuestionDefinition__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7089:1: ( ( '=' ) )
            // InternalQL.g:7090:1: ( '=' )
            {
            // InternalQL.g:7090:1: ( '=' )
            // InternalQL.g:7091:2: '='
            {
             before(grammarAccess.getQuestionDefinitionAccess().getEqualsSignKeyword_7_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getQuestionDefinitionAccess().getEqualsSignKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group_7__0__Impl"


    // $ANTLR start "rule__QuestionDefinition__Group_7__1"
    // InternalQL.g:7100:1: rule__QuestionDefinition__Group_7__1 : rule__QuestionDefinition__Group_7__1__Impl rule__QuestionDefinition__Group_7__2 ;
    public final void rule__QuestionDefinition__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7104:1: ( rule__QuestionDefinition__Group_7__1__Impl rule__QuestionDefinition__Group_7__2 )
            // InternalQL.g:7105:2: rule__QuestionDefinition__Group_7__1__Impl rule__QuestionDefinition__Group_7__2
            {
            pushFollow(FOLLOW_63);
            rule__QuestionDefinition__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group_7__1"


    // $ANTLR start "rule__QuestionDefinition__Group_7__1__Impl"
    // InternalQL.g:7112:1: rule__QuestionDefinition__Group_7__1__Impl : ( ( rule__QuestionDefinition__ComputedExpressionAssignment_7_1 ) ) ;
    public final void rule__QuestionDefinition__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7116:1: ( ( ( rule__QuestionDefinition__ComputedExpressionAssignment_7_1 ) ) )
            // InternalQL.g:7117:1: ( ( rule__QuestionDefinition__ComputedExpressionAssignment_7_1 ) )
            {
            // InternalQL.g:7117:1: ( ( rule__QuestionDefinition__ComputedExpressionAssignment_7_1 ) )
            // InternalQL.g:7118:2: ( rule__QuestionDefinition__ComputedExpressionAssignment_7_1 )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getComputedExpressionAssignment_7_1()); 
            // InternalQL.g:7119:2: ( rule__QuestionDefinition__ComputedExpressionAssignment_7_1 )
            // InternalQL.g:7119:3: rule__QuestionDefinition__ComputedExpressionAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__ComputedExpressionAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionDefinitionAccess().getComputedExpressionAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group_7__1__Impl"


    // $ANTLR start "rule__QuestionDefinition__Group_7__2"
    // InternalQL.g:7127:1: rule__QuestionDefinition__Group_7__2 : rule__QuestionDefinition__Group_7__2__Impl ;
    public final void rule__QuestionDefinition__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7131:1: ( rule__QuestionDefinition__Group_7__2__Impl )
            // InternalQL.g:7132:2: rule__QuestionDefinition__Group_7__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__Group_7__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group_7__2"


    // $ANTLR start "rule__QuestionDefinition__Group_7__2__Impl"
    // InternalQL.g:7138:1: rule__QuestionDefinition__Group_7__2__Impl : ( ';' ) ;
    public final void rule__QuestionDefinition__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7142:1: ( ( ';' ) )
            // InternalQL.g:7143:1: ( ';' )
            {
            // InternalQL.g:7143:1: ( ';' )
            // InternalQL.g:7144:2: ';'
            {
             before(grammarAccess.getQuestionDefinitionAccess().getSemicolonKeyword_7_2()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getQuestionDefinitionAccess().getSemicolonKeyword_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group_7__2__Impl"


    // $ANTLR start "rule__QLModel__CanSubmitAssignment_2_1"
    // InternalQL.g:7154:1: rule__QLModel__CanSubmitAssignment_2_1 : ( ( 'canSubmit' ) ) ;
    public final void rule__QLModel__CanSubmitAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7158:1: ( ( ( 'canSubmit' ) ) )
            // InternalQL.g:7159:2: ( ( 'canSubmit' ) )
            {
            // InternalQL.g:7159:2: ( ( 'canSubmit' ) )
            // InternalQL.g:7160:3: ( 'canSubmit' )
            {
             before(grammarAccess.getQLModelAccess().getCanSubmitCanSubmitKeyword_2_1_0()); 
            // InternalQL.g:7161:3: ( 'canSubmit' )
            // InternalQL.g:7162:4: 'canSubmit'
            {
             before(grammarAccess.getQLModelAccess().getCanSubmitCanSubmitKeyword_2_1_0()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getQLModelAccess().getCanSubmitCanSubmitKeyword_2_1_0()); 

            }

             after(grammarAccess.getQLModelAccess().getCanSubmitCanSubmitKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__CanSubmitAssignment_2_1"


    // $ANTLR start "rule__QLModel__SubmitDateAssignment_2_2_1"
    // InternalQL.g:7173:1: rule__QLModel__SubmitDateAssignment_2_2_1 : ( ruleEDate ) ;
    public final void rule__QLModel__SubmitDateAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7177:1: ( ( ruleEDate ) )
            // InternalQL.g:7178:2: ( ruleEDate )
            {
            // InternalQL.g:7178:2: ( ruleEDate )
            // InternalQL.g:7179:3: ruleEDate
            {
             before(grammarAccess.getQLModelAccess().getSubmitDateEDateParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDate();

            state._fsp--;

             after(grammarAccess.getQLModelAccess().getSubmitDateEDateParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__SubmitDateAssignment_2_2_1"


    // $ANTLR start "rule__QLModel__DefinitionGroupAssignment_4_0"
    // InternalQL.g:7188:1: rule__QLModel__DefinitionGroupAssignment_4_0 : ( ruleDefinitionGroup ) ;
    public final void rule__QLModel__DefinitionGroupAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7192:1: ( ( ruleDefinitionGroup ) )
            // InternalQL.g:7193:2: ( ruleDefinitionGroup )
            {
            // InternalQL.g:7193:2: ( ruleDefinitionGroup )
            // InternalQL.g:7194:3: ruleDefinitionGroup
            {
             before(grammarAccess.getQLModelAccess().getDefinitionGroupDefinitionGroupParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDefinitionGroup();

            state._fsp--;

             after(grammarAccess.getQLModelAccess().getDefinitionGroupDefinitionGroupParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__DefinitionGroupAssignment_4_0"


    // $ANTLR start "rule__QLModel__FormsAssignment_4_1"
    // InternalQL.g:7203:1: rule__QLModel__FormsAssignment_4_1 : ( ruleForm ) ;
    public final void rule__QLModel__FormsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7207:1: ( ( ruleForm ) )
            // InternalQL.g:7208:2: ( ruleForm )
            {
            // InternalQL.g:7208:2: ( ruleForm )
            // InternalQL.g:7209:3: ruleForm
            {
             before(grammarAccess.getQLModelAccess().getFormsFormParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleForm();

            state._fsp--;

             after(grammarAccess.getQLModelAccess().getFormsFormParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__FormsAssignment_4_1"


    // $ANTLR start "rule__UnaryExpression__OperatorAssignment_1"
    // InternalQL.g:7218:1: rule__UnaryExpression__OperatorAssignment_1 : ( ruleUnaryOperatorKind ) ;
    public final void rule__UnaryExpression__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7222:1: ( ( ruleUnaryOperatorKind ) )
            // InternalQL.g:7223:2: ( ruleUnaryOperatorKind )
            {
            // InternalQL.g:7223:2: ( ruleUnaryOperatorKind )
            // InternalQL.g:7224:3: ruleUnaryOperatorKind
            {
             before(grammarAccess.getUnaryExpressionAccess().getOperatorUnaryOperatorKindEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnaryOperatorKind();

            state._fsp--;

             after(grammarAccess.getUnaryExpressionAccess().getOperatorUnaryOperatorKindEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__OperatorAssignment_1"


    // $ANTLR start "rule__UnaryExpression__OperandAssignment_2"
    // InternalQL.g:7233:1: rule__UnaryExpression__OperandAssignment_2 : ( ruleUnaryOrPrimaryExpression ) ;
    public final void rule__UnaryExpression__OperandAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7237:1: ( ( ruleUnaryOrPrimaryExpression ) )
            // InternalQL.g:7238:2: ( ruleUnaryOrPrimaryExpression )
            {
            // InternalQL.g:7238:2: ( ruleUnaryOrPrimaryExpression )
            // InternalQL.g:7239:3: ruleUnaryOrPrimaryExpression
            {
             before(grammarAccess.getUnaryExpressionAccess().getOperandUnaryOrPrimaryExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUnaryOrPrimaryExpression();

            state._fsp--;

             after(grammarAccess.getUnaryExpressionAccess().getOperandUnaryOrPrimaryExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__OperandAssignment_2"


    // $ANTLR start "rule__OrExpression__OperatorAssignment_1_1"
    // InternalQL.g:7248:1: rule__OrExpression__OperatorAssignment_1_1 : ( ruleOrOperatorKind ) ;
    public final void rule__OrExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7252:1: ( ( ruleOrOperatorKind ) )
            // InternalQL.g:7253:2: ( ruleOrOperatorKind )
            {
            // InternalQL.g:7253:2: ( ruleOrOperatorKind )
            // InternalQL.g:7254:3: ruleOrOperatorKind
            {
             before(grammarAccess.getOrExpressionAccess().getOperatorOrOperatorKindEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOrOperatorKind();

            state._fsp--;

             after(grammarAccess.getOrExpressionAccess().getOperatorOrOperatorKindEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__OrExpression__RhsOperandAssignment_1_2"
    // InternalQL.g:7263:1: rule__OrExpression__RhsOperandAssignment_1_2 : ( ruleAndExpression ) ;
    public final void rule__OrExpression__RhsOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7267:1: ( ( ruleAndExpression ) )
            // InternalQL.g:7268:2: ( ruleAndExpression )
            {
            // InternalQL.g:7268:2: ( ruleAndExpression )
            // InternalQL.g:7269:3: ruleAndExpression
            {
             before(grammarAccess.getOrExpressionAccess().getRhsOperandAndExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionAccess().getRhsOperandAndExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__RhsOperandAssignment_1_2"


    // $ANTLR start "rule__AndExpression__OperatorAssignment_1_1"
    // InternalQL.g:7278:1: rule__AndExpression__OperatorAssignment_1_1 : ( ruleAndOperatorKind ) ;
    public final void rule__AndExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7282:1: ( ( ruleAndOperatorKind ) )
            // InternalQL.g:7283:2: ( ruleAndOperatorKind )
            {
            // InternalQL.g:7283:2: ( ruleAndOperatorKind )
            // InternalQL.g:7284:3: ruleAndOperatorKind
            {
             before(grammarAccess.getAndExpressionAccess().getOperatorAndOperatorKindEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAndOperatorKind();

            state._fsp--;

             after(grammarAccess.getAndExpressionAccess().getOperatorAndOperatorKindEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__AndExpression__RhsOperandAssignment_1_2"
    // InternalQL.g:7293:1: rule__AndExpression__RhsOperandAssignment_1_2 : ( ruleEqualExpression ) ;
    public final void rule__AndExpression__RhsOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7297:1: ( ( ruleEqualExpression ) )
            // InternalQL.g:7298:2: ( ruleEqualExpression )
            {
            // InternalQL.g:7298:2: ( ruleEqualExpression )
            // InternalQL.g:7299:3: ruleEqualExpression
            {
             before(grammarAccess.getAndExpressionAccess().getRhsOperandEqualExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEqualExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionAccess().getRhsOperandEqualExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__RhsOperandAssignment_1_2"


    // $ANTLR start "rule__EqualExpression__OperatorAssignment_1_1"
    // InternalQL.g:7308:1: rule__EqualExpression__OperatorAssignment_1_1 : ( ruleEqualOperatorKind ) ;
    public final void rule__EqualExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7312:1: ( ( ruleEqualOperatorKind ) )
            // InternalQL.g:7313:2: ( ruleEqualOperatorKind )
            {
            // InternalQL.g:7313:2: ( ruleEqualOperatorKind )
            // InternalQL.g:7314:3: ruleEqualOperatorKind
            {
             before(grammarAccess.getEqualExpressionAccess().getOperatorEqualOperatorKindEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEqualOperatorKind();

            state._fsp--;

             after(grammarAccess.getEqualExpressionAccess().getOperatorEqualOperatorKindEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__EqualExpression__RhsOperandAssignment_1_2"
    // InternalQL.g:7323:1: rule__EqualExpression__RhsOperandAssignment_1_2 : ( ruleComparisionExpression ) ;
    public final void rule__EqualExpression__RhsOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7327:1: ( ( ruleComparisionExpression ) )
            // InternalQL.g:7328:2: ( ruleComparisionExpression )
            {
            // InternalQL.g:7328:2: ( ruleComparisionExpression )
            // InternalQL.g:7329:3: ruleComparisionExpression
            {
             before(grammarAccess.getEqualExpressionAccess().getRhsOperandComparisionExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComparisionExpression();

            state._fsp--;

             after(grammarAccess.getEqualExpressionAccess().getRhsOperandComparisionExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualExpression__RhsOperandAssignment_1_2"


    // $ANTLR start "rule__ComparisionExpression__OperatorAssignment_1_1"
    // InternalQL.g:7338:1: rule__ComparisionExpression__OperatorAssignment_1_1 : ( ruleComparisionOperatorKind ) ;
    public final void rule__ComparisionExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7342:1: ( ( ruleComparisionOperatorKind ) )
            // InternalQL.g:7343:2: ( ruleComparisionOperatorKind )
            {
            // InternalQL.g:7343:2: ( ruleComparisionOperatorKind )
            // InternalQL.g:7344:3: ruleComparisionOperatorKind
            {
             before(grammarAccess.getComparisionExpressionAccess().getOperatorComparisionOperatorKindEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComparisionOperatorKind();

            state._fsp--;

             after(grammarAccess.getComparisionExpressionAccess().getOperatorComparisionOperatorKindEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisionExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__ComparisionExpression__RhsOperandAssignment_1_2"
    // InternalQL.g:7353:1: rule__ComparisionExpression__RhsOperandAssignment_1_2 : ( ruleAdditionExpression ) ;
    public final void rule__ComparisionExpression__RhsOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7357:1: ( ( ruleAdditionExpression ) )
            // InternalQL.g:7358:2: ( ruleAdditionExpression )
            {
            // InternalQL.g:7358:2: ( ruleAdditionExpression )
            // InternalQL.g:7359:3: ruleAdditionExpression
            {
             before(grammarAccess.getComparisionExpressionAccess().getRhsOperandAdditionExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAdditionExpression();

            state._fsp--;

             after(grammarAccess.getComparisionExpressionAccess().getRhsOperandAdditionExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisionExpression__RhsOperandAssignment_1_2"


    // $ANTLR start "rule__AdditionExpression__OperatorAssignment_1_1"
    // InternalQL.g:7368:1: rule__AdditionExpression__OperatorAssignment_1_1 : ( ruleAdditionOperatorKind ) ;
    public final void rule__AdditionExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7372:1: ( ( ruleAdditionOperatorKind ) )
            // InternalQL.g:7373:2: ( ruleAdditionOperatorKind )
            {
            // InternalQL.g:7373:2: ( ruleAdditionOperatorKind )
            // InternalQL.g:7374:3: ruleAdditionOperatorKind
            {
             before(grammarAccess.getAdditionExpressionAccess().getOperatorAdditionOperatorKindEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAdditionOperatorKind();

            state._fsp--;

             after(grammarAccess.getAdditionExpressionAccess().getOperatorAdditionOperatorKindEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__AdditionExpression__RhsOperandAssignment_1_2"
    // InternalQL.g:7383:1: rule__AdditionExpression__RhsOperandAssignment_1_2 : ( ruleMultiplicationExpression ) ;
    public final void rule__AdditionExpression__RhsOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7387:1: ( ( ruleMultiplicationExpression ) )
            // InternalQL.g:7388:2: ( ruleMultiplicationExpression )
            {
            // InternalQL.g:7388:2: ( ruleMultiplicationExpression )
            // InternalQL.g:7389:3: ruleMultiplicationExpression
            {
             before(grammarAccess.getAdditionExpressionAccess().getRhsOperandMultiplicationExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicationExpression();

            state._fsp--;

             after(grammarAccess.getAdditionExpressionAccess().getRhsOperandMultiplicationExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__RhsOperandAssignment_1_2"


    // $ANTLR start "rule__MultiplicationExpression__OperatorAssignment_1_1"
    // InternalQL.g:7398:1: rule__MultiplicationExpression__OperatorAssignment_1_1 : ( ruleMultiplicationOperatorKind ) ;
    public final void rule__MultiplicationExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7402:1: ( ( ruleMultiplicationOperatorKind ) )
            // InternalQL.g:7403:2: ( ruleMultiplicationOperatorKind )
            {
            // InternalQL.g:7403:2: ( ruleMultiplicationOperatorKind )
            // InternalQL.g:7404:3: ruleMultiplicationOperatorKind
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getOperatorMultiplicationOperatorKindEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicationOperatorKind();

            state._fsp--;

             after(grammarAccess.getMultiplicationExpressionAccess().getOperatorMultiplicationOperatorKindEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__MultiplicationExpression__RhsOperandAssignment_1_2"
    // InternalQL.g:7413:1: rule__MultiplicationExpression__RhsOperandAssignment_1_2 : ( ruleUnaryOrPrimaryExpression ) ;
    public final void rule__MultiplicationExpression__RhsOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7417:1: ( ( ruleUnaryOrPrimaryExpression ) )
            // InternalQL.g:7418:2: ( ruleUnaryOrPrimaryExpression )
            {
            // InternalQL.g:7418:2: ( ruleUnaryOrPrimaryExpression )
            // InternalQL.g:7419:3: ruleUnaryOrPrimaryExpression
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getRhsOperandUnaryOrPrimaryExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUnaryOrPrimaryExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicationExpressionAccess().getRhsOperandUnaryOrPrimaryExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__RhsOperandAssignment_1_2"


    // $ANTLR start "rule__Form__NameAssignment_1"
    // InternalQL.g:7428:1: rule__Form__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Form__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7432:1: ( ( ruleEString ) )
            // InternalQL.g:7433:2: ( ruleEString )
            {
            // InternalQL.g:7433:2: ( ruleEString )
            // InternalQL.g:7434:3: ruleEString
            {
             before(grammarAccess.getFormAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFormAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__NameAssignment_1"


    // $ANTLR start "rule__Form__QuestionGroupAssignment_2"
    // InternalQL.g:7443:1: rule__Form__QuestionGroupAssignment_2 : ( ruleQuestionGroup ) ;
    public final void rule__Form__QuestionGroupAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7447:1: ( ( ruleQuestionGroup ) )
            // InternalQL.g:7448:2: ( ruleQuestionGroup )
            {
            // InternalQL.g:7448:2: ( ruleQuestionGroup )
            // InternalQL.g:7449:3: ruleQuestionGroup
            {
             before(grammarAccess.getFormAccess().getQuestionGroupQuestionGroupParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestionGroup();

            state._fsp--;

             after(grammarAccess.getFormAccess().getQuestionGroupQuestionGroupParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__QuestionGroupAssignment_2"


    // $ANTLR start "rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0"
    // InternalQL.g:7458:1: rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0 : ( ruleQuestionDefinition ) ;
    public final void rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7462:1: ( ( ruleQuestionDefinition ) )
            // InternalQL.g:7463:2: ( ruleQuestionDefinition )
            {
            // InternalQL.g:7463:2: ( ruleQuestionDefinition )
            // InternalQL.g:7464:3: ruleQuestionDefinition
            {
             before(grammarAccess.getDefinitionGroupAccess().getQuestionDefinitionsQuestionDefinitionParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestionDefinition();

            state._fsp--;

             after(grammarAccess.getDefinitionGroupAccess().getQuestionDefinitionsQuestionDefinitionParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionGroup__QuestionDefinitionsAssignment_3_0"


    // $ANTLR start "rule__DefinitionGroup__DataTypesAssignment_3_1"
    // InternalQL.g:7473:1: rule__DefinitionGroup__DataTypesAssignment_3_1 : ( ruleValueType ) ;
    public final void rule__DefinitionGroup__DataTypesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7477:1: ( ( ruleValueType ) )
            // InternalQL.g:7478:2: ( ruleValueType )
            {
            // InternalQL.g:7478:2: ( ruleValueType )
            // InternalQL.g:7479:3: ruleValueType
            {
             before(grammarAccess.getDefinitionGroupAccess().getDataTypesValueTypeParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValueType();

            state._fsp--;

             after(grammarAccess.getDefinitionGroupAccess().getDataTypesValueTypeParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionGroup__DataTypesAssignment_3_1"


    // $ANTLR start "rule__QuestionGroup__GuardAssignment_1_2"
    // InternalQL.g:7488:1: rule__QuestionGroup__GuardAssignment_1_2 : ( ruleExpression ) ;
    public final void rule__QuestionGroup__GuardAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7492:1: ( ( ruleExpression ) )
            // InternalQL.g:7493:2: ( ruleExpression )
            {
            // InternalQL.g:7493:2: ( ruleExpression )
            // InternalQL.g:7494:3: ruleExpression
            {
             before(grammarAccess.getQuestionGroupAccess().getGuardExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getQuestionGroupAccess().getGuardExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__GuardAssignment_1_2"


    // $ANTLR start "rule__QuestionGroup__QuestionGroupsAssignment_3_0"
    // InternalQL.g:7503:1: rule__QuestionGroup__QuestionGroupsAssignment_3_0 : ( ruleQuestionGroup ) ;
    public final void rule__QuestionGroup__QuestionGroupsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7507:1: ( ( ruleQuestionGroup ) )
            // InternalQL.g:7508:2: ( ruleQuestionGroup )
            {
            // InternalQL.g:7508:2: ( ruleQuestionGroup )
            // InternalQL.g:7509:3: ruleQuestionGroup
            {
             before(grammarAccess.getQuestionGroupAccess().getQuestionGroupsQuestionGroupParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestionGroup();

            state._fsp--;

             after(grammarAccess.getQuestionGroupAccess().getQuestionGroupsQuestionGroupParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__QuestionGroupsAssignment_3_0"


    // $ANTLR start "rule__QuestionGroup__QuestionsAssignment_3_1"
    // InternalQL.g:7518:1: rule__QuestionGroup__QuestionsAssignment_3_1 : ( ruleQuestion ) ;
    public final void rule__QuestionGroup__QuestionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7522:1: ( ( ruleQuestion ) )
            // InternalQL.g:7523:2: ( ruleQuestion )
            {
            // InternalQL.g:7523:2: ( ruleQuestion )
            // InternalQL.g:7524:3: ruleQuestion
            {
             before(grammarAccess.getQuestionGroupAccess().getQuestionsQuestionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionGroupAccess().getQuestionsQuestionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__QuestionsAssignment_3_1"


    // $ANTLR start "rule__Question__QuestionDefinitionAssignment"
    // InternalQL.g:7533:1: rule__Question__QuestionDefinitionAssignment : ( ( ruleEString ) ) ;
    public final void rule__Question__QuestionDefinitionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7537:1: ( ( ( ruleEString ) ) )
            // InternalQL.g:7538:2: ( ( ruleEString ) )
            {
            // InternalQL.g:7538:2: ( ( ruleEString ) )
            // InternalQL.g:7539:3: ( ruleEString )
            {
             before(grammarAccess.getQuestionAccess().getQuestionDefinitionQuestionDefinitionCrossReference_0()); 
            // InternalQL.g:7540:3: ( ruleEString )
            // InternalQL.g:7541:4: ruleEString
            {
             before(grammarAccess.getQuestionAccess().getQuestionDefinitionQuestionDefinitionEStringParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getQuestionDefinitionQuestionDefinitionEStringParserRuleCall_0_1()); 

            }

             after(grammarAccess.getQuestionAccess().getQuestionDefinitionQuestionDefinitionCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__QuestionDefinitionAssignment"


    // $ANTLR start "rule__ValueType_Impl__NameAssignment_2"
    // InternalQL.g:7552:1: rule__ValueType_Impl__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ValueType_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7556:1: ( ( ruleEString ) )
            // InternalQL.g:7557:2: ( ruleEString )
            {
            // InternalQL.g:7557:2: ( ruleEString )
            // InternalQL.g:7558:3: ruleEString
            {
             before(grammarAccess.getValueType_ImplAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getValueType_ImplAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueType_Impl__NameAssignment_2"


    // $ANTLR start "rule__ValueType_Impl__UnitAssignment_4_1"
    // InternalQL.g:7567:1: rule__ValueType_Impl__UnitAssignment_4_1 : ( ruleEString ) ;
    public final void rule__ValueType_Impl__UnitAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7571:1: ( ( ruleEString ) )
            // InternalQL.g:7572:2: ( ruleEString )
            {
            // InternalQL.g:7572:2: ( ruleEString )
            // InternalQL.g:7573:3: ruleEString
            {
             before(grammarAccess.getValueType_ImplAccess().getUnitEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getValueType_ImplAccess().getUnitEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueType_Impl__UnitAssignment_4_1"


    // $ANTLR start "rule__ConstantCall__ValueAssignment_1"
    // InternalQL.g:7582:1: rule__ConstantCall__ValueAssignment_1 : ( ( rule__ConstantCall__ValueAlternatives_1_0 ) ) ;
    public final void rule__ConstantCall__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7586:1: ( ( ( rule__ConstantCall__ValueAlternatives_1_0 ) ) )
            // InternalQL.g:7587:2: ( ( rule__ConstantCall__ValueAlternatives_1_0 ) )
            {
            // InternalQL.g:7587:2: ( ( rule__ConstantCall__ValueAlternatives_1_0 ) )
            // InternalQL.g:7588:3: ( rule__ConstantCall__ValueAlternatives_1_0 )
            {
             before(grammarAccess.getConstantCallAccess().getValueAlternatives_1_0()); 
            // InternalQL.g:7589:3: ( rule__ConstantCall__ValueAlternatives_1_0 )
            // InternalQL.g:7589:4: rule__ConstantCall__ValueAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ConstantCall__ValueAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getConstantCallAccess().getValueAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantCall__ValueAssignment_1"


    // $ANTLR start "rule__QuestionCall__QuestionAssignment_1"
    // InternalQL.g:7597:1: rule__QuestionCall__QuestionAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__QuestionCall__QuestionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7601:1: ( ( ( ruleEString ) ) )
            // InternalQL.g:7602:2: ( ( ruleEString ) )
            {
            // InternalQL.g:7602:2: ( ( ruleEString ) )
            // InternalQL.g:7603:3: ( ruleEString )
            {
             before(grammarAccess.getQuestionCallAccess().getQuestionQuestionDefinitionCrossReference_1_0()); 
            // InternalQL.g:7604:3: ( ruleEString )
            // InternalQL.g:7605:4: ruleEString
            {
             before(grammarAccess.getQuestionCallAccess().getQuestionQuestionDefinitionEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestionCallAccess().getQuestionQuestionDefinitionEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getQuestionCallAccess().getQuestionQuestionDefinitionCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionCall__QuestionAssignment_1"


    // $ANTLR start "rule__BooleanValueType__NameAssignment_2"
    // InternalQL.g:7616:1: rule__BooleanValueType__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__BooleanValueType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7620:1: ( ( ruleEString ) )
            // InternalQL.g:7621:2: ( ruleEString )
            {
            // InternalQL.g:7621:2: ( ruleEString )
            // InternalQL.g:7622:3: ruleEString
            {
             before(grammarAccess.getBooleanValueTypeAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBooleanValueTypeAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueType__NameAssignment_2"


    // $ANTLR start "rule__BooleanValueType__UnitAssignment_3_1_1"
    // InternalQL.g:7631:1: rule__BooleanValueType__UnitAssignment_3_1_1 : ( ruleEString ) ;
    public final void rule__BooleanValueType__UnitAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7635:1: ( ( ruleEString ) )
            // InternalQL.g:7636:2: ( ruleEString )
            {
            // InternalQL.g:7636:2: ( ruleEString )
            // InternalQL.g:7637:3: ruleEString
            {
             before(grammarAccess.getBooleanValueTypeAccess().getUnitEStringParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBooleanValueTypeAccess().getUnitEStringParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueType__UnitAssignment_3_1_1"


    // $ANTLR start "rule__IntegerValueType__NameAssignment_2"
    // InternalQL.g:7646:1: rule__IntegerValueType__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__IntegerValueType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7650:1: ( ( ruleEString ) )
            // InternalQL.g:7651:2: ( ruleEString )
            {
            // InternalQL.g:7651:2: ( ruleEString )
            // InternalQL.g:7652:3: ruleEString
            {
             before(grammarAccess.getIntegerValueTypeAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getIntegerValueTypeAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__NameAssignment_2"


    // $ANTLR start "rule__IntegerValueType__UnitAssignment_3_1_1"
    // InternalQL.g:7661:1: rule__IntegerValueType__UnitAssignment_3_1_1 : ( ruleEString ) ;
    public final void rule__IntegerValueType__UnitAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7665:1: ( ( ruleEString ) )
            // InternalQL.g:7666:2: ( ruleEString )
            {
            // InternalQL.g:7666:2: ( ruleEString )
            // InternalQL.g:7667:3: ruleEString
            {
             before(grammarAccess.getIntegerValueTypeAccess().getUnitEStringParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getIntegerValueTypeAccess().getUnitEStringParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__UnitAssignment_3_1_1"


    // $ANTLR start "rule__IntegerValueType__MinAssignment_3_2_1"
    // InternalQL.g:7676:1: rule__IntegerValueType__MinAssignment_3_2_1 : ( ruleEInt ) ;
    public final void rule__IntegerValueType__MinAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7680:1: ( ( ruleEInt ) )
            // InternalQL.g:7681:2: ( ruleEInt )
            {
            // InternalQL.g:7681:2: ( ruleEInt )
            // InternalQL.g:7682:3: ruleEInt
            {
             before(grammarAccess.getIntegerValueTypeAccess().getMinEIntParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getIntegerValueTypeAccess().getMinEIntParserRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__MinAssignment_3_2_1"


    // $ANTLR start "rule__IntegerValueType__MaxAssignment_3_3_1"
    // InternalQL.g:7691:1: rule__IntegerValueType__MaxAssignment_3_3_1 : ( ruleEInt ) ;
    public final void rule__IntegerValueType__MaxAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7695:1: ( ( ruleEInt ) )
            // InternalQL.g:7696:2: ( ruleEInt )
            {
            // InternalQL.g:7696:2: ( ruleEInt )
            // InternalQL.g:7697:3: ruleEInt
            {
             before(grammarAccess.getIntegerValueTypeAccess().getMaxEIntParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getIntegerValueTypeAccess().getMaxEIntParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__MaxAssignment_3_3_1"


    // $ANTLR start "rule__DecimalValueType__NameAssignment_2"
    // InternalQL.g:7706:1: rule__DecimalValueType__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__DecimalValueType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7710:1: ( ( ruleEString ) )
            // InternalQL.g:7711:2: ( ruleEString )
            {
            // InternalQL.g:7711:2: ( ruleEString )
            // InternalQL.g:7712:3: ruleEString
            {
             before(grammarAccess.getDecimalValueTypeAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDecimalValueTypeAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueType__NameAssignment_2"


    // $ANTLR start "rule__DecimalValueType__UnitAssignment_3_1_1"
    // InternalQL.g:7721:1: rule__DecimalValueType__UnitAssignment_3_1_1 : ( ruleEString ) ;
    public final void rule__DecimalValueType__UnitAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7725:1: ( ( ruleEString ) )
            // InternalQL.g:7726:2: ( ruleEString )
            {
            // InternalQL.g:7726:2: ( ruleEString )
            // InternalQL.g:7727:3: ruleEString
            {
             before(grammarAccess.getDecimalValueTypeAccess().getUnitEStringParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDecimalValueTypeAccess().getUnitEStringParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueType__UnitAssignment_3_1_1"


    // $ANTLR start "rule__DateValueType__NameAssignment_2"
    // InternalQL.g:7736:1: rule__DateValueType__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__DateValueType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7740:1: ( ( ruleEString ) )
            // InternalQL.g:7741:2: ( ruleEString )
            {
            // InternalQL.g:7741:2: ( ruleEString )
            // InternalQL.g:7742:3: ruleEString
            {
             before(grammarAccess.getDateValueTypeAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDateValueTypeAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValueType__NameAssignment_2"


    // $ANTLR start "rule__DateValueType__UnitAssignment_3_1_1"
    // InternalQL.g:7751:1: rule__DateValueType__UnitAssignment_3_1_1 : ( ruleEString ) ;
    public final void rule__DateValueType__UnitAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7755:1: ( ( ruleEString ) )
            // InternalQL.g:7756:2: ( ruleEString )
            {
            // InternalQL.g:7756:2: ( ruleEString )
            // InternalQL.g:7757:3: ruleEString
            {
             before(grammarAccess.getDateValueTypeAccess().getUnitEStringParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDateValueTypeAccess().getUnitEStringParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValueType__UnitAssignment_3_1_1"


    // $ANTLR start "rule__EnumerationValueType__NameAssignment_2"
    // InternalQL.g:7766:1: rule__EnumerationValueType__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__EnumerationValueType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7770:1: ( ( ruleEString ) )
            // InternalQL.g:7771:2: ( ruleEString )
            {
            // InternalQL.g:7771:2: ( ruleEString )
            // InternalQL.g:7772:3: ruleEString
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEnumerationValueTypeAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__NameAssignment_2"


    // $ANTLR start "rule__EnumerationValueType__UnitAssignment_3_1_1"
    // InternalQL.g:7781:1: rule__EnumerationValueType__UnitAssignment_3_1_1 : ( ruleEString ) ;
    public final void rule__EnumerationValueType__UnitAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7785:1: ( ( ruleEString ) )
            // InternalQL.g:7786:2: ( ruleEString )
            {
            // InternalQL.g:7786:2: ( ruleEString )
            // InternalQL.g:7787:3: ruleEString
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getUnitEStringParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEnumerationValueTypeAccess().getUnitEStringParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__UnitAssignment_3_1_1"


    // $ANTLR start "rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_2"
    // InternalQL.g:7796:1: rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_2 : ( ruleEnumerationLiteral ) ;
    public final void rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7800:1: ( ( ruleEnumerationLiteral ) )
            // InternalQL.g:7801:2: ( ruleEnumerationLiteral )
            {
            // InternalQL.g:7801:2: ( ruleEnumerationLiteral )
            // InternalQL.g:7802:3: ruleEnumerationLiteral
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getEnumerationLiteralsEnumerationLiteralParserRuleCall_3_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumerationLiteral();

            state._fsp--;

             after(grammarAccess.getEnumerationValueTypeAccess().getEnumerationLiteralsEnumerationLiteralParserRuleCall_3_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_2"


    // $ANTLR start "rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_3_1"
    // InternalQL.g:7811:1: rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_3_1 : ( ruleEnumerationLiteral ) ;
    public final void rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7815:1: ( ( ruleEnumerationLiteral ) )
            // InternalQL.g:7816:2: ( ruleEnumerationLiteral )
            {
            // InternalQL.g:7816:2: ( ruleEnumerationLiteral )
            // InternalQL.g:7817:3: ruleEnumerationLiteral
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getEnumerationLiteralsEnumerationLiteralParserRuleCall_3_2_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumerationLiteral();

            state._fsp--;

             after(grammarAccess.getEnumerationValueTypeAccess().getEnumerationLiteralsEnumerationLiteralParserRuleCall_3_2_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__EnumerationLiteralsAssignment_3_2_3_1"


    // $ANTLR start "rule__StringValueType__NameAssignment_2"
    // InternalQL.g:7826:1: rule__StringValueType__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__StringValueType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7830:1: ( ( ruleEString ) )
            // InternalQL.g:7831:2: ( ruleEString )
            {
            // InternalQL.g:7831:2: ( ruleEString )
            // InternalQL.g:7832:3: ruleEString
            {
             before(grammarAccess.getStringValueTypeAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStringValueTypeAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueType__NameAssignment_2"


    // $ANTLR start "rule__StringValueType__UnitAssignment_3_1_1"
    // InternalQL.g:7841:1: rule__StringValueType__UnitAssignment_3_1_1 : ( ruleEString ) ;
    public final void rule__StringValueType__UnitAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7845:1: ( ( ruleEString ) )
            // InternalQL.g:7846:2: ( ruleEString )
            {
            // InternalQL.g:7846:2: ( ruleEString )
            // InternalQL.g:7847:3: ruleEString
            {
             before(grammarAccess.getStringValueTypeAccess().getUnitEStringParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStringValueTypeAccess().getUnitEStringParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueType__UnitAssignment_3_1_1"


    // $ANTLR start "rule__EnumerationLiteral__NameAssignment_1"
    // InternalQL.g:7856:1: rule__EnumerationLiteral__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__EnumerationLiteral__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7860:1: ( ( ruleEString ) )
            // InternalQL.g:7861:2: ( ruleEString )
            {
            // InternalQL.g:7861:2: ( ruleEString )
            // InternalQL.g:7862:3: ruleEString
            {
             before(grammarAccess.getEnumerationLiteralAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEnumerationLiteralAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__NameAssignment_1"


    // $ANTLR start "rule__IntegerValue__IntValueAssignment_3_1"
    // InternalQL.g:7871:1: rule__IntegerValue__IntValueAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__IntegerValue__IntValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7875:1: ( ( ruleEInt ) )
            // InternalQL.g:7876:2: ( ruleEInt )
            {
            // InternalQL.g:7876:2: ( ruleEInt )
            // InternalQL.g:7877:3: ruleEInt
            {
             before(grammarAccess.getIntegerValueAccess().getIntValueEIntParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getIntegerValueAccess().getIntValueEIntParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValue__IntValueAssignment_3_1"


    // $ANTLR start "rule__StringValue__StringValueAssignment_3_1"
    // InternalQL.g:7886:1: rule__StringValue__StringValueAssignment_3_1 : ( ruleEString ) ;
    public final void rule__StringValue__StringValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7890:1: ( ( ruleEString ) )
            // InternalQL.g:7891:2: ( ruleEString )
            {
            // InternalQL.g:7891:2: ( ruleEString )
            // InternalQL.g:7892:3: ruleEString
            {
             before(grammarAccess.getStringValueAccess().getStringValueEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStringValueAccess().getStringValueEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__StringValueAssignment_3_1"


    // $ANTLR start "rule__BooleanValue__BooleanValueAssignment_1"
    // InternalQL.g:7901:1: rule__BooleanValue__BooleanValueAssignment_1 : ( ( 'booleanValue' ) ) ;
    public final void rule__BooleanValue__BooleanValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7905:1: ( ( ( 'booleanValue' ) ) )
            // InternalQL.g:7906:2: ( ( 'booleanValue' ) )
            {
            // InternalQL.g:7906:2: ( ( 'booleanValue' ) )
            // InternalQL.g:7907:3: ( 'booleanValue' )
            {
             before(grammarAccess.getBooleanValueAccess().getBooleanValueBooleanValueKeyword_1_0()); 
            // InternalQL.g:7908:3: ( 'booleanValue' )
            // InternalQL.g:7909:4: 'booleanValue'
            {
             before(grammarAccess.getBooleanValueAccess().getBooleanValueBooleanValueKeyword_1_0()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getBooleanValueAccess().getBooleanValueBooleanValueKeyword_1_0()); 

            }

             after(grammarAccess.getBooleanValueAccess().getBooleanValueBooleanValueKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__BooleanValueAssignment_1"


    // $ANTLR start "rule__DateValue__DateValueAssignment_3_1"
    // InternalQL.g:7920:1: rule__DateValue__DateValueAssignment_3_1 : ( ruleEDate ) ;
    public final void rule__DateValue__DateValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7924:1: ( ( ruleEDate ) )
            // InternalQL.g:7925:2: ( ruleEDate )
            {
            // InternalQL.g:7925:2: ( ruleEDate )
            // InternalQL.g:7926:3: ruleEDate
            {
             before(grammarAccess.getDateValueAccess().getDateValueEDateParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDate();

            state._fsp--;

             after(grammarAccess.getDateValueAccess().getDateValueEDateParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValue__DateValueAssignment_3_1"


    // $ANTLR start "rule__DecimalValue__DecimalValueAssignment_3_1"
    // InternalQL.g:7935:1: rule__DecimalValue__DecimalValueAssignment_3_1 : ( ruleEFloat ) ;
    public final void rule__DecimalValue__DecimalValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7939:1: ( ( ruleEFloat ) )
            // InternalQL.g:7940:2: ( ruleEFloat )
            {
            // InternalQL.g:7940:2: ( ruleEFloat )
            // InternalQL.g:7941:3: ruleEFloat
            {
             before(grammarAccess.getDecimalValueAccess().getDecimalValueEFloatParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getDecimalValueAccess().getDecimalValueEFloatParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValue__DecimalValueAssignment_3_1"


    // $ANTLR start "rule__QuestionDefinition__IsMandatoryAssignment_0"
    // InternalQL.g:7950:1: rule__QuestionDefinition__IsMandatoryAssignment_0 : ( ( 'mandatory' ) ) ;
    public final void rule__QuestionDefinition__IsMandatoryAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7954:1: ( ( ( 'mandatory' ) ) )
            // InternalQL.g:7955:2: ( ( 'mandatory' ) )
            {
            // InternalQL.g:7955:2: ( ( 'mandatory' ) )
            // InternalQL.g:7956:3: ( 'mandatory' )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getIsMandatoryMandatoryKeyword_0_0()); 
            // InternalQL.g:7957:3: ( 'mandatory' )
            // InternalQL.g:7958:4: 'mandatory'
            {
             before(grammarAccess.getQuestionDefinitionAccess().getIsMandatoryMandatoryKeyword_0_0()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getQuestionDefinitionAccess().getIsMandatoryMandatoryKeyword_0_0()); 

            }

             after(grammarAccess.getQuestionDefinitionAccess().getIsMandatoryMandatoryKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__IsMandatoryAssignment_0"


    // $ANTLR start "rule__QuestionDefinition__NameAssignment_2"
    // InternalQL.g:7969:1: rule__QuestionDefinition__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__QuestionDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7973:1: ( ( ruleEString ) )
            // InternalQL.g:7974:2: ( ruleEString )
            {
            // InternalQL.g:7974:2: ( ruleEString )
            // InternalQL.g:7975:3: ruleEString
            {
             before(grammarAccess.getQuestionDefinitionAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestionDefinitionAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__NameAssignment_2"


    // $ANTLR start "rule__QuestionDefinition__IsDisplayedAssignment_3_1"
    // InternalQL.g:7984:1: rule__QuestionDefinition__IsDisplayedAssignment_3_1 : ( ( 'isDisplayed' ) ) ;
    public final void rule__QuestionDefinition__IsDisplayedAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7988:1: ( ( ( 'isDisplayed' ) ) )
            // InternalQL.g:7989:2: ( ( 'isDisplayed' ) )
            {
            // InternalQL.g:7989:2: ( ( 'isDisplayed' ) )
            // InternalQL.g:7990:3: ( 'isDisplayed' )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getIsDisplayedIsDisplayedKeyword_3_1_0()); 
            // InternalQL.g:7991:3: ( 'isDisplayed' )
            // InternalQL.g:7992:4: 'isDisplayed'
            {
             before(grammarAccess.getQuestionDefinitionAccess().getIsDisplayedIsDisplayedKeyword_3_1_0()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getQuestionDefinitionAccess().getIsDisplayedIsDisplayedKeyword_3_1_0()); 

            }

             after(grammarAccess.getQuestionDefinitionAccess().getIsDisplayedIsDisplayedKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__IsDisplayedAssignment_3_1"


    // $ANTLR start "rule__QuestionDefinition__CurrentValueAssignment_3_2_1"
    // InternalQL.g:8003:1: rule__QuestionDefinition__CurrentValueAssignment_3_2_1 : ( ruleValue ) ;
    public final void rule__QuestionDefinition__CurrentValueAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8007:1: ( ( ruleValue ) )
            // InternalQL.g:8008:2: ( ruleValue )
            {
            // InternalQL.g:8008:2: ( ruleValue )
            // InternalQL.g:8009:3: ruleValue
            {
             before(grammarAccess.getQuestionDefinitionAccess().getCurrentValueValueParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getQuestionDefinitionAccess().getCurrentValueValueParserRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__CurrentValueAssignment_3_2_1"


    // $ANTLR start "rule__QuestionDefinition__LabelAssignment_5"
    // InternalQL.g:8018:1: rule__QuestionDefinition__LabelAssignment_5 : ( ruleEString ) ;
    public final void rule__QuestionDefinition__LabelAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8022:1: ( ( ruleEString ) )
            // InternalQL.g:8023:2: ( ruleEString )
            {
            // InternalQL.g:8023:2: ( ruleEString )
            // InternalQL.g:8024:3: ruleEString
            {
             before(grammarAccess.getQuestionDefinitionAccess().getLabelEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestionDefinitionAccess().getLabelEStringParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__LabelAssignment_5"


    // $ANTLR start "rule__QuestionDefinition__DataTypeAssignment_6"
    // InternalQL.g:8033:1: rule__QuestionDefinition__DataTypeAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__QuestionDefinition__DataTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8037:1: ( ( ( ruleEString ) ) )
            // InternalQL.g:8038:2: ( ( ruleEString ) )
            {
            // InternalQL.g:8038:2: ( ( ruleEString ) )
            // InternalQL.g:8039:3: ( ruleEString )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getDataTypeValueTypeCrossReference_6_0()); 
            // InternalQL.g:8040:3: ( ruleEString )
            // InternalQL.g:8041:4: ruleEString
            {
             before(grammarAccess.getQuestionDefinitionAccess().getDataTypeValueTypeEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestionDefinitionAccess().getDataTypeValueTypeEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getQuestionDefinitionAccess().getDataTypeValueTypeCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__DataTypeAssignment_6"


    // $ANTLR start "rule__QuestionDefinition__ComputedExpressionAssignment_7_1"
    // InternalQL.g:8052:1: rule__QuestionDefinition__ComputedExpressionAssignment_7_1 : ( ruleExpression ) ;
    public final void rule__QuestionDefinition__ComputedExpressionAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8056:1: ( ( ruleExpression ) )
            // InternalQL.g:8057:2: ( ruleExpression )
            {
            // InternalQL.g:8057:2: ( ruleExpression )
            // InternalQL.g:8058:3: ruleExpression
            {
             before(grammarAccess.getQuestionDefinitionAccess().getComputedExpressionExpressionParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getQuestionDefinitionAccess().getComputedExpressionExpressionParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__ComputedExpressionAssignment_7_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000310000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000C0000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0xA800020060000030L,0x0000000000000404L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0xA800020000000030L,0x0000000000000404L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000003C00000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000003C00000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000A0000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0xA800000000000030L,0x0000000000000404L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000408000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x04E6810000000000L,0x0000000000000820L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x04E6800000000002L,0x0000000000000820L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0xA800418000000030L,0x0000000000000404L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0xA800408000000032L,0x0000000000000404L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0001010000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0xA800000000000000L,0x0000000000000404L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0019010000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0101010000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0200010000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x04E6800000000000L,0x0000000000000820L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x1000010000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x4000010000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000010000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000010000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000020000040L,0x0000000000000010L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000820L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000040000000000L,0x0000000000001080L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0xA800000000000000L,0x0000000000000405L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});

}