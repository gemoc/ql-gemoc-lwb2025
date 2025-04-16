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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'EDate'", "'E'", "'e'", "'PLUS'", "'MINUS'", "'MULT'", "'DIV'", "'EQUAL'", "'NOTEQUAL'", "'GREATER'", "'LOWER'", "'GREATEROREQUAL'", "'LOWEROREQUAL'", "'AND'", "'OR'", "'UNARYMINUS'", "'NOT'", "'QLModel'", "'{'", "'}'", "'submitDate'", "'forms'", "','", "'definitionGroup'", "'Form'", "'questionGroup'", "'DefinitionGroup'", "'dataTypes'", "'questionDefinitions'", "'QuestionGroup'", "'guard'", "'questionGroups'", "'questions'", "'Question'", "'questionDefinition'", "'ValueType'", "'unit'", "'BasicBinaryExpression'", "'operator'", "'lhsOperand'", "'rhsOperand'", "'resultType'", "'ConstantCall'", "'value'", "'BasicUnaryExpression'", "'operand'", "'QuestionCall'", "'question'", "'BooleanValueType'", "'IntegerValueType'", "'min'", "'max'", "'DecimalValueType'", "'DateValueType'", "'EnumerationValueType'", "'enumerationLiterals'", "'StringValueType'", "'-'", "'EnumerationLiteral'", "'IntegerValue'", "'intValue'", "'StringValue'", "'stringValue'", "'BooleanValue'", "'DateValue'", "'dateValue'", "'DecimalValue'", "'decimalValue'", "'.'", "'QuestionDefinition'", "'dataType'", "'label'", "'computedExpression'", "'currentValue'", "'canSubmit'", "'booleanValue'", "'isDisplayed'", "'isMandatory'"
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
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__88=88;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
    public static final int T__41=41;
    public static final int T__85=85;
    public static final int T__42=42;
    public static final int T__86=86;
    public static final int T__43=43;
    public static final int T__87=87;

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
    // InternalQL.g:112:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:116:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalQL.g:117:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalQL.g:117:2: ( ( rule__Expression__Alternatives ) )
            // InternalQL.g:118:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalQL.g:119:3: ( rule__Expression__Alternatives )
            // InternalQL.g:119:4: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleValue"
    // InternalQL.g:128:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalQL.g:129:1: ( ruleValue EOF )
            // InternalQL.g:130:1: ruleValue EOF
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
    // InternalQL.g:137:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:141:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalQL.g:142:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalQL.g:142:2: ( ( rule__Value__Alternatives ) )
            // InternalQL.g:143:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalQL.g:144:3: ( rule__Value__Alternatives )
            // InternalQL.g:144:4: rule__Value__Alternatives
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
    // InternalQL.g:153:1: entryRuleForm : ruleForm EOF ;
    public final void entryRuleForm() throws RecognitionException {
        try {
            // InternalQL.g:154:1: ( ruleForm EOF )
            // InternalQL.g:155:1: ruleForm EOF
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
    // InternalQL.g:162:1: ruleForm : ( ( rule__Form__Group__0 ) ) ;
    public final void ruleForm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:166:2: ( ( ( rule__Form__Group__0 ) ) )
            // InternalQL.g:167:2: ( ( rule__Form__Group__0 ) )
            {
            // InternalQL.g:167:2: ( ( rule__Form__Group__0 ) )
            // InternalQL.g:168:3: ( rule__Form__Group__0 )
            {
             before(grammarAccess.getFormAccess().getGroup()); 
            // InternalQL.g:169:3: ( rule__Form__Group__0 )
            // InternalQL.g:169:4: rule__Form__Group__0
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
    // InternalQL.g:178:1: entryRuleDefinitionGroup : ruleDefinitionGroup EOF ;
    public final void entryRuleDefinitionGroup() throws RecognitionException {
        try {
            // InternalQL.g:179:1: ( ruleDefinitionGroup EOF )
            // InternalQL.g:180:1: ruleDefinitionGroup EOF
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
    // InternalQL.g:187:1: ruleDefinitionGroup : ( ( rule__DefinitionGroup__Group__0 ) ) ;
    public final void ruleDefinitionGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:191:2: ( ( ( rule__DefinitionGroup__Group__0 ) ) )
            // InternalQL.g:192:2: ( ( rule__DefinitionGroup__Group__0 ) )
            {
            // InternalQL.g:192:2: ( ( rule__DefinitionGroup__Group__0 ) )
            // InternalQL.g:193:3: ( rule__DefinitionGroup__Group__0 )
            {
             before(grammarAccess.getDefinitionGroupAccess().getGroup()); 
            // InternalQL.g:194:3: ( rule__DefinitionGroup__Group__0 )
            // InternalQL.g:194:4: rule__DefinitionGroup__Group__0
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
    // InternalQL.g:203:1: entryRuleEDate : ruleEDate EOF ;
    public final void entryRuleEDate() throws RecognitionException {
        try {
            // InternalQL.g:204:1: ( ruleEDate EOF )
            // InternalQL.g:205:1: ruleEDate EOF
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
    // InternalQL.g:212:1: ruleEDate : ( 'EDate' ) ;
    public final void ruleEDate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:216:2: ( ( 'EDate' ) )
            // InternalQL.g:217:2: ( 'EDate' )
            {
            // InternalQL.g:217:2: ( 'EDate' )
            // InternalQL.g:218:3: 'EDate'
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
    // InternalQL.g:228:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalQL.g:229:1: ( ruleEString EOF )
            // InternalQL.g:230:1: ruleEString EOF
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
    // InternalQL.g:237:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:241:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalQL.g:242:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalQL.g:242:2: ( ( rule__EString__Alternatives ) )
            // InternalQL.g:243:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalQL.g:244:3: ( rule__EString__Alternatives )
            // InternalQL.g:244:4: rule__EString__Alternatives
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
    // InternalQL.g:253:1: entryRuleQuestionGroup : ruleQuestionGroup EOF ;
    public final void entryRuleQuestionGroup() throws RecognitionException {
        try {
            // InternalQL.g:254:1: ( ruleQuestionGroup EOF )
            // InternalQL.g:255:1: ruleQuestionGroup EOF
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
    // InternalQL.g:262:1: ruleQuestionGroup : ( ( rule__QuestionGroup__Group__0 ) ) ;
    public final void ruleQuestionGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:266:2: ( ( ( rule__QuestionGroup__Group__0 ) ) )
            // InternalQL.g:267:2: ( ( rule__QuestionGroup__Group__0 ) )
            {
            // InternalQL.g:267:2: ( ( rule__QuestionGroup__Group__0 ) )
            // InternalQL.g:268:3: ( rule__QuestionGroup__Group__0 )
            {
             before(grammarAccess.getQuestionGroupAccess().getGroup()); 
            // InternalQL.g:269:3: ( rule__QuestionGroup__Group__0 )
            // InternalQL.g:269:4: rule__QuestionGroup__Group__0
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
    // InternalQL.g:278:1: entryRuleQuestion : ruleQuestion EOF ;
    public final void entryRuleQuestion() throws RecognitionException {
        try {
            // InternalQL.g:279:1: ( ruleQuestion EOF )
            // InternalQL.g:280:1: ruleQuestion EOF
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
    // InternalQL.g:287:1: ruleQuestion : ( ( rule__Question__Group__0 ) ) ;
    public final void ruleQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:291:2: ( ( ( rule__Question__Group__0 ) ) )
            // InternalQL.g:292:2: ( ( rule__Question__Group__0 ) )
            {
            // InternalQL.g:292:2: ( ( rule__Question__Group__0 ) )
            // InternalQL.g:293:3: ( rule__Question__Group__0 )
            {
             before(grammarAccess.getQuestionAccess().getGroup()); 
            // InternalQL.g:294:3: ( rule__Question__Group__0 )
            // InternalQL.g:294:4: rule__Question__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Question__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getGroup()); 

            }


            }

        }
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
    // InternalQL.g:303:1: entryRuleValueType_Impl : ruleValueType_Impl EOF ;
    public final void entryRuleValueType_Impl() throws RecognitionException {
        try {
            // InternalQL.g:304:1: ( ruleValueType_Impl EOF )
            // InternalQL.g:305:1: ruleValueType_Impl EOF
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
    // InternalQL.g:312:1: ruleValueType_Impl : ( ( rule__ValueType_Impl__Group__0 ) ) ;
    public final void ruleValueType_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:316:2: ( ( ( rule__ValueType_Impl__Group__0 ) ) )
            // InternalQL.g:317:2: ( ( rule__ValueType_Impl__Group__0 ) )
            {
            // InternalQL.g:317:2: ( ( rule__ValueType_Impl__Group__0 ) )
            // InternalQL.g:318:3: ( rule__ValueType_Impl__Group__0 )
            {
             before(grammarAccess.getValueType_ImplAccess().getGroup()); 
            // InternalQL.g:319:3: ( rule__ValueType_Impl__Group__0 )
            // InternalQL.g:319:4: rule__ValueType_Impl__Group__0
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


    // $ANTLR start "entryRuleBasicBinaryExpression"
    // InternalQL.g:328:1: entryRuleBasicBinaryExpression : ruleBasicBinaryExpression EOF ;
    public final void entryRuleBasicBinaryExpression() throws RecognitionException {
        try {
            // InternalQL.g:329:1: ( ruleBasicBinaryExpression EOF )
            // InternalQL.g:330:1: ruleBasicBinaryExpression EOF
            {
             before(grammarAccess.getBasicBinaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleBasicBinaryExpression();

            state._fsp--;

             after(grammarAccess.getBasicBinaryExpressionRule()); 
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
    // $ANTLR end "entryRuleBasicBinaryExpression"


    // $ANTLR start "ruleBasicBinaryExpression"
    // InternalQL.g:337:1: ruleBasicBinaryExpression : ( ( rule__BasicBinaryExpression__Group__0 ) ) ;
    public final void ruleBasicBinaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:341:2: ( ( ( rule__BasicBinaryExpression__Group__0 ) ) )
            // InternalQL.g:342:2: ( ( rule__BasicBinaryExpression__Group__0 ) )
            {
            // InternalQL.g:342:2: ( ( rule__BasicBinaryExpression__Group__0 ) )
            // InternalQL.g:343:3: ( rule__BasicBinaryExpression__Group__0 )
            {
             before(grammarAccess.getBasicBinaryExpressionAccess().getGroup()); 
            // InternalQL.g:344:3: ( rule__BasicBinaryExpression__Group__0 )
            // InternalQL.g:344:4: rule__BasicBinaryExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BasicBinaryExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBasicBinaryExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBasicBinaryExpression"


    // $ANTLR start "entryRuleConstantCall"
    // InternalQL.g:353:1: entryRuleConstantCall : ruleConstantCall EOF ;
    public final void entryRuleConstantCall() throws RecognitionException {
        try {
            // InternalQL.g:354:1: ( ruleConstantCall EOF )
            // InternalQL.g:355:1: ruleConstantCall EOF
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
    // InternalQL.g:362:1: ruleConstantCall : ( ( rule__ConstantCall__Group__0 ) ) ;
    public final void ruleConstantCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:366:2: ( ( ( rule__ConstantCall__Group__0 ) ) )
            // InternalQL.g:367:2: ( ( rule__ConstantCall__Group__0 ) )
            {
            // InternalQL.g:367:2: ( ( rule__ConstantCall__Group__0 ) )
            // InternalQL.g:368:3: ( rule__ConstantCall__Group__0 )
            {
             before(grammarAccess.getConstantCallAccess().getGroup()); 
            // InternalQL.g:369:3: ( rule__ConstantCall__Group__0 )
            // InternalQL.g:369:4: rule__ConstantCall__Group__0
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


    // $ANTLR start "entryRuleBasicUnaryExpression"
    // InternalQL.g:378:1: entryRuleBasicUnaryExpression : ruleBasicUnaryExpression EOF ;
    public final void entryRuleBasicUnaryExpression() throws RecognitionException {
        try {
            // InternalQL.g:379:1: ( ruleBasicUnaryExpression EOF )
            // InternalQL.g:380:1: ruleBasicUnaryExpression EOF
            {
             before(grammarAccess.getBasicUnaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleBasicUnaryExpression();

            state._fsp--;

             after(grammarAccess.getBasicUnaryExpressionRule()); 
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
    // $ANTLR end "entryRuleBasicUnaryExpression"


    // $ANTLR start "ruleBasicUnaryExpression"
    // InternalQL.g:387:1: ruleBasicUnaryExpression : ( ( rule__BasicUnaryExpression__Group__0 ) ) ;
    public final void ruleBasicUnaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:391:2: ( ( ( rule__BasicUnaryExpression__Group__0 ) ) )
            // InternalQL.g:392:2: ( ( rule__BasicUnaryExpression__Group__0 ) )
            {
            // InternalQL.g:392:2: ( ( rule__BasicUnaryExpression__Group__0 ) )
            // InternalQL.g:393:3: ( rule__BasicUnaryExpression__Group__0 )
            {
             before(grammarAccess.getBasicUnaryExpressionAccess().getGroup()); 
            // InternalQL.g:394:3: ( rule__BasicUnaryExpression__Group__0 )
            // InternalQL.g:394:4: rule__BasicUnaryExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BasicUnaryExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBasicUnaryExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBasicUnaryExpression"


    // $ANTLR start "entryRuleQuestionCall"
    // InternalQL.g:403:1: entryRuleQuestionCall : ruleQuestionCall EOF ;
    public final void entryRuleQuestionCall() throws RecognitionException {
        try {
            // InternalQL.g:404:1: ( ruleQuestionCall EOF )
            // InternalQL.g:405:1: ruleQuestionCall EOF
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
    // InternalQL.g:412:1: ruleQuestionCall : ( ( rule__QuestionCall__Group__0 ) ) ;
    public final void ruleQuestionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:416:2: ( ( ( rule__QuestionCall__Group__0 ) ) )
            // InternalQL.g:417:2: ( ( rule__QuestionCall__Group__0 ) )
            {
            // InternalQL.g:417:2: ( ( rule__QuestionCall__Group__0 ) )
            // InternalQL.g:418:3: ( rule__QuestionCall__Group__0 )
            {
             before(grammarAccess.getQuestionCallAccess().getGroup()); 
            // InternalQL.g:419:3: ( rule__QuestionCall__Group__0 )
            // InternalQL.g:419:4: rule__QuestionCall__Group__0
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
    // InternalQL.g:428:1: entryRuleBooleanValueType : ruleBooleanValueType EOF ;
    public final void entryRuleBooleanValueType() throws RecognitionException {
        try {
            // InternalQL.g:429:1: ( ruleBooleanValueType EOF )
            // InternalQL.g:430:1: ruleBooleanValueType EOF
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
    // InternalQL.g:437:1: ruleBooleanValueType : ( ( rule__BooleanValueType__Group__0 ) ) ;
    public final void ruleBooleanValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:441:2: ( ( ( rule__BooleanValueType__Group__0 ) ) )
            // InternalQL.g:442:2: ( ( rule__BooleanValueType__Group__0 ) )
            {
            // InternalQL.g:442:2: ( ( rule__BooleanValueType__Group__0 ) )
            // InternalQL.g:443:3: ( rule__BooleanValueType__Group__0 )
            {
             before(grammarAccess.getBooleanValueTypeAccess().getGroup()); 
            // InternalQL.g:444:3: ( rule__BooleanValueType__Group__0 )
            // InternalQL.g:444:4: rule__BooleanValueType__Group__0
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
    // InternalQL.g:453:1: entryRuleIntegerValueType : ruleIntegerValueType EOF ;
    public final void entryRuleIntegerValueType() throws RecognitionException {
        try {
            // InternalQL.g:454:1: ( ruleIntegerValueType EOF )
            // InternalQL.g:455:1: ruleIntegerValueType EOF
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
    // InternalQL.g:462:1: ruleIntegerValueType : ( ( rule__IntegerValueType__Group__0 ) ) ;
    public final void ruleIntegerValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:466:2: ( ( ( rule__IntegerValueType__Group__0 ) ) )
            // InternalQL.g:467:2: ( ( rule__IntegerValueType__Group__0 ) )
            {
            // InternalQL.g:467:2: ( ( rule__IntegerValueType__Group__0 ) )
            // InternalQL.g:468:3: ( rule__IntegerValueType__Group__0 )
            {
             before(grammarAccess.getIntegerValueTypeAccess().getGroup()); 
            // InternalQL.g:469:3: ( rule__IntegerValueType__Group__0 )
            // InternalQL.g:469:4: rule__IntegerValueType__Group__0
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
    // InternalQL.g:478:1: entryRuleDecimalValueType : ruleDecimalValueType EOF ;
    public final void entryRuleDecimalValueType() throws RecognitionException {
        try {
            // InternalQL.g:479:1: ( ruleDecimalValueType EOF )
            // InternalQL.g:480:1: ruleDecimalValueType EOF
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
    // InternalQL.g:487:1: ruleDecimalValueType : ( ( rule__DecimalValueType__Group__0 ) ) ;
    public final void ruleDecimalValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:491:2: ( ( ( rule__DecimalValueType__Group__0 ) ) )
            // InternalQL.g:492:2: ( ( rule__DecimalValueType__Group__0 ) )
            {
            // InternalQL.g:492:2: ( ( rule__DecimalValueType__Group__0 ) )
            // InternalQL.g:493:3: ( rule__DecimalValueType__Group__0 )
            {
             before(grammarAccess.getDecimalValueTypeAccess().getGroup()); 
            // InternalQL.g:494:3: ( rule__DecimalValueType__Group__0 )
            // InternalQL.g:494:4: rule__DecimalValueType__Group__0
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
    // InternalQL.g:503:1: entryRuleDateValueType : ruleDateValueType EOF ;
    public final void entryRuleDateValueType() throws RecognitionException {
        try {
            // InternalQL.g:504:1: ( ruleDateValueType EOF )
            // InternalQL.g:505:1: ruleDateValueType EOF
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
    // InternalQL.g:512:1: ruleDateValueType : ( ( rule__DateValueType__Group__0 ) ) ;
    public final void ruleDateValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:516:2: ( ( ( rule__DateValueType__Group__0 ) ) )
            // InternalQL.g:517:2: ( ( rule__DateValueType__Group__0 ) )
            {
            // InternalQL.g:517:2: ( ( rule__DateValueType__Group__0 ) )
            // InternalQL.g:518:3: ( rule__DateValueType__Group__0 )
            {
             before(grammarAccess.getDateValueTypeAccess().getGroup()); 
            // InternalQL.g:519:3: ( rule__DateValueType__Group__0 )
            // InternalQL.g:519:4: rule__DateValueType__Group__0
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
    // InternalQL.g:528:1: entryRuleEnumerationValueType : ruleEnumerationValueType EOF ;
    public final void entryRuleEnumerationValueType() throws RecognitionException {
        try {
            // InternalQL.g:529:1: ( ruleEnumerationValueType EOF )
            // InternalQL.g:530:1: ruleEnumerationValueType EOF
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
    // InternalQL.g:537:1: ruleEnumerationValueType : ( ( rule__EnumerationValueType__Group__0 ) ) ;
    public final void ruleEnumerationValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:541:2: ( ( ( rule__EnumerationValueType__Group__0 ) ) )
            // InternalQL.g:542:2: ( ( rule__EnumerationValueType__Group__0 ) )
            {
            // InternalQL.g:542:2: ( ( rule__EnumerationValueType__Group__0 ) )
            // InternalQL.g:543:3: ( rule__EnumerationValueType__Group__0 )
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getGroup()); 
            // InternalQL.g:544:3: ( rule__EnumerationValueType__Group__0 )
            // InternalQL.g:544:4: rule__EnumerationValueType__Group__0
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
    // InternalQL.g:553:1: entryRuleStringValueType : ruleStringValueType EOF ;
    public final void entryRuleStringValueType() throws RecognitionException {
        try {
            // InternalQL.g:554:1: ( ruleStringValueType EOF )
            // InternalQL.g:555:1: ruleStringValueType EOF
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
    // InternalQL.g:562:1: ruleStringValueType : ( ( rule__StringValueType__Group__0 ) ) ;
    public final void ruleStringValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:566:2: ( ( ( rule__StringValueType__Group__0 ) ) )
            // InternalQL.g:567:2: ( ( rule__StringValueType__Group__0 ) )
            {
            // InternalQL.g:567:2: ( ( rule__StringValueType__Group__0 ) )
            // InternalQL.g:568:3: ( rule__StringValueType__Group__0 )
            {
             before(grammarAccess.getStringValueTypeAccess().getGroup()); 
            // InternalQL.g:569:3: ( rule__StringValueType__Group__0 )
            // InternalQL.g:569:4: rule__StringValueType__Group__0
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
    // InternalQL.g:578:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalQL.g:579:1: ( ruleEInt EOF )
            // InternalQL.g:580:1: ruleEInt EOF
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
    // InternalQL.g:587:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:591:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalQL.g:592:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalQL.g:592:2: ( ( rule__EInt__Group__0 ) )
            // InternalQL.g:593:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalQL.g:594:3: ( rule__EInt__Group__0 )
            // InternalQL.g:594:4: rule__EInt__Group__0
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
    // InternalQL.g:603:1: entryRuleEnumerationLiteral : ruleEnumerationLiteral EOF ;
    public final void entryRuleEnumerationLiteral() throws RecognitionException {
        try {
            // InternalQL.g:604:1: ( ruleEnumerationLiteral EOF )
            // InternalQL.g:605:1: ruleEnumerationLiteral EOF
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
    // InternalQL.g:612:1: ruleEnumerationLiteral : ( ( rule__EnumerationLiteral__Group__0 ) ) ;
    public final void ruleEnumerationLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:616:2: ( ( ( rule__EnumerationLiteral__Group__0 ) ) )
            // InternalQL.g:617:2: ( ( rule__EnumerationLiteral__Group__0 ) )
            {
            // InternalQL.g:617:2: ( ( rule__EnumerationLiteral__Group__0 ) )
            // InternalQL.g:618:3: ( rule__EnumerationLiteral__Group__0 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getGroup()); 
            // InternalQL.g:619:3: ( rule__EnumerationLiteral__Group__0 )
            // InternalQL.g:619:4: rule__EnumerationLiteral__Group__0
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
    // InternalQL.g:628:1: entryRuleIntegerValue : ruleIntegerValue EOF ;
    public final void entryRuleIntegerValue() throws RecognitionException {
        try {
            // InternalQL.g:629:1: ( ruleIntegerValue EOF )
            // InternalQL.g:630:1: ruleIntegerValue EOF
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
    // InternalQL.g:637:1: ruleIntegerValue : ( ( rule__IntegerValue__Group__0 ) ) ;
    public final void ruleIntegerValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:641:2: ( ( ( rule__IntegerValue__Group__0 ) ) )
            // InternalQL.g:642:2: ( ( rule__IntegerValue__Group__0 ) )
            {
            // InternalQL.g:642:2: ( ( rule__IntegerValue__Group__0 ) )
            // InternalQL.g:643:3: ( rule__IntegerValue__Group__0 )
            {
             before(grammarAccess.getIntegerValueAccess().getGroup()); 
            // InternalQL.g:644:3: ( rule__IntegerValue__Group__0 )
            // InternalQL.g:644:4: rule__IntegerValue__Group__0
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
    // InternalQL.g:653:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalQL.g:654:1: ( ruleStringValue EOF )
            // InternalQL.g:655:1: ruleStringValue EOF
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
    // InternalQL.g:662:1: ruleStringValue : ( ( rule__StringValue__Group__0 ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:666:2: ( ( ( rule__StringValue__Group__0 ) ) )
            // InternalQL.g:667:2: ( ( rule__StringValue__Group__0 ) )
            {
            // InternalQL.g:667:2: ( ( rule__StringValue__Group__0 ) )
            // InternalQL.g:668:3: ( rule__StringValue__Group__0 )
            {
             before(grammarAccess.getStringValueAccess().getGroup()); 
            // InternalQL.g:669:3: ( rule__StringValue__Group__0 )
            // InternalQL.g:669:4: rule__StringValue__Group__0
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
    // InternalQL.g:678:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // InternalQL.g:679:1: ( ruleBooleanValue EOF )
            // InternalQL.g:680:1: ruleBooleanValue EOF
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
    // InternalQL.g:687:1: ruleBooleanValue : ( ( rule__BooleanValue__Group__0 ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:691:2: ( ( ( rule__BooleanValue__Group__0 ) ) )
            // InternalQL.g:692:2: ( ( rule__BooleanValue__Group__0 ) )
            {
            // InternalQL.g:692:2: ( ( rule__BooleanValue__Group__0 ) )
            // InternalQL.g:693:3: ( rule__BooleanValue__Group__0 )
            {
             before(grammarAccess.getBooleanValueAccess().getGroup()); 
            // InternalQL.g:694:3: ( rule__BooleanValue__Group__0 )
            // InternalQL.g:694:4: rule__BooleanValue__Group__0
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
    // InternalQL.g:703:1: entryRuleDateValue : ruleDateValue EOF ;
    public final void entryRuleDateValue() throws RecognitionException {
        try {
            // InternalQL.g:704:1: ( ruleDateValue EOF )
            // InternalQL.g:705:1: ruleDateValue EOF
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
    // InternalQL.g:712:1: ruleDateValue : ( ( rule__DateValue__Group__0 ) ) ;
    public final void ruleDateValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:716:2: ( ( ( rule__DateValue__Group__0 ) ) )
            // InternalQL.g:717:2: ( ( rule__DateValue__Group__0 ) )
            {
            // InternalQL.g:717:2: ( ( rule__DateValue__Group__0 ) )
            // InternalQL.g:718:3: ( rule__DateValue__Group__0 )
            {
             before(grammarAccess.getDateValueAccess().getGroup()); 
            // InternalQL.g:719:3: ( rule__DateValue__Group__0 )
            // InternalQL.g:719:4: rule__DateValue__Group__0
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
    // InternalQL.g:728:1: entryRuleDecimalValue : ruleDecimalValue EOF ;
    public final void entryRuleDecimalValue() throws RecognitionException {
        try {
            // InternalQL.g:729:1: ( ruleDecimalValue EOF )
            // InternalQL.g:730:1: ruleDecimalValue EOF
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
    // InternalQL.g:737:1: ruleDecimalValue : ( ( rule__DecimalValue__Group__0 ) ) ;
    public final void ruleDecimalValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:741:2: ( ( ( rule__DecimalValue__Group__0 ) ) )
            // InternalQL.g:742:2: ( ( rule__DecimalValue__Group__0 ) )
            {
            // InternalQL.g:742:2: ( ( rule__DecimalValue__Group__0 ) )
            // InternalQL.g:743:3: ( rule__DecimalValue__Group__0 )
            {
             before(grammarAccess.getDecimalValueAccess().getGroup()); 
            // InternalQL.g:744:3: ( rule__DecimalValue__Group__0 )
            // InternalQL.g:744:4: rule__DecimalValue__Group__0
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
    // InternalQL.g:753:1: entryRuleEFloat : ruleEFloat EOF ;
    public final void entryRuleEFloat() throws RecognitionException {
        try {
            // InternalQL.g:754:1: ( ruleEFloat EOF )
            // InternalQL.g:755:1: ruleEFloat EOF
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
    // InternalQL.g:762:1: ruleEFloat : ( ( rule__EFloat__Group__0 ) ) ;
    public final void ruleEFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:766:2: ( ( ( rule__EFloat__Group__0 ) ) )
            // InternalQL.g:767:2: ( ( rule__EFloat__Group__0 ) )
            {
            // InternalQL.g:767:2: ( ( rule__EFloat__Group__0 ) )
            // InternalQL.g:768:3: ( rule__EFloat__Group__0 )
            {
             before(grammarAccess.getEFloatAccess().getGroup()); 
            // InternalQL.g:769:3: ( rule__EFloat__Group__0 )
            // InternalQL.g:769:4: rule__EFloat__Group__0
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
    // InternalQL.g:778:1: entryRuleQuestionDefinition : ruleQuestionDefinition EOF ;
    public final void entryRuleQuestionDefinition() throws RecognitionException {
        try {
            // InternalQL.g:779:1: ( ruleQuestionDefinition EOF )
            // InternalQL.g:780:1: ruleQuestionDefinition EOF
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
    // InternalQL.g:787:1: ruleQuestionDefinition : ( ( rule__QuestionDefinition__Group__0 ) ) ;
    public final void ruleQuestionDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:791:2: ( ( ( rule__QuestionDefinition__Group__0 ) ) )
            // InternalQL.g:792:2: ( ( rule__QuestionDefinition__Group__0 ) )
            {
            // InternalQL.g:792:2: ( ( rule__QuestionDefinition__Group__0 ) )
            // InternalQL.g:793:3: ( rule__QuestionDefinition__Group__0 )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getGroup()); 
            // InternalQL.g:794:3: ( rule__QuestionDefinition__Group__0 )
            // InternalQL.g:794:4: rule__QuestionDefinition__Group__0
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
    // InternalQL.g:803:1: ruleBinaryOperatorKind : ( ( rule__BinaryOperatorKind__Alternatives ) ) ;
    public final void ruleBinaryOperatorKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:807:1: ( ( ( rule__BinaryOperatorKind__Alternatives ) ) )
            // InternalQL.g:808:2: ( ( rule__BinaryOperatorKind__Alternatives ) )
            {
            // InternalQL.g:808:2: ( ( rule__BinaryOperatorKind__Alternatives ) )
            // InternalQL.g:809:3: ( rule__BinaryOperatorKind__Alternatives )
            {
             before(grammarAccess.getBinaryOperatorKindAccess().getAlternatives()); 
            // InternalQL.g:810:3: ( rule__BinaryOperatorKind__Alternatives )
            // InternalQL.g:810:4: rule__BinaryOperatorKind__Alternatives
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
    // InternalQL.g:819:1: ruleUnaryOperatorKind : ( ( rule__UnaryOperatorKind__Alternatives ) ) ;
    public final void ruleUnaryOperatorKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:823:1: ( ( ( rule__UnaryOperatorKind__Alternatives ) ) )
            // InternalQL.g:824:2: ( ( rule__UnaryOperatorKind__Alternatives ) )
            {
            // InternalQL.g:824:2: ( ( rule__UnaryOperatorKind__Alternatives ) )
            // InternalQL.g:825:3: ( rule__UnaryOperatorKind__Alternatives )
            {
             before(grammarAccess.getUnaryOperatorKindAccess().getAlternatives()); 
            // InternalQL.g:826:3: ( rule__UnaryOperatorKind__Alternatives )
            // InternalQL.g:826:4: rule__UnaryOperatorKind__Alternatives
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


    // $ANTLR start "rule__ValueType__Alternatives"
    // InternalQL.g:834:1: rule__ValueType__Alternatives : ( ( ruleValueType_Impl ) | ( ruleBooleanValueType ) | ( ruleIntegerValueType ) | ( ruleDecimalValueType ) | ( ruleDateValueType ) | ( ruleEnumerationValueType ) | ( ruleStringValueType ) );
    public final void rule__ValueType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:838:1: ( ( ruleValueType_Impl ) | ( ruleBooleanValueType ) | ( ruleIntegerValueType ) | ( ruleDecimalValueType ) | ( ruleDateValueType ) | ( ruleEnumerationValueType ) | ( ruleStringValueType ) )
            int alt1=7;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt1=1;
                }
                break;
            case 59:
                {
                alt1=2;
                }
                break;
            case 60:
                {
                alt1=3;
                }
                break;
            case 63:
                {
                alt1=4;
                }
                break;
            case 64:
                {
                alt1=5;
                }
                break;
            case 65:
                {
                alt1=6;
                }
                break;
            case 67:
                {
                alt1=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalQL.g:839:2: ( ruleValueType_Impl )
                    {
                    // InternalQL.g:839:2: ( ruleValueType_Impl )
                    // InternalQL.g:840:3: ruleValueType_Impl
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
                    // InternalQL.g:845:2: ( ruleBooleanValueType )
                    {
                    // InternalQL.g:845:2: ( ruleBooleanValueType )
                    // InternalQL.g:846:3: ruleBooleanValueType
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
                    // InternalQL.g:851:2: ( ruleIntegerValueType )
                    {
                    // InternalQL.g:851:2: ( ruleIntegerValueType )
                    // InternalQL.g:852:3: ruleIntegerValueType
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
                    // InternalQL.g:857:2: ( ruleDecimalValueType )
                    {
                    // InternalQL.g:857:2: ( ruleDecimalValueType )
                    // InternalQL.g:858:3: ruleDecimalValueType
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
                    // InternalQL.g:863:2: ( ruleDateValueType )
                    {
                    // InternalQL.g:863:2: ( ruleDateValueType )
                    // InternalQL.g:864:3: ruleDateValueType
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
                    // InternalQL.g:869:2: ( ruleEnumerationValueType )
                    {
                    // InternalQL.g:869:2: ( ruleEnumerationValueType )
                    // InternalQL.g:870:3: ruleEnumerationValueType
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
                    // InternalQL.g:875:2: ( ruleStringValueType )
                    {
                    // InternalQL.g:875:2: ( ruleStringValueType )
                    // InternalQL.g:876:3: ruleStringValueType
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


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalQL.g:885:1: rule__Expression__Alternatives : ( ( ruleBasicBinaryExpression ) | ( ruleConstantCall ) | ( ruleBasicUnaryExpression ) | ( ruleQuestionCall ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:889:1: ( ( ruleBasicBinaryExpression ) | ( ruleConstantCall ) | ( ruleBasicUnaryExpression ) | ( ruleQuestionCall ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt2=1;
                }
                break;
            case 53:
                {
                alt2=2;
                }
                break;
            case 55:
                {
                alt2=3;
                }
                break;
            case 57:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalQL.g:890:2: ( ruleBasicBinaryExpression )
                    {
                    // InternalQL.g:890:2: ( ruleBasicBinaryExpression )
                    // InternalQL.g:891:3: ruleBasicBinaryExpression
                    {
                     before(grammarAccess.getExpressionAccess().getBasicBinaryExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBasicBinaryExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getBasicBinaryExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQL.g:896:2: ( ruleConstantCall )
                    {
                    // InternalQL.g:896:2: ( ruleConstantCall )
                    // InternalQL.g:897:3: ruleConstantCall
                    {
                     before(grammarAccess.getExpressionAccess().getConstantCallParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleConstantCall();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getConstantCallParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQL.g:902:2: ( ruleBasicUnaryExpression )
                    {
                    // InternalQL.g:902:2: ( ruleBasicUnaryExpression )
                    // InternalQL.g:903:3: ruleBasicUnaryExpression
                    {
                     before(grammarAccess.getExpressionAccess().getBasicUnaryExpressionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBasicUnaryExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getBasicUnaryExpressionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalQL.g:908:2: ( ruleQuestionCall )
                    {
                    // InternalQL.g:908:2: ( ruleQuestionCall )
                    // InternalQL.g:909:3: ruleQuestionCall
                    {
                     before(grammarAccess.getExpressionAccess().getQuestionCallParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleQuestionCall();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getQuestionCallParserRuleCall_3()); 

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
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__Value__Alternatives"
    // InternalQL.g:918:1: rule__Value__Alternatives : ( ( ruleIntegerValue ) | ( ruleStringValue ) | ( ruleBooleanValue ) | ( ruleDateValue ) | ( ruleDecimalValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:922:1: ( ( ruleIntegerValue ) | ( ruleStringValue ) | ( ruleBooleanValue ) | ( ruleDateValue ) | ( ruleDecimalValue ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt3=1;
                }
                break;
            case 72:
                {
                alt3=2;
                }
                break;
            case 74:
            case 86:
                {
                alt3=3;
                }
                break;
            case 75:
                {
                alt3=4;
                }
                break;
            case 77:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalQL.g:923:2: ( ruleIntegerValue )
                    {
                    // InternalQL.g:923:2: ( ruleIntegerValue )
                    // InternalQL.g:924:3: ruleIntegerValue
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
                    // InternalQL.g:929:2: ( ruleStringValue )
                    {
                    // InternalQL.g:929:2: ( ruleStringValue )
                    // InternalQL.g:930:3: ruleStringValue
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
                    // InternalQL.g:935:2: ( ruleBooleanValue )
                    {
                    // InternalQL.g:935:2: ( ruleBooleanValue )
                    // InternalQL.g:936:3: ruleBooleanValue
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
                    // InternalQL.g:941:2: ( ruleDateValue )
                    {
                    // InternalQL.g:941:2: ( ruleDateValue )
                    // InternalQL.g:942:3: ruleDateValue
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
                    // InternalQL.g:947:2: ( ruleDecimalValue )
                    {
                    // InternalQL.g:947:2: ( ruleDecimalValue )
                    // InternalQL.g:948:3: ruleDecimalValue
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


    // $ANTLR start "rule__EString__Alternatives"
    // InternalQL.g:957:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:961:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalQL.g:962:2: ( RULE_STRING )
                    {
                    // InternalQL.g:962:2: ( RULE_STRING )
                    // InternalQL.g:963:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQL.g:968:2: ( RULE_ID )
                    {
                    // InternalQL.g:968:2: ( RULE_ID )
                    // InternalQL.g:969:3: RULE_ID
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


    // $ANTLR start "rule__EFloat__Alternatives_4_0"
    // InternalQL.g:978:1: rule__EFloat__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EFloat__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:982:1: ( ( 'E' ) | ( 'e' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            else if ( (LA5_0==13) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalQL.g:983:2: ( 'E' )
                    {
                    // InternalQL.g:983:2: ( 'E' )
                    // InternalQL.g:984:3: 'E'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQL.g:989:2: ( 'e' )
                    {
                    // InternalQL.g:989:2: ( 'e' )
                    // InternalQL.g:990:3: 'e'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 
                    match(input,13,FOLLOW_2); 
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
    // InternalQL.g:999:1: rule__BinaryOperatorKind__Alternatives : ( ( ( 'PLUS' ) ) | ( ( 'MINUS' ) ) | ( ( 'MULT' ) ) | ( ( 'DIV' ) ) | ( ( 'EQUAL' ) ) | ( ( 'NOTEQUAL' ) ) | ( ( 'GREATER' ) ) | ( ( 'LOWER' ) ) | ( ( 'GREATEROREQUAL' ) ) | ( ( 'LOWEROREQUAL' ) ) | ( ( 'AND' ) ) | ( ( 'OR' ) ) );
    public final void rule__BinaryOperatorKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1003:1: ( ( ( 'PLUS' ) ) | ( ( 'MINUS' ) ) | ( ( 'MULT' ) ) | ( ( 'DIV' ) ) | ( ( 'EQUAL' ) ) | ( ( 'NOTEQUAL' ) ) | ( ( 'GREATER' ) ) | ( ( 'LOWER' ) ) | ( ( 'GREATEROREQUAL' ) ) | ( ( 'LOWEROREQUAL' ) ) | ( ( 'AND' ) ) | ( ( 'OR' ) ) )
            int alt6=12;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt6=1;
                }
                break;
            case 15:
                {
                alt6=2;
                }
                break;
            case 16:
                {
                alt6=3;
                }
                break;
            case 17:
                {
                alt6=4;
                }
                break;
            case 18:
                {
                alt6=5;
                }
                break;
            case 19:
                {
                alt6=6;
                }
                break;
            case 20:
                {
                alt6=7;
                }
                break;
            case 21:
                {
                alt6=8;
                }
                break;
            case 22:
                {
                alt6=9;
                }
                break;
            case 23:
                {
                alt6=10;
                }
                break;
            case 24:
                {
                alt6=11;
                }
                break;
            case 25:
                {
                alt6=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalQL.g:1004:2: ( ( 'PLUS' ) )
                    {
                    // InternalQL.g:1004:2: ( ( 'PLUS' ) )
                    // InternalQL.g:1005:3: ( 'PLUS' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getPLUSEnumLiteralDeclaration_0()); 
                    // InternalQL.g:1006:3: ( 'PLUS' )
                    // InternalQL.g:1006:4: 'PLUS'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getPLUSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQL.g:1010:2: ( ( 'MINUS' ) )
                    {
                    // InternalQL.g:1010:2: ( ( 'MINUS' ) )
                    // InternalQL.g:1011:3: ( 'MINUS' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getMINUSEnumLiteralDeclaration_1()); 
                    // InternalQL.g:1012:3: ( 'MINUS' )
                    // InternalQL.g:1012:4: 'MINUS'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getMINUSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQL.g:1016:2: ( ( 'MULT' ) )
                    {
                    // InternalQL.g:1016:2: ( ( 'MULT' ) )
                    // InternalQL.g:1017:3: ( 'MULT' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getMULTEnumLiteralDeclaration_2()); 
                    // InternalQL.g:1018:3: ( 'MULT' )
                    // InternalQL.g:1018:4: 'MULT'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getMULTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalQL.g:1022:2: ( ( 'DIV' ) )
                    {
                    // InternalQL.g:1022:2: ( ( 'DIV' ) )
                    // InternalQL.g:1023:3: ( 'DIV' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getDIVEnumLiteralDeclaration_3()); 
                    // InternalQL.g:1024:3: ( 'DIV' )
                    // InternalQL.g:1024:4: 'DIV'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getDIVEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalQL.g:1028:2: ( ( 'EQUAL' ) )
                    {
                    // InternalQL.g:1028:2: ( ( 'EQUAL' ) )
                    // InternalQL.g:1029:3: ( 'EQUAL' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getEQUALEnumLiteralDeclaration_4()); 
                    // InternalQL.g:1030:3: ( 'EQUAL' )
                    // InternalQL.g:1030:4: 'EQUAL'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getEQUALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalQL.g:1034:2: ( ( 'NOTEQUAL' ) )
                    {
                    // InternalQL.g:1034:2: ( ( 'NOTEQUAL' ) )
                    // InternalQL.g:1035:3: ( 'NOTEQUAL' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getNOTEQUALEnumLiteralDeclaration_5()); 
                    // InternalQL.g:1036:3: ( 'NOTEQUAL' )
                    // InternalQL.g:1036:4: 'NOTEQUAL'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getNOTEQUALEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalQL.g:1040:2: ( ( 'GREATER' ) )
                    {
                    // InternalQL.g:1040:2: ( ( 'GREATER' ) )
                    // InternalQL.g:1041:3: ( 'GREATER' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getGREATEREnumLiteralDeclaration_6()); 
                    // InternalQL.g:1042:3: ( 'GREATER' )
                    // InternalQL.g:1042:4: 'GREATER'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getGREATEREnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalQL.g:1046:2: ( ( 'LOWER' ) )
                    {
                    // InternalQL.g:1046:2: ( ( 'LOWER' ) )
                    // InternalQL.g:1047:3: ( 'LOWER' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getLOWEREnumLiteralDeclaration_7()); 
                    // InternalQL.g:1048:3: ( 'LOWER' )
                    // InternalQL.g:1048:4: 'LOWER'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getLOWEREnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalQL.g:1052:2: ( ( 'GREATEROREQUAL' ) )
                    {
                    // InternalQL.g:1052:2: ( ( 'GREATEROREQUAL' ) )
                    // InternalQL.g:1053:3: ( 'GREATEROREQUAL' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getGREATEROREQUALEnumLiteralDeclaration_8()); 
                    // InternalQL.g:1054:3: ( 'GREATEROREQUAL' )
                    // InternalQL.g:1054:4: 'GREATEROREQUAL'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getGREATEROREQUALEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalQL.g:1058:2: ( ( 'LOWEROREQUAL' ) )
                    {
                    // InternalQL.g:1058:2: ( ( 'LOWEROREQUAL' ) )
                    // InternalQL.g:1059:3: ( 'LOWEROREQUAL' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getLOWEROREQUALEnumLiteralDeclaration_9()); 
                    // InternalQL.g:1060:3: ( 'LOWEROREQUAL' )
                    // InternalQL.g:1060:4: 'LOWEROREQUAL'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getLOWEROREQUALEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalQL.g:1064:2: ( ( 'AND' ) )
                    {
                    // InternalQL.g:1064:2: ( ( 'AND' ) )
                    // InternalQL.g:1065:3: ( 'AND' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getANDEnumLiteralDeclaration_10()); 
                    // InternalQL.g:1066:3: ( 'AND' )
                    // InternalQL.g:1066:4: 'AND'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryOperatorKindAccess().getANDEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalQL.g:1070:2: ( ( 'OR' ) )
                    {
                    // InternalQL.g:1070:2: ( ( 'OR' ) )
                    // InternalQL.g:1071:3: ( 'OR' )
                    {
                     before(grammarAccess.getBinaryOperatorKindAccess().getOREnumLiteralDeclaration_11()); 
                    // InternalQL.g:1072:3: ( 'OR' )
                    // InternalQL.g:1072:4: 'OR'
                    {
                    match(input,25,FOLLOW_2); 

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
    // InternalQL.g:1080:1: rule__UnaryOperatorKind__Alternatives : ( ( ( 'UNARYMINUS' ) ) | ( ( 'NOT' ) ) );
    public final void rule__UnaryOperatorKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1084:1: ( ( ( 'UNARYMINUS' ) ) | ( ( 'NOT' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            else if ( (LA7_0==27) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalQL.g:1085:2: ( ( 'UNARYMINUS' ) )
                    {
                    // InternalQL.g:1085:2: ( ( 'UNARYMINUS' ) )
                    // InternalQL.g:1086:3: ( 'UNARYMINUS' )
                    {
                     before(grammarAccess.getUnaryOperatorKindAccess().getUNARYMINUSEnumLiteralDeclaration_0()); 
                    // InternalQL.g:1087:3: ( 'UNARYMINUS' )
                    // InternalQL.g:1087:4: 'UNARYMINUS'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getUnaryOperatorKindAccess().getUNARYMINUSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQL.g:1091:2: ( ( 'NOT' ) )
                    {
                    // InternalQL.g:1091:2: ( ( 'NOT' ) )
                    // InternalQL.g:1092:3: ( 'NOT' )
                    {
                     before(grammarAccess.getUnaryOperatorKindAccess().getNOTEnumLiteralDeclaration_1()); 
                    // InternalQL.g:1093:3: ( 'NOT' )
                    // InternalQL.g:1093:4: 'NOT'
                    {
                    match(input,27,FOLLOW_2); 

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


    // $ANTLR start "rule__QLModel__Group__0"
    // InternalQL.g:1101:1: rule__QLModel__Group__0 : rule__QLModel__Group__0__Impl rule__QLModel__Group__1 ;
    public final void rule__QLModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1105:1: ( rule__QLModel__Group__0__Impl rule__QLModel__Group__1 )
            // InternalQL.g:1106:2: rule__QLModel__Group__0__Impl rule__QLModel__Group__1
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
    // InternalQL.g:1113:1: rule__QLModel__Group__0__Impl : ( () ) ;
    public final void rule__QLModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1117:1: ( ( () ) )
            // InternalQL.g:1118:1: ( () )
            {
            // InternalQL.g:1118:1: ( () )
            // InternalQL.g:1119:2: ()
            {
             before(grammarAccess.getQLModelAccess().getQLModelAction_0()); 
            // InternalQL.g:1120:2: ()
            // InternalQL.g:1120:3: 
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
    // InternalQL.g:1128:1: rule__QLModel__Group__1 : rule__QLModel__Group__1__Impl rule__QLModel__Group__2 ;
    public final void rule__QLModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1132:1: ( rule__QLModel__Group__1__Impl rule__QLModel__Group__2 )
            // InternalQL.g:1133:2: rule__QLModel__Group__1__Impl rule__QLModel__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalQL.g:1140:1: rule__QLModel__Group__1__Impl : ( ( rule__QLModel__CanSubmitAssignment_1 )? ) ;
    public final void rule__QLModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1144:1: ( ( ( rule__QLModel__CanSubmitAssignment_1 )? ) )
            // InternalQL.g:1145:1: ( ( rule__QLModel__CanSubmitAssignment_1 )? )
            {
            // InternalQL.g:1145:1: ( ( rule__QLModel__CanSubmitAssignment_1 )? )
            // InternalQL.g:1146:2: ( rule__QLModel__CanSubmitAssignment_1 )?
            {
             before(grammarAccess.getQLModelAccess().getCanSubmitAssignment_1()); 
            // InternalQL.g:1147:2: ( rule__QLModel__CanSubmitAssignment_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==85) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalQL.g:1147:3: rule__QLModel__CanSubmitAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__QLModel__CanSubmitAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQLModelAccess().getCanSubmitAssignment_1()); 

            }


            }

        }
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
    // InternalQL.g:1155:1: rule__QLModel__Group__2 : rule__QLModel__Group__2__Impl rule__QLModel__Group__3 ;
    public final void rule__QLModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1159:1: ( rule__QLModel__Group__2__Impl rule__QLModel__Group__3 )
            // InternalQL.g:1160:2: rule__QLModel__Group__2__Impl rule__QLModel__Group__3
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
    // InternalQL.g:1167:1: rule__QLModel__Group__2__Impl : ( 'QLModel' ) ;
    public final void rule__QLModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1171:1: ( ( 'QLModel' ) )
            // InternalQL.g:1172:1: ( 'QLModel' )
            {
            // InternalQL.g:1172:1: ( 'QLModel' )
            // InternalQL.g:1173:2: 'QLModel'
            {
             before(grammarAccess.getQLModelAccess().getQLModelKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getQLModelAccess().getQLModelKeyword_2()); 

            }


            }

        }
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
    // InternalQL.g:1182:1: rule__QLModel__Group__3 : rule__QLModel__Group__3__Impl rule__QLModel__Group__4 ;
    public final void rule__QLModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1186:1: ( rule__QLModel__Group__3__Impl rule__QLModel__Group__4 )
            // InternalQL.g:1187:2: rule__QLModel__Group__3__Impl rule__QLModel__Group__4
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
    // InternalQL.g:1194:1: rule__QLModel__Group__3__Impl : ( '{' ) ;
    public final void rule__QLModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1198:1: ( ( '{' ) )
            // InternalQL.g:1199:1: ( '{' )
            {
            // InternalQL.g:1199:1: ( '{' )
            // InternalQL.g:1200:2: '{'
            {
             before(grammarAccess.getQLModelAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,29,FOLLOW_2); 
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
    // InternalQL.g:1209:1: rule__QLModel__Group__4 : rule__QLModel__Group__4__Impl rule__QLModel__Group__5 ;
    public final void rule__QLModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1213:1: ( rule__QLModel__Group__4__Impl rule__QLModel__Group__5 )
            // InternalQL.g:1214:2: rule__QLModel__Group__4__Impl rule__QLModel__Group__5
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
    // InternalQL.g:1221:1: rule__QLModel__Group__4__Impl : ( ( rule__QLModel__Group_4__0 )? ) ;
    public final void rule__QLModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1225:1: ( ( ( rule__QLModel__Group_4__0 )? ) )
            // InternalQL.g:1226:1: ( ( rule__QLModel__Group_4__0 )? )
            {
            // InternalQL.g:1226:1: ( ( rule__QLModel__Group_4__0 )? )
            // InternalQL.g:1227:2: ( rule__QLModel__Group_4__0 )?
            {
             before(grammarAccess.getQLModelAccess().getGroup_4()); 
            // InternalQL.g:1228:2: ( rule__QLModel__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==31) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalQL.g:1228:3: rule__QLModel__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QLModel__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQLModelAccess().getGroup_4()); 

            }


            }

        }
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
    // InternalQL.g:1236:1: rule__QLModel__Group__5 : rule__QLModel__Group__5__Impl rule__QLModel__Group__6 ;
    public final void rule__QLModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1240:1: ( rule__QLModel__Group__5__Impl rule__QLModel__Group__6 )
            // InternalQL.g:1241:2: rule__QLModel__Group__5__Impl rule__QLModel__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__QLModel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QLModel__Group__6();

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
    // InternalQL.g:1248:1: rule__QLModel__Group__5__Impl : ( ( rule__QLModel__Group_5__0 )? ) ;
    public final void rule__QLModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1252:1: ( ( ( rule__QLModel__Group_5__0 )? ) )
            // InternalQL.g:1253:1: ( ( rule__QLModel__Group_5__0 )? )
            {
            // InternalQL.g:1253:1: ( ( rule__QLModel__Group_5__0 )? )
            // InternalQL.g:1254:2: ( rule__QLModel__Group_5__0 )?
            {
             before(grammarAccess.getQLModelAccess().getGroup_5()); 
            // InternalQL.g:1255:2: ( rule__QLModel__Group_5__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==32) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalQL.g:1255:3: rule__QLModel__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QLModel__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQLModelAccess().getGroup_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__QLModel__Group__6"
    // InternalQL.g:1263:1: rule__QLModel__Group__6 : rule__QLModel__Group__6__Impl rule__QLModel__Group__7 ;
    public final void rule__QLModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1267:1: ( rule__QLModel__Group__6__Impl rule__QLModel__Group__7 )
            // InternalQL.g:1268:2: rule__QLModel__Group__6__Impl rule__QLModel__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__QLModel__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QLModel__Group__7();

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
    // $ANTLR end "rule__QLModel__Group__6"


    // $ANTLR start "rule__QLModel__Group__6__Impl"
    // InternalQL.g:1275:1: rule__QLModel__Group__6__Impl : ( ( rule__QLModel__Group_6__0 )? ) ;
    public final void rule__QLModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1279:1: ( ( ( rule__QLModel__Group_6__0 )? ) )
            // InternalQL.g:1280:1: ( ( rule__QLModel__Group_6__0 )? )
            {
            // InternalQL.g:1280:1: ( ( rule__QLModel__Group_6__0 )? )
            // InternalQL.g:1281:2: ( rule__QLModel__Group_6__0 )?
            {
             before(grammarAccess.getQLModelAccess().getGroup_6()); 
            // InternalQL.g:1282:2: ( rule__QLModel__Group_6__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==34) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalQL.g:1282:3: rule__QLModel__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QLModel__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQLModelAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group__6__Impl"


    // $ANTLR start "rule__QLModel__Group__7"
    // InternalQL.g:1290:1: rule__QLModel__Group__7 : rule__QLModel__Group__7__Impl ;
    public final void rule__QLModel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1294:1: ( rule__QLModel__Group__7__Impl )
            // InternalQL.g:1295:2: rule__QLModel__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QLModel__Group__7__Impl();

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
    // $ANTLR end "rule__QLModel__Group__7"


    // $ANTLR start "rule__QLModel__Group__7__Impl"
    // InternalQL.g:1301:1: rule__QLModel__Group__7__Impl : ( '}' ) ;
    public final void rule__QLModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1305:1: ( ( '}' ) )
            // InternalQL.g:1306:1: ( '}' )
            {
            // InternalQL.g:1306:1: ( '}' )
            // InternalQL.g:1307:2: '}'
            {
             before(grammarAccess.getQLModelAccess().getRightCurlyBracketKeyword_7()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getQLModelAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group__7__Impl"


    // $ANTLR start "rule__QLModel__Group_4__0"
    // InternalQL.g:1317:1: rule__QLModel__Group_4__0 : rule__QLModel__Group_4__0__Impl rule__QLModel__Group_4__1 ;
    public final void rule__QLModel__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1321:1: ( rule__QLModel__Group_4__0__Impl rule__QLModel__Group_4__1 )
            // InternalQL.g:1322:2: rule__QLModel__Group_4__0__Impl rule__QLModel__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__QLModel__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QLModel__Group_4__1();

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
    // $ANTLR end "rule__QLModel__Group_4__0"


    // $ANTLR start "rule__QLModel__Group_4__0__Impl"
    // InternalQL.g:1329:1: rule__QLModel__Group_4__0__Impl : ( 'submitDate' ) ;
    public final void rule__QLModel__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1333:1: ( ( 'submitDate' ) )
            // InternalQL.g:1334:1: ( 'submitDate' )
            {
            // InternalQL.g:1334:1: ( 'submitDate' )
            // InternalQL.g:1335:2: 'submitDate'
            {
             before(grammarAccess.getQLModelAccess().getSubmitDateKeyword_4_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getQLModelAccess().getSubmitDateKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_4__0__Impl"


    // $ANTLR start "rule__QLModel__Group_4__1"
    // InternalQL.g:1344:1: rule__QLModel__Group_4__1 : rule__QLModel__Group_4__1__Impl ;
    public final void rule__QLModel__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1348:1: ( rule__QLModel__Group_4__1__Impl )
            // InternalQL.g:1349:2: rule__QLModel__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QLModel__Group_4__1__Impl();

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
    // $ANTLR end "rule__QLModel__Group_4__1"


    // $ANTLR start "rule__QLModel__Group_4__1__Impl"
    // InternalQL.g:1355:1: rule__QLModel__Group_4__1__Impl : ( ( rule__QLModel__SubmitDateAssignment_4_1 ) ) ;
    public final void rule__QLModel__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1359:1: ( ( ( rule__QLModel__SubmitDateAssignment_4_1 ) ) )
            // InternalQL.g:1360:1: ( ( rule__QLModel__SubmitDateAssignment_4_1 ) )
            {
            // InternalQL.g:1360:1: ( ( rule__QLModel__SubmitDateAssignment_4_1 ) )
            // InternalQL.g:1361:2: ( rule__QLModel__SubmitDateAssignment_4_1 )
            {
             before(grammarAccess.getQLModelAccess().getSubmitDateAssignment_4_1()); 
            // InternalQL.g:1362:2: ( rule__QLModel__SubmitDateAssignment_4_1 )
            // InternalQL.g:1362:3: rule__QLModel__SubmitDateAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__QLModel__SubmitDateAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getQLModelAccess().getSubmitDateAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_4__1__Impl"


    // $ANTLR start "rule__QLModel__Group_5__0"
    // InternalQL.g:1371:1: rule__QLModel__Group_5__0 : rule__QLModel__Group_5__0__Impl rule__QLModel__Group_5__1 ;
    public final void rule__QLModel__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1375:1: ( rule__QLModel__Group_5__0__Impl rule__QLModel__Group_5__1 )
            // InternalQL.g:1376:2: rule__QLModel__Group_5__0__Impl rule__QLModel__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__QLModel__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QLModel__Group_5__1();

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
    // $ANTLR end "rule__QLModel__Group_5__0"


    // $ANTLR start "rule__QLModel__Group_5__0__Impl"
    // InternalQL.g:1383:1: rule__QLModel__Group_5__0__Impl : ( 'forms' ) ;
    public final void rule__QLModel__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1387:1: ( ( 'forms' ) )
            // InternalQL.g:1388:1: ( 'forms' )
            {
            // InternalQL.g:1388:1: ( 'forms' )
            // InternalQL.g:1389:2: 'forms'
            {
             before(grammarAccess.getQLModelAccess().getFormsKeyword_5_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getQLModelAccess().getFormsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_5__0__Impl"


    // $ANTLR start "rule__QLModel__Group_5__1"
    // InternalQL.g:1398:1: rule__QLModel__Group_5__1 : rule__QLModel__Group_5__1__Impl rule__QLModel__Group_5__2 ;
    public final void rule__QLModel__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1402:1: ( rule__QLModel__Group_5__1__Impl rule__QLModel__Group_5__2 )
            // InternalQL.g:1403:2: rule__QLModel__Group_5__1__Impl rule__QLModel__Group_5__2
            {
            pushFollow(FOLLOW_7);
            rule__QLModel__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QLModel__Group_5__2();

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
    // $ANTLR end "rule__QLModel__Group_5__1"


    // $ANTLR start "rule__QLModel__Group_5__1__Impl"
    // InternalQL.g:1410:1: rule__QLModel__Group_5__1__Impl : ( '{' ) ;
    public final void rule__QLModel__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1414:1: ( ( '{' ) )
            // InternalQL.g:1415:1: ( '{' )
            {
            // InternalQL.g:1415:1: ( '{' )
            // InternalQL.g:1416:2: '{'
            {
             before(grammarAccess.getQLModelAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getQLModelAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_5__1__Impl"


    // $ANTLR start "rule__QLModel__Group_5__2"
    // InternalQL.g:1425:1: rule__QLModel__Group_5__2 : rule__QLModel__Group_5__2__Impl rule__QLModel__Group_5__3 ;
    public final void rule__QLModel__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1429:1: ( rule__QLModel__Group_5__2__Impl rule__QLModel__Group_5__3 )
            // InternalQL.g:1430:2: rule__QLModel__Group_5__2__Impl rule__QLModel__Group_5__3
            {
            pushFollow(FOLLOW_8);
            rule__QLModel__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QLModel__Group_5__3();

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
    // $ANTLR end "rule__QLModel__Group_5__2"


    // $ANTLR start "rule__QLModel__Group_5__2__Impl"
    // InternalQL.g:1437:1: rule__QLModel__Group_5__2__Impl : ( ( rule__QLModel__FormsAssignment_5_2 ) ) ;
    public final void rule__QLModel__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1441:1: ( ( ( rule__QLModel__FormsAssignment_5_2 ) ) )
            // InternalQL.g:1442:1: ( ( rule__QLModel__FormsAssignment_5_2 ) )
            {
            // InternalQL.g:1442:1: ( ( rule__QLModel__FormsAssignment_5_2 ) )
            // InternalQL.g:1443:2: ( rule__QLModel__FormsAssignment_5_2 )
            {
             before(grammarAccess.getQLModelAccess().getFormsAssignment_5_2()); 
            // InternalQL.g:1444:2: ( rule__QLModel__FormsAssignment_5_2 )
            // InternalQL.g:1444:3: rule__QLModel__FormsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__QLModel__FormsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getQLModelAccess().getFormsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_5__2__Impl"


    // $ANTLR start "rule__QLModel__Group_5__3"
    // InternalQL.g:1452:1: rule__QLModel__Group_5__3 : rule__QLModel__Group_5__3__Impl rule__QLModel__Group_5__4 ;
    public final void rule__QLModel__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1456:1: ( rule__QLModel__Group_5__3__Impl rule__QLModel__Group_5__4 )
            // InternalQL.g:1457:2: rule__QLModel__Group_5__3__Impl rule__QLModel__Group_5__4
            {
            pushFollow(FOLLOW_8);
            rule__QLModel__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QLModel__Group_5__4();

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
    // $ANTLR end "rule__QLModel__Group_5__3"


    // $ANTLR start "rule__QLModel__Group_5__3__Impl"
    // InternalQL.g:1464:1: rule__QLModel__Group_5__3__Impl : ( ( rule__QLModel__Group_5_3__0 )* ) ;
    public final void rule__QLModel__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1468:1: ( ( ( rule__QLModel__Group_5_3__0 )* ) )
            // InternalQL.g:1469:1: ( ( rule__QLModel__Group_5_3__0 )* )
            {
            // InternalQL.g:1469:1: ( ( rule__QLModel__Group_5_3__0 )* )
            // InternalQL.g:1470:2: ( rule__QLModel__Group_5_3__0 )*
            {
             before(grammarAccess.getQLModelAccess().getGroup_5_3()); 
            // InternalQL.g:1471:2: ( rule__QLModel__Group_5_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==33) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalQL.g:1471:3: rule__QLModel__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__QLModel__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getQLModelAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_5__3__Impl"


    // $ANTLR start "rule__QLModel__Group_5__4"
    // InternalQL.g:1479:1: rule__QLModel__Group_5__4 : rule__QLModel__Group_5__4__Impl ;
    public final void rule__QLModel__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1483:1: ( rule__QLModel__Group_5__4__Impl )
            // InternalQL.g:1484:2: rule__QLModel__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QLModel__Group_5__4__Impl();

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
    // $ANTLR end "rule__QLModel__Group_5__4"


    // $ANTLR start "rule__QLModel__Group_5__4__Impl"
    // InternalQL.g:1490:1: rule__QLModel__Group_5__4__Impl : ( '}' ) ;
    public final void rule__QLModel__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1494:1: ( ( '}' ) )
            // InternalQL.g:1495:1: ( '}' )
            {
            // InternalQL.g:1495:1: ( '}' )
            // InternalQL.g:1496:2: '}'
            {
             before(grammarAccess.getQLModelAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getQLModelAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_5__4__Impl"


    // $ANTLR start "rule__QLModel__Group_5_3__0"
    // InternalQL.g:1506:1: rule__QLModel__Group_5_3__0 : rule__QLModel__Group_5_3__0__Impl rule__QLModel__Group_5_3__1 ;
    public final void rule__QLModel__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1510:1: ( rule__QLModel__Group_5_3__0__Impl rule__QLModel__Group_5_3__1 )
            // InternalQL.g:1511:2: rule__QLModel__Group_5_3__0__Impl rule__QLModel__Group_5_3__1
            {
            pushFollow(FOLLOW_7);
            rule__QLModel__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QLModel__Group_5_3__1();

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
    // $ANTLR end "rule__QLModel__Group_5_3__0"


    // $ANTLR start "rule__QLModel__Group_5_3__0__Impl"
    // InternalQL.g:1518:1: rule__QLModel__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__QLModel__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1522:1: ( ( ',' ) )
            // InternalQL.g:1523:1: ( ',' )
            {
            // InternalQL.g:1523:1: ( ',' )
            // InternalQL.g:1524:2: ','
            {
             before(grammarAccess.getQLModelAccess().getCommaKeyword_5_3_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getQLModelAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_5_3__0__Impl"


    // $ANTLR start "rule__QLModel__Group_5_3__1"
    // InternalQL.g:1533:1: rule__QLModel__Group_5_3__1 : rule__QLModel__Group_5_3__1__Impl ;
    public final void rule__QLModel__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1537:1: ( rule__QLModel__Group_5_3__1__Impl )
            // InternalQL.g:1538:2: rule__QLModel__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QLModel__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__QLModel__Group_5_3__1"


    // $ANTLR start "rule__QLModel__Group_5_3__1__Impl"
    // InternalQL.g:1544:1: rule__QLModel__Group_5_3__1__Impl : ( ( rule__QLModel__FormsAssignment_5_3_1 ) ) ;
    public final void rule__QLModel__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1548:1: ( ( ( rule__QLModel__FormsAssignment_5_3_1 ) ) )
            // InternalQL.g:1549:1: ( ( rule__QLModel__FormsAssignment_5_3_1 ) )
            {
            // InternalQL.g:1549:1: ( ( rule__QLModel__FormsAssignment_5_3_1 ) )
            // InternalQL.g:1550:2: ( rule__QLModel__FormsAssignment_5_3_1 )
            {
             before(grammarAccess.getQLModelAccess().getFormsAssignment_5_3_1()); 
            // InternalQL.g:1551:2: ( rule__QLModel__FormsAssignment_5_3_1 )
            // InternalQL.g:1551:3: rule__QLModel__FormsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__QLModel__FormsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getQLModelAccess().getFormsAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_5_3__1__Impl"


    // $ANTLR start "rule__QLModel__Group_6__0"
    // InternalQL.g:1560:1: rule__QLModel__Group_6__0 : rule__QLModel__Group_6__0__Impl rule__QLModel__Group_6__1 ;
    public final void rule__QLModel__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1564:1: ( rule__QLModel__Group_6__0__Impl rule__QLModel__Group_6__1 )
            // InternalQL.g:1565:2: rule__QLModel__Group_6__0__Impl rule__QLModel__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__QLModel__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QLModel__Group_6__1();

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
    // $ANTLR end "rule__QLModel__Group_6__0"


    // $ANTLR start "rule__QLModel__Group_6__0__Impl"
    // InternalQL.g:1572:1: rule__QLModel__Group_6__0__Impl : ( 'definitionGroup' ) ;
    public final void rule__QLModel__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1576:1: ( ( 'definitionGroup' ) )
            // InternalQL.g:1577:1: ( 'definitionGroup' )
            {
            // InternalQL.g:1577:1: ( 'definitionGroup' )
            // InternalQL.g:1578:2: 'definitionGroup'
            {
             before(grammarAccess.getQLModelAccess().getDefinitionGroupKeyword_6_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getQLModelAccess().getDefinitionGroupKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_6__0__Impl"


    // $ANTLR start "rule__QLModel__Group_6__1"
    // InternalQL.g:1587:1: rule__QLModel__Group_6__1 : rule__QLModel__Group_6__1__Impl rule__QLModel__Group_6__2 ;
    public final void rule__QLModel__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1591:1: ( rule__QLModel__Group_6__1__Impl rule__QLModel__Group_6__2 )
            // InternalQL.g:1592:2: rule__QLModel__Group_6__1__Impl rule__QLModel__Group_6__2
            {
            pushFollow(FOLLOW_10);
            rule__QLModel__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QLModel__Group_6__2();

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
    // $ANTLR end "rule__QLModel__Group_6__1"


    // $ANTLR start "rule__QLModel__Group_6__1__Impl"
    // InternalQL.g:1599:1: rule__QLModel__Group_6__1__Impl : ( '{' ) ;
    public final void rule__QLModel__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1603:1: ( ( '{' ) )
            // InternalQL.g:1604:1: ( '{' )
            {
            // InternalQL.g:1604:1: ( '{' )
            // InternalQL.g:1605:2: '{'
            {
             before(grammarAccess.getQLModelAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getQLModelAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_6__1__Impl"


    // $ANTLR start "rule__QLModel__Group_6__2"
    // InternalQL.g:1614:1: rule__QLModel__Group_6__2 : rule__QLModel__Group_6__2__Impl rule__QLModel__Group_6__3 ;
    public final void rule__QLModel__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1618:1: ( rule__QLModel__Group_6__2__Impl rule__QLModel__Group_6__3 )
            // InternalQL.g:1619:2: rule__QLModel__Group_6__2__Impl rule__QLModel__Group_6__3
            {
            pushFollow(FOLLOW_8);
            rule__QLModel__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QLModel__Group_6__3();

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
    // $ANTLR end "rule__QLModel__Group_6__2"


    // $ANTLR start "rule__QLModel__Group_6__2__Impl"
    // InternalQL.g:1626:1: rule__QLModel__Group_6__2__Impl : ( ( rule__QLModel__DefinitionGroupAssignment_6_2 ) ) ;
    public final void rule__QLModel__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1630:1: ( ( ( rule__QLModel__DefinitionGroupAssignment_6_2 ) ) )
            // InternalQL.g:1631:1: ( ( rule__QLModel__DefinitionGroupAssignment_6_2 ) )
            {
            // InternalQL.g:1631:1: ( ( rule__QLModel__DefinitionGroupAssignment_6_2 ) )
            // InternalQL.g:1632:2: ( rule__QLModel__DefinitionGroupAssignment_6_2 )
            {
             before(grammarAccess.getQLModelAccess().getDefinitionGroupAssignment_6_2()); 
            // InternalQL.g:1633:2: ( rule__QLModel__DefinitionGroupAssignment_6_2 )
            // InternalQL.g:1633:3: rule__QLModel__DefinitionGroupAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__QLModel__DefinitionGroupAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getQLModelAccess().getDefinitionGroupAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_6__2__Impl"


    // $ANTLR start "rule__QLModel__Group_6__3"
    // InternalQL.g:1641:1: rule__QLModel__Group_6__3 : rule__QLModel__Group_6__3__Impl rule__QLModel__Group_6__4 ;
    public final void rule__QLModel__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1645:1: ( rule__QLModel__Group_6__3__Impl rule__QLModel__Group_6__4 )
            // InternalQL.g:1646:2: rule__QLModel__Group_6__3__Impl rule__QLModel__Group_6__4
            {
            pushFollow(FOLLOW_8);
            rule__QLModel__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QLModel__Group_6__4();

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
    // $ANTLR end "rule__QLModel__Group_6__3"


    // $ANTLR start "rule__QLModel__Group_6__3__Impl"
    // InternalQL.g:1653:1: rule__QLModel__Group_6__3__Impl : ( ( rule__QLModel__Group_6_3__0 )* ) ;
    public final void rule__QLModel__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1657:1: ( ( ( rule__QLModel__Group_6_3__0 )* ) )
            // InternalQL.g:1658:1: ( ( rule__QLModel__Group_6_3__0 )* )
            {
            // InternalQL.g:1658:1: ( ( rule__QLModel__Group_6_3__0 )* )
            // InternalQL.g:1659:2: ( rule__QLModel__Group_6_3__0 )*
            {
             before(grammarAccess.getQLModelAccess().getGroup_6_3()); 
            // InternalQL.g:1660:2: ( rule__QLModel__Group_6_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==33) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalQL.g:1660:3: rule__QLModel__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__QLModel__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getQLModelAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_6__3__Impl"


    // $ANTLR start "rule__QLModel__Group_6__4"
    // InternalQL.g:1668:1: rule__QLModel__Group_6__4 : rule__QLModel__Group_6__4__Impl ;
    public final void rule__QLModel__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1672:1: ( rule__QLModel__Group_6__4__Impl )
            // InternalQL.g:1673:2: rule__QLModel__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QLModel__Group_6__4__Impl();

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
    // $ANTLR end "rule__QLModel__Group_6__4"


    // $ANTLR start "rule__QLModel__Group_6__4__Impl"
    // InternalQL.g:1679:1: rule__QLModel__Group_6__4__Impl : ( '}' ) ;
    public final void rule__QLModel__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1683:1: ( ( '}' ) )
            // InternalQL.g:1684:1: ( '}' )
            {
            // InternalQL.g:1684:1: ( '}' )
            // InternalQL.g:1685:2: '}'
            {
             before(grammarAccess.getQLModelAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getQLModelAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_6__4__Impl"


    // $ANTLR start "rule__QLModel__Group_6_3__0"
    // InternalQL.g:1695:1: rule__QLModel__Group_6_3__0 : rule__QLModel__Group_6_3__0__Impl rule__QLModel__Group_6_3__1 ;
    public final void rule__QLModel__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1699:1: ( rule__QLModel__Group_6_3__0__Impl rule__QLModel__Group_6_3__1 )
            // InternalQL.g:1700:2: rule__QLModel__Group_6_3__0__Impl rule__QLModel__Group_6_3__1
            {
            pushFollow(FOLLOW_10);
            rule__QLModel__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QLModel__Group_6_3__1();

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
    // $ANTLR end "rule__QLModel__Group_6_3__0"


    // $ANTLR start "rule__QLModel__Group_6_3__0__Impl"
    // InternalQL.g:1707:1: rule__QLModel__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__QLModel__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1711:1: ( ( ',' ) )
            // InternalQL.g:1712:1: ( ',' )
            {
            // InternalQL.g:1712:1: ( ',' )
            // InternalQL.g:1713:2: ','
            {
             before(grammarAccess.getQLModelAccess().getCommaKeyword_6_3_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getQLModelAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_6_3__0__Impl"


    // $ANTLR start "rule__QLModel__Group_6_3__1"
    // InternalQL.g:1722:1: rule__QLModel__Group_6_3__1 : rule__QLModel__Group_6_3__1__Impl ;
    public final void rule__QLModel__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1726:1: ( rule__QLModel__Group_6_3__1__Impl )
            // InternalQL.g:1727:2: rule__QLModel__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QLModel__Group_6_3__1__Impl();

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
    // $ANTLR end "rule__QLModel__Group_6_3__1"


    // $ANTLR start "rule__QLModel__Group_6_3__1__Impl"
    // InternalQL.g:1733:1: rule__QLModel__Group_6_3__1__Impl : ( ( rule__QLModel__DefinitionGroupAssignment_6_3_1 ) ) ;
    public final void rule__QLModel__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1737:1: ( ( ( rule__QLModel__DefinitionGroupAssignment_6_3_1 ) ) )
            // InternalQL.g:1738:1: ( ( rule__QLModel__DefinitionGroupAssignment_6_3_1 ) )
            {
            // InternalQL.g:1738:1: ( ( rule__QLModel__DefinitionGroupAssignment_6_3_1 ) )
            // InternalQL.g:1739:2: ( rule__QLModel__DefinitionGroupAssignment_6_3_1 )
            {
             before(grammarAccess.getQLModelAccess().getDefinitionGroupAssignment_6_3_1()); 
            // InternalQL.g:1740:2: ( rule__QLModel__DefinitionGroupAssignment_6_3_1 )
            // InternalQL.g:1740:3: rule__QLModel__DefinitionGroupAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__QLModel__DefinitionGroupAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getQLModelAccess().getDefinitionGroupAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__Group_6_3__1__Impl"


    // $ANTLR start "rule__Form__Group__0"
    // InternalQL.g:1749:1: rule__Form__Group__0 : rule__Form__Group__0__Impl rule__Form__Group__1 ;
    public final void rule__Form__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1753:1: ( rule__Form__Group__0__Impl rule__Form__Group__1 )
            // InternalQL.g:1754:2: rule__Form__Group__0__Impl rule__Form__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalQL.g:1761:1: rule__Form__Group__0__Impl : ( 'Form' ) ;
    public final void rule__Form__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1765:1: ( ( 'Form' ) )
            // InternalQL.g:1766:1: ( 'Form' )
            {
            // InternalQL.g:1766:1: ( 'Form' )
            // InternalQL.g:1767:2: 'Form'
            {
             before(grammarAccess.getFormAccess().getFormKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalQL.g:1776:1: rule__Form__Group__1 : rule__Form__Group__1__Impl rule__Form__Group__2 ;
    public final void rule__Form__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1780:1: ( rule__Form__Group__1__Impl rule__Form__Group__2 )
            // InternalQL.g:1781:2: rule__Form__Group__1__Impl rule__Form__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalQL.g:1788:1: rule__Form__Group__1__Impl : ( ( rule__Form__NameAssignment_1 ) ) ;
    public final void rule__Form__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1792:1: ( ( ( rule__Form__NameAssignment_1 ) ) )
            // InternalQL.g:1793:1: ( ( rule__Form__NameAssignment_1 ) )
            {
            // InternalQL.g:1793:1: ( ( rule__Form__NameAssignment_1 ) )
            // InternalQL.g:1794:2: ( rule__Form__NameAssignment_1 )
            {
             before(grammarAccess.getFormAccess().getNameAssignment_1()); 
            // InternalQL.g:1795:2: ( rule__Form__NameAssignment_1 )
            // InternalQL.g:1795:3: rule__Form__NameAssignment_1
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
    // InternalQL.g:1803:1: rule__Form__Group__2 : rule__Form__Group__2__Impl rule__Form__Group__3 ;
    public final void rule__Form__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1807:1: ( rule__Form__Group__2__Impl rule__Form__Group__3 )
            // InternalQL.g:1808:2: rule__Form__Group__2__Impl rule__Form__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Form__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Form__Group__3();

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
    // InternalQL.g:1815:1: rule__Form__Group__2__Impl : ( '{' ) ;
    public final void rule__Form__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1819:1: ( ( '{' ) )
            // InternalQL.g:1820:1: ( '{' )
            {
            // InternalQL.g:1820:1: ( '{' )
            // InternalQL.g:1821:2: '{'
            {
             before(grammarAccess.getFormAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getFormAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Form__Group__3"
    // InternalQL.g:1830:1: rule__Form__Group__3 : rule__Form__Group__3__Impl rule__Form__Group__4 ;
    public final void rule__Form__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1834:1: ( rule__Form__Group__3__Impl rule__Form__Group__4 )
            // InternalQL.g:1835:2: rule__Form__Group__3__Impl rule__Form__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Form__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Form__Group__4();

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
    // $ANTLR end "rule__Form__Group__3"


    // $ANTLR start "rule__Form__Group__3__Impl"
    // InternalQL.g:1842:1: rule__Form__Group__3__Impl : ( 'questionGroup' ) ;
    public final void rule__Form__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1846:1: ( ( 'questionGroup' ) )
            // InternalQL.g:1847:1: ( 'questionGroup' )
            {
            // InternalQL.g:1847:1: ( 'questionGroup' )
            // InternalQL.g:1848:2: 'questionGroup'
            {
             before(grammarAccess.getFormAccess().getQuestionGroupKeyword_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getFormAccess().getQuestionGroupKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__3__Impl"


    // $ANTLR start "rule__Form__Group__4"
    // InternalQL.g:1857:1: rule__Form__Group__4 : rule__Form__Group__4__Impl rule__Form__Group__5 ;
    public final void rule__Form__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1861:1: ( rule__Form__Group__4__Impl rule__Form__Group__5 )
            // InternalQL.g:1862:2: rule__Form__Group__4__Impl rule__Form__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Form__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Form__Group__5();

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
    // $ANTLR end "rule__Form__Group__4"


    // $ANTLR start "rule__Form__Group__4__Impl"
    // InternalQL.g:1869:1: rule__Form__Group__4__Impl : ( ( rule__Form__QuestionGroupAssignment_4 ) ) ;
    public final void rule__Form__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1873:1: ( ( ( rule__Form__QuestionGroupAssignment_4 ) ) )
            // InternalQL.g:1874:1: ( ( rule__Form__QuestionGroupAssignment_4 ) )
            {
            // InternalQL.g:1874:1: ( ( rule__Form__QuestionGroupAssignment_4 ) )
            // InternalQL.g:1875:2: ( rule__Form__QuestionGroupAssignment_4 )
            {
             before(grammarAccess.getFormAccess().getQuestionGroupAssignment_4()); 
            // InternalQL.g:1876:2: ( rule__Form__QuestionGroupAssignment_4 )
            // InternalQL.g:1876:3: rule__Form__QuestionGroupAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Form__QuestionGroupAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFormAccess().getQuestionGroupAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__4__Impl"


    // $ANTLR start "rule__Form__Group__5"
    // InternalQL.g:1884:1: rule__Form__Group__5 : rule__Form__Group__5__Impl ;
    public final void rule__Form__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1888:1: ( rule__Form__Group__5__Impl )
            // InternalQL.g:1889:2: rule__Form__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Form__Group__5__Impl();

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
    // $ANTLR end "rule__Form__Group__5"


    // $ANTLR start "rule__Form__Group__5__Impl"
    // InternalQL.g:1895:1: rule__Form__Group__5__Impl : ( '}' ) ;
    public final void rule__Form__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1899:1: ( ( '}' ) )
            // InternalQL.g:1900:1: ( '}' )
            {
            // InternalQL.g:1900:1: ( '}' )
            // InternalQL.g:1901:2: '}'
            {
             before(grammarAccess.getFormAccess().getRightCurlyBracketKeyword_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getFormAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__5__Impl"


    // $ANTLR start "rule__DefinitionGroup__Group__0"
    // InternalQL.g:1911:1: rule__DefinitionGroup__Group__0 : rule__DefinitionGroup__Group__0__Impl rule__DefinitionGroup__Group__1 ;
    public final void rule__DefinitionGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1915:1: ( rule__DefinitionGroup__Group__0__Impl rule__DefinitionGroup__Group__1 )
            // InternalQL.g:1916:2: rule__DefinitionGroup__Group__0__Impl rule__DefinitionGroup__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalQL.g:1923:1: rule__DefinitionGroup__Group__0__Impl : ( () ) ;
    public final void rule__DefinitionGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1927:1: ( ( () ) )
            // InternalQL.g:1928:1: ( () )
            {
            // InternalQL.g:1928:1: ( () )
            // InternalQL.g:1929:2: ()
            {
             before(grammarAccess.getDefinitionGroupAccess().getDefinitionGroupAction_0()); 
            // InternalQL.g:1930:2: ()
            // InternalQL.g:1930:3: 
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
    // InternalQL.g:1938:1: rule__DefinitionGroup__Group__1 : rule__DefinitionGroup__Group__1__Impl rule__DefinitionGroup__Group__2 ;
    public final void rule__DefinitionGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1942:1: ( rule__DefinitionGroup__Group__1__Impl rule__DefinitionGroup__Group__2 )
            // InternalQL.g:1943:2: rule__DefinitionGroup__Group__1__Impl rule__DefinitionGroup__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalQL.g:1950:1: rule__DefinitionGroup__Group__1__Impl : ( 'DefinitionGroup' ) ;
    public final void rule__DefinitionGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1954:1: ( ( 'DefinitionGroup' ) )
            // InternalQL.g:1955:1: ( 'DefinitionGroup' )
            {
            // InternalQL.g:1955:1: ( 'DefinitionGroup' )
            // InternalQL.g:1956:2: 'DefinitionGroup'
            {
             before(grammarAccess.getDefinitionGroupAccess().getDefinitionGroupKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getDefinitionGroupAccess().getDefinitionGroupKeyword_1()); 

            }


            }

        }
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
    // InternalQL.g:1965:1: rule__DefinitionGroup__Group__2 : rule__DefinitionGroup__Group__2__Impl rule__DefinitionGroup__Group__3 ;
    public final void rule__DefinitionGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1969:1: ( rule__DefinitionGroup__Group__2__Impl rule__DefinitionGroup__Group__3 )
            // InternalQL.g:1970:2: rule__DefinitionGroup__Group__2__Impl rule__DefinitionGroup__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalQL.g:1977:1: rule__DefinitionGroup__Group__2__Impl : ( '{' ) ;
    public final void rule__DefinitionGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1981:1: ( ( '{' ) )
            // InternalQL.g:1982:1: ( '{' )
            {
            // InternalQL.g:1982:1: ( '{' )
            // InternalQL.g:1983:2: '{'
            {
             before(grammarAccess.getDefinitionGroupAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
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
    // InternalQL.g:1992:1: rule__DefinitionGroup__Group__3 : rule__DefinitionGroup__Group__3__Impl rule__DefinitionGroup__Group__4 ;
    public final void rule__DefinitionGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:1996:1: ( rule__DefinitionGroup__Group__3__Impl rule__DefinitionGroup__Group__4 )
            // InternalQL.g:1997:2: rule__DefinitionGroup__Group__3__Impl rule__DefinitionGroup__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalQL.g:2004:1: rule__DefinitionGroup__Group__3__Impl : ( ( rule__DefinitionGroup__Group_3__0 )? ) ;
    public final void rule__DefinitionGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2008:1: ( ( ( rule__DefinitionGroup__Group_3__0 )? ) )
            // InternalQL.g:2009:1: ( ( rule__DefinitionGroup__Group_3__0 )? )
            {
            // InternalQL.g:2009:1: ( ( rule__DefinitionGroup__Group_3__0 )? )
            // InternalQL.g:2010:2: ( rule__DefinitionGroup__Group_3__0 )?
            {
             before(grammarAccess.getDefinitionGroupAccess().getGroup_3()); 
            // InternalQL.g:2011:2: ( rule__DefinitionGroup__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==38) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalQL.g:2011:3: rule__DefinitionGroup__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DefinitionGroup__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDefinitionGroupAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalQL.g:2019:1: rule__DefinitionGroup__Group__4 : rule__DefinitionGroup__Group__4__Impl rule__DefinitionGroup__Group__5 ;
    public final void rule__DefinitionGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2023:1: ( rule__DefinitionGroup__Group__4__Impl rule__DefinitionGroup__Group__5 )
            // InternalQL.g:2024:2: rule__DefinitionGroup__Group__4__Impl rule__DefinitionGroup__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__DefinitionGroup__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefinitionGroup__Group__5();

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
    // InternalQL.g:2031:1: rule__DefinitionGroup__Group__4__Impl : ( ( rule__DefinitionGroup__Group_4__0 )? ) ;
    public final void rule__DefinitionGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2035:1: ( ( ( rule__DefinitionGroup__Group_4__0 )? ) )
            // InternalQL.g:2036:1: ( ( rule__DefinitionGroup__Group_4__0 )? )
            {
            // InternalQL.g:2036:1: ( ( rule__DefinitionGroup__Group_4__0 )? )
            // InternalQL.g:2037:2: ( rule__DefinitionGroup__Group_4__0 )?
            {
             before(grammarAccess.getDefinitionGroupAccess().getGroup_4()); 
            // InternalQL.g:2038:2: ( rule__DefinitionGroup__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==39) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalQL.g:2038:3: rule__DefinitionGroup__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DefinitionGroup__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDefinitionGroupAccess().getGroup_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__DefinitionGroup__Group__5"
    // InternalQL.g:2046:1: rule__DefinitionGroup__Group__5 : rule__DefinitionGroup__Group__5__Impl ;
    public final void rule__DefinitionGroup__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2050:1: ( rule__DefinitionGroup__Group__5__Impl )
            // InternalQL.g:2051:2: rule__DefinitionGroup__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefinitionGroup__Group__5__Impl();

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
    // $ANTLR end "rule__DefinitionGroup__Group__5"


    // $ANTLR start "rule__DefinitionGroup__Group__5__Impl"
    // InternalQL.g:2057:1: rule__DefinitionGroup__Group__5__Impl : ( '}' ) ;
    public final void rule__DefinitionGroup__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2061:1: ( ( '}' ) )
            // InternalQL.g:2062:1: ( '}' )
            {
            // InternalQL.g:2062:1: ( '}' )
            // InternalQL.g:2063:2: '}'
            {
             before(grammarAccess.getDefinitionGroupAccess().getRightCurlyBracketKeyword_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDefinitionGroupAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionGroup__Group__5__Impl"


    // $ANTLR start "rule__DefinitionGroup__Group_3__0"
    // InternalQL.g:2073:1: rule__DefinitionGroup__Group_3__0 : rule__DefinitionGroup__Group_3__0__Impl rule__DefinitionGroup__Group_3__1 ;
    public final void rule__DefinitionGroup__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2077:1: ( rule__DefinitionGroup__Group_3__0__Impl rule__DefinitionGroup__Group_3__1 )
            // InternalQL.g:2078:2: rule__DefinitionGroup__Group_3__0__Impl rule__DefinitionGroup__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__DefinitionGroup__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefinitionGroup__Group_3__1();

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
    // $ANTLR end "rule__DefinitionGroup__Group_3__0"


    // $ANTLR start "rule__DefinitionGroup__Group_3__0__Impl"
    // InternalQL.g:2085:1: rule__DefinitionGroup__Group_3__0__Impl : ( 'dataTypes' ) ;
    public final void rule__DefinitionGroup__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2089:1: ( ( 'dataTypes' ) )
            // InternalQL.g:2090:1: ( 'dataTypes' )
            {
            // InternalQL.g:2090:1: ( 'dataTypes' )
            // InternalQL.g:2091:2: 'dataTypes'
            {
             before(grammarAccess.getDefinitionGroupAccess().getDataTypesKeyword_3_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getDefinitionGroupAccess().getDataTypesKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionGroup__Group_3__0__Impl"


    // $ANTLR start "rule__DefinitionGroup__Group_3__1"
    // InternalQL.g:2100:1: rule__DefinitionGroup__Group_3__1 : rule__DefinitionGroup__Group_3__1__Impl rule__DefinitionGroup__Group_3__2 ;
    public final void rule__DefinitionGroup__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2104:1: ( rule__DefinitionGroup__Group_3__1__Impl rule__DefinitionGroup__Group_3__2 )
            // InternalQL.g:2105:2: rule__DefinitionGroup__Group_3__1__Impl rule__DefinitionGroup__Group_3__2
            {
            pushFollow(FOLLOW_16);
            rule__DefinitionGroup__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefinitionGroup__Group_3__2();

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
    // $ANTLR end "rule__DefinitionGroup__Group_3__1"


    // $ANTLR start "rule__DefinitionGroup__Group_3__1__Impl"
    // InternalQL.g:2112:1: rule__DefinitionGroup__Group_3__1__Impl : ( '{' ) ;
    public final void rule__DefinitionGroup__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2116:1: ( ( '{' ) )
            // InternalQL.g:2117:1: ( '{' )
            {
            // InternalQL.g:2117:1: ( '{' )
            // InternalQL.g:2118:2: '{'
            {
             before(grammarAccess.getDefinitionGroupAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDefinitionGroupAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionGroup__Group_3__1__Impl"


    // $ANTLR start "rule__DefinitionGroup__Group_3__2"
    // InternalQL.g:2127:1: rule__DefinitionGroup__Group_3__2 : rule__DefinitionGroup__Group_3__2__Impl rule__DefinitionGroup__Group_3__3 ;
    public final void rule__DefinitionGroup__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2131:1: ( rule__DefinitionGroup__Group_3__2__Impl rule__DefinitionGroup__Group_3__3 )
            // InternalQL.g:2132:2: rule__DefinitionGroup__Group_3__2__Impl rule__DefinitionGroup__Group_3__3
            {
            pushFollow(FOLLOW_8);
            rule__DefinitionGroup__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefinitionGroup__Group_3__3();

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
    // $ANTLR end "rule__DefinitionGroup__Group_3__2"


    // $ANTLR start "rule__DefinitionGroup__Group_3__2__Impl"
    // InternalQL.g:2139:1: rule__DefinitionGroup__Group_3__2__Impl : ( ( rule__DefinitionGroup__DataTypesAssignment_3_2 ) ) ;
    public final void rule__DefinitionGroup__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2143:1: ( ( ( rule__DefinitionGroup__DataTypesAssignment_3_2 ) ) )
            // InternalQL.g:2144:1: ( ( rule__DefinitionGroup__DataTypesAssignment_3_2 ) )
            {
            // InternalQL.g:2144:1: ( ( rule__DefinitionGroup__DataTypesAssignment_3_2 ) )
            // InternalQL.g:2145:2: ( rule__DefinitionGroup__DataTypesAssignment_3_2 )
            {
             before(grammarAccess.getDefinitionGroupAccess().getDataTypesAssignment_3_2()); 
            // InternalQL.g:2146:2: ( rule__DefinitionGroup__DataTypesAssignment_3_2 )
            // InternalQL.g:2146:3: rule__DefinitionGroup__DataTypesAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__DefinitionGroup__DataTypesAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionGroupAccess().getDataTypesAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionGroup__Group_3__2__Impl"


    // $ANTLR start "rule__DefinitionGroup__Group_3__3"
    // InternalQL.g:2154:1: rule__DefinitionGroup__Group_3__3 : rule__DefinitionGroup__Group_3__3__Impl rule__DefinitionGroup__Group_3__4 ;
    public final void rule__DefinitionGroup__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2158:1: ( rule__DefinitionGroup__Group_3__3__Impl rule__DefinitionGroup__Group_3__4 )
            // InternalQL.g:2159:2: rule__DefinitionGroup__Group_3__3__Impl rule__DefinitionGroup__Group_3__4
            {
            pushFollow(FOLLOW_8);
            rule__DefinitionGroup__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefinitionGroup__Group_3__4();

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
    // $ANTLR end "rule__DefinitionGroup__Group_3__3"


    // $ANTLR start "rule__DefinitionGroup__Group_3__3__Impl"
    // InternalQL.g:2166:1: rule__DefinitionGroup__Group_3__3__Impl : ( ( rule__DefinitionGroup__Group_3_3__0 )* ) ;
    public final void rule__DefinitionGroup__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2170:1: ( ( ( rule__DefinitionGroup__Group_3_3__0 )* ) )
            // InternalQL.g:2171:1: ( ( rule__DefinitionGroup__Group_3_3__0 )* )
            {
            // InternalQL.g:2171:1: ( ( rule__DefinitionGroup__Group_3_3__0 )* )
            // InternalQL.g:2172:2: ( rule__DefinitionGroup__Group_3_3__0 )*
            {
             before(grammarAccess.getDefinitionGroupAccess().getGroup_3_3()); 
            // InternalQL.g:2173:2: ( rule__DefinitionGroup__Group_3_3__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==33) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalQL.g:2173:3: rule__DefinitionGroup__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__DefinitionGroup__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getDefinitionGroupAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionGroup__Group_3__3__Impl"


    // $ANTLR start "rule__DefinitionGroup__Group_3__4"
    // InternalQL.g:2181:1: rule__DefinitionGroup__Group_3__4 : rule__DefinitionGroup__Group_3__4__Impl ;
    public final void rule__DefinitionGroup__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2185:1: ( rule__DefinitionGroup__Group_3__4__Impl )
            // InternalQL.g:2186:2: rule__DefinitionGroup__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefinitionGroup__Group_3__4__Impl();

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
    // $ANTLR end "rule__DefinitionGroup__Group_3__4"


    // $ANTLR start "rule__DefinitionGroup__Group_3__4__Impl"
    // InternalQL.g:2192:1: rule__DefinitionGroup__Group_3__4__Impl : ( '}' ) ;
    public final void rule__DefinitionGroup__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2196:1: ( ( '}' ) )
            // InternalQL.g:2197:1: ( '}' )
            {
            // InternalQL.g:2197:1: ( '}' )
            // InternalQL.g:2198:2: '}'
            {
             before(grammarAccess.getDefinitionGroupAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDefinitionGroupAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionGroup__Group_3__4__Impl"


    // $ANTLR start "rule__DefinitionGroup__Group_3_3__0"
    // InternalQL.g:2208:1: rule__DefinitionGroup__Group_3_3__0 : rule__DefinitionGroup__Group_3_3__0__Impl rule__DefinitionGroup__Group_3_3__1 ;
    public final void rule__DefinitionGroup__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2212:1: ( rule__DefinitionGroup__Group_3_3__0__Impl rule__DefinitionGroup__Group_3_3__1 )
            // InternalQL.g:2213:2: rule__DefinitionGroup__Group_3_3__0__Impl rule__DefinitionGroup__Group_3_3__1
            {
            pushFollow(FOLLOW_16);
            rule__DefinitionGroup__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefinitionGroup__Group_3_3__1();

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
    // $ANTLR end "rule__DefinitionGroup__Group_3_3__0"


    // $ANTLR start "rule__DefinitionGroup__Group_3_3__0__Impl"
    // InternalQL.g:2220:1: rule__DefinitionGroup__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__DefinitionGroup__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2224:1: ( ( ',' ) )
            // InternalQL.g:2225:1: ( ',' )
            {
            // InternalQL.g:2225:1: ( ',' )
            // InternalQL.g:2226:2: ','
            {
             before(grammarAccess.getDefinitionGroupAccess().getCommaKeyword_3_3_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getDefinitionGroupAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionGroup__Group_3_3__0__Impl"


    // $ANTLR start "rule__DefinitionGroup__Group_3_3__1"
    // InternalQL.g:2235:1: rule__DefinitionGroup__Group_3_3__1 : rule__DefinitionGroup__Group_3_3__1__Impl ;
    public final void rule__DefinitionGroup__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2239:1: ( rule__DefinitionGroup__Group_3_3__1__Impl )
            // InternalQL.g:2240:2: rule__DefinitionGroup__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefinitionGroup__Group_3_3__1__Impl();

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
    // $ANTLR end "rule__DefinitionGroup__Group_3_3__1"


    // $ANTLR start "rule__DefinitionGroup__Group_3_3__1__Impl"
    // InternalQL.g:2246:1: rule__DefinitionGroup__Group_3_3__1__Impl : ( ( rule__DefinitionGroup__DataTypesAssignment_3_3_1 ) ) ;
    public final void rule__DefinitionGroup__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2250:1: ( ( ( rule__DefinitionGroup__DataTypesAssignment_3_3_1 ) ) )
            // InternalQL.g:2251:1: ( ( rule__DefinitionGroup__DataTypesAssignment_3_3_1 ) )
            {
            // InternalQL.g:2251:1: ( ( rule__DefinitionGroup__DataTypesAssignment_3_3_1 ) )
            // InternalQL.g:2252:2: ( rule__DefinitionGroup__DataTypesAssignment_3_3_1 )
            {
             before(grammarAccess.getDefinitionGroupAccess().getDataTypesAssignment_3_3_1()); 
            // InternalQL.g:2253:2: ( rule__DefinitionGroup__DataTypesAssignment_3_3_1 )
            // InternalQL.g:2253:3: rule__DefinitionGroup__DataTypesAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__DefinitionGroup__DataTypesAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionGroupAccess().getDataTypesAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionGroup__Group_3_3__1__Impl"


    // $ANTLR start "rule__DefinitionGroup__Group_4__0"
    // InternalQL.g:2262:1: rule__DefinitionGroup__Group_4__0 : rule__DefinitionGroup__Group_4__0__Impl rule__DefinitionGroup__Group_4__1 ;
    public final void rule__DefinitionGroup__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2266:1: ( rule__DefinitionGroup__Group_4__0__Impl rule__DefinitionGroup__Group_4__1 )
            // InternalQL.g:2267:2: rule__DefinitionGroup__Group_4__0__Impl rule__DefinitionGroup__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__DefinitionGroup__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefinitionGroup__Group_4__1();

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
    // $ANTLR end "rule__DefinitionGroup__Group_4__0"


    // $ANTLR start "rule__DefinitionGroup__Group_4__0__Impl"
    // InternalQL.g:2274:1: rule__DefinitionGroup__Group_4__0__Impl : ( 'questionDefinitions' ) ;
    public final void rule__DefinitionGroup__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2278:1: ( ( 'questionDefinitions' ) )
            // InternalQL.g:2279:1: ( 'questionDefinitions' )
            {
            // InternalQL.g:2279:1: ( 'questionDefinitions' )
            // InternalQL.g:2280:2: 'questionDefinitions'
            {
             before(grammarAccess.getDefinitionGroupAccess().getQuestionDefinitionsKeyword_4_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getDefinitionGroupAccess().getQuestionDefinitionsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionGroup__Group_4__0__Impl"


    // $ANTLR start "rule__DefinitionGroup__Group_4__1"
    // InternalQL.g:2289:1: rule__DefinitionGroup__Group_4__1 : rule__DefinitionGroup__Group_4__1__Impl rule__DefinitionGroup__Group_4__2 ;
    public final void rule__DefinitionGroup__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2293:1: ( rule__DefinitionGroup__Group_4__1__Impl rule__DefinitionGroup__Group_4__2 )
            // InternalQL.g:2294:2: rule__DefinitionGroup__Group_4__1__Impl rule__DefinitionGroup__Group_4__2
            {
            pushFollow(FOLLOW_17);
            rule__DefinitionGroup__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefinitionGroup__Group_4__2();

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
    // $ANTLR end "rule__DefinitionGroup__Group_4__1"


    // $ANTLR start "rule__DefinitionGroup__Group_4__1__Impl"
    // InternalQL.g:2301:1: rule__DefinitionGroup__Group_4__1__Impl : ( '{' ) ;
    public final void rule__DefinitionGroup__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2305:1: ( ( '{' ) )
            // InternalQL.g:2306:1: ( '{' )
            {
            // InternalQL.g:2306:1: ( '{' )
            // InternalQL.g:2307:2: '{'
            {
             before(grammarAccess.getDefinitionGroupAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDefinitionGroupAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionGroup__Group_4__1__Impl"


    // $ANTLR start "rule__DefinitionGroup__Group_4__2"
    // InternalQL.g:2316:1: rule__DefinitionGroup__Group_4__2 : rule__DefinitionGroup__Group_4__2__Impl rule__DefinitionGroup__Group_4__3 ;
    public final void rule__DefinitionGroup__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2320:1: ( rule__DefinitionGroup__Group_4__2__Impl rule__DefinitionGroup__Group_4__3 )
            // InternalQL.g:2321:2: rule__DefinitionGroup__Group_4__2__Impl rule__DefinitionGroup__Group_4__3
            {
            pushFollow(FOLLOW_8);
            rule__DefinitionGroup__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefinitionGroup__Group_4__3();

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
    // $ANTLR end "rule__DefinitionGroup__Group_4__2"


    // $ANTLR start "rule__DefinitionGroup__Group_4__2__Impl"
    // InternalQL.g:2328:1: rule__DefinitionGroup__Group_4__2__Impl : ( ( rule__DefinitionGroup__QuestionDefinitionsAssignment_4_2 ) ) ;
    public final void rule__DefinitionGroup__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2332:1: ( ( ( rule__DefinitionGroup__QuestionDefinitionsAssignment_4_2 ) ) )
            // InternalQL.g:2333:1: ( ( rule__DefinitionGroup__QuestionDefinitionsAssignment_4_2 ) )
            {
            // InternalQL.g:2333:1: ( ( rule__DefinitionGroup__QuestionDefinitionsAssignment_4_2 ) )
            // InternalQL.g:2334:2: ( rule__DefinitionGroup__QuestionDefinitionsAssignment_4_2 )
            {
             before(grammarAccess.getDefinitionGroupAccess().getQuestionDefinitionsAssignment_4_2()); 
            // InternalQL.g:2335:2: ( rule__DefinitionGroup__QuestionDefinitionsAssignment_4_2 )
            // InternalQL.g:2335:3: rule__DefinitionGroup__QuestionDefinitionsAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__DefinitionGroup__QuestionDefinitionsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionGroupAccess().getQuestionDefinitionsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionGroup__Group_4__2__Impl"


    // $ANTLR start "rule__DefinitionGroup__Group_4__3"
    // InternalQL.g:2343:1: rule__DefinitionGroup__Group_4__3 : rule__DefinitionGroup__Group_4__3__Impl rule__DefinitionGroup__Group_4__4 ;
    public final void rule__DefinitionGroup__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2347:1: ( rule__DefinitionGroup__Group_4__3__Impl rule__DefinitionGroup__Group_4__4 )
            // InternalQL.g:2348:2: rule__DefinitionGroup__Group_4__3__Impl rule__DefinitionGroup__Group_4__4
            {
            pushFollow(FOLLOW_8);
            rule__DefinitionGroup__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefinitionGroup__Group_4__4();

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
    // $ANTLR end "rule__DefinitionGroup__Group_4__3"


    // $ANTLR start "rule__DefinitionGroup__Group_4__3__Impl"
    // InternalQL.g:2355:1: rule__DefinitionGroup__Group_4__3__Impl : ( ( rule__DefinitionGroup__Group_4_3__0 )* ) ;
    public final void rule__DefinitionGroup__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2359:1: ( ( ( rule__DefinitionGroup__Group_4_3__0 )* ) )
            // InternalQL.g:2360:1: ( ( rule__DefinitionGroup__Group_4_3__0 )* )
            {
            // InternalQL.g:2360:1: ( ( rule__DefinitionGroup__Group_4_3__0 )* )
            // InternalQL.g:2361:2: ( rule__DefinitionGroup__Group_4_3__0 )*
            {
             before(grammarAccess.getDefinitionGroupAccess().getGroup_4_3()); 
            // InternalQL.g:2362:2: ( rule__DefinitionGroup__Group_4_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==33) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalQL.g:2362:3: rule__DefinitionGroup__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__DefinitionGroup__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getDefinitionGroupAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionGroup__Group_4__3__Impl"


    // $ANTLR start "rule__DefinitionGroup__Group_4__4"
    // InternalQL.g:2370:1: rule__DefinitionGroup__Group_4__4 : rule__DefinitionGroup__Group_4__4__Impl ;
    public final void rule__DefinitionGroup__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2374:1: ( rule__DefinitionGroup__Group_4__4__Impl )
            // InternalQL.g:2375:2: rule__DefinitionGroup__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefinitionGroup__Group_4__4__Impl();

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
    // $ANTLR end "rule__DefinitionGroup__Group_4__4"


    // $ANTLR start "rule__DefinitionGroup__Group_4__4__Impl"
    // InternalQL.g:2381:1: rule__DefinitionGroup__Group_4__4__Impl : ( '}' ) ;
    public final void rule__DefinitionGroup__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2385:1: ( ( '}' ) )
            // InternalQL.g:2386:1: ( '}' )
            {
            // InternalQL.g:2386:1: ( '}' )
            // InternalQL.g:2387:2: '}'
            {
             before(grammarAccess.getDefinitionGroupAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDefinitionGroupAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionGroup__Group_4__4__Impl"


    // $ANTLR start "rule__DefinitionGroup__Group_4_3__0"
    // InternalQL.g:2397:1: rule__DefinitionGroup__Group_4_3__0 : rule__DefinitionGroup__Group_4_3__0__Impl rule__DefinitionGroup__Group_4_3__1 ;
    public final void rule__DefinitionGroup__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2401:1: ( rule__DefinitionGroup__Group_4_3__0__Impl rule__DefinitionGroup__Group_4_3__1 )
            // InternalQL.g:2402:2: rule__DefinitionGroup__Group_4_3__0__Impl rule__DefinitionGroup__Group_4_3__1
            {
            pushFollow(FOLLOW_17);
            rule__DefinitionGroup__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefinitionGroup__Group_4_3__1();

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
    // $ANTLR end "rule__DefinitionGroup__Group_4_3__0"


    // $ANTLR start "rule__DefinitionGroup__Group_4_3__0__Impl"
    // InternalQL.g:2409:1: rule__DefinitionGroup__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__DefinitionGroup__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2413:1: ( ( ',' ) )
            // InternalQL.g:2414:1: ( ',' )
            {
            // InternalQL.g:2414:1: ( ',' )
            // InternalQL.g:2415:2: ','
            {
             before(grammarAccess.getDefinitionGroupAccess().getCommaKeyword_4_3_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getDefinitionGroupAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionGroup__Group_4_3__0__Impl"


    // $ANTLR start "rule__DefinitionGroup__Group_4_3__1"
    // InternalQL.g:2424:1: rule__DefinitionGroup__Group_4_3__1 : rule__DefinitionGroup__Group_4_3__1__Impl ;
    public final void rule__DefinitionGroup__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2428:1: ( rule__DefinitionGroup__Group_4_3__1__Impl )
            // InternalQL.g:2429:2: rule__DefinitionGroup__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefinitionGroup__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__DefinitionGroup__Group_4_3__1"


    // $ANTLR start "rule__DefinitionGroup__Group_4_3__1__Impl"
    // InternalQL.g:2435:1: rule__DefinitionGroup__Group_4_3__1__Impl : ( ( rule__DefinitionGroup__QuestionDefinitionsAssignment_4_3_1 ) ) ;
    public final void rule__DefinitionGroup__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2439:1: ( ( ( rule__DefinitionGroup__QuestionDefinitionsAssignment_4_3_1 ) ) )
            // InternalQL.g:2440:1: ( ( rule__DefinitionGroup__QuestionDefinitionsAssignment_4_3_1 ) )
            {
            // InternalQL.g:2440:1: ( ( rule__DefinitionGroup__QuestionDefinitionsAssignment_4_3_1 ) )
            // InternalQL.g:2441:2: ( rule__DefinitionGroup__QuestionDefinitionsAssignment_4_3_1 )
            {
             before(grammarAccess.getDefinitionGroupAccess().getQuestionDefinitionsAssignment_4_3_1()); 
            // InternalQL.g:2442:2: ( rule__DefinitionGroup__QuestionDefinitionsAssignment_4_3_1 )
            // InternalQL.g:2442:3: rule__DefinitionGroup__QuestionDefinitionsAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__DefinitionGroup__QuestionDefinitionsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionGroupAccess().getQuestionDefinitionsAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionGroup__Group_4_3__1__Impl"


    // $ANTLR start "rule__QuestionGroup__Group__0"
    // InternalQL.g:2451:1: rule__QuestionGroup__Group__0 : rule__QuestionGroup__Group__0__Impl rule__QuestionGroup__Group__1 ;
    public final void rule__QuestionGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2455:1: ( rule__QuestionGroup__Group__0__Impl rule__QuestionGroup__Group__1 )
            // InternalQL.g:2456:2: rule__QuestionGroup__Group__0__Impl rule__QuestionGroup__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalQL.g:2463:1: rule__QuestionGroup__Group__0__Impl : ( () ) ;
    public final void rule__QuestionGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2467:1: ( ( () ) )
            // InternalQL.g:2468:1: ( () )
            {
            // InternalQL.g:2468:1: ( () )
            // InternalQL.g:2469:2: ()
            {
             before(grammarAccess.getQuestionGroupAccess().getQuestionGroupAction_0()); 
            // InternalQL.g:2470:2: ()
            // InternalQL.g:2470:3: 
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
    // InternalQL.g:2478:1: rule__QuestionGroup__Group__1 : rule__QuestionGroup__Group__1__Impl rule__QuestionGroup__Group__2 ;
    public final void rule__QuestionGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2482:1: ( rule__QuestionGroup__Group__1__Impl rule__QuestionGroup__Group__2 )
            // InternalQL.g:2483:2: rule__QuestionGroup__Group__1__Impl rule__QuestionGroup__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalQL.g:2490:1: rule__QuestionGroup__Group__1__Impl : ( 'QuestionGroup' ) ;
    public final void rule__QuestionGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2494:1: ( ( 'QuestionGroup' ) )
            // InternalQL.g:2495:1: ( 'QuestionGroup' )
            {
            // InternalQL.g:2495:1: ( 'QuestionGroup' )
            // InternalQL.g:2496:2: 'QuestionGroup'
            {
             before(grammarAccess.getQuestionGroupAccess().getQuestionGroupKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getQuestionGroupAccess().getQuestionGroupKeyword_1()); 

            }


            }

        }
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
    // InternalQL.g:2505:1: rule__QuestionGroup__Group__2 : rule__QuestionGroup__Group__2__Impl rule__QuestionGroup__Group__3 ;
    public final void rule__QuestionGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2509:1: ( rule__QuestionGroup__Group__2__Impl rule__QuestionGroup__Group__3 )
            // InternalQL.g:2510:2: rule__QuestionGroup__Group__2__Impl rule__QuestionGroup__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalQL.g:2517:1: rule__QuestionGroup__Group__2__Impl : ( '{' ) ;
    public final void rule__QuestionGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2521:1: ( ( '{' ) )
            // InternalQL.g:2522:1: ( '{' )
            {
            // InternalQL.g:2522:1: ( '{' )
            // InternalQL.g:2523:2: '{'
            {
             before(grammarAccess.getQuestionGroupAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
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
    // InternalQL.g:2532:1: rule__QuestionGroup__Group__3 : rule__QuestionGroup__Group__3__Impl rule__QuestionGroup__Group__4 ;
    public final void rule__QuestionGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2536:1: ( rule__QuestionGroup__Group__3__Impl rule__QuestionGroup__Group__4 )
            // InternalQL.g:2537:2: rule__QuestionGroup__Group__3__Impl rule__QuestionGroup__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalQL.g:2544:1: rule__QuestionGroup__Group__3__Impl : ( ( rule__QuestionGroup__Group_3__0 )? ) ;
    public final void rule__QuestionGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2548:1: ( ( ( rule__QuestionGroup__Group_3__0 )? ) )
            // InternalQL.g:2549:1: ( ( rule__QuestionGroup__Group_3__0 )? )
            {
            // InternalQL.g:2549:1: ( ( rule__QuestionGroup__Group_3__0 )? )
            // InternalQL.g:2550:2: ( rule__QuestionGroup__Group_3__0 )?
            {
             before(grammarAccess.getQuestionGroupAccess().getGroup_3()); 
            // InternalQL.g:2551:2: ( rule__QuestionGroup__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==41) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalQL.g:2551:3: rule__QuestionGroup__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QuestionGroup__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionGroupAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalQL.g:2559:1: rule__QuestionGroup__Group__4 : rule__QuestionGroup__Group__4__Impl rule__QuestionGroup__Group__5 ;
    public final void rule__QuestionGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2563:1: ( rule__QuestionGroup__Group__4__Impl rule__QuestionGroup__Group__5 )
            // InternalQL.g:2564:2: rule__QuestionGroup__Group__4__Impl rule__QuestionGroup__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__QuestionGroup__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionGroup__Group__5();

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
    // InternalQL.g:2571:1: rule__QuestionGroup__Group__4__Impl : ( ( rule__QuestionGroup__Group_4__0 )? ) ;
    public final void rule__QuestionGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2575:1: ( ( ( rule__QuestionGroup__Group_4__0 )? ) )
            // InternalQL.g:2576:1: ( ( rule__QuestionGroup__Group_4__0 )? )
            {
            // InternalQL.g:2576:1: ( ( rule__QuestionGroup__Group_4__0 )? )
            // InternalQL.g:2577:2: ( rule__QuestionGroup__Group_4__0 )?
            {
             before(grammarAccess.getQuestionGroupAccess().getGroup_4()); 
            // InternalQL.g:2578:2: ( rule__QuestionGroup__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==42) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalQL.g:2578:3: rule__QuestionGroup__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QuestionGroup__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionGroupAccess().getGroup_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__QuestionGroup__Group__5"
    // InternalQL.g:2586:1: rule__QuestionGroup__Group__5 : rule__QuestionGroup__Group__5__Impl rule__QuestionGroup__Group__6 ;
    public final void rule__QuestionGroup__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2590:1: ( rule__QuestionGroup__Group__5__Impl rule__QuestionGroup__Group__6 )
            // InternalQL.g:2591:2: rule__QuestionGroup__Group__5__Impl rule__QuestionGroup__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__QuestionGroup__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionGroup__Group__6();

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
    // $ANTLR end "rule__QuestionGroup__Group__5"


    // $ANTLR start "rule__QuestionGroup__Group__5__Impl"
    // InternalQL.g:2598:1: rule__QuestionGroup__Group__5__Impl : ( ( rule__QuestionGroup__Group_5__0 )? ) ;
    public final void rule__QuestionGroup__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2602:1: ( ( ( rule__QuestionGroup__Group_5__0 )? ) )
            // InternalQL.g:2603:1: ( ( rule__QuestionGroup__Group_5__0 )? )
            {
            // InternalQL.g:2603:1: ( ( rule__QuestionGroup__Group_5__0 )? )
            // InternalQL.g:2604:2: ( rule__QuestionGroup__Group_5__0 )?
            {
             before(grammarAccess.getQuestionGroupAccess().getGroup_5()); 
            // InternalQL.g:2605:2: ( rule__QuestionGroup__Group_5__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==43) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalQL.g:2605:3: rule__QuestionGroup__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QuestionGroup__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionGroupAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group__5__Impl"


    // $ANTLR start "rule__QuestionGroup__Group__6"
    // InternalQL.g:2613:1: rule__QuestionGroup__Group__6 : rule__QuestionGroup__Group__6__Impl ;
    public final void rule__QuestionGroup__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2617:1: ( rule__QuestionGroup__Group__6__Impl )
            // InternalQL.g:2618:2: rule__QuestionGroup__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuestionGroup__Group__6__Impl();

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
    // $ANTLR end "rule__QuestionGroup__Group__6"


    // $ANTLR start "rule__QuestionGroup__Group__6__Impl"
    // InternalQL.g:2624:1: rule__QuestionGroup__Group__6__Impl : ( '}' ) ;
    public final void rule__QuestionGroup__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2628:1: ( ( '}' ) )
            // InternalQL.g:2629:1: ( '}' )
            {
            // InternalQL.g:2629:1: ( '}' )
            // InternalQL.g:2630:2: '}'
            {
             before(grammarAccess.getQuestionGroupAccess().getRightCurlyBracketKeyword_6()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getQuestionGroupAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group__6__Impl"


    // $ANTLR start "rule__QuestionGroup__Group_3__0"
    // InternalQL.g:2640:1: rule__QuestionGroup__Group_3__0 : rule__QuestionGroup__Group_3__0__Impl rule__QuestionGroup__Group_3__1 ;
    public final void rule__QuestionGroup__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2644:1: ( rule__QuestionGroup__Group_3__0__Impl rule__QuestionGroup__Group_3__1 )
            // InternalQL.g:2645:2: rule__QuestionGroup__Group_3__0__Impl rule__QuestionGroup__Group_3__1
            {
            pushFollow(FOLLOW_19);
            rule__QuestionGroup__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionGroup__Group_3__1();

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
    // $ANTLR end "rule__QuestionGroup__Group_3__0"


    // $ANTLR start "rule__QuestionGroup__Group_3__0__Impl"
    // InternalQL.g:2652:1: rule__QuestionGroup__Group_3__0__Impl : ( 'guard' ) ;
    public final void rule__QuestionGroup__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2656:1: ( ( 'guard' ) )
            // InternalQL.g:2657:1: ( 'guard' )
            {
            // InternalQL.g:2657:1: ( 'guard' )
            // InternalQL.g:2658:2: 'guard'
            {
             before(grammarAccess.getQuestionGroupAccess().getGuardKeyword_3_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getQuestionGroupAccess().getGuardKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_3__0__Impl"


    // $ANTLR start "rule__QuestionGroup__Group_3__1"
    // InternalQL.g:2667:1: rule__QuestionGroup__Group_3__1 : rule__QuestionGroup__Group_3__1__Impl ;
    public final void rule__QuestionGroup__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2671:1: ( rule__QuestionGroup__Group_3__1__Impl )
            // InternalQL.g:2672:2: rule__QuestionGroup__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuestionGroup__Group_3__1__Impl();

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
    // $ANTLR end "rule__QuestionGroup__Group_3__1"


    // $ANTLR start "rule__QuestionGroup__Group_3__1__Impl"
    // InternalQL.g:2678:1: rule__QuestionGroup__Group_3__1__Impl : ( ( rule__QuestionGroup__GuardAssignment_3_1 ) ) ;
    public final void rule__QuestionGroup__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2682:1: ( ( ( rule__QuestionGroup__GuardAssignment_3_1 ) ) )
            // InternalQL.g:2683:1: ( ( rule__QuestionGroup__GuardAssignment_3_1 ) )
            {
            // InternalQL.g:2683:1: ( ( rule__QuestionGroup__GuardAssignment_3_1 ) )
            // InternalQL.g:2684:2: ( rule__QuestionGroup__GuardAssignment_3_1 )
            {
             before(grammarAccess.getQuestionGroupAccess().getGuardAssignment_3_1()); 
            // InternalQL.g:2685:2: ( rule__QuestionGroup__GuardAssignment_3_1 )
            // InternalQL.g:2685:3: rule__QuestionGroup__GuardAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__QuestionGroup__GuardAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionGroupAccess().getGuardAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_3__1__Impl"


    // $ANTLR start "rule__QuestionGroup__Group_4__0"
    // InternalQL.g:2694:1: rule__QuestionGroup__Group_4__0 : rule__QuestionGroup__Group_4__0__Impl rule__QuestionGroup__Group_4__1 ;
    public final void rule__QuestionGroup__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2698:1: ( rule__QuestionGroup__Group_4__0__Impl rule__QuestionGroup__Group_4__1 )
            // InternalQL.g:2699:2: rule__QuestionGroup__Group_4__0__Impl rule__QuestionGroup__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__QuestionGroup__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionGroup__Group_4__1();

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
    // $ANTLR end "rule__QuestionGroup__Group_4__0"


    // $ANTLR start "rule__QuestionGroup__Group_4__0__Impl"
    // InternalQL.g:2706:1: rule__QuestionGroup__Group_4__0__Impl : ( 'questionGroups' ) ;
    public final void rule__QuestionGroup__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2710:1: ( ( 'questionGroups' ) )
            // InternalQL.g:2711:1: ( 'questionGroups' )
            {
            // InternalQL.g:2711:1: ( 'questionGroups' )
            // InternalQL.g:2712:2: 'questionGroups'
            {
             before(grammarAccess.getQuestionGroupAccess().getQuestionGroupsKeyword_4_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getQuestionGroupAccess().getQuestionGroupsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_4__0__Impl"


    // $ANTLR start "rule__QuestionGroup__Group_4__1"
    // InternalQL.g:2721:1: rule__QuestionGroup__Group_4__1 : rule__QuestionGroup__Group_4__1__Impl rule__QuestionGroup__Group_4__2 ;
    public final void rule__QuestionGroup__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2725:1: ( rule__QuestionGroup__Group_4__1__Impl rule__QuestionGroup__Group_4__2 )
            // InternalQL.g:2726:2: rule__QuestionGroup__Group_4__1__Impl rule__QuestionGroup__Group_4__2
            {
            pushFollow(FOLLOW_13);
            rule__QuestionGroup__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionGroup__Group_4__2();

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
    // $ANTLR end "rule__QuestionGroup__Group_4__1"


    // $ANTLR start "rule__QuestionGroup__Group_4__1__Impl"
    // InternalQL.g:2733:1: rule__QuestionGroup__Group_4__1__Impl : ( '{' ) ;
    public final void rule__QuestionGroup__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2737:1: ( ( '{' ) )
            // InternalQL.g:2738:1: ( '{' )
            {
            // InternalQL.g:2738:1: ( '{' )
            // InternalQL.g:2739:2: '{'
            {
             before(grammarAccess.getQuestionGroupAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getQuestionGroupAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_4__1__Impl"


    // $ANTLR start "rule__QuestionGroup__Group_4__2"
    // InternalQL.g:2748:1: rule__QuestionGroup__Group_4__2 : rule__QuestionGroup__Group_4__2__Impl rule__QuestionGroup__Group_4__3 ;
    public final void rule__QuestionGroup__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2752:1: ( rule__QuestionGroup__Group_4__2__Impl rule__QuestionGroup__Group_4__3 )
            // InternalQL.g:2753:2: rule__QuestionGroup__Group_4__2__Impl rule__QuestionGroup__Group_4__3
            {
            pushFollow(FOLLOW_8);
            rule__QuestionGroup__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionGroup__Group_4__3();

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
    // $ANTLR end "rule__QuestionGroup__Group_4__2"


    // $ANTLR start "rule__QuestionGroup__Group_4__2__Impl"
    // InternalQL.g:2760:1: rule__QuestionGroup__Group_4__2__Impl : ( ( rule__QuestionGroup__QuestionGroupsAssignment_4_2 ) ) ;
    public final void rule__QuestionGroup__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2764:1: ( ( ( rule__QuestionGroup__QuestionGroupsAssignment_4_2 ) ) )
            // InternalQL.g:2765:1: ( ( rule__QuestionGroup__QuestionGroupsAssignment_4_2 ) )
            {
            // InternalQL.g:2765:1: ( ( rule__QuestionGroup__QuestionGroupsAssignment_4_2 ) )
            // InternalQL.g:2766:2: ( rule__QuestionGroup__QuestionGroupsAssignment_4_2 )
            {
             before(grammarAccess.getQuestionGroupAccess().getQuestionGroupsAssignment_4_2()); 
            // InternalQL.g:2767:2: ( rule__QuestionGroup__QuestionGroupsAssignment_4_2 )
            // InternalQL.g:2767:3: rule__QuestionGroup__QuestionGroupsAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__QuestionGroup__QuestionGroupsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getQuestionGroupAccess().getQuestionGroupsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_4__2__Impl"


    // $ANTLR start "rule__QuestionGroup__Group_4__3"
    // InternalQL.g:2775:1: rule__QuestionGroup__Group_4__3 : rule__QuestionGroup__Group_4__3__Impl rule__QuestionGroup__Group_4__4 ;
    public final void rule__QuestionGroup__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2779:1: ( rule__QuestionGroup__Group_4__3__Impl rule__QuestionGroup__Group_4__4 )
            // InternalQL.g:2780:2: rule__QuestionGroup__Group_4__3__Impl rule__QuestionGroup__Group_4__4
            {
            pushFollow(FOLLOW_8);
            rule__QuestionGroup__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionGroup__Group_4__4();

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
    // $ANTLR end "rule__QuestionGroup__Group_4__3"


    // $ANTLR start "rule__QuestionGroup__Group_4__3__Impl"
    // InternalQL.g:2787:1: rule__QuestionGroup__Group_4__3__Impl : ( ( rule__QuestionGroup__Group_4_3__0 )* ) ;
    public final void rule__QuestionGroup__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2791:1: ( ( ( rule__QuestionGroup__Group_4_3__0 )* ) )
            // InternalQL.g:2792:1: ( ( rule__QuestionGroup__Group_4_3__0 )* )
            {
            // InternalQL.g:2792:1: ( ( rule__QuestionGroup__Group_4_3__0 )* )
            // InternalQL.g:2793:2: ( rule__QuestionGroup__Group_4_3__0 )*
            {
             before(grammarAccess.getQuestionGroupAccess().getGroup_4_3()); 
            // InternalQL.g:2794:2: ( rule__QuestionGroup__Group_4_3__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==33) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalQL.g:2794:3: rule__QuestionGroup__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__QuestionGroup__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getQuestionGroupAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_4__3__Impl"


    // $ANTLR start "rule__QuestionGroup__Group_4__4"
    // InternalQL.g:2802:1: rule__QuestionGroup__Group_4__4 : rule__QuestionGroup__Group_4__4__Impl ;
    public final void rule__QuestionGroup__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2806:1: ( rule__QuestionGroup__Group_4__4__Impl )
            // InternalQL.g:2807:2: rule__QuestionGroup__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuestionGroup__Group_4__4__Impl();

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
    // $ANTLR end "rule__QuestionGroup__Group_4__4"


    // $ANTLR start "rule__QuestionGroup__Group_4__4__Impl"
    // InternalQL.g:2813:1: rule__QuestionGroup__Group_4__4__Impl : ( '}' ) ;
    public final void rule__QuestionGroup__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2817:1: ( ( '}' ) )
            // InternalQL.g:2818:1: ( '}' )
            {
            // InternalQL.g:2818:1: ( '}' )
            // InternalQL.g:2819:2: '}'
            {
             before(grammarAccess.getQuestionGroupAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getQuestionGroupAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_4__4__Impl"


    // $ANTLR start "rule__QuestionGroup__Group_4_3__0"
    // InternalQL.g:2829:1: rule__QuestionGroup__Group_4_3__0 : rule__QuestionGroup__Group_4_3__0__Impl rule__QuestionGroup__Group_4_3__1 ;
    public final void rule__QuestionGroup__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2833:1: ( rule__QuestionGroup__Group_4_3__0__Impl rule__QuestionGroup__Group_4_3__1 )
            // InternalQL.g:2834:2: rule__QuestionGroup__Group_4_3__0__Impl rule__QuestionGroup__Group_4_3__1
            {
            pushFollow(FOLLOW_13);
            rule__QuestionGroup__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionGroup__Group_4_3__1();

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
    // $ANTLR end "rule__QuestionGroup__Group_4_3__0"


    // $ANTLR start "rule__QuestionGroup__Group_4_3__0__Impl"
    // InternalQL.g:2841:1: rule__QuestionGroup__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__QuestionGroup__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2845:1: ( ( ',' ) )
            // InternalQL.g:2846:1: ( ',' )
            {
            // InternalQL.g:2846:1: ( ',' )
            // InternalQL.g:2847:2: ','
            {
             before(grammarAccess.getQuestionGroupAccess().getCommaKeyword_4_3_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getQuestionGroupAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_4_3__0__Impl"


    // $ANTLR start "rule__QuestionGroup__Group_4_3__1"
    // InternalQL.g:2856:1: rule__QuestionGroup__Group_4_3__1 : rule__QuestionGroup__Group_4_3__1__Impl ;
    public final void rule__QuestionGroup__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2860:1: ( rule__QuestionGroup__Group_4_3__1__Impl )
            // InternalQL.g:2861:2: rule__QuestionGroup__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuestionGroup__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__QuestionGroup__Group_4_3__1"


    // $ANTLR start "rule__QuestionGroup__Group_4_3__1__Impl"
    // InternalQL.g:2867:1: rule__QuestionGroup__Group_4_3__1__Impl : ( ( rule__QuestionGroup__QuestionGroupsAssignment_4_3_1 ) ) ;
    public final void rule__QuestionGroup__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2871:1: ( ( ( rule__QuestionGroup__QuestionGroupsAssignment_4_3_1 ) ) )
            // InternalQL.g:2872:1: ( ( rule__QuestionGroup__QuestionGroupsAssignment_4_3_1 ) )
            {
            // InternalQL.g:2872:1: ( ( rule__QuestionGroup__QuestionGroupsAssignment_4_3_1 ) )
            // InternalQL.g:2873:2: ( rule__QuestionGroup__QuestionGroupsAssignment_4_3_1 )
            {
             before(grammarAccess.getQuestionGroupAccess().getQuestionGroupsAssignment_4_3_1()); 
            // InternalQL.g:2874:2: ( rule__QuestionGroup__QuestionGroupsAssignment_4_3_1 )
            // InternalQL.g:2874:3: rule__QuestionGroup__QuestionGroupsAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__QuestionGroup__QuestionGroupsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionGroupAccess().getQuestionGroupsAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_4_3__1__Impl"


    // $ANTLR start "rule__QuestionGroup__Group_5__0"
    // InternalQL.g:2883:1: rule__QuestionGroup__Group_5__0 : rule__QuestionGroup__Group_5__0__Impl rule__QuestionGroup__Group_5__1 ;
    public final void rule__QuestionGroup__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2887:1: ( rule__QuestionGroup__Group_5__0__Impl rule__QuestionGroup__Group_5__1 )
            // InternalQL.g:2888:2: rule__QuestionGroup__Group_5__0__Impl rule__QuestionGroup__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__QuestionGroup__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionGroup__Group_5__1();

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
    // $ANTLR end "rule__QuestionGroup__Group_5__0"


    // $ANTLR start "rule__QuestionGroup__Group_5__0__Impl"
    // InternalQL.g:2895:1: rule__QuestionGroup__Group_5__0__Impl : ( 'questions' ) ;
    public final void rule__QuestionGroup__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2899:1: ( ( 'questions' ) )
            // InternalQL.g:2900:1: ( 'questions' )
            {
            // InternalQL.g:2900:1: ( 'questions' )
            // InternalQL.g:2901:2: 'questions'
            {
             before(grammarAccess.getQuestionGroupAccess().getQuestionsKeyword_5_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getQuestionGroupAccess().getQuestionsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_5__0__Impl"


    // $ANTLR start "rule__QuestionGroup__Group_5__1"
    // InternalQL.g:2910:1: rule__QuestionGroup__Group_5__1 : rule__QuestionGroup__Group_5__1__Impl rule__QuestionGroup__Group_5__2 ;
    public final void rule__QuestionGroup__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2914:1: ( rule__QuestionGroup__Group_5__1__Impl rule__QuestionGroup__Group_5__2 )
            // InternalQL.g:2915:2: rule__QuestionGroup__Group_5__1__Impl rule__QuestionGroup__Group_5__2
            {
            pushFollow(FOLLOW_20);
            rule__QuestionGroup__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionGroup__Group_5__2();

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
    // $ANTLR end "rule__QuestionGroup__Group_5__1"


    // $ANTLR start "rule__QuestionGroup__Group_5__1__Impl"
    // InternalQL.g:2922:1: rule__QuestionGroup__Group_5__1__Impl : ( '{' ) ;
    public final void rule__QuestionGroup__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2926:1: ( ( '{' ) )
            // InternalQL.g:2927:1: ( '{' )
            {
            // InternalQL.g:2927:1: ( '{' )
            // InternalQL.g:2928:2: '{'
            {
             before(grammarAccess.getQuestionGroupAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getQuestionGroupAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_5__1__Impl"


    // $ANTLR start "rule__QuestionGroup__Group_5__2"
    // InternalQL.g:2937:1: rule__QuestionGroup__Group_5__2 : rule__QuestionGroup__Group_5__2__Impl rule__QuestionGroup__Group_5__3 ;
    public final void rule__QuestionGroup__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2941:1: ( rule__QuestionGroup__Group_5__2__Impl rule__QuestionGroup__Group_5__3 )
            // InternalQL.g:2942:2: rule__QuestionGroup__Group_5__2__Impl rule__QuestionGroup__Group_5__3
            {
            pushFollow(FOLLOW_8);
            rule__QuestionGroup__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionGroup__Group_5__3();

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
    // $ANTLR end "rule__QuestionGroup__Group_5__2"


    // $ANTLR start "rule__QuestionGroup__Group_5__2__Impl"
    // InternalQL.g:2949:1: rule__QuestionGroup__Group_5__2__Impl : ( ( rule__QuestionGroup__QuestionsAssignment_5_2 ) ) ;
    public final void rule__QuestionGroup__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2953:1: ( ( ( rule__QuestionGroup__QuestionsAssignment_5_2 ) ) )
            // InternalQL.g:2954:1: ( ( rule__QuestionGroup__QuestionsAssignment_5_2 ) )
            {
            // InternalQL.g:2954:1: ( ( rule__QuestionGroup__QuestionsAssignment_5_2 ) )
            // InternalQL.g:2955:2: ( rule__QuestionGroup__QuestionsAssignment_5_2 )
            {
             before(grammarAccess.getQuestionGroupAccess().getQuestionsAssignment_5_2()); 
            // InternalQL.g:2956:2: ( rule__QuestionGroup__QuestionsAssignment_5_2 )
            // InternalQL.g:2956:3: rule__QuestionGroup__QuestionsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__QuestionGroup__QuestionsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getQuestionGroupAccess().getQuestionsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_5__2__Impl"


    // $ANTLR start "rule__QuestionGroup__Group_5__3"
    // InternalQL.g:2964:1: rule__QuestionGroup__Group_5__3 : rule__QuestionGroup__Group_5__3__Impl rule__QuestionGroup__Group_5__4 ;
    public final void rule__QuestionGroup__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2968:1: ( rule__QuestionGroup__Group_5__3__Impl rule__QuestionGroup__Group_5__4 )
            // InternalQL.g:2969:2: rule__QuestionGroup__Group_5__3__Impl rule__QuestionGroup__Group_5__4
            {
            pushFollow(FOLLOW_8);
            rule__QuestionGroup__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionGroup__Group_5__4();

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
    // $ANTLR end "rule__QuestionGroup__Group_5__3"


    // $ANTLR start "rule__QuestionGroup__Group_5__3__Impl"
    // InternalQL.g:2976:1: rule__QuestionGroup__Group_5__3__Impl : ( ( rule__QuestionGroup__Group_5_3__0 )* ) ;
    public final void rule__QuestionGroup__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2980:1: ( ( ( rule__QuestionGroup__Group_5_3__0 )* ) )
            // InternalQL.g:2981:1: ( ( rule__QuestionGroup__Group_5_3__0 )* )
            {
            // InternalQL.g:2981:1: ( ( rule__QuestionGroup__Group_5_3__0 )* )
            // InternalQL.g:2982:2: ( rule__QuestionGroup__Group_5_3__0 )*
            {
             before(grammarAccess.getQuestionGroupAccess().getGroup_5_3()); 
            // InternalQL.g:2983:2: ( rule__QuestionGroup__Group_5_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==33) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalQL.g:2983:3: rule__QuestionGroup__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__QuestionGroup__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getQuestionGroupAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_5__3__Impl"


    // $ANTLR start "rule__QuestionGroup__Group_5__4"
    // InternalQL.g:2991:1: rule__QuestionGroup__Group_5__4 : rule__QuestionGroup__Group_5__4__Impl ;
    public final void rule__QuestionGroup__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:2995:1: ( rule__QuestionGroup__Group_5__4__Impl )
            // InternalQL.g:2996:2: rule__QuestionGroup__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuestionGroup__Group_5__4__Impl();

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
    // $ANTLR end "rule__QuestionGroup__Group_5__4"


    // $ANTLR start "rule__QuestionGroup__Group_5__4__Impl"
    // InternalQL.g:3002:1: rule__QuestionGroup__Group_5__4__Impl : ( '}' ) ;
    public final void rule__QuestionGroup__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3006:1: ( ( '}' ) )
            // InternalQL.g:3007:1: ( '}' )
            {
            // InternalQL.g:3007:1: ( '}' )
            // InternalQL.g:3008:2: '}'
            {
             before(grammarAccess.getQuestionGroupAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getQuestionGroupAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_5__4__Impl"


    // $ANTLR start "rule__QuestionGroup__Group_5_3__0"
    // InternalQL.g:3018:1: rule__QuestionGroup__Group_5_3__0 : rule__QuestionGroup__Group_5_3__0__Impl rule__QuestionGroup__Group_5_3__1 ;
    public final void rule__QuestionGroup__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3022:1: ( rule__QuestionGroup__Group_5_3__0__Impl rule__QuestionGroup__Group_5_3__1 )
            // InternalQL.g:3023:2: rule__QuestionGroup__Group_5_3__0__Impl rule__QuestionGroup__Group_5_3__1
            {
            pushFollow(FOLLOW_20);
            rule__QuestionGroup__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionGroup__Group_5_3__1();

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
    // $ANTLR end "rule__QuestionGroup__Group_5_3__0"


    // $ANTLR start "rule__QuestionGroup__Group_5_3__0__Impl"
    // InternalQL.g:3030:1: rule__QuestionGroup__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__QuestionGroup__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3034:1: ( ( ',' ) )
            // InternalQL.g:3035:1: ( ',' )
            {
            // InternalQL.g:3035:1: ( ',' )
            // InternalQL.g:3036:2: ','
            {
             before(grammarAccess.getQuestionGroupAccess().getCommaKeyword_5_3_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getQuestionGroupAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_5_3__0__Impl"


    // $ANTLR start "rule__QuestionGroup__Group_5_3__1"
    // InternalQL.g:3045:1: rule__QuestionGroup__Group_5_3__1 : rule__QuestionGroup__Group_5_3__1__Impl ;
    public final void rule__QuestionGroup__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3049:1: ( rule__QuestionGroup__Group_5_3__1__Impl )
            // InternalQL.g:3050:2: rule__QuestionGroup__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuestionGroup__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__QuestionGroup__Group_5_3__1"


    // $ANTLR start "rule__QuestionGroup__Group_5_3__1__Impl"
    // InternalQL.g:3056:1: rule__QuestionGroup__Group_5_3__1__Impl : ( ( rule__QuestionGroup__QuestionsAssignment_5_3_1 ) ) ;
    public final void rule__QuestionGroup__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3060:1: ( ( ( rule__QuestionGroup__QuestionsAssignment_5_3_1 ) ) )
            // InternalQL.g:3061:1: ( ( rule__QuestionGroup__QuestionsAssignment_5_3_1 ) )
            {
            // InternalQL.g:3061:1: ( ( rule__QuestionGroup__QuestionsAssignment_5_3_1 ) )
            // InternalQL.g:3062:2: ( rule__QuestionGroup__QuestionsAssignment_5_3_1 )
            {
             before(grammarAccess.getQuestionGroupAccess().getQuestionsAssignment_5_3_1()); 
            // InternalQL.g:3063:2: ( rule__QuestionGroup__QuestionsAssignment_5_3_1 )
            // InternalQL.g:3063:3: rule__QuestionGroup__QuestionsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__QuestionGroup__QuestionsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionGroupAccess().getQuestionsAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__Group_5_3__1__Impl"


    // $ANTLR start "rule__Question__Group__0"
    // InternalQL.g:3072:1: rule__Question__Group__0 : rule__Question__Group__0__Impl rule__Question__Group__1 ;
    public final void rule__Question__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3076:1: ( rule__Question__Group__0__Impl rule__Question__Group__1 )
            // InternalQL.g:3077:2: rule__Question__Group__0__Impl rule__Question__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Question__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__1();

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
    // $ANTLR end "rule__Question__Group__0"


    // $ANTLR start "rule__Question__Group__0__Impl"
    // InternalQL.g:3084:1: rule__Question__Group__0__Impl : ( 'Question' ) ;
    public final void rule__Question__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3088:1: ( ( 'Question' ) )
            // InternalQL.g:3089:1: ( 'Question' )
            {
            // InternalQL.g:3089:1: ( 'Question' )
            // InternalQL.g:3090:2: 'Question'
            {
             before(grammarAccess.getQuestionAccess().getQuestionKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getQuestionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__0__Impl"


    // $ANTLR start "rule__Question__Group__1"
    // InternalQL.g:3099:1: rule__Question__Group__1 : rule__Question__Group__1__Impl rule__Question__Group__2 ;
    public final void rule__Question__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3103:1: ( rule__Question__Group__1__Impl rule__Question__Group__2 )
            // InternalQL.g:3104:2: rule__Question__Group__1__Impl rule__Question__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Question__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__2();

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
    // $ANTLR end "rule__Question__Group__1"


    // $ANTLR start "rule__Question__Group__1__Impl"
    // InternalQL.g:3111:1: rule__Question__Group__1__Impl : ( '{' ) ;
    public final void rule__Question__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3115:1: ( ( '{' ) )
            // InternalQL.g:3116:1: ( '{' )
            {
            // InternalQL.g:3116:1: ( '{' )
            // InternalQL.g:3117:2: '{'
            {
             before(grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__1__Impl"


    // $ANTLR start "rule__Question__Group__2"
    // InternalQL.g:3126:1: rule__Question__Group__2 : rule__Question__Group__2__Impl rule__Question__Group__3 ;
    public final void rule__Question__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3130:1: ( rule__Question__Group__2__Impl rule__Question__Group__3 )
            // InternalQL.g:3131:2: rule__Question__Group__2__Impl rule__Question__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Question__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__3();

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
    // $ANTLR end "rule__Question__Group__2"


    // $ANTLR start "rule__Question__Group__2__Impl"
    // InternalQL.g:3138:1: rule__Question__Group__2__Impl : ( 'questionDefinition' ) ;
    public final void rule__Question__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3142:1: ( ( 'questionDefinition' ) )
            // InternalQL.g:3143:1: ( 'questionDefinition' )
            {
            // InternalQL.g:3143:1: ( 'questionDefinition' )
            // InternalQL.g:3144:2: 'questionDefinition'
            {
             before(grammarAccess.getQuestionAccess().getQuestionDefinitionKeyword_2()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getQuestionDefinitionKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__2__Impl"


    // $ANTLR start "rule__Question__Group__3"
    // InternalQL.g:3153:1: rule__Question__Group__3 : rule__Question__Group__3__Impl rule__Question__Group__4 ;
    public final void rule__Question__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3157:1: ( rule__Question__Group__3__Impl rule__Question__Group__4 )
            // InternalQL.g:3158:2: rule__Question__Group__3__Impl rule__Question__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Question__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__4();

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
    // $ANTLR end "rule__Question__Group__3"


    // $ANTLR start "rule__Question__Group__3__Impl"
    // InternalQL.g:3165:1: rule__Question__Group__3__Impl : ( ( rule__Question__QuestionDefinitionAssignment_3 ) ) ;
    public final void rule__Question__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3169:1: ( ( ( rule__Question__QuestionDefinitionAssignment_3 ) ) )
            // InternalQL.g:3170:1: ( ( rule__Question__QuestionDefinitionAssignment_3 ) )
            {
            // InternalQL.g:3170:1: ( ( rule__Question__QuestionDefinitionAssignment_3 ) )
            // InternalQL.g:3171:2: ( rule__Question__QuestionDefinitionAssignment_3 )
            {
             before(grammarAccess.getQuestionAccess().getQuestionDefinitionAssignment_3()); 
            // InternalQL.g:3172:2: ( rule__Question__QuestionDefinitionAssignment_3 )
            // InternalQL.g:3172:3: rule__Question__QuestionDefinitionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Question__QuestionDefinitionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getQuestionDefinitionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__3__Impl"


    // $ANTLR start "rule__Question__Group__4"
    // InternalQL.g:3180:1: rule__Question__Group__4 : rule__Question__Group__4__Impl ;
    public final void rule__Question__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3184:1: ( rule__Question__Group__4__Impl )
            // InternalQL.g:3185:2: rule__Question__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Question__Group__4__Impl();

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
    // $ANTLR end "rule__Question__Group__4"


    // $ANTLR start "rule__Question__Group__4__Impl"
    // InternalQL.g:3191:1: rule__Question__Group__4__Impl : ( '}' ) ;
    public final void rule__Question__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3195:1: ( ( '}' ) )
            // InternalQL.g:3196:1: ( '}' )
            {
            // InternalQL.g:3196:1: ( '}' )
            // InternalQL.g:3197:2: '}'
            {
             before(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__4__Impl"


    // $ANTLR start "rule__ValueType_Impl__Group__0"
    // InternalQL.g:3207:1: rule__ValueType_Impl__Group__0 : rule__ValueType_Impl__Group__0__Impl rule__ValueType_Impl__Group__1 ;
    public final void rule__ValueType_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3211:1: ( rule__ValueType_Impl__Group__0__Impl rule__ValueType_Impl__Group__1 )
            // InternalQL.g:3212:2: rule__ValueType_Impl__Group__0__Impl rule__ValueType_Impl__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalQL.g:3219:1: rule__ValueType_Impl__Group__0__Impl : ( () ) ;
    public final void rule__ValueType_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3223:1: ( ( () ) )
            // InternalQL.g:3224:1: ( () )
            {
            // InternalQL.g:3224:1: ( () )
            // InternalQL.g:3225:2: ()
            {
             before(grammarAccess.getValueType_ImplAccess().getValueTypeAction_0()); 
            // InternalQL.g:3226:2: ()
            // InternalQL.g:3226:3: 
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
    // InternalQL.g:3234:1: rule__ValueType_Impl__Group__1 : rule__ValueType_Impl__Group__1__Impl rule__ValueType_Impl__Group__2 ;
    public final void rule__ValueType_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3238:1: ( rule__ValueType_Impl__Group__1__Impl rule__ValueType_Impl__Group__2 )
            // InternalQL.g:3239:2: rule__ValueType_Impl__Group__1__Impl rule__ValueType_Impl__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalQL.g:3246:1: rule__ValueType_Impl__Group__1__Impl : ( 'ValueType' ) ;
    public final void rule__ValueType_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3250:1: ( ( 'ValueType' ) )
            // InternalQL.g:3251:1: ( 'ValueType' )
            {
            // InternalQL.g:3251:1: ( 'ValueType' )
            // InternalQL.g:3252:2: 'ValueType'
            {
             before(grammarAccess.getValueType_ImplAccess().getValueTypeKeyword_1()); 
            match(input,46,FOLLOW_2); 
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
    // InternalQL.g:3261:1: rule__ValueType_Impl__Group__2 : rule__ValueType_Impl__Group__2__Impl rule__ValueType_Impl__Group__3 ;
    public final void rule__ValueType_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3265:1: ( rule__ValueType_Impl__Group__2__Impl rule__ValueType_Impl__Group__3 )
            // InternalQL.g:3266:2: rule__ValueType_Impl__Group__2__Impl rule__ValueType_Impl__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalQL.g:3273:1: rule__ValueType_Impl__Group__2__Impl : ( ( rule__ValueType_Impl__NameAssignment_2 ) ) ;
    public final void rule__ValueType_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3277:1: ( ( ( rule__ValueType_Impl__NameAssignment_2 ) ) )
            // InternalQL.g:3278:1: ( ( rule__ValueType_Impl__NameAssignment_2 ) )
            {
            // InternalQL.g:3278:1: ( ( rule__ValueType_Impl__NameAssignment_2 ) )
            // InternalQL.g:3279:2: ( rule__ValueType_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getValueType_ImplAccess().getNameAssignment_2()); 
            // InternalQL.g:3280:2: ( rule__ValueType_Impl__NameAssignment_2 )
            // InternalQL.g:3280:3: rule__ValueType_Impl__NameAssignment_2
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
    // InternalQL.g:3288:1: rule__ValueType_Impl__Group__3 : rule__ValueType_Impl__Group__3__Impl rule__ValueType_Impl__Group__4 ;
    public final void rule__ValueType_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3292:1: ( rule__ValueType_Impl__Group__3__Impl rule__ValueType_Impl__Group__4 )
            // InternalQL.g:3293:2: rule__ValueType_Impl__Group__3__Impl rule__ValueType_Impl__Group__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalQL.g:3300:1: rule__ValueType_Impl__Group__3__Impl : ( '{' ) ;
    public final void rule__ValueType_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3304:1: ( ( '{' ) )
            // InternalQL.g:3305:1: ( '{' )
            {
            // InternalQL.g:3305:1: ( '{' )
            // InternalQL.g:3306:2: '{'
            {
             before(grammarAccess.getValueType_ImplAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,29,FOLLOW_2); 
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
    // InternalQL.g:3315:1: rule__ValueType_Impl__Group__4 : rule__ValueType_Impl__Group__4__Impl rule__ValueType_Impl__Group__5 ;
    public final void rule__ValueType_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3319:1: ( rule__ValueType_Impl__Group__4__Impl rule__ValueType_Impl__Group__5 )
            // InternalQL.g:3320:2: rule__ValueType_Impl__Group__4__Impl rule__ValueType_Impl__Group__5
            {
            pushFollow(FOLLOW_23);
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
    // InternalQL.g:3327:1: rule__ValueType_Impl__Group__4__Impl : ( ( rule__ValueType_Impl__Group_4__0 )? ) ;
    public final void rule__ValueType_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3331:1: ( ( ( rule__ValueType_Impl__Group_4__0 )? ) )
            // InternalQL.g:3332:1: ( ( rule__ValueType_Impl__Group_4__0 )? )
            {
            // InternalQL.g:3332:1: ( ( rule__ValueType_Impl__Group_4__0 )? )
            // InternalQL.g:3333:2: ( rule__ValueType_Impl__Group_4__0 )?
            {
             before(grammarAccess.getValueType_ImplAccess().getGroup_4()); 
            // InternalQL.g:3334:2: ( rule__ValueType_Impl__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==47) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalQL.g:3334:3: rule__ValueType_Impl__Group_4__0
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
    // InternalQL.g:3342:1: rule__ValueType_Impl__Group__5 : rule__ValueType_Impl__Group__5__Impl ;
    public final void rule__ValueType_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3346:1: ( rule__ValueType_Impl__Group__5__Impl )
            // InternalQL.g:3347:2: rule__ValueType_Impl__Group__5__Impl
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
    // InternalQL.g:3353:1: rule__ValueType_Impl__Group__5__Impl : ( '}' ) ;
    public final void rule__ValueType_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3357:1: ( ( '}' ) )
            // InternalQL.g:3358:1: ( '}' )
            {
            // InternalQL.g:3358:1: ( '}' )
            // InternalQL.g:3359:2: '}'
            {
             before(grammarAccess.getValueType_ImplAccess().getRightCurlyBracketKeyword_5()); 
            match(input,30,FOLLOW_2); 
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
    // InternalQL.g:3369:1: rule__ValueType_Impl__Group_4__0 : rule__ValueType_Impl__Group_4__0__Impl rule__ValueType_Impl__Group_4__1 ;
    public final void rule__ValueType_Impl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3373:1: ( rule__ValueType_Impl__Group_4__0__Impl rule__ValueType_Impl__Group_4__1 )
            // InternalQL.g:3374:2: rule__ValueType_Impl__Group_4__0__Impl rule__ValueType_Impl__Group_4__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalQL.g:3381:1: rule__ValueType_Impl__Group_4__0__Impl : ( 'unit' ) ;
    public final void rule__ValueType_Impl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3385:1: ( ( 'unit' ) )
            // InternalQL.g:3386:1: ( 'unit' )
            {
            // InternalQL.g:3386:1: ( 'unit' )
            // InternalQL.g:3387:2: 'unit'
            {
             before(grammarAccess.getValueType_ImplAccess().getUnitKeyword_4_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalQL.g:3396:1: rule__ValueType_Impl__Group_4__1 : rule__ValueType_Impl__Group_4__1__Impl ;
    public final void rule__ValueType_Impl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3400:1: ( rule__ValueType_Impl__Group_4__1__Impl )
            // InternalQL.g:3401:2: rule__ValueType_Impl__Group_4__1__Impl
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
    // InternalQL.g:3407:1: rule__ValueType_Impl__Group_4__1__Impl : ( ( rule__ValueType_Impl__UnitAssignment_4_1 ) ) ;
    public final void rule__ValueType_Impl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3411:1: ( ( ( rule__ValueType_Impl__UnitAssignment_4_1 ) ) )
            // InternalQL.g:3412:1: ( ( rule__ValueType_Impl__UnitAssignment_4_1 ) )
            {
            // InternalQL.g:3412:1: ( ( rule__ValueType_Impl__UnitAssignment_4_1 ) )
            // InternalQL.g:3413:2: ( rule__ValueType_Impl__UnitAssignment_4_1 )
            {
             before(grammarAccess.getValueType_ImplAccess().getUnitAssignment_4_1()); 
            // InternalQL.g:3414:2: ( rule__ValueType_Impl__UnitAssignment_4_1 )
            // InternalQL.g:3414:3: rule__ValueType_Impl__UnitAssignment_4_1
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


    // $ANTLR start "rule__BasicBinaryExpression__Group__0"
    // InternalQL.g:3423:1: rule__BasicBinaryExpression__Group__0 : rule__BasicBinaryExpression__Group__0__Impl rule__BasicBinaryExpression__Group__1 ;
    public final void rule__BasicBinaryExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3427:1: ( rule__BasicBinaryExpression__Group__0__Impl rule__BasicBinaryExpression__Group__1 )
            // InternalQL.g:3428:2: rule__BasicBinaryExpression__Group__0__Impl rule__BasicBinaryExpression__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__BasicBinaryExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicBinaryExpression__Group__1();

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
    // $ANTLR end "rule__BasicBinaryExpression__Group__0"


    // $ANTLR start "rule__BasicBinaryExpression__Group__0__Impl"
    // InternalQL.g:3435:1: rule__BasicBinaryExpression__Group__0__Impl : ( 'BasicBinaryExpression' ) ;
    public final void rule__BasicBinaryExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3439:1: ( ( 'BasicBinaryExpression' ) )
            // InternalQL.g:3440:1: ( 'BasicBinaryExpression' )
            {
            // InternalQL.g:3440:1: ( 'BasicBinaryExpression' )
            // InternalQL.g:3441:2: 'BasicBinaryExpression'
            {
             before(grammarAccess.getBasicBinaryExpressionAccess().getBasicBinaryExpressionKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getBasicBinaryExpressionAccess().getBasicBinaryExpressionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicBinaryExpression__Group__0__Impl"


    // $ANTLR start "rule__BasicBinaryExpression__Group__1"
    // InternalQL.g:3450:1: rule__BasicBinaryExpression__Group__1 : rule__BasicBinaryExpression__Group__1__Impl rule__BasicBinaryExpression__Group__2 ;
    public final void rule__BasicBinaryExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3454:1: ( rule__BasicBinaryExpression__Group__1__Impl rule__BasicBinaryExpression__Group__2 )
            // InternalQL.g:3455:2: rule__BasicBinaryExpression__Group__1__Impl rule__BasicBinaryExpression__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__BasicBinaryExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicBinaryExpression__Group__2();

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
    // $ANTLR end "rule__BasicBinaryExpression__Group__1"


    // $ANTLR start "rule__BasicBinaryExpression__Group__1__Impl"
    // InternalQL.g:3462:1: rule__BasicBinaryExpression__Group__1__Impl : ( '{' ) ;
    public final void rule__BasicBinaryExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3466:1: ( ( '{' ) )
            // InternalQL.g:3467:1: ( '{' )
            {
            // InternalQL.g:3467:1: ( '{' )
            // InternalQL.g:3468:2: '{'
            {
             before(grammarAccess.getBasicBinaryExpressionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getBasicBinaryExpressionAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicBinaryExpression__Group__1__Impl"


    // $ANTLR start "rule__BasicBinaryExpression__Group__2"
    // InternalQL.g:3477:1: rule__BasicBinaryExpression__Group__2 : rule__BasicBinaryExpression__Group__2__Impl rule__BasicBinaryExpression__Group__3 ;
    public final void rule__BasicBinaryExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3481:1: ( rule__BasicBinaryExpression__Group__2__Impl rule__BasicBinaryExpression__Group__3 )
            // InternalQL.g:3482:2: rule__BasicBinaryExpression__Group__2__Impl rule__BasicBinaryExpression__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__BasicBinaryExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicBinaryExpression__Group__3();

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
    // $ANTLR end "rule__BasicBinaryExpression__Group__2"


    // $ANTLR start "rule__BasicBinaryExpression__Group__2__Impl"
    // InternalQL.g:3489:1: rule__BasicBinaryExpression__Group__2__Impl : ( 'operator' ) ;
    public final void rule__BasicBinaryExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3493:1: ( ( 'operator' ) )
            // InternalQL.g:3494:1: ( 'operator' )
            {
            // InternalQL.g:3494:1: ( 'operator' )
            // InternalQL.g:3495:2: 'operator'
            {
             before(grammarAccess.getBasicBinaryExpressionAccess().getOperatorKeyword_2()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getBasicBinaryExpressionAccess().getOperatorKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicBinaryExpression__Group__2__Impl"


    // $ANTLR start "rule__BasicBinaryExpression__Group__3"
    // InternalQL.g:3504:1: rule__BasicBinaryExpression__Group__3 : rule__BasicBinaryExpression__Group__3__Impl rule__BasicBinaryExpression__Group__4 ;
    public final void rule__BasicBinaryExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3508:1: ( rule__BasicBinaryExpression__Group__3__Impl rule__BasicBinaryExpression__Group__4 )
            // InternalQL.g:3509:2: rule__BasicBinaryExpression__Group__3__Impl rule__BasicBinaryExpression__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__BasicBinaryExpression__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicBinaryExpression__Group__4();

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
    // $ANTLR end "rule__BasicBinaryExpression__Group__3"


    // $ANTLR start "rule__BasicBinaryExpression__Group__3__Impl"
    // InternalQL.g:3516:1: rule__BasicBinaryExpression__Group__3__Impl : ( ( rule__BasicBinaryExpression__OperatorAssignment_3 ) ) ;
    public final void rule__BasicBinaryExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3520:1: ( ( ( rule__BasicBinaryExpression__OperatorAssignment_3 ) ) )
            // InternalQL.g:3521:1: ( ( rule__BasicBinaryExpression__OperatorAssignment_3 ) )
            {
            // InternalQL.g:3521:1: ( ( rule__BasicBinaryExpression__OperatorAssignment_3 ) )
            // InternalQL.g:3522:2: ( rule__BasicBinaryExpression__OperatorAssignment_3 )
            {
             before(grammarAccess.getBasicBinaryExpressionAccess().getOperatorAssignment_3()); 
            // InternalQL.g:3523:2: ( rule__BasicBinaryExpression__OperatorAssignment_3 )
            // InternalQL.g:3523:3: rule__BasicBinaryExpression__OperatorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__BasicBinaryExpression__OperatorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBasicBinaryExpressionAccess().getOperatorAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicBinaryExpression__Group__3__Impl"


    // $ANTLR start "rule__BasicBinaryExpression__Group__4"
    // InternalQL.g:3531:1: rule__BasicBinaryExpression__Group__4 : rule__BasicBinaryExpression__Group__4__Impl rule__BasicBinaryExpression__Group__5 ;
    public final void rule__BasicBinaryExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3535:1: ( rule__BasicBinaryExpression__Group__4__Impl rule__BasicBinaryExpression__Group__5 )
            // InternalQL.g:3536:2: rule__BasicBinaryExpression__Group__4__Impl rule__BasicBinaryExpression__Group__5
            {
            pushFollow(FOLLOW_26);
            rule__BasicBinaryExpression__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicBinaryExpression__Group__5();

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
    // $ANTLR end "rule__BasicBinaryExpression__Group__4"


    // $ANTLR start "rule__BasicBinaryExpression__Group__4__Impl"
    // InternalQL.g:3543:1: rule__BasicBinaryExpression__Group__4__Impl : ( ( rule__BasicBinaryExpression__Group_4__0 )? ) ;
    public final void rule__BasicBinaryExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3547:1: ( ( ( rule__BasicBinaryExpression__Group_4__0 )? ) )
            // InternalQL.g:3548:1: ( ( rule__BasicBinaryExpression__Group_4__0 )? )
            {
            // InternalQL.g:3548:1: ( ( rule__BasicBinaryExpression__Group_4__0 )? )
            // InternalQL.g:3549:2: ( rule__BasicBinaryExpression__Group_4__0 )?
            {
             before(grammarAccess.getBasicBinaryExpressionAccess().getGroup_4()); 
            // InternalQL.g:3550:2: ( rule__BasicBinaryExpression__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==52) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalQL.g:3550:3: rule__BasicBinaryExpression__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BasicBinaryExpression__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBasicBinaryExpressionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicBinaryExpression__Group__4__Impl"


    // $ANTLR start "rule__BasicBinaryExpression__Group__5"
    // InternalQL.g:3558:1: rule__BasicBinaryExpression__Group__5 : rule__BasicBinaryExpression__Group__5__Impl rule__BasicBinaryExpression__Group__6 ;
    public final void rule__BasicBinaryExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3562:1: ( rule__BasicBinaryExpression__Group__5__Impl rule__BasicBinaryExpression__Group__6 )
            // InternalQL.g:3563:2: rule__BasicBinaryExpression__Group__5__Impl rule__BasicBinaryExpression__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__BasicBinaryExpression__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicBinaryExpression__Group__6();

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
    // $ANTLR end "rule__BasicBinaryExpression__Group__5"


    // $ANTLR start "rule__BasicBinaryExpression__Group__5__Impl"
    // InternalQL.g:3570:1: rule__BasicBinaryExpression__Group__5__Impl : ( 'lhsOperand' ) ;
    public final void rule__BasicBinaryExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3574:1: ( ( 'lhsOperand' ) )
            // InternalQL.g:3575:1: ( 'lhsOperand' )
            {
            // InternalQL.g:3575:1: ( 'lhsOperand' )
            // InternalQL.g:3576:2: 'lhsOperand'
            {
             before(grammarAccess.getBasicBinaryExpressionAccess().getLhsOperandKeyword_5()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getBasicBinaryExpressionAccess().getLhsOperandKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicBinaryExpression__Group__5__Impl"


    // $ANTLR start "rule__BasicBinaryExpression__Group__6"
    // InternalQL.g:3585:1: rule__BasicBinaryExpression__Group__6 : rule__BasicBinaryExpression__Group__6__Impl rule__BasicBinaryExpression__Group__7 ;
    public final void rule__BasicBinaryExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3589:1: ( rule__BasicBinaryExpression__Group__6__Impl rule__BasicBinaryExpression__Group__7 )
            // InternalQL.g:3590:2: rule__BasicBinaryExpression__Group__6__Impl rule__BasicBinaryExpression__Group__7
            {
            pushFollow(FOLLOW_27);
            rule__BasicBinaryExpression__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicBinaryExpression__Group__7();

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
    // $ANTLR end "rule__BasicBinaryExpression__Group__6"


    // $ANTLR start "rule__BasicBinaryExpression__Group__6__Impl"
    // InternalQL.g:3597:1: rule__BasicBinaryExpression__Group__6__Impl : ( ( rule__BasicBinaryExpression__LhsOperandAssignment_6 ) ) ;
    public final void rule__BasicBinaryExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3601:1: ( ( ( rule__BasicBinaryExpression__LhsOperandAssignment_6 ) ) )
            // InternalQL.g:3602:1: ( ( rule__BasicBinaryExpression__LhsOperandAssignment_6 ) )
            {
            // InternalQL.g:3602:1: ( ( rule__BasicBinaryExpression__LhsOperandAssignment_6 ) )
            // InternalQL.g:3603:2: ( rule__BasicBinaryExpression__LhsOperandAssignment_6 )
            {
             before(grammarAccess.getBasicBinaryExpressionAccess().getLhsOperandAssignment_6()); 
            // InternalQL.g:3604:2: ( rule__BasicBinaryExpression__LhsOperandAssignment_6 )
            // InternalQL.g:3604:3: rule__BasicBinaryExpression__LhsOperandAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__BasicBinaryExpression__LhsOperandAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getBasicBinaryExpressionAccess().getLhsOperandAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicBinaryExpression__Group__6__Impl"


    // $ANTLR start "rule__BasicBinaryExpression__Group__7"
    // InternalQL.g:3612:1: rule__BasicBinaryExpression__Group__7 : rule__BasicBinaryExpression__Group__7__Impl rule__BasicBinaryExpression__Group__8 ;
    public final void rule__BasicBinaryExpression__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3616:1: ( rule__BasicBinaryExpression__Group__7__Impl rule__BasicBinaryExpression__Group__8 )
            // InternalQL.g:3617:2: rule__BasicBinaryExpression__Group__7__Impl rule__BasicBinaryExpression__Group__8
            {
            pushFollow(FOLLOW_19);
            rule__BasicBinaryExpression__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicBinaryExpression__Group__8();

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
    // $ANTLR end "rule__BasicBinaryExpression__Group__7"


    // $ANTLR start "rule__BasicBinaryExpression__Group__7__Impl"
    // InternalQL.g:3624:1: rule__BasicBinaryExpression__Group__7__Impl : ( 'rhsOperand' ) ;
    public final void rule__BasicBinaryExpression__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3628:1: ( ( 'rhsOperand' ) )
            // InternalQL.g:3629:1: ( 'rhsOperand' )
            {
            // InternalQL.g:3629:1: ( 'rhsOperand' )
            // InternalQL.g:3630:2: 'rhsOperand'
            {
             before(grammarAccess.getBasicBinaryExpressionAccess().getRhsOperandKeyword_7()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getBasicBinaryExpressionAccess().getRhsOperandKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicBinaryExpression__Group__7__Impl"


    // $ANTLR start "rule__BasicBinaryExpression__Group__8"
    // InternalQL.g:3639:1: rule__BasicBinaryExpression__Group__8 : rule__BasicBinaryExpression__Group__8__Impl rule__BasicBinaryExpression__Group__9 ;
    public final void rule__BasicBinaryExpression__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3643:1: ( rule__BasicBinaryExpression__Group__8__Impl rule__BasicBinaryExpression__Group__9 )
            // InternalQL.g:3644:2: rule__BasicBinaryExpression__Group__8__Impl rule__BasicBinaryExpression__Group__9
            {
            pushFollow(FOLLOW_14);
            rule__BasicBinaryExpression__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicBinaryExpression__Group__9();

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
    // $ANTLR end "rule__BasicBinaryExpression__Group__8"


    // $ANTLR start "rule__BasicBinaryExpression__Group__8__Impl"
    // InternalQL.g:3651:1: rule__BasicBinaryExpression__Group__8__Impl : ( ( rule__BasicBinaryExpression__RhsOperandAssignment_8 ) ) ;
    public final void rule__BasicBinaryExpression__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3655:1: ( ( ( rule__BasicBinaryExpression__RhsOperandAssignment_8 ) ) )
            // InternalQL.g:3656:1: ( ( rule__BasicBinaryExpression__RhsOperandAssignment_8 ) )
            {
            // InternalQL.g:3656:1: ( ( rule__BasicBinaryExpression__RhsOperandAssignment_8 ) )
            // InternalQL.g:3657:2: ( rule__BasicBinaryExpression__RhsOperandAssignment_8 )
            {
             before(grammarAccess.getBasicBinaryExpressionAccess().getRhsOperandAssignment_8()); 
            // InternalQL.g:3658:2: ( rule__BasicBinaryExpression__RhsOperandAssignment_8 )
            // InternalQL.g:3658:3: rule__BasicBinaryExpression__RhsOperandAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__BasicBinaryExpression__RhsOperandAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getBasicBinaryExpressionAccess().getRhsOperandAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicBinaryExpression__Group__8__Impl"


    // $ANTLR start "rule__BasicBinaryExpression__Group__9"
    // InternalQL.g:3666:1: rule__BasicBinaryExpression__Group__9 : rule__BasicBinaryExpression__Group__9__Impl ;
    public final void rule__BasicBinaryExpression__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3670:1: ( rule__BasicBinaryExpression__Group__9__Impl )
            // InternalQL.g:3671:2: rule__BasicBinaryExpression__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BasicBinaryExpression__Group__9__Impl();

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
    // $ANTLR end "rule__BasicBinaryExpression__Group__9"


    // $ANTLR start "rule__BasicBinaryExpression__Group__9__Impl"
    // InternalQL.g:3677:1: rule__BasicBinaryExpression__Group__9__Impl : ( '}' ) ;
    public final void rule__BasicBinaryExpression__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3681:1: ( ( '}' ) )
            // InternalQL.g:3682:1: ( '}' )
            {
            // InternalQL.g:3682:1: ( '}' )
            // InternalQL.g:3683:2: '}'
            {
             before(grammarAccess.getBasicBinaryExpressionAccess().getRightCurlyBracketKeyword_9()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getBasicBinaryExpressionAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicBinaryExpression__Group__9__Impl"


    // $ANTLR start "rule__BasicBinaryExpression__Group_4__0"
    // InternalQL.g:3693:1: rule__BasicBinaryExpression__Group_4__0 : rule__BasicBinaryExpression__Group_4__0__Impl rule__BasicBinaryExpression__Group_4__1 ;
    public final void rule__BasicBinaryExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3697:1: ( rule__BasicBinaryExpression__Group_4__0__Impl rule__BasicBinaryExpression__Group_4__1 )
            // InternalQL.g:3698:2: rule__BasicBinaryExpression__Group_4__0__Impl rule__BasicBinaryExpression__Group_4__1
            {
            pushFollow(FOLLOW_11);
            rule__BasicBinaryExpression__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicBinaryExpression__Group_4__1();

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
    // $ANTLR end "rule__BasicBinaryExpression__Group_4__0"


    // $ANTLR start "rule__BasicBinaryExpression__Group_4__0__Impl"
    // InternalQL.g:3705:1: rule__BasicBinaryExpression__Group_4__0__Impl : ( 'resultType' ) ;
    public final void rule__BasicBinaryExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3709:1: ( ( 'resultType' ) )
            // InternalQL.g:3710:1: ( 'resultType' )
            {
            // InternalQL.g:3710:1: ( 'resultType' )
            // InternalQL.g:3711:2: 'resultType'
            {
             before(grammarAccess.getBasicBinaryExpressionAccess().getResultTypeKeyword_4_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getBasicBinaryExpressionAccess().getResultTypeKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicBinaryExpression__Group_4__0__Impl"


    // $ANTLR start "rule__BasicBinaryExpression__Group_4__1"
    // InternalQL.g:3720:1: rule__BasicBinaryExpression__Group_4__1 : rule__BasicBinaryExpression__Group_4__1__Impl ;
    public final void rule__BasicBinaryExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3724:1: ( rule__BasicBinaryExpression__Group_4__1__Impl )
            // InternalQL.g:3725:2: rule__BasicBinaryExpression__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BasicBinaryExpression__Group_4__1__Impl();

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
    // $ANTLR end "rule__BasicBinaryExpression__Group_4__1"


    // $ANTLR start "rule__BasicBinaryExpression__Group_4__1__Impl"
    // InternalQL.g:3731:1: rule__BasicBinaryExpression__Group_4__1__Impl : ( ( rule__BasicBinaryExpression__ResultTypeAssignment_4_1 ) ) ;
    public final void rule__BasicBinaryExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3735:1: ( ( ( rule__BasicBinaryExpression__ResultTypeAssignment_4_1 ) ) )
            // InternalQL.g:3736:1: ( ( rule__BasicBinaryExpression__ResultTypeAssignment_4_1 ) )
            {
            // InternalQL.g:3736:1: ( ( rule__BasicBinaryExpression__ResultTypeAssignment_4_1 ) )
            // InternalQL.g:3737:2: ( rule__BasicBinaryExpression__ResultTypeAssignment_4_1 )
            {
             before(grammarAccess.getBasicBinaryExpressionAccess().getResultTypeAssignment_4_1()); 
            // InternalQL.g:3738:2: ( rule__BasicBinaryExpression__ResultTypeAssignment_4_1 )
            // InternalQL.g:3738:3: rule__BasicBinaryExpression__ResultTypeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__BasicBinaryExpression__ResultTypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getBasicBinaryExpressionAccess().getResultTypeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicBinaryExpression__Group_4__1__Impl"


    // $ANTLR start "rule__ConstantCall__Group__0"
    // InternalQL.g:3747:1: rule__ConstantCall__Group__0 : rule__ConstantCall__Group__0__Impl rule__ConstantCall__Group__1 ;
    public final void rule__ConstantCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3751:1: ( rule__ConstantCall__Group__0__Impl rule__ConstantCall__Group__1 )
            // InternalQL.g:3752:2: rule__ConstantCall__Group__0__Impl rule__ConstantCall__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalQL.g:3759:1: rule__ConstantCall__Group__0__Impl : ( () ) ;
    public final void rule__ConstantCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3763:1: ( ( () ) )
            // InternalQL.g:3764:1: ( () )
            {
            // InternalQL.g:3764:1: ( () )
            // InternalQL.g:3765:2: ()
            {
             before(grammarAccess.getConstantCallAccess().getConstantCallAction_0()); 
            // InternalQL.g:3766:2: ()
            // InternalQL.g:3766:3: 
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
    // InternalQL.g:3774:1: rule__ConstantCall__Group__1 : rule__ConstantCall__Group__1__Impl rule__ConstantCall__Group__2 ;
    public final void rule__ConstantCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3778:1: ( rule__ConstantCall__Group__1__Impl rule__ConstantCall__Group__2 )
            // InternalQL.g:3779:2: rule__ConstantCall__Group__1__Impl rule__ConstantCall__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ConstantCall__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstantCall__Group__2();

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
    // InternalQL.g:3786:1: rule__ConstantCall__Group__1__Impl : ( 'ConstantCall' ) ;
    public final void rule__ConstantCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3790:1: ( ( 'ConstantCall' ) )
            // InternalQL.g:3791:1: ( 'ConstantCall' )
            {
            // InternalQL.g:3791:1: ( 'ConstantCall' )
            // InternalQL.g:3792:2: 'ConstantCall'
            {
             before(grammarAccess.getConstantCallAccess().getConstantCallKeyword_1()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getConstantCallAccess().getConstantCallKeyword_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__ConstantCall__Group__2"
    // InternalQL.g:3801:1: rule__ConstantCall__Group__2 : rule__ConstantCall__Group__2__Impl rule__ConstantCall__Group__3 ;
    public final void rule__ConstantCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3805:1: ( rule__ConstantCall__Group__2__Impl rule__ConstantCall__Group__3 )
            // InternalQL.g:3806:2: rule__ConstantCall__Group__2__Impl rule__ConstantCall__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__ConstantCall__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstantCall__Group__3();

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
    // $ANTLR end "rule__ConstantCall__Group__2"


    // $ANTLR start "rule__ConstantCall__Group__2__Impl"
    // InternalQL.g:3813:1: rule__ConstantCall__Group__2__Impl : ( '{' ) ;
    public final void rule__ConstantCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3817:1: ( ( '{' ) )
            // InternalQL.g:3818:1: ( '{' )
            {
            // InternalQL.g:3818:1: ( '{' )
            // InternalQL.g:3819:2: '{'
            {
             before(grammarAccess.getConstantCallAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getConstantCallAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantCall__Group__2__Impl"


    // $ANTLR start "rule__ConstantCall__Group__3"
    // InternalQL.g:3828:1: rule__ConstantCall__Group__3 : rule__ConstantCall__Group__3__Impl rule__ConstantCall__Group__4 ;
    public final void rule__ConstantCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3832:1: ( rule__ConstantCall__Group__3__Impl rule__ConstantCall__Group__4 )
            // InternalQL.g:3833:2: rule__ConstantCall__Group__3__Impl rule__ConstantCall__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__ConstantCall__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstantCall__Group__4();

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
    // $ANTLR end "rule__ConstantCall__Group__3"


    // $ANTLR start "rule__ConstantCall__Group__3__Impl"
    // InternalQL.g:3840:1: rule__ConstantCall__Group__3__Impl : ( ( rule__ConstantCall__Group_3__0 )? ) ;
    public final void rule__ConstantCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3844:1: ( ( ( rule__ConstantCall__Group_3__0 )? ) )
            // InternalQL.g:3845:1: ( ( rule__ConstantCall__Group_3__0 )? )
            {
            // InternalQL.g:3845:1: ( ( rule__ConstantCall__Group_3__0 )? )
            // InternalQL.g:3846:2: ( rule__ConstantCall__Group_3__0 )?
            {
             before(grammarAccess.getConstantCallAccess().getGroup_3()); 
            // InternalQL.g:3847:2: ( rule__ConstantCall__Group_3__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==52) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalQL.g:3847:3: rule__ConstantCall__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConstantCall__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstantCallAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantCall__Group__3__Impl"


    // $ANTLR start "rule__ConstantCall__Group__4"
    // InternalQL.g:3855:1: rule__ConstantCall__Group__4 : rule__ConstantCall__Group__4__Impl rule__ConstantCall__Group__5 ;
    public final void rule__ConstantCall__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3859:1: ( rule__ConstantCall__Group__4__Impl rule__ConstantCall__Group__5 )
            // InternalQL.g:3860:2: rule__ConstantCall__Group__4__Impl rule__ConstantCall__Group__5
            {
            pushFollow(FOLLOW_29);
            rule__ConstantCall__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstantCall__Group__5();

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
    // $ANTLR end "rule__ConstantCall__Group__4"


    // $ANTLR start "rule__ConstantCall__Group__4__Impl"
    // InternalQL.g:3867:1: rule__ConstantCall__Group__4__Impl : ( ( rule__ConstantCall__Group_4__0 )? ) ;
    public final void rule__ConstantCall__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3871:1: ( ( ( rule__ConstantCall__Group_4__0 )? ) )
            // InternalQL.g:3872:1: ( ( rule__ConstantCall__Group_4__0 )? )
            {
            // InternalQL.g:3872:1: ( ( rule__ConstantCall__Group_4__0 )? )
            // InternalQL.g:3873:2: ( rule__ConstantCall__Group_4__0 )?
            {
             before(grammarAccess.getConstantCallAccess().getGroup_4()); 
            // InternalQL.g:3874:2: ( rule__ConstantCall__Group_4__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==54) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalQL.g:3874:3: rule__ConstantCall__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConstantCall__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstantCallAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantCall__Group__4__Impl"


    // $ANTLR start "rule__ConstantCall__Group__5"
    // InternalQL.g:3882:1: rule__ConstantCall__Group__5 : rule__ConstantCall__Group__5__Impl ;
    public final void rule__ConstantCall__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3886:1: ( rule__ConstantCall__Group__5__Impl )
            // InternalQL.g:3887:2: rule__ConstantCall__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConstantCall__Group__5__Impl();

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
    // $ANTLR end "rule__ConstantCall__Group__5"


    // $ANTLR start "rule__ConstantCall__Group__5__Impl"
    // InternalQL.g:3893:1: rule__ConstantCall__Group__5__Impl : ( '}' ) ;
    public final void rule__ConstantCall__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3897:1: ( ( '}' ) )
            // InternalQL.g:3898:1: ( '}' )
            {
            // InternalQL.g:3898:1: ( '}' )
            // InternalQL.g:3899:2: '}'
            {
             before(grammarAccess.getConstantCallAccess().getRightCurlyBracketKeyword_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getConstantCallAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantCall__Group__5__Impl"


    // $ANTLR start "rule__ConstantCall__Group_3__0"
    // InternalQL.g:3909:1: rule__ConstantCall__Group_3__0 : rule__ConstantCall__Group_3__0__Impl rule__ConstantCall__Group_3__1 ;
    public final void rule__ConstantCall__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3913:1: ( rule__ConstantCall__Group_3__0__Impl rule__ConstantCall__Group_3__1 )
            // InternalQL.g:3914:2: rule__ConstantCall__Group_3__0__Impl rule__ConstantCall__Group_3__1
            {
            pushFollow(FOLLOW_11);
            rule__ConstantCall__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstantCall__Group_3__1();

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
    // $ANTLR end "rule__ConstantCall__Group_3__0"


    // $ANTLR start "rule__ConstantCall__Group_3__0__Impl"
    // InternalQL.g:3921:1: rule__ConstantCall__Group_3__0__Impl : ( 'resultType' ) ;
    public final void rule__ConstantCall__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3925:1: ( ( 'resultType' ) )
            // InternalQL.g:3926:1: ( 'resultType' )
            {
            // InternalQL.g:3926:1: ( 'resultType' )
            // InternalQL.g:3927:2: 'resultType'
            {
             before(grammarAccess.getConstantCallAccess().getResultTypeKeyword_3_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getConstantCallAccess().getResultTypeKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantCall__Group_3__0__Impl"


    // $ANTLR start "rule__ConstantCall__Group_3__1"
    // InternalQL.g:3936:1: rule__ConstantCall__Group_3__1 : rule__ConstantCall__Group_3__1__Impl ;
    public final void rule__ConstantCall__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3940:1: ( rule__ConstantCall__Group_3__1__Impl )
            // InternalQL.g:3941:2: rule__ConstantCall__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConstantCall__Group_3__1__Impl();

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
    // $ANTLR end "rule__ConstantCall__Group_3__1"


    // $ANTLR start "rule__ConstantCall__Group_3__1__Impl"
    // InternalQL.g:3947:1: rule__ConstantCall__Group_3__1__Impl : ( ( rule__ConstantCall__ResultTypeAssignment_3_1 ) ) ;
    public final void rule__ConstantCall__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3951:1: ( ( ( rule__ConstantCall__ResultTypeAssignment_3_1 ) ) )
            // InternalQL.g:3952:1: ( ( rule__ConstantCall__ResultTypeAssignment_3_1 ) )
            {
            // InternalQL.g:3952:1: ( ( rule__ConstantCall__ResultTypeAssignment_3_1 ) )
            // InternalQL.g:3953:2: ( rule__ConstantCall__ResultTypeAssignment_3_1 )
            {
             before(grammarAccess.getConstantCallAccess().getResultTypeAssignment_3_1()); 
            // InternalQL.g:3954:2: ( rule__ConstantCall__ResultTypeAssignment_3_1 )
            // InternalQL.g:3954:3: rule__ConstantCall__ResultTypeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ConstantCall__ResultTypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getConstantCallAccess().getResultTypeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantCall__Group_3__1__Impl"


    // $ANTLR start "rule__ConstantCall__Group_4__0"
    // InternalQL.g:3963:1: rule__ConstantCall__Group_4__0 : rule__ConstantCall__Group_4__0__Impl rule__ConstantCall__Group_4__1 ;
    public final void rule__ConstantCall__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3967:1: ( rule__ConstantCall__Group_4__0__Impl rule__ConstantCall__Group_4__1 )
            // InternalQL.g:3968:2: rule__ConstantCall__Group_4__0__Impl rule__ConstantCall__Group_4__1
            {
            pushFollow(FOLLOW_30);
            rule__ConstantCall__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstantCall__Group_4__1();

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
    // $ANTLR end "rule__ConstantCall__Group_4__0"


    // $ANTLR start "rule__ConstantCall__Group_4__0__Impl"
    // InternalQL.g:3975:1: rule__ConstantCall__Group_4__0__Impl : ( 'value' ) ;
    public final void rule__ConstantCall__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3979:1: ( ( 'value' ) )
            // InternalQL.g:3980:1: ( 'value' )
            {
            // InternalQL.g:3980:1: ( 'value' )
            // InternalQL.g:3981:2: 'value'
            {
             before(grammarAccess.getConstantCallAccess().getValueKeyword_4_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getConstantCallAccess().getValueKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantCall__Group_4__0__Impl"


    // $ANTLR start "rule__ConstantCall__Group_4__1"
    // InternalQL.g:3990:1: rule__ConstantCall__Group_4__1 : rule__ConstantCall__Group_4__1__Impl ;
    public final void rule__ConstantCall__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:3994:1: ( rule__ConstantCall__Group_4__1__Impl )
            // InternalQL.g:3995:2: rule__ConstantCall__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConstantCall__Group_4__1__Impl();

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
    // $ANTLR end "rule__ConstantCall__Group_4__1"


    // $ANTLR start "rule__ConstantCall__Group_4__1__Impl"
    // InternalQL.g:4001:1: rule__ConstantCall__Group_4__1__Impl : ( ( rule__ConstantCall__ValueAssignment_4_1 ) ) ;
    public final void rule__ConstantCall__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4005:1: ( ( ( rule__ConstantCall__ValueAssignment_4_1 ) ) )
            // InternalQL.g:4006:1: ( ( rule__ConstantCall__ValueAssignment_4_1 ) )
            {
            // InternalQL.g:4006:1: ( ( rule__ConstantCall__ValueAssignment_4_1 ) )
            // InternalQL.g:4007:2: ( rule__ConstantCall__ValueAssignment_4_1 )
            {
             before(grammarAccess.getConstantCallAccess().getValueAssignment_4_1()); 
            // InternalQL.g:4008:2: ( rule__ConstantCall__ValueAssignment_4_1 )
            // InternalQL.g:4008:3: rule__ConstantCall__ValueAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ConstantCall__ValueAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getConstantCallAccess().getValueAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantCall__Group_4__1__Impl"


    // $ANTLR start "rule__BasicUnaryExpression__Group__0"
    // InternalQL.g:4017:1: rule__BasicUnaryExpression__Group__0 : rule__BasicUnaryExpression__Group__0__Impl rule__BasicUnaryExpression__Group__1 ;
    public final void rule__BasicUnaryExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4021:1: ( rule__BasicUnaryExpression__Group__0__Impl rule__BasicUnaryExpression__Group__1 )
            // InternalQL.g:4022:2: rule__BasicUnaryExpression__Group__0__Impl rule__BasicUnaryExpression__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__BasicUnaryExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicUnaryExpression__Group__1();

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
    // $ANTLR end "rule__BasicUnaryExpression__Group__0"


    // $ANTLR start "rule__BasicUnaryExpression__Group__0__Impl"
    // InternalQL.g:4029:1: rule__BasicUnaryExpression__Group__0__Impl : ( 'BasicUnaryExpression' ) ;
    public final void rule__BasicUnaryExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4033:1: ( ( 'BasicUnaryExpression' ) )
            // InternalQL.g:4034:1: ( 'BasicUnaryExpression' )
            {
            // InternalQL.g:4034:1: ( 'BasicUnaryExpression' )
            // InternalQL.g:4035:2: 'BasicUnaryExpression'
            {
             before(grammarAccess.getBasicUnaryExpressionAccess().getBasicUnaryExpressionKeyword_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getBasicUnaryExpressionAccess().getBasicUnaryExpressionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicUnaryExpression__Group__0__Impl"


    // $ANTLR start "rule__BasicUnaryExpression__Group__1"
    // InternalQL.g:4044:1: rule__BasicUnaryExpression__Group__1 : rule__BasicUnaryExpression__Group__1__Impl rule__BasicUnaryExpression__Group__2 ;
    public final void rule__BasicUnaryExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4048:1: ( rule__BasicUnaryExpression__Group__1__Impl rule__BasicUnaryExpression__Group__2 )
            // InternalQL.g:4049:2: rule__BasicUnaryExpression__Group__1__Impl rule__BasicUnaryExpression__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__BasicUnaryExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicUnaryExpression__Group__2();

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
    // $ANTLR end "rule__BasicUnaryExpression__Group__1"


    // $ANTLR start "rule__BasicUnaryExpression__Group__1__Impl"
    // InternalQL.g:4056:1: rule__BasicUnaryExpression__Group__1__Impl : ( '{' ) ;
    public final void rule__BasicUnaryExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4060:1: ( ( '{' ) )
            // InternalQL.g:4061:1: ( '{' )
            {
            // InternalQL.g:4061:1: ( '{' )
            // InternalQL.g:4062:2: '{'
            {
             before(grammarAccess.getBasicUnaryExpressionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getBasicUnaryExpressionAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicUnaryExpression__Group__1__Impl"


    // $ANTLR start "rule__BasicUnaryExpression__Group__2"
    // InternalQL.g:4071:1: rule__BasicUnaryExpression__Group__2 : rule__BasicUnaryExpression__Group__2__Impl rule__BasicUnaryExpression__Group__3 ;
    public final void rule__BasicUnaryExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4075:1: ( rule__BasicUnaryExpression__Group__2__Impl rule__BasicUnaryExpression__Group__3 )
            // InternalQL.g:4076:2: rule__BasicUnaryExpression__Group__2__Impl rule__BasicUnaryExpression__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__BasicUnaryExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicUnaryExpression__Group__3();

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
    // $ANTLR end "rule__BasicUnaryExpression__Group__2"


    // $ANTLR start "rule__BasicUnaryExpression__Group__2__Impl"
    // InternalQL.g:4083:1: rule__BasicUnaryExpression__Group__2__Impl : ( ( rule__BasicUnaryExpression__Group_2__0 )? ) ;
    public final void rule__BasicUnaryExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4087:1: ( ( ( rule__BasicUnaryExpression__Group_2__0 )? ) )
            // InternalQL.g:4088:1: ( ( rule__BasicUnaryExpression__Group_2__0 )? )
            {
            // InternalQL.g:4088:1: ( ( rule__BasicUnaryExpression__Group_2__0 )? )
            // InternalQL.g:4089:2: ( rule__BasicUnaryExpression__Group_2__0 )?
            {
             before(grammarAccess.getBasicUnaryExpressionAccess().getGroup_2()); 
            // InternalQL.g:4090:2: ( rule__BasicUnaryExpression__Group_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==49) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalQL.g:4090:3: rule__BasicUnaryExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BasicUnaryExpression__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBasicUnaryExpressionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicUnaryExpression__Group__2__Impl"


    // $ANTLR start "rule__BasicUnaryExpression__Group__3"
    // InternalQL.g:4098:1: rule__BasicUnaryExpression__Group__3 : rule__BasicUnaryExpression__Group__3__Impl rule__BasicUnaryExpression__Group__4 ;
    public final void rule__BasicUnaryExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4102:1: ( rule__BasicUnaryExpression__Group__3__Impl rule__BasicUnaryExpression__Group__4 )
            // InternalQL.g:4103:2: rule__BasicUnaryExpression__Group__3__Impl rule__BasicUnaryExpression__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__BasicUnaryExpression__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicUnaryExpression__Group__4();

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
    // $ANTLR end "rule__BasicUnaryExpression__Group__3"


    // $ANTLR start "rule__BasicUnaryExpression__Group__3__Impl"
    // InternalQL.g:4110:1: rule__BasicUnaryExpression__Group__3__Impl : ( ( rule__BasicUnaryExpression__Group_3__0 )? ) ;
    public final void rule__BasicUnaryExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4114:1: ( ( ( rule__BasicUnaryExpression__Group_3__0 )? ) )
            // InternalQL.g:4115:1: ( ( rule__BasicUnaryExpression__Group_3__0 )? )
            {
            // InternalQL.g:4115:1: ( ( rule__BasicUnaryExpression__Group_3__0 )? )
            // InternalQL.g:4116:2: ( rule__BasicUnaryExpression__Group_3__0 )?
            {
             before(grammarAccess.getBasicUnaryExpressionAccess().getGroup_3()); 
            // InternalQL.g:4117:2: ( rule__BasicUnaryExpression__Group_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==52) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalQL.g:4117:3: rule__BasicUnaryExpression__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BasicUnaryExpression__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBasicUnaryExpressionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicUnaryExpression__Group__3__Impl"


    // $ANTLR start "rule__BasicUnaryExpression__Group__4"
    // InternalQL.g:4125:1: rule__BasicUnaryExpression__Group__4 : rule__BasicUnaryExpression__Group__4__Impl rule__BasicUnaryExpression__Group__5 ;
    public final void rule__BasicUnaryExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4129:1: ( rule__BasicUnaryExpression__Group__4__Impl rule__BasicUnaryExpression__Group__5 )
            // InternalQL.g:4130:2: rule__BasicUnaryExpression__Group__4__Impl rule__BasicUnaryExpression__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__BasicUnaryExpression__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicUnaryExpression__Group__5();

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
    // $ANTLR end "rule__BasicUnaryExpression__Group__4"


    // $ANTLR start "rule__BasicUnaryExpression__Group__4__Impl"
    // InternalQL.g:4137:1: rule__BasicUnaryExpression__Group__4__Impl : ( 'operand' ) ;
    public final void rule__BasicUnaryExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4141:1: ( ( 'operand' ) )
            // InternalQL.g:4142:1: ( 'operand' )
            {
            // InternalQL.g:4142:1: ( 'operand' )
            // InternalQL.g:4143:2: 'operand'
            {
             before(grammarAccess.getBasicUnaryExpressionAccess().getOperandKeyword_4()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getBasicUnaryExpressionAccess().getOperandKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicUnaryExpression__Group__4__Impl"


    // $ANTLR start "rule__BasicUnaryExpression__Group__5"
    // InternalQL.g:4152:1: rule__BasicUnaryExpression__Group__5 : rule__BasicUnaryExpression__Group__5__Impl rule__BasicUnaryExpression__Group__6 ;
    public final void rule__BasicUnaryExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4156:1: ( rule__BasicUnaryExpression__Group__5__Impl rule__BasicUnaryExpression__Group__6 )
            // InternalQL.g:4157:2: rule__BasicUnaryExpression__Group__5__Impl rule__BasicUnaryExpression__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__BasicUnaryExpression__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicUnaryExpression__Group__6();

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
    // $ANTLR end "rule__BasicUnaryExpression__Group__5"


    // $ANTLR start "rule__BasicUnaryExpression__Group__5__Impl"
    // InternalQL.g:4164:1: rule__BasicUnaryExpression__Group__5__Impl : ( ( rule__BasicUnaryExpression__OperandAssignment_5 ) ) ;
    public final void rule__BasicUnaryExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4168:1: ( ( ( rule__BasicUnaryExpression__OperandAssignment_5 ) ) )
            // InternalQL.g:4169:1: ( ( rule__BasicUnaryExpression__OperandAssignment_5 ) )
            {
            // InternalQL.g:4169:1: ( ( rule__BasicUnaryExpression__OperandAssignment_5 ) )
            // InternalQL.g:4170:2: ( rule__BasicUnaryExpression__OperandAssignment_5 )
            {
             before(grammarAccess.getBasicUnaryExpressionAccess().getOperandAssignment_5()); 
            // InternalQL.g:4171:2: ( rule__BasicUnaryExpression__OperandAssignment_5 )
            // InternalQL.g:4171:3: rule__BasicUnaryExpression__OperandAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__BasicUnaryExpression__OperandAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getBasicUnaryExpressionAccess().getOperandAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicUnaryExpression__Group__5__Impl"


    // $ANTLR start "rule__BasicUnaryExpression__Group__6"
    // InternalQL.g:4179:1: rule__BasicUnaryExpression__Group__6 : rule__BasicUnaryExpression__Group__6__Impl ;
    public final void rule__BasicUnaryExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4183:1: ( rule__BasicUnaryExpression__Group__6__Impl )
            // InternalQL.g:4184:2: rule__BasicUnaryExpression__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BasicUnaryExpression__Group__6__Impl();

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
    // $ANTLR end "rule__BasicUnaryExpression__Group__6"


    // $ANTLR start "rule__BasicUnaryExpression__Group__6__Impl"
    // InternalQL.g:4190:1: rule__BasicUnaryExpression__Group__6__Impl : ( '}' ) ;
    public final void rule__BasicUnaryExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4194:1: ( ( '}' ) )
            // InternalQL.g:4195:1: ( '}' )
            {
            // InternalQL.g:4195:1: ( '}' )
            // InternalQL.g:4196:2: '}'
            {
             before(grammarAccess.getBasicUnaryExpressionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getBasicUnaryExpressionAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicUnaryExpression__Group__6__Impl"


    // $ANTLR start "rule__BasicUnaryExpression__Group_2__0"
    // InternalQL.g:4206:1: rule__BasicUnaryExpression__Group_2__0 : rule__BasicUnaryExpression__Group_2__0__Impl rule__BasicUnaryExpression__Group_2__1 ;
    public final void rule__BasicUnaryExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4210:1: ( rule__BasicUnaryExpression__Group_2__0__Impl rule__BasicUnaryExpression__Group_2__1 )
            // InternalQL.g:4211:2: rule__BasicUnaryExpression__Group_2__0__Impl rule__BasicUnaryExpression__Group_2__1
            {
            pushFollow(FOLLOW_32);
            rule__BasicUnaryExpression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicUnaryExpression__Group_2__1();

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
    // $ANTLR end "rule__BasicUnaryExpression__Group_2__0"


    // $ANTLR start "rule__BasicUnaryExpression__Group_2__0__Impl"
    // InternalQL.g:4218:1: rule__BasicUnaryExpression__Group_2__0__Impl : ( 'operator' ) ;
    public final void rule__BasicUnaryExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4222:1: ( ( 'operator' ) )
            // InternalQL.g:4223:1: ( 'operator' )
            {
            // InternalQL.g:4223:1: ( 'operator' )
            // InternalQL.g:4224:2: 'operator'
            {
             before(grammarAccess.getBasicUnaryExpressionAccess().getOperatorKeyword_2_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getBasicUnaryExpressionAccess().getOperatorKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicUnaryExpression__Group_2__0__Impl"


    // $ANTLR start "rule__BasicUnaryExpression__Group_2__1"
    // InternalQL.g:4233:1: rule__BasicUnaryExpression__Group_2__1 : rule__BasicUnaryExpression__Group_2__1__Impl ;
    public final void rule__BasicUnaryExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4237:1: ( rule__BasicUnaryExpression__Group_2__1__Impl )
            // InternalQL.g:4238:2: rule__BasicUnaryExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BasicUnaryExpression__Group_2__1__Impl();

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
    // $ANTLR end "rule__BasicUnaryExpression__Group_2__1"


    // $ANTLR start "rule__BasicUnaryExpression__Group_2__1__Impl"
    // InternalQL.g:4244:1: rule__BasicUnaryExpression__Group_2__1__Impl : ( ( rule__BasicUnaryExpression__OperatorAssignment_2_1 ) ) ;
    public final void rule__BasicUnaryExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4248:1: ( ( ( rule__BasicUnaryExpression__OperatorAssignment_2_1 ) ) )
            // InternalQL.g:4249:1: ( ( rule__BasicUnaryExpression__OperatorAssignment_2_1 ) )
            {
            // InternalQL.g:4249:1: ( ( rule__BasicUnaryExpression__OperatorAssignment_2_1 ) )
            // InternalQL.g:4250:2: ( rule__BasicUnaryExpression__OperatorAssignment_2_1 )
            {
             before(grammarAccess.getBasicUnaryExpressionAccess().getOperatorAssignment_2_1()); 
            // InternalQL.g:4251:2: ( rule__BasicUnaryExpression__OperatorAssignment_2_1 )
            // InternalQL.g:4251:3: rule__BasicUnaryExpression__OperatorAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__BasicUnaryExpression__OperatorAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getBasicUnaryExpressionAccess().getOperatorAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicUnaryExpression__Group_2__1__Impl"


    // $ANTLR start "rule__BasicUnaryExpression__Group_3__0"
    // InternalQL.g:4260:1: rule__BasicUnaryExpression__Group_3__0 : rule__BasicUnaryExpression__Group_3__0__Impl rule__BasicUnaryExpression__Group_3__1 ;
    public final void rule__BasicUnaryExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4264:1: ( rule__BasicUnaryExpression__Group_3__0__Impl rule__BasicUnaryExpression__Group_3__1 )
            // InternalQL.g:4265:2: rule__BasicUnaryExpression__Group_3__0__Impl rule__BasicUnaryExpression__Group_3__1
            {
            pushFollow(FOLLOW_11);
            rule__BasicUnaryExpression__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicUnaryExpression__Group_3__1();

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
    // $ANTLR end "rule__BasicUnaryExpression__Group_3__0"


    // $ANTLR start "rule__BasicUnaryExpression__Group_3__0__Impl"
    // InternalQL.g:4272:1: rule__BasicUnaryExpression__Group_3__0__Impl : ( 'resultType' ) ;
    public final void rule__BasicUnaryExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4276:1: ( ( 'resultType' ) )
            // InternalQL.g:4277:1: ( 'resultType' )
            {
            // InternalQL.g:4277:1: ( 'resultType' )
            // InternalQL.g:4278:2: 'resultType'
            {
             before(grammarAccess.getBasicUnaryExpressionAccess().getResultTypeKeyword_3_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getBasicUnaryExpressionAccess().getResultTypeKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicUnaryExpression__Group_3__0__Impl"


    // $ANTLR start "rule__BasicUnaryExpression__Group_3__1"
    // InternalQL.g:4287:1: rule__BasicUnaryExpression__Group_3__1 : rule__BasicUnaryExpression__Group_3__1__Impl ;
    public final void rule__BasicUnaryExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4291:1: ( rule__BasicUnaryExpression__Group_3__1__Impl )
            // InternalQL.g:4292:2: rule__BasicUnaryExpression__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BasicUnaryExpression__Group_3__1__Impl();

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
    // $ANTLR end "rule__BasicUnaryExpression__Group_3__1"


    // $ANTLR start "rule__BasicUnaryExpression__Group_3__1__Impl"
    // InternalQL.g:4298:1: rule__BasicUnaryExpression__Group_3__1__Impl : ( ( rule__BasicUnaryExpression__ResultTypeAssignment_3_1 ) ) ;
    public final void rule__BasicUnaryExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4302:1: ( ( ( rule__BasicUnaryExpression__ResultTypeAssignment_3_1 ) ) )
            // InternalQL.g:4303:1: ( ( rule__BasicUnaryExpression__ResultTypeAssignment_3_1 ) )
            {
            // InternalQL.g:4303:1: ( ( rule__BasicUnaryExpression__ResultTypeAssignment_3_1 ) )
            // InternalQL.g:4304:2: ( rule__BasicUnaryExpression__ResultTypeAssignment_3_1 )
            {
             before(grammarAccess.getBasicUnaryExpressionAccess().getResultTypeAssignment_3_1()); 
            // InternalQL.g:4305:2: ( rule__BasicUnaryExpression__ResultTypeAssignment_3_1 )
            // InternalQL.g:4305:3: rule__BasicUnaryExpression__ResultTypeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__BasicUnaryExpression__ResultTypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBasicUnaryExpressionAccess().getResultTypeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicUnaryExpression__Group_3__1__Impl"


    // $ANTLR start "rule__QuestionCall__Group__0"
    // InternalQL.g:4314:1: rule__QuestionCall__Group__0 : rule__QuestionCall__Group__0__Impl rule__QuestionCall__Group__1 ;
    public final void rule__QuestionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4318:1: ( rule__QuestionCall__Group__0__Impl rule__QuestionCall__Group__1 )
            // InternalQL.g:4319:2: rule__QuestionCall__Group__0__Impl rule__QuestionCall__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalQL.g:4326:1: rule__QuestionCall__Group__0__Impl : ( 'QuestionCall' ) ;
    public final void rule__QuestionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4330:1: ( ( 'QuestionCall' ) )
            // InternalQL.g:4331:1: ( 'QuestionCall' )
            {
            // InternalQL.g:4331:1: ( 'QuestionCall' )
            // InternalQL.g:4332:2: 'QuestionCall'
            {
             before(grammarAccess.getQuestionCallAccess().getQuestionCallKeyword_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getQuestionCallAccess().getQuestionCallKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionCall__Group__0__Impl"


    // $ANTLR start "rule__QuestionCall__Group__1"
    // InternalQL.g:4341:1: rule__QuestionCall__Group__1 : rule__QuestionCall__Group__1__Impl rule__QuestionCall__Group__2 ;
    public final void rule__QuestionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4345:1: ( rule__QuestionCall__Group__1__Impl rule__QuestionCall__Group__2 )
            // InternalQL.g:4346:2: rule__QuestionCall__Group__1__Impl rule__QuestionCall__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__QuestionCall__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionCall__Group__2();

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
    // InternalQL.g:4353:1: rule__QuestionCall__Group__1__Impl : ( '{' ) ;
    public final void rule__QuestionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4357:1: ( ( '{' ) )
            // InternalQL.g:4358:1: ( '{' )
            {
            // InternalQL.g:4358:1: ( '{' )
            // InternalQL.g:4359:2: '{'
            {
             before(grammarAccess.getQuestionCallAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getQuestionCallAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__QuestionCall__Group__2"
    // InternalQL.g:4368:1: rule__QuestionCall__Group__2 : rule__QuestionCall__Group__2__Impl rule__QuestionCall__Group__3 ;
    public final void rule__QuestionCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4372:1: ( rule__QuestionCall__Group__2__Impl rule__QuestionCall__Group__3 )
            // InternalQL.g:4373:2: rule__QuestionCall__Group__2__Impl rule__QuestionCall__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__QuestionCall__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionCall__Group__3();

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
    // $ANTLR end "rule__QuestionCall__Group__2"


    // $ANTLR start "rule__QuestionCall__Group__2__Impl"
    // InternalQL.g:4380:1: rule__QuestionCall__Group__2__Impl : ( ( rule__QuestionCall__Group_2__0 )? ) ;
    public final void rule__QuestionCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4384:1: ( ( ( rule__QuestionCall__Group_2__0 )? ) )
            // InternalQL.g:4385:1: ( ( rule__QuestionCall__Group_2__0 )? )
            {
            // InternalQL.g:4385:1: ( ( rule__QuestionCall__Group_2__0 )? )
            // InternalQL.g:4386:2: ( rule__QuestionCall__Group_2__0 )?
            {
             before(grammarAccess.getQuestionCallAccess().getGroup_2()); 
            // InternalQL.g:4387:2: ( rule__QuestionCall__Group_2__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==52) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalQL.g:4387:3: rule__QuestionCall__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QuestionCall__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionCallAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionCall__Group__2__Impl"


    // $ANTLR start "rule__QuestionCall__Group__3"
    // InternalQL.g:4395:1: rule__QuestionCall__Group__3 : rule__QuestionCall__Group__3__Impl rule__QuestionCall__Group__4 ;
    public final void rule__QuestionCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4399:1: ( rule__QuestionCall__Group__3__Impl rule__QuestionCall__Group__4 )
            // InternalQL.g:4400:2: rule__QuestionCall__Group__3__Impl rule__QuestionCall__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__QuestionCall__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionCall__Group__4();

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
    // $ANTLR end "rule__QuestionCall__Group__3"


    // $ANTLR start "rule__QuestionCall__Group__3__Impl"
    // InternalQL.g:4407:1: rule__QuestionCall__Group__3__Impl : ( 'question' ) ;
    public final void rule__QuestionCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4411:1: ( ( 'question' ) )
            // InternalQL.g:4412:1: ( 'question' )
            {
            // InternalQL.g:4412:1: ( 'question' )
            // InternalQL.g:4413:2: 'question'
            {
             before(grammarAccess.getQuestionCallAccess().getQuestionKeyword_3()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getQuestionCallAccess().getQuestionKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionCall__Group__3__Impl"


    // $ANTLR start "rule__QuestionCall__Group__4"
    // InternalQL.g:4422:1: rule__QuestionCall__Group__4 : rule__QuestionCall__Group__4__Impl rule__QuestionCall__Group__5 ;
    public final void rule__QuestionCall__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4426:1: ( rule__QuestionCall__Group__4__Impl rule__QuestionCall__Group__5 )
            // InternalQL.g:4427:2: rule__QuestionCall__Group__4__Impl rule__QuestionCall__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__QuestionCall__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionCall__Group__5();

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
    // $ANTLR end "rule__QuestionCall__Group__4"


    // $ANTLR start "rule__QuestionCall__Group__4__Impl"
    // InternalQL.g:4434:1: rule__QuestionCall__Group__4__Impl : ( ( rule__QuestionCall__QuestionAssignment_4 ) ) ;
    public final void rule__QuestionCall__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4438:1: ( ( ( rule__QuestionCall__QuestionAssignment_4 ) ) )
            // InternalQL.g:4439:1: ( ( rule__QuestionCall__QuestionAssignment_4 ) )
            {
            // InternalQL.g:4439:1: ( ( rule__QuestionCall__QuestionAssignment_4 ) )
            // InternalQL.g:4440:2: ( rule__QuestionCall__QuestionAssignment_4 )
            {
             before(grammarAccess.getQuestionCallAccess().getQuestionAssignment_4()); 
            // InternalQL.g:4441:2: ( rule__QuestionCall__QuestionAssignment_4 )
            // InternalQL.g:4441:3: rule__QuestionCall__QuestionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__QuestionCall__QuestionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getQuestionCallAccess().getQuestionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionCall__Group__4__Impl"


    // $ANTLR start "rule__QuestionCall__Group__5"
    // InternalQL.g:4449:1: rule__QuestionCall__Group__5 : rule__QuestionCall__Group__5__Impl ;
    public final void rule__QuestionCall__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4453:1: ( rule__QuestionCall__Group__5__Impl )
            // InternalQL.g:4454:2: rule__QuestionCall__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuestionCall__Group__5__Impl();

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
    // $ANTLR end "rule__QuestionCall__Group__5"


    // $ANTLR start "rule__QuestionCall__Group__5__Impl"
    // InternalQL.g:4460:1: rule__QuestionCall__Group__5__Impl : ( '}' ) ;
    public final void rule__QuestionCall__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4464:1: ( ( '}' ) )
            // InternalQL.g:4465:1: ( '}' )
            {
            // InternalQL.g:4465:1: ( '}' )
            // InternalQL.g:4466:2: '}'
            {
             before(grammarAccess.getQuestionCallAccess().getRightCurlyBracketKeyword_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getQuestionCallAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionCall__Group__5__Impl"


    // $ANTLR start "rule__QuestionCall__Group_2__0"
    // InternalQL.g:4476:1: rule__QuestionCall__Group_2__0 : rule__QuestionCall__Group_2__0__Impl rule__QuestionCall__Group_2__1 ;
    public final void rule__QuestionCall__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4480:1: ( rule__QuestionCall__Group_2__0__Impl rule__QuestionCall__Group_2__1 )
            // InternalQL.g:4481:2: rule__QuestionCall__Group_2__0__Impl rule__QuestionCall__Group_2__1
            {
            pushFollow(FOLLOW_11);
            rule__QuestionCall__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionCall__Group_2__1();

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
    // $ANTLR end "rule__QuestionCall__Group_2__0"


    // $ANTLR start "rule__QuestionCall__Group_2__0__Impl"
    // InternalQL.g:4488:1: rule__QuestionCall__Group_2__0__Impl : ( 'resultType' ) ;
    public final void rule__QuestionCall__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4492:1: ( ( 'resultType' ) )
            // InternalQL.g:4493:1: ( 'resultType' )
            {
            // InternalQL.g:4493:1: ( 'resultType' )
            // InternalQL.g:4494:2: 'resultType'
            {
             before(grammarAccess.getQuestionCallAccess().getResultTypeKeyword_2_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getQuestionCallAccess().getResultTypeKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionCall__Group_2__0__Impl"


    // $ANTLR start "rule__QuestionCall__Group_2__1"
    // InternalQL.g:4503:1: rule__QuestionCall__Group_2__1 : rule__QuestionCall__Group_2__1__Impl ;
    public final void rule__QuestionCall__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4507:1: ( rule__QuestionCall__Group_2__1__Impl )
            // InternalQL.g:4508:2: rule__QuestionCall__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuestionCall__Group_2__1__Impl();

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
    // $ANTLR end "rule__QuestionCall__Group_2__1"


    // $ANTLR start "rule__QuestionCall__Group_2__1__Impl"
    // InternalQL.g:4514:1: rule__QuestionCall__Group_2__1__Impl : ( ( rule__QuestionCall__ResultTypeAssignment_2_1 ) ) ;
    public final void rule__QuestionCall__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4518:1: ( ( ( rule__QuestionCall__ResultTypeAssignment_2_1 ) ) )
            // InternalQL.g:4519:1: ( ( rule__QuestionCall__ResultTypeAssignment_2_1 ) )
            {
            // InternalQL.g:4519:1: ( ( rule__QuestionCall__ResultTypeAssignment_2_1 ) )
            // InternalQL.g:4520:2: ( rule__QuestionCall__ResultTypeAssignment_2_1 )
            {
             before(grammarAccess.getQuestionCallAccess().getResultTypeAssignment_2_1()); 
            // InternalQL.g:4521:2: ( rule__QuestionCall__ResultTypeAssignment_2_1 )
            // InternalQL.g:4521:3: rule__QuestionCall__ResultTypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__QuestionCall__ResultTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionCallAccess().getResultTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionCall__Group_2__1__Impl"


    // $ANTLR start "rule__BooleanValueType__Group__0"
    // InternalQL.g:4530:1: rule__BooleanValueType__Group__0 : rule__BooleanValueType__Group__0__Impl rule__BooleanValueType__Group__1 ;
    public final void rule__BooleanValueType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4534:1: ( rule__BooleanValueType__Group__0__Impl rule__BooleanValueType__Group__1 )
            // InternalQL.g:4535:2: rule__BooleanValueType__Group__0__Impl rule__BooleanValueType__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalQL.g:4542:1: rule__BooleanValueType__Group__0__Impl : ( () ) ;
    public final void rule__BooleanValueType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4546:1: ( ( () ) )
            // InternalQL.g:4547:1: ( () )
            {
            // InternalQL.g:4547:1: ( () )
            // InternalQL.g:4548:2: ()
            {
             before(grammarAccess.getBooleanValueTypeAccess().getBooleanValueTypeAction_0()); 
            // InternalQL.g:4549:2: ()
            // InternalQL.g:4549:3: 
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
    // InternalQL.g:4557:1: rule__BooleanValueType__Group__1 : rule__BooleanValueType__Group__1__Impl rule__BooleanValueType__Group__2 ;
    public final void rule__BooleanValueType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4561:1: ( rule__BooleanValueType__Group__1__Impl rule__BooleanValueType__Group__2 )
            // InternalQL.g:4562:2: rule__BooleanValueType__Group__1__Impl rule__BooleanValueType__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalQL.g:4569:1: rule__BooleanValueType__Group__1__Impl : ( 'BooleanValueType' ) ;
    public final void rule__BooleanValueType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4573:1: ( ( 'BooleanValueType' ) )
            // InternalQL.g:4574:1: ( 'BooleanValueType' )
            {
            // InternalQL.g:4574:1: ( 'BooleanValueType' )
            // InternalQL.g:4575:2: 'BooleanValueType'
            {
             before(grammarAccess.getBooleanValueTypeAccess().getBooleanValueTypeKeyword_1()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getBooleanValueTypeAccess().getBooleanValueTypeKeyword_1()); 

            }


            }

        }
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
    // InternalQL.g:4584:1: rule__BooleanValueType__Group__2 : rule__BooleanValueType__Group__2__Impl rule__BooleanValueType__Group__3 ;
    public final void rule__BooleanValueType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4588:1: ( rule__BooleanValueType__Group__2__Impl rule__BooleanValueType__Group__3 )
            // InternalQL.g:4589:2: rule__BooleanValueType__Group__2__Impl rule__BooleanValueType__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalQL.g:4596:1: rule__BooleanValueType__Group__2__Impl : ( ( rule__BooleanValueType__NameAssignment_2 ) ) ;
    public final void rule__BooleanValueType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4600:1: ( ( ( rule__BooleanValueType__NameAssignment_2 ) ) )
            // InternalQL.g:4601:1: ( ( rule__BooleanValueType__NameAssignment_2 ) )
            {
            // InternalQL.g:4601:1: ( ( rule__BooleanValueType__NameAssignment_2 ) )
            // InternalQL.g:4602:2: ( rule__BooleanValueType__NameAssignment_2 )
            {
             before(grammarAccess.getBooleanValueTypeAccess().getNameAssignment_2()); 
            // InternalQL.g:4603:2: ( rule__BooleanValueType__NameAssignment_2 )
            // InternalQL.g:4603:3: rule__BooleanValueType__NameAssignment_2
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
    // InternalQL.g:4611:1: rule__BooleanValueType__Group__3 : rule__BooleanValueType__Group__3__Impl rule__BooleanValueType__Group__4 ;
    public final void rule__BooleanValueType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4615:1: ( rule__BooleanValueType__Group__3__Impl rule__BooleanValueType__Group__4 )
            // InternalQL.g:4616:2: rule__BooleanValueType__Group__3__Impl rule__BooleanValueType__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__BooleanValueType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanValueType__Group__4();

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
    // InternalQL.g:4623:1: rule__BooleanValueType__Group__3__Impl : ( '{' ) ;
    public final void rule__BooleanValueType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4627:1: ( ( '{' ) )
            // InternalQL.g:4628:1: ( '{' )
            {
            // InternalQL.g:4628:1: ( '{' )
            // InternalQL.g:4629:2: '{'
            {
             before(grammarAccess.getBooleanValueTypeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getBooleanValueTypeAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__BooleanValueType__Group__4"
    // InternalQL.g:4638:1: rule__BooleanValueType__Group__4 : rule__BooleanValueType__Group__4__Impl rule__BooleanValueType__Group__5 ;
    public final void rule__BooleanValueType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4642:1: ( rule__BooleanValueType__Group__4__Impl rule__BooleanValueType__Group__5 )
            // InternalQL.g:4643:2: rule__BooleanValueType__Group__4__Impl rule__BooleanValueType__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__BooleanValueType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanValueType__Group__5();

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
    // $ANTLR end "rule__BooleanValueType__Group__4"


    // $ANTLR start "rule__BooleanValueType__Group__4__Impl"
    // InternalQL.g:4650:1: rule__BooleanValueType__Group__4__Impl : ( ( rule__BooleanValueType__Group_4__0 )? ) ;
    public final void rule__BooleanValueType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4654:1: ( ( ( rule__BooleanValueType__Group_4__0 )? ) )
            // InternalQL.g:4655:1: ( ( rule__BooleanValueType__Group_4__0 )? )
            {
            // InternalQL.g:4655:1: ( ( rule__BooleanValueType__Group_4__0 )? )
            // InternalQL.g:4656:2: ( rule__BooleanValueType__Group_4__0 )?
            {
             before(grammarAccess.getBooleanValueTypeAccess().getGroup_4()); 
            // InternalQL.g:4657:2: ( rule__BooleanValueType__Group_4__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==47) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalQL.g:4657:3: rule__BooleanValueType__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BooleanValueType__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBooleanValueTypeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueType__Group__4__Impl"


    // $ANTLR start "rule__BooleanValueType__Group__5"
    // InternalQL.g:4665:1: rule__BooleanValueType__Group__5 : rule__BooleanValueType__Group__5__Impl ;
    public final void rule__BooleanValueType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4669:1: ( rule__BooleanValueType__Group__5__Impl )
            // InternalQL.g:4670:2: rule__BooleanValueType__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanValueType__Group__5__Impl();

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
    // $ANTLR end "rule__BooleanValueType__Group__5"


    // $ANTLR start "rule__BooleanValueType__Group__5__Impl"
    // InternalQL.g:4676:1: rule__BooleanValueType__Group__5__Impl : ( '}' ) ;
    public final void rule__BooleanValueType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4680:1: ( ( '}' ) )
            // InternalQL.g:4681:1: ( '}' )
            {
            // InternalQL.g:4681:1: ( '}' )
            // InternalQL.g:4682:2: '}'
            {
             before(grammarAccess.getBooleanValueTypeAccess().getRightCurlyBracketKeyword_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getBooleanValueTypeAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueType__Group__5__Impl"


    // $ANTLR start "rule__BooleanValueType__Group_4__0"
    // InternalQL.g:4692:1: rule__BooleanValueType__Group_4__0 : rule__BooleanValueType__Group_4__0__Impl rule__BooleanValueType__Group_4__1 ;
    public final void rule__BooleanValueType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4696:1: ( rule__BooleanValueType__Group_4__0__Impl rule__BooleanValueType__Group_4__1 )
            // InternalQL.g:4697:2: rule__BooleanValueType__Group_4__0__Impl rule__BooleanValueType__Group_4__1
            {
            pushFollow(FOLLOW_11);
            rule__BooleanValueType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanValueType__Group_4__1();

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
    // $ANTLR end "rule__BooleanValueType__Group_4__0"


    // $ANTLR start "rule__BooleanValueType__Group_4__0__Impl"
    // InternalQL.g:4704:1: rule__BooleanValueType__Group_4__0__Impl : ( 'unit' ) ;
    public final void rule__BooleanValueType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4708:1: ( ( 'unit' ) )
            // InternalQL.g:4709:1: ( 'unit' )
            {
            // InternalQL.g:4709:1: ( 'unit' )
            // InternalQL.g:4710:2: 'unit'
            {
             before(grammarAccess.getBooleanValueTypeAccess().getUnitKeyword_4_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getBooleanValueTypeAccess().getUnitKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueType__Group_4__0__Impl"


    // $ANTLR start "rule__BooleanValueType__Group_4__1"
    // InternalQL.g:4719:1: rule__BooleanValueType__Group_4__1 : rule__BooleanValueType__Group_4__1__Impl ;
    public final void rule__BooleanValueType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4723:1: ( rule__BooleanValueType__Group_4__1__Impl )
            // InternalQL.g:4724:2: rule__BooleanValueType__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanValueType__Group_4__1__Impl();

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
    // $ANTLR end "rule__BooleanValueType__Group_4__1"


    // $ANTLR start "rule__BooleanValueType__Group_4__1__Impl"
    // InternalQL.g:4730:1: rule__BooleanValueType__Group_4__1__Impl : ( ( rule__BooleanValueType__UnitAssignment_4_1 ) ) ;
    public final void rule__BooleanValueType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4734:1: ( ( ( rule__BooleanValueType__UnitAssignment_4_1 ) ) )
            // InternalQL.g:4735:1: ( ( rule__BooleanValueType__UnitAssignment_4_1 ) )
            {
            // InternalQL.g:4735:1: ( ( rule__BooleanValueType__UnitAssignment_4_1 ) )
            // InternalQL.g:4736:2: ( rule__BooleanValueType__UnitAssignment_4_1 )
            {
             before(grammarAccess.getBooleanValueTypeAccess().getUnitAssignment_4_1()); 
            // InternalQL.g:4737:2: ( rule__BooleanValueType__UnitAssignment_4_1 )
            // InternalQL.g:4737:3: rule__BooleanValueType__UnitAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__BooleanValueType__UnitAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getBooleanValueTypeAccess().getUnitAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueType__Group_4__1__Impl"


    // $ANTLR start "rule__IntegerValueType__Group__0"
    // InternalQL.g:4746:1: rule__IntegerValueType__Group__0 : rule__IntegerValueType__Group__0__Impl rule__IntegerValueType__Group__1 ;
    public final void rule__IntegerValueType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4750:1: ( rule__IntegerValueType__Group__0__Impl rule__IntegerValueType__Group__1 )
            // InternalQL.g:4751:2: rule__IntegerValueType__Group__0__Impl rule__IntegerValueType__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalQL.g:4758:1: rule__IntegerValueType__Group__0__Impl : ( () ) ;
    public final void rule__IntegerValueType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4762:1: ( ( () ) )
            // InternalQL.g:4763:1: ( () )
            {
            // InternalQL.g:4763:1: ( () )
            // InternalQL.g:4764:2: ()
            {
             before(grammarAccess.getIntegerValueTypeAccess().getIntegerValueTypeAction_0()); 
            // InternalQL.g:4765:2: ()
            // InternalQL.g:4765:3: 
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
    // InternalQL.g:4773:1: rule__IntegerValueType__Group__1 : rule__IntegerValueType__Group__1__Impl rule__IntegerValueType__Group__2 ;
    public final void rule__IntegerValueType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4777:1: ( rule__IntegerValueType__Group__1__Impl rule__IntegerValueType__Group__2 )
            // InternalQL.g:4778:2: rule__IntegerValueType__Group__1__Impl rule__IntegerValueType__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalQL.g:4785:1: rule__IntegerValueType__Group__1__Impl : ( 'IntegerValueType' ) ;
    public final void rule__IntegerValueType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4789:1: ( ( 'IntegerValueType' ) )
            // InternalQL.g:4790:1: ( 'IntegerValueType' )
            {
            // InternalQL.g:4790:1: ( 'IntegerValueType' )
            // InternalQL.g:4791:2: 'IntegerValueType'
            {
             before(grammarAccess.getIntegerValueTypeAccess().getIntegerValueTypeKeyword_1()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getIntegerValueTypeAccess().getIntegerValueTypeKeyword_1()); 

            }


            }

        }
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
    // InternalQL.g:4800:1: rule__IntegerValueType__Group__2 : rule__IntegerValueType__Group__2__Impl rule__IntegerValueType__Group__3 ;
    public final void rule__IntegerValueType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4804:1: ( rule__IntegerValueType__Group__2__Impl rule__IntegerValueType__Group__3 )
            // InternalQL.g:4805:2: rule__IntegerValueType__Group__2__Impl rule__IntegerValueType__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalQL.g:4812:1: rule__IntegerValueType__Group__2__Impl : ( ( rule__IntegerValueType__NameAssignment_2 ) ) ;
    public final void rule__IntegerValueType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4816:1: ( ( ( rule__IntegerValueType__NameAssignment_2 ) ) )
            // InternalQL.g:4817:1: ( ( rule__IntegerValueType__NameAssignment_2 ) )
            {
            // InternalQL.g:4817:1: ( ( rule__IntegerValueType__NameAssignment_2 ) )
            // InternalQL.g:4818:2: ( rule__IntegerValueType__NameAssignment_2 )
            {
             before(grammarAccess.getIntegerValueTypeAccess().getNameAssignment_2()); 
            // InternalQL.g:4819:2: ( rule__IntegerValueType__NameAssignment_2 )
            // InternalQL.g:4819:3: rule__IntegerValueType__NameAssignment_2
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
    // InternalQL.g:4827:1: rule__IntegerValueType__Group__3 : rule__IntegerValueType__Group__3__Impl rule__IntegerValueType__Group__4 ;
    public final void rule__IntegerValueType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4831:1: ( rule__IntegerValueType__Group__3__Impl rule__IntegerValueType__Group__4 )
            // InternalQL.g:4832:2: rule__IntegerValueType__Group__3__Impl rule__IntegerValueType__Group__4
            {
            pushFollow(FOLLOW_36);
            rule__IntegerValueType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerValueType__Group__4();

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
    // InternalQL.g:4839:1: rule__IntegerValueType__Group__3__Impl : ( '{' ) ;
    public final void rule__IntegerValueType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4843:1: ( ( '{' ) )
            // InternalQL.g:4844:1: ( '{' )
            {
            // InternalQL.g:4844:1: ( '{' )
            // InternalQL.g:4845:2: '{'
            {
             before(grammarAccess.getIntegerValueTypeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getIntegerValueTypeAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__IntegerValueType__Group__4"
    // InternalQL.g:4854:1: rule__IntegerValueType__Group__4 : rule__IntegerValueType__Group__4__Impl rule__IntegerValueType__Group__5 ;
    public final void rule__IntegerValueType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4858:1: ( rule__IntegerValueType__Group__4__Impl rule__IntegerValueType__Group__5 )
            // InternalQL.g:4859:2: rule__IntegerValueType__Group__4__Impl rule__IntegerValueType__Group__5
            {
            pushFollow(FOLLOW_36);
            rule__IntegerValueType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerValueType__Group__5();

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
    // $ANTLR end "rule__IntegerValueType__Group__4"


    // $ANTLR start "rule__IntegerValueType__Group__4__Impl"
    // InternalQL.g:4866:1: rule__IntegerValueType__Group__4__Impl : ( ( rule__IntegerValueType__Group_4__0 )? ) ;
    public final void rule__IntegerValueType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4870:1: ( ( ( rule__IntegerValueType__Group_4__0 )? ) )
            // InternalQL.g:4871:1: ( ( rule__IntegerValueType__Group_4__0 )? )
            {
            // InternalQL.g:4871:1: ( ( rule__IntegerValueType__Group_4__0 )? )
            // InternalQL.g:4872:2: ( rule__IntegerValueType__Group_4__0 )?
            {
             before(grammarAccess.getIntegerValueTypeAccess().getGroup_4()); 
            // InternalQL.g:4873:2: ( rule__IntegerValueType__Group_4__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==47) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalQL.g:4873:3: rule__IntegerValueType__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IntegerValueType__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntegerValueTypeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group__4__Impl"


    // $ANTLR start "rule__IntegerValueType__Group__5"
    // InternalQL.g:4881:1: rule__IntegerValueType__Group__5 : rule__IntegerValueType__Group__5__Impl rule__IntegerValueType__Group__6 ;
    public final void rule__IntegerValueType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4885:1: ( rule__IntegerValueType__Group__5__Impl rule__IntegerValueType__Group__6 )
            // InternalQL.g:4886:2: rule__IntegerValueType__Group__5__Impl rule__IntegerValueType__Group__6
            {
            pushFollow(FOLLOW_36);
            rule__IntegerValueType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerValueType__Group__6();

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
    // $ANTLR end "rule__IntegerValueType__Group__5"


    // $ANTLR start "rule__IntegerValueType__Group__5__Impl"
    // InternalQL.g:4893:1: rule__IntegerValueType__Group__5__Impl : ( ( rule__IntegerValueType__Group_5__0 )? ) ;
    public final void rule__IntegerValueType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4897:1: ( ( ( rule__IntegerValueType__Group_5__0 )? ) )
            // InternalQL.g:4898:1: ( ( rule__IntegerValueType__Group_5__0 )? )
            {
            // InternalQL.g:4898:1: ( ( rule__IntegerValueType__Group_5__0 )? )
            // InternalQL.g:4899:2: ( rule__IntegerValueType__Group_5__0 )?
            {
             before(grammarAccess.getIntegerValueTypeAccess().getGroup_5()); 
            // InternalQL.g:4900:2: ( rule__IntegerValueType__Group_5__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==61) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalQL.g:4900:3: rule__IntegerValueType__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IntegerValueType__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntegerValueTypeAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group__5__Impl"


    // $ANTLR start "rule__IntegerValueType__Group__6"
    // InternalQL.g:4908:1: rule__IntegerValueType__Group__6 : rule__IntegerValueType__Group__6__Impl rule__IntegerValueType__Group__7 ;
    public final void rule__IntegerValueType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4912:1: ( rule__IntegerValueType__Group__6__Impl rule__IntegerValueType__Group__7 )
            // InternalQL.g:4913:2: rule__IntegerValueType__Group__6__Impl rule__IntegerValueType__Group__7
            {
            pushFollow(FOLLOW_36);
            rule__IntegerValueType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerValueType__Group__7();

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
    // $ANTLR end "rule__IntegerValueType__Group__6"


    // $ANTLR start "rule__IntegerValueType__Group__6__Impl"
    // InternalQL.g:4920:1: rule__IntegerValueType__Group__6__Impl : ( ( rule__IntegerValueType__Group_6__0 )? ) ;
    public final void rule__IntegerValueType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4924:1: ( ( ( rule__IntegerValueType__Group_6__0 )? ) )
            // InternalQL.g:4925:1: ( ( rule__IntegerValueType__Group_6__0 )? )
            {
            // InternalQL.g:4925:1: ( ( rule__IntegerValueType__Group_6__0 )? )
            // InternalQL.g:4926:2: ( rule__IntegerValueType__Group_6__0 )?
            {
             before(grammarAccess.getIntegerValueTypeAccess().getGroup_6()); 
            // InternalQL.g:4927:2: ( rule__IntegerValueType__Group_6__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==62) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalQL.g:4927:3: rule__IntegerValueType__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IntegerValueType__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntegerValueTypeAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group__6__Impl"


    // $ANTLR start "rule__IntegerValueType__Group__7"
    // InternalQL.g:4935:1: rule__IntegerValueType__Group__7 : rule__IntegerValueType__Group__7__Impl ;
    public final void rule__IntegerValueType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4939:1: ( rule__IntegerValueType__Group__7__Impl )
            // InternalQL.g:4940:2: rule__IntegerValueType__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntegerValueType__Group__7__Impl();

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
    // $ANTLR end "rule__IntegerValueType__Group__7"


    // $ANTLR start "rule__IntegerValueType__Group__7__Impl"
    // InternalQL.g:4946:1: rule__IntegerValueType__Group__7__Impl : ( '}' ) ;
    public final void rule__IntegerValueType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4950:1: ( ( '}' ) )
            // InternalQL.g:4951:1: ( '}' )
            {
            // InternalQL.g:4951:1: ( '}' )
            // InternalQL.g:4952:2: '}'
            {
             before(grammarAccess.getIntegerValueTypeAccess().getRightCurlyBracketKeyword_7()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getIntegerValueTypeAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group__7__Impl"


    // $ANTLR start "rule__IntegerValueType__Group_4__0"
    // InternalQL.g:4962:1: rule__IntegerValueType__Group_4__0 : rule__IntegerValueType__Group_4__0__Impl rule__IntegerValueType__Group_4__1 ;
    public final void rule__IntegerValueType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4966:1: ( rule__IntegerValueType__Group_4__0__Impl rule__IntegerValueType__Group_4__1 )
            // InternalQL.g:4967:2: rule__IntegerValueType__Group_4__0__Impl rule__IntegerValueType__Group_4__1
            {
            pushFollow(FOLLOW_11);
            rule__IntegerValueType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerValueType__Group_4__1();

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
    // $ANTLR end "rule__IntegerValueType__Group_4__0"


    // $ANTLR start "rule__IntegerValueType__Group_4__0__Impl"
    // InternalQL.g:4974:1: rule__IntegerValueType__Group_4__0__Impl : ( 'unit' ) ;
    public final void rule__IntegerValueType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4978:1: ( ( 'unit' ) )
            // InternalQL.g:4979:1: ( 'unit' )
            {
            // InternalQL.g:4979:1: ( 'unit' )
            // InternalQL.g:4980:2: 'unit'
            {
             before(grammarAccess.getIntegerValueTypeAccess().getUnitKeyword_4_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getIntegerValueTypeAccess().getUnitKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_4__0__Impl"


    // $ANTLR start "rule__IntegerValueType__Group_4__1"
    // InternalQL.g:4989:1: rule__IntegerValueType__Group_4__1 : rule__IntegerValueType__Group_4__1__Impl ;
    public final void rule__IntegerValueType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:4993:1: ( rule__IntegerValueType__Group_4__1__Impl )
            // InternalQL.g:4994:2: rule__IntegerValueType__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntegerValueType__Group_4__1__Impl();

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
    // $ANTLR end "rule__IntegerValueType__Group_4__1"


    // $ANTLR start "rule__IntegerValueType__Group_4__1__Impl"
    // InternalQL.g:5000:1: rule__IntegerValueType__Group_4__1__Impl : ( ( rule__IntegerValueType__UnitAssignment_4_1 ) ) ;
    public final void rule__IntegerValueType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5004:1: ( ( ( rule__IntegerValueType__UnitAssignment_4_1 ) ) )
            // InternalQL.g:5005:1: ( ( rule__IntegerValueType__UnitAssignment_4_1 ) )
            {
            // InternalQL.g:5005:1: ( ( rule__IntegerValueType__UnitAssignment_4_1 ) )
            // InternalQL.g:5006:2: ( rule__IntegerValueType__UnitAssignment_4_1 )
            {
             before(grammarAccess.getIntegerValueTypeAccess().getUnitAssignment_4_1()); 
            // InternalQL.g:5007:2: ( rule__IntegerValueType__UnitAssignment_4_1 )
            // InternalQL.g:5007:3: rule__IntegerValueType__UnitAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__IntegerValueType__UnitAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getIntegerValueTypeAccess().getUnitAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_4__1__Impl"


    // $ANTLR start "rule__IntegerValueType__Group_5__0"
    // InternalQL.g:5016:1: rule__IntegerValueType__Group_5__0 : rule__IntegerValueType__Group_5__0__Impl rule__IntegerValueType__Group_5__1 ;
    public final void rule__IntegerValueType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5020:1: ( rule__IntegerValueType__Group_5__0__Impl rule__IntegerValueType__Group_5__1 )
            // InternalQL.g:5021:2: rule__IntegerValueType__Group_5__0__Impl rule__IntegerValueType__Group_5__1
            {
            pushFollow(FOLLOW_37);
            rule__IntegerValueType__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerValueType__Group_5__1();

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
    // $ANTLR end "rule__IntegerValueType__Group_5__0"


    // $ANTLR start "rule__IntegerValueType__Group_5__0__Impl"
    // InternalQL.g:5028:1: rule__IntegerValueType__Group_5__0__Impl : ( 'min' ) ;
    public final void rule__IntegerValueType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5032:1: ( ( 'min' ) )
            // InternalQL.g:5033:1: ( 'min' )
            {
            // InternalQL.g:5033:1: ( 'min' )
            // InternalQL.g:5034:2: 'min'
            {
             before(grammarAccess.getIntegerValueTypeAccess().getMinKeyword_5_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getIntegerValueTypeAccess().getMinKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_5__0__Impl"


    // $ANTLR start "rule__IntegerValueType__Group_5__1"
    // InternalQL.g:5043:1: rule__IntegerValueType__Group_5__1 : rule__IntegerValueType__Group_5__1__Impl ;
    public final void rule__IntegerValueType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5047:1: ( rule__IntegerValueType__Group_5__1__Impl )
            // InternalQL.g:5048:2: rule__IntegerValueType__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntegerValueType__Group_5__1__Impl();

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
    // $ANTLR end "rule__IntegerValueType__Group_5__1"


    // $ANTLR start "rule__IntegerValueType__Group_5__1__Impl"
    // InternalQL.g:5054:1: rule__IntegerValueType__Group_5__1__Impl : ( ( rule__IntegerValueType__MinAssignment_5_1 ) ) ;
    public final void rule__IntegerValueType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5058:1: ( ( ( rule__IntegerValueType__MinAssignment_5_1 ) ) )
            // InternalQL.g:5059:1: ( ( rule__IntegerValueType__MinAssignment_5_1 ) )
            {
            // InternalQL.g:5059:1: ( ( rule__IntegerValueType__MinAssignment_5_1 ) )
            // InternalQL.g:5060:2: ( rule__IntegerValueType__MinAssignment_5_1 )
            {
             before(grammarAccess.getIntegerValueTypeAccess().getMinAssignment_5_1()); 
            // InternalQL.g:5061:2: ( rule__IntegerValueType__MinAssignment_5_1 )
            // InternalQL.g:5061:3: rule__IntegerValueType__MinAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__IntegerValueType__MinAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getIntegerValueTypeAccess().getMinAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_5__1__Impl"


    // $ANTLR start "rule__IntegerValueType__Group_6__0"
    // InternalQL.g:5070:1: rule__IntegerValueType__Group_6__0 : rule__IntegerValueType__Group_6__0__Impl rule__IntegerValueType__Group_6__1 ;
    public final void rule__IntegerValueType__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5074:1: ( rule__IntegerValueType__Group_6__0__Impl rule__IntegerValueType__Group_6__1 )
            // InternalQL.g:5075:2: rule__IntegerValueType__Group_6__0__Impl rule__IntegerValueType__Group_6__1
            {
            pushFollow(FOLLOW_37);
            rule__IntegerValueType__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerValueType__Group_6__1();

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
    // $ANTLR end "rule__IntegerValueType__Group_6__0"


    // $ANTLR start "rule__IntegerValueType__Group_6__0__Impl"
    // InternalQL.g:5082:1: rule__IntegerValueType__Group_6__0__Impl : ( 'max' ) ;
    public final void rule__IntegerValueType__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5086:1: ( ( 'max' ) )
            // InternalQL.g:5087:1: ( 'max' )
            {
            // InternalQL.g:5087:1: ( 'max' )
            // InternalQL.g:5088:2: 'max'
            {
             before(grammarAccess.getIntegerValueTypeAccess().getMaxKeyword_6_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getIntegerValueTypeAccess().getMaxKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_6__0__Impl"


    // $ANTLR start "rule__IntegerValueType__Group_6__1"
    // InternalQL.g:5097:1: rule__IntegerValueType__Group_6__1 : rule__IntegerValueType__Group_6__1__Impl ;
    public final void rule__IntegerValueType__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5101:1: ( rule__IntegerValueType__Group_6__1__Impl )
            // InternalQL.g:5102:2: rule__IntegerValueType__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntegerValueType__Group_6__1__Impl();

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
    // $ANTLR end "rule__IntegerValueType__Group_6__1"


    // $ANTLR start "rule__IntegerValueType__Group_6__1__Impl"
    // InternalQL.g:5108:1: rule__IntegerValueType__Group_6__1__Impl : ( ( rule__IntegerValueType__MaxAssignment_6_1 ) ) ;
    public final void rule__IntegerValueType__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5112:1: ( ( ( rule__IntegerValueType__MaxAssignment_6_1 ) ) )
            // InternalQL.g:5113:1: ( ( rule__IntegerValueType__MaxAssignment_6_1 ) )
            {
            // InternalQL.g:5113:1: ( ( rule__IntegerValueType__MaxAssignment_6_1 ) )
            // InternalQL.g:5114:2: ( rule__IntegerValueType__MaxAssignment_6_1 )
            {
             before(grammarAccess.getIntegerValueTypeAccess().getMaxAssignment_6_1()); 
            // InternalQL.g:5115:2: ( rule__IntegerValueType__MaxAssignment_6_1 )
            // InternalQL.g:5115:3: rule__IntegerValueType__MaxAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__IntegerValueType__MaxAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getIntegerValueTypeAccess().getMaxAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__Group_6__1__Impl"


    // $ANTLR start "rule__DecimalValueType__Group__0"
    // InternalQL.g:5124:1: rule__DecimalValueType__Group__0 : rule__DecimalValueType__Group__0__Impl rule__DecimalValueType__Group__1 ;
    public final void rule__DecimalValueType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5128:1: ( rule__DecimalValueType__Group__0__Impl rule__DecimalValueType__Group__1 )
            // InternalQL.g:5129:2: rule__DecimalValueType__Group__0__Impl rule__DecimalValueType__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalQL.g:5136:1: rule__DecimalValueType__Group__0__Impl : ( () ) ;
    public final void rule__DecimalValueType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5140:1: ( ( () ) )
            // InternalQL.g:5141:1: ( () )
            {
            // InternalQL.g:5141:1: ( () )
            // InternalQL.g:5142:2: ()
            {
             before(grammarAccess.getDecimalValueTypeAccess().getDecimalValueTypeAction_0()); 
            // InternalQL.g:5143:2: ()
            // InternalQL.g:5143:3: 
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
    // InternalQL.g:5151:1: rule__DecimalValueType__Group__1 : rule__DecimalValueType__Group__1__Impl rule__DecimalValueType__Group__2 ;
    public final void rule__DecimalValueType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5155:1: ( rule__DecimalValueType__Group__1__Impl rule__DecimalValueType__Group__2 )
            // InternalQL.g:5156:2: rule__DecimalValueType__Group__1__Impl rule__DecimalValueType__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalQL.g:5163:1: rule__DecimalValueType__Group__1__Impl : ( 'DecimalValueType' ) ;
    public final void rule__DecimalValueType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5167:1: ( ( 'DecimalValueType' ) )
            // InternalQL.g:5168:1: ( 'DecimalValueType' )
            {
            // InternalQL.g:5168:1: ( 'DecimalValueType' )
            // InternalQL.g:5169:2: 'DecimalValueType'
            {
             before(grammarAccess.getDecimalValueTypeAccess().getDecimalValueTypeKeyword_1()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getDecimalValueTypeAccess().getDecimalValueTypeKeyword_1()); 

            }


            }

        }
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
    // InternalQL.g:5178:1: rule__DecimalValueType__Group__2 : rule__DecimalValueType__Group__2__Impl rule__DecimalValueType__Group__3 ;
    public final void rule__DecimalValueType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5182:1: ( rule__DecimalValueType__Group__2__Impl rule__DecimalValueType__Group__3 )
            // InternalQL.g:5183:2: rule__DecimalValueType__Group__2__Impl rule__DecimalValueType__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalQL.g:5190:1: rule__DecimalValueType__Group__2__Impl : ( ( rule__DecimalValueType__NameAssignment_2 ) ) ;
    public final void rule__DecimalValueType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5194:1: ( ( ( rule__DecimalValueType__NameAssignment_2 ) ) )
            // InternalQL.g:5195:1: ( ( rule__DecimalValueType__NameAssignment_2 ) )
            {
            // InternalQL.g:5195:1: ( ( rule__DecimalValueType__NameAssignment_2 ) )
            // InternalQL.g:5196:2: ( rule__DecimalValueType__NameAssignment_2 )
            {
             before(grammarAccess.getDecimalValueTypeAccess().getNameAssignment_2()); 
            // InternalQL.g:5197:2: ( rule__DecimalValueType__NameAssignment_2 )
            // InternalQL.g:5197:3: rule__DecimalValueType__NameAssignment_2
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
    // InternalQL.g:5205:1: rule__DecimalValueType__Group__3 : rule__DecimalValueType__Group__3__Impl rule__DecimalValueType__Group__4 ;
    public final void rule__DecimalValueType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5209:1: ( rule__DecimalValueType__Group__3__Impl rule__DecimalValueType__Group__4 )
            // InternalQL.g:5210:2: rule__DecimalValueType__Group__3__Impl rule__DecimalValueType__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__DecimalValueType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DecimalValueType__Group__4();

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
    // InternalQL.g:5217:1: rule__DecimalValueType__Group__3__Impl : ( '{' ) ;
    public final void rule__DecimalValueType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5221:1: ( ( '{' ) )
            // InternalQL.g:5222:1: ( '{' )
            {
            // InternalQL.g:5222:1: ( '{' )
            // InternalQL.g:5223:2: '{'
            {
             before(grammarAccess.getDecimalValueTypeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDecimalValueTypeAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__DecimalValueType__Group__4"
    // InternalQL.g:5232:1: rule__DecimalValueType__Group__4 : rule__DecimalValueType__Group__4__Impl rule__DecimalValueType__Group__5 ;
    public final void rule__DecimalValueType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5236:1: ( rule__DecimalValueType__Group__4__Impl rule__DecimalValueType__Group__5 )
            // InternalQL.g:5237:2: rule__DecimalValueType__Group__4__Impl rule__DecimalValueType__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__DecimalValueType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DecimalValueType__Group__5();

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
    // $ANTLR end "rule__DecimalValueType__Group__4"


    // $ANTLR start "rule__DecimalValueType__Group__4__Impl"
    // InternalQL.g:5244:1: rule__DecimalValueType__Group__4__Impl : ( ( rule__DecimalValueType__Group_4__0 )? ) ;
    public final void rule__DecimalValueType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5248:1: ( ( ( rule__DecimalValueType__Group_4__0 )? ) )
            // InternalQL.g:5249:1: ( ( rule__DecimalValueType__Group_4__0 )? )
            {
            // InternalQL.g:5249:1: ( ( rule__DecimalValueType__Group_4__0 )? )
            // InternalQL.g:5250:2: ( rule__DecimalValueType__Group_4__0 )?
            {
             before(grammarAccess.getDecimalValueTypeAccess().getGroup_4()); 
            // InternalQL.g:5251:2: ( rule__DecimalValueType__Group_4__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==47) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalQL.g:5251:3: rule__DecimalValueType__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DecimalValueType__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDecimalValueTypeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueType__Group__4__Impl"


    // $ANTLR start "rule__DecimalValueType__Group__5"
    // InternalQL.g:5259:1: rule__DecimalValueType__Group__5 : rule__DecimalValueType__Group__5__Impl ;
    public final void rule__DecimalValueType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5263:1: ( rule__DecimalValueType__Group__5__Impl )
            // InternalQL.g:5264:2: rule__DecimalValueType__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DecimalValueType__Group__5__Impl();

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
    // $ANTLR end "rule__DecimalValueType__Group__5"


    // $ANTLR start "rule__DecimalValueType__Group__5__Impl"
    // InternalQL.g:5270:1: rule__DecimalValueType__Group__5__Impl : ( '}' ) ;
    public final void rule__DecimalValueType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5274:1: ( ( '}' ) )
            // InternalQL.g:5275:1: ( '}' )
            {
            // InternalQL.g:5275:1: ( '}' )
            // InternalQL.g:5276:2: '}'
            {
             before(grammarAccess.getDecimalValueTypeAccess().getRightCurlyBracketKeyword_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDecimalValueTypeAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueType__Group__5__Impl"


    // $ANTLR start "rule__DecimalValueType__Group_4__0"
    // InternalQL.g:5286:1: rule__DecimalValueType__Group_4__0 : rule__DecimalValueType__Group_4__0__Impl rule__DecimalValueType__Group_4__1 ;
    public final void rule__DecimalValueType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5290:1: ( rule__DecimalValueType__Group_4__0__Impl rule__DecimalValueType__Group_4__1 )
            // InternalQL.g:5291:2: rule__DecimalValueType__Group_4__0__Impl rule__DecimalValueType__Group_4__1
            {
            pushFollow(FOLLOW_11);
            rule__DecimalValueType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DecimalValueType__Group_4__1();

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
    // $ANTLR end "rule__DecimalValueType__Group_4__0"


    // $ANTLR start "rule__DecimalValueType__Group_4__0__Impl"
    // InternalQL.g:5298:1: rule__DecimalValueType__Group_4__0__Impl : ( 'unit' ) ;
    public final void rule__DecimalValueType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5302:1: ( ( 'unit' ) )
            // InternalQL.g:5303:1: ( 'unit' )
            {
            // InternalQL.g:5303:1: ( 'unit' )
            // InternalQL.g:5304:2: 'unit'
            {
             before(grammarAccess.getDecimalValueTypeAccess().getUnitKeyword_4_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getDecimalValueTypeAccess().getUnitKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueType__Group_4__0__Impl"


    // $ANTLR start "rule__DecimalValueType__Group_4__1"
    // InternalQL.g:5313:1: rule__DecimalValueType__Group_4__1 : rule__DecimalValueType__Group_4__1__Impl ;
    public final void rule__DecimalValueType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5317:1: ( rule__DecimalValueType__Group_4__1__Impl )
            // InternalQL.g:5318:2: rule__DecimalValueType__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DecimalValueType__Group_4__1__Impl();

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
    // $ANTLR end "rule__DecimalValueType__Group_4__1"


    // $ANTLR start "rule__DecimalValueType__Group_4__1__Impl"
    // InternalQL.g:5324:1: rule__DecimalValueType__Group_4__1__Impl : ( ( rule__DecimalValueType__UnitAssignment_4_1 ) ) ;
    public final void rule__DecimalValueType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5328:1: ( ( ( rule__DecimalValueType__UnitAssignment_4_1 ) ) )
            // InternalQL.g:5329:1: ( ( rule__DecimalValueType__UnitAssignment_4_1 ) )
            {
            // InternalQL.g:5329:1: ( ( rule__DecimalValueType__UnitAssignment_4_1 ) )
            // InternalQL.g:5330:2: ( rule__DecimalValueType__UnitAssignment_4_1 )
            {
             before(grammarAccess.getDecimalValueTypeAccess().getUnitAssignment_4_1()); 
            // InternalQL.g:5331:2: ( rule__DecimalValueType__UnitAssignment_4_1 )
            // InternalQL.g:5331:3: rule__DecimalValueType__UnitAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__DecimalValueType__UnitAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getDecimalValueTypeAccess().getUnitAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueType__Group_4__1__Impl"


    // $ANTLR start "rule__DateValueType__Group__0"
    // InternalQL.g:5340:1: rule__DateValueType__Group__0 : rule__DateValueType__Group__0__Impl rule__DateValueType__Group__1 ;
    public final void rule__DateValueType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5344:1: ( rule__DateValueType__Group__0__Impl rule__DateValueType__Group__1 )
            // InternalQL.g:5345:2: rule__DateValueType__Group__0__Impl rule__DateValueType__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalQL.g:5352:1: rule__DateValueType__Group__0__Impl : ( () ) ;
    public final void rule__DateValueType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5356:1: ( ( () ) )
            // InternalQL.g:5357:1: ( () )
            {
            // InternalQL.g:5357:1: ( () )
            // InternalQL.g:5358:2: ()
            {
             before(grammarAccess.getDateValueTypeAccess().getDateValueTypeAction_0()); 
            // InternalQL.g:5359:2: ()
            // InternalQL.g:5359:3: 
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
    // InternalQL.g:5367:1: rule__DateValueType__Group__1 : rule__DateValueType__Group__1__Impl rule__DateValueType__Group__2 ;
    public final void rule__DateValueType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5371:1: ( rule__DateValueType__Group__1__Impl rule__DateValueType__Group__2 )
            // InternalQL.g:5372:2: rule__DateValueType__Group__1__Impl rule__DateValueType__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalQL.g:5379:1: rule__DateValueType__Group__1__Impl : ( 'DateValueType' ) ;
    public final void rule__DateValueType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5383:1: ( ( 'DateValueType' ) )
            // InternalQL.g:5384:1: ( 'DateValueType' )
            {
            // InternalQL.g:5384:1: ( 'DateValueType' )
            // InternalQL.g:5385:2: 'DateValueType'
            {
             before(grammarAccess.getDateValueTypeAccess().getDateValueTypeKeyword_1()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getDateValueTypeAccess().getDateValueTypeKeyword_1()); 

            }


            }

        }
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
    // InternalQL.g:5394:1: rule__DateValueType__Group__2 : rule__DateValueType__Group__2__Impl rule__DateValueType__Group__3 ;
    public final void rule__DateValueType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5398:1: ( rule__DateValueType__Group__2__Impl rule__DateValueType__Group__3 )
            // InternalQL.g:5399:2: rule__DateValueType__Group__2__Impl rule__DateValueType__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalQL.g:5406:1: rule__DateValueType__Group__2__Impl : ( ( rule__DateValueType__NameAssignment_2 ) ) ;
    public final void rule__DateValueType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5410:1: ( ( ( rule__DateValueType__NameAssignment_2 ) ) )
            // InternalQL.g:5411:1: ( ( rule__DateValueType__NameAssignment_2 ) )
            {
            // InternalQL.g:5411:1: ( ( rule__DateValueType__NameAssignment_2 ) )
            // InternalQL.g:5412:2: ( rule__DateValueType__NameAssignment_2 )
            {
             before(grammarAccess.getDateValueTypeAccess().getNameAssignment_2()); 
            // InternalQL.g:5413:2: ( rule__DateValueType__NameAssignment_2 )
            // InternalQL.g:5413:3: rule__DateValueType__NameAssignment_2
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
    // InternalQL.g:5421:1: rule__DateValueType__Group__3 : rule__DateValueType__Group__3__Impl rule__DateValueType__Group__4 ;
    public final void rule__DateValueType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5425:1: ( rule__DateValueType__Group__3__Impl rule__DateValueType__Group__4 )
            // InternalQL.g:5426:2: rule__DateValueType__Group__3__Impl rule__DateValueType__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__DateValueType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DateValueType__Group__4();

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
    // InternalQL.g:5433:1: rule__DateValueType__Group__3__Impl : ( '{' ) ;
    public final void rule__DateValueType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5437:1: ( ( '{' ) )
            // InternalQL.g:5438:1: ( '{' )
            {
            // InternalQL.g:5438:1: ( '{' )
            // InternalQL.g:5439:2: '{'
            {
             before(grammarAccess.getDateValueTypeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDateValueTypeAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__DateValueType__Group__4"
    // InternalQL.g:5448:1: rule__DateValueType__Group__4 : rule__DateValueType__Group__4__Impl rule__DateValueType__Group__5 ;
    public final void rule__DateValueType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5452:1: ( rule__DateValueType__Group__4__Impl rule__DateValueType__Group__5 )
            // InternalQL.g:5453:2: rule__DateValueType__Group__4__Impl rule__DateValueType__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__DateValueType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DateValueType__Group__5();

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
    // $ANTLR end "rule__DateValueType__Group__4"


    // $ANTLR start "rule__DateValueType__Group__4__Impl"
    // InternalQL.g:5460:1: rule__DateValueType__Group__4__Impl : ( ( rule__DateValueType__Group_4__0 )? ) ;
    public final void rule__DateValueType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5464:1: ( ( ( rule__DateValueType__Group_4__0 )? ) )
            // InternalQL.g:5465:1: ( ( rule__DateValueType__Group_4__0 )? )
            {
            // InternalQL.g:5465:1: ( ( rule__DateValueType__Group_4__0 )? )
            // InternalQL.g:5466:2: ( rule__DateValueType__Group_4__0 )?
            {
             before(grammarAccess.getDateValueTypeAccess().getGroup_4()); 
            // InternalQL.g:5467:2: ( rule__DateValueType__Group_4__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==47) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalQL.g:5467:3: rule__DateValueType__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DateValueType__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDateValueTypeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValueType__Group__4__Impl"


    // $ANTLR start "rule__DateValueType__Group__5"
    // InternalQL.g:5475:1: rule__DateValueType__Group__5 : rule__DateValueType__Group__5__Impl ;
    public final void rule__DateValueType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5479:1: ( rule__DateValueType__Group__5__Impl )
            // InternalQL.g:5480:2: rule__DateValueType__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DateValueType__Group__5__Impl();

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
    // $ANTLR end "rule__DateValueType__Group__5"


    // $ANTLR start "rule__DateValueType__Group__5__Impl"
    // InternalQL.g:5486:1: rule__DateValueType__Group__5__Impl : ( '}' ) ;
    public final void rule__DateValueType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5490:1: ( ( '}' ) )
            // InternalQL.g:5491:1: ( '}' )
            {
            // InternalQL.g:5491:1: ( '}' )
            // InternalQL.g:5492:2: '}'
            {
             before(grammarAccess.getDateValueTypeAccess().getRightCurlyBracketKeyword_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDateValueTypeAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValueType__Group__5__Impl"


    // $ANTLR start "rule__DateValueType__Group_4__0"
    // InternalQL.g:5502:1: rule__DateValueType__Group_4__0 : rule__DateValueType__Group_4__0__Impl rule__DateValueType__Group_4__1 ;
    public final void rule__DateValueType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5506:1: ( rule__DateValueType__Group_4__0__Impl rule__DateValueType__Group_4__1 )
            // InternalQL.g:5507:2: rule__DateValueType__Group_4__0__Impl rule__DateValueType__Group_4__1
            {
            pushFollow(FOLLOW_11);
            rule__DateValueType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DateValueType__Group_4__1();

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
    // $ANTLR end "rule__DateValueType__Group_4__0"


    // $ANTLR start "rule__DateValueType__Group_4__0__Impl"
    // InternalQL.g:5514:1: rule__DateValueType__Group_4__0__Impl : ( 'unit' ) ;
    public final void rule__DateValueType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5518:1: ( ( 'unit' ) )
            // InternalQL.g:5519:1: ( 'unit' )
            {
            // InternalQL.g:5519:1: ( 'unit' )
            // InternalQL.g:5520:2: 'unit'
            {
             before(grammarAccess.getDateValueTypeAccess().getUnitKeyword_4_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getDateValueTypeAccess().getUnitKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValueType__Group_4__0__Impl"


    // $ANTLR start "rule__DateValueType__Group_4__1"
    // InternalQL.g:5529:1: rule__DateValueType__Group_4__1 : rule__DateValueType__Group_4__1__Impl ;
    public final void rule__DateValueType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5533:1: ( rule__DateValueType__Group_4__1__Impl )
            // InternalQL.g:5534:2: rule__DateValueType__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DateValueType__Group_4__1__Impl();

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
    // $ANTLR end "rule__DateValueType__Group_4__1"


    // $ANTLR start "rule__DateValueType__Group_4__1__Impl"
    // InternalQL.g:5540:1: rule__DateValueType__Group_4__1__Impl : ( ( rule__DateValueType__UnitAssignment_4_1 ) ) ;
    public final void rule__DateValueType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5544:1: ( ( ( rule__DateValueType__UnitAssignment_4_1 ) ) )
            // InternalQL.g:5545:1: ( ( rule__DateValueType__UnitAssignment_4_1 ) )
            {
            // InternalQL.g:5545:1: ( ( rule__DateValueType__UnitAssignment_4_1 ) )
            // InternalQL.g:5546:2: ( rule__DateValueType__UnitAssignment_4_1 )
            {
             before(grammarAccess.getDateValueTypeAccess().getUnitAssignment_4_1()); 
            // InternalQL.g:5547:2: ( rule__DateValueType__UnitAssignment_4_1 )
            // InternalQL.g:5547:3: rule__DateValueType__UnitAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__DateValueType__UnitAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getDateValueTypeAccess().getUnitAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValueType__Group_4__1__Impl"


    // $ANTLR start "rule__EnumerationValueType__Group__0"
    // InternalQL.g:5556:1: rule__EnumerationValueType__Group__0 : rule__EnumerationValueType__Group__0__Impl rule__EnumerationValueType__Group__1 ;
    public final void rule__EnumerationValueType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5560:1: ( rule__EnumerationValueType__Group__0__Impl rule__EnumerationValueType__Group__1 )
            // InternalQL.g:5561:2: rule__EnumerationValueType__Group__0__Impl rule__EnumerationValueType__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalQL.g:5568:1: rule__EnumerationValueType__Group__0__Impl : ( () ) ;
    public final void rule__EnumerationValueType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5572:1: ( ( () ) )
            // InternalQL.g:5573:1: ( () )
            {
            // InternalQL.g:5573:1: ( () )
            // InternalQL.g:5574:2: ()
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getEnumerationValueTypeAction_0()); 
            // InternalQL.g:5575:2: ()
            // InternalQL.g:5575:3: 
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
    // InternalQL.g:5583:1: rule__EnumerationValueType__Group__1 : rule__EnumerationValueType__Group__1__Impl rule__EnumerationValueType__Group__2 ;
    public final void rule__EnumerationValueType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5587:1: ( rule__EnumerationValueType__Group__1__Impl rule__EnumerationValueType__Group__2 )
            // InternalQL.g:5588:2: rule__EnumerationValueType__Group__1__Impl rule__EnumerationValueType__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalQL.g:5595:1: rule__EnumerationValueType__Group__1__Impl : ( 'EnumerationValueType' ) ;
    public final void rule__EnumerationValueType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5599:1: ( ( 'EnumerationValueType' ) )
            // InternalQL.g:5600:1: ( 'EnumerationValueType' )
            {
            // InternalQL.g:5600:1: ( 'EnumerationValueType' )
            // InternalQL.g:5601:2: 'EnumerationValueType'
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getEnumerationValueTypeKeyword_1()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getEnumerationValueTypeAccess().getEnumerationValueTypeKeyword_1()); 

            }


            }

        }
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
    // InternalQL.g:5610:1: rule__EnumerationValueType__Group__2 : rule__EnumerationValueType__Group__2__Impl rule__EnumerationValueType__Group__3 ;
    public final void rule__EnumerationValueType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5614:1: ( rule__EnumerationValueType__Group__2__Impl rule__EnumerationValueType__Group__3 )
            // InternalQL.g:5615:2: rule__EnumerationValueType__Group__2__Impl rule__EnumerationValueType__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalQL.g:5622:1: rule__EnumerationValueType__Group__2__Impl : ( ( rule__EnumerationValueType__NameAssignment_2 ) ) ;
    public final void rule__EnumerationValueType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5626:1: ( ( ( rule__EnumerationValueType__NameAssignment_2 ) ) )
            // InternalQL.g:5627:1: ( ( rule__EnumerationValueType__NameAssignment_2 ) )
            {
            // InternalQL.g:5627:1: ( ( rule__EnumerationValueType__NameAssignment_2 ) )
            // InternalQL.g:5628:2: ( rule__EnumerationValueType__NameAssignment_2 )
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getNameAssignment_2()); 
            // InternalQL.g:5629:2: ( rule__EnumerationValueType__NameAssignment_2 )
            // InternalQL.g:5629:3: rule__EnumerationValueType__NameAssignment_2
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
    // InternalQL.g:5637:1: rule__EnumerationValueType__Group__3 : rule__EnumerationValueType__Group__3__Impl rule__EnumerationValueType__Group__4 ;
    public final void rule__EnumerationValueType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5641:1: ( rule__EnumerationValueType__Group__3__Impl rule__EnumerationValueType__Group__4 )
            // InternalQL.g:5642:2: rule__EnumerationValueType__Group__3__Impl rule__EnumerationValueType__Group__4
            {
            pushFollow(FOLLOW_41);
            rule__EnumerationValueType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group__4();

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
    // InternalQL.g:5649:1: rule__EnumerationValueType__Group__3__Impl : ( '{' ) ;
    public final void rule__EnumerationValueType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5653:1: ( ( '{' ) )
            // InternalQL.g:5654:1: ( '{' )
            {
            // InternalQL.g:5654:1: ( '{' )
            // InternalQL.g:5655:2: '{'
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getEnumerationValueTypeAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__EnumerationValueType__Group__4"
    // InternalQL.g:5664:1: rule__EnumerationValueType__Group__4 : rule__EnumerationValueType__Group__4__Impl rule__EnumerationValueType__Group__5 ;
    public final void rule__EnumerationValueType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5668:1: ( rule__EnumerationValueType__Group__4__Impl rule__EnumerationValueType__Group__5 )
            // InternalQL.g:5669:2: rule__EnumerationValueType__Group__4__Impl rule__EnumerationValueType__Group__5
            {
            pushFollow(FOLLOW_41);
            rule__EnumerationValueType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group__5();

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
    // $ANTLR end "rule__EnumerationValueType__Group__4"


    // $ANTLR start "rule__EnumerationValueType__Group__4__Impl"
    // InternalQL.g:5676:1: rule__EnumerationValueType__Group__4__Impl : ( ( rule__EnumerationValueType__Group_4__0 )? ) ;
    public final void rule__EnumerationValueType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5680:1: ( ( ( rule__EnumerationValueType__Group_4__0 )? ) )
            // InternalQL.g:5681:1: ( ( rule__EnumerationValueType__Group_4__0 )? )
            {
            // InternalQL.g:5681:1: ( ( rule__EnumerationValueType__Group_4__0 )? )
            // InternalQL.g:5682:2: ( rule__EnumerationValueType__Group_4__0 )?
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getGroup_4()); 
            // InternalQL.g:5683:2: ( rule__EnumerationValueType__Group_4__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==47) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalQL.g:5683:3: rule__EnumerationValueType__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumerationValueType__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumerationValueTypeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group__4__Impl"


    // $ANTLR start "rule__EnumerationValueType__Group__5"
    // InternalQL.g:5691:1: rule__EnumerationValueType__Group__5 : rule__EnumerationValueType__Group__5__Impl rule__EnumerationValueType__Group__6 ;
    public final void rule__EnumerationValueType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5695:1: ( rule__EnumerationValueType__Group__5__Impl rule__EnumerationValueType__Group__6 )
            // InternalQL.g:5696:2: rule__EnumerationValueType__Group__5__Impl rule__EnumerationValueType__Group__6
            {
            pushFollow(FOLLOW_41);
            rule__EnumerationValueType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group__6();

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
    // $ANTLR end "rule__EnumerationValueType__Group__5"


    // $ANTLR start "rule__EnumerationValueType__Group__5__Impl"
    // InternalQL.g:5703:1: rule__EnumerationValueType__Group__5__Impl : ( ( rule__EnumerationValueType__Group_5__0 )? ) ;
    public final void rule__EnumerationValueType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5707:1: ( ( ( rule__EnumerationValueType__Group_5__0 )? ) )
            // InternalQL.g:5708:1: ( ( rule__EnumerationValueType__Group_5__0 )? )
            {
            // InternalQL.g:5708:1: ( ( rule__EnumerationValueType__Group_5__0 )? )
            // InternalQL.g:5709:2: ( rule__EnumerationValueType__Group_5__0 )?
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getGroup_5()); 
            // InternalQL.g:5710:2: ( rule__EnumerationValueType__Group_5__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==66) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalQL.g:5710:3: rule__EnumerationValueType__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumerationValueType__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumerationValueTypeAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group__5__Impl"


    // $ANTLR start "rule__EnumerationValueType__Group__6"
    // InternalQL.g:5718:1: rule__EnumerationValueType__Group__6 : rule__EnumerationValueType__Group__6__Impl ;
    public final void rule__EnumerationValueType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5722:1: ( rule__EnumerationValueType__Group__6__Impl )
            // InternalQL.g:5723:2: rule__EnumerationValueType__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group__6__Impl();

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
    // $ANTLR end "rule__EnumerationValueType__Group__6"


    // $ANTLR start "rule__EnumerationValueType__Group__6__Impl"
    // InternalQL.g:5729:1: rule__EnumerationValueType__Group__6__Impl : ( '}' ) ;
    public final void rule__EnumerationValueType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5733:1: ( ( '}' ) )
            // InternalQL.g:5734:1: ( '}' )
            {
            // InternalQL.g:5734:1: ( '}' )
            // InternalQL.g:5735:2: '}'
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getEnumerationValueTypeAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group__6__Impl"


    // $ANTLR start "rule__EnumerationValueType__Group_4__0"
    // InternalQL.g:5745:1: rule__EnumerationValueType__Group_4__0 : rule__EnumerationValueType__Group_4__0__Impl rule__EnumerationValueType__Group_4__1 ;
    public final void rule__EnumerationValueType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5749:1: ( rule__EnumerationValueType__Group_4__0__Impl rule__EnumerationValueType__Group_4__1 )
            // InternalQL.g:5750:2: rule__EnumerationValueType__Group_4__0__Impl rule__EnumerationValueType__Group_4__1
            {
            pushFollow(FOLLOW_11);
            rule__EnumerationValueType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group_4__1();

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
    // $ANTLR end "rule__EnumerationValueType__Group_4__0"


    // $ANTLR start "rule__EnumerationValueType__Group_4__0__Impl"
    // InternalQL.g:5757:1: rule__EnumerationValueType__Group_4__0__Impl : ( 'unit' ) ;
    public final void rule__EnumerationValueType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5761:1: ( ( 'unit' ) )
            // InternalQL.g:5762:1: ( 'unit' )
            {
            // InternalQL.g:5762:1: ( 'unit' )
            // InternalQL.g:5763:2: 'unit'
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getUnitKeyword_4_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getEnumerationValueTypeAccess().getUnitKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_4__0__Impl"


    // $ANTLR start "rule__EnumerationValueType__Group_4__1"
    // InternalQL.g:5772:1: rule__EnumerationValueType__Group_4__1 : rule__EnumerationValueType__Group_4__1__Impl ;
    public final void rule__EnumerationValueType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5776:1: ( rule__EnumerationValueType__Group_4__1__Impl )
            // InternalQL.g:5777:2: rule__EnumerationValueType__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group_4__1__Impl();

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
    // $ANTLR end "rule__EnumerationValueType__Group_4__1"


    // $ANTLR start "rule__EnumerationValueType__Group_4__1__Impl"
    // InternalQL.g:5783:1: rule__EnumerationValueType__Group_4__1__Impl : ( ( rule__EnumerationValueType__UnitAssignment_4_1 ) ) ;
    public final void rule__EnumerationValueType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5787:1: ( ( ( rule__EnumerationValueType__UnitAssignment_4_1 ) ) )
            // InternalQL.g:5788:1: ( ( rule__EnumerationValueType__UnitAssignment_4_1 ) )
            {
            // InternalQL.g:5788:1: ( ( rule__EnumerationValueType__UnitAssignment_4_1 ) )
            // InternalQL.g:5789:2: ( rule__EnumerationValueType__UnitAssignment_4_1 )
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getUnitAssignment_4_1()); 
            // InternalQL.g:5790:2: ( rule__EnumerationValueType__UnitAssignment_4_1 )
            // InternalQL.g:5790:3: rule__EnumerationValueType__UnitAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__UnitAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationValueTypeAccess().getUnitAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_4__1__Impl"


    // $ANTLR start "rule__EnumerationValueType__Group_5__0"
    // InternalQL.g:5799:1: rule__EnumerationValueType__Group_5__0 : rule__EnumerationValueType__Group_5__0__Impl rule__EnumerationValueType__Group_5__1 ;
    public final void rule__EnumerationValueType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5803:1: ( rule__EnumerationValueType__Group_5__0__Impl rule__EnumerationValueType__Group_5__1 )
            // InternalQL.g:5804:2: rule__EnumerationValueType__Group_5__0__Impl rule__EnumerationValueType__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__EnumerationValueType__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group_5__1();

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
    // $ANTLR end "rule__EnumerationValueType__Group_5__0"


    // $ANTLR start "rule__EnumerationValueType__Group_5__0__Impl"
    // InternalQL.g:5811:1: rule__EnumerationValueType__Group_5__0__Impl : ( 'enumerationLiterals' ) ;
    public final void rule__EnumerationValueType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5815:1: ( ( 'enumerationLiterals' ) )
            // InternalQL.g:5816:1: ( 'enumerationLiterals' )
            {
            // InternalQL.g:5816:1: ( 'enumerationLiterals' )
            // InternalQL.g:5817:2: 'enumerationLiterals'
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getEnumerationLiteralsKeyword_5_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getEnumerationValueTypeAccess().getEnumerationLiteralsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_5__0__Impl"


    // $ANTLR start "rule__EnumerationValueType__Group_5__1"
    // InternalQL.g:5826:1: rule__EnumerationValueType__Group_5__1 : rule__EnumerationValueType__Group_5__1__Impl rule__EnumerationValueType__Group_5__2 ;
    public final void rule__EnumerationValueType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5830:1: ( rule__EnumerationValueType__Group_5__1__Impl rule__EnumerationValueType__Group_5__2 )
            // InternalQL.g:5831:2: rule__EnumerationValueType__Group_5__1__Impl rule__EnumerationValueType__Group_5__2
            {
            pushFollow(FOLLOW_42);
            rule__EnumerationValueType__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group_5__2();

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
    // $ANTLR end "rule__EnumerationValueType__Group_5__1"


    // $ANTLR start "rule__EnumerationValueType__Group_5__1__Impl"
    // InternalQL.g:5838:1: rule__EnumerationValueType__Group_5__1__Impl : ( '{' ) ;
    public final void rule__EnumerationValueType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5842:1: ( ( '{' ) )
            // InternalQL.g:5843:1: ( '{' )
            {
            // InternalQL.g:5843:1: ( '{' )
            // InternalQL.g:5844:2: '{'
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getEnumerationValueTypeAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_5__1__Impl"


    // $ANTLR start "rule__EnumerationValueType__Group_5__2"
    // InternalQL.g:5853:1: rule__EnumerationValueType__Group_5__2 : rule__EnumerationValueType__Group_5__2__Impl rule__EnumerationValueType__Group_5__3 ;
    public final void rule__EnumerationValueType__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5857:1: ( rule__EnumerationValueType__Group_5__2__Impl rule__EnumerationValueType__Group_5__3 )
            // InternalQL.g:5858:2: rule__EnumerationValueType__Group_5__2__Impl rule__EnumerationValueType__Group_5__3
            {
            pushFollow(FOLLOW_8);
            rule__EnumerationValueType__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group_5__3();

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
    // $ANTLR end "rule__EnumerationValueType__Group_5__2"


    // $ANTLR start "rule__EnumerationValueType__Group_5__2__Impl"
    // InternalQL.g:5865:1: rule__EnumerationValueType__Group_5__2__Impl : ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_5_2 ) ) ;
    public final void rule__EnumerationValueType__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5869:1: ( ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_5_2 ) ) )
            // InternalQL.g:5870:1: ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_5_2 ) )
            {
            // InternalQL.g:5870:1: ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_5_2 ) )
            // InternalQL.g:5871:2: ( rule__EnumerationValueType__EnumerationLiteralsAssignment_5_2 )
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getEnumerationLiteralsAssignment_5_2()); 
            // InternalQL.g:5872:2: ( rule__EnumerationValueType__EnumerationLiteralsAssignment_5_2 )
            // InternalQL.g:5872:3: rule__EnumerationValueType__EnumerationLiteralsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__EnumerationLiteralsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationValueTypeAccess().getEnumerationLiteralsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_5__2__Impl"


    // $ANTLR start "rule__EnumerationValueType__Group_5__3"
    // InternalQL.g:5880:1: rule__EnumerationValueType__Group_5__3 : rule__EnumerationValueType__Group_5__3__Impl rule__EnumerationValueType__Group_5__4 ;
    public final void rule__EnumerationValueType__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5884:1: ( rule__EnumerationValueType__Group_5__3__Impl rule__EnumerationValueType__Group_5__4 )
            // InternalQL.g:5885:2: rule__EnumerationValueType__Group_5__3__Impl rule__EnumerationValueType__Group_5__4
            {
            pushFollow(FOLLOW_8);
            rule__EnumerationValueType__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group_5__4();

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
    // $ANTLR end "rule__EnumerationValueType__Group_5__3"


    // $ANTLR start "rule__EnumerationValueType__Group_5__3__Impl"
    // InternalQL.g:5892:1: rule__EnumerationValueType__Group_5__3__Impl : ( ( rule__EnumerationValueType__Group_5_3__0 )* ) ;
    public final void rule__EnumerationValueType__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5896:1: ( ( ( rule__EnumerationValueType__Group_5_3__0 )* ) )
            // InternalQL.g:5897:1: ( ( rule__EnumerationValueType__Group_5_3__0 )* )
            {
            // InternalQL.g:5897:1: ( ( rule__EnumerationValueType__Group_5_3__0 )* )
            // InternalQL.g:5898:2: ( rule__EnumerationValueType__Group_5_3__0 )*
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getGroup_5_3()); 
            // InternalQL.g:5899:2: ( rule__EnumerationValueType__Group_5_3__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==33) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalQL.g:5899:3: rule__EnumerationValueType__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__EnumerationValueType__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getEnumerationValueTypeAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_5__3__Impl"


    // $ANTLR start "rule__EnumerationValueType__Group_5__4"
    // InternalQL.g:5907:1: rule__EnumerationValueType__Group_5__4 : rule__EnumerationValueType__Group_5__4__Impl ;
    public final void rule__EnumerationValueType__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5911:1: ( rule__EnumerationValueType__Group_5__4__Impl )
            // InternalQL.g:5912:2: rule__EnumerationValueType__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group_5__4__Impl();

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
    // $ANTLR end "rule__EnumerationValueType__Group_5__4"


    // $ANTLR start "rule__EnumerationValueType__Group_5__4__Impl"
    // InternalQL.g:5918:1: rule__EnumerationValueType__Group_5__4__Impl : ( '}' ) ;
    public final void rule__EnumerationValueType__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5922:1: ( ( '}' ) )
            // InternalQL.g:5923:1: ( '}' )
            {
            // InternalQL.g:5923:1: ( '}' )
            // InternalQL.g:5924:2: '}'
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getEnumerationValueTypeAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_5__4__Impl"


    // $ANTLR start "rule__EnumerationValueType__Group_5_3__0"
    // InternalQL.g:5934:1: rule__EnumerationValueType__Group_5_3__0 : rule__EnumerationValueType__Group_5_3__0__Impl rule__EnumerationValueType__Group_5_3__1 ;
    public final void rule__EnumerationValueType__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5938:1: ( rule__EnumerationValueType__Group_5_3__0__Impl rule__EnumerationValueType__Group_5_3__1 )
            // InternalQL.g:5939:2: rule__EnumerationValueType__Group_5_3__0__Impl rule__EnumerationValueType__Group_5_3__1
            {
            pushFollow(FOLLOW_42);
            rule__EnumerationValueType__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group_5_3__1();

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
    // $ANTLR end "rule__EnumerationValueType__Group_5_3__0"


    // $ANTLR start "rule__EnumerationValueType__Group_5_3__0__Impl"
    // InternalQL.g:5946:1: rule__EnumerationValueType__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__EnumerationValueType__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5950:1: ( ( ',' ) )
            // InternalQL.g:5951:1: ( ',' )
            {
            // InternalQL.g:5951:1: ( ',' )
            // InternalQL.g:5952:2: ','
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getCommaKeyword_5_3_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getEnumerationValueTypeAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_5_3__0__Impl"


    // $ANTLR start "rule__EnumerationValueType__Group_5_3__1"
    // InternalQL.g:5961:1: rule__EnumerationValueType__Group_5_3__1 : rule__EnumerationValueType__Group_5_3__1__Impl ;
    public final void rule__EnumerationValueType__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5965:1: ( rule__EnumerationValueType__Group_5_3__1__Impl )
            // InternalQL.g:5966:2: rule__EnumerationValueType__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__EnumerationValueType__Group_5_3__1"


    // $ANTLR start "rule__EnumerationValueType__Group_5_3__1__Impl"
    // InternalQL.g:5972:1: rule__EnumerationValueType__Group_5_3__1__Impl : ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_5_3_1 ) ) ;
    public final void rule__EnumerationValueType__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5976:1: ( ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_5_3_1 ) ) )
            // InternalQL.g:5977:1: ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_5_3_1 ) )
            {
            // InternalQL.g:5977:1: ( ( rule__EnumerationValueType__EnumerationLiteralsAssignment_5_3_1 ) )
            // InternalQL.g:5978:2: ( rule__EnumerationValueType__EnumerationLiteralsAssignment_5_3_1 )
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getEnumerationLiteralsAssignment_5_3_1()); 
            // InternalQL.g:5979:2: ( rule__EnumerationValueType__EnumerationLiteralsAssignment_5_3_1 )
            // InternalQL.g:5979:3: rule__EnumerationValueType__EnumerationLiteralsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationValueType__EnumerationLiteralsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationValueTypeAccess().getEnumerationLiteralsAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__Group_5_3__1__Impl"


    // $ANTLR start "rule__StringValueType__Group__0"
    // InternalQL.g:5988:1: rule__StringValueType__Group__0 : rule__StringValueType__Group__0__Impl rule__StringValueType__Group__1 ;
    public final void rule__StringValueType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:5992:1: ( rule__StringValueType__Group__0__Impl rule__StringValueType__Group__1 )
            // InternalQL.g:5993:2: rule__StringValueType__Group__0__Impl rule__StringValueType__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalQL.g:6000:1: rule__StringValueType__Group__0__Impl : ( () ) ;
    public final void rule__StringValueType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6004:1: ( ( () ) )
            // InternalQL.g:6005:1: ( () )
            {
            // InternalQL.g:6005:1: ( () )
            // InternalQL.g:6006:2: ()
            {
             before(grammarAccess.getStringValueTypeAccess().getStringValueTypeAction_0()); 
            // InternalQL.g:6007:2: ()
            // InternalQL.g:6007:3: 
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
    // InternalQL.g:6015:1: rule__StringValueType__Group__1 : rule__StringValueType__Group__1__Impl rule__StringValueType__Group__2 ;
    public final void rule__StringValueType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6019:1: ( rule__StringValueType__Group__1__Impl rule__StringValueType__Group__2 )
            // InternalQL.g:6020:2: rule__StringValueType__Group__1__Impl rule__StringValueType__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalQL.g:6027:1: rule__StringValueType__Group__1__Impl : ( 'StringValueType' ) ;
    public final void rule__StringValueType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6031:1: ( ( 'StringValueType' ) )
            // InternalQL.g:6032:1: ( 'StringValueType' )
            {
            // InternalQL.g:6032:1: ( 'StringValueType' )
            // InternalQL.g:6033:2: 'StringValueType'
            {
             before(grammarAccess.getStringValueTypeAccess().getStringValueTypeKeyword_1()); 
            match(input,67,FOLLOW_2); 
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
    // InternalQL.g:6042:1: rule__StringValueType__Group__2 : rule__StringValueType__Group__2__Impl rule__StringValueType__Group__3 ;
    public final void rule__StringValueType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6046:1: ( rule__StringValueType__Group__2__Impl rule__StringValueType__Group__3 )
            // InternalQL.g:6047:2: rule__StringValueType__Group__2__Impl rule__StringValueType__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalQL.g:6054:1: rule__StringValueType__Group__2__Impl : ( ( rule__StringValueType__NameAssignment_2 ) ) ;
    public final void rule__StringValueType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6058:1: ( ( ( rule__StringValueType__NameAssignment_2 ) ) )
            // InternalQL.g:6059:1: ( ( rule__StringValueType__NameAssignment_2 ) )
            {
            // InternalQL.g:6059:1: ( ( rule__StringValueType__NameAssignment_2 ) )
            // InternalQL.g:6060:2: ( rule__StringValueType__NameAssignment_2 )
            {
             before(grammarAccess.getStringValueTypeAccess().getNameAssignment_2()); 
            // InternalQL.g:6061:2: ( rule__StringValueType__NameAssignment_2 )
            // InternalQL.g:6061:3: rule__StringValueType__NameAssignment_2
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
    // InternalQL.g:6069:1: rule__StringValueType__Group__3 : rule__StringValueType__Group__3__Impl rule__StringValueType__Group__4 ;
    public final void rule__StringValueType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6073:1: ( rule__StringValueType__Group__3__Impl rule__StringValueType__Group__4 )
            // InternalQL.g:6074:2: rule__StringValueType__Group__3__Impl rule__StringValueType__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__StringValueType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringValueType__Group__4();

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
    // InternalQL.g:6081:1: rule__StringValueType__Group__3__Impl : ( '{' ) ;
    public final void rule__StringValueType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6085:1: ( ( '{' ) )
            // InternalQL.g:6086:1: ( '{' )
            {
            // InternalQL.g:6086:1: ( '{' )
            // InternalQL.g:6087:2: '{'
            {
             before(grammarAccess.getStringValueTypeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getStringValueTypeAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__StringValueType__Group__4"
    // InternalQL.g:6096:1: rule__StringValueType__Group__4 : rule__StringValueType__Group__4__Impl rule__StringValueType__Group__5 ;
    public final void rule__StringValueType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6100:1: ( rule__StringValueType__Group__4__Impl rule__StringValueType__Group__5 )
            // InternalQL.g:6101:2: rule__StringValueType__Group__4__Impl rule__StringValueType__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__StringValueType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringValueType__Group__5();

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
    // $ANTLR end "rule__StringValueType__Group__4"


    // $ANTLR start "rule__StringValueType__Group__4__Impl"
    // InternalQL.g:6108:1: rule__StringValueType__Group__4__Impl : ( ( rule__StringValueType__Group_4__0 )? ) ;
    public final void rule__StringValueType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6112:1: ( ( ( rule__StringValueType__Group_4__0 )? ) )
            // InternalQL.g:6113:1: ( ( rule__StringValueType__Group_4__0 )? )
            {
            // InternalQL.g:6113:1: ( ( rule__StringValueType__Group_4__0 )? )
            // InternalQL.g:6114:2: ( rule__StringValueType__Group_4__0 )?
            {
             before(grammarAccess.getStringValueTypeAccess().getGroup_4()); 
            // InternalQL.g:6115:2: ( rule__StringValueType__Group_4__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==47) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalQL.g:6115:3: rule__StringValueType__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringValueType__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringValueTypeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueType__Group__4__Impl"


    // $ANTLR start "rule__StringValueType__Group__5"
    // InternalQL.g:6123:1: rule__StringValueType__Group__5 : rule__StringValueType__Group__5__Impl ;
    public final void rule__StringValueType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6127:1: ( rule__StringValueType__Group__5__Impl )
            // InternalQL.g:6128:2: rule__StringValueType__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringValueType__Group__5__Impl();

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
    // $ANTLR end "rule__StringValueType__Group__5"


    // $ANTLR start "rule__StringValueType__Group__5__Impl"
    // InternalQL.g:6134:1: rule__StringValueType__Group__5__Impl : ( '}' ) ;
    public final void rule__StringValueType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6138:1: ( ( '}' ) )
            // InternalQL.g:6139:1: ( '}' )
            {
            // InternalQL.g:6139:1: ( '}' )
            // InternalQL.g:6140:2: '}'
            {
             before(grammarAccess.getStringValueTypeAccess().getRightCurlyBracketKeyword_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getStringValueTypeAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueType__Group__5__Impl"


    // $ANTLR start "rule__StringValueType__Group_4__0"
    // InternalQL.g:6150:1: rule__StringValueType__Group_4__0 : rule__StringValueType__Group_4__0__Impl rule__StringValueType__Group_4__1 ;
    public final void rule__StringValueType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6154:1: ( rule__StringValueType__Group_4__0__Impl rule__StringValueType__Group_4__1 )
            // InternalQL.g:6155:2: rule__StringValueType__Group_4__0__Impl rule__StringValueType__Group_4__1
            {
            pushFollow(FOLLOW_11);
            rule__StringValueType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringValueType__Group_4__1();

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
    // $ANTLR end "rule__StringValueType__Group_4__0"


    // $ANTLR start "rule__StringValueType__Group_4__0__Impl"
    // InternalQL.g:6162:1: rule__StringValueType__Group_4__0__Impl : ( 'unit' ) ;
    public final void rule__StringValueType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6166:1: ( ( 'unit' ) )
            // InternalQL.g:6167:1: ( 'unit' )
            {
            // InternalQL.g:6167:1: ( 'unit' )
            // InternalQL.g:6168:2: 'unit'
            {
             before(grammarAccess.getStringValueTypeAccess().getUnitKeyword_4_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getStringValueTypeAccess().getUnitKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueType__Group_4__0__Impl"


    // $ANTLR start "rule__StringValueType__Group_4__1"
    // InternalQL.g:6177:1: rule__StringValueType__Group_4__1 : rule__StringValueType__Group_4__1__Impl ;
    public final void rule__StringValueType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6181:1: ( rule__StringValueType__Group_4__1__Impl )
            // InternalQL.g:6182:2: rule__StringValueType__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringValueType__Group_4__1__Impl();

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
    // $ANTLR end "rule__StringValueType__Group_4__1"


    // $ANTLR start "rule__StringValueType__Group_4__1__Impl"
    // InternalQL.g:6188:1: rule__StringValueType__Group_4__1__Impl : ( ( rule__StringValueType__UnitAssignment_4_1 ) ) ;
    public final void rule__StringValueType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6192:1: ( ( ( rule__StringValueType__UnitAssignment_4_1 ) ) )
            // InternalQL.g:6193:1: ( ( rule__StringValueType__UnitAssignment_4_1 ) )
            {
            // InternalQL.g:6193:1: ( ( rule__StringValueType__UnitAssignment_4_1 ) )
            // InternalQL.g:6194:2: ( rule__StringValueType__UnitAssignment_4_1 )
            {
             before(grammarAccess.getStringValueTypeAccess().getUnitAssignment_4_1()); 
            // InternalQL.g:6195:2: ( rule__StringValueType__UnitAssignment_4_1 )
            // InternalQL.g:6195:3: rule__StringValueType__UnitAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__StringValueType__UnitAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getStringValueTypeAccess().getUnitAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueType__Group_4__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalQL.g:6204:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6208:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalQL.g:6209:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalQL.g:6216:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6220:1: ( ( ( '-' )? ) )
            // InternalQL.g:6221:1: ( ( '-' )? )
            {
            // InternalQL.g:6221:1: ( ( '-' )? )
            // InternalQL.g:6222:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalQL.g:6223:2: ( '-' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==68) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalQL.g:6223:3: '-'
                    {
                    match(input,68,FOLLOW_2); 

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
    // InternalQL.g:6231:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6235:1: ( rule__EInt__Group__1__Impl )
            // InternalQL.g:6236:2: rule__EInt__Group__1__Impl
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
    // InternalQL.g:6242:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6246:1: ( ( RULE_INT ) )
            // InternalQL.g:6247:1: ( RULE_INT )
            {
            // InternalQL.g:6247:1: ( RULE_INT )
            // InternalQL.g:6248:2: RULE_INT
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
    // InternalQL.g:6258:1: rule__EnumerationLiteral__Group__0 : rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1 ;
    public final void rule__EnumerationLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6262:1: ( rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1 )
            // InternalQL.g:6263:2: rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalQL.g:6270:1: rule__EnumerationLiteral__Group__0__Impl : ( () ) ;
    public final void rule__EnumerationLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6274:1: ( ( () ) )
            // InternalQL.g:6275:1: ( () )
            {
            // InternalQL.g:6275:1: ( () )
            // InternalQL.g:6276:2: ()
            {
             before(grammarAccess.getEnumerationLiteralAccess().getEnumerationLiteralAction_0()); 
            // InternalQL.g:6277:2: ()
            // InternalQL.g:6277:3: 
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
    // InternalQL.g:6285:1: rule__EnumerationLiteral__Group__1 : rule__EnumerationLiteral__Group__1__Impl rule__EnumerationLiteral__Group__2 ;
    public final void rule__EnumerationLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6289:1: ( rule__EnumerationLiteral__Group__1__Impl rule__EnumerationLiteral__Group__2 )
            // InternalQL.g:6290:2: rule__EnumerationLiteral__Group__1__Impl rule__EnumerationLiteral__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__EnumerationLiteral__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationLiteral__Group__2();

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
    // InternalQL.g:6297:1: rule__EnumerationLiteral__Group__1__Impl : ( 'EnumerationLiteral' ) ;
    public final void rule__EnumerationLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6301:1: ( ( 'EnumerationLiteral' ) )
            // InternalQL.g:6302:1: ( 'EnumerationLiteral' )
            {
            // InternalQL.g:6302:1: ( 'EnumerationLiteral' )
            // InternalQL.g:6303:2: 'EnumerationLiteral'
            {
             before(grammarAccess.getEnumerationLiteralAccess().getEnumerationLiteralKeyword_1()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getEnumerationLiteralAccess().getEnumerationLiteralKeyword_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__EnumerationLiteral__Group__2"
    // InternalQL.g:6312:1: rule__EnumerationLiteral__Group__2 : rule__EnumerationLiteral__Group__2__Impl ;
    public final void rule__EnumerationLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6316:1: ( rule__EnumerationLiteral__Group__2__Impl )
            // InternalQL.g:6317:2: rule__EnumerationLiteral__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationLiteral__Group__2__Impl();

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
    // $ANTLR end "rule__EnumerationLiteral__Group__2"


    // $ANTLR start "rule__EnumerationLiteral__Group__2__Impl"
    // InternalQL.g:6323:1: rule__EnumerationLiteral__Group__2__Impl : ( ( rule__EnumerationLiteral__NameAssignment_2 ) ) ;
    public final void rule__EnumerationLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6327:1: ( ( ( rule__EnumerationLiteral__NameAssignment_2 ) ) )
            // InternalQL.g:6328:1: ( ( rule__EnumerationLiteral__NameAssignment_2 ) )
            {
            // InternalQL.g:6328:1: ( ( rule__EnumerationLiteral__NameAssignment_2 ) )
            // InternalQL.g:6329:2: ( rule__EnumerationLiteral__NameAssignment_2 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getNameAssignment_2()); 
            // InternalQL.g:6330:2: ( rule__EnumerationLiteral__NameAssignment_2 )
            // InternalQL.g:6330:3: rule__EnumerationLiteral__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationLiteral__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationLiteralAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group__2__Impl"


    // $ANTLR start "rule__IntegerValue__Group__0"
    // InternalQL.g:6339:1: rule__IntegerValue__Group__0 : rule__IntegerValue__Group__0__Impl rule__IntegerValue__Group__1 ;
    public final void rule__IntegerValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6343:1: ( rule__IntegerValue__Group__0__Impl rule__IntegerValue__Group__1 )
            // InternalQL.g:6344:2: rule__IntegerValue__Group__0__Impl rule__IntegerValue__Group__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalQL.g:6351:1: rule__IntegerValue__Group__0__Impl : ( () ) ;
    public final void rule__IntegerValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6355:1: ( ( () ) )
            // InternalQL.g:6356:1: ( () )
            {
            // InternalQL.g:6356:1: ( () )
            // InternalQL.g:6357:2: ()
            {
             before(grammarAccess.getIntegerValueAccess().getIntegerValueAction_0()); 
            // InternalQL.g:6358:2: ()
            // InternalQL.g:6358:3: 
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
    // InternalQL.g:6366:1: rule__IntegerValue__Group__1 : rule__IntegerValue__Group__1__Impl rule__IntegerValue__Group__2 ;
    public final void rule__IntegerValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6370:1: ( rule__IntegerValue__Group__1__Impl rule__IntegerValue__Group__2 )
            // InternalQL.g:6371:2: rule__IntegerValue__Group__1__Impl rule__IntegerValue__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalQL.g:6378:1: rule__IntegerValue__Group__1__Impl : ( 'IntegerValue' ) ;
    public final void rule__IntegerValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6382:1: ( ( 'IntegerValue' ) )
            // InternalQL.g:6383:1: ( 'IntegerValue' )
            {
            // InternalQL.g:6383:1: ( 'IntegerValue' )
            // InternalQL.g:6384:2: 'IntegerValue'
            {
             before(grammarAccess.getIntegerValueAccess().getIntegerValueKeyword_1()); 
            match(input,70,FOLLOW_2); 
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
    // InternalQL.g:6393:1: rule__IntegerValue__Group__2 : rule__IntegerValue__Group__2__Impl rule__IntegerValue__Group__3 ;
    public final void rule__IntegerValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6397:1: ( rule__IntegerValue__Group__2__Impl rule__IntegerValue__Group__3 )
            // InternalQL.g:6398:2: rule__IntegerValue__Group__2__Impl rule__IntegerValue__Group__3
            {
            pushFollow(FOLLOW_44);
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
    // InternalQL.g:6405:1: rule__IntegerValue__Group__2__Impl : ( '{' ) ;
    public final void rule__IntegerValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6409:1: ( ( '{' ) )
            // InternalQL.g:6410:1: ( '{' )
            {
            // InternalQL.g:6410:1: ( '{' )
            // InternalQL.g:6411:2: '{'
            {
             before(grammarAccess.getIntegerValueAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
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
    // InternalQL.g:6420:1: rule__IntegerValue__Group__3 : rule__IntegerValue__Group__3__Impl rule__IntegerValue__Group__4 ;
    public final void rule__IntegerValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6424:1: ( rule__IntegerValue__Group__3__Impl rule__IntegerValue__Group__4 )
            // InternalQL.g:6425:2: rule__IntegerValue__Group__3__Impl rule__IntegerValue__Group__4
            {
            pushFollow(FOLLOW_44);
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
    // InternalQL.g:6432:1: rule__IntegerValue__Group__3__Impl : ( ( rule__IntegerValue__Group_3__0 )? ) ;
    public final void rule__IntegerValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6436:1: ( ( ( rule__IntegerValue__Group_3__0 )? ) )
            // InternalQL.g:6437:1: ( ( rule__IntegerValue__Group_3__0 )? )
            {
            // InternalQL.g:6437:1: ( ( rule__IntegerValue__Group_3__0 )? )
            // InternalQL.g:6438:2: ( rule__IntegerValue__Group_3__0 )?
            {
             before(grammarAccess.getIntegerValueAccess().getGroup_3()); 
            // InternalQL.g:6439:2: ( rule__IntegerValue__Group_3__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==71) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalQL.g:6439:3: rule__IntegerValue__Group_3__0
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
    // InternalQL.g:6447:1: rule__IntegerValue__Group__4 : rule__IntegerValue__Group__4__Impl ;
    public final void rule__IntegerValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6451:1: ( rule__IntegerValue__Group__4__Impl )
            // InternalQL.g:6452:2: rule__IntegerValue__Group__4__Impl
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
    // InternalQL.g:6458:1: rule__IntegerValue__Group__4__Impl : ( '}' ) ;
    public final void rule__IntegerValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6462:1: ( ( '}' ) )
            // InternalQL.g:6463:1: ( '}' )
            {
            // InternalQL.g:6463:1: ( '}' )
            // InternalQL.g:6464:2: '}'
            {
             before(grammarAccess.getIntegerValueAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_2); 
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
    // InternalQL.g:6474:1: rule__IntegerValue__Group_3__0 : rule__IntegerValue__Group_3__0__Impl rule__IntegerValue__Group_3__1 ;
    public final void rule__IntegerValue__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6478:1: ( rule__IntegerValue__Group_3__0__Impl rule__IntegerValue__Group_3__1 )
            // InternalQL.g:6479:2: rule__IntegerValue__Group_3__0__Impl rule__IntegerValue__Group_3__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalQL.g:6486:1: rule__IntegerValue__Group_3__0__Impl : ( 'intValue' ) ;
    public final void rule__IntegerValue__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6490:1: ( ( 'intValue' ) )
            // InternalQL.g:6491:1: ( 'intValue' )
            {
            // InternalQL.g:6491:1: ( 'intValue' )
            // InternalQL.g:6492:2: 'intValue'
            {
             before(grammarAccess.getIntegerValueAccess().getIntValueKeyword_3_0()); 
            match(input,71,FOLLOW_2); 
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
    // InternalQL.g:6501:1: rule__IntegerValue__Group_3__1 : rule__IntegerValue__Group_3__1__Impl ;
    public final void rule__IntegerValue__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6505:1: ( rule__IntegerValue__Group_3__1__Impl )
            // InternalQL.g:6506:2: rule__IntegerValue__Group_3__1__Impl
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
    // InternalQL.g:6512:1: rule__IntegerValue__Group_3__1__Impl : ( ( rule__IntegerValue__IntValueAssignment_3_1 ) ) ;
    public final void rule__IntegerValue__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6516:1: ( ( ( rule__IntegerValue__IntValueAssignment_3_1 ) ) )
            // InternalQL.g:6517:1: ( ( rule__IntegerValue__IntValueAssignment_3_1 ) )
            {
            // InternalQL.g:6517:1: ( ( rule__IntegerValue__IntValueAssignment_3_1 ) )
            // InternalQL.g:6518:2: ( rule__IntegerValue__IntValueAssignment_3_1 )
            {
             before(grammarAccess.getIntegerValueAccess().getIntValueAssignment_3_1()); 
            // InternalQL.g:6519:2: ( rule__IntegerValue__IntValueAssignment_3_1 )
            // InternalQL.g:6519:3: rule__IntegerValue__IntValueAssignment_3_1
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
    // InternalQL.g:6528:1: rule__StringValue__Group__0 : rule__StringValue__Group__0__Impl rule__StringValue__Group__1 ;
    public final void rule__StringValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6532:1: ( rule__StringValue__Group__0__Impl rule__StringValue__Group__1 )
            // InternalQL.g:6533:2: rule__StringValue__Group__0__Impl rule__StringValue__Group__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalQL.g:6540:1: rule__StringValue__Group__0__Impl : ( () ) ;
    public final void rule__StringValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6544:1: ( ( () ) )
            // InternalQL.g:6545:1: ( () )
            {
            // InternalQL.g:6545:1: ( () )
            // InternalQL.g:6546:2: ()
            {
             before(grammarAccess.getStringValueAccess().getStringValueAction_0()); 
            // InternalQL.g:6547:2: ()
            // InternalQL.g:6547:3: 
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
    // InternalQL.g:6555:1: rule__StringValue__Group__1 : rule__StringValue__Group__1__Impl rule__StringValue__Group__2 ;
    public final void rule__StringValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6559:1: ( rule__StringValue__Group__1__Impl rule__StringValue__Group__2 )
            // InternalQL.g:6560:2: rule__StringValue__Group__1__Impl rule__StringValue__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalQL.g:6567:1: rule__StringValue__Group__1__Impl : ( 'StringValue' ) ;
    public final void rule__StringValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6571:1: ( ( 'StringValue' ) )
            // InternalQL.g:6572:1: ( 'StringValue' )
            {
            // InternalQL.g:6572:1: ( 'StringValue' )
            // InternalQL.g:6573:2: 'StringValue'
            {
             before(grammarAccess.getStringValueAccess().getStringValueKeyword_1()); 
            match(input,72,FOLLOW_2); 
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
    // InternalQL.g:6582:1: rule__StringValue__Group__2 : rule__StringValue__Group__2__Impl rule__StringValue__Group__3 ;
    public final void rule__StringValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6586:1: ( rule__StringValue__Group__2__Impl rule__StringValue__Group__3 )
            // InternalQL.g:6587:2: rule__StringValue__Group__2__Impl rule__StringValue__Group__3
            {
            pushFollow(FOLLOW_46);
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
    // InternalQL.g:6594:1: rule__StringValue__Group__2__Impl : ( '{' ) ;
    public final void rule__StringValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6598:1: ( ( '{' ) )
            // InternalQL.g:6599:1: ( '{' )
            {
            // InternalQL.g:6599:1: ( '{' )
            // InternalQL.g:6600:2: '{'
            {
             before(grammarAccess.getStringValueAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
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
    // InternalQL.g:6609:1: rule__StringValue__Group__3 : rule__StringValue__Group__3__Impl rule__StringValue__Group__4 ;
    public final void rule__StringValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6613:1: ( rule__StringValue__Group__3__Impl rule__StringValue__Group__4 )
            // InternalQL.g:6614:2: rule__StringValue__Group__3__Impl rule__StringValue__Group__4
            {
            pushFollow(FOLLOW_46);
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
    // InternalQL.g:6621:1: rule__StringValue__Group__3__Impl : ( ( rule__StringValue__Group_3__0 )? ) ;
    public final void rule__StringValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6625:1: ( ( ( rule__StringValue__Group_3__0 )? ) )
            // InternalQL.g:6626:1: ( ( rule__StringValue__Group_3__0 )? )
            {
            // InternalQL.g:6626:1: ( ( rule__StringValue__Group_3__0 )? )
            // InternalQL.g:6627:2: ( rule__StringValue__Group_3__0 )?
            {
             before(grammarAccess.getStringValueAccess().getGroup_3()); 
            // InternalQL.g:6628:2: ( rule__StringValue__Group_3__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==73) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalQL.g:6628:3: rule__StringValue__Group_3__0
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
    // InternalQL.g:6636:1: rule__StringValue__Group__4 : rule__StringValue__Group__4__Impl ;
    public final void rule__StringValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6640:1: ( rule__StringValue__Group__4__Impl )
            // InternalQL.g:6641:2: rule__StringValue__Group__4__Impl
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
    // InternalQL.g:6647:1: rule__StringValue__Group__4__Impl : ( '}' ) ;
    public final void rule__StringValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6651:1: ( ( '}' ) )
            // InternalQL.g:6652:1: ( '}' )
            {
            // InternalQL.g:6652:1: ( '}' )
            // InternalQL.g:6653:2: '}'
            {
             before(grammarAccess.getStringValueAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_2); 
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
    // InternalQL.g:6663:1: rule__StringValue__Group_3__0 : rule__StringValue__Group_3__0__Impl rule__StringValue__Group_3__1 ;
    public final void rule__StringValue__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6667:1: ( rule__StringValue__Group_3__0__Impl rule__StringValue__Group_3__1 )
            // InternalQL.g:6668:2: rule__StringValue__Group_3__0__Impl rule__StringValue__Group_3__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalQL.g:6675:1: rule__StringValue__Group_3__0__Impl : ( 'stringValue' ) ;
    public final void rule__StringValue__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6679:1: ( ( 'stringValue' ) )
            // InternalQL.g:6680:1: ( 'stringValue' )
            {
            // InternalQL.g:6680:1: ( 'stringValue' )
            // InternalQL.g:6681:2: 'stringValue'
            {
             before(grammarAccess.getStringValueAccess().getStringValueKeyword_3_0()); 
            match(input,73,FOLLOW_2); 
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
    // InternalQL.g:6690:1: rule__StringValue__Group_3__1 : rule__StringValue__Group_3__1__Impl ;
    public final void rule__StringValue__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6694:1: ( rule__StringValue__Group_3__1__Impl )
            // InternalQL.g:6695:2: rule__StringValue__Group_3__1__Impl
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
    // InternalQL.g:6701:1: rule__StringValue__Group_3__1__Impl : ( ( rule__StringValue__StringValueAssignment_3_1 ) ) ;
    public final void rule__StringValue__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6705:1: ( ( ( rule__StringValue__StringValueAssignment_3_1 ) ) )
            // InternalQL.g:6706:1: ( ( rule__StringValue__StringValueAssignment_3_1 ) )
            {
            // InternalQL.g:6706:1: ( ( rule__StringValue__StringValueAssignment_3_1 ) )
            // InternalQL.g:6707:2: ( rule__StringValue__StringValueAssignment_3_1 )
            {
             before(grammarAccess.getStringValueAccess().getStringValueAssignment_3_1()); 
            // InternalQL.g:6708:2: ( rule__StringValue__StringValueAssignment_3_1 )
            // InternalQL.g:6708:3: rule__StringValue__StringValueAssignment_3_1
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
    // InternalQL.g:6717:1: rule__BooleanValue__Group__0 : rule__BooleanValue__Group__0__Impl rule__BooleanValue__Group__1 ;
    public final void rule__BooleanValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6721:1: ( rule__BooleanValue__Group__0__Impl rule__BooleanValue__Group__1 )
            // InternalQL.g:6722:2: rule__BooleanValue__Group__0__Impl rule__BooleanValue__Group__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalQL.g:6729:1: rule__BooleanValue__Group__0__Impl : ( () ) ;
    public final void rule__BooleanValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6733:1: ( ( () ) )
            // InternalQL.g:6734:1: ( () )
            {
            // InternalQL.g:6734:1: ( () )
            // InternalQL.g:6735:2: ()
            {
             before(grammarAccess.getBooleanValueAccess().getBooleanValueAction_0()); 
            // InternalQL.g:6736:2: ()
            // InternalQL.g:6736:3: 
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
    // InternalQL.g:6744:1: rule__BooleanValue__Group__1 : rule__BooleanValue__Group__1__Impl rule__BooleanValue__Group__2 ;
    public final void rule__BooleanValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6748:1: ( rule__BooleanValue__Group__1__Impl rule__BooleanValue__Group__2 )
            // InternalQL.g:6749:2: rule__BooleanValue__Group__1__Impl rule__BooleanValue__Group__2
            {
            pushFollow(FOLLOW_47);
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
    // InternalQL.g:6756:1: rule__BooleanValue__Group__1__Impl : ( ( rule__BooleanValue__BooleanValueAssignment_1 )? ) ;
    public final void rule__BooleanValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6760:1: ( ( ( rule__BooleanValue__BooleanValueAssignment_1 )? ) )
            // InternalQL.g:6761:1: ( ( rule__BooleanValue__BooleanValueAssignment_1 )? )
            {
            // InternalQL.g:6761:1: ( ( rule__BooleanValue__BooleanValueAssignment_1 )? )
            // InternalQL.g:6762:2: ( rule__BooleanValue__BooleanValueAssignment_1 )?
            {
             before(grammarAccess.getBooleanValueAccess().getBooleanValueAssignment_1()); 
            // InternalQL.g:6763:2: ( rule__BooleanValue__BooleanValueAssignment_1 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==86) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalQL.g:6763:3: rule__BooleanValue__BooleanValueAssignment_1
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
    // InternalQL.g:6771:1: rule__BooleanValue__Group__2 : rule__BooleanValue__Group__2__Impl ;
    public final void rule__BooleanValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6775:1: ( rule__BooleanValue__Group__2__Impl )
            // InternalQL.g:6776:2: rule__BooleanValue__Group__2__Impl
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
    // InternalQL.g:6782:1: rule__BooleanValue__Group__2__Impl : ( 'BooleanValue' ) ;
    public final void rule__BooleanValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6786:1: ( ( 'BooleanValue' ) )
            // InternalQL.g:6787:1: ( 'BooleanValue' )
            {
            // InternalQL.g:6787:1: ( 'BooleanValue' )
            // InternalQL.g:6788:2: 'BooleanValue'
            {
             before(grammarAccess.getBooleanValueAccess().getBooleanValueKeyword_2()); 
            match(input,74,FOLLOW_2); 
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
    // InternalQL.g:6798:1: rule__DateValue__Group__0 : rule__DateValue__Group__0__Impl rule__DateValue__Group__1 ;
    public final void rule__DateValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6802:1: ( rule__DateValue__Group__0__Impl rule__DateValue__Group__1 )
            // InternalQL.g:6803:2: rule__DateValue__Group__0__Impl rule__DateValue__Group__1
            {
            pushFollow(FOLLOW_48);
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
    // InternalQL.g:6810:1: rule__DateValue__Group__0__Impl : ( () ) ;
    public final void rule__DateValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6814:1: ( ( () ) )
            // InternalQL.g:6815:1: ( () )
            {
            // InternalQL.g:6815:1: ( () )
            // InternalQL.g:6816:2: ()
            {
             before(grammarAccess.getDateValueAccess().getDateValueAction_0()); 
            // InternalQL.g:6817:2: ()
            // InternalQL.g:6817:3: 
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
    // InternalQL.g:6825:1: rule__DateValue__Group__1 : rule__DateValue__Group__1__Impl rule__DateValue__Group__2 ;
    public final void rule__DateValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6829:1: ( rule__DateValue__Group__1__Impl rule__DateValue__Group__2 )
            // InternalQL.g:6830:2: rule__DateValue__Group__1__Impl rule__DateValue__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalQL.g:6837:1: rule__DateValue__Group__1__Impl : ( 'DateValue' ) ;
    public final void rule__DateValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6841:1: ( ( 'DateValue' ) )
            // InternalQL.g:6842:1: ( 'DateValue' )
            {
            // InternalQL.g:6842:1: ( 'DateValue' )
            // InternalQL.g:6843:2: 'DateValue'
            {
             before(grammarAccess.getDateValueAccess().getDateValueKeyword_1()); 
            match(input,75,FOLLOW_2); 
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
    // InternalQL.g:6852:1: rule__DateValue__Group__2 : rule__DateValue__Group__2__Impl rule__DateValue__Group__3 ;
    public final void rule__DateValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6856:1: ( rule__DateValue__Group__2__Impl rule__DateValue__Group__3 )
            // InternalQL.g:6857:2: rule__DateValue__Group__2__Impl rule__DateValue__Group__3
            {
            pushFollow(FOLLOW_49);
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
    // InternalQL.g:6864:1: rule__DateValue__Group__2__Impl : ( '{' ) ;
    public final void rule__DateValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6868:1: ( ( '{' ) )
            // InternalQL.g:6869:1: ( '{' )
            {
            // InternalQL.g:6869:1: ( '{' )
            // InternalQL.g:6870:2: '{'
            {
             before(grammarAccess.getDateValueAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
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
    // InternalQL.g:6879:1: rule__DateValue__Group__3 : rule__DateValue__Group__3__Impl rule__DateValue__Group__4 ;
    public final void rule__DateValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6883:1: ( rule__DateValue__Group__3__Impl rule__DateValue__Group__4 )
            // InternalQL.g:6884:2: rule__DateValue__Group__3__Impl rule__DateValue__Group__4
            {
            pushFollow(FOLLOW_49);
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
    // InternalQL.g:6891:1: rule__DateValue__Group__3__Impl : ( ( rule__DateValue__Group_3__0 )? ) ;
    public final void rule__DateValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6895:1: ( ( ( rule__DateValue__Group_3__0 )? ) )
            // InternalQL.g:6896:1: ( ( rule__DateValue__Group_3__0 )? )
            {
            // InternalQL.g:6896:1: ( ( rule__DateValue__Group_3__0 )? )
            // InternalQL.g:6897:2: ( rule__DateValue__Group_3__0 )?
            {
             before(grammarAccess.getDateValueAccess().getGroup_3()); 
            // InternalQL.g:6898:2: ( rule__DateValue__Group_3__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==76) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalQL.g:6898:3: rule__DateValue__Group_3__0
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
    // InternalQL.g:6906:1: rule__DateValue__Group__4 : rule__DateValue__Group__4__Impl ;
    public final void rule__DateValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6910:1: ( rule__DateValue__Group__4__Impl )
            // InternalQL.g:6911:2: rule__DateValue__Group__4__Impl
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
    // InternalQL.g:6917:1: rule__DateValue__Group__4__Impl : ( '}' ) ;
    public final void rule__DateValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6921:1: ( ( '}' ) )
            // InternalQL.g:6922:1: ( '}' )
            {
            // InternalQL.g:6922:1: ( '}' )
            // InternalQL.g:6923:2: '}'
            {
             before(grammarAccess.getDateValueAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_2); 
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
    // InternalQL.g:6933:1: rule__DateValue__Group_3__0 : rule__DateValue__Group_3__0__Impl rule__DateValue__Group_3__1 ;
    public final void rule__DateValue__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6937:1: ( rule__DateValue__Group_3__0__Impl rule__DateValue__Group_3__1 )
            // InternalQL.g:6938:2: rule__DateValue__Group_3__0__Impl rule__DateValue__Group_3__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalQL.g:6945:1: rule__DateValue__Group_3__0__Impl : ( 'dateValue' ) ;
    public final void rule__DateValue__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6949:1: ( ( 'dateValue' ) )
            // InternalQL.g:6950:1: ( 'dateValue' )
            {
            // InternalQL.g:6950:1: ( 'dateValue' )
            // InternalQL.g:6951:2: 'dateValue'
            {
             before(grammarAccess.getDateValueAccess().getDateValueKeyword_3_0()); 
            match(input,76,FOLLOW_2); 
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
    // InternalQL.g:6960:1: rule__DateValue__Group_3__1 : rule__DateValue__Group_3__1__Impl ;
    public final void rule__DateValue__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6964:1: ( rule__DateValue__Group_3__1__Impl )
            // InternalQL.g:6965:2: rule__DateValue__Group_3__1__Impl
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
    // InternalQL.g:6971:1: rule__DateValue__Group_3__1__Impl : ( ( rule__DateValue__DateValueAssignment_3_1 ) ) ;
    public final void rule__DateValue__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6975:1: ( ( ( rule__DateValue__DateValueAssignment_3_1 ) ) )
            // InternalQL.g:6976:1: ( ( rule__DateValue__DateValueAssignment_3_1 ) )
            {
            // InternalQL.g:6976:1: ( ( rule__DateValue__DateValueAssignment_3_1 ) )
            // InternalQL.g:6977:2: ( rule__DateValue__DateValueAssignment_3_1 )
            {
             before(grammarAccess.getDateValueAccess().getDateValueAssignment_3_1()); 
            // InternalQL.g:6978:2: ( rule__DateValue__DateValueAssignment_3_1 )
            // InternalQL.g:6978:3: rule__DateValue__DateValueAssignment_3_1
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
    // InternalQL.g:6987:1: rule__DecimalValue__Group__0 : rule__DecimalValue__Group__0__Impl rule__DecimalValue__Group__1 ;
    public final void rule__DecimalValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:6991:1: ( rule__DecimalValue__Group__0__Impl rule__DecimalValue__Group__1 )
            // InternalQL.g:6992:2: rule__DecimalValue__Group__0__Impl rule__DecimalValue__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalQL.g:6999:1: rule__DecimalValue__Group__0__Impl : ( () ) ;
    public final void rule__DecimalValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7003:1: ( ( () ) )
            // InternalQL.g:7004:1: ( () )
            {
            // InternalQL.g:7004:1: ( () )
            // InternalQL.g:7005:2: ()
            {
             before(grammarAccess.getDecimalValueAccess().getDecimalValueAction_0()); 
            // InternalQL.g:7006:2: ()
            // InternalQL.g:7006:3: 
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
    // InternalQL.g:7014:1: rule__DecimalValue__Group__1 : rule__DecimalValue__Group__1__Impl rule__DecimalValue__Group__2 ;
    public final void rule__DecimalValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7018:1: ( rule__DecimalValue__Group__1__Impl rule__DecimalValue__Group__2 )
            // InternalQL.g:7019:2: rule__DecimalValue__Group__1__Impl rule__DecimalValue__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalQL.g:7026:1: rule__DecimalValue__Group__1__Impl : ( 'DecimalValue' ) ;
    public final void rule__DecimalValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7030:1: ( ( 'DecimalValue' ) )
            // InternalQL.g:7031:1: ( 'DecimalValue' )
            {
            // InternalQL.g:7031:1: ( 'DecimalValue' )
            // InternalQL.g:7032:2: 'DecimalValue'
            {
             before(grammarAccess.getDecimalValueAccess().getDecimalValueKeyword_1()); 
            match(input,77,FOLLOW_2); 
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
    // InternalQL.g:7041:1: rule__DecimalValue__Group__2 : rule__DecimalValue__Group__2__Impl rule__DecimalValue__Group__3 ;
    public final void rule__DecimalValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7045:1: ( rule__DecimalValue__Group__2__Impl rule__DecimalValue__Group__3 )
            // InternalQL.g:7046:2: rule__DecimalValue__Group__2__Impl rule__DecimalValue__Group__3
            {
            pushFollow(FOLLOW_50);
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
    // InternalQL.g:7053:1: rule__DecimalValue__Group__2__Impl : ( '{' ) ;
    public final void rule__DecimalValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7057:1: ( ( '{' ) )
            // InternalQL.g:7058:1: ( '{' )
            {
            // InternalQL.g:7058:1: ( '{' )
            // InternalQL.g:7059:2: '{'
            {
             before(grammarAccess.getDecimalValueAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
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
    // InternalQL.g:7068:1: rule__DecimalValue__Group__3 : rule__DecimalValue__Group__3__Impl rule__DecimalValue__Group__4 ;
    public final void rule__DecimalValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7072:1: ( rule__DecimalValue__Group__3__Impl rule__DecimalValue__Group__4 )
            // InternalQL.g:7073:2: rule__DecimalValue__Group__3__Impl rule__DecimalValue__Group__4
            {
            pushFollow(FOLLOW_50);
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
    // InternalQL.g:7080:1: rule__DecimalValue__Group__3__Impl : ( ( rule__DecimalValue__Group_3__0 )? ) ;
    public final void rule__DecimalValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7084:1: ( ( ( rule__DecimalValue__Group_3__0 )? ) )
            // InternalQL.g:7085:1: ( ( rule__DecimalValue__Group_3__0 )? )
            {
            // InternalQL.g:7085:1: ( ( rule__DecimalValue__Group_3__0 )? )
            // InternalQL.g:7086:2: ( rule__DecimalValue__Group_3__0 )?
            {
             before(grammarAccess.getDecimalValueAccess().getGroup_3()); 
            // InternalQL.g:7087:2: ( rule__DecimalValue__Group_3__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==78) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalQL.g:7087:3: rule__DecimalValue__Group_3__0
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
    // InternalQL.g:7095:1: rule__DecimalValue__Group__4 : rule__DecimalValue__Group__4__Impl ;
    public final void rule__DecimalValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7099:1: ( rule__DecimalValue__Group__4__Impl )
            // InternalQL.g:7100:2: rule__DecimalValue__Group__4__Impl
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
    // InternalQL.g:7106:1: rule__DecimalValue__Group__4__Impl : ( '}' ) ;
    public final void rule__DecimalValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7110:1: ( ( '}' ) )
            // InternalQL.g:7111:1: ( '}' )
            {
            // InternalQL.g:7111:1: ( '}' )
            // InternalQL.g:7112:2: '}'
            {
             before(grammarAccess.getDecimalValueAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_2); 
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
    // InternalQL.g:7122:1: rule__DecimalValue__Group_3__0 : rule__DecimalValue__Group_3__0__Impl rule__DecimalValue__Group_3__1 ;
    public final void rule__DecimalValue__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7126:1: ( rule__DecimalValue__Group_3__0__Impl rule__DecimalValue__Group_3__1 )
            // InternalQL.g:7127:2: rule__DecimalValue__Group_3__0__Impl rule__DecimalValue__Group_3__1
            {
            pushFollow(FOLLOW_51);
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
    // InternalQL.g:7134:1: rule__DecimalValue__Group_3__0__Impl : ( 'decimalValue' ) ;
    public final void rule__DecimalValue__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7138:1: ( ( 'decimalValue' ) )
            // InternalQL.g:7139:1: ( 'decimalValue' )
            {
            // InternalQL.g:7139:1: ( 'decimalValue' )
            // InternalQL.g:7140:2: 'decimalValue'
            {
             before(grammarAccess.getDecimalValueAccess().getDecimalValueKeyword_3_0()); 
            match(input,78,FOLLOW_2); 
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
    // InternalQL.g:7149:1: rule__DecimalValue__Group_3__1 : rule__DecimalValue__Group_3__1__Impl ;
    public final void rule__DecimalValue__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7153:1: ( rule__DecimalValue__Group_3__1__Impl )
            // InternalQL.g:7154:2: rule__DecimalValue__Group_3__1__Impl
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
    // InternalQL.g:7160:1: rule__DecimalValue__Group_3__1__Impl : ( ( rule__DecimalValue__DecimalValueAssignment_3_1 ) ) ;
    public final void rule__DecimalValue__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7164:1: ( ( ( rule__DecimalValue__DecimalValueAssignment_3_1 ) ) )
            // InternalQL.g:7165:1: ( ( rule__DecimalValue__DecimalValueAssignment_3_1 ) )
            {
            // InternalQL.g:7165:1: ( ( rule__DecimalValue__DecimalValueAssignment_3_1 ) )
            // InternalQL.g:7166:2: ( rule__DecimalValue__DecimalValueAssignment_3_1 )
            {
             before(grammarAccess.getDecimalValueAccess().getDecimalValueAssignment_3_1()); 
            // InternalQL.g:7167:2: ( rule__DecimalValue__DecimalValueAssignment_3_1 )
            // InternalQL.g:7167:3: rule__DecimalValue__DecimalValueAssignment_3_1
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
    // InternalQL.g:7176:1: rule__EFloat__Group__0 : rule__EFloat__Group__0__Impl rule__EFloat__Group__1 ;
    public final void rule__EFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7180:1: ( rule__EFloat__Group__0__Impl rule__EFloat__Group__1 )
            // InternalQL.g:7181:2: rule__EFloat__Group__0__Impl rule__EFloat__Group__1
            {
            pushFollow(FOLLOW_51);
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
    // InternalQL.g:7188:1: rule__EFloat__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7192:1: ( ( ( '-' )? ) )
            // InternalQL.g:7193:1: ( ( '-' )? )
            {
            // InternalQL.g:7193:1: ( ( '-' )? )
            // InternalQL.g:7194:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 
            // InternalQL.g:7195:2: ( '-' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==68) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalQL.g:7195:3: '-'
                    {
                    match(input,68,FOLLOW_2); 

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
    // InternalQL.g:7203:1: rule__EFloat__Group__1 : rule__EFloat__Group__1__Impl rule__EFloat__Group__2 ;
    public final void rule__EFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7207:1: ( rule__EFloat__Group__1__Impl rule__EFloat__Group__2 )
            // InternalQL.g:7208:2: rule__EFloat__Group__1__Impl rule__EFloat__Group__2
            {
            pushFollow(FOLLOW_51);
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
    // InternalQL.g:7215:1: rule__EFloat__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7219:1: ( ( ( RULE_INT )? ) )
            // InternalQL.g:7220:1: ( ( RULE_INT )? )
            {
            // InternalQL.g:7220:1: ( ( RULE_INT )? )
            // InternalQL.g:7221:2: ( RULE_INT )?
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 
            // InternalQL.g:7222:2: ( RULE_INT )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_INT) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalQL.g:7222:3: RULE_INT
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
    // InternalQL.g:7230:1: rule__EFloat__Group__2 : rule__EFloat__Group__2__Impl rule__EFloat__Group__3 ;
    public final void rule__EFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7234:1: ( rule__EFloat__Group__2__Impl rule__EFloat__Group__3 )
            // InternalQL.g:7235:2: rule__EFloat__Group__2__Impl rule__EFloat__Group__3
            {
            pushFollow(FOLLOW_52);
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
    // InternalQL.g:7242:1: rule__EFloat__Group__2__Impl : ( '.' ) ;
    public final void rule__EFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7246:1: ( ( '.' ) )
            // InternalQL.g:7247:1: ( '.' )
            {
            // InternalQL.g:7247:1: ( '.' )
            // InternalQL.g:7248:2: '.'
            {
             before(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 
            match(input,79,FOLLOW_2); 
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
    // InternalQL.g:7257:1: rule__EFloat__Group__3 : rule__EFloat__Group__3__Impl rule__EFloat__Group__4 ;
    public final void rule__EFloat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7261:1: ( rule__EFloat__Group__3__Impl rule__EFloat__Group__4 )
            // InternalQL.g:7262:2: rule__EFloat__Group__3__Impl rule__EFloat__Group__4
            {
            pushFollow(FOLLOW_53);
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
    // InternalQL.g:7269:1: rule__EFloat__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7273:1: ( ( RULE_INT ) )
            // InternalQL.g:7274:1: ( RULE_INT )
            {
            // InternalQL.g:7274:1: ( RULE_INT )
            // InternalQL.g:7275:2: RULE_INT
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
    // InternalQL.g:7284:1: rule__EFloat__Group__4 : rule__EFloat__Group__4__Impl ;
    public final void rule__EFloat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7288:1: ( rule__EFloat__Group__4__Impl )
            // InternalQL.g:7289:2: rule__EFloat__Group__4__Impl
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
    // InternalQL.g:7295:1: rule__EFloat__Group__4__Impl : ( ( rule__EFloat__Group_4__0 )? ) ;
    public final void rule__EFloat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7299:1: ( ( ( rule__EFloat__Group_4__0 )? ) )
            // InternalQL.g:7300:1: ( ( rule__EFloat__Group_4__0 )? )
            {
            // InternalQL.g:7300:1: ( ( rule__EFloat__Group_4__0 )? )
            // InternalQL.g:7301:2: ( rule__EFloat__Group_4__0 )?
            {
             before(grammarAccess.getEFloatAccess().getGroup_4()); 
            // InternalQL.g:7302:2: ( rule__EFloat__Group_4__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=12 && LA48_0<=13)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalQL.g:7302:3: rule__EFloat__Group_4__0
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
    // InternalQL.g:7311:1: rule__EFloat__Group_4__0 : rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 ;
    public final void rule__EFloat__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7315:1: ( rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 )
            // InternalQL.g:7316:2: rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalQL.g:7323:1: rule__EFloat__Group_4__0__Impl : ( ( rule__EFloat__Alternatives_4_0 ) ) ;
    public final void rule__EFloat__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7327:1: ( ( ( rule__EFloat__Alternatives_4_0 ) ) )
            // InternalQL.g:7328:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            {
            // InternalQL.g:7328:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            // InternalQL.g:7329:2: ( rule__EFloat__Alternatives_4_0 )
            {
             before(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 
            // InternalQL.g:7330:2: ( rule__EFloat__Alternatives_4_0 )
            // InternalQL.g:7330:3: rule__EFloat__Alternatives_4_0
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
    // InternalQL.g:7338:1: rule__EFloat__Group_4__1 : rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 ;
    public final void rule__EFloat__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7342:1: ( rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 )
            // InternalQL.g:7343:2: rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalQL.g:7350:1: rule__EFloat__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7354:1: ( ( ( '-' )? ) )
            // InternalQL.g:7355:1: ( ( '-' )? )
            {
            // InternalQL.g:7355:1: ( ( '-' )? )
            // InternalQL.g:7356:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 
            // InternalQL.g:7357:2: ( '-' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==68) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalQL.g:7357:3: '-'
                    {
                    match(input,68,FOLLOW_2); 

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
    // InternalQL.g:7365:1: rule__EFloat__Group_4__2 : rule__EFloat__Group_4__2__Impl ;
    public final void rule__EFloat__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7369:1: ( rule__EFloat__Group_4__2__Impl )
            // InternalQL.g:7370:2: rule__EFloat__Group_4__2__Impl
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
    // InternalQL.g:7376:1: rule__EFloat__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7380:1: ( ( RULE_INT ) )
            // InternalQL.g:7381:1: ( RULE_INT )
            {
            // InternalQL.g:7381:1: ( RULE_INT )
            // InternalQL.g:7382:2: RULE_INT
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
    // InternalQL.g:7392:1: rule__QuestionDefinition__Group__0 : rule__QuestionDefinition__Group__0__Impl rule__QuestionDefinition__Group__1 ;
    public final void rule__QuestionDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7396:1: ( rule__QuestionDefinition__Group__0__Impl rule__QuestionDefinition__Group__1 )
            // InternalQL.g:7397:2: rule__QuestionDefinition__Group__0__Impl rule__QuestionDefinition__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalQL.g:7404:1: rule__QuestionDefinition__Group__0__Impl : ( ( rule__QuestionDefinition__IsDisplayedAssignment_0 )? ) ;
    public final void rule__QuestionDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7408:1: ( ( ( rule__QuestionDefinition__IsDisplayedAssignment_0 )? ) )
            // InternalQL.g:7409:1: ( ( rule__QuestionDefinition__IsDisplayedAssignment_0 )? )
            {
            // InternalQL.g:7409:1: ( ( rule__QuestionDefinition__IsDisplayedAssignment_0 )? )
            // InternalQL.g:7410:2: ( rule__QuestionDefinition__IsDisplayedAssignment_0 )?
            {
             before(grammarAccess.getQuestionDefinitionAccess().getIsDisplayedAssignment_0()); 
            // InternalQL.g:7411:2: ( rule__QuestionDefinition__IsDisplayedAssignment_0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==87) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalQL.g:7411:3: rule__QuestionDefinition__IsDisplayedAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QuestionDefinition__IsDisplayedAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionDefinitionAccess().getIsDisplayedAssignment_0()); 

            }


            }

        }
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
    // InternalQL.g:7419:1: rule__QuestionDefinition__Group__1 : rule__QuestionDefinition__Group__1__Impl rule__QuestionDefinition__Group__2 ;
    public final void rule__QuestionDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7423:1: ( rule__QuestionDefinition__Group__1__Impl rule__QuestionDefinition__Group__2 )
            // InternalQL.g:7424:2: rule__QuestionDefinition__Group__1__Impl rule__QuestionDefinition__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalQL.g:7431:1: rule__QuestionDefinition__Group__1__Impl : ( ( rule__QuestionDefinition__IsMandatoryAssignment_1 )? ) ;
    public final void rule__QuestionDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7435:1: ( ( ( rule__QuestionDefinition__IsMandatoryAssignment_1 )? ) )
            // InternalQL.g:7436:1: ( ( rule__QuestionDefinition__IsMandatoryAssignment_1 )? )
            {
            // InternalQL.g:7436:1: ( ( rule__QuestionDefinition__IsMandatoryAssignment_1 )? )
            // InternalQL.g:7437:2: ( rule__QuestionDefinition__IsMandatoryAssignment_1 )?
            {
             before(grammarAccess.getQuestionDefinitionAccess().getIsMandatoryAssignment_1()); 
            // InternalQL.g:7438:2: ( rule__QuestionDefinition__IsMandatoryAssignment_1 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==88) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalQL.g:7438:3: rule__QuestionDefinition__IsMandatoryAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__QuestionDefinition__IsMandatoryAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionDefinitionAccess().getIsMandatoryAssignment_1()); 

            }


            }

        }
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
    // InternalQL.g:7446:1: rule__QuestionDefinition__Group__2 : rule__QuestionDefinition__Group__2__Impl rule__QuestionDefinition__Group__3 ;
    public final void rule__QuestionDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7450:1: ( rule__QuestionDefinition__Group__2__Impl rule__QuestionDefinition__Group__3 )
            // InternalQL.g:7451:2: rule__QuestionDefinition__Group__2__Impl rule__QuestionDefinition__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalQL.g:7458:1: rule__QuestionDefinition__Group__2__Impl : ( 'QuestionDefinition' ) ;
    public final void rule__QuestionDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7462:1: ( ( 'QuestionDefinition' ) )
            // InternalQL.g:7463:1: ( 'QuestionDefinition' )
            {
            // InternalQL.g:7463:1: ( 'QuestionDefinition' )
            // InternalQL.g:7464:2: 'QuestionDefinition'
            {
             before(grammarAccess.getQuestionDefinitionAccess().getQuestionDefinitionKeyword_2()); 
            match(input,80,FOLLOW_2); 
             after(grammarAccess.getQuestionDefinitionAccess().getQuestionDefinitionKeyword_2()); 

            }


            }

        }
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
    // InternalQL.g:7473:1: rule__QuestionDefinition__Group__3 : rule__QuestionDefinition__Group__3__Impl rule__QuestionDefinition__Group__4 ;
    public final void rule__QuestionDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7477:1: ( rule__QuestionDefinition__Group__3__Impl rule__QuestionDefinition__Group__4 )
            // InternalQL.g:7478:2: rule__QuestionDefinition__Group__3__Impl rule__QuestionDefinition__Group__4
            {
            pushFollow(FOLLOW_4);
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
    // InternalQL.g:7485:1: rule__QuestionDefinition__Group__3__Impl : ( ( rule__QuestionDefinition__NameAssignment_3 ) ) ;
    public final void rule__QuestionDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7489:1: ( ( ( rule__QuestionDefinition__NameAssignment_3 ) ) )
            // InternalQL.g:7490:1: ( ( rule__QuestionDefinition__NameAssignment_3 ) )
            {
            // InternalQL.g:7490:1: ( ( rule__QuestionDefinition__NameAssignment_3 ) )
            // InternalQL.g:7491:2: ( rule__QuestionDefinition__NameAssignment_3 )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getNameAssignment_3()); 
            // InternalQL.g:7492:2: ( rule__QuestionDefinition__NameAssignment_3 )
            // InternalQL.g:7492:3: rule__QuestionDefinition__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getQuestionDefinitionAccess().getNameAssignment_3()); 

            }


            }

        }
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
    // InternalQL.g:7500:1: rule__QuestionDefinition__Group__4 : rule__QuestionDefinition__Group__4__Impl rule__QuestionDefinition__Group__5 ;
    public final void rule__QuestionDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7504:1: ( rule__QuestionDefinition__Group__4__Impl rule__QuestionDefinition__Group__5 )
            // InternalQL.g:7505:2: rule__QuestionDefinition__Group__4__Impl rule__QuestionDefinition__Group__5
            {
            pushFollow(FOLLOW_54);
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
    // InternalQL.g:7512:1: rule__QuestionDefinition__Group__4__Impl : ( '{' ) ;
    public final void rule__QuestionDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7516:1: ( ( '{' ) )
            // InternalQL.g:7517:1: ( '{' )
            {
            // InternalQL.g:7517:1: ( '{' )
            // InternalQL.g:7518:2: '{'
            {
             before(grammarAccess.getQuestionDefinitionAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getQuestionDefinitionAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
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
    // InternalQL.g:7527:1: rule__QuestionDefinition__Group__5 : rule__QuestionDefinition__Group__5__Impl rule__QuestionDefinition__Group__6 ;
    public final void rule__QuestionDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7531:1: ( rule__QuestionDefinition__Group__5__Impl rule__QuestionDefinition__Group__6 )
            // InternalQL.g:7532:2: rule__QuestionDefinition__Group__5__Impl rule__QuestionDefinition__Group__6
            {
            pushFollow(FOLLOW_54);
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
    // InternalQL.g:7539:1: rule__QuestionDefinition__Group__5__Impl : ( ( rule__QuestionDefinition__Group_5__0 )? ) ;
    public final void rule__QuestionDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7543:1: ( ( ( rule__QuestionDefinition__Group_5__0 )? ) )
            // InternalQL.g:7544:1: ( ( rule__QuestionDefinition__Group_5__0 )? )
            {
            // InternalQL.g:7544:1: ( ( rule__QuestionDefinition__Group_5__0 )? )
            // InternalQL.g:7545:2: ( rule__QuestionDefinition__Group_5__0 )?
            {
             before(grammarAccess.getQuestionDefinitionAccess().getGroup_5()); 
            // InternalQL.g:7546:2: ( rule__QuestionDefinition__Group_5__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==82) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalQL.g:7546:3: rule__QuestionDefinition__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QuestionDefinition__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionDefinitionAccess().getGroup_5()); 

            }


            }

        }
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
    // InternalQL.g:7554:1: rule__QuestionDefinition__Group__6 : rule__QuestionDefinition__Group__6__Impl rule__QuestionDefinition__Group__7 ;
    public final void rule__QuestionDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7558:1: ( rule__QuestionDefinition__Group__6__Impl rule__QuestionDefinition__Group__7 )
            // InternalQL.g:7559:2: rule__QuestionDefinition__Group__6__Impl rule__QuestionDefinition__Group__7
            {
            pushFollow(FOLLOW_11);
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
    // InternalQL.g:7566:1: rule__QuestionDefinition__Group__6__Impl : ( 'dataType' ) ;
    public final void rule__QuestionDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7570:1: ( ( 'dataType' ) )
            // InternalQL.g:7571:1: ( 'dataType' )
            {
            // InternalQL.g:7571:1: ( 'dataType' )
            // InternalQL.g:7572:2: 'dataType'
            {
             before(grammarAccess.getQuestionDefinitionAccess().getDataTypeKeyword_6()); 
            match(input,81,FOLLOW_2); 
             after(grammarAccess.getQuestionDefinitionAccess().getDataTypeKeyword_6()); 

            }


            }

        }
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
    // InternalQL.g:7581:1: rule__QuestionDefinition__Group__7 : rule__QuestionDefinition__Group__7__Impl rule__QuestionDefinition__Group__8 ;
    public final void rule__QuestionDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7585:1: ( rule__QuestionDefinition__Group__7__Impl rule__QuestionDefinition__Group__8 )
            // InternalQL.g:7586:2: rule__QuestionDefinition__Group__7__Impl rule__QuestionDefinition__Group__8
            {
            pushFollow(FOLLOW_55);
            rule__QuestionDefinition__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__Group__8();

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
    // InternalQL.g:7593:1: rule__QuestionDefinition__Group__7__Impl : ( ( rule__QuestionDefinition__DataTypeAssignment_7 ) ) ;
    public final void rule__QuestionDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7597:1: ( ( ( rule__QuestionDefinition__DataTypeAssignment_7 ) ) )
            // InternalQL.g:7598:1: ( ( rule__QuestionDefinition__DataTypeAssignment_7 ) )
            {
            // InternalQL.g:7598:1: ( ( rule__QuestionDefinition__DataTypeAssignment_7 ) )
            // InternalQL.g:7599:2: ( rule__QuestionDefinition__DataTypeAssignment_7 )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getDataTypeAssignment_7()); 
            // InternalQL.g:7600:2: ( rule__QuestionDefinition__DataTypeAssignment_7 )
            // InternalQL.g:7600:3: rule__QuestionDefinition__DataTypeAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__DataTypeAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getQuestionDefinitionAccess().getDataTypeAssignment_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__QuestionDefinition__Group__8"
    // InternalQL.g:7608:1: rule__QuestionDefinition__Group__8 : rule__QuestionDefinition__Group__8__Impl rule__QuestionDefinition__Group__9 ;
    public final void rule__QuestionDefinition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7612:1: ( rule__QuestionDefinition__Group__8__Impl rule__QuestionDefinition__Group__9 )
            // InternalQL.g:7613:2: rule__QuestionDefinition__Group__8__Impl rule__QuestionDefinition__Group__9
            {
            pushFollow(FOLLOW_55);
            rule__QuestionDefinition__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__Group__9();

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
    // $ANTLR end "rule__QuestionDefinition__Group__8"


    // $ANTLR start "rule__QuestionDefinition__Group__8__Impl"
    // InternalQL.g:7620:1: rule__QuestionDefinition__Group__8__Impl : ( ( rule__QuestionDefinition__Group_8__0 )? ) ;
    public final void rule__QuestionDefinition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7624:1: ( ( ( rule__QuestionDefinition__Group_8__0 )? ) )
            // InternalQL.g:7625:1: ( ( rule__QuestionDefinition__Group_8__0 )? )
            {
            // InternalQL.g:7625:1: ( ( rule__QuestionDefinition__Group_8__0 )? )
            // InternalQL.g:7626:2: ( rule__QuestionDefinition__Group_8__0 )?
            {
             before(grammarAccess.getQuestionDefinitionAccess().getGroup_8()); 
            // InternalQL.g:7627:2: ( rule__QuestionDefinition__Group_8__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==83) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalQL.g:7627:3: rule__QuestionDefinition__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QuestionDefinition__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionDefinitionAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group__8__Impl"


    // $ANTLR start "rule__QuestionDefinition__Group__9"
    // InternalQL.g:7635:1: rule__QuestionDefinition__Group__9 : rule__QuestionDefinition__Group__9__Impl rule__QuestionDefinition__Group__10 ;
    public final void rule__QuestionDefinition__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7639:1: ( rule__QuestionDefinition__Group__9__Impl rule__QuestionDefinition__Group__10 )
            // InternalQL.g:7640:2: rule__QuestionDefinition__Group__9__Impl rule__QuestionDefinition__Group__10
            {
            pushFollow(FOLLOW_55);
            rule__QuestionDefinition__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__Group__10();

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
    // $ANTLR end "rule__QuestionDefinition__Group__9"


    // $ANTLR start "rule__QuestionDefinition__Group__9__Impl"
    // InternalQL.g:7647:1: rule__QuestionDefinition__Group__9__Impl : ( ( rule__QuestionDefinition__Group_9__0 )? ) ;
    public final void rule__QuestionDefinition__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7651:1: ( ( ( rule__QuestionDefinition__Group_9__0 )? ) )
            // InternalQL.g:7652:1: ( ( rule__QuestionDefinition__Group_9__0 )? )
            {
            // InternalQL.g:7652:1: ( ( rule__QuestionDefinition__Group_9__0 )? )
            // InternalQL.g:7653:2: ( rule__QuestionDefinition__Group_9__0 )?
            {
             before(grammarAccess.getQuestionDefinitionAccess().getGroup_9()); 
            // InternalQL.g:7654:2: ( rule__QuestionDefinition__Group_9__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==84) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalQL.g:7654:3: rule__QuestionDefinition__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QuestionDefinition__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionDefinitionAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group__9__Impl"


    // $ANTLR start "rule__QuestionDefinition__Group__10"
    // InternalQL.g:7662:1: rule__QuestionDefinition__Group__10 : rule__QuestionDefinition__Group__10__Impl ;
    public final void rule__QuestionDefinition__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7666:1: ( rule__QuestionDefinition__Group__10__Impl )
            // InternalQL.g:7667:2: rule__QuestionDefinition__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__Group__10__Impl();

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
    // $ANTLR end "rule__QuestionDefinition__Group__10"


    // $ANTLR start "rule__QuestionDefinition__Group__10__Impl"
    // InternalQL.g:7673:1: rule__QuestionDefinition__Group__10__Impl : ( '}' ) ;
    public final void rule__QuestionDefinition__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7677:1: ( ( '}' ) )
            // InternalQL.g:7678:1: ( '}' )
            {
            // InternalQL.g:7678:1: ( '}' )
            // InternalQL.g:7679:2: '}'
            {
             before(grammarAccess.getQuestionDefinitionAccess().getRightCurlyBracketKeyword_10()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getQuestionDefinitionAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group__10__Impl"


    // $ANTLR start "rule__QuestionDefinition__Group_5__0"
    // InternalQL.g:7689:1: rule__QuestionDefinition__Group_5__0 : rule__QuestionDefinition__Group_5__0__Impl rule__QuestionDefinition__Group_5__1 ;
    public final void rule__QuestionDefinition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7693:1: ( rule__QuestionDefinition__Group_5__0__Impl rule__QuestionDefinition__Group_5__1 )
            // InternalQL.g:7694:2: rule__QuestionDefinition__Group_5__0__Impl rule__QuestionDefinition__Group_5__1
            {
            pushFollow(FOLLOW_11);
            rule__QuestionDefinition__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__Group_5__1();

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
    // $ANTLR end "rule__QuestionDefinition__Group_5__0"


    // $ANTLR start "rule__QuestionDefinition__Group_5__0__Impl"
    // InternalQL.g:7701:1: rule__QuestionDefinition__Group_5__0__Impl : ( 'label' ) ;
    public final void rule__QuestionDefinition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7705:1: ( ( 'label' ) )
            // InternalQL.g:7706:1: ( 'label' )
            {
            // InternalQL.g:7706:1: ( 'label' )
            // InternalQL.g:7707:2: 'label'
            {
             before(grammarAccess.getQuestionDefinitionAccess().getLabelKeyword_5_0()); 
            match(input,82,FOLLOW_2); 
             after(grammarAccess.getQuestionDefinitionAccess().getLabelKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group_5__0__Impl"


    // $ANTLR start "rule__QuestionDefinition__Group_5__1"
    // InternalQL.g:7716:1: rule__QuestionDefinition__Group_5__1 : rule__QuestionDefinition__Group_5__1__Impl ;
    public final void rule__QuestionDefinition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7720:1: ( rule__QuestionDefinition__Group_5__1__Impl )
            // InternalQL.g:7721:2: rule__QuestionDefinition__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__Group_5__1__Impl();

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
    // $ANTLR end "rule__QuestionDefinition__Group_5__1"


    // $ANTLR start "rule__QuestionDefinition__Group_5__1__Impl"
    // InternalQL.g:7727:1: rule__QuestionDefinition__Group_5__1__Impl : ( ( rule__QuestionDefinition__LabelAssignment_5_1 ) ) ;
    public final void rule__QuestionDefinition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7731:1: ( ( ( rule__QuestionDefinition__LabelAssignment_5_1 ) ) )
            // InternalQL.g:7732:1: ( ( rule__QuestionDefinition__LabelAssignment_5_1 ) )
            {
            // InternalQL.g:7732:1: ( ( rule__QuestionDefinition__LabelAssignment_5_1 ) )
            // InternalQL.g:7733:2: ( rule__QuestionDefinition__LabelAssignment_5_1 )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getLabelAssignment_5_1()); 
            // InternalQL.g:7734:2: ( rule__QuestionDefinition__LabelAssignment_5_1 )
            // InternalQL.g:7734:3: rule__QuestionDefinition__LabelAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__LabelAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionDefinitionAccess().getLabelAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group_5__1__Impl"


    // $ANTLR start "rule__QuestionDefinition__Group_8__0"
    // InternalQL.g:7743:1: rule__QuestionDefinition__Group_8__0 : rule__QuestionDefinition__Group_8__0__Impl rule__QuestionDefinition__Group_8__1 ;
    public final void rule__QuestionDefinition__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7747:1: ( rule__QuestionDefinition__Group_8__0__Impl rule__QuestionDefinition__Group_8__1 )
            // InternalQL.g:7748:2: rule__QuestionDefinition__Group_8__0__Impl rule__QuestionDefinition__Group_8__1
            {
            pushFollow(FOLLOW_19);
            rule__QuestionDefinition__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__Group_8__1();

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
    // $ANTLR end "rule__QuestionDefinition__Group_8__0"


    // $ANTLR start "rule__QuestionDefinition__Group_8__0__Impl"
    // InternalQL.g:7755:1: rule__QuestionDefinition__Group_8__0__Impl : ( 'computedExpression' ) ;
    public final void rule__QuestionDefinition__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7759:1: ( ( 'computedExpression' ) )
            // InternalQL.g:7760:1: ( 'computedExpression' )
            {
            // InternalQL.g:7760:1: ( 'computedExpression' )
            // InternalQL.g:7761:2: 'computedExpression'
            {
             before(grammarAccess.getQuestionDefinitionAccess().getComputedExpressionKeyword_8_0()); 
            match(input,83,FOLLOW_2); 
             after(grammarAccess.getQuestionDefinitionAccess().getComputedExpressionKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group_8__0__Impl"


    // $ANTLR start "rule__QuestionDefinition__Group_8__1"
    // InternalQL.g:7770:1: rule__QuestionDefinition__Group_8__1 : rule__QuestionDefinition__Group_8__1__Impl ;
    public final void rule__QuestionDefinition__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7774:1: ( rule__QuestionDefinition__Group_8__1__Impl )
            // InternalQL.g:7775:2: rule__QuestionDefinition__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__Group_8__1__Impl();

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
    // $ANTLR end "rule__QuestionDefinition__Group_8__1"


    // $ANTLR start "rule__QuestionDefinition__Group_8__1__Impl"
    // InternalQL.g:7781:1: rule__QuestionDefinition__Group_8__1__Impl : ( ( rule__QuestionDefinition__ComputedExpressionAssignment_8_1 ) ) ;
    public final void rule__QuestionDefinition__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7785:1: ( ( ( rule__QuestionDefinition__ComputedExpressionAssignment_8_1 ) ) )
            // InternalQL.g:7786:1: ( ( rule__QuestionDefinition__ComputedExpressionAssignment_8_1 ) )
            {
            // InternalQL.g:7786:1: ( ( rule__QuestionDefinition__ComputedExpressionAssignment_8_1 ) )
            // InternalQL.g:7787:2: ( rule__QuestionDefinition__ComputedExpressionAssignment_8_1 )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getComputedExpressionAssignment_8_1()); 
            // InternalQL.g:7788:2: ( rule__QuestionDefinition__ComputedExpressionAssignment_8_1 )
            // InternalQL.g:7788:3: rule__QuestionDefinition__ComputedExpressionAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__ComputedExpressionAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionDefinitionAccess().getComputedExpressionAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group_8__1__Impl"


    // $ANTLR start "rule__QuestionDefinition__Group_9__0"
    // InternalQL.g:7797:1: rule__QuestionDefinition__Group_9__0 : rule__QuestionDefinition__Group_9__0__Impl rule__QuestionDefinition__Group_9__1 ;
    public final void rule__QuestionDefinition__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7801:1: ( rule__QuestionDefinition__Group_9__0__Impl rule__QuestionDefinition__Group_9__1 )
            // InternalQL.g:7802:2: rule__QuestionDefinition__Group_9__0__Impl rule__QuestionDefinition__Group_9__1
            {
            pushFollow(FOLLOW_30);
            rule__QuestionDefinition__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__Group_9__1();

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
    // $ANTLR end "rule__QuestionDefinition__Group_9__0"


    // $ANTLR start "rule__QuestionDefinition__Group_9__0__Impl"
    // InternalQL.g:7809:1: rule__QuestionDefinition__Group_9__0__Impl : ( 'currentValue' ) ;
    public final void rule__QuestionDefinition__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7813:1: ( ( 'currentValue' ) )
            // InternalQL.g:7814:1: ( 'currentValue' )
            {
            // InternalQL.g:7814:1: ( 'currentValue' )
            // InternalQL.g:7815:2: 'currentValue'
            {
             before(grammarAccess.getQuestionDefinitionAccess().getCurrentValueKeyword_9_0()); 
            match(input,84,FOLLOW_2); 
             after(grammarAccess.getQuestionDefinitionAccess().getCurrentValueKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group_9__0__Impl"


    // $ANTLR start "rule__QuestionDefinition__Group_9__1"
    // InternalQL.g:7824:1: rule__QuestionDefinition__Group_9__1 : rule__QuestionDefinition__Group_9__1__Impl ;
    public final void rule__QuestionDefinition__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7828:1: ( rule__QuestionDefinition__Group_9__1__Impl )
            // InternalQL.g:7829:2: rule__QuestionDefinition__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__Group_9__1__Impl();

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
    // $ANTLR end "rule__QuestionDefinition__Group_9__1"


    // $ANTLR start "rule__QuestionDefinition__Group_9__1__Impl"
    // InternalQL.g:7835:1: rule__QuestionDefinition__Group_9__1__Impl : ( ( rule__QuestionDefinition__CurrentValueAssignment_9_1 ) ) ;
    public final void rule__QuestionDefinition__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7839:1: ( ( ( rule__QuestionDefinition__CurrentValueAssignment_9_1 ) ) )
            // InternalQL.g:7840:1: ( ( rule__QuestionDefinition__CurrentValueAssignment_9_1 ) )
            {
            // InternalQL.g:7840:1: ( ( rule__QuestionDefinition__CurrentValueAssignment_9_1 ) )
            // InternalQL.g:7841:2: ( rule__QuestionDefinition__CurrentValueAssignment_9_1 )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getCurrentValueAssignment_9_1()); 
            // InternalQL.g:7842:2: ( rule__QuestionDefinition__CurrentValueAssignment_9_1 )
            // InternalQL.g:7842:3: rule__QuestionDefinition__CurrentValueAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__QuestionDefinition__CurrentValueAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionDefinitionAccess().getCurrentValueAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__Group_9__1__Impl"


    // $ANTLR start "rule__QLModel__CanSubmitAssignment_1"
    // InternalQL.g:7851:1: rule__QLModel__CanSubmitAssignment_1 : ( ( 'canSubmit' ) ) ;
    public final void rule__QLModel__CanSubmitAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7855:1: ( ( ( 'canSubmit' ) ) )
            // InternalQL.g:7856:2: ( ( 'canSubmit' ) )
            {
            // InternalQL.g:7856:2: ( ( 'canSubmit' ) )
            // InternalQL.g:7857:3: ( 'canSubmit' )
            {
             before(grammarAccess.getQLModelAccess().getCanSubmitCanSubmitKeyword_1_0()); 
            // InternalQL.g:7858:3: ( 'canSubmit' )
            // InternalQL.g:7859:4: 'canSubmit'
            {
             before(grammarAccess.getQLModelAccess().getCanSubmitCanSubmitKeyword_1_0()); 
            match(input,85,FOLLOW_2); 
             after(grammarAccess.getQLModelAccess().getCanSubmitCanSubmitKeyword_1_0()); 

            }

             after(grammarAccess.getQLModelAccess().getCanSubmitCanSubmitKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__CanSubmitAssignment_1"


    // $ANTLR start "rule__QLModel__SubmitDateAssignment_4_1"
    // InternalQL.g:7870:1: rule__QLModel__SubmitDateAssignment_4_1 : ( ruleEDate ) ;
    public final void rule__QLModel__SubmitDateAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7874:1: ( ( ruleEDate ) )
            // InternalQL.g:7875:2: ( ruleEDate )
            {
            // InternalQL.g:7875:2: ( ruleEDate )
            // InternalQL.g:7876:3: ruleEDate
            {
             before(grammarAccess.getQLModelAccess().getSubmitDateEDateParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDate();

            state._fsp--;

             after(grammarAccess.getQLModelAccess().getSubmitDateEDateParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__SubmitDateAssignment_4_1"


    // $ANTLR start "rule__QLModel__FormsAssignment_5_2"
    // InternalQL.g:7885:1: rule__QLModel__FormsAssignment_5_2 : ( ruleForm ) ;
    public final void rule__QLModel__FormsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7889:1: ( ( ruleForm ) )
            // InternalQL.g:7890:2: ( ruleForm )
            {
            // InternalQL.g:7890:2: ( ruleForm )
            // InternalQL.g:7891:3: ruleForm
            {
             before(grammarAccess.getQLModelAccess().getFormsFormParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleForm();

            state._fsp--;

             after(grammarAccess.getQLModelAccess().getFormsFormParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__FormsAssignment_5_2"


    // $ANTLR start "rule__QLModel__FormsAssignment_5_3_1"
    // InternalQL.g:7900:1: rule__QLModel__FormsAssignment_5_3_1 : ( ruleForm ) ;
    public final void rule__QLModel__FormsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7904:1: ( ( ruleForm ) )
            // InternalQL.g:7905:2: ( ruleForm )
            {
            // InternalQL.g:7905:2: ( ruleForm )
            // InternalQL.g:7906:3: ruleForm
            {
             before(grammarAccess.getQLModelAccess().getFormsFormParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleForm();

            state._fsp--;

             after(grammarAccess.getQLModelAccess().getFormsFormParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__FormsAssignment_5_3_1"


    // $ANTLR start "rule__QLModel__DefinitionGroupAssignment_6_2"
    // InternalQL.g:7915:1: rule__QLModel__DefinitionGroupAssignment_6_2 : ( ruleDefinitionGroup ) ;
    public final void rule__QLModel__DefinitionGroupAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7919:1: ( ( ruleDefinitionGroup ) )
            // InternalQL.g:7920:2: ( ruleDefinitionGroup )
            {
            // InternalQL.g:7920:2: ( ruleDefinitionGroup )
            // InternalQL.g:7921:3: ruleDefinitionGroup
            {
             before(grammarAccess.getQLModelAccess().getDefinitionGroupDefinitionGroupParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDefinitionGroup();

            state._fsp--;

             after(grammarAccess.getQLModelAccess().getDefinitionGroupDefinitionGroupParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__DefinitionGroupAssignment_6_2"


    // $ANTLR start "rule__QLModel__DefinitionGroupAssignment_6_3_1"
    // InternalQL.g:7930:1: rule__QLModel__DefinitionGroupAssignment_6_3_1 : ( ruleDefinitionGroup ) ;
    public final void rule__QLModel__DefinitionGroupAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7934:1: ( ( ruleDefinitionGroup ) )
            // InternalQL.g:7935:2: ( ruleDefinitionGroup )
            {
            // InternalQL.g:7935:2: ( ruleDefinitionGroup )
            // InternalQL.g:7936:3: ruleDefinitionGroup
            {
             before(grammarAccess.getQLModelAccess().getDefinitionGroupDefinitionGroupParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDefinitionGroup();

            state._fsp--;

             after(grammarAccess.getQLModelAccess().getDefinitionGroupDefinitionGroupParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QLModel__DefinitionGroupAssignment_6_3_1"


    // $ANTLR start "rule__Form__NameAssignment_1"
    // InternalQL.g:7945:1: rule__Form__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Form__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7949:1: ( ( ruleEString ) )
            // InternalQL.g:7950:2: ( ruleEString )
            {
            // InternalQL.g:7950:2: ( ruleEString )
            // InternalQL.g:7951:3: ruleEString
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


    // $ANTLR start "rule__Form__QuestionGroupAssignment_4"
    // InternalQL.g:7960:1: rule__Form__QuestionGroupAssignment_4 : ( ruleQuestionGroup ) ;
    public final void rule__Form__QuestionGroupAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7964:1: ( ( ruleQuestionGroup ) )
            // InternalQL.g:7965:2: ( ruleQuestionGroup )
            {
            // InternalQL.g:7965:2: ( ruleQuestionGroup )
            // InternalQL.g:7966:3: ruleQuestionGroup
            {
             before(grammarAccess.getFormAccess().getQuestionGroupQuestionGroupParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestionGroup();

            state._fsp--;

             after(grammarAccess.getFormAccess().getQuestionGroupQuestionGroupParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__QuestionGroupAssignment_4"


    // $ANTLR start "rule__DefinitionGroup__DataTypesAssignment_3_2"
    // InternalQL.g:7975:1: rule__DefinitionGroup__DataTypesAssignment_3_2 : ( ruleValueType ) ;
    public final void rule__DefinitionGroup__DataTypesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7979:1: ( ( ruleValueType ) )
            // InternalQL.g:7980:2: ( ruleValueType )
            {
            // InternalQL.g:7980:2: ( ruleValueType )
            // InternalQL.g:7981:3: ruleValueType
            {
             before(grammarAccess.getDefinitionGroupAccess().getDataTypesValueTypeParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleValueType();

            state._fsp--;

             after(grammarAccess.getDefinitionGroupAccess().getDataTypesValueTypeParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionGroup__DataTypesAssignment_3_2"


    // $ANTLR start "rule__DefinitionGroup__DataTypesAssignment_3_3_1"
    // InternalQL.g:7990:1: rule__DefinitionGroup__DataTypesAssignment_3_3_1 : ( ruleValueType ) ;
    public final void rule__DefinitionGroup__DataTypesAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:7994:1: ( ( ruleValueType ) )
            // InternalQL.g:7995:2: ( ruleValueType )
            {
            // InternalQL.g:7995:2: ( ruleValueType )
            // InternalQL.g:7996:3: ruleValueType
            {
             before(grammarAccess.getDefinitionGroupAccess().getDataTypesValueTypeParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValueType();

            state._fsp--;

             after(grammarAccess.getDefinitionGroupAccess().getDataTypesValueTypeParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionGroup__DataTypesAssignment_3_3_1"


    // $ANTLR start "rule__DefinitionGroup__QuestionDefinitionsAssignment_4_2"
    // InternalQL.g:8005:1: rule__DefinitionGroup__QuestionDefinitionsAssignment_4_2 : ( ruleQuestionDefinition ) ;
    public final void rule__DefinitionGroup__QuestionDefinitionsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8009:1: ( ( ruleQuestionDefinition ) )
            // InternalQL.g:8010:2: ( ruleQuestionDefinition )
            {
            // InternalQL.g:8010:2: ( ruleQuestionDefinition )
            // InternalQL.g:8011:3: ruleQuestionDefinition
            {
             before(grammarAccess.getDefinitionGroupAccess().getQuestionDefinitionsQuestionDefinitionParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestionDefinition();

            state._fsp--;

             after(grammarAccess.getDefinitionGroupAccess().getQuestionDefinitionsQuestionDefinitionParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionGroup__QuestionDefinitionsAssignment_4_2"


    // $ANTLR start "rule__DefinitionGroup__QuestionDefinitionsAssignment_4_3_1"
    // InternalQL.g:8020:1: rule__DefinitionGroup__QuestionDefinitionsAssignment_4_3_1 : ( ruleQuestionDefinition ) ;
    public final void rule__DefinitionGroup__QuestionDefinitionsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8024:1: ( ( ruleQuestionDefinition ) )
            // InternalQL.g:8025:2: ( ruleQuestionDefinition )
            {
            // InternalQL.g:8025:2: ( ruleQuestionDefinition )
            // InternalQL.g:8026:3: ruleQuestionDefinition
            {
             before(grammarAccess.getDefinitionGroupAccess().getQuestionDefinitionsQuestionDefinitionParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestionDefinition();

            state._fsp--;

             after(grammarAccess.getDefinitionGroupAccess().getQuestionDefinitionsQuestionDefinitionParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionGroup__QuestionDefinitionsAssignment_4_3_1"


    // $ANTLR start "rule__QuestionGroup__GuardAssignment_3_1"
    // InternalQL.g:8035:1: rule__QuestionGroup__GuardAssignment_3_1 : ( ruleExpression ) ;
    public final void rule__QuestionGroup__GuardAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8039:1: ( ( ruleExpression ) )
            // InternalQL.g:8040:2: ( ruleExpression )
            {
            // InternalQL.g:8040:2: ( ruleExpression )
            // InternalQL.g:8041:3: ruleExpression
            {
             before(grammarAccess.getQuestionGroupAccess().getGuardExpressionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getQuestionGroupAccess().getGuardExpressionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__GuardAssignment_3_1"


    // $ANTLR start "rule__QuestionGroup__QuestionGroupsAssignment_4_2"
    // InternalQL.g:8050:1: rule__QuestionGroup__QuestionGroupsAssignment_4_2 : ( ruleQuestionGroup ) ;
    public final void rule__QuestionGroup__QuestionGroupsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8054:1: ( ( ruleQuestionGroup ) )
            // InternalQL.g:8055:2: ( ruleQuestionGroup )
            {
            // InternalQL.g:8055:2: ( ruleQuestionGroup )
            // InternalQL.g:8056:3: ruleQuestionGroup
            {
             before(grammarAccess.getQuestionGroupAccess().getQuestionGroupsQuestionGroupParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestionGroup();

            state._fsp--;

             after(grammarAccess.getQuestionGroupAccess().getQuestionGroupsQuestionGroupParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__QuestionGroupsAssignment_4_2"


    // $ANTLR start "rule__QuestionGroup__QuestionGroupsAssignment_4_3_1"
    // InternalQL.g:8065:1: rule__QuestionGroup__QuestionGroupsAssignment_4_3_1 : ( ruleQuestionGroup ) ;
    public final void rule__QuestionGroup__QuestionGroupsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8069:1: ( ( ruleQuestionGroup ) )
            // InternalQL.g:8070:2: ( ruleQuestionGroup )
            {
            // InternalQL.g:8070:2: ( ruleQuestionGroup )
            // InternalQL.g:8071:3: ruleQuestionGroup
            {
             before(grammarAccess.getQuestionGroupAccess().getQuestionGroupsQuestionGroupParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestionGroup();

            state._fsp--;

             after(grammarAccess.getQuestionGroupAccess().getQuestionGroupsQuestionGroupParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__QuestionGroupsAssignment_4_3_1"


    // $ANTLR start "rule__QuestionGroup__QuestionsAssignment_5_2"
    // InternalQL.g:8080:1: rule__QuestionGroup__QuestionsAssignment_5_2 : ( ruleQuestion ) ;
    public final void rule__QuestionGroup__QuestionsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8084:1: ( ( ruleQuestion ) )
            // InternalQL.g:8085:2: ( ruleQuestion )
            {
            // InternalQL.g:8085:2: ( ruleQuestion )
            // InternalQL.g:8086:3: ruleQuestion
            {
             before(grammarAccess.getQuestionGroupAccess().getQuestionsQuestionParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionGroupAccess().getQuestionsQuestionParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__QuestionsAssignment_5_2"


    // $ANTLR start "rule__QuestionGroup__QuestionsAssignment_5_3_1"
    // InternalQL.g:8095:1: rule__QuestionGroup__QuestionsAssignment_5_3_1 : ( ruleQuestion ) ;
    public final void rule__QuestionGroup__QuestionsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8099:1: ( ( ruleQuestion ) )
            // InternalQL.g:8100:2: ( ruleQuestion )
            {
            // InternalQL.g:8100:2: ( ruleQuestion )
            // InternalQL.g:8101:3: ruleQuestion
            {
             before(grammarAccess.getQuestionGroupAccess().getQuestionsQuestionParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionGroupAccess().getQuestionsQuestionParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionGroup__QuestionsAssignment_5_3_1"


    // $ANTLR start "rule__Question__QuestionDefinitionAssignment_3"
    // InternalQL.g:8110:1: rule__Question__QuestionDefinitionAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Question__QuestionDefinitionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8114:1: ( ( ( ruleEString ) ) )
            // InternalQL.g:8115:2: ( ( ruleEString ) )
            {
            // InternalQL.g:8115:2: ( ( ruleEString ) )
            // InternalQL.g:8116:3: ( ruleEString )
            {
             before(grammarAccess.getQuestionAccess().getQuestionDefinitionQuestionDefinitionCrossReference_3_0()); 
            // InternalQL.g:8117:3: ( ruleEString )
            // InternalQL.g:8118:4: ruleEString
            {
             before(grammarAccess.getQuestionAccess().getQuestionDefinitionQuestionDefinitionEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getQuestionDefinitionQuestionDefinitionEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getQuestionAccess().getQuestionDefinitionQuestionDefinitionCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__QuestionDefinitionAssignment_3"


    // $ANTLR start "rule__ValueType_Impl__NameAssignment_2"
    // InternalQL.g:8129:1: rule__ValueType_Impl__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ValueType_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8133:1: ( ( ruleEString ) )
            // InternalQL.g:8134:2: ( ruleEString )
            {
            // InternalQL.g:8134:2: ( ruleEString )
            // InternalQL.g:8135:3: ruleEString
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
    // InternalQL.g:8144:1: rule__ValueType_Impl__UnitAssignment_4_1 : ( ruleEString ) ;
    public final void rule__ValueType_Impl__UnitAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8148:1: ( ( ruleEString ) )
            // InternalQL.g:8149:2: ( ruleEString )
            {
            // InternalQL.g:8149:2: ( ruleEString )
            // InternalQL.g:8150:3: ruleEString
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


    // $ANTLR start "rule__BasicBinaryExpression__OperatorAssignment_3"
    // InternalQL.g:8159:1: rule__BasicBinaryExpression__OperatorAssignment_3 : ( ruleBinaryOperatorKind ) ;
    public final void rule__BasicBinaryExpression__OperatorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8163:1: ( ( ruleBinaryOperatorKind ) )
            // InternalQL.g:8164:2: ( ruleBinaryOperatorKind )
            {
            // InternalQL.g:8164:2: ( ruleBinaryOperatorKind )
            // InternalQL.g:8165:3: ruleBinaryOperatorKind
            {
             before(grammarAccess.getBasicBinaryExpressionAccess().getOperatorBinaryOperatorKindEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBinaryOperatorKind();

            state._fsp--;

             after(grammarAccess.getBasicBinaryExpressionAccess().getOperatorBinaryOperatorKindEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicBinaryExpression__OperatorAssignment_3"


    // $ANTLR start "rule__BasicBinaryExpression__ResultTypeAssignment_4_1"
    // InternalQL.g:8174:1: rule__BasicBinaryExpression__ResultTypeAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__BasicBinaryExpression__ResultTypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8178:1: ( ( ( ruleEString ) ) )
            // InternalQL.g:8179:2: ( ( ruleEString ) )
            {
            // InternalQL.g:8179:2: ( ( ruleEString ) )
            // InternalQL.g:8180:3: ( ruleEString )
            {
             before(grammarAccess.getBasicBinaryExpressionAccess().getResultTypeValueTypeCrossReference_4_1_0()); 
            // InternalQL.g:8181:3: ( ruleEString )
            // InternalQL.g:8182:4: ruleEString
            {
             before(grammarAccess.getBasicBinaryExpressionAccess().getResultTypeValueTypeEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBasicBinaryExpressionAccess().getResultTypeValueTypeEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getBasicBinaryExpressionAccess().getResultTypeValueTypeCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicBinaryExpression__ResultTypeAssignment_4_1"


    // $ANTLR start "rule__BasicBinaryExpression__LhsOperandAssignment_6"
    // InternalQL.g:8193:1: rule__BasicBinaryExpression__LhsOperandAssignment_6 : ( ruleExpression ) ;
    public final void rule__BasicBinaryExpression__LhsOperandAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8197:1: ( ( ruleExpression ) )
            // InternalQL.g:8198:2: ( ruleExpression )
            {
            // InternalQL.g:8198:2: ( ruleExpression )
            // InternalQL.g:8199:3: ruleExpression
            {
             before(grammarAccess.getBasicBinaryExpressionAccess().getLhsOperandExpressionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getBasicBinaryExpressionAccess().getLhsOperandExpressionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicBinaryExpression__LhsOperandAssignment_6"


    // $ANTLR start "rule__BasicBinaryExpression__RhsOperandAssignment_8"
    // InternalQL.g:8208:1: rule__BasicBinaryExpression__RhsOperandAssignment_8 : ( ruleExpression ) ;
    public final void rule__BasicBinaryExpression__RhsOperandAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8212:1: ( ( ruleExpression ) )
            // InternalQL.g:8213:2: ( ruleExpression )
            {
            // InternalQL.g:8213:2: ( ruleExpression )
            // InternalQL.g:8214:3: ruleExpression
            {
             before(grammarAccess.getBasicBinaryExpressionAccess().getRhsOperandExpressionParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getBasicBinaryExpressionAccess().getRhsOperandExpressionParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicBinaryExpression__RhsOperandAssignment_8"


    // $ANTLR start "rule__ConstantCall__ResultTypeAssignment_3_1"
    // InternalQL.g:8223:1: rule__ConstantCall__ResultTypeAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__ConstantCall__ResultTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8227:1: ( ( ( ruleEString ) ) )
            // InternalQL.g:8228:2: ( ( ruleEString ) )
            {
            // InternalQL.g:8228:2: ( ( ruleEString ) )
            // InternalQL.g:8229:3: ( ruleEString )
            {
             before(grammarAccess.getConstantCallAccess().getResultTypeValueTypeCrossReference_3_1_0()); 
            // InternalQL.g:8230:3: ( ruleEString )
            // InternalQL.g:8231:4: ruleEString
            {
             before(grammarAccess.getConstantCallAccess().getResultTypeValueTypeEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConstantCallAccess().getResultTypeValueTypeEStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getConstantCallAccess().getResultTypeValueTypeCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantCall__ResultTypeAssignment_3_1"


    // $ANTLR start "rule__ConstantCall__ValueAssignment_4_1"
    // InternalQL.g:8242:1: rule__ConstantCall__ValueAssignment_4_1 : ( ruleValue ) ;
    public final void rule__ConstantCall__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8246:1: ( ( ruleValue ) )
            // InternalQL.g:8247:2: ( ruleValue )
            {
            // InternalQL.g:8247:2: ( ruleValue )
            // InternalQL.g:8248:3: ruleValue
            {
             before(grammarAccess.getConstantCallAccess().getValueValueParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getConstantCallAccess().getValueValueParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantCall__ValueAssignment_4_1"


    // $ANTLR start "rule__BasicUnaryExpression__OperatorAssignment_2_1"
    // InternalQL.g:8257:1: rule__BasicUnaryExpression__OperatorAssignment_2_1 : ( ruleUnaryOperatorKind ) ;
    public final void rule__BasicUnaryExpression__OperatorAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8261:1: ( ( ruleUnaryOperatorKind ) )
            // InternalQL.g:8262:2: ( ruleUnaryOperatorKind )
            {
            // InternalQL.g:8262:2: ( ruleUnaryOperatorKind )
            // InternalQL.g:8263:3: ruleUnaryOperatorKind
            {
             before(grammarAccess.getBasicUnaryExpressionAccess().getOperatorUnaryOperatorKindEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnaryOperatorKind();

            state._fsp--;

             after(grammarAccess.getBasicUnaryExpressionAccess().getOperatorUnaryOperatorKindEnumRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicUnaryExpression__OperatorAssignment_2_1"


    // $ANTLR start "rule__BasicUnaryExpression__ResultTypeAssignment_3_1"
    // InternalQL.g:8272:1: rule__BasicUnaryExpression__ResultTypeAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__BasicUnaryExpression__ResultTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8276:1: ( ( ( ruleEString ) ) )
            // InternalQL.g:8277:2: ( ( ruleEString ) )
            {
            // InternalQL.g:8277:2: ( ( ruleEString ) )
            // InternalQL.g:8278:3: ( ruleEString )
            {
             before(grammarAccess.getBasicUnaryExpressionAccess().getResultTypeValueTypeCrossReference_3_1_0()); 
            // InternalQL.g:8279:3: ( ruleEString )
            // InternalQL.g:8280:4: ruleEString
            {
             before(grammarAccess.getBasicUnaryExpressionAccess().getResultTypeValueTypeEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBasicUnaryExpressionAccess().getResultTypeValueTypeEStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getBasicUnaryExpressionAccess().getResultTypeValueTypeCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicUnaryExpression__ResultTypeAssignment_3_1"


    // $ANTLR start "rule__BasicUnaryExpression__OperandAssignment_5"
    // InternalQL.g:8291:1: rule__BasicUnaryExpression__OperandAssignment_5 : ( ruleExpression ) ;
    public final void rule__BasicUnaryExpression__OperandAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8295:1: ( ( ruleExpression ) )
            // InternalQL.g:8296:2: ( ruleExpression )
            {
            // InternalQL.g:8296:2: ( ruleExpression )
            // InternalQL.g:8297:3: ruleExpression
            {
             before(grammarAccess.getBasicUnaryExpressionAccess().getOperandExpressionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getBasicUnaryExpressionAccess().getOperandExpressionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicUnaryExpression__OperandAssignment_5"


    // $ANTLR start "rule__QuestionCall__ResultTypeAssignment_2_1"
    // InternalQL.g:8306:1: rule__QuestionCall__ResultTypeAssignment_2_1 : ( ( ruleEString ) ) ;
    public final void rule__QuestionCall__ResultTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8310:1: ( ( ( ruleEString ) ) )
            // InternalQL.g:8311:2: ( ( ruleEString ) )
            {
            // InternalQL.g:8311:2: ( ( ruleEString ) )
            // InternalQL.g:8312:3: ( ruleEString )
            {
             before(grammarAccess.getQuestionCallAccess().getResultTypeValueTypeCrossReference_2_1_0()); 
            // InternalQL.g:8313:3: ( ruleEString )
            // InternalQL.g:8314:4: ruleEString
            {
             before(grammarAccess.getQuestionCallAccess().getResultTypeValueTypeEStringParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestionCallAccess().getResultTypeValueTypeEStringParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getQuestionCallAccess().getResultTypeValueTypeCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionCall__ResultTypeAssignment_2_1"


    // $ANTLR start "rule__QuestionCall__QuestionAssignment_4"
    // InternalQL.g:8325:1: rule__QuestionCall__QuestionAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__QuestionCall__QuestionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8329:1: ( ( ( ruleEString ) ) )
            // InternalQL.g:8330:2: ( ( ruleEString ) )
            {
            // InternalQL.g:8330:2: ( ( ruleEString ) )
            // InternalQL.g:8331:3: ( ruleEString )
            {
             before(grammarAccess.getQuestionCallAccess().getQuestionQuestionDefinitionCrossReference_4_0()); 
            // InternalQL.g:8332:3: ( ruleEString )
            // InternalQL.g:8333:4: ruleEString
            {
             before(grammarAccess.getQuestionCallAccess().getQuestionQuestionDefinitionEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestionCallAccess().getQuestionQuestionDefinitionEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getQuestionCallAccess().getQuestionQuestionDefinitionCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionCall__QuestionAssignment_4"


    // $ANTLR start "rule__BooleanValueType__NameAssignment_2"
    // InternalQL.g:8344:1: rule__BooleanValueType__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__BooleanValueType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8348:1: ( ( ruleEString ) )
            // InternalQL.g:8349:2: ( ruleEString )
            {
            // InternalQL.g:8349:2: ( ruleEString )
            // InternalQL.g:8350:3: ruleEString
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


    // $ANTLR start "rule__BooleanValueType__UnitAssignment_4_1"
    // InternalQL.g:8359:1: rule__BooleanValueType__UnitAssignment_4_1 : ( ruleEString ) ;
    public final void rule__BooleanValueType__UnitAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8363:1: ( ( ruleEString ) )
            // InternalQL.g:8364:2: ( ruleEString )
            {
            // InternalQL.g:8364:2: ( ruleEString )
            // InternalQL.g:8365:3: ruleEString
            {
             before(grammarAccess.getBooleanValueTypeAccess().getUnitEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBooleanValueTypeAccess().getUnitEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueType__UnitAssignment_4_1"


    // $ANTLR start "rule__IntegerValueType__NameAssignment_2"
    // InternalQL.g:8374:1: rule__IntegerValueType__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__IntegerValueType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8378:1: ( ( ruleEString ) )
            // InternalQL.g:8379:2: ( ruleEString )
            {
            // InternalQL.g:8379:2: ( ruleEString )
            // InternalQL.g:8380:3: ruleEString
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


    // $ANTLR start "rule__IntegerValueType__UnitAssignment_4_1"
    // InternalQL.g:8389:1: rule__IntegerValueType__UnitAssignment_4_1 : ( ruleEString ) ;
    public final void rule__IntegerValueType__UnitAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8393:1: ( ( ruleEString ) )
            // InternalQL.g:8394:2: ( ruleEString )
            {
            // InternalQL.g:8394:2: ( ruleEString )
            // InternalQL.g:8395:3: ruleEString
            {
             before(grammarAccess.getIntegerValueTypeAccess().getUnitEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getIntegerValueTypeAccess().getUnitEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__UnitAssignment_4_1"


    // $ANTLR start "rule__IntegerValueType__MinAssignment_5_1"
    // InternalQL.g:8404:1: rule__IntegerValueType__MinAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__IntegerValueType__MinAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8408:1: ( ( ruleEInt ) )
            // InternalQL.g:8409:2: ( ruleEInt )
            {
            // InternalQL.g:8409:2: ( ruleEInt )
            // InternalQL.g:8410:3: ruleEInt
            {
             before(grammarAccess.getIntegerValueTypeAccess().getMinEIntParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getIntegerValueTypeAccess().getMinEIntParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__MinAssignment_5_1"


    // $ANTLR start "rule__IntegerValueType__MaxAssignment_6_1"
    // InternalQL.g:8419:1: rule__IntegerValueType__MaxAssignment_6_1 : ( ruleEInt ) ;
    public final void rule__IntegerValueType__MaxAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8423:1: ( ( ruleEInt ) )
            // InternalQL.g:8424:2: ( ruleEInt )
            {
            // InternalQL.g:8424:2: ( ruleEInt )
            // InternalQL.g:8425:3: ruleEInt
            {
             before(grammarAccess.getIntegerValueTypeAccess().getMaxEIntParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getIntegerValueTypeAccess().getMaxEIntParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueType__MaxAssignment_6_1"


    // $ANTLR start "rule__DecimalValueType__NameAssignment_2"
    // InternalQL.g:8434:1: rule__DecimalValueType__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__DecimalValueType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8438:1: ( ( ruleEString ) )
            // InternalQL.g:8439:2: ( ruleEString )
            {
            // InternalQL.g:8439:2: ( ruleEString )
            // InternalQL.g:8440:3: ruleEString
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


    // $ANTLR start "rule__DecimalValueType__UnitAssignment_4_1"
    // InternalQL.g:8449:1: rule__DecimalValueType__UnitAssignment_4_1 : ( ruleEString ) ;
    public final void rule__DecimalValueType__UnitAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8453:1: ( ( ruleEString ) )
            // InternalQL.g:8454:2: ( ruleEString )
            {
            // InternalQL.g:8454:2: ( ruleEString )
            // InternalQL.g:8455:3: ruleEString
            {
             before(grammarAccess.getDecimalValueTypeAccess().getUnitEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDecimalValueTypeAccess().getUnitEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueType__UnitAssignment_4_1"


    // $ANTLR start "rule__DateValueType__NameAssignment_2"
    // InternalQL.g:8464:1: rule__DateValueType__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__DateValueType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8468:1: ( ( ruleEString ) )
            // InternalQL.g:8469:2: ( ruleEString )
            {
            // InternalQL.g:8469:2: ( ruleEString )
            // InternalQL.g:8470:3: ruleEString
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


    // $ANTLR start "rule__DateValueType__UnitAssignment_4_1"
    // InternalQL.g:8479:1: rule__DateValueType__UnitAssignment_4_1 : ( ruleEString ) ;
    public final void rule__DateValueType__UnitAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8483:1: ( ( ruleEString ) )
            // InternalQL.g:8484:2: ( ruleEString )
            {
            // InternalQL.g:8484:2: ( ruleEString )
            // InternalQL.g:8485:3: ruleEString
            {
             before(grammarAccess.getDateValueTypeAccess().getUnitEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDateValueTypeAccess().getUnitEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateValueType__UnitAssignment_4_1"


    // $ANTLR start "rule__EnumerationValueType__NameAssignment_2"
    // InternalQL.g:8494:1: rule__EnumerationValueType__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__EnumerationValueType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8498:1: ( ( ruleEString ) )
            // InternalQL.g:8499:2: ( ruleEString )
            {
            // InternalQL.g:8499:2: ( ruleEString )
            // InternalQL.g:8500:3: ruleEString
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


    // $ANTLR start "rule__EnumerationValueType__UnitAssignment_4_1"
    // InternalQL.g:8509:1: rule__EnumerationValueType__UnitAssignment_4_1 : ( ruleEString ) ;
    public final void rule__EnumerationValueType__UnitAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8513:1: ( ( ruleEString ) )
            // InternalQL.g:8514:2: ( ruleEString )
            {
            // InternalQL.g:8514:2: ( ruleEString )
            // InternalQL.g:8515:3: ruleEString
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getUnitEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEnumerationValueTypeAccess().getUnitEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__UnitAssignment_4_1"


    // $ANTLR start "rule__EnumerationValueType__EnumerationLiteralsAssignment_5_2"
    // InternalQL.g:8524:1: rule__EnumerationValueType__EnumerationLiteralsAssignment_5_2 : ( ruleEnumerationLiteral ) ;
    public final void rule__EnumerationValueType__EnumerationLiteralsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8528:1: ( ( ruleEnumerationLiteral ) )
            // InternalQL.g:8529:2: ( ruleEnumerationLiteral )
            {
            // InternalQL.g:8529:2: ( ruleEnumerationLiteral )
            // InternalQL.g:8530:3: ruleEnumerationLiteral
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getEnumerationLiteralsEnumerationLiteralParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumerationLiteral();

            state._fsp--;

             after(grammarAccess.getEnumerationValueTypeAccess().getEnumerationLiteralsEnumerationLiteralParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__EnumerationLiteralsAssignment_5_2"


    // $ANTLR start "rule__EnumerationValueType__EnumerationLiteralsAssignment_5_3_1"
    // InternalQL.g:8539:1: rule__EnumerationValueType__EnumerationLiteralsAssignment_5_3_1 : ( ruleEnumerationLiteral ) ;
    public final void rule__EnumerationValueType__EnumerationLiteralsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8543:1: ( ( ruleEnumerationLiteral ) )
            // InternalQL.g:8544:2: ( ruleEnumerationLiteral )
            {
            // InternalQL.g:8544:2: ( ruleEnumerationLiteral )
            // InternalQL.g:8545:3: ruleEnumerationLiteral
            {
             before(grammarAccess.getEnumerationValueTypeAccess().getEnumerationLiteralsEnumerationLiteralParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumerationLiteral();

            state._fsp--;

             after(grammarAccess.getEnumerationValueTypeAccess().getEnumerationLiteralsEnumerationLiteralParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueType__EnumerationLiteralsAssignment_5_3_1"


    // $ANTLR start "rule__StringValueType__NameAssignment_2"
    // InternalQL.g:8554:1: rule__StringValueType__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__StringValueType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8558:1: ( ( ruleEString ) )
            // InternalQL.g:8559:2: ( ruleEString )
            {
            // InternalQL.g:8559:2: ( ruleEString )
            // InternalQL.g:8560:3: ruleEString
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


    // $ANTLR start "rule__StringValueType__UnitAssignment_4_1"
    // InternalQL.g:8569:1: rule__StringValueType__UnitAssignment_4_1 : ( ruleEString ) ;
    public final void rule__StringValueType__UnitAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8573:1: ( ( ruleEString ) )
            // InternalQL.g:8574:2: ( ruleEString )
            {
            // InternalQL.g:8574:2: ( ruleEString )
            // InternalQL.g:8575:3: ruleEString
            {
             before(grammarAccess.getStringValueTypeAccess().getUnitEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStringValueTypeAccess().getUnitEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueType__UnitAssignment_4_1"


    // $ANTLR start "rule__EnumerationLiteral__NameAssignment_2"
    // InternalQL.g:8584:1: rule__EnumerationLiteral__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__EnumerationLiteral__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8588:1: ( ( ruleEString ) )
            // InternalQL.g:8589:2: ( ruleEString )
            {
            // InternalQL.g:8589:2: ( ruleEString )
            // InternalQL.g:8590:3: ruleEString
            {
             before(grammarAccess.getEnumerationLiteralAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEnumerationLiteralAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__NameAssignment_2"


    // $ANTLR start "rule__IntegerValue__IntValueAssignment_3_1"
    // InternalQL.g:8599:1: rule__IntegerValue__IntValueAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__IntegerValue__IntValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8603:1: ( ( ruleEInt ) )
            // InternalQL.g:8604:2: ( ruleEInt )
            {
            // InternalQL.g:8604:2: ( ruleEInt )
            // InternalQL.g:8605:3: ruleEInt
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
    // InternalQL.g:8614:1: rule__StringValue__StringValueAssignment_3_1 : ( ruleEString ) ;
    public final void rule__StringValue__StringValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8618:1: ( ( ruleEString ) )
            // InternalQL.g:8619:2: ( ruleEString )
            {
            // InternalQL.g:8619:2: ( ruleEString )
            // InternalQL.g:8620:3: ruleEString
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
    // InternalQL.g:8629:1: rule__BooleanValue__BooleanValueAssignment_1 : ( ( 'booleanValue' ) ) ;
    public final void rule__BooleanValue__BooleanValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8633:1: ( ( ( 'booleanValue' ) ) )
            // InternalQL.g:8634:2: ( ( 'booleanValue' ) )
            {
            // InternalQL.g:8634:2: ( ( 'booleanValue' ) )
            // InternalQL.g:8635:3: ( 'booleanValue' )
            {
             before(grammarAccess.getBooleanValueAccess().getBooleanValueBooleanValueKeyword_1_0()); 
            // InternalQL.g:8636:3: ( 'booleanValue' )
            // InternalQL.g:8637:4: 'booleanValue'
            {
             before(grammarAccess.getBooleanValueAccess().getBooleanValueBooleanValueKeyword_1_0()); 
            match(input,86,FOLLOW_2); 
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
    // InternalQL.g:8648:1: rule__DateValue__DateValueAssignment_3_1 : ( ruleEDate ) ;
    public final void rule__DateValue__DateValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8652:1: ( ( ruleEDate ) )
            // InternalQL.g:8653:2: ( ruleEDate )
            {
            // InternalQL.g:8653:2: ( ruleEDate )
            // InternalQL.g:8654:3: ruleEDate
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
    // InternalQL.g:8663:1: rule__DecimalValue__DecimalValueAssignment_3_1 : ( ruleEFloat ) ;
    public final void rule__DecimalValue__DecimalValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8667:1: ( ( ruleEFloat ) )
            // InternalQL.g:8668:2: ( ruleEFloat )
            {
            // InternalQL.g:8668:2: ( ruleEFloat )
            // InternalQL.g:8669:3: ruleEFloat
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


    // $ANTLR start "rule__QuestionDefinition__IsDisplayedAssignment_0"
    // InternalQL.g:8678:1: rule__QuestionDefinition__IsDisplayedAssignment_0 : ( ( 'isDisplayed' ) ) ;
    public final void rule__QuestionDefinition__IsDisplayedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8682:1: ( ( ( 'isDisplayed' ) ) )
            // InternalQL.g:8683:2: ( ( 'isDisplayed' ) )
            {
            // InternalQL.g:8683:2: ( ( 'isDisplayed' ) )
            // InternalQL.g:8684:3: ( 'isDisplayed' )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getIsDisplayedIsDisplayedKeyword_0_0()); 
            // InternalQL.g:8685:3: ( 'isDisplayed' )
            // InternalQL.g:8686:4: 'isDisplayed'
            {
             before(grammarAccess.getQuestionDefinitionAccess().getIsDisplayedIsDisplayedKeyword_0_0()); 
            match(input,87,FOLLOW_2); 
             after(grammarAccess.getQuestionDefinitionAccess().getIsDisplayedIsDisplayedKeyword_0_0()); 

            }

             after(grammarAccess.getQuestionDefinitionAccess().getIsDisplayedIsDisplayedKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__IsDisplayedAssignment_0"


    // $ANTLR start "rule__QuestionDefinition__IsMandatoryAssignment_1"
    // InternalQL.g:8697:1: rule__QuestionDefinition__IsMandatoryAssignment_1 : ( ( 'isMandatory' ) ) ;
    public final void rule__QuestionDefinition__IsMandatoryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8701:1: ( ( ( 'isMandatory' ) ) )
            // InternalQL.g:8702:2: ( ( 'isMandatory' ) )
            {
            // InternalQL.g:8702:2: ( ( 'isMandatory' ) )
            // InternalQL.g:8703:3: ( 'isMandatory' )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getIsMandatoryIsMandatoryKeyword_1_0()); 
            // InternalQL.g:8704:3: ( 'isMandatory' )
            // InternalQL.g:8705:4: 'isMandatory'
            {
             before(grammarAccess.getQuestionDefinitionAccess().getIsMandatoryIsMandatoryKeyword_1_0()); 
            match(input,88,FOLLOW_2); 
             after(grammarAccess.getQuestionDefinitionAccess().getIsMandatoryIsMandatoryKeyword_1_0()); 

            }

             after(grammarAccess.getQuestionDefinitionAccess().getIsMandatoryIsMandatoryKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__IsMandatoryAssignment_1"


    // $ANTLR start "rule__QuestionDefinition__NameAssignment_3"
    // InternalQL.g:8716:1: rule__QuestionDefinition__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__QuestionDefinition__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8720:1: ( ( ruleEString ) )
            // InternalQL.g:8721:2: ( ruleEString )
            {
            // InternalQL.g:8721:2: ( ruleEString )
            // InternalQL.g:8722:3: ruleEString
            {
             before(grammarAccess.getQuestionDefinitionAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestionDefinitionAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__NameAssignment_3"


    // $ANTLR start "rule__QuestionDefinition__LabelAssignment_5_1"
    // InternalQL.g:8731:1: rule__QuestionDefinition__LabelAssignment_5_1 : ( ruleEString ) ;
    public final void rule__QuestionDefinition__LabelAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8735:1: ( ( ruleEString ) )
            // InternalQL.g:8736:2: ( ruleEString )
            {
            // InternalQL.g:8736:2: ( ruleEString )
            // InternalQL.g:8737:3: ruleEString
            {
             before(grammarAccess.getQuestionDefinitionAccess().getLabelEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestionDefinitionAccess().getLabelEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__LabelAssignment_5_1"


    // $ANTLR start "rule__QuestionDefinition__DataTypeAssignment_7"
    // InternalQL.g:8746:1: rule__QuestionDefinition__DataTypeAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__QuestionDefinition__DataTypeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8750:1: ( ( ( ruleEString ) ) )
            // InternalQL.g:8751:2: ( ( ruleEString ) )
            {
            // InternalQL.g:8751:2: ( ( ruleEString ) )
            // InternalQL.g:8752:3: ( ruleEString )
            {
             before(grammarAccess.getQuestionDefinitionAccess().getDataTypeValueTypeCrossReference_7_0()); 
            // InternalQL.g:8753:3: ( ruleEString )
            // InternalQL.g:8754:4: ruleEString
            {
             before(grammarAccess.getQuestionDefinitionAccess().getDataTypeValueTypeEStringParserRuleCall_7_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestionDefinitionAccess().getDataTypeValueTypeEStringParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getQuestionDefinitionAccess().getDataTypeValueTypeCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__DataTypeAssignment_7"


    // $ANTLR start "rule__QuestionDefinition__ComputedExpressionAssignment_8_1"
    // InternalQL.g:8765:1: rule__QuestionDefinition__ComputedExpressionAssignment_8_1 : ( ruleExpression ) ;
    public final void rule__QuestionDefinition__ComputedExpressionAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8769:1: ( ( ruleExpression ) )
            // InternalQL.g:8770:2: ( ruleExpression )
            {
            // InternalQL.g:8770:2: ( ruleExpression )
            // InternalQL.g:8771:3: ruleExpression
            {
             before(grammarAccess.getQuestionDefinitionAccess().getComputedExpressionExpressionParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getQuestionDefinitionAccess().getComputedExpressionExpressionParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__ComputedExpressionAssignment_8_1"


    // $ANTLR start "rule__QuestionDefinition__CurrentValueAssignment_9_1"
    // InternalQL.g:8780:1: rule__QuestionDefinition__CurrentValueAssignment_9_1 : ( ruleValue ) ;
    public final void rule__QuestionDefinition__CurrentValueAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQL.g:8784:1: ( ( ruleValue ) )
            // InternalQL.g:8785:2: ( ruleValue )
            {
            // InternalQL.g:8785:2: ( ruleValue )
            // InternalQL.g:8786:3: ruleValue
            {
             before(grammarAccess.getQuestionDefinitionAccess().getCurrentValueValueParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getQuestionDefinitionAccess().getCurrentValueValueParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionDefinition__CurrentValueAssignment_9_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000010000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000005C0000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000240000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000C040000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x9800400000000000L,0x000000000000000BL});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x0000000001810000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000E0040000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x02A1000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000800040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000003FFC000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0014000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0050000040000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000000L,0x0000000000402D40L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0112000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0410000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x6000800040000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000010L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000800040000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400400L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000040000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000040000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000040L,0x0000000000008010L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000060000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000040000000L,0x0000000000180000L});

}