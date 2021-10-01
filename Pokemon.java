public class Pokemon {
    
    //Atributos genéricos de um pokémon
    //Encapsulamento
    private String nome;
    private String tipo;
    private int level;
    private int vida = 200;
    private int ataque;
    private int defesa;
    private String move;
    
    //Construtor da Classe
    public Pokemon(String nome, String tipo, int level){
        this.nome = nome;
        this.tipo = tipo;
        this.level = level;
                
        calculaAtributos();
        calculaBonus();
    }
    
    //Get
    public int getVida(){
        return this.vida;
    }
    
    public int getAtaque(){
        return this.ataque;
    }
    
    public int getDefesa(){
        return this.defesa;
    }

    public String getNome(){
        return this.nome;
    }

    public String getMove(){
        return this.move;
    }
    
    //Métodos que podem ser usados por um objeto do tipo pokemon    
    private void calculaAtributos(){
        switch(tipo){
            case "Fogo":
                vida = vida - 20;
                ataque = 50;
                defesa = 20;
                move = "Flamethrower";
            break;
            
            case "Agua":
                vida = vida - 5;
                ataque = 20;
                defesa = 35;
                move = "Water Pulse";
            break;
            
            case "Terra":
                vida = vida + 20;
                ataque = 15;
                defesa = 40;
                move = "Earthquake";
            break;
            
            case "Ar":
                vida = vida + 25;
                ataque = 40;
                defesa = 20;
                move = "Brave Bird";
            break;
        }
    }
    
    private void calculaBonus(){
        
        vida = vida + (level / 2);
        ataque = ataque + (level / 3);
        defesa = defesa + (level / 4);
        
    }   
       
    public void imprimiPokemon(){
        
        System.out.println(
                "Nome: " + nome + " | " + 
                    "Tipo: " + tipo + " | " + 
                        "Level: " + level + " | " + 
                            "Vida: " + vida + " | " +
                                "Ataque: " + ataque + " | " +
                                    "Defesa: " + defesa + "\n" +
                 nome + " usou " + move);
        
    }   
    
}