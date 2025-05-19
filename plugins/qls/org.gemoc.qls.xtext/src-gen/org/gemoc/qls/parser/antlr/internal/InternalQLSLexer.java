package org.gemoc.qls.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQLSLexer extends Lexer {
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

    public InternalQLSLexer() {;} 
    public InternalQLSLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalQLSLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalQLS.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:11:7: ( 'QLSModel' )
            // InternalQLS.g:11:9: 'QLSModel'
            {
            match("QLSModel"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:12:7: ( '{' )
            // InternalQLS.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:13:7: ( 'questionStyles' )
            // InternalQLS.g:13:9: 'questionStyles'
            {
            match("questionStyles"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:14:7: ( '}' )
            // InternalQLS.g:14:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:15:7: ( 'import' )
            // InternalQLS.g:15:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:16:7: ( 'section' )
            // InternalQLS.g:16:9: 'section'
            {
            match("section"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:17:7: ( 'styledQuestion' )
            // InternalQLS.g:17:9: 'styledQuestion'
            {
            match("styledQuestion"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:18:7: ( 'labelStyle' )
            // InternalQLS.g:18:9: 'labelStyle'
            {
            match("labelStyle"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:19:7: ( 'typeStyle' )
            // InternalQLS.g:19:9: 'typeStyle'
            {
            match("typeStyle"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:20:7: ( 'italic' )
            // InternalQLS.g:20:9: 'italic'
            {
            match("italic"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:21:7: ( 'bold' )
            // InternalQLS.g:21:9: 'bold'
            {
            match("bold"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:22:7: ( 'BooleanStyle' )
            // InternalQLS.g:22:9: 'BooleanStyle'
            {
            match("BooleanStyle"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:23:7: ( 'NumericStyle' )
            // InternalQLS.g:23:9: 'NumericStyle'
            {
            match("NumericStyle"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:24:7: ( 'textField' )
            // InternalQLS.g:24:9: 'textField'
            {
            match("textField"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:25:7: ( 'spinner' )
            // InternalQLS.g:25:9: 'spinner'
            {
            match("spinner"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:26:7: ( 'step' )
            // InternalQLS.g:26:9: 'step'
            {
            match("step"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:27:7: ( 'TextStyle' )
            // InternalQLS.g:27:9: 'TextStyle'
            {
            match("TextStyle"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:28:7: ( 'multiline' )
            // InternalQLS.g:28:9: 'multiline'
            {
            match("multiline"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:29:7: ( '(' )
            // InternalQLS.g:29:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:30:7: ( ')' )
            // InternalQLS.g:30:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:31:7: ( 'if' )
            // InternalQLS.g:31:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:32:7: ( 'then' )
            // InternalQLS.g:32:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:33:7: ( 'else' )
            // InternalQLS.g:33:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:34:7: ( 'endif' )
            // InternalQLS.g:34:9: 'endif'
            {
            match("endif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:35:7: ( 'true' )
            // InternalQLS.g:35:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:36:7: ( 'false' )
            // InternalQLS.g:36:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:37:7: ( 'EDate' )
            // InternalQLS.g:37:9: 'EDate'
            {
            match("EDate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:38:7: ( 'ValueType' )
            // InternalQLS.g:38:9: 'ValueType'
            {
            match("ValueType"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:39:7: ( 'unit' )
            // InternalQLS.g:39:9: 'unit'
            {
            match("unit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:40:7: ( 'booleanType' )
            // InternalQLS.g:40:9: 'booleanType'
            {
            match("booleanType"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:41:7: ( 'integerType' )
            // InternalQLS.g:41:9: 'integerType'
            {
            match("integerType"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:42:7: ( 'min' )
            // InternalQLS.g:42:9: 'min'
            {
            match("min"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:43:7: ( 'max' )
            // InternalQLS.g:43:9: 'max'
            {
            match("max"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:44:7: ( 'decimalType' )
            // InternalQLS.g:44:9: 'decimalType'
            {
            match("decimalType"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:45:7: ( 'dateType' )
            // InternalQLS.g:45:9: 'dateType'
            {
            match("dateType"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:46:7: ( 'enumerationType' )
            // InternalQLS.g:46:9: 'enumerationType'
            {
            match("enumerationType"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:47:7: ( 'literals' )
            // InternalQLS.g:47:9: 'literals'
            {
            match("literals"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:48:7: ( ',' )
            // InternalQLS.g:48:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:49:7: ( 'StringType' )
            // InternalQLS.g:49:9: 'StringType'
            {
            match("StringType"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:50:7: ( 'DateValue' )
            // InternalQLS.g:50:9: 'DateValue'
            {
            match("DateValue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:51:7: ( 'dateValue' )
            // InternalQLS.g:51:9: 'dateValue'
            {
            match("dateValue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:52:7: ( '.' )
            // InternalQLS.g:52:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:53:7: ( 'E' )
            // InternalQLS.g:53:9: 'E'
            {
            match('E'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:54:7: ( 'e' )
            // InternalQLS.g:54:9: 'e'
            {
            match('e'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:55:7: ( '-' )
            // InternalQLS.g:55:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:56:7: ( 'mandatory' )
            // InternalQLS.g:56:9: 'mandatory'
            {
            match("mandatory"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:57:7: ( 'question' )
            // InternalQLS.g:57:9: 'question'
            {
            match("question"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:58:7: ( 'isDisplayed' )
            // InternalQLS.g:58:9: 'isDisplayed'
            {
            match("isDisplayed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:59:7: ( 'currentValue' )
            // InternalQLS.g:59:9: 'currentValue'
            {
            match("currentValue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:60:7: ( ':' )
            // InternalQLS.g:60:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:61:7: ( '=' )
            // InternalQLS.g:61:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:62:7: ( ';' )
            // InternalQLS.g:62:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:63:7: ( 'CHECKBOX' )
            // InternalQLS.g:63:9: 'CHECKBOX'
            {
            match("CHECKBOX"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:64:7: ( 'TWO_RADIO' )
            // InternalQLS.g:64:9: 'TWO_RADIO'
            {
            match("TWO_RADIO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:65:7: ( 'DROPDOWN' )
            // InternalQLS.g:65:9: 'DROPDOWN'
            {
            match("DROPDOWN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:66:7: ( 'PLUS' )
            // InternalQLS.g:66:9: 'PLUS'
            {
            match("PLUS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:67:7: ( 'MINUS' )
            // InternalQLS.g:67:9: 'MINUS'
            {
            match("MINUS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:68:7: ( 'MULT' )
            // InternalQLS.g:68:9: 'MULT'
            {
            match("MULT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:69:7: ( 'DIV' )
            // InternalQLS.g:69:9: 'DIV'
            {
            match("DIV"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:70:7: ( 'EQUAL' )
            // InternalQLS.g:70:9: 'EQUAL'
            {
            match("EQUAL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:71:7: ( 'NOTEQUAL' )
            // InternalQLS.g:71:9: 'NOTEQUAL'
            {
            match("NOTEQUAL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:72:7: ( 'GREATER' )
            // InternalQLS.g:72:9: 'GREATER'
            {
            match("GREATER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:73:7: ( 'LOWER' )
            // InternalQLS.g:73:9: 'LOWER'
            {
            match("LOWER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:74:7: ( 'GREATEROREQUAL' )
            // InternalQLS.g:74:9: 'GREATEROREQUAL'
            {
            match("GREATEROREQUAL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:75:7: ( 'LOWEROREQUAL' )
            // InternalQLS.g:75:9: 'LOWEROREQUAL'
            {
            match("LOWEROREQUAL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:76:7: ( 'AND' )
            // InternalQLS.g:76:9: 'AND'
            {
            match("AND"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:77:7: ( 'OR' )
            // InternalQLS.g:77:9: 'OR'
            {
            match("OR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:78:7: ( 'not' )
            // InternalQLS.g:78:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:79:7: ( '+' )
            // InternalQLS.g:79:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:80:7: ( '*' )
            // InternalQLS.g:80:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:81:7: ( '/' )
            // InternalQLS.g:81:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:82:7: ( '>' )
            // InternalQLS.g:82:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:83:7: ( '<' )
            // InternalQLS.g:83:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:84:7: ( '>=' )
            // InternalQLS.g:84:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:85:7: ( '<=' )
            // InternalQLS.g:85:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:86:7: ( 'and' )
            // InternalQLS.g:86:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:87:7: ( 'or' )
            // InternalQLS.g:87:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:3842:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalQLS.g:3842:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalQLS.g:3842:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalQLS.g:3842:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalQLS.g:3842:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalQLS.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:3844:10: ( ( '0' .. '9' )+ )
            // InternalQLS.g:3844:12: ( '0' .. '9' )+
            {
            // InternalQLS.g:3844:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalQLS.g:3844:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:3846:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalQLS.g:3846:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalQLS.g:3846:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalQLS.g:3846:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalQLS.g:3846:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalQLS.g:3846:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalQLS.g:3846:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalQLS.g:3846:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalQLS.g:3846:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalQLS.g:3846:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalQLS.g:3846:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:3848:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalQLS.g:3848:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalQLS.g:3848:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalQLS.g:3848:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:3850:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalQLS.g:3850:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalQLS.g:3850:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalQLS.g:3850:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalQLS.g:3850:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalQLS.g:3850:41: ( '\\r' )? '\\n'
                    {
                    // InternalQLS.g:3850:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalQLS.g:3850:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:3852:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalQLS.g:3852:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalQLS.g:3852:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalQLS.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQLS.g:3854:16: ( . )
            // InternalQLS.g:3854:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalQLS.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=84;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalQLS.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // InternalQLS.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // InternalQLS.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // InternalQLS.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // InternalQLS.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // InternalQLS.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // InternalQLS.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // InternalQLS.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // InternalQLS.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // InternalQLS.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // InternalQLS.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // InternalQLS.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // InternalQLS.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // InternalQLS.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // InternalQLS.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // InternalQLS.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // InternalQLS.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // InternalQLS.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // InternalQLS.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // InternalQLS.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // InternalQLS.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // InternalQLS.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // InternalQLS.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // InternalQLS.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // InternalQLS.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // InternalQLS.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // InternalQLS.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // InternalQLS.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // InternalQLS.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // InternalQLS.g:1:184: T__40
                {
                mT__40(); 

                }
                break;
            case 31 :
                // InternalQLS.g:1:190: T__41
                {
                mT__41(); 

                }
                break;
            case 32 :
                // InternalQLS.g:1:196: T__42
                {
                mT__42(); 

                }
                break;
            case 33 :
                // InternalQLS.g:1:202: T__43
                {
                mT__43(); 

                }
                break;
            case 34 :
                // InternalQLS.g:1:208: T__44
                {
                mT__44(); 

                }
                break;
            case 35 :
                // InternalQLS.g:1:214: T__45
                {
                mT__45(); 

                }
                break;
            case 36 :
                // InternalQLS.g:1:220: T__46
                {
                mT__46(); 

                }
                break;
            case 37 :
                // InternalQLS.g:1:226: T__47
                {
                mT__47(); 

                }
                break;
            case 38 :
                // InternalQLS.g:1:232: T__48
                {
                mT__48(); 

                }
                break;
            case 39 :
                // InternalQLS.g:1:238: T__49
                {
                mT__49(); 

                }
                break;
            case 40 :
                // InternalQLS.g:1:244: T__50
                {
                mT__50(); 

                }
                break;
            case 41 :
                // InternalQLS.g:1:250: T__51
                {
                mT__51(); 

                }
                break;
            case 42 :
                // InternalQLS.g:1:256: T__52
                {
                mT__52(); 

                }
                break;
            case 43 :
                // InternalQLS.g:1:262: T__53
                {
                mT__53(); 

                }
                break;
            case 44 :
                // InternalQLS.g:1:268: T__54
                {
                mT__54(); 

                }
                break;
            case 45 :
                // InternalQLS.g:1:274: T__55
                {
                mT__55(); 

                }
                break;
            case 46 :
                // InternalQLS.g:1:280: T__56
                {
                mT__56(); 

                }
                break;
            case 47 :
                // InternalQLS.g:1:286: T__57
                {
                mT__57(); 

                }
                break;
            case 48 :
                // InternalQLS.g:1:292: T__58
                {
                mT__58(); 

                }
                break;
            case 49 :
                // InternalQLS.g:1:298: T__59
                {
                mT__59(); 

                }
                break;
            case 50 :
                // InternalQLS.g:1:304: T__60
                {
                mT__60(); 

                }
                break;
            case 51 :
                // InternalQLS.g:1:310: T__61
                {
                mT__61(); 

                }
                break;
            case 52 :
                // InternalQLS.g:1:316: T__62
                {
                mT__62(); 

                }
                break;
            case 53 :
                // InternalQLS.g:1:322: T__63
                {
                mT__63(); 

                }
                break;
            case 54 :
                // InternalQLS.g:1:328: T__64
                {
                mT__64(); 

                }
                break;
            case 55 :
                // InternalQLS.g:1:334: T__65
                {
                mT__65(); 

                }
                break;
            case 56 :
                // InternalQLS.g:1:340: T__66
                {
                mT__66(); 

                }
                break;
            case 57 :
                // InternalQLS.g:1:346: T__67
                {
                mT__67(); 

                }
                break;
            case 58 :
                // InternalQLS.g:1:352: T__68
                {
                mT__68(); 

                }
                break;
            case 59 :
                // InternalQLS.g:1:358: T__69
                {
                mT__69(); 

                }
                break;
            case 60 :
                // InternalQLS.g:1:364: T__70
                {
                mT__70(); 

                }
                break;
            case 61 :
                // InternalQLS.g:1:370: T__71
                {
                mT__71(); 

                }
                break;
            case 62 :
                // InternalQLS.g:1:376: T__72
                {
                mT__72(); 

                }
                break;
            case 63 :
                // InternalQLS.g:1:382: T__73
                {
                mT__73(); 

                }
                break;
            case 64 :
                // InternalQLS.g:1:388: T__74
                {
                mT__74(); 

                }
                break;
            case 65 :
                // InternalQLS.g:1:394: T__75
                {
                mT__75(); 

                }
                break;
            case 66 :
                // InternalQLS.g:1:400: T__76
                {
                mT__76(); 

                }
                break;
            case 67 :
                // InternalQLS.g:1:406: T__77
                {
                mT__77(); 

                }
                break;
            case 68 :
                // InternalQLS.g:1:412: T__78
                {
                mT__78(); 

                }
                break;
            case 69 :
                // InternalQLS.g:1:418: T__79
                {
                mT__79(); 

                }
                break;
            case 70 :
                // InternalQLS.g:1:424: T__80
                {
                mT__80(); 

                }
                break;
            case 71 :
                // InternalQLS.g:1:430: T__81
                {
                mT__81(); 

                }
                break;
            case 72 :
                // InternalQLS.g:1:436: T__82
                {
                mT__82(); 

                }
                break;
            case 73 :
                // InternalQLS.g:1:442: T__83
                {
                mT__83(); 

                }
                break;
            case 74 :
                // InternalQLS.g:1:448: T__84
                {
                mT__84(); 

                }
                break;
            case 75 :
                // InternalQLS.g:1:454: T__85
                {
                mT__85(); 

                }
                break;
            case 76 :
                // InternalQLS.g:1:460: T__86
                {
                mT__86(); 

                }
                break;
            case 77 :
                // InternalQLS.g:1:466: T__87
                {
                mT__87(); 

                }
                break;
            case 78 :
                // InternalQLS.g:1:472: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 79 :
                // InternalQLS.g:1:480: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 80 :
                // InternalQLS.g:1:489: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 81 :
                // InternalQLS.g:1:501: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 82 :
                // InternalQLS.g:1:517: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 83 :
                // InternalQLS.g:1:533: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 84 :
                // InternalQLS.g:1:541: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\66\1\uffff\1\66\1\uffff\11\66\2\uffff\1\125\1\66\1\131\3\66\1\uffff\2\66\2\uffff\1\66\3\uffff\10\66\2\uffff\1\166\1\170\1\172\2\66\1\64\2\uffff\2\64\2\uffff\1\66\2\uffff\1\66\1\uffff\2\66\1\u0084\24\66\2\uffff\2\66\1\uffff\3\66\1\uffff\4\66\1\uffff\4\66\2\uffff\1\66\3\uffff\7\66\1\u00b2\1\66\11\uffff\1\66\1\u00b5\3\uffff\4\66\1\uffff\24\66\1\u00ce\1\u00cf\16\66\1\u00de\7\66\1\u00e6\1\uffff\1\u00e7\1\u00e8\1\uffff\10\66\1\u00f1\5\66\1\u00f7\1\u00f8\1\u00f9\7\66\2\uffff\1\66\1\u0102\6\66\1\u0109\5\66\1\uffff\2\66\1\u0112\1\66\1\u0114\2\66\3\uffff\10\66\1\uffff\5\66\3\uffff\10\66\1\uffff\1\u012c\1\66\1\u012e\1\u012f\1\u0130\1\66\1\uffff\10\66\1\uffff\1\u013a\1\uffff\1\66\1\u013d\2\66\1\u0140\1\u0141\21\66\1\uffff\1\66\3\uffff\11\66\1\uffff\2\66\1\uffff\2\66\2\uffff\2\66\1\u0163\1\66\1\u0165\26\66\1\u017d\1\66\1\u017f\1\u0181\2\66\1\uffff\1\66\1\uffff\1\66\1\u0186\5\66\1\u018c\7\66\1\u0194\3\66\1\u0198\1\66\1\u019a\1\66\1\uffff\1\66\1\uffff\1\66\1\uffff\4\66\1\uffff\1\u01a2\1\u01a3\3\66\1\uffff\1\u01a7\1\u01a8\1\u01a9\1\u01aa\1\66\1\u01ac\1\66\1\uffff\1\u01ae\1\66\1\u01b0\1\uffff\1\66\1\uffff\6\66\1\u01b8\2\uffff\3\66\4\uffff\1\66\1\uffff\1\66\1\uffff\1\u01be\1\uffff\4\66\1\u01c3\1\u01c4\1\66\1\uffff\1\u01c6\3\66\1\u01ca\1\uffff\4\66\2\uffff\1\66\1\uffff\1\u01d0\1\u01d1\1\66\1\uffff\1\u01d3\1\66\1\u01d5\2\66\2\uffff\1\66\1\uffff\1\66\1\uffff\1\u01da\1\u01db\1\66\1\u01dd\2\uffff\1\u01de\2\uffff";
    static final String DFA12_eofS =
        "\u01df\uffff";
    static final String DFA12_minS =
        "\1\0\1\114\1\uffff\1\165\1\uffff\1\146\1\145\1\141\1\145\2\157\1\117\1\127\1\141\2\uffff\1\60\1\141\1\60\1\141\1\156\1\141\1\uffff\1\164\1\111\2\uffff\1\165\3\uffff\1\110\1\114\1\111\1\122\1\117\1\116\1\122\1\157\2\uffff\1\52\2\75\1\156\1\162\1\101\2\uffff\2\0\2\uffff\1\123\2\uffff\1\145\1\uffff\1\160\1\141\1\60\1\164\1\104\1\143\1\145\1\151\1\142\1\164\1\160\1\170\1\145\1\165\1\154\1\157\1\155\1\124\1\170\1\117\1\154\2\156\2\uffff\1\163\1\144\1\uffff\1\154\1\141\1\125\1\uffff\1\154\1\151\1\143\1\164\1\uffff\1\162\1\164\1\117\1\126\2\uffff\1\162\3\uffff\1\105\1\125\1\116\1\114\1\105\1\127\1\104\1\60\1\164\11\uffff\1\144\1\60\3\uffff\1\115\1\163\1\157\1\154\1\uffff\1\145\1\151\1\164\1\154\1\160\1\156\3\145\1\164\1\156\1\145\1\144\2\154\1\145\1\105\1\164\1\137\1\164\2\60\1\144\1\145\1\151\1\155\1\163\1\164\1\101\1\165\1\164\1\151\1\145\1\151\1\145\1\120\1\60\1\162\1\103\1\123\1\125\1\124\1\101\1\105\1\60\1\uffff\2\60\1\uffff\1\157\1\164\1\162\1\151\1\147\1\163\1\151\1\145\1\60\1\156\1\154\1\162\1\123\1\106\3\60\2\145\1\162\1\121\1\123\1\122\1\151\2\uffff\1\141\1\60\1\146\3\145\1\114\1\145\1\60\1\155\1\124\1\156\1\126\1\104\1\uffff\1\145\1\113\1\60\1\123\1\60\1\124\1\122\3\uffff\1\144\1\151\1\164\1\143\1\145\1\160\1\157\1\144\1\uffff\1\145\1\123\1\141\1\164\1\151\3\uffff\2\141\1\151\1\125\1\164\1\101\1\154\1\164\1\uffff\1\60\1\162\3\60\1\124\1\uffff\1\141\1\171\1\141\1\147\1\141\1\117\1\156\1\102\1\uffff\1\60\1\uffff\1\105\1\60\1\145\1\157\2\60\1\162\1\154\1\156\1\121\1\162\1\164\1\154\1\171\1\145\2\156\1\143\1\101\1\171\1\104\1\151\1\157\1\uffff\1\141\3\uffff\1\171\1\154\1\160\1\154\1\124\1\154\1\127\1\164\1\117\1\uffff\2\122\1\uffff\1\154\1\156\2\uffff\1\124\1\141\1\60\1\165\1\60\1\171\1\163\2\154\1\124\2\123\1\114\1\154\1\111\1\156\1\162\1\164\1\160\1\124\1\145\1\165\1\171\1\165\1\116\1\126\1\130\1\60\1\105\2\60\2\171\1\uffff\1\145\1\uffff\1\154\1\60\1\145\1\144\1\171\2\164\1\60\1\145\1\117\1\145\1\171\1\151\1\145\1\171\1\60\1\145\1\160\1\145\1\60\1\141\1\60\1\122\1\uffff\1\121\1\uffff\1\164\1\uffff\1\160\1\145\1\163\1\145\1\uffff\2\60\1\160\2\171\1\uffff\4\60\1\157\1\60\1\160\1\uffff\1\60\1\145\1\60\1\uffff\1\154\1\uffff\1\105\1\125\1\171\1\145\1\144\1\164\1\60\2\uffff\1\145\2\154\4\uffff\1\156\1\uffff\1\145\1\uffff\1\60\1\uffff\1\165\1\121\1\101\1\154\2\60\1\151\1\uffff\1\60\2\145\1\124\1\60\1\uffff\1\145\1\125\1\114\1\145\2\uffff\1\157\1\uffff\2\60\1\171\1\uffff\1\60\1\101\1\60\1\163\1\156\2\uffff\1\160\1\uffff\1\114\1\uffff\2\60\1\145\1\60\2\uffff\1\60\2\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\114\1\uffff\1\165\1\uffff\2\164\1\151\1\171\2\157\1\165\1\145\1\165\2\uffff\1\172\1\141\1\172\1\141\1\156\1\145\1\uffff\1\164\1\141\2\uffff\1\165\3\uffff\1\110\1\114\1\125\1\122\1\117\1\116\1\122\1\157\2\uffff\1\57\2\75\1\156\1\162\1\172\2\uffff\2\uffff\2\uffff\1\123\2\uffff\1\145\1\uffff\1\160\1\141\1\172\1\164\1\104\1\143\1\171\1\151\1\142\1\164\1\160\1\170\1\145\1\165\2\157\1\155\1\124\1\170\1\117\1\154\1\156\1\170\2\uffff\1\163\1\165\1\uffff\1\154\1\141\1\125\1\uffff\1\154\1\151\1\143\1\164\1\uffff\1\162\1\164\1\117\1\126\2\uffff\1\162\3\uffff\1\105\1\125\1\116\1\114\1\105\1\127\1\104\1\172\1\164\11\uffff\1\144\1\172\3\uffff\1\115\1\163\1\157\1\154\1\uffff\1\145\1\151\1\164\1\154\1\160\1\156\3\145\1\164\1\156\1\145\1\144\2\154\1\145\1\105\1\164\1\137\1\164\2\172\1\144\1\145\1\151\1\155\1\163\1\164\1\101\1\165\1\164\1\151\1\145\1\151\1\145\1\120\1\172\1\162\1\103\1\123\1\125\1\124\1\101\1\105\1\172\1\uffff\2\172\1\uffff\1\157\1\164\1\162\1\151\1\147\1\163\1\151\1\145\1\172\1\156\1\154\1\162\1\123\1\106\3\172\2\145\1\162\1\121\1\123\1\122\1\151\2\uffff\1\141\1\172\1\146\3\145\1\114\1\145\1\172\1\155\1\126\1\156\1\126\1\104\1\uffff\1\145\1\113\1\172\1\123\1\172\1\124\1\122\3\uffff\1\144\1\151\1\164\1\143\1\145\1\160\1\157\1\144\1\uffff\1\145\1\123\1\141\1\164\1\151\3\uffff\2\141\1\151\1\125\1\164\1\101\1\154\1\164\1\uffff\1\172\1\162\3\172\1\124\1\uffff\1\141\1\171\1\141\1\147\1\141\1\117\1\156\1\102\1\uffff\1\172\1\uffff\1\105\1\172\1\145\1\157\2\172\1\162\1\154\1\156\1\121\1\162\1\164\1\154\1\171\1\145\2\156\1\143\1\101\1\171\1\104\1\151\1\157\1\uffff\1\141\3\uffff\1\171\1\154\1\160\1\154\1\124\1\154\1\127\1\164\1\117\1\uffff\2\122\1\uffff\1\154\1\156\2\uffff\1\124\1\141\1\172\1\165\1\172\1\171\1\163\2\154\1\124\2\123\1\114\1\154\1\111\1\156\1\162\1\164\1\160\1\124\1\145\1\165\1\171\1\165\1\116\1\126\1\130\1\172\1\105\2\172\2\171\1\uffff\1\145\1\uffff\1\154\1\172\1\145\1\144\1\171\2\164\1\172\1\145\1\117\1\145\1\171\1\151\1\145\1\171\1\172\1\145\1\160\1\145\1\172\1\141\1\172\1\122\1\uffff\1\121\1\uffff\1\164\1\uffff\1\160\1\145\1\163\1\145\1\uffff\2\172\1\160\2\171\1\uffff\4\172\1\157\1\172\1\160\1\uffff\1\172\1\145\1\172\1\uffff\1\154\1\uffff\1\105\1\125\1\171\1\145\1\144\1\164\1\172\2\uffff\1\145\2\154\4\uffff\1\156\1\uffff\1\145\1\uffff\1\172\1\uffff\1\165\1\121\1\101\1\154\2\172\1\151\1\uffff\1\172\2\145\1\124\1\172\1\uffff\1\145\1\125\1\114\1\145\2\uffff\1\157\1\uffff\2\172\1\171\1\uffff\1\172\1\101\1\172\1\163\1\156\2\uffff\1\160\1\uffff\1\114\1\uffff\2\172\1\145\1\172\2\uffff\1\172\2\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\1\uffff\1\4\11\uffff\1\23\1\24\6\uffff\1\46\2\uffff\1\52\1\55\1\uffff\1\62\1\63\1\64\10\uffff\1\105\1\106\6\uffff\1\116\1\117\2\uffff\1\123\1\124\1\uffff\1\116\1\2\1\uffff\1\4\27\uffff\1\23\1\24\2\uffff\1\54\3\uffff\1\53\4\uffff\1\46\4\uffff\1\52\1\55\1\uffff\1\62\1\63\1\64\11\uffff\1\105\1\106\1\121\1\122\1\107\1\112\1\110\1\113\1\111\2\uffff\1\117\1\120\1\123\4\uffff\1\25\55\uffff\1\103\2\uffff\1\115\30\uffff\1\40\1\41\16\uffff\1\73\7\uffff\1\102\1\104\1\114\10\uffff\1\20\5\uffff\1\26\1\31\1\13\10\uffff\1\27\6\uffff\1\35\10\uffff\1\70\1\uffff\1\72\27\uffff\1\30\1\uffff\1\32\1\33\1\74\11\uffff\1\71\2\uffff\1\77\2\uffff\1\5\1\12\41\uffff\1\6\1\uffff\1\17\27\uffff\1\76\1\uffff\1\1\1\uffff\1\57\4\uffff\1\45\5\uffff\1\75\7\uffff\1\43\3\uffff\1\67\1\uffff\1\65\7\uffff\1\11\1\16\3\uffff\1\21\1\66\1\22\1\56\1\uffff\1\34\1\uffff\1\51\1\uffff\1\50\7\uffff\1\10\5\uffff\1\47\4\uffff\1\37\1\60\1\uffff\1\36\3\uffff\1\42\5\uffff\1\14\1\15\1\uffff\1\61\1\uffff\1\101\4\uffff\1\3\1\7\1\uffff\1\100\1\44";
    static final String DFA12_specialS =
        "\1\0\60\uffff\1\1\1\2\u01ac\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\64\2\63\2\64\1\63\22\64\1\63\1\64\1\61\4\64\1\62\1\16\1\17\1\50\1\47\1\26\1\32\1\31\1\51\12\60\1\34\1\36\1\53\1\35\1\52\2\64\1\44\1\12\1\37\1\30\1\22\1\57\1\42\4\57\1\43\1\41\1\13\1\45\1\40\1\1\1\57\1\27\1\14\1\57\1\23\4\57\3\64\1\56\1\57\1\64\1\54\1\11\1\33\1\25\1\20\1\21\2\57\1\5\2\57\1\7\1\15\1\46\1\55\1\57\1\3\1\57\1\6\1\10\1\24\5\57\1\2\1\64\1\4\uff82\64",
            "\1\65",
            "",
            "\1\70",
            "",
            "\1\74\6\uffff\1\72\1\75\4\uffff\1\76\1\73",
            "\1\77\12\uffff\1\101\3\uffff\1\100",
            "\1\102\7\uffff\1\103",
            "\1\105\2\uffff\1\106\11\uffff\1\107\6\uffff\1\104",
            "\1\110",
            "\1\111",
            "\1\113\45\uffff\1\112",
            "\1\115\15\uffff\1\114",
            "\1\120\7\uffff\1\117\13\uffff\1\116",
            "",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\13\66\1\123\1\66\1\124\14\66",
            "\1\126",
            "\12\66\7\uffff\3\66\1\127\14\66\1\130\11\66\4\uffff\1\66\1\uffff\32\66",
            "\1\132",
            "\1\133",
            "\1\135\3\uffff\1\134",
            "",
            "\1\137",
            "\1\142\10\uffff\1\141\16\uffff\1\140",
            "",
            "",
            "\1\145",
            "",
            "",
            "",
            "\1\151",
            "\1\152",
            "\1\153\13\uffff\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "",
            "",
            "\1\164\4\uffff\1\165",
            "\1\167",
            "\1\171",
            "\1\173",
            "\1\174",
            "\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "\0\176",
            "\0\176",
            "",
            "",
            "\1\u0080",
            "",
            "",
            "\1\u0081",
            "",
            "\1\u0082",
            "\1\u0083",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0089\23\uffff\1\u0088",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091\2\uffff\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009b\11\uffff\1\u009a",
            "",
            "",
            "\1\u009c",
            "\1\u009d\20\uffff\1\u009e",
            "",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "",
            "",
            "\1\u00aa",
            "",
            "",
            "",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u00b3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00b4",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "",
            "",
            "\1\u0101",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u010a",
            "\1\u010b\1\uffff\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "",
            "\1\u0110",
            "\1\u0111",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0113",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0115",
            "\1\u0116",
            "",
            "",
            "",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "",
            "",
            "",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u012d",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0131",
            "",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u013b",
            "\12\66\7\uffff\16\66\1\u013c\13\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u013e",
            "\1\u013f",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "",
            "\1\u0153",
            "",
            "",
            "",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "",
            "\1\u015d",
            "\1\u015e",
            "",
            "\1\u015f",
            "\1\u0160",
            "",
            "",
            "\1\u0161",
            "\1\u0162",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0164",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "\1\u0178",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "\12\66\7\uffff\16\66\1\u017c\13\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u017e",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\22\66\1\u0180\7\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0182",
            "\1\u0183",
            "",
            "\1\u0184",
            "",
            "\1\u0185",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0187",
            "\1\u0188",
            "\1\u0189",
            "\1\u018a",
            "\1\u018b",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u018d",
            "\1\u018e",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "\1\u0192",
            "\1\u0193",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0195",
            "\1\u0196",
            "\1\u0197",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0199",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u019b",
            "",
            "\1\u019c",
            "",
            "\1\u019d",
            "",
            "\1\u019e",
            "\1\u019f",
            "\1\u01a0",
            "\1\u01a1",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u01a4",
            "\1\u01a5",
            "\1\u01a6",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u01ab",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u01ad",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u01af",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u01b1",
            "",
            "\1\u01b2",
            "\1\u01b3",
            "\1\u01b4",
            "\1\u01b5",
            "\1\u01b6",
            "\1\u01b7",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "\1\u01b9",
            "\1\u01ba",
            "\1\u01bb",
            "",
            "",
            "",
            "",
            "\1\u01bc",
            "",
            "\1\u01bd",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u01bf",
            "\1\u01c0",
            "\1\u01c1",
            "\1\u01c2",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u01c5",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u01c7",
            "\1\u01c8",
            "\1\u01c9",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u01cb",
            "\1\u01cc",
            "\1\u01cd",
            "\1\u01ce",
            "",
            "",
            "\1\u01cf",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u01d2",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u01d4",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u01d6",
            "\1\u01d7",
            "",
            "",
            "\1\u01d8",
            "",
            "\1\u01d9",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u01dc",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='Q') ) {s = 1;}

                        else if ( (LA12_0=='{') ) {s = 2;}

                        else if ( (LA12_0=='q') ) {s = 3;}

                        else if ( (LA12_0=='}') ) {s = 4;}

                        else if ( (LA12_0=='i') ) {s = 5;}

                        else if ( (LA12_0=='s') ) {s = 6;}

                        else if ( (LA12_0=='l') ) {s = 7;}

                        else if ( (LA12_0=='t') ) {s = 8;}

                        else if ( (LA12_0=='b') ) {s = 9;}

                        else if ( (LA12_0=='B') ) {s = 10;}

                        else if ( (LA12_0=='N') ) {s = 11;}

                        else if ( (LA12_0=='T') ) {s = 12;}

                        else if ( (LA12_0=='m') ) {s = 13;}

                        else if ( (LA12_0=='(') ) {s = 14;}

                        else if ( (LA12_0==')') ) {s = 15;}

                        else if ( (LA12_0=='e') ) {s = 16;}

                        else if ( (LA12_0=='f') ) {s = 17;}

                        else if ( (LA12_0=='E') ) {s = 18;}

                        else if ( (LA12_0=='V') ) {s = 19;}

                        else if ( (LA12_0=='u') ) {s = 20;}

                        else if ( (LA12_0=='d') ) {s = 21;}

                        else if ( (LA12_0==',') ) {s = 22;}

                        else if ( (LA12_0=='S') ) {s = 23;}

                        else if ( (LA12_0=='D') ) {s = 24;}

                        else if ( (LA12_0=='.') ) {s = 25;}

                        else if ( (LA12_0=='-') ) {s = 26;}

                        else if ( (LA12_0=='c') ) {s = 27;}

                        else if ( (LA12_0==':') ) {s = 28;}

                        else if ( (LA12_0=='=') ) {s = 29;}

                        else if ( (LA12_0==';') ) {s = 30;}

                        else if ( (LA12_0=='C') ) {s = 31;}

                        else if ( (LA12_0=='P') ) {s = 32;}

                        else if ( (LA12_0=='M') ) {s = 33;}

                        else if ( (LA12_0=='G') ) {s = 34;}

                        else if ( (LA12_0=='L') ) {s = 35;}

                        else if ( (LA12_0=='A') ) {s = 36;}

                        else if ( (LA12_0=='O') ) {s = 37;}

                        else if ( (LA12_0=='n') ) {s = 38;}

                        else if ( (LA12_0=='+') ) {s = 39;}

                        else if ( (LA12_0=='*') ) {s = 40;}

                        else if ( (LA12_0=='/') ) {s = 41;}

                        else if ( (LA12_0=='>') ) {s = 42;}

                        else if ( (LA12_0=='<') ) {s = 43;}

                        else if ( (LA12_0=='a') ) {s = 44;}

                        else if ( (LA12_0=='o') ) {s = 45;}

                        else if ( (LA12_0=='^') ) {s = 46;}

                        else if ( (LA12_0=='F'||(LA12_0>='H' && LA12_0<='K')||LA12_0=='R'||LA12_0=='U'||(LA12_0>='W' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='g' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='k')||LA12_0=='p'||LA12_0=='r'||(LA12_0>='v' && LA12_0<='z')) ) {s = 47;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 48;}

                        else if ( (LA12_0=='\"') ) {s = 49;}

                        else if ( (LA12_0=='\'') ) {s = 50;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 51;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='?' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 52;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_49 = input.LA(1);

                        s = -1;
                        if ( ((LA12_49>='\u0000' && LA12_49<='\uFFFF')) ) {s = 126;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_50 = input.LA(1);

                        s = -1;
                        if ( ((LA12_50>='\u0000' && LA12_50<='\uFFFF')) ) {s = 126;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}