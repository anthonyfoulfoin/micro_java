package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mjc.tds.*;
import mjc.type.*;
import java.util.Iterator;
import java.io.File;
import mg.egg.eggc.compiler.libjava.lex.*;
import mg.egg.eggc.compiler.libjava.messages.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import java.util.Vector;
public class S_EXTENSION_MJAVA {
LEX_MJAVA scanner;
  S_EXTENSION_MJAVA() {
    }
  S_EXTENSION_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  InfoClasse att_classe_mere;
  TDS<InfoClasse> att_tdc;
  AbstractMachine att_machine;
  LEX_MJAVA att_scanner;
  private void regle6() throws Exception {

    //declaration
    //appel
      action_classe_mere_6();
  }
  private void regle5() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    T_MJAVA x_3 = new T_MJAVA(scanner ) ;
    //appel
    x_2.analyser(LEX_MJAVA.token_etend);
    x_3.analyser(LEX_MJAVA.token_ident);
      action_classe_mere_5(x_3);
  }
private void action_classe_mere_5(T_MJAVA x_3) throws Exception {
try {
// locales
InfoClasse loc_info;
// instructions
loc_info=this.att_tdc.chercherGlobalement(x_3.att_txt);
if (loc_info==null){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_classe_inconnue, MJAVAMessages.MJAVA_classe_inconnue,new Object[]{""+x_3.att_txt});

}

this.att_classe_mere=loc_info;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_classe_mere_6() throws Exception {
try {
// locales
// instructions
this.att_classe_mere=null;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_etend : // 1361
        regle5 () ;
      break ;
      case LEX_MJAVA.token_aco : // 1346
        regle6 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
