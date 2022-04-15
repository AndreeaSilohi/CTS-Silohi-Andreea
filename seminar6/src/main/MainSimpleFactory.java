package main;

import mijlocdetransport.MijlocTransport;
import mijlocdetransport.TipTransport;
import simplefactory.Fabrica;

public class MainSimpleFactory {

	public static void main(String[] args) {
         Fabrica fabrica=new Fabrica();
        MijlocTransport autobuz= fabrica.returnezaMijlocTransport(TipTransport.Autobuz,"B20SCC");
        MijlocTransport tramvai= fabrica.returnezaMijlocTransport(TipTransport.Tramvai,"B80SPC");
        MijlocTransport troleibuz= fabrica.returnezaMijlocTransport(TipTransport.Autobuz,"B20GBH");
        
        autobuz.afisareNrInmatriculare();
        tramvai.afisareNrInmatriculare();
        troleibuz.afisareNrInmatriculare();
	}

}
