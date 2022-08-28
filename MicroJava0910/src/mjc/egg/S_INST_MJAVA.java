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
public class S_INST_MJAVA {
LEX_MJAVA scanner;
  S_INST_MJAVA() {
    }
  S_INST_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  InfoMethode att_methode_courante;
  InfoClasse att_classe_courante;
  int att_deplVariable;
  int att_tailleVariables;
  TDS<InfoClasse> att_tdc;
  String att_code;
  TDS<InfoVar> att_tdv;
  AbstractMachine att_machine;
  LEX_MJAVA att_scanner;
  private void regle26() throws Exception {

    //declaration
    S_E_MJAVA x_2 = new S_E_MJAVA(scanner) ;
    T_MJAVA x_3 = new T_MJAVA(scanner ) ;
    //appel
      action_auto_inh_26(x_2);
    x_2.analyser() ;
    x_3.analyser(LEX_MJAVA.token_pv);
      action_taille_26(x_2);
      action_code_26(x_2);
  }
  private void regle27() throws Exception {

    //declaration
    S_BLOC_MJAVA x_3 = new S_BLOC_MJAVA(scanner) ;
    //appel
      action_auto_inh_27(x_3);
      action_tdv_27(x_3);
    x_3.analyser() ;
      action_taille_27(x_3);
      action_code_27(x_3);
  }
  private void regle25() throws Exception {

    //declaration
    S_TYPE_MJAVA x_2 = new S_TYPE_MJAVA(scanner) ;
    T_MJAVA x_3 = new T_MJAVA(scanner ) ;
    S_AFFX_MJAVA x_4 = new S_AFFX_MJAVA(scanner) ;
    T_MJAVA x_5 = new T_MJAVA(scanner ) ;
    //appel
      action_auto_inh_25(x_2, x_3, x_4);
    x_2.analyser() ;
    x_3.analyser(LEX_MJAVA.token_ident);
    x_4.analyser() ;
    x_5.analyser(LEX_MJAVA.token_pv);
      action_type_25(x_2, x_3, x_4);
      action_tdv_25(x_2, x_3, x_4);
      action_taille_25(x_2, x_3, x_4);
      action_code_25(x_2, x_3, x_4);
  }
  private void regle28() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    T_MJAVA x_3 = new T_MJAVA(scanner ) ;
    S_E_MJAVA x_4 = new S_E_MJAVA(scanner) ;
    T_MJAVA x_5 = new T_MJAVA(scanner ) ;
    S_BLOC_MJAVA x_7 = new S_BLOC_MJAVA(scanner) ;
    S_SIX_MJAVA x_8 = new S_SIX_MJAVA(scanner) ;
    //appel
      action_auto_inh_28(x_4, x_7, x_8);
    x_2.analyser(LEX_MJAVA.token_si);
    x_3.analyser(LEX_MJAVA.token_paro);
    x_4.analyser() ;
    x_5.analyser(LEX_MJAVA.token_parf);
      action_tdv_28(x_4, x_7, x_8);
    x_7.analyser() ;
    x_8.analyser() ;
      action_type_28(x_4, x_7, x_8);
      action_taille_28(x_4, x_7, x_8);
      action_code_28(x_4, x_7, x_8);
  }
  private void regle31() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    S_E_MJAVA x_3 = new S_E_MJAVA(scanner) ;
    T_MJAVA x_4 = new T_MJAVA(scanner ) ;
    //appel
      action_auto_inh_31(x_3);
    x_2.analyser(LEX_MJAVA.token_retour);
    x_3.analyser() ;
    x_4.analyser(LEX_MJAVA.token_pv);
      action_type_31(x_3);
      action_taille_31(x_3);
      action_code_31(x_3);
  }
  private void regle32() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    T_MJAVA x_3 = new T_MJAVA(scanner ) ;
    S_E_MJAVA x_4 = new S_E_MJAVA(scanner) ;
    T_MJAVA x_5 = new T_MJAVA(scanner ) ;
    S_BLOC_MJAVA x_7 = new S_BLOC_MJAVA(scanner) ;
    //appel
      action_auto_inh_32(x_4, x_7);
    x_2.analyser(LEX_MJAVA.token_tantque);
    x_3.analyser(LEX_MJAVA.token_paro);
    x_4.analyser() ;
    x_5.analyser(LEX_MJAVA.token_parf);
      action_tdv_32(x_4, x_7);
    x_7.analyser() ;
      action_type_32(x_4, x_7);
      action_taille_32(x_4, x_7);
      action_code_32(x_4, x_7);
  }
private void action_auto_inh_28(S_E_MJAVA x_4, S_BLOC_MJAVA x_7, S_SIX_MJAVA x_8) throws Exception {
try {
// instructions
x_4.att_machine=this.att_machine;
x_7.att_machine=this.att_machine;
x_8.att_machine=this.att_machine;
x_4.att_classe_courante=this.att_classe_courante;
x_7.att_classe_courante=this.att_classe_courante;
x_8.att_classe_courante=this.att_classe_courante;
x_4.att_methode_courante=this.att_methode_courante;
x_7.att_methode_courante=this.att_methode_courante;
x_8.att_methode_courante=this.att_methode_courante;
x_4.att_tdc=this.att_tdc;
x_7.att_tdc=this.att_tdc;
x_8.att_tdc=this.att_tdc;
x_4.att_tdv=this.att_tdv;
x_8.att_tdv=this.att_tdv;
x_7.att_deplVariable=this.att_deplVariable;
x_8.att_deplVariable=this.att_deplVariable;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_type_31(S_E_MJAVA x_3) throws Exception {
try {
// locales
Type loc_typeRetour;
// instructions
loc_typeRetour=this.att_methode_courante.getTypeRetour();
if (!(loc_typeRetour.isCompatible(x_3.att_type))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_types_incompatibles, MJAVAMessages.MJAVA_types_incompatibles,new Object[]{""+loc_typeRetour.getNom(), ""+x_3.att_type.getNom()});

}

}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_auto_inh_27(S_BLOC_MJAVA x_3) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
x_3.att_classe_courante=this.att_classe_courante;
x_3.att_methode_courante=this.att_methode_courante;
x_3.att_tdc=this.att_tdc;
x_3.att_deplVariable=this.att_deplVariable;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_auto_inh_26(S_E_MJAVA x_2) throws Exception {
try {
// instructions
x_2.att_machine=this.att_machine;
x_2.att_classe_courante=this.att_classe_courante;
x_2.att_methode_courante=this.att_methode_courante;
x_2.att_tdc=this.att_tdc;
x_2.att_tdv=this.att_tdv;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_type_32(S_E_MJAVA x_4, S_BLOC_MJAVA x_7) throws Exception {
try {
// locales
String loc_nomE;
// instructions
loc_nomE=x_4.att_type.getNom();
if (!(loc_nomE.equals("bool"))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_type_conditionnelle, MJAVAMessages.MJAVA_type_conditionnelle,new Object[]{});

}

}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_tdv_27(S_BLOC_MJAVA x_3) throws Exception {
try {
// locales
// instructions
x_3.att_tdv= new TDS<InfoVar>(this.att_tdv);
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_code_25(S_TYPE_MJAVA x_2, T_MJAVA x_3, S_AFFX_MJAVA x_4) throws Exception {
try {
// locales
String loc_valeur;
// instructions
loc_valeur="";
if (x_4.att_type!=null){
if (x_4.att_affectable){
loc_valeur=x_4.att_code+this.att_machine.genChargValeurVar(1);
}
else {
loc_valeur=x_4.att_code;
}
}

this.att_code=this.att_machine.genDecl(x_2.att_type, x_3.att_txt, loc_valeur);
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_tdv_28(S_E_MJAVA x_4, S_BLOC_MJAVA x_7, S_SIX_MJAVA x_8) throws Exception {
try {
// locales
// instructions
x_7.att_tdv= new TDS<InfoVar>(this.att_tdv);
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_code_27(S_BLOC_MJAVA x_3) throws Exception {
try {
// instructions
this.att_code=x_3.att_code;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_tdv_25(S_TYPE_MJAVA x_2, T_MJAVA x_3, S_AFFX_MJAVA x_4) throws Exception {
try {
// locales
InfoVar loc_info;
// instructions
loc_info=this.att_tdv.chercherLocalement(x_3.att_txt);
if (loc_info!=null){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_paramOuVar_defini, MJAVAMessages.MJAVA_paramOuVar_defini,new Object[]{""+x_3.att_txt});

}

loc_info=this.att_tdv.chercherGlobalement(x_3.att_txt);
if (loc_info!=null){
if (loc_info instanceof InfoAttribut ){
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_paramOuVar_defini, MJAVAMessages.MJAVA_paramOuVar_defini,new Object[]{""+x_3.att_txt});


}
}

loc_info= new InfoVar(this.att_deplVariable, x_2.att_type, x_3.att_txt);
    this.att_tdv.put(x_3.att_txt, loc_info);
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_code_26(S_E_MJAVA x_2) throws Exception {
try {
// instructions
this.att_code=x_2.att_code;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_code_28(S_E_MJAVA x_4, S_BLOC_MJAVA x_7, S_SIX_MJAVA x_8) throws Exception {
try {
// instructions
this.att_code=this.att_machine.genIf(x_4.att_code, x_7.att_code, x_8.att_code);
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_taille_31(S_E_MJAVA x_3) throws Exception {
try {
// locales
// instructions
this.att_tailleVariables=0;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_auto_inh_25(S_TYPE_MJAVA x_2, T_MJAVA x_3, S_AFFX_MJAVA x_4) throws Exception {
try {
// instructions
x_2.att_machine=this.att_machine;
x_4.att_machine=this.att_machine;
x_4.att_classe_courante=this.att_classe_courante;
x_4.att_methode_courante=this.att_methode_courante;
x_2.att_tdc=this.att_tdc;
x_4.att_tdc=this.att_tdc;
x_4.att_tdv=this.att_tdv;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_taille_32(S_E_MJAVA x_4, S_BLOC_MJAVA x_7) throws Exception {
try {
// locales
// instructions
this.att_tailleVariables=0;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_type_25(S_TYPE_MJAVA x_2, T_MJAVA x_3, S_AFFX_MJAVA x_4) throws Exception {
try {
// locales
// instructions
if (x_4.att_type!=null){
if (!(x_2.att_type.isCompatible(x_4.att_type))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_types_incompatibles, MJAVAMessages.MJAVA_types_incompatibles,new Object[]{""+x_2.att_type.getNom(), ""+x_4.att_type.getNom()});

}

}

}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_type_28(S_E_MJAVA x_4, S_BLOC_MJAVA x_7, S_SIX_MJAVA x_8) throws Exception {
try {
// locales
String loc_nomE;
// instructions
loc_nomE=x_4.att_type.getNom();
if (!(loc_nomE.equals("bool"))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_type_conditionnelle, MJAVAMessages.MJAVA_type_conditionnelle,new Object[]{});

}

}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_tdv_32(S_E_MJAVA x_4, S_BLOC_MJAVA x_7) throws Exception {
try {
// locales
// instructions
x_7.att_tdv= new TDS<InfoVar>(this.att_tdv);
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_code_32(S_E_MJAVA x_4, S_BLOC_MJAVA x_7) throws Exception {
try {
// instructions
this.att_code=this.att_machine.genWhile(x_4.att_code, x_7.att_code);
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_code_31(S_E_MJAVA x_3) throws Exception {
try {
// locales
String loc_valeur;
// instructions
loc_valeur=x_3.att_code;
if (x_3.att_affectable){
loc_valeur=x_3.att_code+this.att_machine.genChargValeurVar(1);
}

this.att_code=loc_valeur+this.att_machine.genRetour(this.att_methode_courante);
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_taille_28(S_E_MJAVA x_4, S_BLOC_MJAVA x_7, S_SIX_MJAVA x_8) throws Exception {
try {
// locales
// instructions
this.att_tailleVariables=0;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_taille_27(S_BLOC_MJAVA x_3) throws Exception {
try {
// locales
// instructions
this.att_tailleVariables=0;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_taille_26(S_E_MJAVA x_2) throws Exception {
try {
// locales
// instructions
this.att_tailleVariables=0;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_taille_25(S_TYPE_MJAVA x_2, T_MJAVA x_3, S_AFFX_MJAVA x_4) throws Exception {
try {
// locales
// instructions
if (x_2.att_type instanceof InfoClasse ){
this.att_tailleVariables=1;
}
else {
this.att_tailleVariables=x_2.att_type.getTaille();

}
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_auto_inh_31(S_E_MJAVA x_3) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
x_3.att_classe_courante=this.att_classe_courante;
x_3.att_methode_courante=this.att_methode_courante;
x_3.att_tdc=this.att_tdc;
x_3.att_tdv=this.att_tdv;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
private void action_auto_inh_32(S_E_MJAVA x_4, S_BLOC_MJAVA x_7) throws Exception {
try {
// instructions
x_4.att_machine=this.att_machine;
x_7.att_machine=this.att_machine;
x_4.att_classe_courante=this.att_classe_courante;
x_7.att_classe_courante=this.att_classe_courante;
x_4.att_methode_courante=this.att_methode_courante;
x_7.att_methode_courante=this.att_methode_courante;
x_4.att_tdc=this.att_tdc;
x_7.att_tdc=this.att_tdc;
x_4.att_tdv=this.att_tdv;
x_7.att_deplVariable=this.att_deplVariable;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_int : // 1358
        regle25 () ;
      break ;
      case LEX_MJAVA.token_bool : // 1359
        regle25 () ;
      break ;
      case LEX_MJAVA.token_ident : // 1386
        scanner.lit ( 2 ) ;
        switch ( scanner.fenetre[1].code ) {
          case LEX_MJAVA.token_ident : // 1386
            regle25 () ;
          break ;
          case LEX_MJAVA.token_pt : // 1352
            regle26 () ;
          break ;
          case LEX_MJAVA.token_paro : // 1344
            regle26 () ;
          break ;
          case LEX_MJAVA.token_mult : // 1376
            regle26 () ;
          break ;
          case LEX_MJAVA.token_div : // 1377
            regle26 () ;
          break ;
          case LEX_MJAVA.token_mod : // 1378
            regle26 () ;
          break ;
          case LEX_MJAVA.token_et : // 1379
            regle26 () ;
          break ;
          case LEX_MJAVA.token_plus : // 1373
            regle26 () ;
          break ;
          case LEX_MJAVA.token_moins : // 1374
            regle26 () ;
          break ;
          case LEX_MJAVA.token_ou : // 1375
            regle26 () ;
          break ;
          case LEX_MJAVA.token_inf : // 1367
            regle26 () ;
          break ;
          case LEX_MJAVA.token_infeg : // 1368
            regle26 () ;
          break ;
          case LEX_MJAVA.token_sup : // 1369
            regle26 () ;
          break ;
          case LEX_MJAVA.token_supeg : // 1370
            regle26 () ;
          break ;
          case LEX_MJAVA.token_eg : // 1371
            regle26 () ;
          break ;
          case LEX_MJAVA.token_neg : // 1372
            regle26 () ;
          break ;
          case LEX_MJAVA.token_affect : // 1353
            regle26 () ;
          break ;
          case LEX_MJAVA.token_pv : // 1351
            regle26 () ;
          break ;
          default :
                   scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[1].getNom()});
scanner.accepter_sucre(LEX_MJAVA.token_ident);
        }
      break ;
      case LEX_MJAVA.token_entier : // 1385
        regle26 () ;
      break ;
      case LEX_MJAVA.token_vrai : // 1381
        regle26 () ;
      break ;
      case LEX_MJAVA.token_faux : // 1382
        regle26 () ;
      break ;
      case LEX_MJAVA.token_plus : // 1373
        regle26 () ;
      break ;
      case LEX_MJAVA.token_moins : // 1374
        regle26 () ;
      break ;
      case LEX_MJAVA.token_non : // 1380
        regle26 () ;
      break ;
      case LEX_MJAVA.token_null : // 1366
        regle26 () ;
      break ;
      case LEX_MJAVA.token_paro : // 1344
        regle26 () ;
      break ;
      case LEX_MJAVA.token_nouveau : // 1363
        regle26 () ;
      break ;
      case LEX_MJAVA.token_aco : // 1346
        regle27 () ;
      break ;
      case LEX_MJAVA.token_si : // 1354
        regle28 () ;
      break ;
      case LEX_MJAVA.token_retour : // 1362
        regle31 () ;
      break ;
      case LEX_MJAVA.token_tantque : // 1356
        regle32 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
