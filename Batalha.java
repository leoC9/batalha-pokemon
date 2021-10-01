public class Batalha {
    
    //Atributos genéricos de um pokémon
    //Encapsulamento
    private int myHP;
    private int enemyHP;
    private String myMove;
    private String enemyMove;
    private String myName;
    private String enemyName;
    
    //Construtor da Classe
    public Batalha(int myHP, int enemyHP, String myMove, String enemyMove, String myName, String enemyName){
        this.myHP = myHP;
        this.enemyHP = enemyHP;
        this.myMove = myMove;
        this.enemyMove = enemyMove;
        this.myName = myName;
        this.enemyName = enemyName;
                
        if(myHP > enemyHP){
            System.out.println(myName + " derrotou " + enemyName + " usando " + myMove + ".");
        } else{
            System.out.println(enemyName + " derrotou " + myName + " usando " + enemyMove + ".");
        }
    }
    
}