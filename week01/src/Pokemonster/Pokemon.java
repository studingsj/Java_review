package Pokemonster;

public abstract class Pokemon {
    protected int level;
    private int hp;
    protected String name;
    private static int pokemonCount = 0;

    public static int getPokemonCount() {
        return pokemonCount;
    }

    public Pokemon(int level, int hp, String name) {
        this.level = level;
        this.hp = hp;
        this.name = name;
    }
    public Pokemon() {
        pokemonCount++;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
