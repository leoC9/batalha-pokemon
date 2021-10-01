class Main {
  public static void main(String[] args) {

        Pokemon myPokemon = new Pokemon("Talonfame", "Ar", 60);
        Pokemon enemyPokemon = new Pokemon("Greninja", "Agua", 50);
                           
        myPokemon.imprimiPokemon();
        enemyPokemon.imprimiPokemon();

        Batalha batalha = new Batalha(myPokemon.getVida(), enemyPokemon.getVida(), myPokemon.getMove(), enemyPokemon.getMove(), myPokemon.getNome(), enemyPokemon.getNome());
        
        
  }
}