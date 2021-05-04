package at.itkollegimst.venier.pos1makro.test2.buchhandlung.Exception;

public class DuplikatBuch extends Exception{

    public DuplikatBuch(){
        super("Buch schon vorhanden!!! (Duplikat)");
    }

}
